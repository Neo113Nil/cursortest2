package com.squareup.cash.observability.compose;

import androidx.compose.ui.Modifier;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;

/* loaded from: classes6.dex */
public abstract class PerformanceLoggingKt {
    public static final Modifier performanceLogging(Modifier modifier, RealObservabilityManager realObservabilityManager) {
        modifier.getClass();
        return modifier.then(new PerformanceLoggingElement(new PerformanceLoggingKt$$ExternalSyntheticLambda0(realObservabilityManager, 0), new PerformanceLoggingKt$$ExternalSyntheticLambda0(realObservabilityManager, 1), new PerformanceLoggingKt$$ExternalSyntheticLambda0(realObservabilityManager, 2)));
    }
}
