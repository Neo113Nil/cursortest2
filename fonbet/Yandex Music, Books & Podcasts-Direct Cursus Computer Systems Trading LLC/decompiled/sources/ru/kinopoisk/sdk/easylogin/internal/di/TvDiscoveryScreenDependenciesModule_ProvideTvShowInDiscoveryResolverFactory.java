package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.Hb;

/* loaded from: classes5.dex */
public final class TvDiscoveryScreenDependenciesModule_ProvideTvShowInDiscoveryResolverFactory implements rzm {
    private final szm configProvider;

    public TvDiscoveryScreenDependenciesModule_ProvideTvShowInDiscoveryResolverFactory(szm szmVar) {
        this.configProvider = szmVar;
    }

    public static TvDiscoveryScreenDependenciesModule_ProvideTvShowInDiscoveryResolverFactory create(szm szmVar) {
        return new TvDiscoveryScreenDependenciesModule_ProvideTvShowInDiscoveryResolverFactory(szmVar);
    }

    public static Hb provideTvShowInDiscoveryResolver(C1288x9 c1288x9) {
        Hb provideTvShowInDiscoveryResolver = TvDiscoveryScreenDependenciesModule.INSTANCE.provideTvShowInDiscoveryResolver(c1288x9);
        a4g.t(provideTvShowInDiscoveryResolver);
        return provideTvShowInDiscoveryResolver;
    }

    @Override // defpackage.szm
    public Hb get() {
        return provideTvShowInDiscoveryResolver((C1288x9) this.configProvider.get());
    }
}
