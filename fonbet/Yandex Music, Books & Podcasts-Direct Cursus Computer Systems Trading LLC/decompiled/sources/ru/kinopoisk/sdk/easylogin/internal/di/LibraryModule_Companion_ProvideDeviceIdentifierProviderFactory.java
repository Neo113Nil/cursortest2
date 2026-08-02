package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.D2;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvideDeviceIdentifierProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvideDeviceIdentifierProviderFactory INSTANCE = new LibraryModule_Companion_ProvideDeviceIdentifierProviderFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvideDeviceIdentifierProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static D2 provideDeviceIdentifierProvider() {
        D2 provideDeviceIdentifierProvider = LibraryModule.INSTANCE.provideDeviceIdentifierProvider();
        a4g.t(provideDeviceIdentifierProvider);
        return provideDeviceIdentifierProvider;
    }

    @Override // defpackage.szm
    public D2 get() {
        return provideDeviceIdentifierProvider();
    }
}
