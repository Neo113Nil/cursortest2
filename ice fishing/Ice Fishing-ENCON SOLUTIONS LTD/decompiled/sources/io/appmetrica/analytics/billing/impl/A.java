package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f3536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3537b;

    public A(int i2, int i3) {
        this.f3536a = i2;
        this.f3537b = i3;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f3536a + ", firstCollectingInappMaxAgeSeconds=" + this.f3537b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
