package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1501bD {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1501bD(int i) {
        this.A00 = i;
    }

    public static EnumC1501bD A00(int i) {
        for (EnumC1501bD enumC1501bD : values()) {
            if (enumC1501bD.A00 == i) {
                return enumC1501bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
