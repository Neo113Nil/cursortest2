package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1138m9;

/* loaded from: classes5.dex */
public final class TvDetectedScreenDependenciesModule_ProvideTvAppInstallResolverFactory implements rzm {
    private final szm configProvider;

    public TvDetectedScreenDependenciesModule_ProvideTvAppInstallResolverFactory(szm szmVar) {
        this.configProvider = szmVar;
    }

    public static TvDetectedScreenDependenciesModule_ProvideTvAppInstallResolverFactory create(szm szmVar) {
        return new TvDetectedScreenDependenciesModule_ProvideTvAppInstallResolverFactory(szmVar);
    }

    public static InterfaceC1138m9 provideTvAppInstallResolver(C1288x9 c1288x9) {
        InterfaceC1138m9 provideTvAppInstallResolver = TvDetectedScreenDependenciesModule.INSTANCE.provideTvAppInstallResolver(c1288x9);
        a4g.t(provideTvAppInstallResolver);
        return provideTvAppInstallResolver;
    }

    @Override // defpackage.szm
    public InterfaceC1138m9 get() {
        return provideTvAppInstallResolver((C1288x9) this.configProvider.get());
    }
}
