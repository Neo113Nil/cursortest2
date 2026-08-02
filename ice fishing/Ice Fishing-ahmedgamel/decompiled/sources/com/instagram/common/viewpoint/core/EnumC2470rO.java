package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2470rO {
    A02,
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
        A00 = new byte[]{79, 68, 87, 68, 83, 94, 83, 68, 70, 72, 82, 85, 68, 83, 68, 69, 115, 100, 102, 104, 114, 117, 100, 115, 100, 101, 14, 21, 9, 30, 28, 18, 8, 15, 30, 9, 30, 31};
    }

    static {
        A01();
    }
}
