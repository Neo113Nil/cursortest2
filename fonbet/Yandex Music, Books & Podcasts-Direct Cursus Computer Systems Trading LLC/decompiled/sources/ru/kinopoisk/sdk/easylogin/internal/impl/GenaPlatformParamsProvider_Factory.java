package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C;

/* loaded from: classes5.dex */
public final class GenaPlatformParamsProvider_Factory implements rzm {
    private final szm appInfoProvider;

    public GenaPlatformParamsProvider_Factory(szm szmVar) {
        this.appInfoProvider = szmVar;
    }

    public static GenaPlatformParamsProvider_Factory create(szm szmVar) {
        return new GenaPlatformParamsProvider_Factory(szmVar);
    }

    public static GenaPlatformParamsProvider newInstance(C c) {
        return new GenaPlatformParamsProvider(c);
    }

    @Override // defpackage.szm
    public GenaPlatformParamsProvider get() {
        return newInstance((C) this.appInfoProvider.get());
    }
}
