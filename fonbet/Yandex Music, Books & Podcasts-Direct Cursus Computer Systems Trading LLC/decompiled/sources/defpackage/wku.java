package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class wku implements fap {
    public final bh3 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public wku(bh3 bh3Var, int i, long j, long j2) {
        this.a = bh3Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bh3Var.d;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * this.b;
        long j3 = this.a.c;
        int i = dvt.a;
        return dvt.g0(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        bh3 bh3Var = this.a;
        long j2 = this.d - 1;
        long j3 = dvt.j((bh3Var.c * j) / (this.b * 1000000), 0L, j2);
        int i = bh3Var.d;
        long j4 = this.c;
        long a = a(j3);
        iap iapVar = new iap(a, (i * j3) + j4);
        if (a >= j || j3 == j2) {
            return new eap(iapVar, iapVar);
        }
        long j5 = j3 + 1;
        return new eap(iapVar, new iap(a(j5), (i * j5) + j4));
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.e;
    }
}
