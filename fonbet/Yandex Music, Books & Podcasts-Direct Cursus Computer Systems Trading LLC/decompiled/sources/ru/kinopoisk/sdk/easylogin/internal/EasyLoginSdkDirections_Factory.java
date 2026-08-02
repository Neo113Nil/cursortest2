package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.rzm;
import defpackage.szm;

/* loaded from: classes5.dex */
public final class EasyLoginSdkDirections_Factory implements rzm {
    private final szm routerProvider;
    private final szm specificationProvider;

    public EasyLoginSdkDirections_Factory(szm szmVar, szm szmVar2) {
        this.specificationProvider = szmVar;
        this.routerProvider = szmVar2;
    }

    public static EasyLoginSdkDirections_Factory create(szm szmVar, szm szmVar2) {
        return new EasyLoginSdkDirections_Factory(szmVar, szmVar2);
    }

    public static EasyLoginSdkDirections newInstance(F2 f2, T7 t7) {
        return new EasyLoginSdkDirections(f2, t7);
    }

    @Override // defpackage.szm
    public EasyLoginSdkDirections get() {
        return newInstance((F2) this.specificationProvider.get(), (T7) this.routerProvider.get());
    }
}
