package com.datadog.trace.api.metrics;

import com.fillr.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class SpanMetricsImpl implements SpanMetrics {
    public final List coreCounters;
    public final AtomicLong spanCreatedCounter = new AtomicLong(0);
    public final AtomicLong spanFinishedCounter = new AtomicLong(0);

    public SpanMetricsImpl() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new e());
        arrayList.add(new e());
        this.coreCounters = Collections.unmodifiableList(arrayList);
    }

    @Override // com.datadog.trace.api.metrics.SpanMetrics
    public final void onSpanCreated() {
        this.spanCreatedCounter.incrementAndGet();
    }

    @Override // com.datadog.trace.api.metrics.SpanMetrics
    public final void onSpanFinished() {
        this.spanFinishedCounter.incrementAndGet();
    }
}
