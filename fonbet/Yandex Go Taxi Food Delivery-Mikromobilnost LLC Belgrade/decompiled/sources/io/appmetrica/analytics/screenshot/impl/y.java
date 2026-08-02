package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class y extends MessageNano {
    public static volatile y[] c;
    public boolean a;
    public long b;

    public y() {
        a();
    }

    public static y[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new y[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readInt64();
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
        long j = this.b;
        return j != 1 ? CodedOutputByteBufferNano.computeInt64Size(2, j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j = this.b;
        if (j != 1) {
            codedOutputByteBufferNano.writeInt64(2, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    public final y a() {
        this.a = true;
        this.b = 1L;
        this.cachedSize = -1;
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
