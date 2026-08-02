package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsGlobalParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsPlatformParamsProvider;
import ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsTracker;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsFactory implements rzm {
    private final szm eventTrackerProvider;
    private final szm globalParamsProvider;
    private final szm platformParamsProvider;

    public EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.eventTrackerProvider = szmVar;
        this.globalParamsProvider = szmVar2;
        this.platformParamsProvider = szmVar3;
    }

    public static EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new EvgenAnalyticsModule_ProvideEvgenEasyLoginAnalyticsFactory(szmVar, szmVar2, szmVar3);
    }

    public static EvgenEasyLoginAnalytics provideEvgenEasyLoginAnalytics(EvgenEasyLoginAnalyticsTracker evgenEasyLoginAnalyticsTracker, EvgenEasyLoginAnalyticsGlobalParamsProvider evgenEasyLoginAnalyticsGlobalParamsProvider, EvgenEasyLoginAnalyticsPlatformParamsProvider evgenEasyLoginAnalyticsPlatformParamsProvider) {
        EvgenEasyLoginAnalytics provideEvgenEasyLoginAnalytics = EvgenAnalyticsModule.INSTANCE.provideEvgenEasyLoginAnalytics(evgenEasyLoginAnalyticsTracker, evgenEasyLoginAnalyticsGlobalParamsProvider, evgenEasyLoginAnalyticsPlatformParamsProvider);
        a4g.t(provideEvgenEasyLoginAnalytics);
        return provideEvgenEasyLoginAnalytics;
    }

    @Override // defpackage.szm
    public EvgenEasyLoginAnalytics get() {
        return provideEvgenEasyLoginAnalytics((EvgenEasyLoginAnalyticsTracker) this.eventTrackerProvider.get(), (EvgenEasyLoginAnalyticsGlobalParamsProvider) this.globalParamsProvider.get(), (EvgenEasyLoginAnalyticsPlatformParamsProvider) this.platformParamsProvider.get());
    }
}
