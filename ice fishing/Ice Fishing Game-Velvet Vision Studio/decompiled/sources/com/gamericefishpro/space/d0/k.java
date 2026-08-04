package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.f2.u0 e;

    public /* synthetic */ k(com.gamericefishpro.space.f2.u0 u0Var, int i) {
        this.d = i;
        this.e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f2.t0.l(t0Var, this.e, 0, 0);
                break;
            case 1:
                com.gamericefishpro.space.f2.t0.l(t0Var, this.e, 0, 0);
                break;
            case 2:
                com.gamericefishpro.space.f2.t0.l(t0Var, this.e, 0, 0);
                break;
            case 3:
                t0Var.h(this.e, 0, 0, 0.0f);
                break;
            default:
                t0Var.h(this.e, 0, 0, 0.0f);
                break;
        }
        return Unit.a;
    }
}
