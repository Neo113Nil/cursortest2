package com.gamericefishpro.space.a2;

import com.gamericefishpro.space.c3.p;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.pi.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public j a;
    public j b;
    public l c = new b(0, this);
    public x d;

    /* JADX WARN: Code duplicated, block: B:78:0x0112  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c3, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0108, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, com.gamericefishpro.space.vh.c cVar) {
        c cVar2;
        int i;
        j jVar;
        j jVar2;
        c2 c2Var;
        a1 a1Var;
        long j3;
        c2 c2Var2;
        a1 a1Var2;
        ?? E;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.i = i2 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objK = cVar3.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i3 = cVar3.i;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(objK);
            j jVar3 = this.a;
            int i4 = 262144;
            if (jVar3 == null || !jVar3.G) {
                i = 262144;
                jVar = null;
            } else {
                if (!jVar3.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = jVar3.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar3);
                loop0: while (true) {
                    if (f0VarS == null) {
                        i = i4;
                        c2Var2 = null;
                        break;
                    }
                    if ((f0VarS.Z.f.v & i4) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & i4) != 0) {
                                ?? r14 = lVar;
                                ?? eVar = 0;
                                while (r14 != 0) {
                                    i = i4;
                                    if (r14 instanceof c2) {
                                        c2Var2 = (c2) r14;
                                        if (Intrinsics.a(jVar3.i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        if ((r14.i & i) != 0 && (r14 instanceof com.gamericefishpro.space.h2.j)) {
                                            com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) r14).I;
                                            int i5 = 0;
                                            while (lVar2 != null) {
                                                if ((lVar2.i & i) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        E = r14;
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
                                                    E = r14;
                                                    eVar = eVar;
                                                }
                                                lVar2 = lVar2.y;
                                                E = E;
                                                eVar = eVar;
                                            }
                                            if (i5 == 1) {
                                                E = r14;
                                                eVar = eVar;
                                            }
                                        }
                                        i4 = i;
                                        r14 = E;
                                        eVar = eVar;
                                    }
                                    E = r14;
                                    eVar = eVar;
                                    E = com.gamericefishpro.space.h2.k.e(eVar);
                                    i4 = i;
                                    r14 = E;
                                    eVar = eVar;
                                }
                            }
                            lVar = lVar.w;
                            i4 = i4;
                        }
                    }
                    int i6 = i4;
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var2 = f0VarS.Z) == null) ? null : a1Var2.e;
                    i4 = i6;
                }
                jVar = (j) c2Var2;
            }
            if (jVar == null) {
                j jVar4 = this.b;
                if (jVar4 != null) {
                    cVar3.i = 1;
                    objK = jVar4.k(j, j2, cVar3);
                } else {
                    j3 = 0;
                }
            } else {
                j jVar5 = this.a;
                if (jVar5 == null || !jVar5.G) {
                    jVar2 = null;
                } else {
                    if (!jVar5.d.G) {
                        com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                    }
                    com.gamericefishpro.space.h1.l lVar3 = jVar5.d.w;
                    f0 f0VarS2 = com.gamericefishpro.space.h2.k.s(jVar5);
                    loop3: while (true) {
                        if (f0VarS2 == null) {
                            c2Var = null;
                            break;
                        }
                        if ((f0VarS2.Z.f.v & i) != 0) {
                            while (lVar3 != null) {
                                if ((lVar3.i & i) != 0) {
                                    ?? E2 = lVar3;
                                    ?? eVar2 = 0;
                                    while (E2 != 0) {
                                        if (E2 instanceof c2) {
                                            c2 c2Var3 = (c2) E2;
                                            if (Intrinsics.a(jVar5.i(), c2Var3.i()) && j.class == c2Var3.getClass()) {
                                                c2Var = c2Var3;
                                                break loop3;
                                            }
                                        } else if ((E2.i & i) != 0 && (E2 instanceof com.gamericefishpro.space.h2.j)) {
                                            com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) E2).I;
                                            int i7 = 0;
                                            while (lVar4 != null) {
                                                if ((lVar4.i & i) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
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
                                            if (i7 == 1) {
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
                                lVar3 = lVar3.w;
                            }
                        }
                        f0VarS2 = f0VarS2.v();
                        lVar3 = (f0VarS2 == null || (a1Var = f0VarS2.Z) == null) ? null : a1Var.e;
                    }
                    jVar2 = (j) c2Var;
                }
                if (jVar2 != null) {
                    cVar3.i = 2;
                    objK = jVar2.k(j, j2, cVar3);
                } else {
                    j3 = 0;
                }
            }
        } else if (i3 == 1) {
            com.gamericefishpro.space.wa.b.P(objK);
            j3 = ((p) objK).a;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objK);
            j3 = ((p) objK).a;
        }
        return new p(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object b(long j, com.gamericefishpro.space.vh.c cVar) {
        d dVar;
        long j2;
        a1 a1Var;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.i = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objV = dVar.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objV);
            j jVar = this.a;
            j jVar2 = null;
            c2 c2Var = null;
            jVar2 = null;
            if (jVar != null && jVar.G) {
                if (!jVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = jVar.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar);
                loop0: while (f0VarS != null) {
                    if ((f0VarS.Z.f.v & 262144) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 262144) != 0) {
                                ?? eVar = 0;
                                ?? E = lVar;
                                while (E != 0) {
                                    if (E instanceof c2) {
                                        c2 c2Var2 = (c2) E;
                                        if (Intrinsics.a(jVar.i(), c2Var2.i()) && j.class == c2Var2.getClass()) {
                                            c2Var = c2Var2;
                                            break loop0;
                                        }
                                    } else if ((E.i & 262144) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
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
                jVar2 = (j) c2Var;
            }
            if (jVar2 != null) {
                dVar.i = 1;
                objV = jVar2.v(j, dVar);
                if (objV == aVar) {
                    return aVar;
                }
            } else {
                j2 = 0;
            }
            return new p(j2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.gamericefishpro.space.wa.b.P(objV);
        j2 = ((p) objV).a;
        return new p(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function0] */
    public final x c() {
        x xVar = (x) this.c.invoke();
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
