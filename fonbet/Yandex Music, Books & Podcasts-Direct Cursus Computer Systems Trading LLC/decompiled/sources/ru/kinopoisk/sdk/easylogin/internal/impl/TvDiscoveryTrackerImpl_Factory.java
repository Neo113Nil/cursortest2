package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsErrorMapper;

/* loaded from: classes5.dex */
public final class TvDiscoveryTrackerImpl_Factory implements rzm {
    private final szm analyticsErrorMapperProvider;
    private final szm evgenAnalyticsProvider;

    public TvDiscoveryTrackerImpl_Factory(szm szmVar, szm szmVar2) {
        this.evgenAnalyticsProvider = szmVar;
        this.analyticsErrorMapperProvider = szmVar2;
    }

    public static TvDiscoveryTrackerImpl_Factory create(szm szmVar, szm szmVar2) {
        return new TvDiscoveryTrackerImpl_Factory(szmVar, szmVar2);
    }

    public static TvDiscoveryTrackerImpl newInstance(EvgenEasyLoginAnalytics evgenEasyLoginAnalytics, EasyLoginAnalyticsErrorMapper easyLoginAnalyticsErrorMapper) {
        return new TvDiscoveryTrackerImpl(evgenEasyLoginAnalytics, easyLoginAnalyticsErrorMapper);
    }

    @Override // defpackage.szm
    public TvDiscoveryTrackerImpl get() {
        return newInstance((EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get(), (EasyLoginAnalyticsErrorMapper) this.analyticsErrorMapperProvider.get());
    }
}
