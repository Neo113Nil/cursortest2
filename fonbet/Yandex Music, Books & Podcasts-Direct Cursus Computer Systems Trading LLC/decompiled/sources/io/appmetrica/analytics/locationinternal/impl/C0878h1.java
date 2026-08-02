package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0878h1 implements J0 {
    public final LocationServiceApi a;

    public C0878h1(@NotNull LocationServiceApi locationServiceApi) {
        this.a = locationServiceApi;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(@NotNull C0856c c0856c) {
        this.a.updateLocationFilter(c0856c.d);
    }
}
