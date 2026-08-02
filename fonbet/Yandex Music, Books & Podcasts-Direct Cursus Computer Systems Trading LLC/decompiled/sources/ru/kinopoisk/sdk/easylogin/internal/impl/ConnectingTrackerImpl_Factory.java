package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsErrorMapper;
import ru.kinopoisk.sdk.easylogin.internal.B2;

/* loaded from: classes5.dex */
public final class ConnectingTrackerImpl_Factory implements rzm {
    private final szm analyticsErrorMapperProvider;
    private final szm detectedScreenArgsProvider;
    private final szm evgenAnalyticsProvider;

    public ConnectingTrackerImpl_Factory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.detectedScreenArgsProvider = szmVar;
        this.evgenAnalyticsProvider = szmVar2;
        this.analyticsErrorMapperProvider = szmVar3;
    }

    public static ConnectingTrackerImpl_Factory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new ConnectingTrackerImpl_Factory(szmVar, szmVar2, szmVar3);
    }

    public static ConnectingTrackerImpl newInstance(B2 b2, EvgenEasyLoginAnalytics evgenEasyLoginAnalytics, EasyLoginAnalyticsErrorMapper easyLoginAnalyticsErrorMapper) {
        return new ConnectingTrackerImpl(b2, evgenEasyLoginAnalytics, easyLoginAnalyticsErrorMapper);
    }

    @Override // defpackage.szm
    public ConnectingTrackerImpl get() {
        return newInstance((B2) this.detectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get(), (EasyLoginAnalyticsErrorMapper) this.analyticsErrorMapperProvider.get());
    }
}
