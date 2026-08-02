package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.K;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvideApplicationConfigFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvideApplicationConfigFactory INSTANCE = new LibraryModule_Companion_ProvideApplicationConfigFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvideApplicationConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static K provideApplicationConfig() {
        K provideApplicationConfig = LibraryModule.INSTANCE.provideApplicationConfig();
        a4g.t(provideApplicationConfig);
        return provideApplicationConfig;
    }

    @Override // defpackage.szm
    public K get() {
        return provideApplicationConfig();
    }
}
