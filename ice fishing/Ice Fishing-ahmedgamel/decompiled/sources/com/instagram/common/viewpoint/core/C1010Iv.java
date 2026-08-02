package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1010Iv {
    public static byte[] A09;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C06674v A06;
    public final C06674v A07;
    public final boolean A08;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-42, -39, -30, -29, -28, -49, -45, -40, -27, -34, -37, -112, -35, -27, -29, -28, -112, -46, -43, -112, -95};
    }

    public C1010Iv(C06674v c06674v, C06674v c06674v2, boolean z6) throws C3K {
        this.A07 = c06674v;
        this.A06 = c06674v2;
        this.A08 = z6;
        c06674v2.A0f(12);
        this.A05 = c06674v2.A0L();
        c06674v.A0f(12);
        this.A04 = c06674v.A0L();
        HB.A01(c06674v.A0C() == 1, A00(0, 21, 34));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0Q;
        int i;
        int i4 = this.A00 + 1;
        this.A00 = i4;
        if (i4 == this.A05) {
            return false;
        }
        if (this.A08) {
            A0Q = this.A06.A0R();
        } else {
            A0Q = this.A06.A0Q();
        }
        this.A02 = A0Q;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0L();
            this.A07.A0g(4);
            int i6 = this.A04 - 1;
            this.A04 = i6;
            if (i6 > 0) {
                i = this.A07.A0L() - 1;
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }
}
