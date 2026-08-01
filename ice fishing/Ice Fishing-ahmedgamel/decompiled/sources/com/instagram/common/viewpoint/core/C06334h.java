package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06334h {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-125, 119, -54, -64, -47, -68, 119, -64, -54, 119, -97, -60, -52, -73, -62, -65, -70, 118, -65, -60, -70, -69, -50, 118};
    }

    public C06334h() {
        this(32);
    }

    public C06334h(int i) {
        this.A01 = new long[i];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 43) + i + A00(0, 10, 44) + this.A00);
    }

    public final void A04(long j6) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        jArr[i] = j6;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
