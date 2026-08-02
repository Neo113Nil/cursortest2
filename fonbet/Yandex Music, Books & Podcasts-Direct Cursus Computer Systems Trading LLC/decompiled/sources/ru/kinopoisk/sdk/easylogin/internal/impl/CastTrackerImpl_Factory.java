package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.C1201r3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1184q;

/* loaded from: classes5.dex */
public final class CastTrackerImpl_Factory implements rzm {
    private final szm analyticsErrorMapperProvider;
    private final szm analyticsProvider;

    public CastTrackerImpl_Factory(szm szmVar, szm szmVar2) {
        this.analyticsProvider = szmVar;
        this.analyticsErrorMapperProvider = szmVar2;
    }

    public static CastTrackerImpl_Factory create(szm szmVar, szm szmVar2) {
        return new CastTrackerImpl_Factory(szmVar, szmVar2);
    }

    public static CastTrackerImpl newInstance(C1201r3 c1201r3, InterfaceC1184q interfaceC1184q) {
        return new CastTrackerImpl(c1201r3, interfaceC1184q);
    }

    @Override // defpackage.szm
    public CastTrackerImpl get() {
        return newInstance((C1201r3) this.analyticsProvider.get(), (InterfaceC1184q) this.analyticsErrorMapperProvider.get());
    }
}
