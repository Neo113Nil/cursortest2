package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1201r3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1229t3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1256v3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1269w3;

/* loaded from: classes5.dex */
public final class EvgenAnalyticsModule_ProvideEvgenAnalyticsFactory implements rzm {
    private final szm eventTrackerProvider;
    private final szm globalParamsProvider;
    private final szm platformParamsProvider;

    public EvgenAnalyticsModule_ProvideEvgenAnalyticsFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.eventTrackerProvider = szmVar;
        this.globalParamsProvider = szmVar2;
        this.platformParamsProvider = szmVar3;
    }

    public static EvgenAnalyticsModule_ProvideEvgenAnalyticsFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new EvgenAnalyticsModule_ProvideEvgenAnalyticsFactory(szmVar, szmVar2, szmVar3);
    }

    public static C1201r3 provideEvgenAnalytics(InterfaceC1269w3 interfaceC1269w3, InterfaceC1229t3 interfaceC1229t3, InterfaceC1256v3 interfaceC1256v3) {
        C1201r3 provideEvgenAnalytics = EvgenAnalyticsModule.INSTANCE.provideEvgenAnalytics(interfaceC1269w3, interfaceC1229t3, interfaceC1256v3);
        a4g.t(provideEvgenAnalytics);
        return provideEvgenAnalytics;
    }

    @Override // defpackage.szm
    public C1201r3 get() {
        return provideEvgenAnalytics((InterfaceC1269w3) this.eventTrackerProvider.get(), (InterfaceC1229t3) this.globalParamsProvider.get(), (InterfaceC1256v3) this.platformParamsProvider.get());
    }
}
