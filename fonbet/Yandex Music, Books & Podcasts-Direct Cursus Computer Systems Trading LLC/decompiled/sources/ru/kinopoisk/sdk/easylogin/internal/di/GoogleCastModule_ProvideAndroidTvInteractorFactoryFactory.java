package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.A;
import ru.kinopoisk.sdk.easylogin.internal.F4;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1192q7;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class GoogleCastModule_ProvideAndroidTvInteractorFactoryFactory implements rzm {
    private final szm dispatchersProvider;
    private final szm googleCastDevicesManagerProvider;
    private final szm pairingManagerProvider;

    public GoogleCastModule_ProvideAndroidTvInteractorFactoryFactory(szm szmVar, szm szmVar2, szm szmVar3) {
        this.dispatchersProvider = szmVar;
        this.googleCastDevicesManagerProvider = szmVar2;
        this.pairingManagerProvider = szmVar3;
    }

    public static GoogleCastModule_ProvideAndroidTvInteractorFactoryFactory create(szm szmVar, szm szmVar2, szm szmVar3) {
        return new GoogleCastModule_ProvideAndroidTvInteractorFactoryFactory(szmVar, szmVar2, szmVar3);
    }

    public static A provideAndroidTvInteractorFactory(Q2 q2, F4 f4, InterfaceC1192q7 interfaceC1192q7) {
        A provideAndroidTvInteractorFactory = GoogleCastModule.INSTANCE.provideAndroidTvInteractorFactory(q2, f4, interfaceC1192q7);
        a4g.t(provideAndroidTvInteractorFactory);
        return provideAndroidTvInteractorFactory;
    }

    @Override // defpackage.szm
    public A get() {
        return provideAndroidTvInteractorFactory((Q2) this.dispatchersProvider.get(), (F4) this.googleCastDevicesManagerProvider.get(), (InterfaceC1192q7) this.pairingManagerProvider.get());
    }
}
