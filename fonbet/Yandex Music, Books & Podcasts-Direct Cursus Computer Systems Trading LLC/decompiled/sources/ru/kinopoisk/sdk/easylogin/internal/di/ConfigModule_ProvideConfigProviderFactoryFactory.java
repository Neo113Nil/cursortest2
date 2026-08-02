package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.Context;
import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.E1;
import ru.kinopoisk.sdk.easylogin.internal.H1;
import ru.kinopoisk.sdk.easylogin.internal.N7;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideConfigProviderFactoryFactory implements rzm {
    private final szm contextProvider;
    private final szm descriptorsProvider;
    private final szm diagnosticsCallbackProvider;
    private final szm dispatchersProvider;

    public ConfigModule_ProvideConfigProviderFactoryFactory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        this.contextProvider = szmVar;
        this.descriptorsProvider = szmVar2;
        this.dispatchersProvider = szmVar3;
        this.diagnosticsCallbackProvider = szmVar4;
    }

    public static ConfigModule_ProvideConfigProviderFactoryFactory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        return new ConfigModule_ProvideConfigProviderFactoryFactory(szmVar, szmVar2, szmVar3, szmVar4);
    }

    public static H1 provideConfigProviderFactory(Context context, E1 e1, Q2 q2, N7 n7) {
        H1 provideConfigProviderFactory = ConfigModule.INSTANCE.provideConfigProviderFactory(context, e1, q2, n7);
        a4g.t(provideConfigProviderFactory);
        return provideConfigProviderFactory;
    }

    @Override // defpackage.szm
    public H1 get() {
        return provideConfigProviderFactory((Context) this.contextProvider.get(), (E1) this.descriptorsProvider.get(), (Q2) this.dispatchersProvider.get(), (N7) this.diagnosticsCallbackProvider.get());
    }
}
