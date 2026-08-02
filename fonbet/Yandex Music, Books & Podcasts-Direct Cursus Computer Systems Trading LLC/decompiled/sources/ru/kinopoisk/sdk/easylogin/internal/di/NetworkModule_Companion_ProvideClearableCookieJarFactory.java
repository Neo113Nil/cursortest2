package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.L0;

/* loaded from: classes5.dex */
public final class NetworkModule_Companion_ProvideClearableCookieJarFactory implements rzm {
    private final szm contextProvider;

    public NetworkModule_Companion_ProvideClearableCookieJarFactory(szm szmVar) {
        this.contextProvider = szmVar;
    }

    public static NetworkModule_Companion_ProvideClearableCookieJarFactory create(szm szmVar) {
        return new NetworkModule_Companion_ProvideClearableCookieJarFactory(szmVar);
    }

    public static L0 provideClearableCookieJar(Context context) {
        L0 provideClearableCookieJar = NetworkModule.INSTANCE.provideClearableCookieJar(context);
        a4g.t(provideClearableCookieJar);
        return provideClearableCookieJar;
    }

    @Override // defpackage.szm
    public L0 get() {
        return provideClearableCookieJar((Context) this.contextProvider.get());
    }
}
