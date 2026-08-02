package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0940d2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X0 fromModel(RetryPolicyConfig retryPolicyConfig) {
        X0 x0 = new X0();
        x0.a = retryPolicyConfig.maxIntervalSeconds;
        x0.b = retryPolicyConfig.exponentialMultiplier;
        return x0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        X0 x0 = (X0) obj;
        return new RetryPolicyConfig(x0.a, x0.b);
    }

    public final RetryPolicyConfig a(X0 x0) {
        return new RetryPolicyConfig(x0.a, x0.b);
    }
}
