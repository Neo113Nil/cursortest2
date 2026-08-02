package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import java.util.Map;
import ru.kinopoisk.sdk.easylogin.internal.D0;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.G0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class CastModule_Companion_ProvideCombinedCastPlayerFactory implements rzm {
    private final szm castAvailabilityProvider;
    private final szm castCastPlayerFactoriesProvider;
    private final szm castDevicesManagerProvider;
    private final szm castSessionLoggerProvider;
    private final szm castTrackerProvider;

    public CastModule_Companion_ProvideCombinedCastPlayerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5) {
        this.castAvailabilityProvider = szmVar;
        this.castCastPlayerFactoriesProvider = szmVar2;
        this.castDevicesManagerProvider = szmVar3;
        this.castSessionLoggerProvider = szmVar4;
        this.castTrackerProvider = szmVar5;
    }

    public static CastModule_Companion_ProvideCombinedCastPlayerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5) {
        return new CastModule_Companion_ProvideCombinedCastPlayerFactory(szmVar, szmVar2, szmVar3, szmVar4, szmVar5);
    }

    public static D0 provideCombinedCastPlayer(InterfaceC1185q0 interfaceC1185q0, Map<InterfaceC1305z0.c, szm> map, InterfaceC1305z0 interfaceC1305z0, F0 f0, G0 g0) {
        D0 provideCombinedCastPlayer = CastModule.INSTANCE.provideCombinedCastPlayer(interfaceC1185q0, map, interfaceC1305z0, f0, g0);
        a4g.t(provideCombinedCastPlayer);
        return provideCombinedCastPlayer;
    }

    @Override // defpackage.szm
    public D0 get() {
        return provideCombinedCastPlayer((InterfaceC1185q0) this.castAvailabilityProvider.get(), (Map) this.castCastPlayerFactoriesProvider.get(), (InterfaceC1305z0) this.castDevicesManagerProvider.get(), (F0) this.castSessionLoggerProvider.get(), (G0) this.castTrackerProvider.get());
    }
}
