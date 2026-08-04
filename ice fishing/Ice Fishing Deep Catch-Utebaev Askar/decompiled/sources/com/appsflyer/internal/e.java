package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements AFd1eSDK.AFa1vSDK, AFg1xSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1rSDK f79a;

    public /* synthetic */ e(AFb1rSDK aFb1rSDK) {
        this.f79a = aFb1rSDK;
    }

    @Override // com.appsflyer.internal.AFd1eSDK.AFa1vSDK
    public final void onConfigurationChanged(boolean z) {
        this.f79a.getCurrencyIso4217Code(z);
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void onRemoteConfigUpdateFinished(AFf1bSDK aFf1bSDK) {
        this.f79a.getCurrencyIso4217Code(aFf1bSDK);
    }
}
