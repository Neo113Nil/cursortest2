package com.datadog.trace.api.metrics;

/* loaded from: classes4.dex */
public interface SpanMetrics {
    public static final AnonymousClass1 NOOP = new AnonymousClass1();

    /* renamed from: com.datadog.trace.api.metrics.SpanMetrics$1, reason: invalid class name */
    public final class AnonymousClass1 implements SpanMetrics {
        @Override // com.datadog.trace.api.metrics.SpanMetrics
        public final void onSpanCreated() {
        }

        @Override // com.datadog.trace.api.metrics.SpanMetrics
        public final void onSpanFinished() {
        }
    }

    void onSpanCreated();

    void onSpanFinished();
}
