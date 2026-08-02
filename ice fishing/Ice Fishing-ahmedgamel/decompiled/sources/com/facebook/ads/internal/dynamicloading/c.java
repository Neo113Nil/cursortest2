package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f24297n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Throwable f24298u;

    public c(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.f24297n = initListener;
        this.f24298u = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f24298u);
        this.f24297n.onInitialized(createErrorInitResult);
    }
}
