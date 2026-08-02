package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.Mc;

/* loaded from: classes5.dex */
public final class StubUserAuthProvider_UserAuthProvider_ApplicationComponent_BindingModule_414b92ac_ProvideUserAuthProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final StubUserAuthProvider_UserAuthProvider_ApplicationComponent_BindingModule_414b92ac_ProvideUserAuthProviderFactory INSTANCE = new StubUserAuthProvider_UserAuthProvider_ApplicationComponent_BindingModule_414b92ac_ProvideUserAuthProviderFactory();

        private InstanceHolder() {
        }
    }

    public static StubUserAuthProvider_UserAuthProvider_ApplicationComponent_BindingModule_414b92ac_ProvideUserAuthProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mc provideUserAuthProvider() {
        Mc provideUserAuthProvider = StubUserAuthProvider_UserAuthProvider_ApplicationComponent_BindingModule_414b92ac.INSTANCE.provideUserAuthProvider();
        a4g.t(provideUserAuthProvider);
        return provideUserAuthProvider;
    }

    @Override // defpackage.szm
    public Mc get() {
        return provideUserAuthProvider();
    }
}
