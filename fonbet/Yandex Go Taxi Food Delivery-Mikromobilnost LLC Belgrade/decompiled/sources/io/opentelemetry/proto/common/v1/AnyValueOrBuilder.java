package io.opentelemetry.proto.common.v1;

import com.google.protobuf.ByteString;
import defpackage.wt10;
import defpackage.zt10;
import io.opentelemetry.proto.common.v1.AnyValue;

/* loaded from: classes4.dex */
public interface AnyValueOrBuilder extends zt10 {
    ArrayValue getArrayValue();

    boolean getBoolValue();

    ByteString getBytesValue();

    @Override // defpackage.zt10
    /* synthetic */ wt10 getDefaultInstanceForType();

    double getDoubleValue();

    long getIntValue();

    KeyValueList getKvlistValue();

    String getStringValue();

    ByteString getStringValueBytes();

    AnyValue.ValueCase getValueCase();

    boolean hasArrayValue();

    boolean hasBoolValue();

    boolean hasBytesValue();

    boolean hasDoubleValue();

    boolean hasIntValue();

    boolean hasKvlistValue();

    boolean hasStringValue();

    @Override // defpackage.zt10
    /* synthetic */ boolean isInitialized();
}
