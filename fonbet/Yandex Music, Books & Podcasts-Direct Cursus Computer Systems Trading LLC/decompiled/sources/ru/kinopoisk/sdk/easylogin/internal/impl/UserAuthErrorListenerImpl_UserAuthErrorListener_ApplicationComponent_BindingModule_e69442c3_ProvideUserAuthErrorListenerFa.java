package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.Kc;

/* loaded from: classes5.dex */
public final class UserAuthErrorListenerImpl_UserAuthErrorListener_ApplicationComponent_BindingModule_e69442c3_ProvideUserAuthErrorListenerFactory implements rzm {

    public static final class InstanceHolder {
        private static final UserAuthErrorListenerImpl_UserAuthErrorListener_ApplicationComponent_BindingModule_e69442c3_ProvideUserAuthErrorListenerFactory INSTANCE = new UserAuthErrorListenerImpl_UserAuthErrorListener_ApplicationComponent_BindingModule_e69442c3_ProvideUserAuthErrorListenerFactory();

        private InstanceHolder() {
        }
    }

    public static UserAuthErrorListenerImpl_UserAuthErrorListener_ApplicationComponent_BindingModule_e69442c3_ProvideUserAuthErrorListenerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Kc provideUserAuthErrorListener() {
        Kc provideUserAuthErrorListener = UserAuthErrorListenerImpl_UserAuthErrorListener_ApplicationComponent_BindingModule_e69442c3.INSTANCE.provideUserAuthErrorListener();
        a4g.t(provideUserAuthErrorListener);
        return provideUserAuthErrorListener;
    }

    @Override // defpackage.szm
    public Kc get() {
        return provideUserAuthErrorListener();
    }
}
