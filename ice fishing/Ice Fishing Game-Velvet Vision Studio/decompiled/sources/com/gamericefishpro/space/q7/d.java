package com.gamericefishpro.space.q7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.v;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.e;
import com.gamericefishpro.space.h1.j;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.g0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.c1;
import com.gamericefishpro.space.t0.f;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.y.q;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a = o.c(4289734400L);
    public static final long b = o.c(4286192384L);
    public static final long c = o.c(4294622464L);
    public static final long d = o.c(4287917824L);
    public static final /* synthetic */ int e = 0;

    public static final void a(final int i, final int i2, final int i3, Function0 onNextLevel, final Function0 onReplay, final Function0 onHome, r rVar, final int i4) {
        Function0 function0;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onNextLevel, "onNextLevel");
        Intrinsics.checkNotNullParameter(onReplay, "onReplay");
        Intrinsics.checkNotNullParameter(onHome, "onHome");
        rVar2.b0(191933374);
        int i5 = i4 | (rVar2.d(i) ? 4 : 2) | (rVar2.d(i2) ? 32 : 16) | (rVar2.d(i3) ? 256 : 128) | (rVar2.h(onNextLevel) ? 2048 : 1024) | (rVar2.h(onReplay) ? 16384 : 8192) | (rVar2.h(onHome) ? 131072 : 65536);
        if ((i5 & 74899) == 74898 && rVar2.E()) {
            rVar2.V();
            function0 = onNextLevel;
        } else {
            rVar2.a0(-749112519);
            Object objP = rVar2.P();
            f fVar = n.a;
            if (objP == fVar) {
                objP = new c1(0);
                rVar2.k0(objP);
            }
            c1 c1Var = (c1) objP;
            rVar2.p(false);
            Integer numValueOf = Integer.valueOf(i2);
            rVar2.a0(-749110402);
            boolean z = (i5 & 112) == 32;
            Object objP2 = rVar2.P();
            if (z || objP2 == fVar) {
                objP2 = new c(i2, c1Var, null);
                rVar2.k0(objP2);
            }
            rVar2.p(false);
            int i6 = i5 >> 3;
            i.e(rVar2, numValueOf, (Function2) objP2);
            h0 h0Var = g1.c;
            e eVar = com.gamericefishpro.space.h1.b.d;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(eVar, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(h0Var, rVar2);
            g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, l0VarD, eVar2);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar3);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf2, eVar4);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar5);
            float f = 16;
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, com.gamericefishpro.space.l1.h.a(h0Var, f), null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j, 0.6f))), new Pair(Float.valueOf(0.5f), new s(s.c(j, 0.3f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.8f)))}), null, 6), rVar2, 6);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(h0Var, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar2);
            i.B(rVar2, l1VarL2, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar4, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar5);
            j jVar = j.a;
            float f2 = 24;
            m mVarN = com.gamericefishpro.space.d0.j.n(g1.b(jVar, 1.0f), f2, 0.0f, 2);
            l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.e, false);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            m mVarF3 = h.F(mVarN, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD3, eVar2);
            i.B(rVar2, l1VarL3, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar4, rVar2, dVar);
            i.B(rVar2, mVarF3, eVar5);
            float f3 = 80;
            float f4 = 32;
            m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.j.o(g1.b(jVar, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13), com.gamericefishpro.space.k0.e.a(f4));
            long jC = s.c(o.c(4278197305L), 0.85f);
            g0 g0Var = o.b;
            m mVarE = q.e(mVarB, jC, g0Var);
            float f5 = 1;
            long j2 = s.c;
            m mVarO = com.gamericefishpro.space.d0.j.o(com.gamericefishpro.space.d0.j.m(q.g(mVarE, f5, s.c(j2, 0.4f), com.gamericefishpro.space.k0.e.a(f4)), f2, f2), 0.0f, 40, 0.0f, 0.0f, 13);
            com.gamericefishpro.space.h1.c cVar = com.gamericefishpro.space.h1.b.G;
            v vVar = com.gamericefishpro.space.d0.h.b;
            b0 b0VarA = z.a(vVar, cVar, rVar2, 48);
            int iHashCode4 = Long.hashCode(rVar2.T);
            l1 l1VarL4 = rVar2.l();
            m mVarF4 = h.F(mVarO, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, b0VarA, eVar2);
            i.B(rVar2, l1VarL4, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar4, rVar2, dVar);
            i.B(rVar2, mVarF4, eVar5);
            long jC2 = s.c(j2, 0.8f);
            long jC3 = com.gamericefishpro.space.hj.c.C(14);
            k kVar = k.w;
            r0.a("LEVEL " + i + " COMPLETE", null, jC2, jC3, kVar, com.gamericefishpro.space.hj.c.C(2), null, 0L, 0, false, 0, 0, null, rVar2, 102261120, 0, 261802);
            long jC4 = com.gamericefishpro.space.hj.c.C(36);
            k kVar2 = k.y;
            r0.a("ICE-CELLENT!", null, j2, jC4, kVar2, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(o.c(4278232063L), 12.0f, 2), 16769023), rVar, 1597830, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f), rVar);
            com.gamericefishpro.space.w.z zVarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("stars_float", rVar), 0.0f, -12.0f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(800, 2, t.a), com.gamericefishpro.space.w.j0.e), "float_y", rVar, 28728);
            com.gamericefishpro.space.d0.c cVar2 = com.gamericefishpro.space.d0.h.c;
            com.gamericefishpro.space.h1.d dVar2 = com.gamericefishpro.space.h1.b.E;
            m mVarD = g1.d(jVar, f3);
            d1 d1VarA = b1.a(cVar2, dVar2, rVar, 54);
            int iHashCode5 = Long.hashCode(rVar.T);
            l1 l1VarL5 = rVar.l();
            m mVarF5 = h.F(mVarD, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA, eVar2);
            i.B(rVar, l1VarL5, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF5, eVar5);
            com.gamericefishpro.space.b9.a.b(i3 >= 1, 48, ((Number) zVarE.v.getValue()).floatValue() * 0.6f, rVar, 48);
            float f6 = 8;
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f6), rVar);
            com.gamericefishpro.space.b9.a.b(i3 >= 2, 64, ((Number) zVarE.v.getValue()).floatValue(), rVar, 48);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f6), rVar);
            com.gamericefishpro.space.b9.a.b(i3 >= 3, 48, ((Number) zVarE.v.getValue()).floatValue() * 0.6f, rVar, 48);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f2), rVar);
            r0.a("FINAL SCORE", null, s.c(j2, 0.6f), com.gamericefishpro.space.hj.c.C(12), null, com.gamericefishpro.space.hj.c.C(2), null, 0L, 0, false, 0, 0, null, rVar, 100688262, 0, 261866);
            String str = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(c1Var.g())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            long jC5 = com.gamericefishpro.space.hj.c.C(38);
            i0 i0Var = new i0(new j0(d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 8.0f), 16769023);
            long j3 = c;
            r0.a(str, null, j3, jC5, kVar2, 0L, null, 0L, 0, false, 0, 0, i0Var, rVar, 1597824, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f2), rVar);
            float f7 = 20;
            float f8 = 12;
            m mVarM = com.gamericefishpro.space.d0.j.m(q.g(q.e(com.gamericefishpro.space.l1.h.b(g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f7)), s.c(j2, 0.1f), g0Var), f5, s.c(j2, 0.2f), com.gamericefishpro.space.k0.e.a(f7)), f, f8);
            com.gamericefishpro.space.h1.d dVar3 = com.gamericefishpro.space.h1.b.D;
            com.gamericefishpro.space.d0.c cVar3 = com.gamericefishpro.space.d0.h.e;
            d1 d1VarA2 = b1.a(cVar3, dVar3, rVar, 54);
            int iHashCode6 = Long.hashCode(rVar.T);
            l1 l1VarL6 = rVar.l();
            m mVarF6 = h.F(mVarM, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA2, eVar2);
            i.B(rVar, l1VarL6, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF6, eVar5);
            d1 d1VarA3 = b1.a(com.gamericefishpro.space.d0.h.a, dVar3, rVar, 48);
            int iHashCode7 = Long.hashCode(rVar.T);
            l1 l1VarL7 = rVar.l();
            m mVarF7 = h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA3, eVar2);
            i.B(rVar, l1VarL7, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode7, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF7, eVar5);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.ic_money, rVar, 0), "Coins", g1.f(jVar, 36), null, null, 0.0f, rVar, 440, 120);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f8), rVar);
            b0 b0VarA2 = z.a(vVar, com.gamericefishpro.space.h1.b.F, rVar, 0);
            int iHashCode8 = Long.hashCode(rVar.T);
            l1 l1VarL8 = rVar.l();
            m mVarF8 = h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, b0VarA2, eVar2);
            i.B(rVar, l1VarL8, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode8, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF8, eVar5);
            r0.a("Star Coins", null, j2, com.gamericefishpro.space.hj.c.C(15), kVar, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597830, 0, 262058);
            r0.a(com.gamericefishpro.space.m5.a.g((i * 20) + (i3 * 50), "+"), null, j3, com.gamericefishpro.space.hj.c.C(14), kVar2, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            rVar.p(true);
            rVar.p(true);
            m mVarM2 = com.gamericefishpro.space.d0.j.m(q.g(q.e(com.gamericefishpro.space.l1.h.b(jVar, com.gamericefishpro.space.k0.e.a(f8)), s.c(j2, 0.15f), g0Var), f5, s.c(j2, 0.3f), com.gamericefishpro.space.k0.e.a(f8)), f8, 6);
            l0 l0VarD4 = com.gamericefishpro.space.d0.r.d(eVar, false);
            int iHashCode9 = Long.hashCode(rVar.T);
            l1 l1VarL9 = rVar.l();
            m mVarF9 = h.F(mVarM2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, l0VarD4, eVar2);
            i.B(rVar, l1VarL9, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode9, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF9, eVar5);
            r0.a("CLAIMED", null, j2, com.gamericefishpro.space.hj.c.C(11), kVar, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, null, rVar, 102261126, 0, 261802);
            rVar.p(true);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f4), rVar);
            function0 = onNextLevel;
            com.gamericefishpro.space.hj.c.e(function0, rVar, (i5 >> 9) & 14);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f), rVar);
            m mVarB2 = g1.b(jVar, 1.0f);
            d1 d1VarA4 = b1.a(cVar3, com.gamericefishpro.space.h1.b.C, rVar, 6);
            int iHashCode10 = Long.hashCode(rVar.T);
            l1 l1VarL10 = rVar.l();
            m mVarF10 = h.F(mVarB2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA4, eVar2);
            i.B(rVar, l1VarL10, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode10, rVar, eVar4, rVar, dVar);
            i.B(rVar, mVarF10, eVar5);
            h.e("Replay", "↩", e1.a(), onReplay, rVar, (i6 & 7168) | 54);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f), rVar);
            h.e("Home", "🏠", e1.a(), onHome, rVar, ((i5 >> 6) & 7168) | 54);
            rVar.p(true);
            rVar.p(true);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.girl_with_red_fish, rVar, 0), "Victory", com.gamericefishpro.space.hj.c.Y(com.gamericefishpro.space.d0.j.i(g1.f(jVar, 170), 0, -10), 1.0f), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 25016, 104);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            final Function0 function1 = function0;
            p1VarT.d = new Function2(i, i2, i3, function1, onReplay, onHome, i4) { // from class: com.gamericefishpro.space.q7.b
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = i.D(1);
                    d.a(this.d, this.e, this.i, this.v, this.w, this.y, (r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }
}
