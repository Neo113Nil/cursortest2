package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f3993a;

    public C0257b(ServiceContext serviceContext) {
        this.f3993a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f3993a.getActiveNetworkTypeProvider().getNetworkType(this.f3993a.getContext()) == NetworkType.CELL;
    }
}
