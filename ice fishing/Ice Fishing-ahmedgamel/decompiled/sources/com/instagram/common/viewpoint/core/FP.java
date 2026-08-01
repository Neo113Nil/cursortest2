package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class FP extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-64, -90, -27, -2, -11, 8, 0, -11, -13, 4, -11, -12, -80};
    }

    public FP(Throwable th) {
        super(A00(2, 11, 91) + th.getClass().getSimpleName() + A00(0, 2, 81) + th.getMessage(), th);
    }
}
