package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;

/* loaded from: classes9.dex */
public final class a implements Runnable {
    public final /* synthetic */ LocationDataCacheUpdateScheduler a;

    public a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILastKnownUpdater iLastKnownUpdater;
        iLastKnownUpdater = this.a.b;
        iLastKnownUpdater.updateLastKnown();
    }
}
