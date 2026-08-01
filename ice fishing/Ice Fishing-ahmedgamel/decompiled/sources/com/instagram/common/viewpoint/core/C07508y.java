package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07508y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2400qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, 26, 9, 14, 20, -7, 23, 6, 8, 16, -59, 28, 23, 14, 25, 10, -59, 11, 6, 14, 17, 10, 9, -33, -59};
    }

    public C07508y(int i, C2400qI c2400qI, boolean z3) {
        super(A00(0, 25, 91) + i);
        this.A02 = z3;
        this.A00 = i;
        this.A01 = c2400qI;
    }
}
