package com.gamericefishpro.space.a2;

import com.gamericefishpro.space.c3.p;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l implements c2, a {
    public a H;
    public e I;
    public j J;
    public final String K = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public j(a aVar, e eVar) {
        this.H = aVar;
        this.I = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
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
    /* JADX WARN: Type inference failed for: r7v7 */
    public final x A0() {
        j jVar;
        c2 c2Var;
        a1 a1Var;
        if (this.G) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            l lVar = this.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            loop0: while (true) {
                if (f0VarS == null) {
                    c2Var = null;
                    break;
                }
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 262144) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2Var = (c2) E;
                                    if (Intrinsics.a(i(), c2Var.i()) && j.class == c2Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i = 0;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new l[16]);
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
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
            }
            jVar = (j) c2Var;
        } else {
            jVar = null;
        }
        x xVarA0 = jVar != null ? jVar.A0() : null;
        if (xVarA0 != null && a0.r(xVarA0)) {
            return xVarA0;
        }
        x xVar = this.I.d;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.a2.j] */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // com.gamericefishpro.space.a2.a
    public final long H(int i, long j, long j2) {
        a1 a1Var;
        long jH = this.H.H(i, j, j2);
        boolean z = this.G;
        c2 c2Var = null;
        if (z && z) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            l lVar = this.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            loop0: while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 262144) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2 c2Var2 = (c2) E;
                                    if (Intrinsics.a(i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                        c2Var = c2Var2;
                                        break loop0;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i2 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new l[16]);
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
                                    if (i2 == 1) {
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
            c2Var = (j) c2Var;
        }
        ?? r0 = c2Var;
        return com.gamericefishpro.space.n1.b.e(jH, r0 != 0 ? r0.H(i, com.gamericefishpro.space.n1.b.e(j, jH), com.gamericefishpro.space.n1.b.d(j2, jH)) : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.gamericefishpro.space.a2.a
    public final long c0(int i, long j) {
        a1 a1Var;
        boolean z = this.G;
        j jVar = null;
        c2 c2Var = null;
        jVar = null;
        if (z && z) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            l lVar = this.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            loop0: while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 262144) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2 c2Var2 = (c2) E;
                                    if (Intrinsics.a(i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                        c2Var = c2Var2;
                                        break loop0;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i2 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new l[16]);
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
                                    if (i2 == 1) {
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
            jVar = (j) c2Var;
        }
        long jC0 = jVar != null ? jVar.c0(i, j) : 0L;
        return com.gamericefishpro.space.n1.b.e(jC0, this.H.c0(i, com.gamericefishpro.space.n1.b.d(j, jC0)));
    }

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return this.K;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.gamericefishpro.space.a2.a
    public final Object k(long j, long j2, com.gamericefishpro.space.th.a aVar) {
        h hVar;
        long j3;
        long j4;
        long j5;
        j jVar;
        long j6;
        long j7;
        c2 c2Var;
        a1 a1Var;
        int i;
        ?? r16;
        ?? E;
        int i2;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i3 = hVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.w = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, (com.gamericefishpro.space.vh.c) aVar);
            }
        } else {
            hVar = new h(this, (com.gamericefishpro.space.vh.c) aVar);
        }
        h hVar2 = hVar;
        Object objK = hVar2.i;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i4 = hVar2.w;
        int i5 = 1;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(objK);
            a aVar3 = this.H;
            hVar2.d = j;
            hVar2.e = j2;
            hVar2.w = 1;
            objK = aVar3.k(j, j2, hVar2);
            if (objK != aVar2) {
                j3 = j;
                j4 = j2;
            }
            return aVar2;
        }
        if (i4 == 1) {
            j4 = hVar2.e;
            j3 = hVar2.d;
            com.gamericefishpro.space.wa.b.P(objK);
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = hVar2.d;
            com.gamericefishpro.space.wa.b.P(objK);
        }
        j6 = ((p) objK).a;
        j5 = j7;
        return new p(p.e(j5, j6));
        j5 = ((p) objK).a;
        boolean z = this.G;
        if (!z) {
            jVar = this.J;
        } else if (z && z) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            l lVar = this.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            loop0: while (true) {
                if (f0VarS == null) {
                    c2Var = null;
                    break;
                }
                int i6 = 262144;
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & i6) != 0) {
                            ?? r14 = lVar;
                            ?? r17 = 0;
                            while (r14 != 0) {
                                if (r14 instanceof c2) {
                                    c2 c2Var2 = (c2) r14;
                                    i = i6;
                                    if (Intrinsics.a(i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                        c2Var = c2Var2;
                                        break loop0;
                                    }
                                } else {
                                    i = i6;
                                    if ((r14.i & i) != 0 && (r14 instanceof com.gamericefishpro.space.h2.j)) {
                                        l lVar2 = ((com.gamericefishpro.space.h2.j) r14).I;
                                        int i7 = 0;
                                        while (lVar2 != null) {
                                            if ((lVar2.i & i) != 0) {
                                                i7++;
                                                if (i7 == i5) {
                                                    E = r14;
                                                    r16 = r17;
                                                    E = lVar2;
                                                } else {
                                                    ?? eVar = r16 == 0 ? new com.gamericefishpro.space.v0.e(new l[16]) : r16;
                                                    if (E != 0) {
                                                        eVar.b(E);
                                                        E = 0;
                                                    }
                                                    eVar.b(lVar2);
                                                    r16 = eVar;
                                                }
                                            } else {
                                                E = r14;
                                                r16 = r17;
                                            }
                                            lVar2 = lVar2.y;
                                            i5 = 1;
                                            E = E;
                                            r16 = r16;
                                        }
                                        E = r14;
                                        r16 = r17;
                                        i2 = i5;
                                        r16 = r16;
                                        if (i7 == i2) {
                                        }
                                        i6 = i;
                                        i5 = i2;
                                        r14 = E;
                                        r17 = r16;
                                    }
                                    E = com.gamericefishpro.space.h2.k.e(r16);
                                    i6 = i;
                                    i5 = i2;
                                    r14 = E;
                                    r17 = r16;
                                }
                                i2 = i5;
                                r16 = r17;
                                E = com.gamericefishpro.space.h2.k.e(r16);
                                i6 = i;
                                i5 = i2;
                                r14 = E;
                                r17 = r16;
                            }
                        }
                        lVar = lVar.w;
                        i6 = i6;
                        i5 = i5;
                    }
                }
                int i8 = i5;
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                i5 = i8;
            }
            jVar = (j) c2Var;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            long jE = p.e(j3, j5);
            long jD = p.d(j4, j5);
            hVar2.d = j5;
            hVar2.w = 2;
            objK = jVar.k(jE, jD, hVar2);
            if (objK != aVar2) {
                j7 = j5;
                j6 = ((p) objK).a;
                j5 = j7;
            }
            return aVar2;
        }
        j6 = 0;
        return new p(p.e(j5, j6));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        e eVar = this.I;
        eVar.a = this;
        eVar.b = null;
        this.J = null;
        eVar.c = new b(1, this);
        eVar.d = o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.gamericefishpro.space.h1.l] */
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
    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        a1 a1Var;
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        k kVar = new k(a0Var, 0);
        j jVar = this;
        if (!jVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        l lVar = jVar.d.w;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
        loop0: while (f0VarS != null) {
            if ((f0VarS.Z.f.v & 262144) != 0) {
                while (lVar != null) {
                    if ((lVar.i & 262144) != 0) {
                        ?? E = lVar;
                        ?? eVar = 0;
                        while (E != 0) {
                            boolean zBooleanValue = true;
                            if (E instanceof c2) {
                                c2 c2Var = (c2) E;
                                if (Intrinsics.a(i(), c2Var.i()) && getClass() == c2Var.getClass()) {
                                    zBooleanValue = ((Boolean) kVar.invoke(c2Var)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    break loop0;
                                }
                            } else {
                                if (((E.i & 262144) != 0) && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i = 0;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            E = E;
                                            eVar = eVar;
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new l[16]);
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
        j jVar2 = (j) ((c2) a0Var.d);
        this.J = jVar2;
        e eVar2 = this.I;
        eVar2.b = jVar2;
        if (eVar2.a == this) {
            eVar2.a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        if (r3 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // com.gamericefishpro.space.a2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(long j, com.gamericefishpro.space.th.a aVar) {
        i iVar;
        long j2;
        a1 a1Var;
        long j3;
        long j4 = j;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i = iVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.v = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, (com.gamericefishpro.space.vh.c) aVar);
            }
        } else {
            iVar = new i(this, (com.gamericefishpro.space.vh.c) aVar);
        }
        Object objV = iVar.e;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = iVar.v;
        if (i2 != 0) {
            if (i2 == 1) {
                j4 = iVar.d;
                com.gamericefishpro.space.wa.b.P(objV);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = iVar.d;
                com.gamericefishpro.space.wa.b.P(objV);
            }
            return new p(p.e(j3, ((p) objV).a));
        }
        com.gamericefishpro.space.wa.b.P(objV);
        boolean z = this.G;
        j jVar = null;
        c2 c2Var = null;
        jVar = null;
        if (z && z) {
            if (!this.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            l lVar = this.d.w;
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
            loop0: while (f0VarS != null) {
                if ((f0VarS.Z.f.v & 262144) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 262144) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof c2) {
                                    c2 c2Var2 = (c2) E;
                                    if (Intrinsics.a(i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                        c2Var = c2Var2;
                                        break loop0;
                                    }
                                } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i3 = 0;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new l[16]);
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
                        lVar = lVar.w;
                    }
                }
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
            }
            jVar = (j) c2Var;
        }
        if (jVar != null) {
            iVar.d = j4;
            iVar.v = 1;
            objV = jVar.v(j4, iVar);
        } else {
            j2 = 0;
            a aVar3 = this.H;
            long jD = p.d(j4, j2);
            iVar.d = j2;
            iVar.v = 2;
            objV = aVar3.v(jD, iVar);
            if (objV != aVar2) {
                j3 = j2;
                return new p(p.e(j3, ((p) objV).a));
            }
        }
        return aVar2;
        j2 = ((p) objV).a;
        a aVar4 = this.H;
        long jD2 = p.d(j4, j2);
        iVar.d = j2;
        iVar.v = 2;
        objV = aVar4.v(jD2, iVar);
        if (objV != aVar2) {
            j3 = j2;
            return new p(p.e(j3, ((p) objV).a));
        }
        return aVar2;
    }
}
