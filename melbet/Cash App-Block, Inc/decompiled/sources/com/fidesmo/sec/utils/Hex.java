package com.fidesmo.sec.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Hex {
    private static final char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] decodeHex(String str) {
        if ((str.length() & 1) != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Odd number of characters.");
            return null;
        }
        char[] charArray = str.toUpperCase(Locale.ROOT).toCharArray();
        byte[] bArr = new byte[charArray.length / 2];
        for (int i = 0; i < charArray.length; i += 2) {
            char[] cArr = hexArray;
            bArr[i / 2] = (byte) (Arrays.binarySearch(cArr, charArray[i + 1]) + (Arrays.binarySearch(cArr, charArray[i]) * 16));
        }
        return bArr;
    }

    public static String encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
