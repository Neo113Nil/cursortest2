package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829vm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0829vm[] f7075b;

    /* renamed from: a, reason: collision with root package name */
    public long f7076a;

    public C0829vm() {
        a();
    }

    public static C0829vm[] b() {
        if (f7075b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7075b == null) {
                        f7075b = new C0829vm[0];
                    }
                } finally {
                }
            }
        }
        return f7075b;
    }

    public final C0829vm a() {
        this.f7076a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f7076a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f7076a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0829vm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7076a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C0829vm a(byte[] bArr) {
        return (C0829vm) MessageNano.mergeFrom(new C0829vm(), bArr);
    }

    public static C0829vm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0829vm().mergeFrom(codedInputByteBufferNano);
    }
}
