package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.B3;
import ru.kinopoisk.sdk.easylogin.internal.H1;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideExpsProviderFactory implements rzm {
    private final szm factoryProvider;

    public ConfigModule_ProvideExpsProviderFactory(szm szmVar) {
        this.factoryProvider = szmVar;
    }

    public static ConfigModule_ProvideExpsProviderFactory create(szm szmVar) {
        return new ConfigModule_ProvideExpsProviderFactory(szmVar);
    }

    public static B3 provideExpsProvider(H1 h1) {
        B3 provideExpsProvider = ConfigModule.INSTANCE.provideExpsProvider(h1);
        a4g.t(provideExpsProvider);
        return provideExpsProvider;
    }

    @Override // defpackage.szm
    public B3 get() {
        return provideExpsProvider((H1) this.factoryProvider.get());
    }
}
