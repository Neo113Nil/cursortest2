package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ com.gamericefishpro.space.h1.m i;

    public /* synthetic */ o(int i, com.gamericefishpro.space.h1.m mVar, int i2) {
        this.e = i;
        this.i = mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r.a(this.i, rVar, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            default:
                d5.i(this.e, this.i, rVar, com.gamericefishpro.space.t0.i.D(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o(com.gamericefishpro.space.h1.m mVar, int i) {
        this.i = mVar;
        this.e = i;
    }
}
