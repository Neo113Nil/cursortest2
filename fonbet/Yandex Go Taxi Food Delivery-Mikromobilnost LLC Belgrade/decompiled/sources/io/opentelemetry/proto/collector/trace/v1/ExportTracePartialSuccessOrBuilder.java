package io.opentelemetry.proto.collector.trace.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;

/* loaded from: classes4.dex */
public interface ExportTracePartialSuccessOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    String getErrorMessage();

    ByteString getErrorMessageBytes();

    long getRejectedSpans();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
