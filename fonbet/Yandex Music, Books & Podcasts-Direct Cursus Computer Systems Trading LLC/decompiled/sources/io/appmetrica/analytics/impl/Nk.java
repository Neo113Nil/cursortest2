package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public final class Nk implements InterfaceC0257fc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NonNull
    public final Ub a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0534p0 c0534p0) {
        return new C0115ae();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NonNull
    public final Ub b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0534p0 c0534p0) {
        return new C0115ae();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NonNull
    public final InterfaceC0228ec b(@NonNull ReporterConfig reporterConfig) {
        return new Kk();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc, io.appmetrica.analytics.impl.InterfaceC0286gc
    @NonNull
    public final InterfaceC0257fc a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0257fc
    @NonNull
    public final InterfaceC0315hc a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new Kk();
    }
}
