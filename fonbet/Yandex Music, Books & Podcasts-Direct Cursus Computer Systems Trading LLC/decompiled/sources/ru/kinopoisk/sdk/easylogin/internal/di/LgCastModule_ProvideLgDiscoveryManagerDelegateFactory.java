package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.N5;

/* loaded from: classes5.dex */
public final class LgCastModule_ProvideLgDiscoveryManagerDelegateFactory implements rzm {
    private final szm contextProvider;

    public LgCastModule_ProvideLgDiscoveryManagerDelegateFactory(szm szmVar) {
        this.contextProvider = szmVar;
    }

    public static LgCastModule_ProvideLgDiscoveryManagerDelegateFactory create(szm szmVar) {
        return new LgCastModule_ProvideLgDiscoveryManagerDelegateFactory(szmVar);
    }

    public static N5 provideLgDiscoveryManagerDelegate(Context context) {
        N5 provideLgDiscoveryManagerDelegate = LgCastModule.INSTANCE.provideLgDiscoveryManagerDelegate(context);
        a4g.t(provideLgDiscoveryManagerDelegate);
        return provideLgDiscoveryManagerDelegate;
    }

    @Override // defpackage.szm
    public N5 get() {
        return provideLgDiscoveryManagerDelegate((Context) this.contextProvider.get());
    }
}
