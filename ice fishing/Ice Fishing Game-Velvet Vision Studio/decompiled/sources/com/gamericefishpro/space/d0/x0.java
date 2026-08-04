package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ com.gamericefishpro.space.f2.u0 i;
    public final /* synthetic */ int v;

    public /* synthetic */ x0(int i, com.gamericefishpro.space.f2.u0 u0Var, int i2) {
        this.e = i;
        this.i = u0Var;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.f2.t0) obj).h(this.i, this.e, this.v, 0.0f);
                break;
            default:
                com.gamericefishpro.space.f2.u0 u0Var = this.i;
                ((com.gamericefishpro.space.f2.t0) obj).h(u0Var, com.gamericefishpro.space.gi.c.a((this.e - u0Var.d) / 2.0f), com.gamericefishpro.space.gi.c.a((this.v - u0Var.e) / 2.0f), 0.0f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x0(com.gamericefishpro.space.f2.u0 u0Var, int i, int i2) {
        this.i = u0Var;
        this.e = i;
        this.v = i2;
    }
}
