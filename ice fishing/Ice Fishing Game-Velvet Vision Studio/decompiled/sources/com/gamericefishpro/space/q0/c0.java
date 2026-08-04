package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ c0(int i, Function2 function2) {
        this.d = i;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode = Long.hashCode(rVar.T);
                    l1 l1VarL = rVar.l();
                    com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(com.gamericefishpro.space.h1.j.a, rVar);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
                    rVar.d0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar, l0VarD, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.f;
                    if (rVar.S || !Intrinsics.a(rVar.P(), Integer.valueOf(iHashCode))) {
                        rVar.k0(Integer.valueOf(iHashCode));
                        rVar.b(Integer.valueOf(iHashCode), eVar);
                    }
                    com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
                    this.e.invoke(rVar, 0);
                    rVar.p(true);
                } else {
                    rVar.V();
                }
                break;
            case 1:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    com.gamericefishpro.space.f2.l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    l1 l1VarL2 = rVar2.l();
                    com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(com.gamericefishpro.space.h1.j.a, rVar2);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar2 = com.gamericefishpro.space.h2.f.b;
                    rVar2.d0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.f;
                    if (rVar2.S || !Intrinsics.a(rVar2.P(), Integer.valueOf(iHashCode2))) {
                        rVar2.k0(Integer.valueOf(iHashCode2));
                        rVar2.b(Integer.valueOf(iHashCode2), eVar2);
                    }
                    com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, com.gamericefishpro.space.h2.f.c);
                    this.e.invoke(rVar2, 0);
                    rVar2.p(true);
                } else {
                    rVar2.V();
                }
                break;
            case 2:
                com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (rVar3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    com.gamericefishpro.space.f2.l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode3 = Long.hashCode(rVar3.T);
                    l1 l1VarL3 = rVar3.l();
                    com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(com.gamericefishpro.space.h1.j.a, rVar3);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar3 = com.gamericefishpro.space.h2.f.b;
                    rVar3.d0();
                    if (rVar3.S) {
                        rVar3.k(yVar3);
                    } else {
                        rVar3.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar3, l0VarD3, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar3, l1VarL3, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
                    if (rVar3.S || !Intrinsics.a(rVar3.P(), Integer.valueOf(iHashCode3))) {
                        rVar3.k0(Integer.valueOf(iHashCode3));
                        rVar3.b(Integer.valueOf(iHashCode3), eVar3);
                    }
                    com.gamericefishpro.space.t0.i.B(rVar3, mVarF3, com.gamericefishpro.space.h2.f.c);
                    this.e.invoke(rVar3, 0);
                    rVar3.p(true);
                } else {
                    rVar3.V();
                }
                break;
            default:
                com.gamericefishpro.space.t0.r rVar4 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (rVar4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    com.gamericefishpro.space.f2.l0 l0VarD4 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
                    int iHashCode4 = Long.hashCode(rVar4.T);
                    l1 l1VarL4 = rVar4.l();
                    com.gamericefishpro.space.h1.m mVarF4 = com.gamericefishpro.space.d9.h.F(com.gamericefishpro.space.h1.j.a, rVar4);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    com.gamericefishpro.space.h2.y yVar4 = com.gamericefishpro.space.h2.f.b;
                    rVar4.d0();
                    if (rVar4.S) {
                        rVar4.k(yVar4);
                    } else {
                        rVar4.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, l0VarD4, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar4, l1VarL4, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.f;
                    if (rVar4.S || !Intrinsics.a(rVar4.P(), Integer.valueOf(iHashCode4))) {
                        rVar4.k0(Integer.valueOf(iHashCode4));
                        rVar4.b(Integer.valueOf(iHashCode4), eVar4);
                    }
                    com.gamericefishpro.space.t0.i.B(rVar4, mVarF4, com.gamericefishpro.space.h2.f.c);
                    this.e.invoke(rVar4, 0);
                    rVar4.p(true);
                } else {
                    rVar4.V();
                }
                break;
        }
        return Unit.a;
    }
}
