package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final com.gamericefishpro.space.w.t0 f;

    static {
        float f2 = com.gamericefishpro.space.s0.h.o;
        a = f2;
        b = com.gamericefishpro.space.s0.h.v;
        c = com.gamericefishpro.space.s0.h.u;
        float f3 = com.gamericefishpro.space.s0.h.r;
        d = f3;
        e = (f3 - f2) / 2;
        f = new com.gamericefishpro.space.w.t0();
    }

    public static final void a(final boolean z, final Function1 function1, com.gamericefishpro.space.h1.m mVar, boolean z2, final m0 m0Var, com.gamericefishpro.space.t0.r rVar, final int i) {
        int i2;
        final com.gamericefishpro.space.h1.m mVar2;
        final boolean z3;
        boolean z4;
        com.gamericefishpro.space.h1.m mVar3;
        rVar.b0(-263339167);
        if ((i & 6) == 0) {
            i2 = i | (rVar.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(function1) ? 32 : 16;
        }
        int i3 = i2 | 28032;
        if ((i & 196608) == 0) {
            i3 |= rVar.f(m0Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (rVar.S(i4 & 1, (599187 & i4) != 599186)) {
            rVar.X();
            int i5 = i & 1;
            com.gamericefishpro.space.h1.m mVarA = com.gamericefishpro.space.h1.j.a;
            if (i5 == 0 || rVar.B()) {
                z4 = true;
                mVar3 = mVarA;
            } else {
                rVar.V();
                mVar3 = mVar;
                z4 = z2;
            }
            rVar.q();
            rVar.a0(1768604058);
            Object objP = rVar.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar.p(false);
            if (function1 != null) {
                com.gamericefishpro.space.f2.k kVar = m.a;
                mVarA = com.gamericefishpro.space.j0.b.a(p.a, z, iVar, z4, new com.gamericefishpro.space.o2.h(2), function1);
            }
            boolean z5 = z4;
            int i6 = i4 << 3;
            int i7 = i4 >> 6;
            b(g1.e(g1.h(mVar3.c(mVarA)), c, d), z, z5, m0Var, iVar, i0.a(com.gamericefishpro.space.s0.h.m, rVar), rVar, (i6 & 57344) | (i6 & 112) | (i7 & 896) | (i7 & 7168));
            z3 = z5;
            mVar2 = mVar3;
        } else {
            rVar.V();
            mVar2 = mVar;
            z3 = z2;
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.q0.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p0.a(z, function1, mVar2, z3, m0Var, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final com.gamericefishpro.space.h1.m mVar, final boolean z, final boolean z2, final m0 m0Var, final com.gamericefishpro.space.b0.i iVar, final com.gamericefishpro.space.o1.k0 k0Var, com.gamericefishpro.space.t0.r rVar, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z3;
        w wVar;
        rVar.b0(-670917213);
        if ((i & 6) == 0) {
            i2 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.f(m0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= rVar.f(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= rVar.f(k0Var) ? 1048576 : 524288;
        }
        if (rVar.S(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? m0Var.b : m0Var.f;
            } else {
                j = z ? m0Var.j : m0Var.n;
            }
            if (z2) {
                j2 = z ? m0Var.a : m0Var.e;
            } else {
                j2 = z ? m0Var.i : m0Var.m;
            }
            com.gamericefishpro.space.o1.k0 k0VarA = i0.a(com.gamericefishpro.space.s0.h.t, rVar);
            float f2 = com.gamericefishpro.space.s0.h.s;
            if (z2) {
                j3 = j2;
                j4 = z ? m0Var.c : m0Var.g;
            } else {
                j3 = j2;
                j4 = z ? m0Var.k : m0Var.o;
            }
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.y.q.g(mVar, f2, j4, k0VarA), j, k0VarA);
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarE, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar2);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            if (rVar.S || !Intrinsics.a(rVar.P(), Integer.valueOf(iHashCode))) {
                rVar.k0(Integer.valueOf(iHashCode));
                rVar.b(Integer.valueOf(iHashCode), eVar3);
            }
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar4);
            com.gamericefishpro.space.h1.m mVarE2 = com.gamericefishpro.space.d0.v.b.e(com.gamericefishpro.space.h1.j.a, com.gamericefishpro.space.h1.b.v);
            com.gamericefishpro.space.s0.c[] cVarArr = com.gamericefishpro.space.s0.c.d;
            ((r) ((s) rVar.j(o.a))).getClass();
            com.gamericefishpro.space.w.v0 v0Var = r.b;
            Intrinsics.c(v0Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            com.gamericefishpro.space.h1.m mVarC = mVarE2.c(new s0(iVar, z, v0Var));
            float f3 = com.gamericefishpro.space.s0.h.q / 2;
            com.gamericefishpro.space.t0.a0 a0Var = v.a;
            long j5 = com.gamericefishpro.space.o1.s.g;
            if (com.gamericefishpro.space.c3.f.b(f3, Float.NaN) && com.gamericefishpro.space.o1.s.d(j5, j5)) {
                wVar = v.b;
                z3 = false;
            } else {
                z3 = false;
                wVar = new w(false, f3, j5);
            }
            com.gamericefishpro.space.h1.m mVarE3 = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.y.n0.a(mVarC, iVar, wVar), j3, k0Var);
            com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, z3);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarE3, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD2, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar2);
            if (rVar.S || !Intrinsics.a(rVar.P(), Integer.valueOf(iHashCode2))) {
                rVar.k0(Integer.valueOf(iHashCode2));
                rVar.b(Integer.valueOf(iHashCode2), eVar3);
            }
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar4);
            rVar.a0(1236071411);
            rVar.p(false);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.q0.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p0.b(mVar, z, z2, m0Var, iVar, k0Var, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
