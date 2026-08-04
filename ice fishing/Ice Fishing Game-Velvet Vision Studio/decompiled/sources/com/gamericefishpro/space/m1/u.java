package com.gamericefishpro.space.m1;

import android.os.Trace;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.i2.b1;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.h, com.gamericefishpro.space.h2.u, j1, com.gamericefishpro.space.g2.c, com.gamericefishpro.space.h2.i {
    public final boolean H;
    public final Function2 I;
    public boolean J;
    public boolean K;
    public final int L;

    public u(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.H = z;
        this.I = function2;
        this.L = i;
    }

    public final boolean A0(int i) {
        int iOrdinal = y3.E(this, i).ordinal();
        if (iOrdinal == 0) {
            return y3.F(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new com.gamericefishpro.space.oh.k();
    }

    public final void B0(s sVar, s sVar2) {
        a1 a1Var;
        Function2 function2;
        k kVar = (k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner();
        u uVarF = kVar.f();
        if (!sVar.equals(sVar2) && (function2 = this.I) != null) {
            function2.invoke(sVar, sVar2);
        }
        com.gamericefishpro.space.h1.l lVar = this.d;
        if (!lVar.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar2 = this.d;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
        while (f0VarS != null) {
            if ((f0VarS.Z.f.v & 5120) != 0) {
                while (lVar2 != null) {
                    int i = lVar2.i;
                    if ((i & 5120) != 0) {
                        if (lVar2 != lVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            com.gamericefishpro.space.h1.l lVarE = lVar2;
                            com.gamericefishpro.space.v0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof com.gamericefishpro.space.h2.b) {
                                    com.gamericefishpro.space.h2.b bVar = (com.gamericefishpro.space.h2.b) lVarE;
                                    if (uVarF == kVar.f()) {
                                        bVar.B0();
                                        throw null;
                                    }
                                } else if ((lVarE.i & 4096) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                    int i2 = 0;
                                    for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                        if ((lVar3.i & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                lVarE = lVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        } else {
                            continue;
                        }
                    }
                    lVar2 = lVar2.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar2 = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final o C0() {
        boolean z;
        a1 a1Var;
        o oVar = new o();
        oVar.a = true;
        q qVar = q.b;
        oVar.b = qVar;
        oVar.c = qVar;
        oVar.d = qVar;
        oVar.e = qVar;
        oVar.f = qVar;
        oVar.g = qVar;
        oVar.h = qVar;
        oVar.i = qVar;
        oVar.j = n.e;
        oVar.k = n.i;
        oVar.l = l.a;
        int i = this.L;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((com.gamericefishpro.space.x1.a) ((com.gamericefishpro.space.x1.c) ((com.gamericefishpro.space.x1.b) com.gamericefishpro.space.h2.k.h(this, b1.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        oVar.a = z;
        com.gamericefishpro.space.h1.l lVar = this.d;
        if (!lVar.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar2 = this.d;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
        loop0: while (f0VarS != null) {
            if ((f0VarS.Z.f.v & 3072) != 0) {
                while (lVar2 != null) {
                    int i2 = lVar2.i;
                    if ((i2 & 3072) != 0) {
                        if (lVar2 != lVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? E = lVar2;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof p) {
                                    ((p) E).o(oVar);
                                } else if ((E.i & 2048) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i3 = 0;
                                    while (lVar3 != null) {
                                        if ((lVar3.i & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        } else {
                                            E = E;
                                            eVar = eVar;
                                        }
                                        lVar3 = lVar3.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i3 == 1) {
                                        E = E;
                                        eVar = eVar;
                                    } else {
                                        E = E;
                                        eVar = eVar;
                                    }
                                }
                                E = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                    }
                    lVar2 = lVar2.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar2 = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
        return oVar;
    }

    public final com.gamericefishpro.space.n1.c D0(com.gamericefishpro.space.f2.u uVar) {
        com.gamericefishpro.space.n1.c cVar = C0().l;
        if (cVar != l.a) {
            return uVar == null ? cVar : cVar.e(uVar.k(com.gamericefishpro.space.h2.k.r(this), 0L));
        }
        return uVar != null ? uVar.z(com.gamericefishpro.space.h2.k.r(this), false) : d5.h(0L, com.gamericefishpro.space.d9.h.Q(com.gamericefishpro.space.h2.k.r(this).i));
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        G0();
    }

    public final com.gamericefishpro.space.h0.q E0() {
        a1 a1Var;
        Object obj;
        if (!this.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar = this.d.w;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
        loop0: while (f0VarS != null) {
            if ((f0VarS.Z.f.v & 8388640) != 0) {
                while (lVar != null) {
                    int i = lVar.i;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(lVar instanceof com.gamericefishpro.space.h0.q)) {
                                if (lVar instanceof com.gamericefishpro.space.h2.j) {
                                    com.gamericefishpro.space.h1.l lVar2 = null;
                                    for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVar).I; lVar3 != null; lVar3 = lVar3.y) {
                                        if (lVar3 instanceof com.gamericefishpro.space.h0.q) {
                                            lVar2 = lVar3;
                                        }
                                    }
                                    lVar = lVar2;
                                } else {
                                    lVar = null;
                                }
                            }
                            com.gamericefishpro.space.h0.q qVar = (com.gamericefishpro.space.h0.q) lVar;
                            if (qVar != null) {
                                return qVar;
                            }
                        } else if ((i & 32) != 0) {
                            if (lVar instanceof com.gamericefishpro.space.g2.c) {
                                obj = lVar;
                            } else if (lVar instanceof com.gamericefishpro.space.h2.j) {
                                obj = null;
                                for (com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) lVar).I; lVar4 != null; lVar4 = lVar4.y) {
                                    if (lVar4 instanceof com.gamericefishpro.space.g2.c) {
                                        obj = lVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            com.gamericefishpro.space.g2.c cVar = (com.gamericefishpro.space.g2.c) obj;
                            if (cVar != null) {
                                cVar.e().getClass();
                            }
                        }
                    }
                    lVar = lVar.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
        return null;
    }

    public final s F0() {
        a1 a1Var;
        if (!this.G) {
            return s.i;
        }
        u uVarF = ((k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner()).f();
        if (uVarF == null) {
            return s.i;
        }
        if (this == uVarF) {
            return s.d;
        }
        if (uVarF.G) {
            if (!uVarF.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar = uVarF.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarF);
            while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 1024) != 0) {
                            com.gamericefishpro.space.h1.l lVarE = lVar;
                            com.gamericefishpro.space.v0.e eVar = null;
                            while (lVarE != null) {
                                if (lVarE instanceof u) {
                                    if (this == ((u) lVarE)) {
                                        return s.e;
                                    }
                                } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                    int i = 0;
                                    for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                        if ((lVar2.i & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lVarE = lVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
            }
        }
        return s.i;
    }

    public final void G0() {
        int iOrdinal = F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                return;
            }
        }
        a0 a0Var = new a0();
        com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.b2.b(9, a0Var, this));
        Object obj = a0Var.d;
        if (obj == null) {
            Intrinsics.h("focusProperties");
            throw null;
        }
        if (((m) obj).b()) {
            return;
        }
        ((k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean H0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return C0().a ? A0(i) : d5.w(this, i, new com.gamericefishpro.space.i2.q(i, 3));
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        int iOrdinal = F0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                h focusOwner = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner();
                u uVarV = a4.v(this);
                if (uVarV == null || !uVarV.H) {
                    return;
                }
                k kVar = (k) focusOwner;
                kVar.a.F();
                kVar.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                return;
            }
        }
        k kVar2 = (k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner();
        kVar2.b(8, true, false);
        if (this.H) {
            kVar2.a.F();
        }
        kVar2.d.a();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void u0() {
        if (F0().a()) {
            ((k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(this)).getFocusOwner()).b(8, true, true);
        }
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void z(com.gamericefishpro.space.f2.u uVar) {
    }
}
