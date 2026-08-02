package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.B2;

/* loaded from: classes5.dex */
public final class FoundTvStubTrackerImpl_Factory implements rzm {
    private final szm detectedScreenArgsProvider;
    private final szm evgenAnalyticsProvider;

    public FoundTvStubTrackerImpl_Factory(szm szmVar, szm szmVar2) {
        this.detectedScreenArgsProvider = szmVar;
        this.evgenAnalyticsProvider = szmVar2;
    }

    public static FoundTvStubTrackerImpl_Factory create(szm szmVar, szm szmVar2) {
        return new FoundTvStubTrackerImpl_Factory(szmVar, szmVar2);
    }

    public static FoundTvStubTrackerImpl newInstance(B2 b2, EvgenEasyLoginAnalytics evgenEasyLoginAnalytics) {
        return new FoundTvStubTrackerImpl(b2, evgenEasyLoginAnalytics);
    }

    @Override // defpackage.szm
    public FoundTvStubTrackerImpl get() {
        return newInstance((B2) this.detectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get());
    }
}
