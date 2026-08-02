package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.N5;
import ru.kinopoisk.sdk.easylogin.internal.O6;
import ru.kinopoisk.sdk.easylogin.internal.Q;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class LgCastModule_ProvideCastDevicesManagerFactory implements rzm {
    private final szm authTokenProvider;
    private final szm castSessionLoggerProvider;
    private final szm contextProvider;
    private final szm dispatchersProvider;
    private final szm lgDiscoveryManagerDelegateProvider;
    private final szm networkStateProvider;

    public LgCastModule_ProvideCastDevicesManagerFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6) {
        this.contextProvider = szmVar;
        this.authTokenProvider = szmVar2;
        this.networkStateProvider = szmVar3;
        this.castSessionLoggerProvider = szmVar4;
        this.dispatchersProvider = szmVar5;
        this.lgDiscoveryManagerDelegateProvider = szmVar6;
    }

    public static LgCastModule_ProvideCastDevicesManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6) {
        return new LgCastModule_ProvideCastDevicesManagerFactory(szmVar, szmVar2, szmVar3, szmVar4, szmVar5, szmVar6);
    }

    public static InterfaceC1305z0 provideCastDevicesManager(Context context, Q q, O6 o6, F0 f0, Q2 q2, N5 n5) {
        InterfaceC1305z0 provideCastDevicesManager = LgCastModule.INSTANCE.provideCastDevicesManager(context, q, o6, f0, q2, n5);
        a4g.t(provideCastDevicesManager);
        return provideCastDevicesManager;
    }

    @Override // defpackage.szm
    public InterfaceC1305z0 get() {
        return provideCastDevicesManager((Context) this.contextProvider.get(), (Q) this.authTokenProvider.get(), (O6) this.networkStateProvider.get(), (F0) this.castSessionLoggerProvider.get(), (Q2) this.dispatchersProvider.get(), (N5) this.lgDiscoveryManagerDelegateProvider.get());
    }
}
