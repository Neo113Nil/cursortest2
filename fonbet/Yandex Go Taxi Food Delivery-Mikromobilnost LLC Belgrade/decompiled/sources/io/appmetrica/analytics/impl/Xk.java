package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes4.dex */
public final class Xk implements InterfaceC0649qc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final InterfaceC0446jc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0) {
        return new C0622pe();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final InterfaceC0446jc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0) {
        return new C0622pe();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final InterfaceC0620pc b(ReporterConfig reporterConfig) {
        return new Uk();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc, io.appmetrica.analytics.impl.InterfaceC0677rc
    public final InterfaceC0649qc a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0649qc
    public final InterfaceC0735tc a(AppMetricaConfig appMetricaConfig) {
        return new Uk();
    }
}
