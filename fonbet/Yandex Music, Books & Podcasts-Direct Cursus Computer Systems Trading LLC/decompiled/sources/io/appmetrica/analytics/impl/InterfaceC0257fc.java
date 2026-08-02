package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0257fc extends InterfaceC0286gc {
    @NonNull
    Ub a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0534p0 c0534p0);

    @Override // io.appmetrica.analytics.impl.InterfaceC0286gc
    @NonNull
    /* synthetic */ InterfaceC0257fc a();

    @NonNull
    InterfaceC0315hc a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    Ub b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0534p0 c0534p0);

    @NonNull
    InterfaceC0228ec b(@NonNull ReporterConfig reporterConfig);
}
