package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes9.dex */
public final class Wd extends AbstractC0779ur {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(InterfaceC0677rc interfaceC0677rc, AppMetricaConfig appMetricaConfig) {
        super(interfaceC0677rc);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    public final InterfaceC0735tc a() {
        return this.a.a().a(this.b);
    }
}
