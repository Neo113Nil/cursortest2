package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.d0.u0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.o1.g0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.t0.y0;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ q d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int i;
    public final /* synthetic */ v0 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    public e(q qVar, Function0 function0, int i, v0 v0Var, int i2, int i3, long j, float f, float f2) {
        this.d = qVar;
        this.e = function0;
        this.i = i;
        this.v = v0Var;
        this.w = i2;
        this.y = i3;
        this.z = j;
        this.A = f;
        this.B = f2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        com.gamericefishpro.space.h2.y yVar;
        com.gamericefishpro.space.h2.y yVar2;
        com.gamericefishpro.space.h2.y yVar3;
        char c;
        byte b;
        float f;
        com.gamericefishpro.space.h1.e eVar;
        ?? r0;
        u0 innerPaddings = (u0) obj;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(innerPaddings, "innerPaddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= rVar.f(innerPaddings) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && rVar.E()) {
            rVar.V();
        } else {
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar4 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar4);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar2);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar, numValueOf, eVar4);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar5);
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = com.gamericefishpro.space.o1.s.b;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(h0Var, com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(fValueOf, new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.75f))), new Pair(Float.valueOf(0.3f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.45f))), new Pair(Float.valueOf(0.7f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.45f))), new Pair(Float.valueOf(1.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.95f)))}), null, 6), rVar, 6);
            float f2 = 16;
            float f3 = 8;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.d0.j.k(h0Var, innerPaddings), f2, f3);
            com.gamericefishpro.space.d0.v vVar = com.gamericefishpro.space.d0.h.b;
            b0 b0VarA = com.gamericefishpro.space.d0.z.a(vVar, com.gamericefishpro.space.h1.b.F, rVar, 0);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarM, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar = yVar4;
                rVar.k(yVar);
            } else {
                yVar = yVar4;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar5);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = g1.b(jVar, 1.0f);
            com.gamericefishpro.space.d0.c cVar = com.gamericefishpro.space.d0.h.e;
            com.gamericefishpro.space.h1.d dVar2 = com.gamericefishpro.space.h1.b.D;
            d1 d1VarA = b1.a(cVar, dVar2, rVar, 54);
            int iHashCode3 = Long.hashCode(rVar.T);
            l1 l1VarL3 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarB, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL3, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF3, eVar5);
            rVar.a0(-2085701068);
            q qVar = this.d;
            boolean zH = rVar.h(qVar);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (zH || objP == fVar) {
                objP = new c(qVar, 1);
                rVar.k0(objP);
            }
            rVar.p(false);
            com.gamericefishpro.space.i.a.e((Function0) objP, rVar, 0);
            com.gamericefishpro.space.h1.c cVar2 = com.gamericefishpro.space.h1.b.G;
            float f4 = 12;
            com.gamericefishpro.space.h1.m mVarB2 = com.gamericefishpro.space.l1.h.b(jVar, com.gamericefishpro.space.k0.e.a(f4));
            long jC = com.gamericefishpro.space.o1.s.c(j, 0.5f);
            g0 g0Var = com.gamericefishpro.space.o1.o.b;
            com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(mVarB2, jC, g0Var);
            float f5 = (float) 1.5d;
            long j2 = com.gamericefishpro.space.o1.s.c;
            com.gamericefishpro.space.h1.m mVarM2 = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.y.q.g(mVarE, f5, com.gamericefishpro.space.o1.s.c(j2, 0.25f), com.gamericefishpro.space.k0.e.a(f4)), 14, f3);
            b0 b0VarA2 = com.gamericefishpro.space.d0.z.a(vVar, cVar2, rVar, 48);
            int iHashCode4 = Long.hashCode(rVar.T);
            l1 l1VarL4 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarM2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA2, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF4, eVar5);
            String str = "LEVEL " + this.i;
            long jC2 = com.gamericefishpro.space.o1.s.c(j2, 0.9f);
            long jC3 = com.gamericefishpro.space.hj.c.C(11);
            com.gamericefishpro.space.h2.y yVar5 = yVar;
            com.gamericefishpro.space.u2.k kVar = com.gamericefishpro.space.u2.k.z;
            r0.a(str, null, jC2, jC3, kVar, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, null, rVar, 102261120, 0, 261802);
            v0 v0Var = this.v;
            String strValueOf = String.valueOf(((g) v0Var.getValue()).b);
            long j3 = com.gamericefishpro.space.l7.c.e;
            com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.y;
            r0.a(strValueOf, null, j3, com.gamericefishpro.space.hj.c.C(24), kVar2, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 8.0f), 16769023), rVar, 1597824, 12582912, 130986);
            r0.a(com.gamericefishpro.space.m5.a.g(((g) v0Var.getValue()).c, "TARGET: "), null, com.gamericefishpro.space.o1.s.c(j2, 0.8f), com.gamericefishpro.space.hj.c.C(10), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            rVar.p(true);
            com.gamericefishpro.space.h1.c cVar3 = com.gamericefishpro.space.h1.b.H;
            com.gamericefishpro.space.h1.m mVarM3 = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(jVar, com.gamericefishpro.space.k0.e.a(f4)), com.gamericefishpro.space.o1.s.c(j, 0.5f), g0Var), f5, com.gamericefishpro.space.o1.s.c(j2, 0.25f), com.gamericefishpro.space.k0.e.a(f4)), f4, f3);
            b0 b0VarA3 = com.gamericefishpro.space.d0.z.a(vVar, cVar3, rVar, 48);
            int iHashCode5 = Long.hashCode(rVar.T);
            l1 l1VarL5 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarM3, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar2 = yVar5;
                rVar.k(yVar2);
            } else {
                yVar2 = yVar5;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA3, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF5, eVar5);
            String str2 = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.y)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            long jC4 = com.gamericefishpro.space.hj.c.C(20);
            i0 i0Var = new i0(new j0(j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 6.0f), 16769023);
            long j4 = this.z;
            com.gamericefishpro.space.h2.y yVar6 = yVar2;
            r0.a(str2, null, j4, jC4, kVar2, 0L, null, 0L, 0, false, 0, 0, i0Var, rVar, 1597440, 12582912, 130986);
            r0.a(com.gamericefishpro.space.m5.a.g(((g) v0Var.getValue()).d, "MOVES: "), null, j2, com.gamericefishpro.space.hj.c.C(11), kVar, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            com.gamericefishpro.space.d0.f fVar2 = com.gamericefishpro.space.d0.h.a;
            d1 d1VarA2 = b1.a(fVar2, dVar2, rVar, 48);
            int iHashCode6 = Long.hashCode(rVar.T);
            l1 l1VarL6 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF6 = com.gamericefishpro.space.d9.h.F(jVar, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar6);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA2, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL6, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode6, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF6, eVar5);
            r0.a("🪙", null, 0L, com.gamericefishpro.space.hj.c.C(10), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 24582, 0, 262126);
            r0.a(com.gamericefishpro.space.m5.a.g(((g) v0Var.getValue()).o, " "), null, f.d, com.gamericefishpro.space.hj.c.C(11), kVar, 0L, null, 0L, 0, false, 0, 0, null, rVar, 1597824, 0, 262058);
            rVar.p(true);
            rVar.p(true);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f4), rVar);
            com.gamericefishpro.space.h1.m mVarB3 = g1.b(jVar, 1.0f);
            d1 d1VarA3 = b1.a(fVar2, dVar2, rVar, 48);
            int iHashCode7 = Long.hashCode(rVar.T);
            l1 l1VarL7 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF7 = com.gamericefishpro.space.d9.h.F(mVarB3, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar3 = yVar6;
                rVar.k(yVar3);
            } else {
                yVar3 = yVar6;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA3, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL7, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode7, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF7, eVar5);
            com.gamericefishpro.space.u1.f fVarB = com.gamericefishpro.space.wa.b.b;
            if (fVarB != null) {
                c = 0;
                b = -1073741824;
            } else {
                com.gamericefishpro.space.u1.e eVar6 = new com.gamericefishpro.space.u1.e("Filled.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                com.gamericefishpro.space.ph.g0 g0Var2 = com.gamericefishpro.space.u1.g0.a;
                long j5 = com.gamericefishpro.space.o1.s.b;
                m0 m0Var = new m0(j5);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new com.gamericefishpro.space.u1.n(9.0f, 1.0f));
                arrayList.add(new com.gamericefishpro.space.u1.t(6.0f));
                arrayList.add(new com.gamericefishpro.space.u1.z(2.0f));
                arrayList.add(new com.gamericefishpro.space.u1.t(-6.0f));
                arrayList.add(com.gamericefishpro.space.u1.j.c);
                com.gamericefishpro.space.u1.e.a(eVar6, arrayList, m0Var);
                m0 m0Var2 = new m0(j5);
                com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
                uVar.B(19.03f, 7.39f);
                uVar.A(1.42f, -1.42f);
                uVar.u(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
                uVar.A(-1.42f, 1.42f);
                uVar.t(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
                uVar.u(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                uVar.u(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
                uVar.E(9.0f, -4.03f, 9.0f, -9.0f);
                uVar.t(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
                uVar.s();
                c = 0;
                uVar.B(13.0f, 14.0f);
                b = -1073741824;
                uVar.y(-2.0f);
                uVar.F(8.0f);
                uVar.y(2.0f);
                uVar.F(14.0f);
                uVar.s();
                com.gamericefishpro.space.u1.e.a(eVar6, (ArrayList) uVar.e, m0Var2);
                fVarB = eVar6.b();
                com.gamericefishpro.space.wa.b.b = fVarB;
            }
            float f6 = 24;
            com.gamericefishpro.space.q0.j.b(fVarB, "Timer", g1.f(jVar, f6), j, r7, 3504);
            com.gamericefishpro.space.hj.c.c(this.A, j4, com.gamericefishpro.space.o1.s.c(j, 0.6f), e1.a(), rVar, 384);
            rVar.p(true);
            float f7 = 6;
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f7), rVar);
            com.gamericefishpro.space.h1.m mVarB4 = g1.b(jVar, 1.0f);
            d1 d1VarA4 = b1.a(fVar2, dVar2, rVar, 48);
            int iHashCode8 = Long.hashCode(rVar.T);
            l1 l1VarL8 = rVar.l();
            com.gamericefishpro.space.h1.m mVarF8 = com.gamericefishpro.space.d9.h.F(mVarB4, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar3);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA4, eVar2);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL8, eVar3);
            com.gamericefishpro.space.m5.a.o(iHashCode8, rVar, eVar4, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF8, eVar5);
            com.gamericefishpro.space.u1.f fVarB2 = y3.c;
            if (fVarB2 != null) {
                f = 4.0f;
            } else {
                com.gamericefishpro.space.u1.e eVar7 = new com.gamericefishpro.space.u1.e("Filled.Score", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                com.gamericefishpro.space.ph.g0 g0Var3 = com.gamericefishpro.space.u1.g0.a;
                m0 m0Var3 = new m0(com.gamericefishpro.space.o1.s.b);
                com.gamericefishpro.space.tb.u uVar2 = new com.gamericefishpro.space.tb.u(1);
                uVar2.B(19.0f, 3.0f);
                uVar2.z(5.0f, 3.0f);
                uVar2.u(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                uVar2.G(14.0f);
                uVar2.u(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                uVar2.y(14.0f);
                uVar2.u(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                uVar2.z(21.0f, 5.0f);
                uVar2.u(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                uVar2.s();
                uVar2.B(12.0f, 5.0f);
                uVar2.y(1.5f);
                uVar2.G(3.0f);
                uVar2.A(2.0f, -3.0f);
                uVar2.y(1.7f);
                uVar2.A(-2.0f, 3.0f);
                uVar2.A(2.0f, 3.0f);
                uVar2.y(-1.7f);
                uVar2.A(-2.0f, -3.0f);
                uVar2.G(3.0f);
                uVar2.z(12.0f, 11.0f);
                uVar2.z(12.0f, 5.0f);
                uVar2.s();
                uVar2.B(7.0f, 7.25f);
                uVar2.y(2.5f);
                uVar2.z(9.5f, 6.5f);
                uVar2.z(7.0f, 6.5f);
                uVar2.z(7.0f, 5.0f);
                f = 4.0f;
                uVar2.y(4.0f);
                uVar2.G(3.75f);
                uVar2.z(8.5f, 8.75f);
                uVar2.G(0.75f);
                uVar2.z(11.0f, 9.5f);
                uVar2.z(11.0f, 11.0f);
                uVar2.z(7.0f, 11.0f);
                uVar2.z(7.0f, 7.25f);
                uVar2.s();
                uVar2.B(19.0f, 13.0f);
                uVar2.A(-6.0f, 6.0f);
                uVar2.A(-4.0f, -4.0f);
                uVar2.A(-4.0f, 4.0f);
                uVar2.G(-2.5f);
                uVar2.A(4.0f, -4.0f);
                uVar2.A(4.0f, 4.0f);
                uVar2.A(6.0f, -6.0f);
                uVar2.z(19.0f, 13.0f);
                uVar2.s();
                com.gamericefishpro.space.u1.e.a(eVar7, (ArrayList) uVar2.e, m0Var3);
                fVarB2 = eVar7.b();
                y3.c = fVarB2;
            }
            com.gamericefishpro.space.q0.j.b(fVarB2, "Score", g1.f(jVar, f6), j, rVar, 3504);
            com.gamericefishpro.space.hj.c.c(this.B, j3, com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.k(), 0.6f), e1.a(), rVar, 432);
            com.gamericefishpro.space.t0.r rVar2 = rVar;
            rVar2.r();
            com.gamericefishpro.space.h1.m mVarD = g1.d(g1.b(jVar, 1.0f), 48);
            com.gamericefishpro.space.h1.e eVar8 = com.gamericefishpro.space.h1.b.w;
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar8, false);
            int iHashCode9 = Long.hashCode(com.gamericefishpro.space.t0.i.r(rVar2));
            l1 l1VarZ = rVar2.z();
            com.gamericefishpro.space.h1.m mVarF9 = com.gamericefishpro.space.d9.h.F(mVarD, rVar2);
            com.gamericefishpro.space.h2.y yVarB = com.gamericefishpro.space.h2.f.b();
            rVar2.d0();
            if (rVar2.D()) {
                rVar2.k(yVarB);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, com.gamericefishpro.space.h2.f.d());
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarZ, com.gamericefishpro.space.h2.f.f());
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode9), com.gamericefishpro.space.h2.f.c());
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.a());
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF9, com.gamericefishpro.space.h2.f.e());
            rVar2.a0(-2085521266);
            if (f.b(v0Var).q != null) {
                com.gamericefishpro.space.i7.d dVar3 = f.b(v0Var).q;
                Intrinsics.b(dVar3);
                com.gamericefishpro.space.w.z zVarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("hint", rVar2), 0.5f, 1.0f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 2, com.gamericefishpro.space.w.t.a), com.gamericefishpro.space.w.j0.e), "hint_a", rVar2, 29112);
                com.gamericefishpro.space.h1.m mVarM4 = com.gamericefishpro.space.d0.j.m(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f4)), com.gamericefishpro.space.o1.s.c(f.c(dVar3), ((Number) zVarE.v.getValue()).floatValue() * 0.3f), com.gamericefishpro.space.o1.o.b), 2, com.gamericefishpro.space.o1.s.c(f.c(dVar3), ((Number) zVarE.v.getValue()).floatValue()), com.gamericefishpro.space.k0.e.a(f4)), f4, f7);
                l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar8, false);
                int iHashCode10 = Long.hashCode(com.gamericefishpro.space.t0.i.r(rVar2));
                l1 l1VarZ2 = rVar2.z();
                com.gamericefishpro.space.h1.m mVarF10 = com.gamericefishpro.space.d9.h.F(mVarM4, rVar2);
                com.gamericefishpro.space.h2.y yVarB2 = com.gamericefishpro.space.h2.f.b();
                rVar2.d0();
                if (rVar2.D()) {
                    rVar2.k(yVarB2);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, l0VarD3, com.gamericefishpro.space.h2.f.d());
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarZ2, com.gamericefishpro.space.h2.f.f());
                com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode10), com.gamericefishpro.space.h2.f.c());
                com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.a());
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF10, com.gamericefishpro.space.h2.f.e());
                eVar = eVar8;
                r0 = 0;
                r0.a(y0.g("👆 Tap a tile to activate ", dVar3.e, "\nTap button again to cancel"), null, com.gamericefishpro.space.o1.s.c, com.gamericefishpro.space.hj.c.C(12), kVar, 0L, new com.gamericefishpro.space.b3.k(3), 0L, 0, false, 0, 0, new i0(new j0(com.gamericefishpro.space.o1.o.k(), f, 2), 16769023), rVar2, 1597824, 12582912, 129962);
                rVar2 = rVar2;
                rVar2.r();
            } else {
                eVar = eVar8;
                r0 = 0;
            }
            rVar2.s();
            rVar2.r();
            com.gamericefishpro.space.h1.m mVarA = c0.a(g1.b(r0, 1.0f));
            l0 l0VarD4 = com.gamericefishpro.space.d0.r.d(eVar, r0);
            int iHashCode11 = Long.hashCode(com.gamericefishpro.space.t0.i.r(rVar2));
            l1 l1VarZ3 = rVar2.z();
            com.gamericefishpro.space.h1.m mVarF11 = com.gamericefishpro.space.d9.h.F(mVarA, rVar2);
            com.gamericefishpro.space.h2.y yVarB3 = com.gamericefishpro.space.h2.f.b();
            rVar2.d0();
            if (rVar2.D()) {
                rVar2.k(yVarB3);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD4, com.gamericefishpro.space.h2.f.d());
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarZ3, com.gamericefishpro.space.h2.f.f());
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode11), com.gamericefishpro.space.h2.f.c());
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.a());
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF11, com.gamericefishpro.space.h2.f.e());
            com.gamericefishpro.space.h1.m mVarB5 = com.gamericefishpro.space.l1.h.b(g1.a(g1.b(r0, 1.0f)), com.gamericefishpro.space.k0.e.a(26));
            long j6 = f.c;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.l1.h.a(com.gamericefishpro.space.y.q.d(mVarB5, com.gamericefishpro.space.n9.a0.d(10, com.gamericefishpro.space.ph.x.f(com.gamericefishpro.space.o1.s.a(com.gamericefishpro.space.o1.s.c(j6, 0.25f)), com.gamericefishpro.space.o1.s.a(com.gamericefishpro.space.o1.s.f))), null, 6), 20), rVar2, r0);
            com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.l1.h.g(g1.a(g1.b(r0, 1.0f)), r10, com.gamericefishpro.space.k0.e.a(r10), com.gamericefishpro.space.o1.s.c(j6, 0.4f), com.gamericefishpro.space.o1.s.c(j6, 0.6f), 4), com.gamericefishpro.space.k0.e.a(r10)), com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278196272L), 0.95f), com.gamericefishpro.space.o1.o.b), 2, com.gamericefishpro.space.o1.s.c(j6, 0.5f), com.gamericefishpro.space.k0.e.a(f6)), f3);
            l0 l0VarD5 = com.gamericefishpro.space.d0.r.d(eVar, r0);
            int iHashCode12 = Long.hashCode(com.gamericefishpro.space.t0.i.r(rVar2));
            l1 l1VarZ4 = rVar2.z();
            com.gamericefishpro.space.h1.m mVarF12 = com.gamericefishpro.space.d9.h.F(mVarL, rVar2);
            com.gamericefishpro.space.h2.y yVarB4 = com.gamericefishpro.space.h2.f.b();
            rVar2.d0();
            if (rVar2.D()) {
                rVar2.k(yVarB4);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD5, com.gamericefishpro.space.h2.f.d());
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarZ4, com.gamericefishpro.space.h2.f.f());
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode12), com.gamericefishpro.space.h2.f.c());
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.a());
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF12, com.gamericefishpro.space.h2.f.e());
            List list = f.b(v0Var).a;
            Pair pair = f.b(v0Var).g;
            com.gamericefishpro.space.i7.d dVar4 = f.b(v0Var).q;
            a0 a0Var = f.b(v0Var).r;
            rVar2.a0(2027466789);
            boolean zH2 = rVar2.h(qVar);
            Object objP2 = rVar2.P();
            if (zH2 || objP2 == fVar) {
                objP2 = new n1(8, qVar);
                rVar2.k0(objP2);
            }
            rVar2.s();
            com.gamericefishpro.space.d9.h.d(list, pair, dVar4, a0Var, (Function2) objP2, rVar2, 0);
            rVar2.r();
            rVar2.r();
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f2), rVar2);
            Map map = f.b(v0Var).p;
            int i = f.b(v0Var).o;
            com.gamericefishpro.space.i7.d dVar5 = f.b(v0Var).q;
            rVar2.a0(78887226);
            boolean zH3 = rVar2.h(qVar);
            Object objP3 = rVar2.P();
            if (zH3 || objP3 == fVar) {
                objP3 = new d(qVar, r0);
                rVar2.k0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            rVar2.s();
            rVar2.a0(78889525);
            boolean zH4 = rVar2.h(qVar);
            Object objP4 = rVar2.P();
            if (zH4 || objP4 == fVar) {
                objP4 = new d(qVar, 1);
                rVar2.k0(objP4);
            }
            rVar2.s();
            y3.f(map, i, dVar5, function1, (Function1) objP4, rVar2, 0);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f3), rVar2);
            rVar2.r();
            rVar2.a0(-2021386823);
            if (f.b(v0Var).j) {
                rVar2.a0(-2021384073);
                boolean zH5 = rVar2.h(qVar);
                Object objP5 = rVar2.P();
                if (zH5 || objP5 == fVar) {
                    objP5 = new c(qVar, 2);
                    rVar2.k0(objP5);
                }
                Function0 function0 = (Function0) objP5;
                rVar2.s();
                rVar2.a0(-2021382081);
                boolean zH6 = rVar2.h(qVar);
                Function0 function2 = this.e;
                boolean zF = zH6 | rVar2.f(function2);
                Object objP6 = rVar2.P();
                if (zF || objP6 == fVar) {
                    objP6 = new com.gamericefishpro.space.e.e(7, qVar, function2);
                    rVar2.k0(objP6);
                }
                rVar2.s();
                com.gamericefishpro.space.b9.a.c(function0, (Function0) objP6, rVar2, r0);
            }
            rVar2.s();
            rVar2.r();
        }
        return Unit.a;
    }
}
