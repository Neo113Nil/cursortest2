package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06514z {
    public static byte[] A02;
    public static final C06514z A03;
    public static final C06514z A04;
    public final int A00;
    public final int A01;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new C06514z(-1, -1);
        A04 = new C06514z(0, 0);
    }

    public C06514z(int i, int i6) {
        AbstractC06243y.A07((i == -1 || i >= 0) && (i6 == -1 || i6 >= 0));
        this.A01 = i;
        this.A00 = i6;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06514z)) {
            return false;
        }
        C06514z c06514z = (C06514z) obj;
        return this.A01 == c06514z.A01 && this.A00 == c06514z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
