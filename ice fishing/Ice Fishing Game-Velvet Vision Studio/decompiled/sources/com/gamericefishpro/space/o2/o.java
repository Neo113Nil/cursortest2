package com.gamericefishpro.space.o2;

import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.t.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final com.gamericefishpro.space.h1.l a;
    public final boolean b;
    public final f0 c;
    public final l d;
    public boolean e;
    public o f;
    public final int g;

    public o(com.gamericefishpro.space.h1.l lVar, boolean z, f0 f0Var, l lVar2) {
        this.a = lVar;
        this.b = z;
        this.c = f0Var;
        this.d = lVar2;
        this.g = f0Var.e;
    }

    public static /* synthetic */ List j(int i, o oVar) {
        return oVar.i((i & 1) != 0 ? !oVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final com.gamericefishpro.space.n1.c a(f1 f1Var) {
        ?? E;
        o oVarL = l();
        if (oVarL == null) {
            return com.gamericefishpro.space.n1.c.e;
        }
        com.gamericefishpro.space.h1.l lVar = oVarL.c.Z.f;
        if ((lVar.v & 8) == 0) {
            E = 0;
            break;
        }
        loop0: while (true) {
            if (lVar != null) {
                if ((lVar.i & 8) != 0) {
                    E = lVar;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof x1) {
                            if (((x1) E).d()) {
                                break loop0;
                            }
                        } else if ((E.i & 8) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                            com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                            int i = 0;
                            while (lVar2 != null) {
                                if ((lVar2.i & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        E = E;
                                        eVar = eVar;
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
                                } else {
                                    E = E;
                                    eVar = eVar;
                                }
                                lVar2 = lVar2.y;
                                E = E;
                                eVar = eVar;
                            }
                            if (i == 1) {
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
                if ((lVar.v & 8) != 0) {
                    lVar = lVar.y;
                }
            }
            E = 0;
            break;
        }
        x1 x1Var = (x1) E;
        f1 f1VarQ = x1Var != null ? com.gamericefishpro.space.h2.k.q(x1Var, 8) : null;
        return f1VarQ == null ? oVarL.a(f1Var) : f1VarQ.z(f1Var, true);
    }

    public final o b(h hVar, Function1 function1) {
        l lVar = new l();
        lVar.i = false;
        lVar.v = false;
        function1.invoke(lVar);
        o oVar = new o(new n(function1), false, new f0(this.g + (hVar != null ? 1000000000 : 2000000000), true), lVar);
        oVar.e = true;
        oVar.f = this;
        return oVar;
    }

    public final void c(f0 f0Var, ArrayList arrayList) {
        com.gamericefishpro.space.v0.e eVarY = f0Var.y();
        Object[] objArr = eVarY.d;
        int i = eVarY.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.H() && !f0Var2.k0) {
                if (f0Var2.Z.d(8)) {
                    arrayList.add(r.a(f0Var2, this.b));
                } else {
                    c(f0Var2, arrayList);
                }
            }
        }
    }

    public final f1 d() {
        if (!this.e) {
            x1 x1VarF = f();
            return x1VarF != null ? com.gamericefishpro.space.h2.k.q(x1VarF, 8) : this.c.Z.c;
        }
        o oVarL = l();
        if (oVarL != null) {
            return oVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (oVar.n()) {
                arrayList2.add(oVar);
            } else if (!oVar.d.v) {
                oVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final x1 f() {
        ?? E;
        boolean z = this.d.i;
        f0 f0Var = this.c;
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        r5 = 0;
        if (!z) {
            com.gamericefishpro.space.h1.l lVar = f0Var.Z.f;
            if ((lVar.v & 8) != 0) {
                loop3: while (lVar != null) {
                    if ((lVar.i & 8) != 0) {
                        E = lVar;
                        ?? eVar = 0;
                        while (true) {
                            if (E != 0) {
                                if (E instanceof x1) {
                                    if (((x1) E).d()) {
                                        r5 = E;
                                    }
                                } else if ((E.i & 8) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i = 0;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                eVar = eVar;
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
                                        } else {
                                            E = E;
                                            eVar = eVar;
                                        }
                                        lVar2 = lVar2.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i == 1) {
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
                    if ((lVar.v & 8) == 0) {
                        break;
                    }
                    lVar = lVar.y;
                }
            }
        } else {
            com.gamericefishpro.space.h1.l lVar3 = f0Var.Z.f;
            if ((lVar3.v & 8) != 0) {
                E = 0;
                while (lVar3 != null) {
                    if ((lVar3.i & 8) != 0) {
                        ?? E2 = lVar3;
                        ?? eVar2 = 0;
                        while (E2 != 0) {
                            if (E2 instanceof x1) {
                                x1 x1Var = (x1) E2;
                                if (x1Var.d()) {
                                    if (x1Var.a0()) {
                                        return x1Var;
                                    }
                                    if (E == 0) {
                                        E = x1Var;
                                    }
                                }
                            } else if ((E2.i & 8) != 0 && (E2 instanceof com.gamericefishpro.space.h2.j)) {
                                com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) E2).I;
                                int i2 = 0;
                                while (lVar4 != null) {
                                    if ((lVar4.i & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E2 = E2;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            E2 = lVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (E2 != 0) {
                                                eVar2.b(E2);
                                                E2 = 0;
                                            }
                                            eVar2.b(lVar4);
                                        }
                                    } else {
                                        E2 = E2;
                                        eVar2 = eVar2;
                                    }
                                    lVar4 = lVar4.y;
                                    E2 = E2;
                                    eVar2 = eVar2;
                                }
                                if (i2 == 1) {
                                    E2 = E2;
                                    eVar2 = eVar2;
                                } else {
                                    E2 = E2;
                                    eVar2 = eVar2;
                                }
                            }
                            E2 = com.gamericefishpro.space.h2.k.e(eVar2);
                        }
                    }
                    if ((lVar3.v & 8) == 0) {
                        break;
                    }
                    lVar3 = lVar3.y;
                    E = E;
                }
                r5 = E;
            }
        }
        return (x1) r5;
    }

    public final com.gamericefishpro.space.n1.c g() {
        f1 f1VarD = d();
        if (f1VarD != null) {
            if (!f1VarD.K0().G) {
                f1VarD = null;
            }
            if (f1VarD != null) {
                return com.gamericefishpro.space.f2.x.h(f1VarD).z(f1VarD, true);
            }
        }
        return com.gamericefishpro.space.n1.c.e;
    }

    public final com.gamericefishpro.space.n1.c h() {
        f1 f1VarD = d();
        if (f1VarD != null) {
            if (!f1VarD.K0().G) {
                f1VarD = null;
            }
            if (f1VarD != null) {
                return com.gamericefishpro.space.f2.x.f(f1VarD, true);
            }
        }
        return com.gamericefishpro.space.n1.c.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.v) {
            return g0.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final l k() {
        boolean zN = n();
        l lVar = this.d;
        if (!zN) {
            return lVar;
        }
        l lVarC = lVar.c();
        p(new ArrayList(), lVarC);
        return lVarC;
    }

    public final o l() {
        f0 f0VarV;
        o oVar = this.f;
        if (oVar != null) {
            return oVar;
        }
        f0 f0Var = this.c;
        boolean z = this.b;
        if (!z) {
            f0VarV = null;
            break;
        }
        f0VarV = f0Var.v();
        while (true) {
            if (f0VarV == null) {
                f0VarV = null;
                break;
            }
            l lVarX = f0VarV.x();
            if (lVarX != null && lVarX.i) {
                break;
            }
            f0VarV = f0VarV.v();
        }
        if (f0VarV == null) {
            for (f0 f0VarV2 = f0Var.v(); f0VarV2 != null; f0VarV2 = f0VarV2.v()) {
                if (f0VarV2.Z.d(8)) {
                    f0VarV = f0VarV2;
                }
            }
            f0VarV = null;
        }
        if (f0VarV == null) {
            return null;
        }
        return r.a(f0VarV, z);
    }

    public final l m() {
        return this.d;
    }

    public final boolean n() {
        return this.b && this.d.i;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        f0 f0VarV = this.c.v();
        while (f0VarV != null) {
            l lVarX = f0VarV.x();
            if (lVarX != null && lVarX.i) {
                if (f0VarV == null) {
                    return true;
                }
                return false;
            }
            f0VarV = f0VarV.v();
        }
        f0VarV = null;
        if (f0VarV == null) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList, l lVar) {
        if (this.d.v) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (!oVar.n()) {
                lVar.f(oVar.d);
                oVar.p(arrayList, lVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return g0.d;
        }
        c(this.c, arrayList);
        if (z) {
            l lVar = this.d;
            h0 h0Var = lVar.d;
            Object objG = h0Var.g(s.x);
            if (objG == null) {
                objG = null;
            }
            h hVar = (h) objG;
            if (hVar != null && lVar.i && !arrayList.isEmpty()) {
                arrayList.add(b(hVar, new d0(20, hVar)));
            }
            v vVar = s.a;
            if (h0Var.c(vVar) && !arrayList.isEmpty() && lVar.i) {
                Object objG2 = h0Var.g(vVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new d0(21, str)));
                }
            }
        }
        return arrayList;
    }
}
