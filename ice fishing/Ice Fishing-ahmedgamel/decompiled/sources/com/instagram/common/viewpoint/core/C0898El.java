package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0898El {
    public static byte[] A03;
    public final int A00;
    public final C2383pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, 21, 22, 25, 30, 25, 36, 25, 31, 30, 3, 43, 46, 50, 55, -34, 50, 48, 31, 33, 41, 49, -34, 31, 48, 35, -34, 44, 45, 50, -34, 31, 42, 42, 45, 53, 35, 34};
    }

    public C0898El(C2383pg c2383pg, int... iArr) {
        this(c2383pg, iArr, 0);
    }

    public C0898El(C2383pg c2383pg, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC06524g.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c2383pg;
        this.A02 = iArr;
        this.A00 = i;
    }
}
