package com.gamericefishpro.space.h2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends com.gamericefishpro.space.f2.u0 implements com.gamericefishpro.space.f2.k0, a, x0 {
    public boolean D;
    public boolean E;
    public com.gamericefishpro.space.c3.a F;
    public Function1 H;
    public boolean M;
    public Object P;
    public boolean T;
    public final j0 y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public d0 C = d0.i;
    public long G = 0;
    public p0 I = p0.i;
    public final g0 J = new g0(this, 1);
    public final com.gamericefishpro.space.v0.e K = new com.gamericefishpro.space.v0.e(new r0[16]);
    public boolean L = true;
    public final q0 N = new q0(this, 0);
    public boolean O = true;
    public long Q = com.gamericefishpro.space.c3.b.b(0, 0, 15);
    public final q0 R = new q0(this, 2);
    public final q0 S = new q0(this, 1);

    public r0(j0 j0Var) {
        this.y = j0Var;
        this.P = j0Var.p.J;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final a B() {
        j0 j0Var;
        f0 f0VarV = this.y.a.v();
        if (f0VarV == null || (j0Var = f0VarV.a0) == null) {
            return null;
        }
        return j0Var.q;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void C() {
        this.M = true;
        g0 g0Var = this.J;
        g0Var.h();
        j0 j0Var = this.y;
        boolean z = j0Var.f;
        f0 f0Var = j0Var.a;
        if (z) {
            com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var2 = (f0) objArr[i2];
                j0 j0Var2 = f0Var2.a0;
                if (j0Var2.e && f0Var2.s() == d0.d) {
                    r0 r0Var = j0Var2.q;
                    Intrinsics.b(r0Var);
                    r0 r0Var2 = j0Var2.q;
                    com.gamericefishpro.space.c3.a aVar = r0Var2 != null ? r0Var2.F : null;
                    Intrinsics.b(aVar);
                    if (r0Var.q0(aVar.a)) {
                        f0.T(f0Var, false, 7);
                    }
                }
            }
        }
        p pVar = v().k0;
        Intrinsics.b(pVar);
        if (j0Var.g || (!pVar.D && j0Var.f)) {
            j0Var.f = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.v;
            j0Var.i(false);
            q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getSnapshotObserver();
            snapshotObserver.a.c(f0Var, snapshotObserver.h, this.N);
            j0Var.d = b0Var;
            if (j0Var.m && pVar.D) {
                requestLayout();
            }
            j0Var.g = false;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.M = false;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        m0();
        o0 o0VarI0 = this.y.a().I0();
        Intrinsics.b(o0VarI0);
        return o0VarI0.L(i);
    }

    @Override // com.gamericefishpro.space.h2.a
    public final int N() {
        return this.B;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void P() {
        f0.T(this.y.a, false, 7);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        m0();
        o0 o0VarI0 = this.y.a().I0();
        Intrinsics.b(o0VarI0);
        return o0VarI0.R(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        m0();
        o0 o0VarI0 = this.y.a().I0();
        Intrinsics.b(o0VarI0);
        return o0VarI0.U(i);
    }

    @Override // com.gamericefishpro.space.h2.a
    public final g0 a() {
        return this.J;
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final void a0(long j, float f, Function1 function1) {
        p0(j, function1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.gamericefishpro.space.f2.k0
    public final com.gamericefishpro.space.f2.u0 e(long j) {
        d0 d0Var;
        j0 j0Var = this.y;
        f0 f0VarV = j0Var.a.v();
        if ((f0VarV != null ? f0VarV.a0.d : null) == b0.e) {
            j0Var.b = false;
        } else {
            f0 f0VarV2 = j0Var.a.v();
            if ((f0VarV2 != null ? f0VarV2.a0.d : null) == b0.v) {
                j0Var.b = false;
            }
        }
        f0 f0Var = j0Var.a;
        f0 f0VarV3 = f0Var.v();
        if (f0VarV3 != null) {
            j0 j0Var2 = f0VarV3.a0;
            if (this.C != d0.i && !f0Var.Y) {
                com.gamericefishpro.space.e2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                d0Var = d0.d;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.d);
                }
                d0Var = d0.e;
            }
            this.C = d0Var;
        } else {
            this.C = d0.i;
        }
        f0 f0Var2 = j0Var.a;
        if (f0Var2.W == d0.i) {
            f0Var2.c();
        }
        q0(j);
        return this;
    }

    public final boolean e0() {
        j0 j0Var = this.y;
        return k.o(j0Var.a) || j0Var.c;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        m0();
        o0 o0VarI0 = this.y.a().I0();
        Intrinsics.b(o0VarI0);
        return o0VarI0.f(i);
    }

    public final void f0(boolean z) {
        if (z && e0()) {
            return;
        }
        if (z || e0()) {
            this.I = p0.i;
            com.gamericefishpro.space.v0.e eVarZ = this.y.a.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).a0.q;
                Intrinsics.b(r0Var);
                r0Var.f0(true);
            }
        }
    }

    public final void h0() {
        p0 p0Var = this.I;
        j0 j0Var = this.y;
        boolean z = j0Var.c;
        f0 f0Var = j0Var.a;
        if (z) {
            this.I = p0.e;
        } else {
            this.I = p0.d;
        }
        if (p0Var != p0.d && j0Var.e) {
            f0.T(f0Var, true, 6);
        }
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            r0 r0Var = f0Var2.a0.q;
            if (r0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (r0Var.B != Integer.MAX_VALUE) {
                r0Var.h0();
                f0.W(f0Var2);
            }
        }
    }

    @Override // com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.f2.k0
    public final Object i() {
        return this.P;
    }

    public final void k0() {
        j0 j0Var = this.y;
        if (j0Var.o > 0) {
            com.gamericefishpro.space.v0.e eVarZ = j0Var.a.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.a0;
                if ((j0Var2.m || j0Var2.n) && !j0Var2.f) {
                    f0Var.S(false);
                }
                r0 r0Var = j0Var2.q;
                if (r0Var != null) {
                    r0Var.k0();
                }
            }
        }
    }

    public final void m0() {
        d0 d0Var;
        j0 j0Var = this.y;
        f0.T(j0Var.a, false, 7);
        f0 f0Var = j0Var.a;
        f0 f0VarV = f0Var.v();
        if (f0VarV == null || f0Var.W != d0.i) {
            return;
        }
        int iOrdinal = f0VarV.a0.d.ordinal();
        if (iOrdinal != 0) {
            d0Var = iOrdinal != 2 ? f0VarV.W : d0.e;
        } else {
            d0Var = d0.d;
        }
        f0Var.W = d0Var;
    }

    public final void o0() {
        b0 b0Var;
        this.T = true;
        j0 j0Var = this.y;
        f0 f0VarV = j0Var.a.v();
        p0 p0Var = this.I;
        if ((p0Var != p0.d && !j0Var.c) || (p0Var != p0.e && j0Var.c)) {
            h0();
            if (this.z && f0VarV != null) {
                f0VarV.S(false);
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.a0;
            if (!this.z && ((b0Var = j0Var2.d) == b0.i || b0Var == b0.v)) {
                if (this.B != Integer.MAX_VALUE) {
                    com.gamericefishpro.space.e2.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.h;
                this.B = i;
                j0Var2.h = i + 1;
            }
        } else {
            this.B = 0;
        }
        C();
    }

    @Override // com.gamericefishpro.space.h2.x0
    public final void p(boolean z) {
        o0 o0VarI0;
        j0 j0Var = this.y;
        o0 o0VarI1 = j0Var.a().I0();
        if (Boolean.valueOf(z).equals(o0VarI1 != null ? Boolean.valueOf(o0VarI1.B) : null) || (o0VarI0 = j0Var.a().I0()) == null) {
            return;
        }
        o0VarI0.B = z;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0085, B:31:0x006f), top: B:36:0x0007 }] */
    public final void p0(long j, Function1 function1) {
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            f0 f0VarV = f0Var.v();
            b0 b0Var = f0VarV != null ? f0VarV.a0.d : null;
            b0 b0Var2 = b0.v;
            if (b0Var == b0Var2) {
                j0Var.c = false;
            }
            if (f0Var2.k0) {
                com.gamericefishpro.space.e2.a.a("place is called on a deactivated node");
            }
            j0Var.d = b0Var2;
            boolean z = true;
            this.D = true;
            this.T = false;
            if (!com.gamericefishpro.space.c3.i.a(j, this.G)) {
                if (j0Var.n || j0Var.m) {
                    j0Var.f = true;
                }
                k0();
            }
            o1 o1VarA = i0.a(f0Var2);
            this.G = j;
            if (j0Var.f) {
                j0Var.h(false);
                this.J.e = false;
                q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) o1VarA).getSnapshotObserver();
                snapshotObserver.a.c(f0Var2, snapshotObserver.g, this.S);
            } else {
                if (this.I == p0.i) {
                    z = false;
                }
                if (z) {
                    o0 o0VarI0 = j0Var.a().I0();
                    Intrinsics.b(o0VarI0);
                    o0VarI0.B0(com.gamericefishpro.space.c3.i.c(j, o0VarI0.w));
                    o0();
                } else {
                    j0Var.h(false);
                    this.J.e = false;
                    q1 snapshotObserver2 = ((com.gamericefishpro.space.i2.t) o1VarA).getSnapshotObserver();
                    snapshotObserver2.a.c(f0Var2, snapshotObserver2.g, this.S);
                }
            }
            this.H = function1;
            j0Var.d = b0.w;
            Unit unit = Unit.a;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    public final boolean q0(long j) {
        long j2;
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.k0) {
                com.gamericefishpro.space.e2.a.a("measure is called on a deactivated node");
            }
            f0 f0VarV = f0Var2.v();
            f0Var2.Y = f0Var2.Y || (f0VarV != null && f0VarV.Y);
            if (!f0Var2.a0.e) {
                com.gamericefishpro.space.c3.a aVar = this.F;
                if (aVar == null ? false : com.gamericefishpro.space.c3.a.b(aVar.a, j)) {
                    o1 o1Var = f0Var2.H;
                    if (o1Var != null) {
                        ((com.gamericefishpro.space.i2.t) o1Var).m(f0Var2, true);
                    }
                    f0Var2.X();
                    return false;
                }
            }
            this.F = new com.gamericefishpro.space.c3.a(j);
            d0(j);
            this.J.d = false;
            com.gamericefishpro.space.v0.e eVarZ = f0Var2.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).a0.q;
                Intrinsics.b(r0Var);
                r0Var.J.getClass();
                Unit unit = Unit.a;
            }
            if (this.E) {
                j2 = this.i;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.E = true;
            o0 o0VarI0 = j0Var.a().I0();
            if (!(o0VarI0 != null)) {
                com.gamericefishpro.space.e2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            j0Var.c(j);
            c0((((long) o0VarI0.e) & 4294967295L) | (((long) o0VarI0.d) << 32));
            return (((int) (j2 >> 32)) == o0VarI0.d && ((int) (j2 & 4294967295L)) == o0VarI0.e) ? false : true;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void requestLayout() {
        this.y.a.S(false);
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void u(com.gamericefishpro.space.b2.d0 d0Var) {
        com.gamericefishpro.space.v0.e eVarZ = this.y.a.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            r0 r0Var = ((f0) objArr[i2]).a0.q;
            Intrinsics.b(r0Var);
            d0Var.invoke(r0Var);
        }
    }

    @Override // com.gamericefishpro.space.h2.a
    public final q v() {
        return this.y.a.Z.c;
    }
}
