package com.google.common.base;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, 16, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, 42, 49, 40, 40, 74, 70, 18, 122, 48, 13, 22, 16, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, 16, 27, 28, 16, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 38, 42, 40, 40, 42, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o4) {
        if (o4 == null) {
            return A00(94, 4, 87);
        }
        try {
            return o4.toString();
        } catch (Exception e9) {
            String str = o4.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o4));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, 119) + str, (Throwable) e9);
            return A00(27, 1, 44) + str + A00(2, 7, 119) + e9.getClass().getName() + A00(28, 1, 70);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:29:0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i;
        String valueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 70)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (args.length * 16));
        int i4 = 0;
        int i6 = 0;
        while (i6 < args.length && (i = valueOf.indexOf(A00(9, 2, 51), i4)) != -1) {
            sb.append((CharSequence) valueOf, i4, i);
            int templateStart2 = i6 + 1;
            sb.append(args[i6]);
            i4 = i + 2;
            i6 = templateStart2;
        }
        sb.append((CharSequence) valueOf, i4, valueOf.length());
        if (i6 < args.length) {
            sb.append(A00(0, 2, 94));
            int i9 = i6 + 1;
            sb.append(args[i6]);
            while (i9 < args.length) {
                sb.append(A00(25, 2, 100));
                int templateStart3 = i9 + 1;
                sb.append(args[i9]);
                i9 = templateStart3;
            }
            sb.append(']');
        }
        String sb2 = sb.toString();
        String[] strArr = A01;
        String str = strArr[6];
        String str2 = strArr[2];
        int templateStart4 = str.charAt(10);
        int i10 = str2.charAt(10);
        if (templateStart4 == i10) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
        strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
        return sb2;
    }
}
