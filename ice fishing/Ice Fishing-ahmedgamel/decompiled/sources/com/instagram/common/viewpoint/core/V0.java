package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public enum V0 {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 121, 109, 107, 125, 124, 110, 114, Byte.MAX_VALUE, 103, 119, 112, 121};
    }

    static {
        A01();
    }
}
