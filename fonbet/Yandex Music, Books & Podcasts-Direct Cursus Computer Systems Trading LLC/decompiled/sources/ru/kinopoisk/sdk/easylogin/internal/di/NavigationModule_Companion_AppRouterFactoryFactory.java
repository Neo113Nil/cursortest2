package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.E3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC0969a8;
import ru.kinopoisk.sdk.easylogin.internal.T7;

/* loaded from: classes5.dex */
public final class NavigationModule_Companion_AppRouterFactoryFactory implements rzm {
    private final szm registryProvider;

    public NavigationModule_Companion_AppRouterFactoryFactory(szm szmVar) {
        this.registryProvider = szmVar;
    }

    public static InterfaceC0969a8<T7> appRouterFactory(E3 e3) {
        InterfaceC0969a8<T7> appRouterFactory = NavigationModule.INSTANCE.appRouterFactory(e3);
        a4g.t(appRouterFactory);
        return appRouterFactory;
    }

    public static NavigationModule_Companion_AppRouterFactoryFactory create(szm szmVar) {
        return new NavigationModule_Companion_AppRouterFactoryFactory(szmVar);
    }

    @Override // defpackage.szm
    public InterfaceC0969a8<T7> get() {
        return appRouterFactory((E3) this.registryProvider.get());
    }
}
