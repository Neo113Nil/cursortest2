package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class F9 extends MessageNano {
    public static volatile F9[] c;
    public B9 a;
    public E9 b;

    public F9() {
        a();
    }

    public static F9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new F9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new B9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new E9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        B9 b9 = this.a;
        if (b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, b9);
        }
        E9 e9 = this.b;
        return e9 != null ? CodedOutputByteBufferNano.computeMessageSize(2, e9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B9 b9 = this.a;
        if (b9 != null) {
            codedOutputByteBufferNano.writeMessage(1, b9);
        }
        E9 e9 = this.b;
        if (e9 != null) {
            codedOutputByteBufferNano.writeMessage(2, e9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static F9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F9().mergeFrom(codedInputByteBufferNano);
    }

    public final F9 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static F9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F9) MessageNano.mergeFrom(new F9(), bArr);
    }
}
