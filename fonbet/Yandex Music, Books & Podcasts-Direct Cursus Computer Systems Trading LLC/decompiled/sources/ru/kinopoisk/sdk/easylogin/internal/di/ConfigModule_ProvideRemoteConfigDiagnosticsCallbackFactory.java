package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.N7;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideRemoteConfigDiagnosticsCallbackFactory implements rzm {

    public static final class InstanceHolder {
        private static final ConfigModule_ProvideRemoteConfigDiagnosticsCallbackFactory INSTANCE = new ConfigModule_ProvideRemoteConfigDiagnosticsCallbackFactory();

        private InstanceHolder() {
        }
    }

    public static ConfigModule_ProvideRemoteConfigDiagnosticsCallbackFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static N7 provideRemoteConfigDiagnosticsCallback() {
        return ConfigModule.INSTANCE.provideRemoteConfigDiagnosticsCallback();
    }

    @Override // defpackage.szm
    public N7 get() {
        return provideRemoteConfigDiagnosticsCallback();
    }
}
