package ru.CryptoPro.JCP.VMInspector;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* loaded from: classes4.dex */
public class Divider {
    public static final String PATTERN = "SAMPLE";

    public static void main(String[] strArr) throws Exception {
        PrintStream printStream;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
            try {
                printStream = new PrintStream(new FileOutputStream("SAMPLE0"));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            bufferedReader2.close();
                            printStream.close();
                            return;
                        } else if (readLine.indexOf(PATTERN, 0) != -1) {
                            i++;
                            printStream.close();
                            printStream = new PrintStream(new FileOutputStream(PATTERN + i));
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (printStream != null) {
                            printStream.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                printStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            printStream = null;
        }
    }
}
