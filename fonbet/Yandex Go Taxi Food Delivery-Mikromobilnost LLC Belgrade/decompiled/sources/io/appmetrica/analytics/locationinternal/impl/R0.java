package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class R0 extends MessageNano {
    public static volatile R0[] e;
    public int a;
    public int b;
    public long c;
    public int d;

    public R0() {
        a();
    }

    public static R0[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new R0[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 20) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.b;
        if (i2 != 200) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
        }
        long j = this.c;
        if (j != 60000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
        }
        int i3 = this.d;
        return i3 != 10000 ? CodedOutputByteBufferNano.computeUInt32Size(4, i3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 20) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.b;
        if (i2 != 200) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        long j = this.c;
        if (j != 60000) {
            codedOutputByteBufferNano.writeUInt64(3, j);
        }
        int i3 = this.d;
        if (i3 != 10000) {
            codedOutputByteBufferNano.writeUInt32(4, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static R0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R0().mergeFrom(codedInputByteBufferNano);
    }

    public final R0 a() {
        this.a = 20;
        this.b = 200;
        this.c = 60000L;
        this.d = 10000;
        this.cachedSize = -1;
        return this;
    }

    public static R0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (R0) MessageNano.mergeFrom(new R0(), bArr);
    }
}
