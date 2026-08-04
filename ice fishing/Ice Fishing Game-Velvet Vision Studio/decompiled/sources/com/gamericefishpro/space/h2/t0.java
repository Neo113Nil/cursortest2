package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public final f0 a;
    public boolean c;
    public boolean d;
    public com.gamericefishpro.space.c3.a i;
    public final com.gamericefishpro.space.a8.c b = new com.gamericefishpro.space.a8.c(9);
    public final com.gamericefishpro.space.u6.l e = new com.gamericefishpro.space.u6.l(4);
    public final com.gamericefishpro.space.v0.e f = new com.gamericefishpro.space.v0.e(new f0[16]);
    public final long g = 1;
    public final com.gamericefishpro.space.v0.e h = new com.gamericefishpro.space.v0.e(new s0[16]);

    public t0(f0 f0Var) {
        this.a = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(f0 f0Var, com.gamericefishpro.space.c3.a aVar) {
        boolean zQ0;
        f0 f0Var2 = f0Var.B;
        j0 j0Var = f0Var.a0;
        if (f0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            r0 r0Var = j0Var.q;
            com.gamericefishpro.space.c3.a aVar2 = r0Var != null ? r0Var.F : null;
            if (aVar2 == null || f0Var2 == null) {
                zQ0 = false;
            } else {
                Intrinsics.b(r0Var);
                zQ0 = r0Var.q0(aVar2.a);
            }
        } else if (f0Var2 != null) {
            r0 r0Var2 = j0Var.q;
            Intrinsics.b(r0Var2);
            zQ0 = r0Var2.q0(aVar.a);
        } else {
            zQ0 = false;
        }
        f0 f0VarV = f0Var.v();
        if (zQ0 && f0VarV != null) {
            if (f0VarV.B == null) {
                f0.V(f0VarV, false, 3);
                return zQ0;
            }
            if (f0Var.s() == d0.d) {
                f0.T(f0VarV, false, 3);
                return zQ0;
            }
            if (f0Var.s() == d0.e) {
                f0VarV.S(false);
            }
        }
        return zQ0;
    }

    public static boolean c(f0 f0Var, com.gamericefishpro.space.c3.a aVar) {
        boolean zQ0;
        if (aVar != null) {
            if (f0Var.W == d0.i) {
                f0Var.c();
            }
            zQ0 = f0Var.a0.p.q0(aVar.a);
        } else {
            v0 v0Var = f0Var.a0.p;
            com.gamericefishpro.space.c3.a aVar2 = v0Var.C ? new com.gamericefishpro.space.c3.a(v0Var.v) : null;
            if (aVar2 != null) {
                if (f0Var.W == d0.i) {
                    f0Var.c();
                }
                zQ0 = f0Var.a0.p.q0(aVar2.a);
            } else {
                zQ0 = false;
            }
        }
        f0 f0VarV = f0Var.v();
        if (zQ0 && f0VarV != null) {
            if (f0Var.r() == d0.d) {
                f0.V(f0VarV, false, 3);
                return zQ0;
            }
            if (f0Var.r() == d0.e) {
                f0VarV.U(false);
            }
        }
        return zQ0;
    }

    public static boolean h(f0 f0Var) {
        r0 r0Var;
        g0 g0Var;
        if (f0Var.a0.e) {
            return (f0Var.s() == d0.i && ((r0Var = f0Var.a0.q) == null || (g0Var = r0Var.J) == null || !g0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(f0 f0Var) {
        if (!f0Var.q()) {
            return false;
        }
        do {
            if (f0Var.r() == d0.i && !f0Var.a0.p.P.e()) {
                f0 f0VarV = f0Var.v();
                if ((f0VarV != null ? f0VarV.a0.d : null) != b0.d) {
                    return false;
                }
            }
            f0Var = f0Var.v();
            if (f0Var == null) {
                return false;
            }
        } while (!f0Var.I());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        Object[] objArr;
        com.gamericefishpro.space.u6.l lVar = this.e;
        if (z) {
            com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) lVar.d;
            f0 f0Var = this.a;
            if (f0Var.j0 > 0) {
                eVar.g();
                eVar.b(f0Var);
                f0Var.i0 = true;
            }
        }
        com.gamericefishpro.space.v0.e eVar2 = (com.gamericefishpro.space.v0.e) lVar.d;
        int i = eVar2.i;
        if (i != 0) {
            com.gamericefishpro.space.ph.u.m(eVar2.d, l1.b, 0, i);
            int i2 = eVar2.i;
            f0[] f0VarArr = (f0[]) lVar.e;
            if (f0VarArr == null || f0VarArr.length < i2) {
                objArr = f0VarArr;
                objArr = new f0[Math.max(16, i2)];
            }
            objArr = f0VarArr;
            lVar.e = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = eVar2.d[i3];
            }
            eVar2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                f0 f0Var2 = objArr[i4];
                Intrinsics.b(f0Var2);
                if (f0Var2.i0) {
                    com.gamericefishpro.space.u6.l.f(f0Var2);
                }
                objArr[i4] = 0;
            }
            lVar.e = objArr;
        }
    }

    public final void d() {
        com.gamericefishpro.space.v0.e eVar = this.h;
        int i = eVar.i;
        if (i != 0) {
            Object[] objArr = eVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                s0 s0Var = (s0) objArr[i2];
                f0 f0Var = s0Var.a;
                boolean z = s0Var.c;
                f0 f0Var2 = s0Var.a;
                if (f0Var.H()) {
                    if (s0Var.b) {
                        f0.T(f0Var2, z, 2);
                    } else {
                        f0.V(f0Var2, z, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(f0 f0Var) {
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (Intrinsics.a(f0Var2.J(), Boolean.TRUE) && !f0Var2.k0) {
                if (this.b.g(f0Var2)) {
                    f0Var2.K();
                }
                e(f0Var2);
            }
        }
    }

    public final void f(f0 f0Var, boolean z) {
        if (!this.c) {
            com.gamericefishpro.space.e2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? f0Var.a0.e : f0Var.q()) {
            com.gamericefishpro.space.e2.a.a("node not yet measured");
        }
        g(f0Var, z);
    }

    public final void g(f0 f0Var, boolean z) {
        r0 r0Var;
        g0 g0Var;
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if ((!z && (f0Var2.r() == d0.d || f0Var2.a0.p.P.e())) || (z && (f0Var2.s() == d0.d || ((r0Var = f0Var2.a0.q) != null && (g0Var = r0Var.J) != null && g0Var.e())))) {
                boolean zO = k.o(f0Var2);
                j0 j0Var = f0Var2.a0;
                if (zO && !z) {
                    if (j0Var.e && this.b.g(f0Var2)) {
                        m(f0Var2, true, false);
                    } else {
                        f(f0Var2, true);
                    }
                }
                if (z ? j0Var.e : f0Var2.q()) {
                    m(f0Var2, z, false);
                }
                if (!(z ? j0Var.e : f0Var2.q())) {
                    g(f0Var2, z);
                }
            }
        }
        if (z ? f0Var.a0.e : f0Var.q()) {
            m(f0Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(com.gamericefishpro.space.i2.r rVar) {
        boolean z;
        com.gamericefishpro.space.h1.l lVar;
        ?? eVar;
        ?? E;
        int i;
        boolean z2;
        f0 f0Var;
        boolean z3;
        com.gamericefishpro.space.a8.c cVar = this.b;
        f0 f0Var2 = this.a;
        if (!f0Var2.H()) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.I()) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i2 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zQ = cVar.q();
                com.gamericefishpro.space.vb.c cVar2 = (com.gamericefishpro.space.vb.c) cVar.e;
                if (zQ) {
                    z = false;
                    while (true) {
                        com.gamericefishpro.space.vb.c cVar3 = (com.gamericefishpro.space.vb.c) cVar.v;
                        com.gamericefishpro.space.vb.c cVar4 = (com.gamericefishpro.space.vb.c) cVar.i;
                        if (!((y1) cVar2.e).isEmpty()) {
                            f0Var = (f0) ((y1) cVar2.e).first();
                            cVar2.q(f0Var);
                            z3 = f0Var.B != null;
                            z2 = false;
                        } else if (!((y1) cVar4.e).isEmpty()) {
                            f0Var = (f0) ((y1) cVar4.e).first();
                            cVar4.q(f0Var);
                            z3 = f0Var.B != null;
                            z2 = true;
                        } else {
                            if (((y1) cVar3.e).isEmpty()) {
                                break;
                            }
                            f0 f0Var3 = (f0) ((y1) cVar3.e).first();
                            cVar3.q(f0Var3);
                            z2 = true;
                            f0Var = f0Var3;
                            z3 = false;
                        }
                        boolean zM = m(f0Var, z3, z2);
                        if (!z2) {
                            if (f0Var.a0.f) {
                                cVar.c(f0Var, s.e);
                            }
                            if (f0Var.p()) {
                                cVar.c(f0Var, s.v);
                            }
                        }
                        if (f0Var == f0Var2 && zM) {
                            z = true;
                        }
                    }
                    if (rVar != null) {
                        rVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        com.gamericefishpro.space.v0.e eVar2 = this.f;
        Object[] objArr = eVar2.d;
        int i3 = eVar2.i;
        int i4 = 0;
        while (i4 < i3) {
            a1 a1Var = ((f0) objArr[i4]).Z;
            q qVar = a1Var.c;
            int i5 = 4194304;
            boolean zG = g1.g(4194304);
            if (zG) {
                lVar = qVar.j0;
            } else {
                lVar = qVar.j0.w;
                if (lVar == null) {
                }
                i4++;
                i2 = 0;
            }
            com.gamericefishpro.space.o1.h0 h0Var = f1.f0;
            com.gamericefishpro.space.h1.l lVarM0 = qVar.M0(zG);
            while (lVarM0 != null && (lVarM0.v & i5) != 0) {
                if ((lVarM0.i & i5) != 0) {
                    ?? r13 = lVarM0;
                    ?? r14 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof u) {
                            ((u) r13).z(a1Var.c);
                        } else {
                            if ((r13.i & i5) != 0 && (r13 instanceof j)) {
                                com.gamericefishpro.space.h1.l lVar2 = ((j) r13).I;
                                while (lVar2 != null) {
                                    int i6 = i5;
                                    if ((lVar2.i & i6) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E = r13;
                                            eVar = r14;
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
                                        E = r13;
                                        eVar = r14;
                                    }
                                    lVar2 = lVar2.y;
                                    i5 = i6;
                                    E = E;
                                    eVar = eVar;
                                }
                                E = r13;
                                eVar = r14;
                                i = i5;
                                eVar = eVar;
                                if (i2 == 1) {
                                }
                                i5 = i;
                                i2 = 0;
                                r13 = E;
                                r14 = eVar;
                            }
                            E = k.e(eVar);
                            i5 = i;
                            i2 = 0;
                            r13 = E;
                            r14 = eVar;
                        }
                        i = i5;
                        eVar = r14;
                        E = k.e(eVar);
                        i5 = i;
                        i2 = 0;
                        r13 = E;
                        r14 = eVar;
                    }
                }
                int i7 = i5;
                if (lVarM0 == lVar) {
                    break;
                }
                lVarM0 = lVarM0.y;
                i5 = i7;
                i2 = 0;
            }
            i4++;
            i2 = 0;
        }
        eVar2.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.gamericefishpro.space.h2.f0, java.lang.Object] */
    public final void k(f0 f0Var, long j) {
        com.gamericefishpro.space.h1.l lVar;
        ?? E;
        if (f0Var.k0) {
            return;
        }
        f0 f0Var2 = this.a;
        if (f0Var.equals(f0Var2)) {
            com.gamericefishpro.space.e2.a.a("measureAndLayout called on root");
        }
        if (!f0Var2.H()) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.I()) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                com.gamericefishpro.space.a8.c cVar = this.b;
                ((com.gamericefishpro.space.vb.c) cVar.e).q(f0Var);
                ((com.gamericefishpro.space.vb.c) cVar.i).q(f0Var);
                ((com.gamericefishpro.space.vb.c) cVar.v).q(f0Var);
                if ((b(f0Var, new com.gamericefishpro.space.c3.a(j)) || f0Var.a0.f) && Intrinsics.a(f0Var.J(), Boolean.TRUE)) {
                    f0Var.K();
                }
                e(f0Var);
                c(f0Var, new com.gamericefishpro.space.c3.a(j));
                if (f0Var.p() && f0Var.I()) {
                    f0Var.R();
                    com.gamericefishpro.space.u6.l lVar2 = this.e;
                    lVar2.getClass();
                    if (f0Var.j0 > 0) {
                        ((com.gamericefishpro.space.v0.e) lVar2.d).b(f0Var);
                        f0Var.i0 = true;
                    }
                }
                d();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        com.gamericefishpro.space.v0.e eVar = this.f;
        Object[] objArr = eVar.d;
        int i2 = eVar.i;
        int i3 = 0;
        while (i3 < i2) {
            a1 a1Var = ((f0) objArr[i3]).Z;
            q qVar = a1Var.c;
            boolean zG = g1.g(4194304);
            if (zG) {
                lVar = qVar.j0;
            } else {
                lVar = qVar.j0.w;
                if (lVar == null) {
                }
                i3++;
                i = 0;
            }
            com.gamericefishpro.space.o1.h0 h0Var = f1.f0;
            com.gamericefishpro.space.h1.l lVarM0 = qVar.M0(zG);
            while (lVarM0 != null && (lVarM0.v & 4194304) != 0) {
                if ((lVarM0.i & 4194304) != 0) {
                    ?? r12 = lVarM0;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof u) {
                            ((u) r12).z(a1Var.c);
                        } else {
                            if ((r12.i & 4194304) != 0 && (r12 instanceof j)) {
                                com.gamericefishpro.space.h1.l lVar3 = ((j) r12).I;
                                int i4 = i;
                                while (lVar3 != null) {
                                    if ((lVar3.i & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            E = r12;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            E = lVar3;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (E != 0) {
                                                eVar2.b(E);
                                                E = 0;
                                            }
                                            eVar2.b(lVar3);
                                        }
                                    } else {
                                        E = r12;
                                        eVar2 = eVar2;
                                    }
                                    lVar3 = lVar3.y;
                                    E = E;
                                    eVar2 = eVar2;
                                }
                                if (i4 == 1) {
                                    E = r12;
                                    eVar2 = eVar2;
                                }
                            }
                            i = 0;
                            r12 = E;
                            eVar2 = eVar2;
                        }
                        E = r12;
                        eVar2 = eVar2;
                        E = k.e(eVar2);
                        i = 0;
                        r12 = E;
                        eVar2 = eVar2;
                    }
                }
                if (lVarM0 == lVar) {
                    break;
                }
                lVarM0 = lVarM0.y;
                i = 0;
            }
            i3++;
            i = 0;
        }
        eVar.g();
    }

    public final void l() {
        com.gamericefishpro.space.a8.c cVar = this.b;
        if (cVar.q()) {
            f0 f0Var = this.a;
            if (!f0Var.H()) {
                com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!f0Var.I()) {
                com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                com.gamericefishpro.space.e2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((y1) ((com.gamericefishpro.space.vb.c) cVar.v).e).isEmpty() && !((y1) ((com.gamericefishpro.space.vb.c) cVar.e).e).isEmpty()) {
                        if (f0Var.B != null) {
                            o(f0Var, true);
                        } else {
                            n(f0Var);
                        }
                    }
                    o(f0Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean m(f0 f0Var, boolean z, boolean z2) {
        com.gamericefishpro.space.c3.a aVar;
        boolean zB;
        com.gamericefishpro.space.f2.t0 placementScope;
        q qVar;
        f0 f0VarV;
        r0 r0Var;
        g0 g0Var;
        boolean z3 = f0Var.k0;
        j0 j0Var = f0Var.a0;
        if (z3 || (!f0Var.I() && !j0Var.p.L && !i(f0Var) && !Intrinsics.a(f0Var.J(), Boolean.TRUE) && !h(f0Var) && !j0Var.p.P.e() && ((r0Var = j0Var.q) == null || (g0Var = r0Var.J) == null || !g0Var.e()))) {
            return false;
        }
        f0 f0Var2 = this.a;
        if (f0Var == f0Var2) {
            aVar = this.i;
            Intrinsics.b(aVar);
        } else {
            aVar = null;
        }
        if (z) {
            zB = j0Var.e ? b(f0Var, aVar) : false;
            if (z2 && ((zB || j0Var.f) && Intrinsics.a(f0Var.J(), Boolean.TRUE))) {
                f0Var.K();
            }
        } else {
            boolean zC = f0Var.q() ? c(f0Var, aVar) : false;
            if (z2 && f0Var.p() && (f0Var == f0Var2 || ((f0VarV = f0Var.v()) != null && f0VarV.I() && j0Var.p.L))) {
                if (f0Var == f0Var2) {
                    if (f0Var.W == d0.i) {
                        f0Var.f();
                    }
                    f0 f0VarV2 = f0Var.v();
                    if (f0VarV2 == null || (qVar = f0VarV2.Z.c) == null || (placementScope = qVar.E) == null) {
                        placementScope = ((com.gamericefishpro.space.i2.t) i0.a(f0Var)).getPlacementScope();
                    }
                    com.gamericefishpro.space.f2.t0.l(placementScope, j0Var.p, 0, 0);
                } else {
                    f0Var.R();
                }
                com.gamericefishpro.space.u6.l lVar = this.e;
                lVar.getClass();
                if (f0Var.j0 > 0) {
                    ((com.gamericefishpro.space.v0.e) lVar.d).b(f0Var);
                    f0Var.i0 = true;
                }
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(f0 f0Var) {
        com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
        Object[] objArr = eVarZ.d;
        int i = eVarZ.i;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.r() == d0.d || f0Var2.a0.p.P.e()) {
                if (k.o(f0Var2)) {
                    o(f0Var2, true);
                } else {
                    n(f0Var2);
                }
            }
        }
    }

    public final void o(f0 f0Var, boolean z) {
        com.gamericefishpro.space.c3.a aVar;
        if (f0Var.k0) {
            return;
        }
        if (f0Var == this.a) {
            aVar = this.i;
            Intrinsics.b(aVar);
        } else {
            aVar = null;
        }
        if (z) {
            b(f0Var, aVar);
        } else {
            c(f0Var, aVar);
        }
    }

    public final boolean p(f0 f0Var, boolean z) {
        int iOrdinal = f0Var.a0.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new s0(f0Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (!f0Var.q() || z) {
                    f0Var.a0.p.M = true;
                    if (!f0Var.k0 && (f0Var.I() || i(f0Var))) {
                        f0 f0VarV = f0Var.v();
                        if (f0VarV == null || !f0VarV.q()) {
                            this.b.c(f0Var, s.i);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        com.gamericefishpro.space.c3.a aVar = this.i;
        if (aVar == null ? false : com.gamericefishpro.space.c3.a.b(aVar.a, j)) {
            return;
        }
        if (this.c) {
            com.gamericefishpro.space.e2.a.a("updateRootConstraints called while measuring");
        }
        this.i = new com.gamericefishpro.space.c3.a(j);
        f0 f0Var = this.a;
        f0 f0Var2 = f0Var.B;
        j0 j0Var = f0Var.a0;
        if (f0Var2 != null) {
            j0Var.e = true;
        }
        j0Var.p.M = true;
        this.b.c(f0Var, f0Var2 != null ? s.d : s.i);
    }
}
