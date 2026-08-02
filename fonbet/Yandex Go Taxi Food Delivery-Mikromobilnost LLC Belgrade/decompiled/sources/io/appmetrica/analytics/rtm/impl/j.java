package io.appmetrica.analytics.rtm.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class j implements ProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p toState(byte[] bArr) throws IOException {
        return (p) MessageNano.mergeFrom(new p(), bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new p();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        return MessageNano.toByteArray((p) obj);
    }

    public final p a() {
        return new p();
    }

    public final byte[] a(p pVar) {
        return MessageNano.toByteArray(pVar);
    }
}
