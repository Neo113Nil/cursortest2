package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.C;

/* loaded from: classes5.dex */
public final class AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory INSTANCE = new AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory();

        private InstanceHolder() {
        }
    }

    public static AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c_ProvideAppInfoProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static C provideAppInfoProvider() {
        C provideAppInfoProvider = AppInfoProviderImpl_AppInfoProvider_ApplicationComponent_BindingModule_a965c50c.INSTANCE.provideAppInfoProvider();
        a4g.t(provideAppInfoProvider);
        return provideAppInfoProvider;
    }

    @Override // defpackage.szm
    public C get() {
        return provideAppInfoProvider();
    }
}
