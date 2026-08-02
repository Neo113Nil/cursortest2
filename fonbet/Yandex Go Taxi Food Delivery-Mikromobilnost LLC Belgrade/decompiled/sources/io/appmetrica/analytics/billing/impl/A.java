package io.appmetrica.analytics.billing.impl;

import defpackage.oyr;
import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* loaded from: classes9.dex */
public final class A {
    public final int a;
    public final int b;

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideBillingConfig(sendFrequencySeconds=");
        sb.append(this.a);
        sb.append(", firstCollectingInappMaxAgeSeconds=");
        return oyr.s(sb, this.b, ')');
    }

    public A(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
