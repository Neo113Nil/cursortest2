package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class d implements AudienceNetworkAds.InitResult {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f23668a;

    public d(Throwable th) {
        this.f23668a = th;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        String createErrorMessage;
        createErrorMessage = DynamicLoaderFactory.createErrorMessage(this.f23668a);
        return createErrorMessage;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
