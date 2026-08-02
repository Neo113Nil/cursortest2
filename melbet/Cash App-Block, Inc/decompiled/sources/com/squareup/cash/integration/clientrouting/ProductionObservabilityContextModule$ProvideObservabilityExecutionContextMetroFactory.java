package com.squareup.cash.integration.clientrouting;

import com.squareup.cash.observability.backend.api.ObservabilityExecutionContext;
import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ProductionObservabilityContextModule$ProvideObservabilityExecutionContextMetroFactory implements Factory {
    public static final ProductionObservabilityContextModule$ProvideObservabilityExecutionContextMetroFactory INSTANCE = new ProductionObservabilityContextModule$ProvideObservabilityExecutionContextMetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Timber.Forest.i("Executing in context: CUSTOMER", new Object[0]);
        return ObservabilityExecutionContext.CUSTOMER;
    }
}
