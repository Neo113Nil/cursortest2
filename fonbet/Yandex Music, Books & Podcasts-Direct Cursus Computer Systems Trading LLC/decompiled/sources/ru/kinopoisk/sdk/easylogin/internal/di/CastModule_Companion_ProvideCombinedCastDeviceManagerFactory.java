package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import java.util.Map;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.G0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class CastModule_Companion_ProvideCombinedCastDeviceManagerFactory implements rzm {
    private final szm castAvailabilityProvider;
    private final szm castDevicesManagersProvider;
    private final szm castSessionLoggerProvider;
    private final szm castTrackerProvider;

    public CastModule_Companion_ProvideCombinedCastDeviceManagerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        this.castAvailabilityProvider = szmVar;
        this.castDevicesManagersProvider = szmVar2;
        this.castSessionLoggerProvider = szmVar3;
        this.castTrackerProvider = szmVar4;
    }

    public static CastModule_Companion_ProvideCombinedCastDeviceManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        return new CastModule_Companion_ProvideCombinedCastDeviceManagerFactory(szmVar, szmVar2, szmVar3, szmVar4);
    }

    public static InterfaceC1305z0 provideCombinedCastDeviceManager(InterfaceC1185q0 interfaceC1185q0, Map<InterfaceC1305z0.c, szm> map, F0 f0, G0 g0) {
        InterfaceC1305z0 provideCombinedCastDeviceManager = CastModule.INSTANCE.provideCombinedCastDeviceManager(interfaceC1185q0, map, f0, g0);
        a4g.t(provideCombinedCastDeviceManager);
        return provideCombinedCastDeviceManager;
    }

    @Override // defpackage.szm
    public InterfaceC1305z0 get() {
        return provideCombinedCastDeviceManager((InterfaceC1185q0) this.castAvailabilityProvider.get(), (Map) this.castDevicesManagersProvider.get(), (F0) this.castSessionLoggerProvider.get(), (G0) this.castTrackerProvider.get());
    }
}
