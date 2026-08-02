package com.datadog.trace.bootstrap.instrumentation.api;

import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.core.CoreTracer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public class TagContext implements AgentSpan$Context {
    public final Map baggage;
    public final CharSequence origin;
    public final TracePropagationStyle propagationStyle;
    public final int samplingPriority;
    public final Map tags;
    public ArrayList terminatedContextLinks = null;
    public final CoreTracer.ConfigSnapshot traceConfig;

    public final class HttpHeaders implements AgentTrace {
        public static final HttpHeaders INSTANCE = new HttpHeaders();
        public static final HttpHeaders INSTANCE$1 = new HttpHeaders();
        public static final HttpHeaders INSTANCE$2 = new HttpHeaders();
    }

    public TagContext(CharSequence charSequence, Map map, Map map2, int i, CoreTracer.ConfigSnapshot configSnapshot, TracePropagationStyle tracePropagationStyle) {
        this.origin = charSequence;
        this.tags = map;
        this.baggage = map2 == null ? Collections.EMPTY_MAP : map2;
        this.samplingPriority = i;
        this.traceConfig = configSnapshot;
        this.propagationStyle = tracePropagationStyle;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final HttpHeaders getPathwayContext() {
        return null;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public long getSpanId() {
        return 0L;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final AgentTrace getTrace() {
        return HttpHeaders.INSTANCE;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public DDTraceId getTraceId() {
        return DDTraceId.ZERO;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final int getTraceSamplingPriority() {
        return this.samplingPriority;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TagContext{");
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
