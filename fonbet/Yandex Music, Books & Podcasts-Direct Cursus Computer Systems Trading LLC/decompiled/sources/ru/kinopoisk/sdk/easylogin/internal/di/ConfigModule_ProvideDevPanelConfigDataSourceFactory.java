package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C2;
import ru.kinopoisk.sdk.easylogin.internal.H1;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideDevPanelConfigDataSourceFactory implements rzm {
    private final szm factoryProvider;

    public ConfigModule_ProvideDevPanelConfigDataSourceFactory(szm szmVar) {
        this.factoryProvider = szmVar;
    }

    public static ConfigModule_ProvideDevPanelConfigDataSourceFactory create(szm szmVar) {
        return new ConfigModule_ProvideDevPanelConfigDataSourceFactory(szmVar);
    }

    public static C2 provideDevPanelConfigDataSource(H1 h1) {
        C2 provideDevPanelConfigDataSource = ConfigModule.INSTANCE.provideDevPanelConfigDataSource(h1);
        a4g.t(provideDevPanelConfigDataSource);
        return provideDevPanelConfigDataSource;
    }

    @Override // defpackage.szm
    public C2 get() {
        return provideDevPanelConfigDataSource((H1) this.factoryProvider.get());
    }
}
