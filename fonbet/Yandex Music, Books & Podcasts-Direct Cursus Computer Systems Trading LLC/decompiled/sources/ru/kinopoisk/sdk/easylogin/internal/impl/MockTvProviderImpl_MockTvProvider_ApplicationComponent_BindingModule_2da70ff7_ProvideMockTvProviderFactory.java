package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1311z6;

/* loaded from: classes5.dex */
public final class MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory INSTANCE = new MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory();

        private InstanceHolder() {
        }
    }

    public static MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7_ProvideMockTvProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InterfaceC1311z6 provideMockTvProvider() {
        InterfaceC1311z6 provideMockTvProvider = MockTvProviderImpl_MockTvProvider_ApplicationComponent_BindingModule_2da70ff7.INSTANCE.provideMockTvProvider();
        a4g.t(provideMockTvProvider);
        return provideMockTvProvider;
    }

    @Override // defpackage.szm
    public InterfaceC1311z6 get() {
        return provideMockTvProvider();
    }
}
