package io.appmetrica.analytics.coreutils.internal.data;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public abstract class BaseProtobufStateSerializer<T extends MessageNano> implements ProtobufStateSerializer<T> {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public abstract T defaultValue();

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public byte[] toByteArray(T t) {
        return MessageNano.toByteArray(t);
    }
}
