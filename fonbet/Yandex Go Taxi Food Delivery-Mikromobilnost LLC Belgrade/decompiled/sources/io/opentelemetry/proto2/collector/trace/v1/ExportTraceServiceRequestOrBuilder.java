package io.opentelemetry.proto2.collector.trace.v1;

import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto2.trace.v1.ResourceSpans;
import java.util.List;

/* loaded from: classes4.dex */
public interface ExportTraceServiceRequestOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    ResourceSpans getResourceSpans(int i);

    int getResourceSpansCount();

    List<ResourceSpans> getResourceSpansList();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
