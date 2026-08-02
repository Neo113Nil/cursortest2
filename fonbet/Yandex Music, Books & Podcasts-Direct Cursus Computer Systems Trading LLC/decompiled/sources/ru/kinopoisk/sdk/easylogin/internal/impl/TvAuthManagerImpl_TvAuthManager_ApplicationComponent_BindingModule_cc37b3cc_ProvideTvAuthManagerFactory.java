package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.H9;

/* loaded from: classes5.dex */
public final class TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory implements rzm {

    public static final class InstanceHolder {
        private static final TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory INSTANCE = new TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory();

        private InstanceHolder() {
        }
    }

    public static TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc_ProvideTvAuthManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static H9 provideTvAuthManager() {
        H9 provideTvAuthManager = TvAuthManagerImpl_TvAuthManager_ApplicationComponent_BindingModule_cc37b3cc.INSTANCE.provideTvAuthManager();
        a4g.t(provideTvAuthManager);
        return provideTvAuthManager;
    }

    @Override // defpackage.szm
    public H9 get() {
        return provideTvAuthManager();
    }
}
