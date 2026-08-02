package com.datadog.trace.bootstrap.instrumentation.api;

import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;

/* loaded from: classes4.dex */
public interface AgentSpan$Context {
    TagContext.HttpHeaders getPathwayContext();

    long getSpanId();

    AgentTrace getTrace();

    DDTraceId getTraceId();

    int getTraceSamplingPriority();
}
