package com.Wiley.Basics;
import java.util.Scanner;
public class Factorial {

        public static void main(String[] args) {
            int x = 4; // x is HARD-CODED to be 4
            int errorCode = 0;
            /**
             * Setting up a Scanner object to
             * allow for data entry
             */
            Scanner inString = new Scanner(System.in);
            System.out.println("Enter your name ...");
            String name = inString.next();
            System.out.println("Welcome " + name);
            Scanner inInt = new Scanner(System.in); // Scanner object for ints
            System.out.println("Enter your number ...");
            x = inInt.nextInt();
            if ((x < 0) || (x > 10)) {
                System.out.println("Invalid data entry!");
                errorCode = -1;
            } else {

                int sumOfNumbers = 0;
                for (int i = 0; i <= x; i++) {
                    sumOfNumbers = sumOfNumbers + i;
                }
                System.out.println(sumOfNumbers);
            }
            System.out.println(x+ " Error Code " +errorCode);
        }

    }

