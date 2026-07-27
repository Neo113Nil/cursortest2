package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07237u {
    public final long A00;
    public final long A01;
    public static final C07237u A04 = new C07237u(0, 0);
    public static final C07237u A02 = new C07237u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C07237u A06 = new C07237u(Long.MAX_VALUE, 0);
    public static final C07237u A05 = new C07237u(0, Long.MAX_VALUE);
    public static final C07237u A03 = A04;

    public C07237u(long j9, long j10) {
        AbstractC06233y.A07(j9 >= 0);
        AbstractC06233y.A07(j10 >= 0);
        this.A01 = j9;
        this.A00 = j10;
    }

    public final long A00(long minPositionUs, long j9, long j10) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long A0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long A0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z8 = true;
        boolean z9 = A0V <= j9 && j9 <= A0S;
        if (A0V > j10 || j10 > A0S) {
            z8 = false;
        }
        if (z9 && z8) {
            long abs = Math.abs(j9 - minPositionUs);
            long maxPositionUs = Math.abs(j10 - minPositionUs);
            if (abs <= maxPositionUs) {
                return j9;
            }
            return j10;
        }
        if (z9) {
            return j9;
        }
        if (z8) {
            return j10;
        }
        return A0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C07237u c07237u = (C07237u) obj;
        return this.A01 == c07237u.A01 && this.A00 == c07237u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
