package com.datadog.android.trace.api.tracer;

import java.util.Set;

/* loaded from: classes4.dex */
public interface DatadogTracerBuilder {
    DatadogTracer build();

    DatadogTracerBuilder setBundleWithRumEnabled();

    DatadogTracerBuilder withPartialFlushMinSpans();

    DatadogTracerBuilder withSampleRate(double d);

    DatadogTracerBuilder withServiceName(String str);

    DatadogTracerBuilder withTag(String str, String str2);

    DatadogTracerBuilder withTracingHeadersTypes(Set set);
}
