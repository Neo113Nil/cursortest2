package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q;

/* loaded from: classes5.dex */
public final class AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory implements rzm {

    public static final class InstanceHolder {
        private static final AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory INSTANCE = new AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory();

        private InstanceHolder() {
        }
    }

    public static AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e_ProvideAnalyticsErrorMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InterfaceC1184q provideAnalyticsErrorMapper() {
        InterfaceC1184q provideAnalyticsErrorMapper = AnalyticsErrorMapperImpl_AnalyticsErrorMapper_ApplicationComponent_BindingModule_0911859e.INSTANCE.provideAnalyticsErrorMapper();
        a4g.t(provideAnalyticsErrorMapper);
        return provideAnalyticsErrorMapper;
    }

    @Override // defpackage.szm
    public InterfaceC1184q get() {
        return provideAnalyticsErrorMapper();
    }
}
