package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsErrorMapper;
import ru.kinopoisk.sdk.easylogin.internal.B2;

/* loaded from: classes5.dex */
public final class UpdateCodeTrackerImpl_Factory implements rzm {
    private final szm analyticsErrorMapperProvider;
    private final szm detectedScreenArgsProvider;
    private final szm evgenAnalyticsProvider;

    public UpdateCodeTrackerImpl_Factory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.detectedScreenArgsProvider = szmVar;
        this.evgenAnalyticsProvider = szmVar2;
        this.analyticsErrorMapperProvider = szmVar3;
    }

    public static UpdateCodeTrackerImpl_Factory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new UpdateCodeTrackerImpl_Factory(szmVar, szmVar2, szmVar3);
    }

    public static UpdateCodeTrackerImpl newInstance(B2 b2, EvgenEasyLoginAnalytics evgenEasyLoginAnalytics, EasyLoginAnalyticsErrorMapper easyLoginAnalyticsErrorMapper) {
        return new UpdateCodeTrackerImpl(b2, evgenEasyLoginAnalytics, easyLoginAnalyticsErrorMapper);
    }

    @Override // defpackage.szm
    public UpdateCodeTrackerImpl get() {
        return newInstance((B2) this.detectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get(), (EasyLoginAnalyticsErrorMapper) this.analyticsErrorMapperProvider.get());
    }
}
