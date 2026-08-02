package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class V0 extends MessageNano {
    public static volatile V0[] c;
    public long a;
    public float b;

    public V0() {
        a();
    }

    public static V0[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new V0[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 21) {
                this.b = codedInputByteBufferNano.readFloat();
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
        if (j != 5000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j);
        }
        return Float.floatToIntBits(this.b) != Float.floatToIntBits(10.0f) ? CodedOutputByteBufferNano.computeFloatSize(2, this.b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.a;
        if (j != 5000) {
            codedOutputByteBufferNano.writeUInt64(1, j);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(10.0f)) {
            codedOutputByteBufferNano.writeFloat(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static V0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V0().mergeFrom(codedInputByteBufferNano);
    }

    public final V0 a() {
        this.a = 5000L;
        this.b = 10.0f;
        this.cachedSize = -1;
        return this;
    }

    public static V0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V0) MessageNano.mergeFrom(new V0(), bArr);
    }
}
