package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7310a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f7311b;

    /* renamed from: c, reason: collision with root package name */
    public final p f7312c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f7313d;

    /* renamed from: e, reason: collision with root package name */
    public final n f7314e;

    /* renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f7315f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7316g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7317h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7318i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f7319j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f7310a = context;
        this.f7312c = pVar;
        this.f7311b = permissionExtractor;
        this.f7313d = iHandlerExecutor;
        this.f7314e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f7315f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f7312c.f7330b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7317h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f7319j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f7315f.startUpdates();
            Iterator it = this.f7318i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f7315f.stopUpdates();
        Iterator it = this.f7318i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f7316g) {
            this.f7316g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f7316g) {
            this.f7316g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f7317h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f7318i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f7316g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f7313d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f7310a, this.f7311b, this.f7313d, this.f7314e);
        this.f7317h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f7316g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f7319j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f7310a, this.f7311b, this.f7313d, this.f7314e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f7318i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f7316g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.f7319j = location;
        }
    }
}
