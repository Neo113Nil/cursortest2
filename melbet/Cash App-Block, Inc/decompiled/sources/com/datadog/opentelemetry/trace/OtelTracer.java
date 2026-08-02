package com.datadog.opentelemetry.trace;

import com.android.volley.NetworkResponse;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.Tracer;

/* loaded from: classes4.dex */
public final class OtelTracer implements Tracer {
    public final String instrumentationScopeName;
    public final InternalLogger logger;
    public final DatadogTracer tracer;

    public OtelTracer(String str, DatadogTracer datadogTracer, InternalLogger internalLogger) {
        this.instrumentationScopeName = str;
        this.tracer = datadogTracer;
        this.logger = internalLogger;
    }

    @Override // io.opentelemetry.api.trace.Tracer
    public final SpanBuilder spanBuilder(String str) {
        String str2 = this.instrumentationScopeName;
        DatadogTracer datadogTracer = this.tracer;
        return new NetworkResponse(datadogTracer.buildSpan(str2).withResourceName(str), datadogTracer, this.logger);
    }
}
