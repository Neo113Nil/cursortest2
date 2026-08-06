package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Zj implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0630o4 f5526a;

    public Zj(C0630o4 c0630o4) {
        this.f5526a = c0630o4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f5526a.f6656m, Boolean.TRUE)).booleanValue();
    }
}
