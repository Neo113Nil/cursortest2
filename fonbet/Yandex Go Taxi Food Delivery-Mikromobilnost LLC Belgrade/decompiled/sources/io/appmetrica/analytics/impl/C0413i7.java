package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.i7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0413i7 {
    public final C0600ol a;
    public final C0714sk b;

    public C0413i7(C0597oi c0597oi, R9 r9, C0600ol c0600ol, AppMetricaConfig appMetricaConfig) {
        this.a = c0600ol;
        this.b = new C0714sk(c0597oi, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), r9, appMetricaConfig.userProfileID);
    }

    public static C0384h7 a() {
        return new C0384h7();
    }

    public final C0714sk b() {
        return this.b;
    }
}
