package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.f9f;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.I9;
import ru.kinopoisk.sdk.easylogin.internal.R3;

/* loaded from: classes5.dex */
public final class TvDetectedScreenDependenciesModule_ProvideTvAuthScenarioManagerFactory implements rzm {
    private final szm androidTvInteractorFactoryProvider;
    private final szm argsProvider;
    private final szm configProvider;
    private final szm dispatchersProvider;
    private final szm fragmentClassProvider;
    private final szm lgTvInteractorFactoryProvider;
    private final szm parentFragmentViewModelComponentProvider;
    private final szm preferencesProvider;
    private final szm puidProvider;
    private final szm samsungTvInteractorFactoryProvider;
    private final szm tvAuthConfigProvider;
    private final szm userCodeVerifierProvider;

    public TvDetectedScreenDependenciesModule_ProvideTvAuthScenarioManagerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6, szm szmVar7, szm szmVar8, szm szmVar9, szm szmVar10, szm szmVar11, szm szmVar12) {
        this.fragmentClassProvider = szmVar;
        this.parentFragmentViewModelComponentProvider = szmVar2;
        this.argsProvider = szmVar3;
        this.userCodeVerifierProvider = szmVar4;
        this.tvAuthConfigProvider = szmVar5;
        this.lgTvInteractorFactoryProvider = szmVar6;
        this.samsungTvInteractorFactoryProvider = szmVar7;
        this.androidTvInteractorFactoryProvider = szmVar8;
        this.configProvider = szmVar9;
        this.puidProvider = szmVar10;
        this.preferencesProvider = szmVar11;
        this.dispatchersProvider = szmVar12;
    }

    public static TvDetectedScreenDependenciesModule_ProvideTvAuthScenarioManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6, szm szmVar7, szm szmVar8, szm szmVar9, szm szmVar10, szm szmVar11, szm szmVar12) {
        return new TvDetectedScreenDependenciesModule_ProvideTvAuthScenarioManagerFactory(szmVar, szmVar2, szmVar3, szmVar4, szmVar5, szmVar6, szmVar7, szmVar8, szmVar9, szmVar10, szmVar11, szmVar12);
    }

    public static I9 provideTvAuthScenarioManager(f9f f9fVar, R3 r3, szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6, szm szmVar7, szm szmVar8, szm szmVar9, szm szmVar10) {
        I9 provideTvAuthScenarioManager = TvDetectedScreenDependenciesModule.INSTANCE.provideTvAuthScenarioManager(f9fVar, r3, szmVar, szmVar2, szmVar3, szmVar4, szmVar5, szmVar6, szmVar7, szmVar8, szmVar9, szmVar10);
        a4g.t(provideTvAuthScenarioManager);
        return provideTvAuthScenarioManager;
    }

    @Override // defpackage.szm
    public I9 get() {
        return provideTvAuthScenarioManager((f9f) this.fragmentClassProvider.get(), (R3) this.parentFragmentViewModelComponentProvider.get(), this.argsProvider, this.userCodeVerifierProvider, this.tvAuthConfigProvider, this.lgTvInteractorFactoryProvider, this.samsungTvInteractorFactoryProvider, this.androidTvInteractorFactoryProvider, this.configProvider, this.puidProvider, this.preferencesProvider, this.dispatchersProvider);
    }
}
