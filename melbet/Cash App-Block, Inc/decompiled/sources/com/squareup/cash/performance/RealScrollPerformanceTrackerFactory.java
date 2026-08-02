package com.squareup.cash.performance;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.Modifier;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealScrollPerformanceTrackerFactory {
    public final Analytics analytics;
    public final CoroutineContext ioDispatcher;
    public final RealObservabilityManager observabilityManager;

    public RealScrollPerformanceTrackerFactory(Analytics analytics, RealObservabilityManager realObservabilityManager, CoroutineContext coroutineContext) {
        this.analytics = analytics;
        this.observabilityManager = realObservabilityManager;
        this.ioDispatcher = coroutineContext;
    }

    public final Modifier trackScrollPerformance(PerformanceMeasureScrollPerformance.Element element, ScrollableState scrollableState, float f, CoroutineScope coroutineScope) {
        scrollableState.getClass();
        coroutineScope.getClass();
        return JankStatsAggregatorKt.trackScrollPerformance(element, scrollableState, f, JobKt.plus(this.ioDispatcher, coroutineScope), new MainPaymentView$Content$2$1(this, (Continuation) null, 26));
    }
}
