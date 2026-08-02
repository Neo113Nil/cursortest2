package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class G9 extends MessageNano {
    public static volatile G9[] c;
    public B9 a;
    public D9 b;

    public G9() {
        a();
    }

    public static G9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new G9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new D9();
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
        D9 d9 = this.b;
        return d9 != null ? CodedOutputByteBufferNano.computeMessageSize(2, d9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B9 b9 = this.a;
        if (b9 != null) {
            codedOutputByteBufferNano.writeMessage(1, b9);
        }
        D9 d9 = this.b;
        if (d9 != null) {
            codedOutputByteBufferNano.writeMessage(2, d9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static G9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G9().mergeFrom(codedInputByteBufferNano);
    }

    public final G9 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static G9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (G9) MessageNano.mergeFrom(new G9(), bArr);
    }
}
