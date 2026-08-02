package com.datadog.opentelemetry.trace;

import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.trace.api.internal.util.LongStringUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.opentelemetry.api.trace.ImmutableTraceFlags;
import io.opentelemetry.api.trace.SpanContext;

/* loaded from: classes4.dex */
public final class OtelSpanContext implements SpanContext {
    public final DatadogSpanContext delegate;
    public final boolean sampled;
    public String spanId;
    public String traceId;

    public OtelSpanContext(DatadogSpanContext datadogSpanContext, boolean z) {
        this.delegate = datadogSpanContext;
        this.sampled = z;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String getSpanId() {
        if (this.spanId == null) {
            this.spanId = LongStringUtils.toHexStringPadded(16, this.delegate.getSpanId());
        }
        return this.spanId;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final ImmutableTraceFlags getTraceFlags() {
        return this.sampled ? ImmutableTraceFlags.SAMPLED : ImmutableTraceFlags.DEFAULT;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String getTraceId() {
        if (this.traceId == null) {
            this.traceId = this.delegate.getTraceId().toHexString();
        }
        return this.traceId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtelSpanContext{traceId='");
        sb.append(getTraceId());
        sb.append("', spanId='");
        sb.append(getSpanId());
        sb.append("', sampled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sampled, ", remote=false}");
    }
}
