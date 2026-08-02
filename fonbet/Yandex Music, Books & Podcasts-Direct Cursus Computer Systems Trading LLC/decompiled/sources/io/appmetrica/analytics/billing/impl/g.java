package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s fromModel(@NotNull BillingConfig billingConfig) {
        s sVar = new s();
        sVar.a = billingConfig.getSendFrequencySeconds();
        sVar.b = billingConfig.getFirstCollectingInappMaxAgeSeconds();
        return sVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        s sVar = (s) obj;
        return new BillingConfig(sVar.a, sVar.b);
    }

    @NotNull
    public final BillingConfig a(@NotNull s sVar) {
        return new BillingConfig(sVar.a, sVar.b);
    }
}
