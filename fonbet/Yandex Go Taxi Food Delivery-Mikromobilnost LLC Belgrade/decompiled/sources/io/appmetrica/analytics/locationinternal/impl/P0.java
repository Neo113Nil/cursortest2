package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class P0 extends MessageNano {
    public static volatile P0[] c;
    public long a;
    public long b;

    public P0() {
        a();
    }

    public static P0[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new P0[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.a;
        if (j != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j);
        }
        long j2 = this.b;
        return j2 != 10000 ? CodedOutputByteBufferNano.computeUInt64Size(2, j2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j);
        }
        long j2 = this.b;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static P0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P0().mergeFrom(codedInputByteBufferNano);
    }

    public final P0 a() {
        this.a = 10000L;
        this.b = 10000L;
        this.cachedSize = -1;
        return this;
    }

    public static P0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (P0) MessageNano.mergeFrom(new P0(), bArr);
    }
}
