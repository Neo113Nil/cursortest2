package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.H4;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class GoogleCastModule_ProvideGoogleCastDevicesManagerFactory implements rzm {
    private final szm castSessionLoggerProvider;
    private final szm contextProvider;
    private final szm googleCastSettingProvider;
    private final szm schedulersProvider;

    public GoogleCastModule_ProvideGoogleCastDevicesManagerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        this.contextProvider = szmVar;
        this.googleCastSettingProvider = szmVar2;
        this.castSessionLoggerProvider = szmVar3;
        this.schedulersProvider = szmVar4;
    }

    public static GoogleCastModule_ProvideGoogleCastDevicesManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        return new GoogleCastModule_ProvideGoogleCastDevicesManagerFactory(szmVar, szmVar2, szmVar3, szmVar4);
    }

    public static F4 provideGoogleCastDevicesManager(Context context, H4 h4, F0 f0, Q2 q2) {
        F4 provideGoogleCastDevicesManager = GoogleCastModule.INSTANCE.provideGoogleCastDevicesManager(context, h4, f0, q2);
        a4g.t(provideGoogleCastDevicesManager);
        return provideGoogleCastDevicesManager;
    }

    @Override // defpackage.szm
    public F4 get() {
        return provideGoogleCastDevicesManager((Context) this.contextProvider.get(), (H4) this.googleCastSettingProvider.get(), (F0) this.castSessionLoggerProvider.get(), (Q2) this.schedulersProvider.get());
    }
}
