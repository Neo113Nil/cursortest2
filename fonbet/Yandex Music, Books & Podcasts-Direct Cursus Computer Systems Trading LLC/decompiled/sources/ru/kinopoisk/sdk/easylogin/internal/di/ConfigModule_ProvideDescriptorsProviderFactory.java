package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.E1;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideDescriptorsProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final ConfigModule_ProvideDescriptorsProviderFactory INSTANCE = new ConfigModule_ProvideDescriptorsProviderFactory();

        private InstanceHolder() {
        }
    }

    public static ConfigModule_ProvideDescriptorsProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static E1 provideDescriptorsProvider() {
        E1 provideDescriptorsProvider = ConfigModule.INSTANCE.provideDescriptorsProvider();
        a4g.t(provideDescriptorsProvider);
        return provideDescriptorsProvider;
    }

    @Override // defpackage.szm
    public E1 get() {
        return provideDescriptorsProvider();
    }
}
