package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.Q;

/* loaded from: classes5.dex */
public final class StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory INSTANCE = new StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory();

        private InstanceHolder() {
        }
    }

    public static StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799_ProvideAuthTokenProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Q provideAuthTokenProvider() {
        Q provideAuthTokenProvider = StubAuthTokenProvider_AuthTokenProvider_ApplicationComponent_BindingModule_b176c799.INSTANCE.provideAuthTokenProvider();
        a4g.t(provideAuthTokenProvider);
        return provideAuthTokenProvider;
    }

    @Override // defpackage.szm
    public Q get() {
        return provideAuthTokenProvider();
    }
}
