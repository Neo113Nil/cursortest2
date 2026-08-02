package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class AFa1ySDK$$ExternalSyntheticLambda3 implements AFd1xSDK.AFa1vSDK, AFf1mSDK {
    public final /* synthetic */ AFa1ySDK f$0;

    public /* synthetic */ AFa1ySDK$$ExternalSyntheticLambda3(AFa1ySDK aFa1ySDK) {
        this.f$0 = aFa1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z) {
        this.f$0.getMediationNetwork(z);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        this.f$0.AFAdRevenueData(aFf1pSDK);
    }
}
