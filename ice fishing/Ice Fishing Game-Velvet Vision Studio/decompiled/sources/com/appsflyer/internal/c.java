package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements AFd1xSDK.AFa1vSDK, AFf1mSDK {
    public final /* synthetic */ AFa1ySDK a;

    public /* synthetic */ c(AFa1ySDK aFa1ySDK) {
        this.a = aFa1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z) {
        this.a.getMediationNetwork(z);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        this.a.AFAdRevenueData(aFf1pSDK);
    }
}
