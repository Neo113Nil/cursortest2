package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class QZ {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public RK A04;
    public RK A05;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, 14, 2, 68, 80, 77, 79, 123, 31, 76, c.f16475b, 14, 5, 23, 40, 15, 12, 4, 5, 18, 93, 86, 90, 14, 21, 34, 71, 71, 75, 31, 4, 50, 86, 109, 70, 79, c.f16475b, 73, 75, 103, c.f16475b, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public QZ(RK rk, RK rk2) {
        this.A05 = rk;
        this.A04 = rk2;
    }

    public QZ(RK rk, RK rk2, int i, int i4, int i9, int i10) {
        this(rk, rk2);
        this.A00 = i;
        this.A01 = i4;
        this.A02 = i9;
        this.A03 = i10;
    }

    public final String toString() {
        return A00(40, 21, a.f21914z) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
}
