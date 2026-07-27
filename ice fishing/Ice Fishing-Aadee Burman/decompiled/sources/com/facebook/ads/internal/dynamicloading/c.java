package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f23512n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Throwable f23513u;

    public c(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.f23512n = initListener;
        this.f23513u = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f23513u);
        this.f23512n.onInitialized(createErrorInitResult);
    }
}
