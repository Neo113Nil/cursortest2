package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.O6;
import ru.kinopoisk.sdk.easylogin.internal.Q;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class KinopoiskCastModule_ProvideCastDevicesManagerFactory implements rzm {
    private final szm authTokenProvidesProvider;
    private final szm castSessionLoggerProvider;
    private final szm dispatchersProvider;
    private final szm networkStateProvider;
    private final szm pairingManagerProvider;

    public KinopoiskCastModule_ProvideCastDevicesManagerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5) {
        this.authTokenProvidesProvider = szmVar;
        this.networkStateProvider = szmVar2;
        this.castSessionLoggerProvider = szmVar3;
        this.dispatchersProvider = szmVar4;
        this.pairingManagerProvider = szmVar5;
    }

    public static KinopoiskCastModule_ProvideCastDevicesManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5) {
        return new KinopoiskCastModule_ProvideCastDevicesManagerFactory(szmVar, szmVar2, szmVar3, szmVar4, szmVar5);
    }

    public static InterfaceC1305z0 provideCastDevicesManager(Q q, O6 o6, F0 f0, Q2 q2, InterfaceC1192q7 interfaceC1192q7) {
        InterfaceC1305z0 provideCastDevicesManager = KinopoiskCastModule.INSTANCE.provideCastDevicesManager(q, o6, f0, q2, interfaceC1192q7);
        a4g.t(provideCastDevicesManager);
        return provideCastDevicesManager;
    }

    @Override // defpackage.szm
    public InterfaceC1305z0 get() {
        return provideCastDevicesManager((Q) this.authTokenProvidesProvider.get(), (O6) this.networkStateProvider.get(), (F0) this.castSessionLoggerProvider.get(), (Q2) this.dispatchersProvider.get(), (InterfaceC1192q7) this.pairingManagerProvider.get());
    }
}
