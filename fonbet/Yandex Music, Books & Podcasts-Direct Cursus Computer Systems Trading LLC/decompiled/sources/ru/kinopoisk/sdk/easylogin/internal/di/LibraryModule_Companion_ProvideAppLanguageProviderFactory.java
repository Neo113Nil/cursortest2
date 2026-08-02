package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.F;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvideAppLanguageProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvideAppLanguageProviderFactory INSTANCE = new LibraryModule_Companion_ProvideAppLanguageProviderFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvideAppLanguageProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static F provideAppLanguageProvider() {
        F provideAppLanguageProvider = LibraryModule.INSTANCE.provideAppLanguageProvider();
        a4g.t(provideAppLanguageProvider);
        return provideAppLanguageProvider;
    }

    @Override // defpackage.szm
    public F get() {
        return provideAppLanguageProvider();
    }
}
