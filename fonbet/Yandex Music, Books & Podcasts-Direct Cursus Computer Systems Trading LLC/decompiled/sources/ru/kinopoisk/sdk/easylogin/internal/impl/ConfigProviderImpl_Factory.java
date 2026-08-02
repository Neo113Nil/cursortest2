package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginDependencies;

/* loaded from: classes5.dex */
public final class ConfigProviderImpl_Factory implements rzm {
    private final szm dependenciesProvider;

    public ConfigProviderImpl_Factory(szm szmVar) {
        this.dependenciesProvider = szmVar;
    }

    public static ConfigProviderImpl_Factory create(szm szmVar) {
        return new ConfigProviderImpl_Factory(szmVar);
    }

    public static ConfigProviderImpl newInstance(EasyLoginDependencies easyLoginDependencies) {
        return new ConfigProviderImpl(easyLoginDependencies);
    }

    @Override // defpackage.szm
    public ConfigProviderImpl get() {
        return newInstance((EasyLoginDependencies) this.dependenciesProvider.get());
    }
}
