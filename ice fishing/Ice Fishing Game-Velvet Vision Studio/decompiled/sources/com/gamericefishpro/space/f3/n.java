package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ com.gamericefishpro.space.h1.m e;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.gamericefishpro.space.oh.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.gamericefishpro.space.h1.m mVar, Function2 function2, int i) {
        super(2);
        this.e = mVar;
        this.v = function2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.a(com.gamericefishpro.space.t0.i.D(this.i | 1), this.e, rVar, (Function1) this.v);
                break;
            default:
                com.gamericefishpro.space.d9.h.i(this.e, (Function2) this.v, rVar, com.gamericefishpro.space.t0.i.D(this.i | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Function1 function1, com.gamericefishpro.space.h1.m mVar, int i) {
        super(2);
        this.v = function1;
        this.e = mVar;
        this.i = i;
    }
}
