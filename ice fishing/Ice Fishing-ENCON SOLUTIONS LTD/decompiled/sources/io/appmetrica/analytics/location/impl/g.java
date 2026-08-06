package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;

/* loaded from: classes.dex */
public final class g implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final LastKnownLocationExtractorProvider f7301a;

    /* renamed from: b, reason: collision with root package name */
    public final c f7302b = new c("location-module-gpl");

    /* renamed from: c, reason: collision with root package name */
    public final v f7303c = new v("network", new f(), "location-module-network");

    /* renamed from: d, reason: collision with root package name */
    public final v f7304d = new v("gps", new e(), "location-module-gps");

    public g(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7301a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f7302b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f7304d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f7303c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f7301a;
    }
}
