package com.datadog.android.trace.internal;

import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.trace.DatadogTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context;
import com.datadog.trace.core.DDSpanContext;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public final class DatadogSpanContextAdapter implements DatadogSpanContext {
    public final AgentSpan$Context delegate;

    public DatadogSpanContextAdapter(AgentSpan$Context agentSpan$Context) {
        agentSpan$Context.getClass();
        this.delegate = agentSpan$Context;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final int getSamplingPriority() {
        return this.delegate.getTraceSamplingPriority();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final long getSpanId() {
        return this.delegate.getSpanId();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final Map getTags() {
        AgentSpan$Context agentSpan$Context = this.delegate;
        DDSpanContext dDSpanContext = agentSpan$Context instanceof DDSpanContext ? (DDSpanContext) agentSpan$Context : null;
        Map tags = dDSpanContext != null ? dDSpanContext.getTags() : null;
        if (tags != null) {
            return tags;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final DatadogTraceId getTraceId() {
        DDTraceId traceId = this.delegate.getTraceId();
        traceId.getClass();
        return new DatadogTraceIdAdapter(traceId);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final void setMetric(double d) {
        AgentSpan$Context agentSpan$Context = this.delegate;
        DDSpanContext dDSpanContext = agentSpan$Context instanceof DDSpanContext ? (DDSpanContext) agentSpan$Context : null;
        if (dDSpanContext != null) {
            dDSpanContext.setMetric("_dd.agent_psr", Double.valueOf(d));
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final boolean setSamplingPriority(int i) {
        AgentSpan$Context agentSpan$Context = this.delegate;
        DDSpanContext dDSpanContext = agentSpan$Context instanceof DDSpanContext ? (DDSpanContext) agentSpan$Context : null;
        if (dDSpanContext != null) {
            return dDSpanContext.setSamplingPriority(i, 0);
        }
        return false;
    }
}
