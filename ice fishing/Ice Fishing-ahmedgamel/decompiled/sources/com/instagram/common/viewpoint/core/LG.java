package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class LG {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-81, 126, 124, -123, 124, -119, 120, -117, 124, 101, 124, -114, 96, 123, c.f17105c, c.f17104b, 55, -124, -116, -118, -117, 55, 121, 124, 55, 122, 120, -125, -125, 124, 123, 55, 121, 124, 125, -122, -119, 124, 55, -119, 124, -117, -119, c.f17103a, 124, -115, c.f17103a, -123, 126, 55, c.f17103a, 123, -118, 69};
    }

    public LG(int i, int i4) {
        this(Integer.MIN_VALUE, i, i4);
    }

    public LG(int i, int i4, int i6) {
        String A00 = A00(0, 0, 0);
        this.A04 = i != Integer.MIN_VALUE ? i + A00(0, 1, 112) : A00;
        this.A02 = i4;
        this.A03 = i6;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = A00;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 7));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
