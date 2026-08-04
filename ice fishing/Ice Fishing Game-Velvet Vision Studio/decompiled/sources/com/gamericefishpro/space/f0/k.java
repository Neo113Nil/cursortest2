package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.z;
import com.gamericefishpro.space.t0.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v0 e;

    public /* synthetic */ k(v0 v0Var, int i) {
        this.d = i;
        this.e = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        v0 v0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h((Function1) v0Var.getValue());
            case 1:
                return new com.gamericefishpro.space.g0.g((Function1) v0Var.getValue());
            case 2:
                return (z) ((Function0) v0Var.getValue()).invoke();
            case 3:
                v0Var.setValue(Boolean.FALSE);
                return Unit.a;
            case 4:
                int i2 = com.gamericefishpro.space.s7.d.c;
                v0Var.setValue(Boolean.TRUE);
                return Unit.a;
            default:
                int i3 = com.gamericefishpro.space.s7.d.c;
                v0Var.setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
