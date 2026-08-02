package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0631pn implements ServiceComponentModuleConfig {
    public final C0439j5 a;

    public C0631pn(C0439j5 c0439j5) {
        this.a = c0439j5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.a.m, Boolean.TRUE)).booleanValue();
    }
}
