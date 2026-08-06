package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580m6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0851wi f6482a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f6483b;

    public C0580m6(Bf bf, D8 d8, C0851wi c0851wi, AppMetricaConfig appMetricaConfig) {
        this.f6482a = c0851wi;
        this.f6483b = new Fh(bf, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), d8, appMetricaConfig.userProfileID);
    }

    public final Fh a() {
        return this.f6483b;
    }
}
