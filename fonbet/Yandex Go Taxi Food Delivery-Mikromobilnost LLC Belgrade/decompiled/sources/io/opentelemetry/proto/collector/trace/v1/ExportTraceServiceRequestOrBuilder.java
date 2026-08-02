package io.opentelemetry.proto.collector.trace.v1;

import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto.trace.v1.ResourceSpans;
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
