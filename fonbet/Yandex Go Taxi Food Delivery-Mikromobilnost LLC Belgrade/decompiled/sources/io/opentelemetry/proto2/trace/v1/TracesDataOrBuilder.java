package io.opentelemetry.proto2.trace.v1;

import defpackage.wt10;
import defpackage.zt10;
import java.util.List;

/* loaded from: classes4.dex */
public interface TracesDataOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    ResourceSpans getResourceSpans(int i);

    int getResourceSpansCount();

    List<ResourceSpans> getResourceSpansList();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
