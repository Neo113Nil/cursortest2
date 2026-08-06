package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.t;

/* loaded from: classes.dex */
public final class RemoteBillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3633a;

    /* renamed from: b, reason: collision with root package name */
    private final BillingConfig f3634b;

    public RemoteBillingConfig(boolean z2, BillingConfig billingConfig) {
        this.f3633a = z2;
        this.f3634b = billingConfig;
    }

    public final BillingConfig getConfig() {
        return this.f3634b;
    }

    public final boolean getEnabled() {
        return this.f3633a;
    }

    public String toString() {
        return "RemoteBillingConfig(enabled=" + this.f3633a + ", config=" + this.f3634b + ')';
    }

    public RemoteBillingConfig() {
        this(new t().f3575a, new BillingConfig());
    }
}
