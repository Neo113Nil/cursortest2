package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Mf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f4761a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f4762b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f4763c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f4764d;

    public Mf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f4761a = str;
        this.f4762b = iBinaryDataHelper;
        this.f4763c = protobufStateSerializer;
        this.f4764d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f4762b.remove(this.f4761a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f4762b.get(this.f4761a);
            if (bArr != null && bArr.length != 0) {
                return this.f4764d.toModel((MessageNano) this.f4763c.toState(bArr));
            }
            return this.f4764d.toModel((MessageNano) this.f4763c.defaultValue());
        } catch (Throwable unused) {
            return this.f4764d.toModel((MessageNano) this.f4763c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f4762b.insert(this.f4761a, this.f4763c.toByteArray((MessageNano) this.f4764d.fromModel(obj)));
    }
}
