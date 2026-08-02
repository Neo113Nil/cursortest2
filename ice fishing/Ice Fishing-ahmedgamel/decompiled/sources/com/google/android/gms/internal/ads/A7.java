package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public abstract class A7 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24414a = "0123456789abcdef".toCharArray();

    public static byte[] a(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static long b(double d9, DisplayMetrics displayMetrics) {
        return Math.round(d9 / displayMetrics.density);
    }
}
