package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.O6;

/* loaded from: classes5.dex */
public final class NetworkModule_Companion_ProvideNetworkStateProviderFactory implements rzm {
    private final szm contextProvider;

    public NetworkModule_Companion_ProvideNetworkStateProviderFactory(szm szmVar) {
        this.contextProvider = szmVar;
    }

    public static NetworkModule_Companion_ProvideNetworkStateProviderFactory create(szm szmVar) {
        return new NetworkModule_Companion_ProvideNetworkStateProviderFactory(szmVar);
    }

    public static O6 provideNetworkStateProvider(Context context) {
        O6 provideNetworkStateProvider = NetworkModule.INSTANCE.provideNetworkStateProvider(context);
        a4g.t(provideNetworkStateProvider);
        return provideNetworkStateProvider;
    }

    @Override // defpackage.szm
    public O6 get() {
        return provideNetworkStateProvider((Context) this.contextProvider.get());
    }
}
