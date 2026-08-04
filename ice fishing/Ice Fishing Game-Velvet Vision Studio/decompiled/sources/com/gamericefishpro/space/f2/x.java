package com.gamericefishpro.space.f2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final o0 a = new o0(4);
    public static final Object b = new Object();

    public static final void a(g1 g1Var, com.gamericefishpro.space.h1.m mVar, Function2 function2, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        rVar.b0(-511989831);
        if ((i & 6) == 0) {
            i2 = (rVar.h(g1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(function2) ? 256 : 128;
        }
        if (rVar.S(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(rVar.T);
            com.gamericefishpro.space.t0.q qVarY = com.gamericefishpro.space.t0.i.y(rVar);
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVar, rVar);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
            rVar.d0();
            if (rVar.S) {
                rVar.k(com.gamericefishpro.space.h2.y.d);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, g1Var, g1Var.c);
            com.gamericefishpro.space.t0.i.B(rVar, qVarY, g1Var.d);
            com.gamericefishpro.space.t0.i.B(rVar, function2, g1Var.e);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            rVar.p(true);
            if (rVar.E()) {
                rVar.a0(-1266202711);
            } else {
                rVar.a0(-1259244916);
                boolean zH = rVar.h(g1Var);
                Object objP = rVar.P();
                if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                    objP = new com.gamericefishpro.space.a2.b(3, g1Var);
                    rVar.k0(objP);
                }
                com.gamericefishpro.space.t0.i.g((Function0) objP, rVar);
            }
            rVar.p(false);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new c1(g1Var, mVar, function2, i);
        }
    }

    public static final void b(com.gamericefishpro.space.h1.m mVar, Function2 function2, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        int i3;
        rVar.b0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (rVar.h(function2) ? 32 : 16);
        if (rVar.S(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                mVar = com.gamericefishpro.space.h1.j.a;
            }
            Object objP = rVar.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = new g1(o0.e);
                rVar.k0(objP);
            }
            a((g1) objP, mVar, function2, rVar, (i5 << 3) & 1008);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new b1(mVar, function2, i, i2);
        }
    }

    public static final float c(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float d(t0 t0Var, boolean z, m[] mVarArr, float f) {
        float f2 = Float.NaN;
        for (m mVar : mVarArr) {
            float fD = t0Var.d(mVar);
            if (Float.isNaN(f2)) {
                f2 = fD;
            } else if (z == (fD > f2)) {
                f2 = fD;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final com.gamericefishpro.space.n1.c e(u uVar) {
        u uVarL = uVar.l();
        return uVarL != null ? uVarL.z(uVar, true) : new com.gamericefishpro.space.n1.c(0.0f, 0.0f, (int) (uVar.F() >> 32), (int) (uVar.F() & 4294967295L));
    }

    public static final com.gamericefishpro.space.n1.c f(u uVar, boolean z) {
        u uVarH = h(uVar);
        float F = (int) (uVarH.F() >> 32);
        float F2 = (int) (uVarH.F() & 4294967295L);
        com.gamericefishpro.space.n1.c cVarZ = uVarH.z(uVar, z);
        float f = cVarZ.d;
        float f2 = cVarZ.c;
        float f3 = cVarZ.b;
        float f4 = cVarZ.a;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > F) {
                f4 = F;
            }
        }
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > F2) {
                f3 = F2;
            }
        }
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 <= F) {
                F = f2;
            }
            f2 = F;
        }
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f <= F2) {
                F2 = f;
            }
            f = F2;
        }
        if (f4 == f2 || f3 == f) {
            return com.gamericefishpro.space.n1.c.e;
        }
        long jH = uVarH.h((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jH2 = uVarH.h((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jH3 = uVarH.h((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        long jH4 = uVarH.h((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jH4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jH3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jH2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jH4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jH3 & 4294967295L));
        return new com.gamericefishpro.space.n1.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final u h(u uVar) {
        u uVar2;
        u uVarL = uVar.l();
        while (true) {
            u uVar3 = uVarL;
            uVar2 = uVar;
            uVar = uVar3;
            if (uVar == null) {
                break;
            }
            uVarL = uVar.l();
        }
        com.gamericefishpro.space.h2.f1 f1Var = uVar2 instanceof com.gamericefishpro.space.h2.f1 ? (com.gamericefishpro.space.h2.f1) uVar2 : null;
        if (f1Var == null) {
            return uVar2;
        }
        com.gamericefishpro.space.h2.f1 f1Var2 = f1Var.J;
        while (true) {
            com.gamericefishpro.space.h2.f1 f1Var3 = f1Var2;
            com.gamericefishpro.space.h2.f1 f1Var4 = f1Var;
            f1Var = f1Var3;
            if (f1Var == null) {
                return f1Var4;
            }
            f1Var2 = f1Var.J;
        }
    }

    public static final com.gamericefishpro.space.h2.o0 i(com.gamericefishpro.space.h2.o0 o0Var) {
        com.gamericefishpro.space.h2.f0 f0Var = o0Var.H.H;
        while (true) {
            com.gamericefishpro.space.h2.f0 f0VarV = f0Var.v();
            com.gamericefishpro.space.h2.f0 f0Var2 = null;
            if ((f0VarV != null ? f0VarV.B : null) == null) {
                com.gamericefishpro.space.h2.o0 o0VarI0 = f0Var.Z.d.I0();
                Intrinsics.b(o0VarI0);
                return o0VarI0;
            }
            com.gamericefishpro.space.h2.f0 f0VarV2 = f0Var.v();
            if (f0VarV2 != null) {
                f0Var2 = f0VarV2.B;
            }
            Intrinsics.b(f0Var2);
            com.gamericefishpro.space.h2.f0 f0VarV3 = f0Var.v();
            Intrinsics.b(f0VarV3);
            f0Var = f0VarV3.B;
            Intrinsics.b(f0Var);
        }
    }

    public static final com.gamericefishpro.space.h1.m j(com.gamericefishpro.space.di.c cVar) {
        return new v(cVar);
    }

    public static final com.gamericefishpro.space.h1.m k(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.f3.d dVar) {
        return mVar.c(new p0(dVar));
    }

    public static final long l(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
