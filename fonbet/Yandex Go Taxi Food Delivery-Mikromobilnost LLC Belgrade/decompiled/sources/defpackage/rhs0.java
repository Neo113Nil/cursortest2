package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class rhs0 extends a9z0 {
    public static final Object n = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public final fe10 l;
    public final yd10 m;

    static {
        td10 td10Var = new td10();
        td10Var.a = "SinglePeriodTimeline";
        td10Var.b = Uri.EMPTY;
        td10Var.a();
    }

    public rhs0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, fe10 fe10Var) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, fe10Var, z3 ? fe10Var.c : null);
    }

    @Override // defpackage.a9z0
    public final int b(Object obj) {
        return n != obj ? -1 : 0;
    }

    @Override // defpackage.a9z0
    public final y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        d6z.s(i, 1);
        Object obj = z ? n : null;
        long j = -this.f;
        y8z0Var.getClass();
        y8z0Var.h(null, obj, 0, this.d, j, s60.c, false);
        return y8z0Var;
    }

    @Override // defpackage.a9z0
    public final int i() {
        return 1;
    }

    @Override // defpackage.a9z0
    public final Object m(int i) {
        d6z.s(i, 1);
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // defpackage.a9z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z8z0 n(int i, z8z0 z8z0Var, long j) {
        long j2;
        d6z.s(i, 1);
        long j3 = this.g;
        boolean z = this.i;
        if (z && !this.j && j != 0) {
            long j4 = this.e;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            Object obj = z8z0.p;
            z8z0Var.c(this.l, this.k, this.b, this.c, -9223372036854775807L, this.h, z, this.m, j2, this.e, 0, this.f);
            return z8z0Var;
        }
        j2 = j3;
        Object obj2 = z8z0.p;
        z8z0Var.c(this.l, this.k, this.b, this.c, -9223372036854775807L, this.h, z, this.m, j2, this.e, 0, this.f);
        return z8z0Var;
    }

    @Override // defpackage.a9z0
    public final int p() {
        return 1;
    }

    public rhs0(long j, boolean z, boolean z2, fe10 fe10Var) {
        this(j, j, 0L, 0L, z, false, z2, null, fe10Var);
    }

    public rhs0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, fe10 fe10Var, yd10 yd10Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = obj;
        fe10Var.getClass();
        this.l = fe10Var;
        this.m = yd10Var;
    }
}
