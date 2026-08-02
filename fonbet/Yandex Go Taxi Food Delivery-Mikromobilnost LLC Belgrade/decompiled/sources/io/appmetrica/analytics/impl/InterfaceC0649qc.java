package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.qc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0649qc extends InterfaceC0677rc {
    InterfaceC0446jc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0);

    @Override // io.appmetrica.analytics.impl.InterfaceC0677rc
    /* synthetic */ InterfaceC0649qc a();

    InterfaceC0735tc a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    InterfaceC0446jc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0665r0 c0665r0);

    InterfaceC0620pc b(ReporterConfig reporterConfig);
}
