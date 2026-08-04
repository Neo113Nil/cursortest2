package com.gamericefishpro.space.h2;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final l1 a = new l1(1);

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(com.gamericefishpro.space.v0.e eVar, com.gamericefishpro.space.h1.l lVar) {
        com.gamericefishpro.space.v0.e eVarZ = s(lVar).z();
        int i = eVarZ.i - 1;
        Object[] objArr = eVarZ.d;
        if (i < objArr.length) {
            while (i >= 0) {
                eVar.b(((f0) objArr[i]).Z.f);
                i--;
            }
        }
    }

    public static final int c(n0 n0Var, com.gamericefishpro.space.f2.a aVar) {
        n0 n0VarO0 = n0Var.o0();
        if (n0VarO0 == null) {
            com.gamericefishpro.space.e2.a.b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.s0().a().containsKey(aVar)) {
            Integer num = (Integer) n0Var.s0().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM0 = n0VarO0.m0(aVar);
            if (iM0 != Integer.MIN_VALUE) {
                n0VarO0.C = true;
                n0Var.D = true;
                n0Var.y0();
                n0VarO0.C = false;
                n0Var.D = false;
                return iM0 + ((int) (aVar instanceof com.gamericefishpro.space.f2.k ? n0VarO0.u0() & 4294967295L : n0VarO0.u0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final com.gamericefishpro.space.h1.l d(i iVar, int i) {
        com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h1.l) iVar).d.y;
        if (lVar == null || (lVar.v & i) == 0) {
            return null;
        }
        while (lVar != null) {
            int i2 = lVar.i;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return lVar;
            }
            lVar = lVar.y;
        }
        return null;
    }

    public static final com.gamericefishpro.space.h1.l e(com.gamericefishpro.space.v0.e eVar) {
        int i;
        if (eVar == null || (i = eVar.i) == 0) {
            return null;
        }
        return (com.gamericefishpro.space.h1.l) eVar.l(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v f(com.gamericefishpro.space.h1.l lVar) {
        if ((lVar.i & 2) != 0) {
            if (lVar instanceof v) {
                return (v) lVar;
            }
            if (lVar instanceof j) {
                com.gamericefishpro.space.h1.l lVar2 = ((j) lVar).I;
                while (lVar2 != 0) {
                    if (lVar2 instanceof v) {
                        return (v) lVar2;
                    }
                    lVar2 = (!(lVar2 instanceof j) || (lVar2.i & 2) == 0) ? lVar2.y : ((j) lVar2).I;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j2) {
        boolean zN = n(j);
        if (zN != n(j2)) {
            return zN ? -1 : 1;
        }
        int iSignum = (int) Math.signum(i(j) - i(j2));
        if (Math.min(i(j), i(j2)) >= 0.0f && m(j) != m(j2)) {
            return m(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(h hVar, com.gamericefishpro.space.t0.o1 o1Var) {
        if (!((com.gamericefishpro.space.h1.l) hVar).d.G) {
            com.gamericefishpro.space.e2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        com.gamericefishpro.space.b1.l lVar = (com.gamericefishpro.space.b1.l) s(hVar).V;
        lVar.getClass();
        return com.gamericefishpro.space.t0.i.w(lVar, o1Var);
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(l lVar) {
        if (((com.gamericefishpro.space.h1.l) lVar).d.G) {
            q(lVar, 1).R0();
        }
    }

    public static final void k(v vVar) {
        s(vVar).E();
    }

    public static final void l(x1 x1Var) {
        s(x1Var).F();
    }

    public static final boolean m(long j) {
        return (j & 2) != 0;
    }

    public static final boolean n(long j) {
        return (j & 1) != 0;
    }

    public static final boolean o(f0 f0Var) {
        if (f0Var.B == null) {
            return false;
        }
        f0 f0VarV = f0Var.v();
        return (f0VarV != null ? f0VarV.B : null) == null || f0Var.a0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(com.gamericefishpro.space.h1.l lVar, Function0 function0) {
        k1 k1Var = lVar.z;
        if (k1Var == null) {
            k1Var = new k1((j1) lVar);
            lVar.z = k1Var;
        }
        q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) t(lVar)).getSnapshotObserver();
        snapshotObserver.a.c(k1Var, d.y, function0);
    }

    public static final f1 q(i iVar, int i) {
        f1 f1Var = ((com.gamericefishpro.space.h1.l) iVar).d.A;
        Intrinsics.b(f1Var);
        if (f1Var.K0() != iVar || !g1.g(i)) {
            return f1Var;
        }
        f1 f1Var2 = f1Var.I;
        Intrinsics.b(f1Var2);
        return f1Var2;
    }

    public static final f1 r(i iVar) {
        if (!((com.gamericefishpro.space.h1.l) iVar).d.G) {
            com.gamericefishpro.space.e2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        f1 f1VarQ = q(iVar, 2);
        if (!f1VarQ.K0().G) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinates is not attached.");
        }
        return f1VarQ;
    }

    public static final f0 s(i iVar) {
        f1 f1Var = ((com.gamericefishpro.space.h1.l) iVar).d.A;
        if (f1Var != null) {
            return f1Var.H;
        }
        throw com.gamericefishpro.space.m5.a.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final o1 t(i iVar) {
        o1 o1Var = s(iVar).H;
        if (o1Var != null) {
            return o1Var;
        }
        throw com.gamericefishpro.space.m5.a.e("This node does not have an owner.");
    }

    public static final View u(i iVar) {
        if (!((com.gamericefishpro.space.h1.l) iVar).d.G) {
            com.gamericefishpro.space.e2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(s(iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void v(com.gamericefishpro.space.h1.l lVar, Object obj, Function1 function1) {
        a1 a1Var;
        if (!lVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar2 = lVar.d.w;
        f0 f0VarS = s(lVar);
        while (f0VarS != null) {
            if ((f0VarS.Z.f.v & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.i & 262144) != 0) {
                        ?? E = lVar2;
                        ?? eVar = 0;
                        while (E != 0) {
                            if (E instanceof c2) {
                                c2 c2Var = (c2) E;
                                if (!(obj.equals(c2Var.i()) ? ((Boolean) function1.invoke(c2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((E.i & 262144) != 0) && (E instanceof j)) {
                                    com.gamericefishpro.space.h1.l lVar3 = ((j) E).I;
                                    int i = 0;
                                    while (lVar3 != null) {
                                        if ((lVar3.i & 262144) != 0) {
                                            E = E;
                                            eVar = eVar;
                                            i++;
                                            if (i == 1) {
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
                                            E = E;
                                            eVar = eVar;
                                        }
                                        lVar3 = lVar3.y;
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
                            }
                            E = e(eVar);
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
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void w(i iVar, String str, Function1 function1) {
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) iVar;
        if (!lVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitSubtreeIf called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar2 = lVar.d;
        com.gamericefishpro.space.h1.l lVar3 = lVar2.y;
        if (lVar3 == null) {
            b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.i;
            if (i == 0) {
                return;
            }
            com.gamericefishpro.space.h1.l lVar4 = (com.gamericefishpro.space.h1.l) eVar.l(i - 1);
            if ((lVar4.v & 262144) != 0) {
                com.gamericefishpro.space.h1.l lVar5 = lVar4;
                while (true) {
                    if (lVar5 != null && lVar5.G) {
                        if ((lVar5.i & 262144) != 0) {
                            ?? E = lVar5;
                            ?? eVar2 = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2 c2Var = (c2) E;
                                    b2 b2Var = str.equals(c2Var.i()) ? (b2) function1.invoke(c2Var) : b2.d;
                                    if (b2Var != b2.i) {
                                        if (b2Var == b2.e) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof j)) {
                                    com.gamericefishpro.space.h1.l lVar6 = ((j) E).I;
                                    int i2 = 0;
                                    E = E;
                                    eVar2 = eVar2;
                                    while (lVar6 != null) {
                                        if ((lVar6.i & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                eVar2 = eVar2;
                                                E = lVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar2.b(E);
                                                    E = 0;
                                                }
                                                eVar2.b(lVar6);
                                            }
                                        }
                                        lVar6 = lVar6.y;
                                        E = E;
                                        eVar2 = eVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = e(eVar2);
                            }
                        }
                        lVar5 = lVar5.y;
                    }
                }
            }
            b(eVar, lVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.gamericefishpro.space.h2.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void x(c2 c2Var, Function1 function1) {
        com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) c2Var;
        if (!lVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitSubtreeIf called on an unattached node");
        }
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
        com.gamericefishpro.space.h1.l lVar2 = lVar.d;
        com.gamericefishpro.space.h1.l lVar3 = lVar2.y;
        if (lVar3 == null) {
            b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.i;
            if (i == 0) {
                return;
            }
            com.gamericefishpro.space.h1.l lVar4 = (com.gamericefishpro.space.h1.l) eVar.l(i - 1);
            if ((lVar4.v & 262144) != 0) {
                com.gamericefishpro.space.h1.l lVar5 = lVar4;
                while (true) {
                    if (lVar5 != null && lVar5.G) {
                        if ((lVar5.i & 262144) != 0) {
                            ?? E = lVar5;
                            ?? eVar2 = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2 c2Var2 = (c2) E;
                                    b2 b2Var = (Intrinsics.a(c2Var.i(), c2Var2.i()) && c2Var.getClass() == c2Var2.getClass()) ? (b2) function1.invoke(c2Var2) : b2.d;
                                    if (b2Var != b2.i) {
                                        if (b2Var == b2.e) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof j)) {
                                    com.gamericefishpro.space.h1.l lVar6 = ((j) E).I;
                                    int i2 = 0;
                                    E = E;
                                    eVar2 = eVar2;
                                    while (lVar6 != null) {
                                        if ((lVar6.i & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                eVar2 = eVar2;
                                                E = lVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar2.b(E);
                                                    E = 0;
                                                }
                                                eVar2.b(lVar6);
                                            }
                                        }
                                        lVar6 = lVar6.y;
                                        E = E;
                                        eVar2 = eVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = e(eVar2);
                            }
                        }
                        lVar5 = lVar5.y;
                    }
                }
            }
            b(eVar, lVar4);
        }
    }
}
