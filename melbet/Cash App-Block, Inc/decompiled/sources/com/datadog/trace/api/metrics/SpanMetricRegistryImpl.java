package com.datadog.trace.api.metrics;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class SpanMetricRegistryImpl implements SpanMetricRegistry {
    public static final SpanMetricRegistryImpl INSTANCE = new SpanMetricRegistryImpl();
    public final ConcurrentHashMap spanMetrics = new ConcurrentHashMap();

    @Override // com.datadog.trace.api.metrics.SpanMetricRegistry
    public final SpanMetrics get(String str) {
        ConcurrentHashMap concurrentHashMap = this.spanMetrics;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            obj = new SpanMetricsImpl();
            concurrentHashMap.put(str, obj);
        }
        return (SpanMetrics) obj;
    }
}
