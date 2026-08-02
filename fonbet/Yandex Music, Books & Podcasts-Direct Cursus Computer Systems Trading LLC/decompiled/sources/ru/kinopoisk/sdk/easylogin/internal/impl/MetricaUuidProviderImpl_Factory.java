package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.D2;

/* loaded from: classes5.dex */
public final class MetricaUuidProviderImpl_Factory implements rzm {
    private final szm deviceIdProvider;

    public MetricaUuidProviderImpl_Factory(szm szmVar) {
        this.deviceIdProvider = szmVar;
    }

    public static MetricaUuidProviderImpl_Factory create(szm szmVar) {
        return new MetricaUuidProviderImpl_Factory(szmVar);
    }

    public static MetricaUuidProviderImpl newInstance(D2 d2) {
        return new MetricaUuidProviderImpl(d2);
    }

    @Override // defpackage.szm
    public MetricaUuidProviderImpl get() {
        return newInstance((D2) this.deviceIdProvider.get());
    }
}
