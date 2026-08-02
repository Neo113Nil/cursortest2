package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class GoogleCastModule_ProvideCastDevicesManagerFactory implements rzm {
    private final szm googleCastDevicesManagerProvider;

    public GoogleCastModule_ProvideCastDevicesManagerFactory(szm szmVar) {
        this.googleCastDevicesManagerProvider = szmVar;
    }

    public static GoogleCastModule_ProvideCastDevicesManagerFactory create(szm szmVar) {
        return new GoogleCastModule_ProvideCastDevicesManagerFactory(szmVar);
    }

    public static InterfaceC1305z0 provideCastDevicesManager(F4 f4) {
        InterfaceC1305z0 provideCastDevicesManager = GoogleCastModule.INSTANCE.provideCastDevicesManager(f4);
        a4g.t(provideCastDevicesManager);
        return provideCastDevicesManager;
    }

    @Override // defpackage.szm
    public InterfaceC1305z0 get() {
        return provideCastDevicesManager((F4) this.googleCastDevicesManagerProvider.get());
    }
}
