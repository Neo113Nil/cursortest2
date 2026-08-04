package com.gamericefishpro.space.p7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.e;
import com.gamericefishpro.space.h2.f;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a = o.c(4294622464L);

    public static final void a(Function0 onBack, r rVar, int i) {
        y yVar;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar2.b0(1174859186);
        int i2 = i | (rVar2.h(onBack) ? 4 : 2);
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(h0Var, rVar2);
            g.a.getClass();
            y yVar2 = f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.n0();
            }
            e eVar = f.e;
            i.B(rVar2, l0VarD, eVar);
            e eVar2 = f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            e eVar3 = f.f;
            i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = f.g;
            i.x(rVar2, dVar);
            e eVar4 = f.c;
            i.B(rVar2, mVarF, eVar4);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j, 0.5f))), new Pair(Float.valueOf(0.4f), new s(s.c(j, 0.2f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.85f)))}), null, 6), rVar2, 6);
            a4.f(rVar2, 0);
            float f = 20;
            m mVarM = j.m(h0Var, f, 48);
            b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarM, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                yVar = yVar2;
                rVar2.k(yVar);
            } else {
                yVar = yVar2;
                rVar2.n0();
            }
            i.B(rVar2, b0VarA, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarB = g1.b(jVar, 1.0f);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            m mVarF3 = h.F(mVarB, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, d1VarA, eVar);
            i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF3, eVar4);
            com.gamericefishpro.space.i.a.d(onBack, rVar2, i2 & 14);
            float f2 = 16;
            j.c(g1.g(jVar, f2), rVar2);
            long j2 = s.c;
            r0.a("HOW TO PLAY", null, j2, com.gamericefishpro.space.hj.c.C(28), k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new j0(s.c(j, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar.p(true);
            float f3 = 24;
            j.c(g1.d(jVar, f3), rVar);
            com.gamericefishpro.space.d0.e eVarG = com.gamericefishpro.space.d0.h.g(f2);
            m mVarG = q.g(q.e(com.gamericefishpro.space.l1.h.b(c0.a(g1.b(jVar, 1.0f)), com.gamericefishpro.space.k0.e.a(f3)), s.c(j2, 0.12f), o.b), 1, s.c(j2, 0.3f), com.gamericefishpro.space.k0.e.a(f3));
            w0 w0Var = new w0(f, f, f, f);
            rVar.a0(-1148794083);
            Object objP = rVar.P();
            if (objP == n.a) {
                objP = new com.gamericefishpro.space.j7.c(24);
                rVar.k0(objP);
            }
            rVar.p(false);
            h.f(mVarG, null, w0Var, eVarG, null, null, false, null, (Function1) objP, rVar, 805331328);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.n7.z(onBack, i, 2);
        }
    }
}
