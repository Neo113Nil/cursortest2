package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC0845wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f4170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f4171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f4172c;

    public B0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f4170a = c02;
        this.f4171b = appMetricaConfig;
        this.f4172c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0845wc
    public final C0457hc a() {
        C0 c02 = this.f4170a;
        C0514ji c0514ji = c02.f4246g;
        AppMetricaConfig appMetricaConfig = this.f4171b;
        PublicLogger publicLogger = this.f4172c;
        D7 d7 = c02.f4248i;
        return c0514ji.b(appMetricaConfig, publicLogger, new C0548l0(d7.f4290j, d7.f4288h));
    }
}
