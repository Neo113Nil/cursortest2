package com.gamericefishpro.space.r7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.d0.x;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.m;
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
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.y0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a = o.c(4294622464L);
    public static final long b = o.c(4278197305L);

    public static final void a(Function1 onLevelSelected, Function0 onBack, e eVar, r rVar, int i) {
        int i2;
        e eVar2;
        e eVar3;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onLevelSelected, "onLevelSelected");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar2.b0(40214069);
        int i3 = i | (rVar2.h(onLevelSelected) ? 4 : 2) | (rVar2.h(onBack) ? 32 : 16) | 128;
        if ((i3 & 147) == 146 && rVar2.E()) {
            rVar2.V();
            eVar3 = eVar;
        } else {
            rVar2.X();
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = h.K(b0.a(e.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                i2 = i3 & (-897);
                eVar2 = (e) s0VarK;
            } else {
                rVar2.V();
                i2 = i3 & (-897);
                eVar2 = eVar;
            }
            rVar2.q();
            v0 v0VarL = i.l(eVar2.c, rVar2);
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(h0Var, rVar2);
            g.a.getClass();
            y yVar = f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar4 = f.e;
            i.B(rVar2, l0VarD, eVar4);
            com.gamericefishpro.space.h2.e eVar5 = f.d;
            i.B(rVar2, l1VarL, eVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar6 = f.f;
            i.t(rVar2, numValueOf, eVar6);
            com.gamericefishpro.space.h2.d dVar = f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar7 = f.c;
            i.B(rVar2, mVarF, eVar7);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j, 0.5f))), new Pair(Float.valueOf(0.3f), new s(s.c(j, 0.15f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.85f)))}), null, 6), rVar2, 6);
            a4.f(rVar2, 0);
            float f = 20;
            m mVarM = j.m(h0Var, f, 48);
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarM, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, b0VarA, eVar4);
            i.B(rVar2, l1VarL2, eVar5);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar6, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar7);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarB = g1.b(jVar, 1.0f);
            e eVar8 = eVar2;
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
            i.B(rVar2, d1VarA, eVar4);
            i.B(rVar2, l1VarL3, eVar5);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar6, rVar2, dVar);
            i.B(rVar2, mVarF3, eVar7);
            com.gamericefishpro.space.b9.a.d(onBack, rVar2, (i2 >> 3) & 14);
            float f2 = 16;
            j.c(g1.g(jVar, f2), rVar2);
            r0.a("SELECT LEVEL", null, s.c, com.gamericefishpro.space.hj.c.C(28), k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new j0(s.c(j, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            j.c(g1.d(jVar, 24), rVar2);
            com.gamericefishpro.space.g0.a aVar = new com.gamericefishpro.space.g0.a(3);
            com.gamericefishpro.space.d0.e eVarG = com.gamericefishpro.space.d0.h.g(14);
            com.gamericefishpro.space.d0.e eVarG2 = com.gamericefishpro.space.d0.h.g(f2);
            w0 w0VarB = j.b(f);
            rVar2.a0(-1860837961);
            boolean zF = rVar2.f(v0VarL) | ((i2 & 14) == 4);
            Object objP = rVar2.P();
            if (zF || objP == n.a) {
                objP = new q0(22, v0VarL, onLevelSelected);
                rVar2.k0(objP);
            }
            rVar2.p(false);
            a4.h(aVar, null, null, w0VarB, eVarG2, eVarG, null, false, null, (Function1) objP, rVar2, 1772544, 918);
            rVar2.p(true);
            rVar2.p(true);
            eVar3 = eVar8;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new x(onLevelSelected, onBack, eVar3, i, 3);
        }
    }
}
