package com.gamericefishpro.space.w;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final k a = new k(Float.POSITIVE_INFINITY);
    public static final l b = new l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final m c = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final n d = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final k e = new k(Float.NEGATIVE_INFINITY);
    public static final l f = new l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final m g = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final n h = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] i = new float[91];
    public static final com.gamericefishpro.space.u6.l j = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(12), new com.gamericefishpro.space.r2.z(29));
    public static final com.gamericefishpro.space.u6.l k = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(13), new com.gamericefishpro.space.r2.z(14));
    public static final com.gamericefishpro.space.u6.l l = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(15), new com.gamericefishpro.space.r2.z(16));
    public static final com.gamericefishpro.space.u6.l m = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(17), new com.gamericefishpro.space.r2.z(18));
    public static final com.gamericefishpro.space.u6.l n = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(19), new com.gamericefishpro.space.r2.z(20));
    public static final com.gamericefishpro.space.u6.l o = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(21), new com.gamericefishpro.space.r2.z(22));
    public static final com.gamericefishpro.space.u6.l p = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(23), new com.gamericefishpro.space.r2.z(24));
    public static final com.gamericefishpro.space.u6.l q = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(25), new com.gamericefishpro.space.r2.z(26));
    public static final com.gamericefishpro.space.u6.l r = new com.gamericefishpro.space.u6.l(new com.gamericefishpro.space.r2.z(27), new com.gamericefishpro.space.r2.z(28));

    public static b a(float f2) {
        return new b(Float.valueOf(f2), j, Float.valueOf(0.01f));
    }

    public static j b(int i2, float f2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new j(j, Float.valueOf(0.0f), new k(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object c(j jVar, e eVar, long j2, final Function1 function1, com.gamericefishpro.space.vh.c cVar) {
        b1 b1Var;
        final com.gamericefishpro.space.ei.a0 a0Var;
        final j jVar2;
        j jVar3;
        com.gamericefishpro.space.ei.a0 a0Var2;
        Object objE;
        Function1 function2;
        h hVar;
        h hVar2;
        Object objE2;
        final e eVar2 = eVar;
        com.gamericefishpro.space.i2.j1 j1Var = com.gamericefishpro.space.i2.j1.d;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i2 = b1Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1Var.y = i2 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(cVar);
            }
        } else {
            b1Var = new b1(cVar);
        }
        b1 b1Var2 = b1Var;
        Object obj = b1Var2.w;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i3 = b1Var2.y;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            final Object objB = eVar2.b(0L);
            final o oVarF = eVar2.f(0L);
            a0Var = new com.gamericefishpro.space.ei.a0();
            if (j2 == Long.MIN_VALUE) {
                try {
                    final float fK = k(b1Var2.getContext());
                    jVar2 = jVar;
                    try {
                        Function1 function3 = new Function1() { // from class: com.gamericefishpro.space.w.y0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                e eVar3 = eVar2;
                                com.gamericefishpro.space.u6.l lVarD = eVar3.d();
                                Object objE3 = eVar3.e();
                                j jVar4 = jVar2;
                                h hVar3 = new h(objB, lVarD, oVarF, jLongValue, objE3, jLongValue, new z0(jVar4, 1));
                                c.j(hVar3, jLongValue, fK, eVar3, jVar4, function1);
                                a0Var.d = hVar3;
                                return Unit.a;
                            }
                        };
                        a0Var2 = a0Var;
                        try {
                            b1Var2.d = jVar2;
                            b1Var2.e = eVar2;
                            b1Var2.i = function1;
                            b1Var2.v = a0Var2;
                            b1Var2.y = 1;
                            if (!eVar2.a()) {
                                objE = com.gamericefishpro.space.t0.i.s(b1Var2.getContext()).E(new com.gamericefishpro.space.f1.o(1, function3), b1Var2);
                            } else {
                                if (b1Var2.getContext().j(j1Var) != null) {
                                    throw new ClassCastException();
                                }
                                objE = com.gamericefishpro.space.t0.i.s(b1Var2.getContext()).E(function3, b1Var2);
                            }
                            if (objE != aVar) {
                                jVar3 = jVar2;
                                function2 = function1;
                                a0Var = a0Var2;
                            }
                            return aVar;
                        } catch (CancellationException e2) {
                            e = e2;
                            jVar3 = jVar2;
                            a0Var = a0Var2;
                            hVar = (h) a0Var.d;
                            if (hVar != null) {
                                hVar.i.setValue(Boolean.FALSE);
                            }
                            hVar2 = (h) a0Var.d;
                            if (hVar2 != null && hVar2.g == jVar3.v) {
                                jVar3.y = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        jVar3 = jVar2;
                        hVar = (h) a0Var.d;
                        if (hVar != null) {
                            hVar.i.setValue(Boolean.FALSE);
                        }
                        hVar2 = (h) a0Var.d;
                        if (hVar2 != null) {
                            jVar3.y = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    jVar2 = jVar;
                }
            } else {
                a0Var2 = a0Var;
                try {
                    h hVar3 = new h(objB, eVar2.d(), oVarF, j2, eVar2.e(), j2, new z0(jVar, 0));
                    j(hVar3, j2, k(b1Var2.getContext()), eVar2, jVar, function1);
                    a0Var2.d = hVar3;
                    jVar3 = jVar;
                    eVar2 = eVar;
                    function2 = function1;
                    a0Var = a0Var2;
                } catch (CancellationException e5) {
                    e = e5;
                    jVar3 = jVar;
                    a0Var = a0Var2;
                    hVar = (h) a0Var.d;
                    if (hVar != null) {
                        hVar.i.setValue(Boolean.FALSE);
                    }
                    hVar2 = (h) a0Var.d;
                    if (hVar2 != null) {
                        jVar3.y = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = b1Var2.v;
            function2 = b1Var2.i;
            eVar2 = b1Var2.e;
            jVar3 = b1Var2.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (CancellationException e6) {
                e = e6;
                hVar = (h) a0Var.d;
                if (hVar != null) {
                    hVar.i.setValue(Boolean.FALSE);
                }
                hVar2 = (h) a0Var.d;
                if (hVar2 != null) {
                    jVar3.y = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = a0Var.d;
            Intrinsics.b(obj2);
            if (!((Boolean) ((h) obj2).i.getValue()).booleanValue()) {
                return Unit.a;
            }
            final float fK2 = k(b1Var2.getContext());
            final com.gamericefishpro.space.ei.a0 a0Var3 = a0Var;
            final Function1 function4 = function2;
            final e eVar3 = eVar2;
            final j jVar4 = jVar3;
            try {
                Function1 function5 = new Function1() { // from class: com.gamericefishpro.space.w.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = a0Var3.d;
                        Intrinsics.b(obj4);
                        c.j((h) obj4, jLongValue, fK2, eVar3, jVar4, function4);
                        return Unit.a;
                    }
                };
                a0Var = a0Var3;
                eVar2 = eVar3;
                jVar3 = jVar4;
                function2 = function4;
                b1Var2.d = jVar3;
                b1Var2.e = eVar2;
                b1Var2.i = function2;
                b1Var2.v = a0Var;
                b1Var2.y = 2;
                if (!eVar2.a()) {
                    objE2 = com.gamericefishpro.space.t0.i.s(b1Var2.getContext()).E(new com.gamericefishpro.space.f1.o(1, function5), b1Var2);
                } else {
                    if (b1Var2.getContext().j(j1Var) != null) {
                        throw new ClassCastException();
                    }
                    objE2 = com.gamericefishpro.space.t0.i.s(b1Var2.getContext()).E(function5, b1Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                a0Var = a0Var3;
                jVar3 = jVar4;
                hVar = (h) a0Var.d;
                if (hVar != null) {
                    hVar.i.setValue(Boolean.FALSE);
                }
                hVar2 = (h) a0Var.d;
                if (hVar2 != null) {
                    jVar3.y = false;
                }
                throw e;
            }
        } while (objE2 != aVar);
        return aVar;
    }

    public static Object d(float f2, float f3, o1 o1Var, Function2 function2, com.gamericefishpro.space.vh.i iVar, int i2) {
        i iVarN = o1Var;
        if ((i2 & 8) != 0) {
            iVarN = n(0.0f, 0.0f, null, 7);
        }
        i iVar2 = iVarN;
        Float f4 = new Float(f2);
        Float f5 = new Float(f3);
        Float f6 = new Float(0.0f);
        com.gamericefishpro.space.u6.l lVar = j;
        Function1 function1 = (Function1) lVar.d;
        o oVarC = (o) function1.invoke(f6);
        if (oVarC == null) {
            oVarC = ((o) function1.invoke(f4)).c();
        }
        o oVar = oVarC;
        Object objC = c(new j(lVar, f4, oVar, 56), new c1(iVar2, lVar, f4, f5, oVar), Long.MIN_VALUE, new com.gamericefishpro.space.a7.c(29, function2), iVar);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objC != aVar) {
            objC = Unit.a;
        }
        return objC == aVar ? objC : Unit.a;
    }

    public static final z e(b0 b0Var, float f2, float f3, y yVar, String str, com.gamericefishpro.space.t0.r rVar, int i2) {
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        int i3 = i2 << 3;
        return g(b0Var, fValueOf, fValueOf2, j, yVar, str, rVar, (i2 & 1022) | (57344 & i3) | (i3 & 458752));
    }

    public static final Object f(j jVar, Float f2, u uVar, Function1 function1, com.gamericefishpro.space.vh.i iVar) {
        Object objC = c(jVar, new c1(uVar, jVar.d, jVar.e.getValue(), f2, jVar.i), jVar.v, function1, iVar);
        return objC == com.gamericefishpro.space.uh.a.d ? objC : Unit.a;
    }

    public static final z g(b0 b0Var, Comparable comparable, Comparable comparable2, com.gamericefishpro.space.u6.l lVar, y yVar, String str, com.gamericefishpro.space.t0.r rVar, int i2) {
        b0 b0Var2;
        final Comparable comparable3;
        final Comparable comparable4;
        final y yVar2;
        Object objP = rVar.P();
        com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
        if (objP == fVar) {
            b0Var2 = b0Var;
            comparable3 = comparable;
            comparable4 = comparable2;
            yVar2 = yVar;
            z zVar = new z(b0Var2, comparable3, comparable4, lVar, yVar2);
            rVar.k0(zVar);
            objP = zVar;
        } else {
            b0Var2 = b0Var;
            comparable3 = comparable;
            comparable4 = comparable2;
            yVar2 = yVar;
        }
        final z zVar2 = (z) objP;
        boolean z = true;
        boolean z2 = ((((i2 & 112) ^ 48) > 32 && rVar.h(comparable3)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && rVar.h(comparable4)) || (i2 & 384) == 256);
        if ((((57344 & i2) ^ 24576) <= 16384 || !rVar.h(yVar2)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP2 = rVar.P();
        if (z3 || objP2 == fVar) {
            objP2 = new Function0() { // from class: com.gamericefishpro.space.w.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    z zVar3 = zVar2;
                    Comparable comparable5 = zVar3.d;
                    Comparable comparable6 = comparable3;
                    boolean zEquals = comparable6.equals(comparable5);
                    Comparable comparable7 = comparable4;
                    if (!zEquals || !comparable7.equals(zVar3.e)) {
                        zVar3.d = comparable6;
                        zVar3.e = comparable7;
                        zVar3.w = new c1(yVar2, zVar3.i, comparable6, comparable7, null);
                        zVar3.B.b.setValue(Boolean.TRUE);
                        zVar3.y = false;
                        zVar3.z = true;
                    }
                    return Unit.a;
                }
            };
            rVar.k0(objP2);
        }
        com.gamericefishpro.space.t0.i.g((Function0) objP2, rVar);
        boolean zH = rVar.h(b0Var2);
        Object objP3 = rVar.P();
        if (zH || objP3 == fVar) {
            objP3 = new com.gamericefishpro.space.d0.q0(25, b0Var2, zVar2);
            rVar.k0(objP3);
        }
        com.gamericefishpro.space.t0.i.d(zVar2, (Function1) objP3, rVar);
        return zVar2;
    }

    public static final o h(o oVar) {
        o oVarC = oVar.c();
        int iB = oVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            oVarC.e(i2, oVar.a(i2));
        }
        return oVarC;
    }

    public static j i(j jVar, float f2) {
        float f3 = ((k) jVar.i).a;
        return new j(jVar.d, Float.valueOf(f2), new k(f3), jVar.v, jVar.w, jVar.y);
    }

    public static final void j(h hVar, long j2, float f2, e eVar, j jVar, Function1 function1) {
        long jC = f2 == 0.0f ? eVar.c() : (long) ((j2 - hVar.c) / f2);
        hVar.g = j2;
        hVar.e.setValue(eVar.b(jC));
        hVar.f = eVar.f(jC);
        if (eVar.g(jC)) {
            hVar.h = hVar.g;
            hVar.i.setValue(Boolean.FALSE);
        }
        p(hVar, jVar);
        function1.invoke(hVar);
    }

    public static final float k(CoroutineContext coroutineContext) {
        com.gamericefishpro.space.h1.n nVar = (com.gamericefishpro.space.h1.n) coroutineContext.j(com.gamericefishpro.space.h1.b.I);
        float F = nVar != null ? nVar.F() : 1.0f;
        if (F >= 0.0f) {
            return F;
        }
        i0.b("negative scale factor");
        return F;
    }

    public static y l(o1 o1Var, j0 j0Var) {
        return new y(o1Var, j0Var, 0);
    }

    public static final b0 m(String str, com.gamericefishpro.space.t0.r rVar) {
        Object objP = rVar.P();
        if (objP == com.gamericefishpro.space.t0.n.a) {
            objP = new b0();
            rVar.k0(objP);
        }
        b0 b0Var = (b0) objP;
        b0Var.a(rVar, 0);
        return b0Var;
    }

    public static v0 n(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new v0(f2, f3, obj);
    }

    public static o1 o(int i2, int i3, s sVar) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            sVar = t.a;
        }
        return new o1(i2, i4, sVar);
    }

    public static final void p(h hVar, j jVar) {
        jVar.e.setValue(hVar.e.getValue());
        o oVar = jVar.i;
        o oVar2 = hVar.f;
        int iB = oVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            oVar.e(i2, oVar2.a(i2));
        }
        jVar.w = hVar.h;
        jVar.v = hVar.g;
        jVar.y = ((Boolean) hVar.i.getValue()).booleanValue();
    }
}
