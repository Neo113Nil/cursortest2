package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C0981b6;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.N5;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class LgCastModule_ProvideLgTvInteractorFactoryFactory implements rzm {
    private final szm castSessionLoggerProvider;
    private final szm dispatchersProvider;
    private final szm lgDiscoveryManagerDelegateProvider;

    public LgCastModule_ProvideLgTvInteractorFactoryFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.lgDiscoveryManagerDelegateProvider = szmVar;
        this.dispatchersProvider = szmVar2;
        this.castSessionLoggerProvider = szmVar3;
    }

    public static LgCastModule_ProvideLgTvInteractorFactoryFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new LgCastModule_ProvideLgTvInteractorFactoryFactory(szmVar, szmVar2, szmVar3);
    }

    public static C0981b6 provideLgTvInteractorFactory(N5 n5, Q2 q2, F0 f0) {
        C0981b6 provideLgTvInteractorFactory = LgCastModule.INSTANCE.provideLgTvInteractorFactory(n5, q2, f0);
        a4g.t(provideLgTvInteractorFactory);
        return provideLgTvInteractorFactory;
    }

    @Override // defpackage.szm
    public C0981b6 get() {
        return provideLgTvInteractorFactory((N5) this.lgDiscoveryManagerDelegateProvider.get(), (Q2) this.dispatchersProvider.get(), (F0) this.castSessionLoggerProvider.get());
    }
}
