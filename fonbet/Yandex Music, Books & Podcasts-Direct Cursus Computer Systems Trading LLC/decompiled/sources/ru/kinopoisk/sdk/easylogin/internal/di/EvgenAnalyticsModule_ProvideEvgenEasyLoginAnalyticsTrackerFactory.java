package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsTracker;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsTrackerFactory implements rzm {
    private final szm analyticsProvider;

    public EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsTrackerFactory(szm szmVar) {
        this.analyticsProvider = szmVar;
    }

    public static EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsTrackerFactory create(szm szmVar) {
        return new EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsTrackerFactory(szmVar);
    }

    public static EvgenEasyLoginAnalyticsTracker provideEvgenEasyLoginAnalyticsTracker(EasyLoginAnalytics easyLoginAnalytics) {
        EvgenEasyLoginAnalyticsTracker provideEvgenEasyLoginAnalyticsTracker = EvgenAnalyticsModule.INSTANCE.provideEvgenEasyLoginAnalyticsTracker(easyLoginAnalytics);
        a4g.t(provideEvgenEasyLoginAnalyticsTracker);
        return provideEvgenEasyLoginAnalyticsTracker;
    }

    @Override // defpackage.szm
    public EvgenEasyLoginAnalyticsTracker get() {
        return provideEvgenEasyLoginAnalyticsTracker((EasyLoginAnalytics) this.analyticsProvider.get());
    }
}
