package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public enum OD {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, 101, 102, 104, 109, 108, 109, 53, 54, 56, 61, 48, 55, 62, 46, 53, 50, 42, 52, 51, 58, 28, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
