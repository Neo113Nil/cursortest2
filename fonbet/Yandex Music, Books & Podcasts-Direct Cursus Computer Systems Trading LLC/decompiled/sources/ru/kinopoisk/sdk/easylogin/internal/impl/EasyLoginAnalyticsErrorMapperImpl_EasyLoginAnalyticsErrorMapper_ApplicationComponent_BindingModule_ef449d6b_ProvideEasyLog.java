package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsErrorMapper;

/* loaded from: classes5.dex */
public final class EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory implements rzm {

    public static final class InstanceHolder {
        private static final EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory INSTANCE = new EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory();

        private InstanceHolder() {
        }
    }

    public static EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b_ProvideEasyLoginAnalyticsErrorMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EasyLoginAnalyticsErrorMapper provideEasyLoginAnalyticsErrorMapper() {
        EasyLoginAnalyticsErrorMapper provideEasyLoginAnalyticsErrorMapper = EasyLoginAnalyticsErrorMapperImpl_EasyLoginAnalyticsErrorMapper_ApplicationComponent_BindingModule_ef449d6b.INSTANCE.provideEasyLoginAnalyticsErrorMapper();
        a4g.t(provideEasyLoginAnalyticsErrorMapper);
        return provideEasyLoginAnalyticsErrorMapper;
    }

    @Override // defpackage.szm
    public EasyLoginAnalyticsErrorMapper get() {
        return provideEasyLoginAnalyticsErrorMapper();
    }
}
