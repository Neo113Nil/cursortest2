package com.datadog.android.trace.api.span;

import com.datadog.android.trace.api.trace.DatadogTraceId;
import java.util.Map;

/* loaded from: classes4.dex */
public interface DatadogSpanContext {
    int getSamplingPriority();

    long getSpanId();

    Map getTags();

    DatadogTraceId getTraceId();

    void setMetric(double d);

    boolean setSamplingPriority(int i);
}
