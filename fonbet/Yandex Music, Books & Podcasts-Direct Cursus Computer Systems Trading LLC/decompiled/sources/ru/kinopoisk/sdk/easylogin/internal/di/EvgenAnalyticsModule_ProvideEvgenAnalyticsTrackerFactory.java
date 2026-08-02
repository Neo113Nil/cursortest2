package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1269w3;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideEvgenAnalyticsTrackerFactory implements rzm {
    private final szm analyticsProvider;

    public EvgenAnalyticsModule_ProvideEvgenAnalyticsTrackerFactory(szm szmVar) {
        this.analyticsProvider = szmVar;
    }

    public static EvgenAnalyticsModule_ProvideEvgenAnalyticsTrackerFactory create(szm szmVar) {
        return new EvgenAnalyticsModule_ProvideEvgenAnalyticsTrackerFactory(szmVar);
    }

    public static InterfaceC1269w3 provideEvgenAnalyticsTracker(EasyLoginAnalytics easyLoginAnalytics) {
        InterfaceC1269w3 provideEvgenAnalyticsTracker = EvgenAnalyticsModule.INSTANCE.provideEvgenAnalyticsTracker(easyLoginAnalytics);
        a4g.t(provideEvgenAnalyticsTracker);
        return provideEvgenAnalyticsTracker;
    }

    @Override // defpackage.szm
    public InterfaceC1269w3 get() {
        return provideEvgenAnalyticsTracker((EasyLoginAnalytics) this.analyticsProvider.get());
    }
}
