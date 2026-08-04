package com.gamericefishpro.space.t7;

import android.content.Context;
import android.content.res.Configuration;
import com.gamericefishpro.space.MainActivity;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.e.n;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.j;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.k7.e;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.f;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.w.z;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a = o.c(4278214055L);
    public static final long b = o.c(4278220497L);
    public static final long c = o.c(4278232063L);
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.gamericefishpro.space.o1.k0] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    public static final void a(Function0 onNavigateToDashboard, Function1 onNavigateToWebView, d dVar, r rVar, int i) {
        int i2;
        d dVar2;
        ?? r4;
        d dVar3;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onNavigateToDashboard, "onNavigateToDashboard");
        Intrinsics.checkNotNullParameter(onNavigateToWebView, "onNavigateToWebView");
        rVar2.b0(-726967543);
        int i3 = i | (rVar2.h(onNavigateToDashboard) ? 4 : 2) | (rVar2.h(onNavigateToWebView) ? 32 : 16) | 128;
        if ((i3 & 147) == 146 && rVar2.E()) {
            rVar2.V();
            dVar3 = dVar;
        } else {
            rVar2.X();
            com.gamericefishpro.space.th.a aVar = null;
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = h.K(b0.a(d.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                i2 = i3 & (-897);
                dVar2 = (d) s0VarK;
            } else {
                rVar2.V();
                i2 = i3 & (-897);
                dVar2 = dVar;
            }
            rVar2.q();
            v0 v0VarL = i.l(dVar2.c, rVar2);
            Context context = (Context) rVar2.j(j0.b);
            float f = ((Configuration) rVar2.j(j0.a)).screenWidthDp;
            Object objJ = rVar2.j(n.a);
            MainActivity mainActivity = objJ instanceof MainActivity ? (MainActivity) objJ : null;
            Unit unit = Unit.a;
            rVar2.a0(-1411217290);
            boolean zH = rVar2.h(mainActivity);
            Object objP = rVar2.P();
            f fVar = com.gamericefishpro.space.t0.n.a;
            if (zH || objP == fVar) {
                objP = new com.gamericefishpro.space.l7.b(mainActivity, aVar, 1);
                rVar2.k0(objP);
            }
            rVar2.p(false);
            i.e(rVar2, unit, (Function2) objP);
            z zVarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("logo_pulse", rVar2), 0.95f, 1.05f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(1200, 2, t.a), com.gamericefishpro.space.w.j0.e), "scale", rVar2, 29112);
            rVar2.a0(-1411204799);
            boolean zH2 = rVar2.h(dVar2) | rVar2.h(context);
            Object objP2 = rVar2.P();
            if (zH2 || objP2 == fVar) {
                objP2 = new e(dVar2, context, null, 9);
                rVar2.k0(objP2);
            }
            rVar2.p(false);
            i.e(rVar2, unit, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(((c) v0VarL.getValue()).a);
            rVar2.a0(-1411201631);
            boolean zF = ((i2 & 112) == 32) | rVar2.f(v0VarL) | ((i2 & 14) == 4);
            Object objP3 = rVar2.P();
            if (zF || objP3 == fVar) {
                com.gamericefishpro.space.th.a aVar2 = null;
                com.gamericefishpro.space.db.c cVar = new com.gamericefishpro.space.db.c(onNavigateToDashboard, onNavigateToWebView, v0VarL, aVar2, 2);
                rVar2.k0(cVar);
                objP3 = cVar;
                r4 = aVar2;
            } else {
                r4 = 0;
            }
            rVar2.p(false);
            i.e(rVar2, boolValueOf, (Function2) objP3);
            h0 h0Var = g1.c;
            m mVarD = q.d(h0Var, a0.e(x.f(new s(o.c(4278197305L)), new s(o.c(4278202455L)), new s(o.c(4278194466L))), 0.0f, 14), r4, 6);
            com.gamericefishpro.space.h1.e eVar = com.gamericefishpro.space.h1.b.w;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(eVar, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(mVarD, rVar2);
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
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar4);
            com.gamericefishpro.space.h2.d dVar4 = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar4);
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar5);
            a4.f(rVar2, 0);
            m mVarY = com.gamericefishpro.space.hj.c.Y(h0Var, 0.0f);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            d dVar5 = dVar2;
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarY, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar2);
            i.B(rVar2, l1VarL2, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar4, rVar2, dVar4);
            i.B(rVar2, mVarF2, eVar5);
            float f2 = f + 100.0f;
            com.gamericefishpro.space.i.a.k(R.drawable.blue_fish, -100.0f, f2, 180, 6000, 48, 15.0f, false, rVar2, 1797120, 128);
            com.gamericefishpro.space.i.a.k(R.drawable.red_fish, f2, -100.0f, 350, 8000, 56, -12.0f, true, rVar, 12807168, 0);
            com.gamericefishpro.space.i.a.k(R.drawable.orange_fish, -150.0f, f + 150.0f, 550, 5000, 42, 20.0f, false, rVar, 1797120, 128);
            rVar.p(true);
            com.gamericefishpro.space.h1.c cVar2 = com.gamericefishpro.space.h1.b.G;
            com.gamericefishpro.space.d0.c cVar3 = com.gamericefishpro.space.d0.h.c;
            j jVar = j.a;
            m mVarY2 = com.gamericefishpro.space.hj.c.Y(g1.b(jVar, 1.0f), 1.0f);
            com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(cVar3, cVar2, rVar, 54);
            int iHashCode3 = Long.hashCode(rVar.T);
            l1 l1VarL3 = rVar.l();
            m mVarF3 = h.F(mVarY2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, b0VarA, eVar2);
            i.B(rVar, l1VarL3, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar4, rVar, dVar4);
            i.B(rVar, mVarF3, eVar5);
            m mVarD2 = q.d(com.gamericefishpro.space.l1.h.f(g1.f(jVar, 200), ((Number) zVarE.v.getValue()).floatValue()), a0.d(14, x.f(new s(s.c(b, 0.35f)), new s(s.f))), com.gamericefishpro.space.k0.e.a, 4);
            l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar, false);
            int iHashCode4 = Long.hashCode(rVar.T);
            l1 l1VarL4 = rVar.l();
            m mVarF4 = h.F(mVarD2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, l0VarD3, eVar2);
            i.B(rVar, l1VarL4, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar4, rVar, dVar4);
            i.B(rVar, mVarF4, eVar5);
            com.gamericefishpro.space.t1.b bVarI = com.gamericefishpro.space.u6.f.I(R.drawable.red_fish, rVar, 0);
            float f3 = 32;
            long j = s.c;
            q.b(bVarI, "Ice Fishing", q.g(com.gamericefishpro.space.l1.h.b(g1.f(jVar, 140), com.gamericefishpro.space.k0.e.a(f3)), 2, s.c(j, 0.6f), com.gamericefishpro.space.k0.e.a(f3)), null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar, 24632, 104);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 40), rVar);
            r0.a("ICE FISHING", null, j, com.gamericefishpro.space.hj.c.C(42), k.y, com.gamericefishpro.space.hj.c.C(2), null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(c, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 16.0f), 16769023), rVar, 102261126, 0, 130730);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 8), rVar);
            r0.a("Match the frozen catch!", null, s.c(j, 0.8f), com.gamericefishpro.space.hj.c.C(18), k.v, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(s.c(s.b, 0.5f), 4.0f, 2), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 80), rVar2);
            y3.e(rVar2, 0);
            rVar2.p(true);
            rVar2.p(true);
            dVar3 = dVar5;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.d0.x(onNavigateToDashboard, onNavigateToWebView, dVar3, i, 4);
        }
    }
}
