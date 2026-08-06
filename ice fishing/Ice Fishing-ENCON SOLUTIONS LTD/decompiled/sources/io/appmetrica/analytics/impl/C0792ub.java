package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;

/* renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792ub implements LastKnownLocationExtractorProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final C0818vb f6995a = new C0818vb();

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f6995a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f6995a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f6995a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f6995a;
    }
}
