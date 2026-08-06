package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s fromModel(BillingConfig billingConfig) {
        s sVar = new s();
        sVar.f3572a = billingConfig.getSendFrequencySeconds();
        sVar.f3573b = billingConfig.getFirstCollectingInappMaxAgeSeconds();
        return sVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        s sVar = (s) obj;
        return new BillingConfig(sVar.f3572a, sVar.f3573b);
    }

    public final BillingConfig a(s sVar) {
        return new BillingConfig(sVar.f3572a, sVar.f3573b);
    }
}
