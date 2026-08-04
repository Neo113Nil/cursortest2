package com.gamericefishpro.space.y;

import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.pi.g1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.h2.j implements x1, com.gamericefishpro.space.h2.m, com.gamericefishpro.space.h2.h, j1, c2 {
    public static final c P = new c();
    public com.gamericefishpro.space.b0.i J;
    public final g1 K;
    public com.gamericefishpro.space.b0.d L;
    public com.gamericefishpro.space.h0.h0 M;
    public com.gamericefishpro.space.h2.f1 N;
    public final com.gamericefishpro.space.m1.u O;

    public g0(com.gamericefishpro.space.b0.i iVar, g1 g1Var) {
        this.J = iVar;
        this.K = g1Var;
        com.gamericefishpro.space.m1.u uVar = new com.gamericefishpro.space.m1.u(0, new com.gamericefishpro.space.f3.v(2, this, g0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 10);
        A0(uVar);
        this.O = uVar;
    }

    public final void D0(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.b0.h hVar) {
        if (!this.G) {
            iVar.b(hVar);
            return;
        }
        com.gamericefishpro.space.pi.d1 d1Var = (com.gamericefishpro.space.pi.d1) ((com.gamericefishpro.space.ui.c) o0()).d.j(com.gamericefishpro.space.pi.u.e);
        com.gamericefishpro.space.pi.a0.u(o0(), null, new com.gamericefishpro.space.db.d(iVar, hVar, d1Var != null ? d1Var.n(new b(3, iVar, hVar)) : null, null, 18), 3);
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.e.e(14, a0Var, this));
        com.gamericefishpro.space.h0.h0 h0Var = (com.gamericefishpro.space.h0.h0) a0Var.d;
        if (this.O.F0().a()) {
            com.gamericefishpro.space.h0.h0 h0Var2 = this.M;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.M = h0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void E0() {
        com.gamericefishpro.space.h2.a1 a1Var;
        if (this.G) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar = this.d.w;
            com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 262144) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    if (h0.H.equals(((c2) E).i())) {
                                        return;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                        lVar2 = lVar2.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
            }
        }
    }

    public final void F0(com.gamericefishpro.space.b0.i iVar) {
        com.gamericefishpro.space.b0.d dVar;
        if (Intrinsics.a(this.J, iVar)) {
            return;
        }
        com.gamericefishpro.space.b0.i iVar2 = this.J;
        if (iVar2 != null && (dVar = this.L) != null) {
            iVar2.b(new com.gamericefishpro.space.b0.e(dVar));
        }
        this.L = null;
        this.J = iVar;
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        boolean zA = this.O.F0().a();
        com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.k;
        com.gamericefishpro.space.ki.d dVar = com.gamericefishpro.space.o2.u.a[4];
        wVar.b(vVar, Boolean.valueOf(zA));
        wVar.b(com.gamericefishpro.space.o2.k.v, new com.gamericefishpro.space.o2.a(null, new com.gamericefishpro.space.i2.o(0, this, g0.class, "requestFocus", "requestFocus()Z", 0, 3)));
    }

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return P;
    }

    @Override // com.gamericefishpro.space.h2.m
    public final void m0(com.gamericefishpro.space.h2.f1 f1Var) {
        this.N = f1Var;
        if (this.O.F0().a()) {
            if (!f1Var.K0().G) {
                E0();
                return;
            }
            com.gamericefishpro.space.h2.f1 f1Var2 = this.N;
            if (f1Var2 == null || !f1Var2.K0().G) {
                return;
            }
            E0();
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void u0() {
        com.gamericefishpro.space.h0.h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.b();
        }
        this.M = null;
    }
}
