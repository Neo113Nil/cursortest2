package com.gamericefishpro.space.h2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public static final com.gamericefishpro.space.t.c0 a;

    static {
        com.gamericefishpro.space.t.c0 c0Var = com.gamericefishpro.space.t.m0.a;
        a = new com.gamericefishpro.space.t.c0();
    }

    public static final void a(com.gamericefishpro.space.h1.l lVar, int i, int i2) {
        if (!(lVar instanceof j)) {
            b(lVar, i & lVar.i, i2);
            return;
        }
        j jVar = (j) lVar;
        int i3 = jVar.H;
        b(lVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (com.gamericefishpro.space.h1.l lVar2 = jVar.I; lVar2 != null; lVar2 = lVar2.y) {
            a(lVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.gamericefishpro.space.h1.l lVar, int i, int i2) {
        if (i2 != 0 || lVar.p0()) {
            if ((i & 2) != 0 && (lVar instanceof v)) {
                k.k((v) lVar);
                if (i2 == 2) {
                    k.q(lVar, 2).W0();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                k.s(lVar).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                k.s(lVar).U(false);
            }
            if ((i & 256) != 0 && (lVar instanceof m)) {
                if (i2 == 1) {
                    f0 f0VarS = k.s(lVar);
                    f0VarS.a0(f0VarS.j0 + 1);
                } else if (i2 == 2) {
                    f0 f0VarS2 = k.s(lVar);
                    f0VarS2.a0(f0VarS2.j0 - 1);
                }
                if (i2 != 2) {
                    f0 f0VarS3 = k.s(lVar);
                    if (f0VarS3.j0 != 0 && !f0VarS3.p() && !f0VarS3.q() && !f0VarS3.i0) {
                        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) i0.a(f0VarS3);
                        com.gamericefishpro.space.u6.l lVar2 = tVar.q0.e;
                        lVar2.getClass();
                        if (f0VarS3.j0 > 0) {
                            ((com.gamericefishpro.space.v0.e) lVar2.d).b(f0VarS3);
                            f0VarS3.i0 = true;
                        }
                        tVar.G(null);
                    }
                }
            }
            if ((i & 4) != 0 && (lVar instanceof l)) {
                k.j((l) lVar);
            }
            if ((i & 8) != 0 && (lVar instanceof x1)) {
                k.s(lVar).L = true;
            }
            if ((i & 64) != 0 && (lVar instanceof r1)) {
                j0 j0Var = k.s((r1) lVar).a0;
                j0Var.p.I = true;
                r0 r0Var = j0Var.q;
                if (r0Var != null) {
                    r0Var.O = true;
                }
            }
            if ((i & 2048) != 0 && (lVar instanceof com.gamericefishpro.space.m1.p)) {
                com.gamericefishpro.space.m1.p pVar = (com.gamericefishpro.space.m1.p) lVar;
                c.b = null;
                pVar.o(c.a);
                if (c.b != null) {
                    com.gamericefishpro.space.h1.l lVar3 = (com.gamericefishpro.space.h1.l) pVar;
                    if (!lVar3.d.G) {
                        com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
                    }
                    com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                    com.gamericefishpro.space.h1.l lVar4 = lVar3.d;
                    com.gamericefishpro.space.h1.l lVar5 = lVar4.y;
                    if (lVar5 == null) {
                        k.b(eVar, lVar4);
                    } else {
                        eVar.b(lVar5);
                    }
                    while (true) {
                        int i3 = eVar.i;
                        if (i3 == 0) {
                            break;
                        }
                        com.gamericefishpro.space.h1.l lVarE = (com.gamericefishpro.space.h1.l) eVar.l(i3 - 1);
                        if ((lVarE.v & 1024) == 0) {
                            k.b(eVar, lVarE);
                        } else {
                            while (lVarE != null) {
                                if ((lVarE.i & 1024) != 0) {
                                    com.gamericefishpro.space.v0.e eVar2 = null;
                                    while (lVarE != null) {
                                        if (lVarE instanceof com.gamericefishpro.space.m1.u) {
                                            com.gamericefishpro.space.m1.u uVar = (com.gamericefishpro.space.m1.u) lVarE;
                                            com.gamericefishpro.space.m1.e eVar3 = ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) k.t(uVar)).getFocusOwner()).d;
                                            if (eVar3.c.a(uVar)) {
                                                eVar3.a();
                                            }
                                        } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof j)) {
                                            int i4 = 0;
                                            for (com.gamericefishpro.space.h1.l lVar6 = ((j) lVarE).I; lVar6 != null; lVar6 = lVar6.y) {
                                                if ((lVar6.i & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        lVarE = lVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                        }
                                                        if (lVarE != null) {
                                                            eVar2.b(lVarE);
                                                            lVarE = null;
                                                        }
                                                        eVar2.b(lVar6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        lVarE = k.e(eVar2);
                                    }
                                    break;
                                }
                                lVarE = lVarE.y;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(lVar instanceof b)) {
                return;
            }
            b bVar = (b) lVar;
            com.gamericefishpro.space.m1.e eVar4 = ((com.gamericefishpro.space.m1.k) ((com.gamericefishpro.space.i2.t) k.t(bVar)).getFocusOwner()).d;
            if (eVar4.d.a(bVar)) {
                eVar4.a();
            }
        }
    }

    public static final void c(com.gamericefishpro.space.h1.l lVar) {
        if (!lVar.G) {
            com.gamericefishpro.space.e2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(lVar, -1, 0);
    }

    public static final int d(com.gamericefishpro.space.h1.k kVar) {
        int i = kVar instanceof com.gamericefishpro.space.l1.g ? 5 : 1;
        if (kVar instanceof com.gamericefishpro.space.o2.b) {
            i |= 8;
        }
        if (kVar instanceof com.gamericefishpro.space.b2.v) {
            i |= 16;
        }
        if (kVar instanceof com.gamericefishpro.space.v.l) {
            i |= 64;
        }
        return kVar instanceof com.gamericefishpro.space.l2.a ? 524288 | i : i;
    }

    public static final int e(com.gamericefishpro.space.h1.l lVar) {
        int i = lVar.i;
        if (i != 0) {
            return i;
        }
        Class<?> cls = lVar.getClass();
        com.gamericefishpro.space.t.c0 c0Var = a;
        int iD = c0Var.d(cls);
        if (iD >= 0) {
            return c0Var.c[iD];
        }
        int i2 = lVar instanceof v ? 3 : 1;
        if (lVar instanceof l) {
            i2 |= 4;
        }
        if (lVar instanceof x1) {
            i2 |= 8;
        }
        if (lVar instanceof t1) {
            i2 |= 16;
        }
        if (lVar instanceof com.gamericefishpro.space.g2.c) {
            i2 |= 32;
        }
        if (lVar instanceof r1) {
            i2 |= 64;
        }
        if (lVar instanceof u) {
            i2 |= 4194432;
        }
        if (lVar instanceof m) {
            i2 |= 256;
        }
        if (lVar instanceof com.gamericefishpro.space.m1.u) {
            i2 |= 1024;
        }
        if (lVar instanceof com.gamericefishpro.space.m1.p) {
            i2 |= 2048;
        }
        if (lVar instanceof b) {
            i2 |= 4096;
        }
        if (lVar instanceof com.gamericefishpro.space.z1.b) {
            i2 |= 8192;
        }
        if (lVar instanceof com.gamericefishpro.space.i2.k) {
            i2 |= 16384;
        }
        if (lVar instanceof h) {
            i2 |= 32768;
        }
        if (lVar instanceof c2) {
            i2 |= 262144;
        }
        if (lVar instanceof com.gamericefishpro.space.l2.a) {
            i2 |= 524288;
        }
        if (lVar instanceof com.gamericefishpro.space.y1.c) {
            i2 |= 2097152;
        }
        if (lVar instanceof com.gamericefishpro.space.h0.q) {
            i2 |= 8388608;
        }
        c0Var.g(i2, cls);
        return i2;
    }

    public static final int f(com.gamericefishpro.space.h1.l lVar) {
        if (!(lVar instanceof j)) {
            return e(lVar);
        }
        j jVar = (j) lVar;
        int iF = jVar.H;
        for (com.gamericefishpro.space.h1.l lVar2 = jVar.I; lVar2 != null; lVar2 = lVar2.y) {
            iF |= f(lVar2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
