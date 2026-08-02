package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1261v8;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class SamsungCastModule_ProvideSamsungTvInteractorFactoryFactory implements rzm {
    private final szm contextProvider;
    private final szm dispatchersProvider;

    public SamsungCastModule_ProvideSamsungTvInteractorFactoryFactory(szm szmVar, szm szmVar2) {
        this.contextProvider = szmVar;
        this.dispatchersProvider = szmVar2;
    }

    public static SamsungCastModule_ProvideSamsungTvInteractorFactoryFactory create(szm szmVar, szm szmVar2) {
        return new SamsungCastModule_ProvideSamsungTvInteractorFactoryFactory(szmVar, szmVar2);
    }

    public static C1261v8 provideSamsungTvInteractorFactory(Context context, Q2 q2) {
        C1261v8 provideSamsungTvInteractorFactory = SamsungCastModule.INSTANCE.provideSamsungTvInteractorFactory(context, q2);
        a4g.t(provideSamsungTvInteractorFactory);
        return provideSamsungTvInteractorFactory;
    }

    @Override // defpackage.szm
    public C1261v8 get() {
        return provideSamsungTvInteractorFactory((Context) this.contextProvider.get(), (Q2) this.dispatchersProvider.get());
    }
}
