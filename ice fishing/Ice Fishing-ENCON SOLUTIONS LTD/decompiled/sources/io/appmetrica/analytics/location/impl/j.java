package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f7308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f7309b;

    public j(k kVar, i iVar) {
        this.f7309b = kVar;
        this.f7308a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f7309b.f7312c;
        i iVar = this.f7308a;
        pVar.f7329a = iVar;
        CacheArguments cacheArguments = iVar.f7307b;
        pVar.f7330b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
