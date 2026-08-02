package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class H9 extends MessageNano {
    public static volatile H9[] b;
    public E9 a;

    public H9() {
        a();
    }

    public static H9[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new H9[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new E9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        E9 e9 = this.a;
        return e9 != null ? CodedOutputByteBufferNano.computeMessageSize(1, e9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        E9 e9 = this.a;
        if (e9 != null) {
            codedOutputByteBufferNano.writeMessage(1, e9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static H9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H9().mergeFrom(codedInputByteBufferNano);
    }

    public final H9 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    public static H9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (H9) MessageNano.mergeFrom(new H9(), bArr);
    }
}
