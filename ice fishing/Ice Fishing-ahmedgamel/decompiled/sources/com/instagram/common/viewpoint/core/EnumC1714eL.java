package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1714eL {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 54, 62, 55, 74, 90, 75, 92, 92, 87, 74, 81, 86, 77, 74};
    }

    static {
        A01();
    }
}
