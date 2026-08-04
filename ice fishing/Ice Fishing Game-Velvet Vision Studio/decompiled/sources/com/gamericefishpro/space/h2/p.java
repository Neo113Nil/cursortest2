package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o0 {
    @Override // com.gamericefishpro.space.h2.o0
    public final void A0() {
        r0 r0Var = this.H.H.a0.q;
        Intrinsics.b(r0Var);
        r0Var.o0();
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.d(f0Var.Z.d, f0Var.l(), i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.c(f0Var.Z.d, f0Var.l(), i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.e(f0Var.Z.d, f0Var.l(), i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final com.gamericefishpro.space.f2.u0 e(long j) {
        d0(j);
        f1 f1Var = this.H;
        com.gamericefishpro.space.v0.e eVarZ = f1Var.H.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            r0 r0Var = ((f0) objArr[i2]).a0.q;
            Intrinsics.b(r0Var);
            r0Var.C = d0.i;
        }
        f0 f0Var = f1Var.H;
        o0.z0(this, f0Var.Q.a(this, f0Var.l(), j));
        return this;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        com.gamericefishpro.space.u6.c cVarU = this.H.H.u();
        com.gamericefishpro.space.f2.l0 l0VarI = cVarU.i();
        f0 f0Var = (f0) cVarU.d;
        return l0VarI.i(f0Var.Z.d, f0Var.l(), i);
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final int f0(com.gamericefishpro.space.f2.a aVar) {
        r0 r0Var = this.H.H.a0.q;
        Intrinsics.b(r0Var);
        g0 g0Var = r0Var.J;
        j0 j0Var = r0Var.y;
        if (j0Var.d == b0.e) {
            g0Var.d = true;
            if (g0Var.b) {
                j0Var.f = true;
                j0Var.g = true;
            }
        } else {
            g0Var.e = true;
        }
        p pVar = r0Var.v().k0;
        if (pVar != null) {
            pVar.D = true;
        }
        r0Var.C();
        p pVar2 = r0Var.v().k0;
        if (pVar2 != null) {
            pVar2.D = false;
        }
        Integer num = (Integer) g0Var.g.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.M.g(iIntValue, aVar);
        return iIntValue;
    }
}
