package com.gamericefishpro.space.h2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends com.gamericefishpro.space.f2.u0 implements com.gamericefishpro.space.f2.k0, a, x0 {
    public boolean C;
    public boolean D;
    public Function1 G;
    public float H;
    public Object J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean S;
    public float W;
    public boolean X;
    public Function1 Y;
    public float a0;
    public boolean c0;
    public final j0 y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public d0 E = d0.i;
    public long F = 0;
    public boolean I = true;
    public final g0 P = new g0(this, 0);
    public final com.gamericefishpro.space.v0.e Q = new com.gamericefishpro.space.v0.e(new v0[16]);
    public boolean R = true;
    public long T = com.gamericefishpro.space.c3.b.b(0, 0, 15);
    public final u0 U = new u0(this, 1);
    public final u0 V = new u0(this, 0);
    public long Z = 0;
    public final u0 b0 = new u0(this, 2);

    public v0(j0 j0Var) {
        this.y = j0Var;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final a B() {
        j0 j0Var;
        f0 f0VarV = this.y.a.v();
        if (f0VarV == null || (j0Var = f0VarV.a0) == null) {
            return null;
        }
        return j0Var.p;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void C() {
        boolean zQ0;
        this.S = true;
        g0 g0Var = this.P;
        g0Var.h();
        boolean z = this.N;
        j0 j0Var = this.y;
        if (z) {
            com.gamericefishpro.space.v0.e eVarZ = j0Var.a.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                boolean zQ = f0Var.q();
                j0 j0Var2 = f0Var.a0;
                if (zQ && f0Var.r() == d0.d) {
                    v0 v0Var = j0Var2.p;
                    com.gamericefishpro.space.c3.a aVar = v0Var.C ? new com.gamericefishpro.space.c3.a(v0Var.v) : null;
                    if (aVar != null) {
                        if (f0Var.W == d0.i) {
                            f0Var.c();
                        }
                        zQ0 = j0Var2.p.q0(aVar.a);
                    } else {
                        zQ0 = false;
                    }
                    if (zQ0) {
                        f0.V(j0Var.a, false, 7);
                    }
                }
            }
        }
        if (this.O || (!v().D && this.N)) {
            this.N = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.i;
            j0Var.g(false);
            f0 f0Var2 = j0Var.a;
            q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.c(f0Var2, snapshotObserver.e, this.V);
            j0Var.d = b0Var;
            this.O = false;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.S = false;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        j0 j0Var = this.y;
        if (!k.o(j0Var.a)) {
            m0();
            return j0Var.a().L(i);
        }
        r0 r0Var = j0Var.q;
        Intrinsics.b(r0Var);
        return r0Var.L(i);
    }

    @Override // com.gamericefishpro.space.h2.a
    public final int N() {
        return this.B;
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void P() {
        f0.V(this.y.a, false, 7);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        j0 j0Var = this.y;
        if (!k.o(j0Var.a)) {
            m0();
            return j0Var.a().R(i);
        }
        r0 r0Var = j0Var.q;
        Intrinsics.b(r0Var);
        return r0Var.R(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        j0 j0Var = this.y;
        if (!k.o(j0Var.a)) {
            m0();
            return j0Var.a().U(i);
        }
        r0 r0Var = j0Var.q;
        Intrinsics.b(r0Var);
        return r0Var.U(i);
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final int X() {
        return this.y.a().X();
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final int Y() {
        return this.y.a().Y();
    }

    @Override // com.gamericefishpro.space.h2.a
    public final g0 a() {
        return this.P;
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final void a0(long j, float f, Function1 function1) {
        com.gamericefishpro.space.f2.t0 placementScope;
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            this.L = true;
            if (!com.gamericefishpro.space.c3.i.a(j, this.F) || this.c0) {
                if (j0Var.k || j0Var.j || this.c0) {
                    this.N = true;
                    this.c0 = false;
                }
                k0();
            }
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                j0 j0Var2 = r0Var.y;
                if (r0Var.I == p0.i && !k.o(j0Var2.a)) {
                    j0Var2.c = true;
                }
            }
            r0 r0Var2 = j0Var.q;
            if (r0Var2 != null && r0Var2.e0()) {
                f1 f1Var = j0Var.a().J;
                if (f1Var == null || (placementScope = f1Var.E) == null) {
                    placementScope = ((com.gamericefishpro.space.i2.t) i0.a(f0Var2)).getPlacementScope();
                }
                r0 r0Var3 = j0Var.q;
                Intrinsics.b(r0Var3);
                f0 f0VarV = f0Var2.v();
                if (f0VarV != null) {
                    f0VarV.a0.h = 0;
                }
                r0Var3.B = Integer.MAX_VALUE;
                placementScope.h(r0Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            r0 r0Var4 = j0Var.q;
            if (r0Var4 != null && !r0Var4.D) {
                com.gamericefishpro.space.e2.a.b("Error: Placement happened before lookahead.");
            }
            p0(j, f, function1);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final com.gamericefishpro.space.f2.u0 e(long j) {
        d0 d0Var;
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        d0 d0Var2 = f0Var.W;
        d0 d0Var3 = d0.i;
        if (d0Var2 == d0Var3) {
            f0Var.c();
        }
        if (k.o(j0Var.a)) {
            r0 r0Var = j0Var.q;
            Intrinsics.b(r0Var);
            r0Var.C = d0Var3;
            r0Var.e(j);
        }
        f0 f0Var2 = j0Var.a;
        f0 f0VarV = f0Var2.v();
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.a0;
            if (this.E != d0Var3 && !f0Var2.Y) {
                com.gamericefishpro.space.e2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0) {
                d0Var = d0.d;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.d);
                }
                d0Var = d0.e;
            }
            this.E = d0Var;
        } else {
            this.E = d0Var3;
        }
        q0(j);
        return this;
    }

    public final List e0() {
        j0 j0Var = this.y;
        j0Var.a.f0();
        boolean z = this.R;
        com.gamericefishpro.space.v0.e eVar = this.Q;
        if (!z) {
            return eVar.f();
        }
        f0 f0Var = j0Var.a;
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (eVar.i <= i2) {
                eVar.b(f0Var2.a0.p);
            } else {
                v0 v0Var = f0Var2.a0.p;
                Object[] objArr2 = eVar.d;
                Object obj = objArr2[i2];
                objArr2[i2] = v0Var;
            }
        }
        eVar.m(((com.gamericefishpro.space.v0.b) f0Var.n()).d.i, eVar.i);
        this.R = false;
        return eVar.f();
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        j0 j0Var = this.y;
        if (!k.o(j0Var.a)) {
            m0();
            return j0Var.a().f(i);
        }
        r0 r0Var = j0Var.q;
        Intrinsics.b(r0Var);
        return r0Var.f(i);
    }

    public final void f0() {
        boolean z = this.K;
        this.K = true;
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.Z;
        if (!z) {
            a1Var.c.V0();
            ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getRectManager().e(j0Var.a, true);
            if (f0Var.q()) {
                f0.V(f0Var, true, 6);
            } else if (f0Var.a0.e) {
                f0.T(f0Var, true, 6);
            }
        }
        f1 f1Var = a1Var.c.I;
        for (f1 f1Var2 = a1Var.d; !Intrinsics.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.I) {
            if (f1Var2.d0) {
                f1Var2.R0();
            }
        }
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.w() != Integer.MAX_VALUE) {
                f0Var2.a0.p.f0();
                f0.W(f0Var2);
            }
        }
    }

    public final void h0() {
        if (this.K) {
            this.K = false;
            j0 j0Var = this.y;
            f0 f0Var = j0Var.a;
            f0 f0Var2 = j0Var.a;
            ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getRectManager().g(f0Var2);
            a1 a1Var = f0Var2.Z;
            f1 f1Var = a1Var.c.I;
            for (f1 f1Var2 = a1Var.d; !Intrinsics.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.I) {
                f1Var2.X0();
                f1Var2.c1();
            }
            com.gamericefishpro.space.v0.e eVarZ = f0Var2.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).a0.p.h0();
            }
        }
    }

    @Override // com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.f2.k0
    public final Object i() {
        return this.J;
    }

    public final void k0() {
        j0 j0Var = this.y;
        if (j0Var.l > 0) {
            com.gamericefishpro.space.v0.e eVarZ = j0Var.a.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.a0;
                boolean z = j0Var2.j;
                v0 v0Var = j0Var2.p;
                if ((z || j0Var2.k) && !v0Var.N) {
                    f0Var.U(false);
                }
                v0Var.k0();
            }
        }
    }

    public final void m0() {
        d0 d0Var;
        j0 j0Var = this.y;
        f0.V(j0Var.a, false, 7);
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
        this.X = true;
        j0 j0Var = this.y;
        f0 f0VarV = j0Var.a.v();
        float f = v().T;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.Z;
        f1 f1Var = a1Var.d;
        q qVar = a1Var.c;
        while (f1Var != qVar) {
            Intrinsics.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) f1Var;
            f += xVar.T;
            f1Var = xVar.I;
        }
        if (f != this.W) {
            this.W = f;
            if (f0VarV != null) {
                f0VarV.O();
            }
            if (f0VarV != null) {
                f0VarV.C();
            }
        }
        if (!v().D) {
            boolean z = this.K;
            if (!z || this.P.d()) {
                f0();
            }
            if (z) {
                f0Var.Z.c.V0();
            } else {
                if (f0VarV != null) {
                    f0VarV.C();
                }
                if (this.z && f0VarV != null) {
                    f0VarV.U(false);
                }
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.a0;
            if (!this.z && j0Var2.d == b0.i) {
                if (this.B != Integer.MAX_VALUE) {
                    com.gamericefishpro.space.e2.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.i;
                this.B = i;
                j0Var2.i = i + 1;
            }
        } else {
            this.B = 0;
        }
        C();
    }

    @Override // com.gamericefishpro.space.h2.x0
    public final void p(boolean z) {
        j0 j0Var = this.y;
        if (z != j0Var.a().B) {
            j0Var.a().B = z;
            this.c0 = true;
        }
    }

    public final void p0(long j, float f, Function1 function1) {
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        if (f0Var.k0) {
            com.gamericefishpro.space.e2.a.a("place is called on a deactivated node");
        }
        j0Var.d = b0.i;
        this.F = j;
        this.H = f;
        this.G = function1;
        this.X = false;
        o1 o1VarA = i0.a(f0Var2);
        if (this.N || !this.K) {
            this.P.e = false;
            j0Var.f(false);
            this.Y = function1;
            this.Z = j;
            this.a0 = f;
            q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) o1VarA).getSnapshotObserver();
            snapshotObserver.a.c(f0Var2, snapshotObserver.f, this.b0);
        } else {
            f1 f1VarA = j0Var.a();
            f1VarA.a1(com.gamericefishpro.space.c3.i.c(j, f1VarA.w), f, function1);
            o0();
        }
        j0Var.d = b0.w;
        if (j0Var.a().D && (j0Var.k || j0Var.j)) {
            requestLayout();
        }
        this.D = true;
    }

    public final boolean q0(long j) {
        j0 j0Var = this.y;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.k0) {
                com.gamericefishpro.space.e2.a.a("measure is called on a deactivated node");
            }
            o1 o1VarA = i0.a(f0Var2);
            f0 f0VarV = f0Var2.v();
            boolean z = true;
            f0Var2.Y = f0Var2.Y || (f0VarV != null && f0VarV.Y);
            if (!f0Var2.q() && com.gamericefishpro.space.c3.a.b(this.v, j)) {
                ((com.gamericefishpro.space.i2.t) o1VarA).m(f0Var2, false);
                f0Var2.X();
                return false;
            }
            this.P.d = false;
            com.gamericefishpro.space.v0.e eVarZ = f0Var2.z();
            Object[] objArr = eVarZ.d;
            int i = eVarZ.i;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).a0.p.P.getClass();
                Unit unit = Unit.a;
            }
            this.C = true;
            long j2 = j0Var.a().i;
            d0(j);
            b0 b0Var = j0Var.d;
            b0 b0Var2 = b0.w;
            if (b0Var != b0Var2) {
                com.gamericefishpro.space.e2.a.b("layout state is not idle before measure starts");
            }
            this.T = j;
            b0 b0Var3 = b0.d;
            j0Var.d = b0Var3;
            this.M = false;
            q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.c(f0Var2, snapshotObserver.c, this.U);
            if (j0Var.d == b0Var3) {
                this.N = true;
                this.O = true;
                j0Var.d = b0Var2;
            }
            if (com.gamericefishpro.space.c3.k.a(j0Var.a().i, j2) && j0Var.a().d == this.d && j0Var.a().e == this.e) {
                z = false;
            }
            c0((((long) j0Var.a().e) & 4294967295L) | (((long) j0Var.a().d) << 32));
            return z;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void requestLayout() {
        this.y.a.U(false);
    }

    @Override // com.gamericefishpro.space.h2.a
    public final void u(com.gamericefishpro.space.b2.d0 d0Var) {
        com.gamericefishpro.space.v0.e eVarZ = this.y.a.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            d0Var.invoke(((f0) objArr[i2]).a0.p);
        }
    }

    @Override // com.gamericefishpro.space.h2.a
    public final q v() {
        return this.y.a.Z.c;
    }
}
