package io.opentelemetry.proto.trace.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto.trace.v1.Status;

/* loaded from: classes4.dex */
public interface StatusOrBuilder extends zt10 {
    Status.StatusCode getCode();

    int getCodeValue();

    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    String getMessage();

    ByteString getMessageBytes();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
