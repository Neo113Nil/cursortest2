package com.datadog.trace.api;

import com.datadog.trace.core.DDSpan;

/* loaded from: classes4.dex */
public interface EndpointCheckpointer {
    void onRootSpanFinished(DDSpan dDSpan);

    void onRootSpanStarted(DDSpan dDSpan);
}
