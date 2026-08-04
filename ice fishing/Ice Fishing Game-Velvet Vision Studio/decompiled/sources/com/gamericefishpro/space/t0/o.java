package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r e;

    public /* synthetic */ o(r rVar, int i) {
        this.d = i;
        this.e = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw null;
            case 1:
                return this.e.m();
            default:
                return this.e.m();
        }
    }

    public /* synthetic */ o(r rVar, u0 u0Var) {
        this.d = 0;
        this.e = rVar;
    }
}
