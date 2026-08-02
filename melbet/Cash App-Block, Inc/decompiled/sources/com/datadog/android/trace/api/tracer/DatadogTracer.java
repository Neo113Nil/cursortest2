package com.datadog.android.trace.api.tracer;

import com.datadog.android.trace.api.propagation.DatadogPropagation;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;

/* loaded from: classes4.dex */
public interface DatadogTracer {
    DatadogSpanBuilder buildSpan();

    DatadogSpanBuilder buildSpan(String str);

    DatadogPropagation propagate();
}
