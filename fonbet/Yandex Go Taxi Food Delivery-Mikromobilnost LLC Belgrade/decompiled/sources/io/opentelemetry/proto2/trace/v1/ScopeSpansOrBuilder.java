package io.opentelemetry.proto2.trace.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto2.common.v1.InstrumentationScope;
import java.util.List;

/* loaded from: classes4.dex */
public interface ScopeSpansOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    String getSchemaUrl();

    ByteString getSchemaUrlBytes();

    InstrumentationScope getScope();

    Span getSpans(int i);

    int getSpansCount();

    List<Span> getSpansList();

    boolean hasScope();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
