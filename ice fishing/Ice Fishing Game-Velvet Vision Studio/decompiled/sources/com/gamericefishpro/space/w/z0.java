package com.gamericefishpro.space.w;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ j e;

    public /* synthetic */ z0(j jVar, int i) {
        this.d = i;
        this.e = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.y = false;
                break;
            default:
                this.e.y = false;
                break;
        }
        return Unit.a;
    }
}
