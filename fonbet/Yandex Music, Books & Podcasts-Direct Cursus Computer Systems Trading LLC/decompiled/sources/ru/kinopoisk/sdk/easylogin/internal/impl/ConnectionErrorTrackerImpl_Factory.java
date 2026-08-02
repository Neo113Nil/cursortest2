package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.B2;

/* loaded from: classes5.dex */
public final class ConnectionErrorTrackerImpl_Factory implements rzm {
    private final szm detectedScreenArgsProvider;
    private final szm evgenAnalyticsProvider;

    public ConnectionErrorTrackerImpl_Factory(szm szmVar, szm szmVar2) {
        this.detectedScreenArgsProvider = szmVar;
        this.evgenAnalyticsProvider = szmVar2;
    }

    public static ConnectionErrorTrackerImpl_Factory create(szm szmVar, szm szmVar2) {
        return new ConnectionErrorTrackerImpl_Factory(szmVar, szmVar2);
    }

    public static ConnectionErrorTrackerImpl newInstance(B2 b2, EvgenEasyLoginAnalytics evgenEasyLoginAnalytics) {
        return new ConnectionErrorTrackerImpl(b2, evgenEasyLoginAnalytics);
    }

    @Override // defpackage.szm
    public ConnectionErrorTrackerImpl get() {
        return newInstance((B2) this.detectedScreenArgsProvider.get(), (EvgenEasyLoginAnalytics) this.evgenAnalyticsProvider.get());
    }
}
