package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public enum NE {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, a.f22514Q)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, -55, -48, -68, -57, 61, 62, 61, 52, 58, 69, 69, -8, -20, -7, 0, -20, -9, 93, 94, 93, 84};
    }

    static {
        A01();
    }

    NE(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
