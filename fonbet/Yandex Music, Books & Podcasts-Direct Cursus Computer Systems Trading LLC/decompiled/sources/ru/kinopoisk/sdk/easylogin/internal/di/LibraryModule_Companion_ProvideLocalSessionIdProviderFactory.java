package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1023e6;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvideLocalSessionIdProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvideLocalSessionIdProviderFactory INSTANCE = new LibraryModule_Companion_ProvideLocalSessionIdProviderFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvideLocalSessionIdProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InterfaceC1023e6 provideLocalSessionIdProvider() {
        InterfaceC1023e6 provideLocalSessionIdProvider = LibraryModule.INSTANCE.provideLocalSessionIdProvider();
        a4g.t(provideLocalSessionIdProvider);
        return provideLocalSessionIdProvider;
    }

    @Override // defpackage.szm
    public InterfaceC1023e6 get() {
        return provideLocalSessionIdProvider();
    }
}
