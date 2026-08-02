package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.C1300y8;

/* loaded from: classes5.dex */
public final class NavigationModule_Companion_ProvideScreenResultDispatcherFactory implements rzm {

    public static final class InstanceHolder {
        private static final NavigationModule_Companion_ProvideScreenResultDispatcherFactory INSTANCE = new NavigationModule_Companion_ProvideScreenResultDispatcherFactory();

        private InstanceHolder() {
        }
    }

    public static NavigationModule_Companion_ProvideScreenResultDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static C1300y8 provideScreenResultDispatcher() {
        C1300y8 provideScreenResultDispatcher = NavigationModule.INSTANCE.provideScreenResultDispatcher();
        a4g.t(provideScreenResultDispatcher);
        return provideScreenResultDispatcher;
    }

    @Override // defpackage.szm
    public C1300y8 get() {
        return provideScreenResultDispatcher();
    }
}
