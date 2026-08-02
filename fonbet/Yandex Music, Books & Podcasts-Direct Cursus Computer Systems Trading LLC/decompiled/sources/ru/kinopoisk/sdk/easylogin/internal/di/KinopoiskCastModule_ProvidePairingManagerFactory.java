package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7;
import ru.kinopoisk.sdk.easylogin.internal.O6;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class KinopoiskCastModule_ProvidePairingManagerFactory implements rzm {
    private final szm contextProvider;
    private final szm dispatchersProvider;
    private final szm networkStateProvider;

    public KinopoiskCastModule_ProvidePairingManagerFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.contextProvider = szmVar;
        this.networkStateProvider = szmVar2;
        this.dispatchersProvider = szmVar3;
    }

    public static KinopoiskCastModule_ProvidePairingManagerFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new KinopoiskCastModule_ProvidePairingManagerFactory(szmVar, szmVar2, szmVar3);
    }

    public static InterfaceC1192q7 providePairingManager(Context context, O6 o6, Q2 q2) {
        InterfaceC1192q7 providePairingManager = KinopoiskCastModule.INSTANCE.providePairingManager(context, o6, q2);
        a4g.t(providePairingManager);
        return providePairingManager;
    }

    @Override // defpackage.szm
    public InterfaceC1192q7 get() {
        return providePairingManager((Context) this.contextProvider.get(), (O6) this.networkStateProvider.get(), (Q2) this.dispatchersProvider.get());
    }
}
