package io.opentelemetry.proto2.trace.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto2.resource.v1.Resource;
import java.util.List;

/* loaded from: classes4.dex */
public interface ResourceSpansOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    Resource getResource();

    String getSchemaUrl();

    ByteString getSchemaUrlBytes();

    ScopeSpans getScopeSpans(int i);

    int getScopeSpansCount();

    List<ScopeSpans> getScopeSpansList();

    boolean hasResource();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
