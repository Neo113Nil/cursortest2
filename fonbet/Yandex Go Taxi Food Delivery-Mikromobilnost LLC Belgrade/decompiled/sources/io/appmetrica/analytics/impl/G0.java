package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes9.dex */
public final class G0 implements InterfaceC0564ne {
    public final /* synthetic */ I0 a;
    public final /* synthetic */ AppMetricaConfig b;
    public final /* synthetic */ PublicLogger c;

    public G0(I0 i0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = i0;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0564ne
    public final Yd a() {
        I0 i0 = this.a;
        Wk wk = i0.g;
        AppMetricaConfig appMetricaConfig = this.b;
        PublicLogger publicLogger = this.c;
        B8 b8 = i0.i;
        return wk.b(appMetricaConfig, publicLogger, new C0665r0(b8.j, b8.h));
    }
}
