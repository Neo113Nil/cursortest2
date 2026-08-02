package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0252f7 {
    public final C0237el a;
    public final C0351ik b;

    public C0252f7(Xh xh, L9 l9, C0237el c0237el, AppMetricaConfig appMetricaConfig) {
        this.a = c0237el;
        this.b = new C0351ik(xh, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), l9, appMetricaConfig.userProfileID);
    }

    public static C0223e7 a() {
        return new C0223e7();
    }

    public final C0351ik b() {
        return this.b;
    }
}
