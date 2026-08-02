package com.datadog.trace.api;

import com.datadog.trace.core.DDSpan;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public final class EndpointCheckpointerHolder implements EndpointCheckpointer {
    public volatile EndpointCheckpointer endpointCheckpointer;

    static {
        AtomicReferenceFieldUpdater.newUpdater(EndpointCheckpointerHolder.class, EndpointCheckpointer.class, "endpointCheckpointer");
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final void onRootSpanFinished(DDSpan dDSpan) {
        this.endpointCheckpointer.onRootSpanFinished(dDSpan);
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final void onRootSpanStarted(DDSpan dDSpan) {
        this.endpointCheckpointer.onRootSpanStarted(dDSpan);
    }
}
