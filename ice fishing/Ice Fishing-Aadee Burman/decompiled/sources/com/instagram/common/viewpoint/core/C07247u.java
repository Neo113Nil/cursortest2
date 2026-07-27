package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07247u {
    public final long A00;
    public final long A01;
    public static final C07247u A04 = new C07247u(0, 0);
    public static final C07247u A02 = new C07247u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C07247u A06 = new C07247u(Long.MAX_VALUE, 0);
    public static final C07247u A05 = new C07247u(0, Long.MAX_VALUE);
    public static final C07247u A03 = A04;

    public C07247u(long j6, long j9) {
        AbstractC06243y.A07(j6 >= 0);
        AbstractC06243y.A07(j9 >= 0);
        this.A01 = j6;
        this.A00 = j9;
    }

    public final long A00(long minPositionUs, long j6, long j9) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long A0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long A0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z3 = true;
        boolean z6 = A0V <= j6 && j6 <= A0S;
        if (A0V > j9 || j9 > A0S) {
            z3 = false;
        }
        if (z6 && z3) {
            long abs = Math.abs(j6 - minPositionUs);
            long maxPositionUs = Math.abs(j9 - minPositionUs);
            if (abs <= maxPositionUs) {
                return j6;
            }
            return j9;
        }
        if (z6) {
            return j6;
        }
        if (z3) {
            return j9;
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
        C07247u c07247u = (C07247u) obj;
        return this.A01 == c07247u.A01 && this.A00 == c07247u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
