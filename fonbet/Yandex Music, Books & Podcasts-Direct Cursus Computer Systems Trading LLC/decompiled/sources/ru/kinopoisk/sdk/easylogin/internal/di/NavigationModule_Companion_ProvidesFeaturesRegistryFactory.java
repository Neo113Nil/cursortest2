package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import defpackage.szm;
import java.util.Set;
import ru.kinopoisk.sdk.easylogin.internal.D3;
import ru.kinopoisk.sdk.easylogin.internal.E3;

/* loaded from: classes5.dex */
public final class NavigationModule_Companion_ProvidesFeaturesRegistryFactory implements rzm {
    private final szm featureInitializersProvider;

    public NavigationModule_Companion_ProvidesFeaturesRegistryFactory(szm szmVar) {
        this.featureInitializersProvider = szmVar;
    }

    public static NavigationModule_Companion_ProvidesFeaturesRegistryFactory create(szm szmVar) {
        return new NavigationModule_Companion_ProvidesFeaturesRegistryFactory(szmVar);
    }

    public static E3 providesFeaturesRegistry(Set<D3> set) {
        E3 providesFeaturesRegistry = NavigationModule.INSTANCE.providesFeaturesRegistry(set);
        a4g.t(providesFeaturesRegistry);
        return providesFeaturesRegistry;
    }

    @Override // defpackage.szm
    public E3 get() {
        return providesFeaturesRegistry((Set) this.featureInitializersProvider.get());
    }
}
