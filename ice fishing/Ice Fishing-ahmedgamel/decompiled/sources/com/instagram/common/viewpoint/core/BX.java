package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class BX extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, 27, 30, 23, 22, 82, 6, 29, 82, 3, 7, 23, 0, 11, 82, 7, 28, 22, 23, 0, 30, 11, 27, 28, 21, 82, 31, 23, 22, 27, 19, 82, 17, 29, 22, 23, 17, 1};
    }

    public BX(Throwable th) {
        super(A00(0, 39, 35), th);
    }
}
