package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.G;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvideAppSessionIdProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvideAppSessionIdProviderFactory INSTANCE = new LibraryModule_Companion_ProvideAppSessionIdProviderFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvideAppSessionIdProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static G provideAppSessionIdProvider() {
        G provideAppSessionIdProvider = LibraryModule.INSTANCE.provideAppSessionIdProvider();
        a4g.t(provideAppSessionIdProvider);
        return provideAppSessionIdProvider;
    }

    @Override // defpackage.szm
    public G get() {
        return provideAppSessionIdProvider();
    }
}
