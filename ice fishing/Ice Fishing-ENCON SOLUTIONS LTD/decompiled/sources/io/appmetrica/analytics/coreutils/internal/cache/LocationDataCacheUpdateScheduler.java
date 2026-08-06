package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f3829a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f3830b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f3831c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3832d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f3833e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f3829a = iCommonExecutor;
        this.f3830b = iLastKnownUpdater;
        this.f3831c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f3829a.remove(this.f3832d);
        this.f3829a.executeDelayed(this.f3832d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f3829a.execute(this.f3833e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f3829a.remove(this.f3832d);
        this.f3829a.remove(this.f3833e);
    }
}
