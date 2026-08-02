package com.datadog.trace.common.metrics;

/* loaded from: classes4.dex */
public final class NoOpMetricsAggregator implements AutoCloseable {
    public static final NoOpMetricsAggregator INSTANCE = new NoOpMetricsAggregator();

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
