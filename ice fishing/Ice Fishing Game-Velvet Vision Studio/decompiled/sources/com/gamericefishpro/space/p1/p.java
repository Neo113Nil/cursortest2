package com.gamericefishpro.space.p1;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.d = i;
        this.e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.e;
                return Double.valueOf(qVar.n.d(com.gamericefishpro.space.ji.f.a(dDoubleValue, qVar.e, qVar.f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.e;
                return Double.valueOf(com.gamericefishpro.space.ji.f.a(qVar2.k.d(dDoubleValue2), qVar2.e, qVar2.f));
        }
    }
}
