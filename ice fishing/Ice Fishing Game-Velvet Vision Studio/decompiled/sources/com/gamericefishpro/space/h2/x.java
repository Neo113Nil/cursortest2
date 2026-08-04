package com.gamericefishpro.space.h2;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends f1 {
    public static final com.gamericefishpro.space.r8.m l0;
    public v j0;
    public w k0;

    static {
        com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.o1.o.f();
        mVarF.c(com.gamericefishpro.space.o1.s.e);
        ((Paint) mVarF.b).setStrokeWidth(1.0f);
        mVarF.e(1);
        l0 = mVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(f0 f0Var, v vVar) {
        super(f0Var);
        this.j0 = vVar;
        this.k0 = f0Var.B != null ? new w(this) : null;
        if ((((com.gamericefishpro.space.h1.l) vVar).d.i & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final void F0() {
        if (this.k0 == null) {
            this.k0 = new w(this);
        }
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final o0 I0() {
        return this.k0;
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final com.gamericefishpro.space.h1.l K0() {
        return ((com.gamericefishpro.space.h1.l) this.j0).d;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        v vVar = this.j0;
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        return vVar.N(this, f1Var, i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        v vVar = this.j0;
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        return vVar.k0(this, f1Var, i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        v vVar = this.j0;
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        return vVar.Z(this, f1Var, i);
    }

    @Override // com.gamericefishpro.space.h2.f1
    public final void Z0(com.gamericefishpro.space.o1.q qVar, com.gamericefishpro.space.r1.b bVar) {
        f1 f1Var;
        f1 f1Var2 = this.I;
        Intrinsics.b(f1Var2);
        f1Var2.D0(qVar, bVar);
        if (!((com.gamericefishpro.space.i2.t) i0.a(this.H)).getShowLayoutBounds() || (f1Var = this.I) == null) {
            return;
        }
        if (com.gamericefishpro.space.c3.k.a(this.i, f1Var.i) && com.gamericefishpro.space.c3.i.a(f1Var.S, 0L)) {
            return;
        }
        long j = this.i;
        qVar.e(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, l0);
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final void a0(long j, float f, Function1 function1) {
        a1(j, f, function1);
        if (this.C) {
            return;
        }
        V0();
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        f1Var.D = this.D;
        s0().b();
        f1Var.D = false;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final com.gamericefishpro.space.f2.u0 e(long j) {
        d0(j);
        v vVar = this.j0;
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        d1(vVar.F(this, f1Var, j));
        U0();
        return this;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        v vVar = this.j0;
        f1 f1Var = this.I;
        Intrinsics.b(f1Var);
        return vVar.C(this, f1Var, i);
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final int f0(com.gamericefishpro.space.f2.a aVar) {
        w wVar = this.k0;
        if (wVar == null) {
            return k.c(this, aVar);
        }
        com.gamericefishpro.space.t.c0 c0Var = wVar.M;
        int iD = c0Var.d(aVar);
        if (iD >= 0) {
            return c0Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(v vVar) {
        if (!vVar.equals(this.j0) && (((com.gamericefishpro.space.h1.l) vVar).d.i & 512) != 0) {
            throw new ClassCastException();
        }
        this.j0 = vVar;
    }
}
