package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i2.s1;
import com.gamericefishpro.space.t0.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, Object obj, Object obj2) {
        super(2);
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.e;
        Object obj4 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Boolean bool = (Boolean) ((z) obj3).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj4;
                    rVar.c0(bool);
                    boolean zG = rVar.g(zBooleanValue);
                    if (zBooleanValue) {
                        function2.invoke(rVar, 0);
                    } else {
                        if (rVar.l != 0) {
                            com.gamericefishpro.space.t0.s.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!rVar.S) {
                            if (zG) {
                                d2 d2Var = rVar.G;
                                int i2 = d2Var.g;
                                int i3 = d2Var.h;
                                com.gamericefishpro.space.u0.b bVar = rVar.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.b.c.w0(com.gamericefishpro.space.u0.i.c);
                                com.gamericefishpro.space.t0.i.h(rVar.s, i2, i3);
                                rVar.G.t();
                            } else {
                                rVar.U();
                            }
                        }
                    }
                    if (rVar.y && rVar.G.i == rVar.z) {
                        rVar.z = -1;
                        rVar.y = false;
                    }
                    rVar.p(false);
                } else {
                    rVar.V();
                }
                break;
            case 1:
                com.gamericefishpro.space.o1.q qVar = (com.gamericefishpro.space.o1.q) obj;
                com.gamericefishpro.space.r1.b bVar2 = (com.gamericefishpro.space.r1.b) obj2;
                com.gamericefishpro.space.h2.f1 f1Var = (com.gamericefishpro.space.h2.f1) obj3;
                com.gamericefishpro.space.h2.f0 f0Var = f1Var.H;
                if (f0Var.I()) {
                    f1Var.a0 = qVar;
                    f1Var.Z = bVar2;
                    com.gamericefishpro.space.h2.q1 snapshotObserver = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.i0.a(f0Var)).getSnapshotObserver();
                    com.gamericefishpro.space.o1.h0 h0Var = com.gamericefishpro.space.h2.f1.f0;
                    snapshotObserver.a.c(f1Var, com.gamericefishpro.space.h2.d.v, (com.gamericefishpro.space.h2.c1) obj4);
                    f1Var.d0 = false;
                } else {
                    f1Var.d0 = true;
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                com.gamericefishpro.space.i2.j0.a((com.gamericefishpro.space.i2.t) obj3, (Function2) obj4, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                com.gamericefishpro.space.o2.o oVar = (com.gamericefishpro.space.o2.o) obj2;
                com.gamericefishpro.space.j1.d dVar = (com.gamericefishpro.space.j1.d) obj4;
                if (!((s1) obj3).b.b(oVar.g)) {
                    dVar.m(iIntValue2, oVar);
                    dVar.A.k(Unit.a);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.gamericefishpro.space.i2.t tVar, Function2 function2, int i) {
        super(2);
        this.d = 2;
        this.e = tVar;
        this.i = function2;
    }
}
