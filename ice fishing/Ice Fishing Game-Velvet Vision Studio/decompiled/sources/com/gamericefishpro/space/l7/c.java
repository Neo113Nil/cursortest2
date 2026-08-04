package com.gamericefishpro.space.l7;

import com.gamericefishpro.space.MainActivity;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.e.n;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.j;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.w.j0;
import com.gamericefishpro.space.w.o1;
import com.gamericefishpro.space.w.p;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.w.z;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.y0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a = o.c(4278214055L);
    public static final long b = o.c(4278220497L);
    public static final long c = o.c(4289734400L);
    public static final long d = o.c(4286192384L);
    public static final long e = o.c(4294622464L);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function0 onPlay, Function0 onAchievements, Function0 onSettings, Function0 onInfo, Function0 onStatistics, Function0 onHistory, e eVar, r rVar, int i) {
        int i2;
        e eVar2;
        boolean z;
        y yVar;
        e eVar3;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onPlay, "onPlay");
        Intrinsics.checkNotNullParameter(onAchievements, "onAchievements");
        Intrinsics.checkNotNullParameter(onSettings, "onSettings");
        Intrinsics.checkNotNullParameter(onInfo, "onInfo");
        Intrinsics.checkNotNullParameter(onStatistics, "onStatistics");
        Intrinsics.checkNotNullParameter(onHistory, "onHistory");
        rVar2.b0(-1971304724);
        int i3 = i | (rVar2.h(onPlay) ? 4 : 2) | (rVar2.h(onAchievements) ? 32 : 16) | (rVar2.h(onSettings) ? 256 : 128) | (rVar2.h(onInfo) ? 2048 : 1024) | (rVar2.h(onStatistics) ? 16384 : 8192) | (rVar2.h(onHistory) ? 131072 : 65536) | 524288;
        if ((599187 & i3) == 599186 && rVar2.E()) {
            rVar2.V();
            eVar3 = eVar;
        } else {
            rVar2.X();
            com.gamericefishpro.space.th.a aVar = null;
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(e.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                e eVar4 = (e) s0VarK;
                i2 = i3 & (-3670017);
                eVar2 = eVar4;
            } else {
                rVar2.V();
                i2 = i3 & (-3670017);
                eVar2 = eVar;
            }
            rVar2.q();
            v0 v0VarL = i.l(eVar2.c, rVar2);
            com.gamericefishpro.space.w.b0 b0VarM = com.gamericefishpro.space.w.c.m("dashboard_animations", rVar2);
            Object objJ = rVar2.j(n.a);
            MainActivity mainActivity = objJ instanceof MainActivity ? (MainActivity) objJ : null;
            Unit unit = Unit.a;
            rVar2.a0(742159394);
            boolean zH = rVar2.h(mainActivity);
            Object objP = rVar2.P();
            if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                z = false;
                objP = new b(mainActivity, aVar, 0 == true ? 1 : 0);
                rVar2.k0(objP);
            } else {
                z = false;
            }
            rVar2.p(z);
            i.e(rVar2, unit, (Function2) objP);
            p pVar = t.a;
            o1 o1VarO = com.gamericefishpro.space.w.c.o(800, 2, pVar);
            j0 j0Var = j0.e;
            z zVarE = com.gamericefishpro.space.w.c.e(b0VarM, 1.0f, 1.05f, com.gamericefishpro.space.w.c.l(o1VarO, j0Var), "pulse_scale", rVar2, 29112);
            z zVarE2 = com.gamericefishpro.space.w.c.e(b0VarM, 0.98f, 1.02f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1500, 2, pVar), j0Var), "breath_scale", rVar, 29112);
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            e eVar5 = eVar2;
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.e;
            i.B(rVar, l0VarD, eVar6);
            com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar, l1VarL, eVar7);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar8 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar, numValueOf, eVar8);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar9 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar, mVarF, eVar9);
            int i4 = i2;
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            Pair pair = new Pair(fValueOf, new s(s.c(j, 0.6f)));
            Float fValueOf2 = Float.valueOf(0.3f);
            long j2 = s.f;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{pair, new Pair(fValueOf2, new s(j2)), new Pair(Float.valueOf(0.7f), new s(j2)), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.85f)))}), null, 6), rVar, 6);
            com.gamericefishpro.space.u6.f.g(R.drawable.blue_fish, 150, 12000, true, 0, rVar, 28080);
            com.gamericefishpro.space.u6.f.g(R.drawable.red_fish, 350, 15000, false, 2000, rVar, 28080);
            com.gamericefishpro.space.u6.f.g(R.drawable.orange_fish, 250, 10000, true, 5000, rVar, 28080);
            a4.f(rVar, 0);
            j jVar = j.a;
            float f = 20;
            m mVarO = com.gamericefishpro.space.d0.j.o(g1.b(jVar, 1.0f), f, 48, f, 0.0f, 8);
            com.gamericefishpro.space.d0.c cVar = com.gamericefishpro.space.d0.h.e;
            com.gamericefishpro.space.h1.d dVar2 = com.gamericefishpro.space.h1.b.C;
            d1 d1VarA = b1.a(cVar, dVar2, rVar, 54);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarO, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar = yVar2;
                rVar.k(yVar);
            } else {
                yVar = yVar2;
                rVar.n0();
            }
            i.B(rVar, d1VarA, eVar6);
            i.B(rVar, l1VarL2, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF2, eVar9);
            com.gamericefishpro.space.u1.f fVarB = a4.d;
            if (fVarB == null) {
                com.gamericefishpro.space.u1.e eVar10 = new com.gamericefishpro.space.u1.e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var = com.gamericefishpro.space.u1.g0.a;
                m0 m0Var = new m0(j);
                u uVar = new u(1);
                uVar.B(19.14f, 12.94f);
                uVar.u(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                uVar.u(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                uVar.A(2.03f, -1.58f);
                uVar.u(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                uVar.A(-1.92f, -3.32f);
                uVar.u(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                uVar.A(-2.39f, 0.96f);
                uVar.u(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                uVar.z(14.4f, 2.81f);
                uVar.u(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                uVar.y(-3.84f);
                uVar.u(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                uVar.z(9.25f, 5.35f);
                uVar.t(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                uVar.z(5.24f, 5.33f);
                uVar.u(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                uVar.z(2.74f, 8.87f);
                uVar.t(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                uVar.A(2.03f, 1.58f);
                uVar.t(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                uVar.E(0.02f, 0.64f, 0.07f, 0.94f);
                uVar.A(-2.03f, 1.58f);
                uVar.u(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                uVar.A(1.92f, 3.32f);
                uVar.u(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                uVar.A(2.39f, -0.96f);
                uVar.u(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                uVar.A(0.36f, 2.54f);
                uVar.u(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                uVar.y(3.84f);
                uVar.u(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                uVar.A(0.36f, -2.54f);
                uVar.u(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                uVar.A(2.39f, 0.96f);
                uVar.u(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                uVar.A(1.92f, -3.32f);
                uVar.u(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                uVar.z(19.14f, 12.94f);
                uVar.s();
                uVar.B(12.0f, 15.6f);
                uVar.u(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                uVar.E(1.62f, -3.6f, 3.6f, -3.6f);
                uVar.E(3.6f, 1.62f, 3.6f, 3.6f);
                uVar.D(13.98f, 15.6f, 12.0f, 15.6f);
                uVar.s();
                com.gamericefishpro.space.u1.e.a(eVar10, (ArrayList) uVar.e, m0Var);
                fVarB = eVar10.b();
                a4.d = fVarB;
            }
            int i5 = i4 >> 3;
            y3.d(fVarB, onSettings, rVar, i5 & 112);
            d5.i(((d) v0VarL.getValue()).a, null, rVar, 0);
            rVar.p(true);
            m mVarO2 = com.gamericefishpro.space.d0.j.o(com.gamericefishpro.space.d0.j.n(h0Var, f, 0.0f, 2), 0.0f, 100, 0.0f, 40, 5);
            com.gamericefishpro.space.h1.c cVar2 = com.gamericefishpro.space.h1.b.G;
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(cVar, cVar2, rVar, 54);
            int iHashCode3 = Long.hashCode(rVar.T);
            l1 l1VarL3 = rVar.l();
            m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarO2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, b0VarA, eVar6);
            i.B(rVar, l1VarL3, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF3, eVar9);
            m mVarB = g1.b(c0.a(jVar), 1.0f);
            com.gamericefishpro.space.h1.e eVar11 = com.gamericefishpro.space.h1.b.w;
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar11, false);
            int iHashCode4 = Long.hashCode(rVar.T);
            l1 l1VarL4 = rVar.l();
            m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarB, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, l0VarD2, eVar6);
            i.B(rVar, l1VarL4, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF4, eVar9);
            m mVarD = q.d(com.gamericefishpro.space.l1.h.f(g1.f(jVar, 280), ((Number) zVarE2.v.getValue()).floatValue()), a0.d(14, x.f(new s(s.c(b, 0.4f)), new s(j2))), com.gamericefishpro.space.k0.e.a, 4);
            l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar11, false);
            int iHashCode5 = Long.hashCode(rVar.T);
            l1 l1VarL5 = rVar.l();
            m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarD, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, l0VarD3, eVar6);
            i.B(rVar, l1VarL5, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF5, eVar9);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.girl_with_ice_fish, rVar, 0), "Ice Fisher", g1.f(jVar, 260), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 25016, 104);
            rVar.p(true);
            rVar.p(true);
            com.gamericefishpro.space.d0.c cVar3 = com.gamericefishpro.space.d0.h.c;
            m mVarB2 = g1.b(jVar, 1.0f);
            com.gamericefishpro.space.d0.b0 b0VarA2 = com.gamericefishpro.space.d0.z.a(cVar3, cVar2, rVar, 54);
            int iHashCode6 = Long.hashCode(rVar.T);
            l1 l1VarL6 = rVar.l();
            m mVarF6 = com.gamericefishpro.space.d9.h.F(mVarB2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, b0VarA2, eVar6);
            i.B(rVar, l1VarL6, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF6, eVar9);
            com.gamericefishpro.space.i.a.f(com.gamericefishpro.space.l1.h.f(jVar, ((Number) zVarE.v.getValue()).floatValue()), onPlay, rVar, (i4 << 3) & 112);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 32), rVar);
            float f2 = 12;
            com.gamericefishpro.space.d0.e eVarG = com.gamericefishpro.space.d0.h.g(f2);
            m mVarB3 = g1.b(jVar, 1.0f);
            com.gamericefishpro.space.d0.b0 b0VarA3 = com.gamericefishpro.space.d0.z.a(eVarG, com.gamericefishpro.space.h1.b.F, rVar, 6);
            int iHashCode7 = Long.hashCode(rVar.T);
            l1 l1VarL7 = rVar.l();
            m mVarF7 = com.gamericefishpro.space.d9.h.F(mVarB3, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, b0VarA3, eVar6);
            i.B(rVar, l1VarL7, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode7, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF7, eVar9);
            m mVarB4 = g1.b(jVar, 1.0f);
            d1 d1VarA2 = b1.a(com.gamericefishpro.space.d0.h.g(f2), dVar2, rVar, 6);
            int iHashCode8 = Long.hashCode(rVar.T);
            l1 l1VarL8 = rVar.l();
            m mVarF8 = com.gamericefishpro.space.d9.h.F(mVarB4, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA2, eVar6);
            i.B(rVar, l1VarL8, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode8, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF8, eVar9);
            a4.b(e1.a(), "HISTORY", com.gamericefishpro.space.u6.f.z(), onHistory, rVar, ((i4 >> 6) & 7168) | 48);
            m mVarA = e1.a();
            com.gamericefishpro.space.u1.f fVarB2 = com.gamericefishpro.space.hj.c.a;
            if (fVarB2 == null) {
                com.gamericefishpro.space.u1.e eVar12 = new com.gamericefishpro.space.u1.e("Filled.BarChart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                g0 g0Var2 = com.gamericefishpro.space.u1.g0.a;
                m0 m0Var2 = new m0(j);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new com.gamericefishpro.space.u1.n(4.0f, 9.0f));
                arrayList.add(new com.gamericefishpro.space.u1.t(4.0f));
                arrayList.add(new com.gamericefishpro.space.u1.z(11.0f));
                arrayList.add(new com.gamericefishpro.space.u1.t(-4.0f));
                com.gamericefishpro.space.u1.j jVar2 = com.gamericefishpro.space.u1.j.c;
                arrayList.add(jVar2);
                com.gamericefishpro.space.u1.e.a(eVar12, arrayList, m0Var2);
                m0 m0Var3 = new m0(j);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new com.gamericefishpro.space.u1.n(16.0f, 13.0f));
                arrayList2.add(new com.gamericefishpro.space.u1.t(4.0f));
                arrayList2.add(new com.gamericefishpro.space.u1.z(7.0f));
                arrayList2.add(new com.gamericefishpro.space.u1.t(-4.0f));
                arrayList2.add(jVar2);
                com.gamericefishpro.space.u1.e.a(eVar12, arrayList2, m0Var3);
                m0 m0Var4 = new m0(j);
                ArrayList arrayList3 = new ArrayList(32);
                arrayList3.add(new com.gamericefishpro.space.u1.n(10.0f, 4.0f));
                arrayList3.add(new com.gamericefishpro.space.u1.t(4.0f));
                arrayList3.add(new com.gamericefishpro.space.u1.z(16.0f));
                arrayList3.add(new com.gamericefishpro.space.u1.t(-4.0f));
                arrayList3.add(jVar2);
                com.gamericefishpro.space.u1.e.a(eVar12, arrayList3, m0Var4);
                fVarB2 = eVar12.b();
                com.gamericefishpro.space.hj.c.a = fVarB2;
            }
            a4.b(mVarA, "STATS", fVarB2, onStatistics, rVar, (i5 & 7168) | 48);
            rVar.p(true);
            m mVarB5 = g1.b(jVar, 1.0f);
            d1 d1VarA3 = b1.a(com.gamericefishpro.space.d0.h.g(f2), dVar2, rVar, 6);
            int iHashCode9 = Long.hashCode(rVar.T);
            l1 l1VarL9 = rVar.l();
            m mVarF9 = com.gamericefishpro.space.d9.h.F(mVarB5, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, d1VarA3, eVar6);
            i.B(rVar, l1VarL9, eVar7);
            com.gamericefishpro.space.m5.a.o(iHashCode9, rVar, eVar8, rVar, dVar);
            i.B(rVar, mVarF9, eVar9);
            a4.b(e1.a(), "ACHIEVE", com.gamericefishpro.space.i.a.u(), onAchievements, rVar, ((i4 << 6) & 7168) | 48);
            a4.b(e1.a(), "INFO", com.gamericefishpro.space.wa.b.y(), onInfo, rVar, (i4 & 7168) | 48);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
            eVar3 = eVar5;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new a(onPlay, onAchievements, onSettings, onInfo, onStatistics, onHistory, eVar3, i);
        }
    }
}
