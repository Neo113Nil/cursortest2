package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.SharedPreferences;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1188q3;

/* loaded from: classes5.dex */
public final class CastModule_Companion_ProvideCastLoggerFactory implements rzm {
    private final szm errorReporterProvider;
    private final szm logReporterProvider;
    private final szm sharedPreferencesProvider;

    public CastModule_Companion_ProvideCastLoggerFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.errorReporterProvider = szmVar;
        this.logReporterProvider = szmVar2;
        this.sharedPreferencesProvider = szmVar3;
    }

    public static CastModule_Companion_ProvideCastLoggerFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new CastModule_Companion_ProvideCastLoggerFactory(szmVar, szmVar2, szmVar3);
    }

    public static F0 provideCastLogger(InterfaceC1188q3 interfaceC1188q3, InterfaceC1093j6 interfaceC1093j6, SharedPreferences sharedPreferences) {
        F0 provideCastLogger = CastModule.INSTANCE.provideCastLogger(interfaceC1188q3, interfaceC1093j6, sharedPreferences);
        a4g.t(provideCastLogger);
        return provideCastLogger;
    }

    @Override // defpackage.szm
    public F0 get() {
        return provideCastLogger((InterfaceC1188q3) this.errorReporterProvider.get(), (InterfaceC1093j6) this.logReporterProvider.get(), (SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
