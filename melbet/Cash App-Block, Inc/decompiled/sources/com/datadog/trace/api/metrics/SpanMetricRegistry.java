package com.datadog.trace.api.metrics;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public interface SpanMetricRegistry {
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 NOOP = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(27);

    SpanMetrics get(String str);
}
