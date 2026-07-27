package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1694eL {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 55);
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
