package io.appmetrica.analytics.billing.internal.config;

import io.appmetrica.analytics.billing.impl.s;

/* loaded from: classes.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    private final int f3631a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3632b;

    public BillingConfig(int i2, int i3) {
        this.f3631a = i2;
        this.f3632b = i3;
    }

    public final int getFirstCollectingInappMaxAgeSeconds() {
        return this.f3632b;
    }

    public final int getSendFrequencySeconds() {
        return this.f3631a;
    }

    public String toString() {
        return "BillingConfig(sendFrequencySeconds=" + this.f3631a + ", firstCollectingInappMaxAgeSeconds=" + this.f3632b + ')';
    }

    public BillingConfig() {
        this(new s().f3572a, new s().f3573b);
    }
}
