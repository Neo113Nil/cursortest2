package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class E extends MessageNano {
    public static volatile E[] c;
    public boolean a;
    public x b;

    public E() {
        a();
    }

    public static E[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new E[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new x();
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
        boolean z = this.a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        x xVar = this.b;
        return xVar != null ? CodedOutputByteBufferNano.computeMessageSize(2, xVar) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        x xVar = this.b;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(2, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static E b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E().mergeFrom(codedInputByteBufferNano);
    }

    public final E a() {
        this.a = true;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static E a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E) MessageNano.mergeFrom(new E(), bArr);
    }
}
