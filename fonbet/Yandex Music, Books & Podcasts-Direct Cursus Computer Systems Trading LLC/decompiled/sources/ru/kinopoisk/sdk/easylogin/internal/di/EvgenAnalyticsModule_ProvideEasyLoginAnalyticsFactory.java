package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsFactory;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideEasyLoginAnalyticsFactory implements rzm {
    private final szm analyticsFactoryProvider;

    public EvgenAnalyticsModule_ProvideEasyLoginAnalyticsFactory(szm szmVar) {
        this.analyticsFactoryProvider = szmVar;
    }

    public static EvgenAnalyticsModule_ProvideEasyLoginAnalyticsFactory create(szm szmVar) {
        return new EvgenAnalyticsModule_ProvideEasyLoginAnalyticsFactory(szmVar);
    }

    public static EasyLoginAnalytics provideEasyLoginAnalytics(EasyLoginAnalyticsFactory easyLoginAnalyticsFactory) {
        EasyLoginAnalytics provideEasyLoginAnalytics = EvgenAnalyticsModule.INSTANCE.provideEasyLoginAnalytics(easyLoginAnalyticsFactory);
        a4g.t(provideEasyLoginAnalytics);
        return provideEasyLoginAnalytics;
    }

    @Override // defpackage.szm
    public EasyLoginAnalytics get() {
        return provideEasyLoginAnalytics((EasyLoginAnalyticsFactory) this.analyticsFactoryProvider.get());
    }
}
