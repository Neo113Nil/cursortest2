package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0953h1 implements J0 {
    public final LocationServiceApi a;

    public C0953h1(LocationServiceApi locationServiceApi) {
        this.a = locationServiceApi;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        this.a.updateLocationFilter(c0933c.d);
    }
}
