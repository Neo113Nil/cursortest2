package com.gamericefishpro.space.z;

import android.view.ViewTreeObserver;
import com.gamericefishpro.space.h2.c2;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {
    public k1 a;
    public com.gamericefishpro.space.y.l b;
    public k c;
    public v0 d;
    public boolean e;
    public com.gamericefishpro.space.a2.e f;
    public final j1 g;
    public final f1 h;
    public boolean i;
    public int j = 1;
    public x0 k = d1.b;
    public final o1 l = new o1(this);
    public final com.gamericefishpro.space.w.m1 m = new com.gamericefishpro.space.w.m1(6, this);

    public q1(k1 k1Var, com.gamericefishpro.space.y.l lVar, k kVar, v0 v0Var, boolean z, com.gamericefishpro.space.a2.e eVar, j1 j1Var, f1 f1Var) {
        this.a = k1Var;
        this.b = lVar;
        this.c = kVar;
        this.d = v0Var;
        this.e = z;
        this.f = eVar;
        this.g = j1Var;
        this.h = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, com.gamericefishpro.space.vh.c cVar) {
        l1 l1Var;
        q1 q1Var;
        Throwable th;
        com.gamericefishpro.space.ei.z zVar;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i = l1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1Var.v = i - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object obj = l1Var.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = l1Var.v;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = l1Var.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                q1Var = this;
                q1Var.i = false;
                return new com.gamericefishpro.space.c3.p(zVar.d);
            } catch (Throwable th2) {
                th = th2;
                q1Var = this;
                q1Var.i = false;
                throw th;
            }
        }
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.ei.z zVar2 = new com.gamericefishpro.space.ei.z();
        zVar2.d = j;
        this.i = true;
        try {
            com.gamericefishpro.space.y.r0 r0Var = com.gamericefishpro.space.y.r0.d;
            q1Var = this;
            try {
                n1 n1Var = new n1(q1Var, zVar2, j, null);
                l1Var.d = zVar2;
                l1Var.v = 1;
                if (f(r0Var, n1Var, l1Var) == aVar) {
                    return aVar;
                }
                zVar = zVar2;
                q1Var.i = false;
                return new com.gamericefishpro.space.c3.p(zVar.d);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                q1Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            q1Var = this;
        }
    }

    public final Object b(long j, boolean z, com.gamericefishpro.space.vh.i iVar) {
        if (z) {
            k kVar = this.c;
            com.gamericefishpro.space.x7.e eVar = d1.a;
            if (kVar != null) {
                return Unit.a;
            }
        }
        long jA = com.gamericefishpro.space.c3.p.a(j, 0.0f, 0.0f, this.d == v0.e ? 1 : 2);
        p1 p1Var = new p1(this, null);
        com.gamericefishpro.space.y.l lVar = this.b;
        if (lVar != null && (this.a.c() || this.a.a())) {
            Object objB = lVar.b(jA, p1Var, iVar);
            return objB == com.gamericefishpro.space.uh.a.d ? objB : Unit.a;
        }
        p1 p1Var2 = new p1(this, iVar);
        p1Var2.i = jA;
        Unit unit = Unit.a;
        Object objInvokeSuspend = p1Var2.invokeSuspend(unit);
        return objInvokeSuspend == com.gamericefishpro.space.uh.a.d ? objInvokeSuspend : unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.gamericefishpro.space.v0.e] */
    public final long c(x0 x0Var, long j, int i) {
        int i2;
        com.gamericefishpro.space.a2.j jVar;
        com.gamericefishpro.space.a2.j jVar2;
        long j2;
        long jH;
        c2 c2Var;
        com.gamericefishpro.space.h2.a1 a1Var;
        ?? E;
        c2 c2Var2;
        com.gamericefishpro.space.h2.a1 a1Var2;
        ?? E2;
        com.gamericefishpro.space.a2.j jVar3 = this.f.a;
        int i3 = 262144;
        int i4 = 1;
        Object obj = null;
        if (jVar3 == null || !jVar3.G) {
            i2 = 262144;
            jVar = null;
        } else {
            if (!jVar3.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar = jVar3.d.w;
            com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(jVar3);
            loop0: while (true) {
                if (f0VarS == null) {
                    i2 = i3;
                    c2Var2 = null;
                    break;
                }
                if ((f0VarS.Z.f.v & i3) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & i3) != 0) {
                            ?? eVar = 0;
                            ?? r13 = lVar;
                            while (r13 != 0) {
                                if (r13 instanceof c2) {
                                    c2Var2 = (c2) r13;
                                    i2 = i3;
                                    if (Intrinsics.a(jVar3.i(), c2Var2.i()) && com.gamericefishpro.space.a2.j.class == c2Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                    if ((r13.i & i2) != 0 && (r13 instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) r13).I;
                                        int i5 = 0;
                                        while (lVar2 != null) {
                                            if ((lVar2.i & i2) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    E2 = r13;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    E2 = lVar2;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (E2 != 0) {
                                                        eVar.b(E2);
                                                        E2 = 0;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            } else {
                                                E2 = r13;
                                                eVar = eVar;
                                            }
                                            lVar2 = lVar2.y;
                                            E2 = E2;
                                            eVar = eVar;
                                        }
                                        if (i5 == 1) {
                                            E2 = r13;
                                            eVar = eVar;
                                        }
                                    }
                                    i3 = i2;
                                    r13 = E2;
                                    eVar = eVar;
                                }
                                E2 = r13;
                                eVar = eVar;
                                E2 = com.gamericefishpro.space.h2.k.e(eVar);
                                i3 = i2;
                                r13 = E2;
                                eVar = eVar;
                            }
                        }
                        lVar = lVar.w;
                        i3 = i3;
                    }
                }
                int i6 = i3;
                f0VarS = f0VarS.v();
                lVar = (f0VarS == null || (a1Var2 = f0VarS.Z) == null) ? null : a1Var2.e;
                i3 = i6;
            }
            jVar = (com.gamericefishpro.space.a2.j) c2Var2;
        }
        long jC0 = jVar != null ? jVar.c0(i, j) : 0L;
        long jD = com.gamericefishpro.space.n1.b.d(j, jC0);
        long jE = e(h(x0Var.a(g(e(this.d == v0.e ? com.gamericefishpro.space.n1.b.a(1, jD) : com.gamericefishpro.space.n1.b.a(2, jD))))));
        j1 j1Var = this.g;
        if (j1Var.G) {
            ViewTreeObserver viewTreeObserver = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(j1Var)).getViewTreeObserver();
            try {
                if (com.gamericefishpro.space.i2.t.h1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    com.gamericefishpro.space.i2.t.h1 = declaredMethod;
                }
                Method method = com.gamericefishpro.space.i2.t.h1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jD2 = com.gamericefishpro.space.n1.b.d(jD, jE);
        com.gamericefishpro.space.a2.j jVar4 = this.f.a;
        if (jVar4 == null || !jVar4.G) {
            jVar2 = null;
        } else {
            if (!jVar4.d.G) {
                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
            }
            com.gamericefishpro.space.h1.l lVar3 = jVar4.d.w;
            com.gamericefishpro.space.h2.f0 f0VarS2 = com.gamericefishpro.space.h2.k.s(jVar4);
            loop3: while (true) {
                if (f0VarS2 == null) {
                    c2Var = null;
                    break;
                }
                if ((f0VarS2.Z.f.v & i2) != 0) {
                    while (lVar3 != null) {
                        if ((lVar3.i & i2) != 0) {
                            ?? r7 = lVar3;
                            ?? eVar2 = obj;
                            while (r7 != 0) {
                                if (r7 instanceof c2) {
                                    c2 c2Var3 = (c2) r7;
                                    if (Intrinsics.a(jVar4.i(), c2Var3.i()) && com.gamericefishpro.space.a2.j.class == c2Var3.getClass()) {
                                        c2Var = c2Var3;
                                        break loop3;
                                    }
                                } else {
                                    if ((r7.i & i2) != 0 && (r7 instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar4 = ((com.gamericefishpro.space.h2.j) r7).I;
                                        int i7 = 0;
                                        while (lVar4 != null) {
                                            if ((lVar4.i & i2) == 0) {
                                                E = r7;
                                                eVar2 = eVar2;
                                                E = E;
                                            } else {
                                                i7++;
                                                if (i7 == i4) {
                                                    E = r7;
                                                    eVar2 = eVar2;
                                                    E = E;
                                                    E = lVar4;
                                                    E = r7;
                                                    eVar2 = eVar2;
                                                    E = E;
                                                } else {
                                                    eVar2 = eVar2 == 0 ? new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]) : eVar2;
                                                    if (E != 0) {
                                                        eVar2.b(E);
                                                        E = 0;
                                                    }
                                                    eVar2.b(lVar4);
                                                }
                                            }
                                            lVar4 = lVar4.y;
                                            i4 = 1;
                                            E = E;
                                            eVar2 = eVar2;
                                        }
                                        if (i7 == i4) {
                                            E = r7;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    r7 = E;
                                    eVar2 = eVar2;
                                }
                                E = r7;
                                eVar2 = eVar2;
                                E = com.gamericefishpro.space.h2.k.e(eVar2);
                                r7 = E;
                                eVar2 = eVar2;
                            }
                        }
                        lVar3 = lVar3.w;
                        obj = null;
                    }
                }
                f0VarS2 = f0VarS2.v();
                lVar3 = (f0VarS2 == null || (a1Var = f0VarS2.Z) == null) ? null : a1Var.e;
                obj = null;
            }
            jVar2 = (com.gamericefishpro.space.a2.j) c2Var;
        }
        if (jVar2 != null) {
            jH = jVar2.H(i, jE, jD2);
            j2 = jE;
        } else {
            j2 = jE;
            jH = 0;
        }
        return com.gamericefishpro.space.n1.b.e(com.gamericefishpro.space.n1.b.e(jC0, j2), jH);
    }

    public final float d(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long e(long j) {
        return this.e ? com.gamericefishpro.space.n1.b.f(j, -1.0f) : j;
    }

    public final Object f(com.gamericefishpro.space.y.r0 r0Var, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        Object objD = this.a.d(r0Var, new com.gamericefishpro.space.db.d(this, function2, null, 22), cVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == v0.e ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == v0.e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.d == v0.d) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.d == v0.e) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
