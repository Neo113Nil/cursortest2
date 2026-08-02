package io.opentelemetry.proto.common.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;

/* loaded from: classes4.dex */
public interface KeyValueOrBuilder extends zt10 {
    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    String getKey();

    ByteString getKeyBytes();

    AnyValue getValue();

    boolean hasValue();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
