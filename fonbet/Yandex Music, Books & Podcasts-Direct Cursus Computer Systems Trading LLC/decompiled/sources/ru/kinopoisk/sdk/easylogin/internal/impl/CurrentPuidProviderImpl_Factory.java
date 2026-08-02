package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.api.CurrentAccountInfoProvider;

/* loaded from: classes5.dex */
public final class CurrentPuidProviderImpl_Factory implements rzm {
    private final szm accountProvider;

    public CurrentPuidProviderImpl_Factory(szm szmVar) {
        this.accountProvider = szmVar;
    }

    public static CurrentPuidProviderImpl_Factory create(szm szmVar) {
        return new CurrentPuidProviderImpl_Factory(szmVar);
    }

    public static CurrentPuidProviderImpl newInstance(CurrentAccountInfoProvider currentAccountInfoProvider) {
        return new CurrentPuidProviderImpl(currentAccountInfoProvider);
    }

    @Override // defpackage.szm
    public CurrentPuidProviderImpl get() {
        return newInstance((CurrentAccountInfoProvider) this.accountProvider.get());
    }
}
