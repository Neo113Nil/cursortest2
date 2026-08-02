package com.datadog.trace.core.propagation;

import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ExtractedContext extends TagContext {
    public final long endToEndStartTime;
    public final PTagsFactory$PTags propagationTags;
    public final long spanId;
    public final DDTraceId traceId;

    public ExtractedContext(DDTraceId dDTraceId, long j, int i, CharSequence charSequence, long j2, Map map, Map map2, PTagsFactory$PTags pTagsFactory$PTags, CoreTracer.ConfigSnapshot configSnapshot, TracePropagationStyle tracePropagationStyle) {
        super(charSequence, map2, map, i, configSnapshot, tracePropagationStyle);
        this.traceId = dDTraceId;
        this.spanId = j;
        this.endToEndStartTime = j2;
        this.propagationTags = pTagsFactory$PTags;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final long getSpanId() {
        return this.spanId;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final DDTraceId getTraceId() {
        return this.traceId;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.TagContext
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractedContext{");
        DDTraceId dDTraceId = this.traceId;
        if (dDTraceId != null) {
            sb.append("traceId=");
            sb.append(dDTraceId);
            sb.append(", ");
        }
        long j = this.spanId;
        if (j != 0) {
            sb.append("endToEndStartTime=");
            sb.append(j);
            sb.append(", ");
        }
        if (this.endToEndStartTime != 0) {
            sb.append("spanId=");
            sb.append(j);
            sb.append(", ");
        }
        CharSequence charSequence = this.origin;
        if (charSequence != null) {
            sb.append("origin=");
            sb.append(charSequence);
            sb.append(", ");
        }
        Map map = this.tags;
        if (map != null) {
            sb.append("tags=");
            sb.append(map);
            sb.append(", ");
        }
        Map map2 = this.baggage;
        if (map2 != null) {
            sb.append("baggage=");
            sb.append(map2);
            sb.append(", ");
        }
        int i = this.samplingPriority;
        if (i != -128) {
            sb.append("samplingPriority=");
            sb.append(i);
            sb.append(", ");
        }
        sb.append('}');
        return sb.toString();
    }
}
