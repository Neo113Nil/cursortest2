package com.gamericefishpro.space.y;

import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.z.k1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends com.gamericefishpro.space.h2.j implements com.gamericefishpro.space.h2.h, j1 {
    public k1 J;
    public com.gamericefishpro.space.z.v0 K;
    public boolean L;
    public com.gamericefishpro.space.z.k M;
    public com.gamericefishpro.space.b0.i N;
    public boolean O;
    public l P;
    public com.gamericefishpro.space.z.j1 Q;
    public com.gamericefishpro.space.h2.i R;
    public m S;
    public l T;
    public boolean U;

    public final void D0() {
        com.gamericefishpro.space.h2.i iVar = this.R;
        if (iVar != null) {
            if (((com.gamericefishpro.space.h1.l) iVar).d.G) {
                return;
            }
            A0(iVar);
            return;
        }
        if (this.O) {
            com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.a3.b(21, this));
        }
        l lVar = this.O ? this.T : this.P;
        if (lVar != null) {
            com.gamericefishpro.space.h2.j jVar = lVar.i;
            if (jVar.d.G) {
                return;
            }
            A0(jVar);
            this.R = jVar;
        }
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        m mVar = (m) com.gamericefishpro.space.h2.k.h(this, y0.a);
        if (Intrinsics.a(mVar, this.S)) {
            return;
        }
        this.S = mVar;
        this.T = null;
        com.gamericefishpro.space.h2.i iVar = this.R;
        if (iVar != null) {
            B0(iVar);
        }
        this.R = null;
        D0();
        com.gamericefishpro.space.z.j1 j1Var = this.Q;
        if (j1Var != null) {
            k1 k1Var = this.J;
            com.gamericefishpro.space.z.v0 v0Var = this.K;
            l lVar = this.O ? this.T : this.P;
            j1Var.R0(this.N, lVar, this.M, v0Var, k1Var, this.L, this.U);
        }
    }

    public final boolean E0() {
        com.gamericefishpro.space.c3.l lVar = com.gamericefishpro.space.c3.l.d;
        if (this.G) {
            lVar = com.gamericefishpro.space.h2.k.s(this).T;
        }
        return lVar != com.gamericefishpro.space.c3.l.e || this.K == com.gamericefishpro.space.z.v0.d;
    }

    public final void F0(com.gamericefishpro.space.b0.i iVar, l lVar, com.gamericefishpro.space.z.k kVar, com.gamericefishpro.space.z.v0 v0Var, k1 k1Var, boolean z, boolean z2) {
        boolean z3;
        this.J = k1Var;
        this.K = v0Var;
        boolean z4 = true;
        if (this.O != z) {
            this.O = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.a(this.P, lVar)) {
            z4 = false;
        } else {
            this.P = lVar;
        }
        if (z3 || (z4 && !z)) {
            com.gamericefishpro.space.h2.i iVar2 = this.R;
            if (iVar2 != null) {
                B0(iVar2);
            }
            this.R = null;
            D0();
        }
        this.L = z2;
        this.M = kVar;
        this.N = iVar;
        boolean zE0 = E0();
        this.U = zE0;
        com.gamericefishpro.space.z.j1 j1Var = this.Q;
        if (j1Var != null) {
            j1Var.R0(iVar, this.O ? this.T : this.P, kVar, v0Var, k1Var, z2, zE0);
        }
    }

    @Override // com.gamericefishpro.space.h2.i
    public final void h0() {
        boolean zE0 = E0();
        if (this.U != zE0) {
            this.U = zE0;
            k1 k1Var = this.J;
            com.gamericefishpro.space.z.v0 v0Var = this.K;
            boolean z = this.O;
            l lVar = z ? this.T : this.P;
            F0(this.N, lVar, this.M, v0Var, k1Var, z, this.L);
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        this.U = E0();
        D0();
        if (this.Q == null) {
            k1 k1Var = this.J;
            com.gamericefishpro.space.z.j1 j1Var = new com.gamericefishpro.space.z.j1(this.N, this.O ? this.T : this.P, this.M, this.K, k1Var, this.L, this.U);
            A0(j1Var);
            this.Q = j1Var;
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        com.gamericefishpro.space.h2.i iVar = this.R;
        if (iVar != null) {
            B0(iVar);
        }
    }
}
