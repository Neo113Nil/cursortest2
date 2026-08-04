package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.h0.h0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.pi.g1;
import com.gamericefishpro.space.y.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v extends com.gamericefishpro.space.ei.j implements Function2 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.B = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.B) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.m1.r rVar = (com.gamericefishpro.space.m1.r) obj;
                com.gamericefishpro.space.m1.r rVar2 = (com.gamericefishpro.space.m1.r) obj2;
                w wVar = (w) this.e;
                if (wVar.G && (zA = ((com.gamericefishpro.space.m1.s) rVar2).a()) != ((com.gamericefishpro.space.m1.s) rVar).a()) {
                    h0 h0Var = null;
                    if (zA) {
                        a0 a0Var = new a0();
                        com.gamericefishpro.space.h2.k.p(wVar, new com.gamericefishpro.space.b2.b(1, a0Var, wVar));
                        h0 h0Var2 = (h0) a0Var.d;
                        if (h0Var2 != null) {
                            h0Var2.a();
                            h0Var = h0Var2;
                        }
                        wVar.K = h0Var;
                    } else {
                        h0 h0Var3 = wVar.K;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        wVar.K = null;
                    }
                }
                break;
            default:
                com.gamericefishpro.space.m1.r rVar3 = (com.gamericefishpro.space.m1.r) obj;
                com.gamericefishpro.space.m1.r rVar4 = (com.gamericefishpro.space.m1.r) obj2;
                g0 g0Var = (g0) this.e;
                if (g0Var.G && (zA2 = ((com.gamericefishpro.space.m1.s) rVar4).a()) != ((com.gamericefishpro.space.m1.s) rVar3).a()) {
                    g1 g1Var = g0Var.K;
                    if (g1Var != null) {
                        g1Var.invoke(Boolean.valueOf(zA2));
                    }
                    com.gamericefishpro.space.th.a aVar = null;
                    if (zA2) {
                        com.gamericefishpro.space.pi.a0.u(g0Var.o0(), null, new e0(g0Var, aVar, 16), 3);
                        a0 a0Var2 = new a0();
                        com.gamericefishpro.space.h2.k.p(g0Var, new com.gamericefishpro.space.e.e(14, a0Var2, g0Var));
                        h0 h0Var4 = (h0) a0Var2.d;
                        if (h0Var4 != null) {
                            h0Var4.a();
                        } else {
                            h0Var4 = null;
                        }
                        g0Var.M = h0Var4;
                        f1 f1Var = g0Var.N;
                        if (f1Var != null && f1Var.K0().G) {
                            g0Var.E0();
                        }
                    } else {
                        h0 h0Var5 = g0Var.M;
                        if (h0Var5 != null) {
                            h0Var5.b();
                        }
                        g0Var.M = null;
                        g0Var.E0();
                    }
                    com.gamericefishpro.space.h2.k.l(g0Var);
                    com.gamericefishpro.space.b0.i iVar = g0Var.J;
                    if (iVar != null) {
                        if (zA2) {
                            com.gamericefishpro.space.b0.d dVar = g0Var.L;
                            if (dVar != null) {
                                g0Var.D0(iVar, new com.gamericefishpro.space.b0.e(dVar));
                                g0Var.L = null;
                            }
                            com.gamericefishpro.space.b0.d dVar2 = new com.gamericefishpro.space.b0.d();
                            g0Var.D0(iVar, dVar2);
                            g0Var.L = dVar2;
                        } else {
                            com.gamericefishpro.space.b0.d dVar3 = g0Var.L;
                            if (dVar3 != null) {
                                g0Var.D0(iVar, new com.gamericefishpro.space.b0.e(dVar3));
                                g0Var.L = null;
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
