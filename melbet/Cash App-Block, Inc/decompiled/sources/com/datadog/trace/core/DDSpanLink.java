package com.datadog.trace.core;

import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes;

/* loaded from: classes4.dex */
public final class DDSpanLink {
    public final SpanLinkAttributes attributes;
    public final long spanId;
    public final byte traceFlags;
    public final DDTraceId traceId;
    public final String traceState;

    public DDSpanLink(DDTraceId dDTraceId, long j, byte b, String str, SpanLinkAttributes spanLinkAttributes) {
        this.traceId = dDTraceId;
        this.spanId = j;
        this.traceFlags = b;
        this.traceState = str;
        this.attributes = spanLinkAttributes;
    }

    public final String toString() {
        return "SpanLink{traceId=" + this.traceId + ", spanId=" + this.spanId + ", traceFlags=" + ((int) this.traceFlags) + ", traceState='" + this.traceState + "', attributes=" + this.attributes + '}';
    }
}
