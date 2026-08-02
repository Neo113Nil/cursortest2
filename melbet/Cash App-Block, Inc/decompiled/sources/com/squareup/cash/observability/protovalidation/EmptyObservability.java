package com.squareup.cash.observability.protovalidation;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;

/* loaded from: classes6.dex */
public final class EmptyObservability implements HasObservability {
    public static final EmptyObservability INSTANCE = new EmptyObservability();
    public static final ErrorReporter.Companion errorReporter = ErrorReporter.Companion.$$INSTANCE;
    public static final ErrorReporter.DefaultSamplingStrategy oneErrorPerAppSessionStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return oneErrorPerAppSessionStrategy;
    }
}
