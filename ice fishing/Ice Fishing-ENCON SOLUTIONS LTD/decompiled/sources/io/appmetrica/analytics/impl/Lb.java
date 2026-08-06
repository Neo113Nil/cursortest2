package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* loaded from: classes.dex */
public final class Lb implements Kb, InterfaceC0544km, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4691a;

    /* renamed from: b, reason: collision with root package name */
    public final Pb f4692b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f4693c;

    /* renamed from: d, reason: collision with root package name */
    public final C0776tl f4694d;

    /* renamed from: e, reason: collision with root package name */
    public final C0879xk f4695e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f4696f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f4697g;

    public Lb(Context context, Pb pb, LocationClient locationClient) {
        this.f4691a = context;
        this.f4692b = pb;
        this.f4693c = locationClient;
        Ub ub = new Ub();
        this.f4694d = new C0776tl(new C0501j5(ub, C0610na.k().p().getAskForPermissionStrategy()));
        this.f4695e = C0610na.k().p();
        ((Sb) pb).a(ub, true);
        ((Sb) pb).a(locationClient, true);
        this.f4696f = locationClient.getLastKnownExtractorProviderFactory();
        this.f4697g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0544km
    public final void a(C0415fm c0415fm) {
        C0345d3 c0345d3 = c0415fm.f6024x;
        if (c0345d3 != null) {
            long j2 = c0345d3.f5783a;
            this.f4693c.updateCacheArguments(new CacheArguments(j2, 2 * j2));
        }
    }

    public final C0776tl b() {
        return this.f4694d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f4696f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f4697g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f4694d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f4693c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f4693c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void init() {
        this.f4693c.init(this.f4691a, this.f4694d, C0610na.f6575I.f6586d.b(), this.f4695e.e());
        ModuleLocationSourcesServiceController f2 = this.f4695e.f();
        if (f2 != null) {
            f2.init();
        } else {
            LocationClient locationClient = this.f4693c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f4693c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Sb) this.f4692b).a(this.f4695e.g());
        C0610na.f6575I.f6602u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Sb) this.f4692b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4693c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4693c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f4693c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void b(Object obj) {
        ((Sb) this.f4692b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f4693c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f4693c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(Object obj) {
        ((Sb) this.f4692b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(boolean z2) {
        ((Sb) this.f4692b).a(z2);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(Location location) {
        this.f4693c.updateUserLocation(location);
    }
}
