package com.gamericefishpro.space.g5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.o1.g0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.q0.d0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v50 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        ?? r0;
        Object obj4;
        v0 v0Var;
        int i = this.d;
        com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
        com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
        Object obj5 = this.i;
        Object obj6 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.E()) {
                    rVar.V();
                } else {
                    ((o) obj6).z.a((com.gamericefishpro.space.f5.k) obj5, rVar, 0);
                }
                break;
            case 1:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar2.E()) {
                    rVar2.V();
                } else {
                    a4.k((com.gamericefishpro.space.e1.c) obj6, (com.gamericefishpro.space.b1.h) obj5, rVar2, 0);
                }
                break;
            case 2:
                com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj;
                com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar3.E()) {
                    rVar3.V();
                } else {
                    com.gamericefishpro.space.f5.x xVar = kVar.e;
                    Intrinsics.c(xVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((h) xVar).y.c((com.gamericefishpro.space.v.k) obj6, kVar, rVar3, 0);
                }
                break;
            case 3:
                com.gamericefishpro.space.t0.r rVar4 = (com.gamericefishpro.space.t0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar4.E()) {
                    rVar4.V();
                } else {
                    float f = 28;
                    com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f));
                    long jC = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.98f);
                    g0 g0Var = com.gamericefishpro.space.o1.o.b;
                    com.gamericefishpro.space.h1.m mVarE = com.gamericefishpro.space.y.q.e(mVarB, jC, g0Var);
                    float f2 = 2;
                    long j = com.gamericefishpro.space.o1.s.c;
                    com.gamericefishpro.space.h1.m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(mVarE, f2, com.gamericefishpro.space.o1.s.c(j, 0.4f), com.gamericefishpro.space.k0.e.a(f)), f);
                    Function0 function0 = (Function0) obj6;
                    Function0 function1 = (Function0) obj5;
                    l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode = Long.hashCode(rVar4.T);
                    l1 l1VarL = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarL, rVar4);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
                    com.gamericefishpro.space.t0.i.B(rVar4, l0VarD, eVar);
                    com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
                    com.gamericefishpro.space.t0.i.t(rVar4, numValueOf, eVar3);
                    com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF, eVar4);
                    com.gamericefishpro.space.h1.c cVar = com.gamericefishpro.space.h1.b.G;
                    com.gamericefishpro.space.h1.m mVarB2 = g1.b(jVar, 1.0f);
                    com.gamericefishpro.space.d0.b0 b0VarA = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.b, cVar, rVar4, 48);
                    int iHashCode2 = Long.hashCode(rVar4.T);
                    l1 l1VarL2 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarB2, rVar4);
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, b0VarA, eVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL2, eVar2);
                    com.gamericefishpro.space.t0.i.t(rVar4, Integer.valueOf(iHashCode2), eVar3);
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF2, eVar4);
                    com.gamericefishpro.space.h1.m mVarF3 = g1.f(jVar, 72);
                    com.gamericefishpro.space.k0.d dVar2 = com.gamericefishpro.space.k0.e.a;
                    com.gamericefishpro.space.h1.m mVarB3 = com.gamericefishpro.space.l1.h.b(mVarF3, dVar2);
                    long j2 = com.gamericefishpro.space.n7.f.b;
                    com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarB3, com.gamericefishpro.space.o1.s.c(j2, 0.2f), g0Var), f2, com.gamericefishpro.space.o1.s.c(j2, 0.5f), dVar2);
                    com.gamericefishpro.space.h1.e eVar5 = com.gamericefishpro.space.h1.b.w;
                    l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar5, false);
                    int iHashCode3 = Long.hashCode(rVar4.T);
                    l1 l1VarL3 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarG, rVar4);
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, l0VarD2, eVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL3, eVar2);
                    com.gamericefishpro.space.t0.i.t(rVar4, Integer.valueOf(iHashCode3), eVar3);
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF4, eVar4);
                    com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.C(), null, g1.f(jVar, 42), j2, rVar4, 3504);
                    rVar4.p(true);
                    float f3 = 20;
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, f3), rVar4);
                    long jC2 = com.gamericefishpro.space.hj.c.C(26);
                    com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.z;
                    r0.a("PAUSED", null, j, jC2, kVar2, com.gamericefishpro.space.hj.c.C(2), null, 0L, 0, false, 0, 0, null, rVar4, 102261126, 0, 261802);
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, 12), rVar4);
                    r0.a("Are you sure you want to exit? Your current level progress will melt away.", null, com.gamericefishpro.space.o1.s.c(j, 0.85f), com.gamericefishpro.space.hj.c.C(16), null, 0L, new com.gamericefishpro.space.b3.k(3), com.gamericefishpro.space.hj.c.C(24), 0, false, 0, 0, null, rVar4, 24966, 48, 259050);
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, 32), rVar4);
                    com.gamericefishpro.space.h1.m mVarB4 = g1.b(jVar, 1.0f);
                    d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.g(16), com.gamericefishpro.space.h1.b.C, rVar4, 6);
                    int iHashCode4 = Long.hashCode(rVar4.T);
                    l1 l1VarL4 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarB4, rVar4);
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, d1VarA, eVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL4, eVar2);
                    com.gamericefishpro.space.t0.i.t(rVar4, Integer.valueOf(iHashCode4), eVar3);
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF5, eVar4);
                    float f4 = 56;
                    com.gamericefishpro.space.h1.m mVarE2 = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.d(e1.a(), f4), com.gamericefishpro.space.k0.e.a(f3)), com.gamericefishpro.space.o1.s.c(j, 0.15f), g0Var);
                    rVar4.a0(1536996125);
                    boolean zF = rVar4.f(function0);
                    Object objP = rVar4.P();
                    if (zF || objP == fVar) {
                        z = false;
                        com.gamericefishpro.space.n7.r rVar5 = new com.gamericefishpro.space.n7.r(0, function0);
                        rVar4.k0(rVar5);
                        obj3 = rVar5;
                    } else {
                        z = false;
                        obj3 = objP;
                    }
                    rVar4.p(z);
                    com.gamericefishpro.space.h1.m mVarJ = com.gamericefishpro.space.y.q.j(mVarE2, (Function0) obj3);
                    l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(eVar5, z);
                    int iHashCode5 = Long.hashCode(rVar4.T);
                    l1 l1VarL5 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF6 = com.gamericefishpro.space.d9.h.F(mVarJ, rVar4);
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, l0VarD3, eVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL5, eVar2);
                    com.gamericefishpro.space.t0.i.t(rVar4, Integer.valueOf(iHashCode5), eVar3);
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF6, eVar4);
                    r0.a("Exit Level", null, com.gamericefishpro.space.n7.f.a, com.gamericefishpro.space.hj.c.C(16), kVar2, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 1597830, 0, 262058);
                    rVar4.p(true);
                    com.gamericefishpro.space.h1.m mVarE3 = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.d(e1.a(), f4), com.gamericefishpro.space.k0.e.a(f3)), com.gamericefishpro.space.l7.c.b, g0Var);
                    rVar4.a0(1537017247);
                    boolean zF2 = rVar4.f(function1);
                    Object objP2 = rVar4.P();
                    Object obj7 = objP2;
                    if (zF2 || objP2 == fVar) {
                        com.gamericefishpro.space.n7.r rVar6 = new com.gamericefishpro.space.n7.r(1, function1);
                        rVar4.k0(rVar6);
                        obj7 = rVar6;
                    }
                    rVar4.p(false);
                    com.gamericefishpro.space.h1.m mVarJ2 = com.gamericefishpro.space.y.q.j(mVarE3, (Function0) obj7);
                    l0 l0VarD4 = com.gamericefishpro.space.d0.r.d(eVar5, false);
                    int iHashCode6 = Long.hashCode(rVar4.T);
                    l1 l1VarL6 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF7 = com.gamericefishpro.space.d9.h.F(mVarJ2, rVar4);
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, l0VarD4, eVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL6, eVar2);
                    com.gamericefishpro.space.t0.i.t(rVar4, Integer.valueOf(iHashCode6), eVar3);
                    com.gamericefishpro.space.t0.i.x(rVar4, dVar);
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF7, eVar4);
                    r0.a("Continue", null, j, com.gamericefishpro.space.hj.c.C(16), kVar2, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 1597830, 0, 262058);
                    rVar4.p(true);
                    rVar4.p(true);
                    rVar4.p(true);
                    rVar4.p(true);
                }
                break;
            case 4:
                com.gamericefishpro.space.t0.r rVar7 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar7.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    com.gamericefishpro.space.b1.h hVar = (com.gamericefishpro.space.b1.h) obj6;
                    d0 d0Var = (d0) obj5;
                    l0 l0VarD5 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode7 = Long.hashCode(rVar7.T);
                    l1 l1VarL7 = rVar7.l();
                    com.gamericefishpro.space.h1.m mVarF8 = com.gamericefishpro.space.d9.h.F(jVar, rVar7);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar2 = com.gamericefishpro.space.h2.f.b;
                    rVar7.d0();
                    if (rVar7.S) {
                        rVar7.k(yVar2);
                    } else {
                        rVar7.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar7, l0VarD5, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar7, l1VarL7, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.f;
                    if (rVar7.S || !Intrinsics.a(rVar7.P(), Integer.valueOf(iHashCode7))) {
                        rVar7.k0(Integer.valueOf(iHashCode7));
                        rVar7.b(Integer.valueOf(iHashCode7), eVar6);
                    }
                    com.gamericefishpro.space.t0.i.B(rVar7, mVarF8, com.gamericefishpro.space.h2.f.c);
                    hVar.a(d0Var, rVar7, 6);
                    rVar7.p(true);
                } else {
                    rVar7.V();
                }
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.t0.r rVar8 = (com.gamericefishpro.space.t0.r) obj;
                s2 s2Var = (s2) obj5;
                final com.gamericefishpro.space.s7.i iVar = (com.gamericefishpro.space.s7.i) obj6;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar8.E()) {
                    rVar8.V();
                } else {
                    boolean z2 = ((com.gamericefishpro.space.s7.e) s2Var.getValue()).a;
                    com.gamericefishpro.space.u1.f fVarB = com.gamericefishpro.space.d9.h.g;
                    if (fVarB == null) {
                        com.gamericefishpro.space.u1.e eVar7 = new com.gamericefishpro.space.u1.e("Filled.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        com.gamericefishpro.space.ph.g0 g0Var2 = com.gamericefishpro.space.u1.g0.a;
                        m0 m0Var = new m0(com.gamericefishpro.space.o1.s.b);
                        com.gamericefishpro.space.tb.u uVar = new com.gamericefishpro.space.tb.u(1);
                        uVar.B(12.0f, 3.0f);
                        uVar.G(10.55f);
                        uVar.u(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
                        uVar.u(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
                        uVar.E(1.79f, 4.0f, 4.0f, 4.0f);
                        uVar.E(4.0f, -1.79f, 4.0f, -4.0f);
                        uVar.F(7.0f);
                        uVar.y(4.0f);
                        uVar.F(3.0f);
                        uVar.y(-6.0f);
                        uVar.s();
                        com.gamericefishpro.space.u1.e.a(eVar7, (ArrayList) uVar.e, m0Var);
                        fVarB = eVar7.b();
                        com.gamericefishpro.space.d9.h.g = fVarB;
                    }
                    com.gamericefishpro.space.u1.f fVar2 = fVarB;
                    rVar8.a0(-143612175);
                    boolean zH = rVar8.h(iVar);
                    Object objP3 = rVar8.P();
                    if (zH || objP3 == fVar) {
                        r0 = 0;
                        final boolean z3 = false ? 1 : 0;
                        Function0 function2 = new Function0() { // from class: com.gamericefishpro.space.s7.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (z3) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i iVar2 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar2), null, new h(iVar2, ((e) iVar2.c.d.getValue()).a, null, 0), 3);
                                        break;
                                    case 1:
                                        i iVar3 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar3), null, new h(iVar3, ((e) iVar3.c.d.getValue()).b, null, 1), 3);
                                        break;
                                    default:
                                        i iVar4 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar4), null, new h(iVar4, ((e) iVar4.c.d.getValue()).c, null, 2), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        rVar8.k0(function2);
                        obj4 = function2;
                    } else {
                        r0 = 0;
                        obj4 = objP3;
                    }
                    rVar8.p(r0);
                    com.gamericefishpro.space.i.a.c("Music", z2, fVar2, (Function0) obj4, rVar8, 6);
                    a4.e(rVar8, r0);
                    boolean z4 = ((com.gamericefishpro.space.s7.e) s2Var.getValue()).b;
                    com.gamericefishpro.space.u1.f fVarB2 = com.gamericefishpro.space.b9.a.f;
                    if (fVarB2 == null) {
                        com.gamericefishpro.space.u1.e eVar8 = new com.gamericefishpro.space.u1.e("Filled.VolumeUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        com.gamericefishpro.space.ph.g0 g0Var3 = com.gamericefishpro.space.u1.g0.a;
                        m0 m0Var2 = new m0(com.gamericefishpro.space.o1.s.b);
                        com.gamericefishpro.space.tb.u uVar2 = new com.gamericefishpro.space.tb.u(1);
                        uVar2.B(3.0f, 9.0f);
                        uVar2.G(6.0f);
                        uVar2.y(4.0f);
                        uVar2.A(5.0f, 5.0f);
                        uVar2.z(12.0f, 4.0f);
                        uVar2.z(7.0f, 9.0f);
                        uVar2.z(3.0f, 9.0f);
                        uVar2.s();
                        uVar2.B(16.5f, 12.0f);
                        uVar2.u(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        uVar2.G(8.05f);
                        uVar2.u(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
                        uVar2.s();
                        uVar2.B(14.0f, 3.23f);
                        uVar2.G(2.06f);
                        uVar2.u(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
                        uVar2.E(-2.11f, 5.85f, -5.0f, 6.71f);
                        uVar2.G(2.06f);
                        uVar2.u(4.01f, -0.91f, 7.0f, -4.49f, 7.0f, -8.77f);
                        uVar2.E(-2.99f, -7.86f, -7.0f, -8.77f);
                        uVar2.s();
                        com.gamericefishpro.space.u1.e.a(eVar8, (ArrayList) uVar2.e, m0Var2);
                        fVarB2 = eVar8.b();
                        com.gamericefishpro.space.b9.a.f = fVarB2;
                    }
                    com.gamericefishpro.space.u1.f fVar3 = fVarB2;
                    rVar8.a0(-143601585);
                    boolean zH2 = rVar8.h(iVar);
                    Object objP4 = rVar8.P();
                    Object obj8 = objP4;
                    if (zH2 || objP4 == fVar) {
                        final int i2 = 1;
                        Function0 function3 = new Function0() { // from class: com.gamericefishpro.space.s7.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i iVar2 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar2), null, new h(iVar2, ((e) iVar2.c.d.getValue()).a, null, 0), 3);
                                        break;
                                    case 1:
                                        i iVar3 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar3), null, new h(iVar3, ((e) iVar3.c.d.getValue()).b, null, 1), 3);
                                        break;
                                    default:
                                        i iVar4 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar4), null, new h(iVar4, ((e) iVar4.c.d.getValue()).c, null, 2), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        rVar8.k0(function3);
                        obj8 = function3;
                    }
                    rVar8.p(false);
                    com.gamericefishpro.space.i.a.c("Sound Effects", z4, fVar3, (Function0) obj8, rVar8, 6);
                    a4.e(rVar8, 0);
                    boolean z5 = ((com.gamericefishpro.space.s7.e) s2Var.getValue()).c;
                    com.gamericefishpro.space.u1.f fVarB3 = com.gamericefishpro.space.a.a.b;
                    if (fVarB3 == null) {
                        com.gamericefishpro.space.u1.e eVar9 = new com.gamericefishpro.space.u1.e("Filled.Vibration", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        com.gamericefishpro.space.ph.g0 g0Var4 = com.gamericefishpro.space.u1.g0.a;
                        m0 m0Var3 = new m0(com.gamericefishpro.space.o1.s.b);
                        com.gamericefishpro.space.tb.u uVar3 = new com.gamericefishpro.space.tb.u(1);
                        uVar3.B(0.0f, 15.0f);
                        uVar3.y(2.0f);
                        uVar3.z(2.0f, 9.0f);
                        uVar3.z(0.0f, 9.0f);
                        uVar3.G(6.0f);
                        uVar3.s();
                        uVar3.B(3.0f, 17.0f);
                        uVar3.y(2.0f);
                        uVar3.z(5.0f, 7.0f);
                        uVar3.z(3.0f, 7.0f);
                        uVar3.G(10.0f);
                        uVar3.s();
                        uVar3.B(22.0f, 9.0f);
                        uVar3.G(6.0f);
                        uVar3.y(2.0f);
                        uVar3.z(24.0f, 9.0f);
                        uVar3.y(-2.0f);
                        uVar3.s();
                        uVar3.B(19.0f, 17.0f);
                        uVar3.y(2.0f);
                        uVar3.z(21.0f, 7.0f);
                        uVar3.y(-2.0f);
                        uVar3.G(10.0f);
                        uVar3.s();
                        uVar3.B(16.5f, 3.0f);
                        uVar3.y(-9.0f);
                        uVar3.t(6.67f, 3.0f, 6.0f, 3.67f, 6.0f, 4.5f);
                        uVar3.G(15.0f);
                        uVar3.u(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
                        uVar3.y(9.0f);
                        uVar3.u(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
                        uVar3.G(-15.0f);
                        uVar3.u(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                        uVar3.s();
                        uVar3.B(16.0f, 19.0f);
                        uVar3.z(8.0f, 19.0f);
                        uVar3.z(8.0f, 5.0f);
                        uVar3.y(8.0f);
                        uVar3.G(14.0f);
                        uVar3.s();
                        com.gamericefishpro.space.u1.e.a(eVar9, (ArrayList) uVar3.e, m0Var3);
                        fVarB3 = eVar9.b();
                        com.gamericefishpro.space.a.a.b = fVarB3;
                    }
                    com.gamericefishpro.space.u1.f fVar4 = fVarB3;
                    rVar8.a0(-143590955);
                    boolean zH3 = rVar8.h(iVar);
                    Object objP5 = rVar8.P();
                    Object obj9 = objP5;
                    if (zH3 || objP5 == fVar) {
                        final int i3 = 2;
                        Function0 function4 = new Function0() { // from class: com.gamericefishpro.space.s7.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i iVar2 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar2), null, new h(iVar2, ((e) iVar2.c.d.getValue()).a, null, 0), 3);
                                        break;
                                    case 1:
                                        i iVar3 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar3), null, new h(iVar3, ((e) iVar3.c.d.getValue()).b, null, 1), 3);
                                        break;
                                    default:
                                        i iVar4 = iVar;
                                        a0.u(com.gamericefishpro.space.z4.m0.h(iVar4), null, new h(iVar4, ((e) iVar4.c.d.getValue()).c, null, 2), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        rVar8.k0(function4);
                        obj9 = function4;
                    }
                    rVar8.p(false);
                    com.gamericefishpro.space.i.a.c("Vibration", z5, fVar4, (Function0) obj9, rVar8, 6);
                }
                break;
            default:
                com.gamericefishpro.space.t0.r rVar9 = (com.gamericefishpro.space.t0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar9.E()) {
                    rVar9.V();
                } else {
                    float f5 = 24;
                    com.gamericefishpro.space.h1.m mVarB5 = com.gamericefishpro.space.l1.h.b(g1.b(jVar, 1.0f), com.gamericefishpro.space.k0.e.a(f5));
                    long jC3 = com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.95f);
                    g0 g0Var5 = com.gamericefishpro.space.o1.o.b;
                    com.gamericefishpro.space.h1.m mVarE4 = com.gamericefishpro.space.y.q.e(mVarB5, jC3, g0Var5);
                    float f6 = 1;
                    long j3 = com.gamericefishpro.space.o1.s.c;
                    com.gamericefishpro.space.h1.m mVarL2 = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(mVarE4, f6, com.gamericefishpro.space.o1.s.c(j3, 0.3f), com.gamericefishpro.space.k0.e.a(f5)), f5);
                    com.gamericefishpro.space.s7.i iVar2 = (com.gamericefishpro.space.s7.i) obj6;
                    v0 v0Var2 = (v0) obj5;
                    l0 l0VarD6 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode8 = Long.hashCode(rVar9.T);
                    l1 l1VarL8 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF9 = com.gamericefishpro.space.d9.h.F(mVarL2, rVar9);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar3 = com.gamericefishpro.space.h2.f.b;
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.h2.e eVar10 = com.gamericefishpro.space.h2.f.e;
                    com.gamericefishpro.space.t0.i.B(rVar9, l0VarD6, eVar10);
                    com.gamericefishpro.space.h2.e eVar11 = com.gamericefishpro.space.h2.f.d;
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL8, eVar11);
                    Integer numValueOf2 = Integer.valueOf(iHashCode8);
                    com.gamericefishpro.space.h2.e eVar12 = com.gamericefishpro.space.h2.f.f;
                    com.gamericefishpro.space.t0.i.t(rVar9, numValueOf2, eVar12);
                    com.gamericefishpro.space.h2.d dVar3 = com.gamericefishpro.space.h2.f.g;
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.h2.e eVar13 = com.gamericefishpro.space.h2.f.c;
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF9, eVar13);
                    com.gamericefishpro.space.h1.c cVar2 = com.gamericefishpro.space.h1.b.G;
                    com.gamericefishpro.space.h1.m mVarB6 = g1.b(jVar, 1.0f);
                    com.gamericefishpro.space.d0.b0 b0VarA2 = com.gamericefishpro.space.d0.z.a(com.gamericefishpro.space.d0.h.b, cVar2, rVar9, 48);
                    int iHashCode9 = Long.hashCode(rVar9.T);
                    l1 l1VarL9 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF10 = com.gamericefishpro.space.d9.h.F(mVarB6, rVar9);
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar9, b0VarA2, eVar10);
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL9, eVar11);
                    com.gamericefishpro.space.t0.i.t(rVar9, Integer.valueOf(iHashCode9), eVar12);
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF10, eVar13);
                    com.gamericefishpro.space.h1.m mVarF11 = g1.f(jVar, 64);
                    com.gamericefishpro.space.k0.d dVar4 = com.gamericefishpro.space.k0.e.a;
                    com.gamericefishpro.space.h1.m mVarB7 = com.gamericefishpro.space.l1.h.b(mVarF11, dVar4);
                    long j4 = com.gamericefishpro.space.s7.d.b;
                    com.gamericefishpro.space.h1.m mVarG2 = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarB7, com.gamericefishpro.space.o1.s.c(j4, 0.2f), g0Var5), f6, com.gamericefishpro.space.o1.s.c(j4, 0.5f), dVar4);
                    com.gamericefishpro.space.h1.e eVar14 = com.gamericefishpro.space.h1.b.w;
                    l0 l0VarD7 = com.gamericefishpro.space.d0.r.d(eVar14, false);
                    int iHashCode10 = Long.hashCode(rVar9.T);
                    l1 l1VarL10 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF12 = com.gamericefishpro.space.d9.h.F(mVarG2, rVar9);
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar9, l0VarD7, eVar10);
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL10, eVar11);
                    com.gamericefishpro.space.t0.i.t(rVar9, Integer.valueOf(iHashCode10), eVar12);
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF12, eVar13);
                    com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.d9.h.C(), null, g1.f(jVar, 36), j4, rVar9, 3504);
                    rVar9.p(true);
                    float f7 = 16;
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, f7), rVar9);
                    long jC4 = com.gamericefishpro.space.hj.c.C(22);
                    com.gamericefishpro.space.u2.k kVar3 = com.gamericefishpro.space.u2.k.y;
                    r0.a("Delete Progress?", null, j3, jC4, kVar3, 0L, null, 0L, 0, false, 0, 0, null, rVar9, 1597830, 0, 262058);
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, 8), rVar9);
                    r0.a("This action is permanent. All your levels, coins, and achievements will be lost in the icy depths.", null, com.gamericefishpro.space.o1.s.c(j3, 0.75f), com.gamericefishpro.space.hj.c.C(15), null, 0L, new com.gamericefishpro.space.b3.k(3), com.gamericefishpro.space.hj.c.C(22), 0, false, 0, 0, null, rVar9, 24966, 48, 259050);
                    com.gamericefishpro.space.d0.j.c(g1.d(jVar, f5), rVar9);
                    com.gamericefishpro.space.h1.m mVarB8 = g1.b(jVar, 1.0f);
                    d1 d1VarA2 = b1.a(com.gamericefishpro.space.d0.h.g(12), com.gamericefishpro.space.h1.b.C, rVar9, 6);
                    int iHashCode11 = Long.hashCode(rVar9.T);
                    l1 l1VarL11 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF13 = com.gamericefishpro.space.d9.h.F(mVarB8, rVar9);
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar9, d1VarA2, eVar10);
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL11, eVar11);
                    com.gamericefishpro.space.t0.i.t(rVar9, Integer.valueOf(iHashCode11), eVar12);
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF13, eVar13);
                    float f8 = 50;
                    com.gamericefishpro.space.h1.m mVarE5 = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.d(e1.a(), f8), com.gamericefishpro.space.k0.e.a(f7)), com.gamericefishpro.space.o1.s.c(j3, 0.1f), g0Var5);
                    rVar9.a0(-143436749);
                    Object objP6 = rVar9.P();
                    if (objP6 == fVar) {
                        v0Var = v0Var2;
                        objP6 = new com.gamericefishpro.space.f0.k(v0Var, 5);
                        rVar9.k0(objP6);
                    } else {
                        v0Var = v0Var2;
                    }
                    rVar9.p(false);
                    com.gamericefishpro.space.h1.m mVarJ3 = com.gamericefishpro.space.y.q.j(mVarE5, (Function0) objP6);
                    l0 l0VarD8 = com.gamericefishpro.space.d0.r.d(eVar14, false);
                    v0 v0Var3 = v0Var;
                    int iHashCode12 = Long.hashCode(rVar9.T);
                    l1 l1VarL12 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF14 = com.gamericefishpro.space.d9.h.F(mVarJ3, rVar9);
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar9, l0VarD8, eVar10);
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL12, eVar11);
                    com.gamericefishpro.space.t0.i.t(rVar9, Integer.valueOf(iHashCode12), eVar12);
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF14, eVar13);
                    r0.a("Cancel", null, r11, 0L, com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar9, 1573254, 0, 262074);
                    rVar9.p(true);
                    com.gamericefishpro.space.h1.m mVarE6 = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.d(e1.a(), f8), com.gamericefishpro.space.k0.e.a(f7)), j4, g0Var5);
                    rVar9.a0(-143418282);
                    boolean zH4 = rVar9.h(iVar2);
                    Object objP7 = rVar9.P();
                    if (zH4 || objP7 == fVar) {
                        objP7 = new com.gamericefishpro.space.e.e(8, iVar2, v0Var3);
                        rVar9.k0(objP7);
                    }
                    rVar9.p(false);
                    com.gamericefishpro.space.h1.m mVarJ4 = com.gamericefishpro.space.y.q.j(mVarE6, (Function0) objP7);
                    l0 l0VarD9 = com.gamericefishpro.space.d0.r.d(eVar14, false);
                    int iHashCode13 = Long.hashCode(rVar9.T);
                    l1 l1VarL13 = rVar9.l();
                    com.gamericefishpro.space.h1.m mVarF15 = com.gamericefishpro.space.d9.h.F(mVarJ4, rVar9);
                    rVar9.d0();
                    if (rVar9.S) {
                        rVar9.k(yVar3);
                    } else {
                        rVar9.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar9, l0VarD9, eVar10);
                    com.gamericefishpro.space.t0.i.B(rVar9, l1VarL13, eVar11);
                    com.gamericefishpro.space.t0.i.t(rVar9, Integer.valueOf(iHashCode13), eVar12);
                    com.gamericefishpro.space.t0.i.x(rVar9, dVar3);
                    com.gamericefishpro.space.t0.i.B(rVar9, mVarF15, eVar13);
                    r0.a("Delete", null, j3, 0L, kVar3, 0L, null, 0L, 0, false, 0, 0, null, rVar9, 1573254, 0, 262074);
                    rVar9.p(true);
                    rVar9.p(true);
                    rVar9.p(true);
                    rVar9.p(true);
                }
                break;
        }
        return Unit.a;
    }

    public m(com.gamericefishpro.space.f5.k kVar, com.gamericefishpro.space.v.k kVar2) {
        this.d = 2;
        this.i = kVar;
        this.e = kVar2;
    }
}
