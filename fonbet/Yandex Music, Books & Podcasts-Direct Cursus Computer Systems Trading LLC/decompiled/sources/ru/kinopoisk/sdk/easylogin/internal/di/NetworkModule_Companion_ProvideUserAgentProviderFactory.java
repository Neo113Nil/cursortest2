package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1045g0;
import ru.kinopoisk.sdk.easylogin.internal.F2;
import ru.kinopoisk.sdk.easylogin.internal.Jc;

/* loaded from: classes5.dex */
public final class NetworkModule_Companion_ProvideUserAgentProviderFactory implements rzm {
    private final szm buildPackageProvider;
    private final szm deviceSpecificationProvider;

    public NetworkModule_Companion_ProvideUserAgentProviderFactory(szm szmVar, szm szmVar2) {
        this.deviceSpecificationProvider = szmVar;
        this.buildPackageProvider = szmVar2;
    }

    public static NetworkModule_Companion_ProvideUserAgentProviderFactory create(szm szmVar, szm szmVar2) {
        return new NetworkModule_Companion_ProvideUserAgentProviderFactory(szmVar, szmVar2);
    }

    public static Jc provideUserAgentProvider(F2 f2, C1045g0 c1045g0) {
        Jc provideUserAgentProvider = NetworkModule.INSTANCE.provideUserAgentProvider(f2, c1045g0);
        a4g.t(provideUserAgentProvider);
        return provideUserAgentProvider;
    }

    @Override // defpackage.szm
    public Jc get() {
        return provideUserAgentProvider((F2) this.deviceSpecificationProvider.get(), (C1045g0) this.buildPackageProvider.get());
    }
}
