package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((AFa1ySDK.AFa1zSDK) this.e).getMediationNetwork();
            default:
                return ((AFc1bSDK) this.e).o_();
        }
    }
}
