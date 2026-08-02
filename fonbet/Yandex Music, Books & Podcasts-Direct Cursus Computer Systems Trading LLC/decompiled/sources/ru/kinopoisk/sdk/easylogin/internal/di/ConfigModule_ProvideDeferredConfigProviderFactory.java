package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.H1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1294y2;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideDeferredConfigProviderFactory implements rzm {
    private final szm factoryProvider;

    public ConfigModule_ProvideDeferredConfigProviderFactory(szm szmVar) {
        this.factoryProvider = szmVar;
    }

    public static ConfigModule_ProvideDeferredConfigProviderFactory create(szm szmVar) {
        return new ConfigModule_ProvideDeferredConfigProviderFactory(szmVar);
    }

    public static InterfaceC1294y2 provideDeferredConfigProvider(H1 h1) {
        InterfaceC1294y2 provideDeferredConfigProvider = ConfigModule.INSTANCE.provideDeferredConfigProvider(h1);
        a4g.t(provideDeferredConfigProvider);
        return provideDeferredConfigProvider;
    }

    @Override // defpackage.szm
    public InterfaceC1294y2 get() {
        return provideDeferredConfigProvider((H1) this.factoryProvider.get());
    }
}
