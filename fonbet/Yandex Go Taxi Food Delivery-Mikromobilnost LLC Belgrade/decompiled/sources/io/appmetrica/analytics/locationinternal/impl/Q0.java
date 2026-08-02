package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Q0 extends MessageNano {
    public static volatile Q0[] c;
    public O0 a;
    public W0 b;

    public Q0() {
        a();
    }

    public static Q0[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new Q0[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new O0();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new W0();
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
        O0 o0 = this.a;
        if (o0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, o0);
        }
        W0 w0 = this.b;
        return w0 != null ? CodedOutputByteBufferNano.computeMessageSize(2, w0) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        O0 o0 = this.a;
        if (o0 != null) {
            codedOutputByteBufferNano.writeMessage(1, o0);
        }
        W0 w0 = this.b;
        if (w0 != null) {
            codedOutputByteBufferNano.writeMessage(2, w0);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Q0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q0().mergeFrom(codedInputByteBufferNano);
    }

    public final Q0 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static Q0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q0) MessageNano.mergeFrom(new Q0(), bArr);
    }
}
