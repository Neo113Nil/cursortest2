package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2132lk {
    A05,
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{48, 59, 58, 49, 41, 46, 38, 35, 42, 43, 55, 54, 45, 38, 43, 60, 56, 61, 32, 101, 114, 118, 115, 110};
    }

    static {
        A01();
    }
}
