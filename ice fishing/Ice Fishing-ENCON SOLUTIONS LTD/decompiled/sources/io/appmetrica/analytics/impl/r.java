package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class r extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile r[] f6794c;

    /* renamed from: a, reason: collision with root package name */
    public long f6795a;

    /* renamed from: b, reason: collision with root package name */
    public int f6796b;

    public r() {
        a();
    }

    public static r[] b() {
        if (f6794c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6794c == null) {
                        f6794c = new r[0];
                    }
                } finally {
                }
            }
        }
        return f6794c;
    }

    public final r a() {
        this.f6795a = 0L;
        this.f6796b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6795a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int i2 = this.f6796b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6795a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int i2 = this.f6796b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6795a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6796b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static r b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new r().mergeFrom(codedInputByteBufferNano);
    }

    public static r a(byte[] bArr) {
        return (r) MessageNano.mergeFrom(new r(), bArr);
    }
}
