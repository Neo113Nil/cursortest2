package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    public /* synthetic */ c(q qVar, int i) {
        this.d = i;
        this.e = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.e(new com.gamericefishpro.space.j7.c(18));
                break;
            case 1:
                this.e.e(new com.gamericefishpro.space.j7.c(18));
                break;
            default:
                this.e.e(new com.gamericefishpro.space.j7.c(20));
                break;
        }
        return Unit.a;
    }
}
