package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.M2;

/* loaded from: classes5.dex */
public final class NetworkModule_Companion_ProvideDiagnosticsReporterProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final NetworkModule_Companion_ProvideDiagnosticsReporterProviderFactory INSTANCE = new NetworkModule_Companion_ProvideDiagnosticsReporterProviderFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_Companion_ProvideDiagnosticsReporterProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static M2 provideDiagnosticsReporterProvider() {
        M2 provideDiagnosticsReporterProvider = NetworkModule.INSTANCE.provideDiagnosticsReporterProvider();
        a4g.t(provideDiagnosticsReporterProvider);
        return provideDiagnosticsReporterProvider;
    }

    @Override // defpackage.szm
    public M2 get() {
        return provideDiagnosticsReporterProvider();
    }
}
