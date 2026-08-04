package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ g1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, int i) {
        super(2);
        this.d = i;
        this.e = g1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.a().e = (com.gamericefishpro.space.t0.u) obj2;
                break;
            case 1:
                h0 h0VarA = this.e.a();
                ((com.gamericefishpro.space.h2.f0) obj).c0(new d0(h0VarA, (Function2) obj2, h0VarA.I));
                break;
            default:
                com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) obj;
                g1 g1Var = this.e;
                j1 j1Var = g1Var.a;
                h0 h0Var = f0Var.b0;
                if (h0Var == null) {
                    h0Var = new h0(f0Var, j1Var);
                    f0Var.b0 = h0Var;
                }
                g1Var.b = h0Var;
                g1Var.a().h();
                h0 h0VarA2 = g1Var.a();
                if (h0VarA2.i != j1Var) {
                    h0VarA2.i = j1Var;
                    h0VarA2.i(false);
                    com.gamericefishpro.space.h2.f0.V(h0VarA2.d, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
