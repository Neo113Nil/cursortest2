package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;

/* loaded from: classes5.dex */
public final class EasyLoginGenaPlatformParamsProvider_Factory implements rzm {

    public static final class InstanceHolder {
        private static final EasyLoginGenaPlatformParamsProvider_Factory INSTANCE = new EasyLoginGenaPlatformParamsProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static EasyLoginGenaPlatformParamsProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EasyLoginGenaPlatformParamsProvider newInstance() {
        return new EasyLoginGenaPlatformParamsProvider();
    }

    @Override // defpackage.szm
    public EasyLoginGenaPlatformParamsProvider get() {
        return newInstance();
    }
}
