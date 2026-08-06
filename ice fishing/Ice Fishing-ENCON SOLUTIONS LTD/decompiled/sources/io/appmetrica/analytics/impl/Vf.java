package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Vf extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5254e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5255f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5256g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Vf[] f5257h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5258a;

    /* renamed from: b, reason: collision with root package name */
    public long f5259b;

    /* renamed from: c, reason: collision with root package name */
    public long f5260c;

    /* renamed from: d, reason: collision with root package name */
    public int f5261d;

    public Vf() {
        a();
    }

    public static Vf[] b() {
        if (f5257h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5257h == null) {
                        f5257h = new Vf[0];
                    }
                } finally {
                }
            }
        }
        return f5257h;
    }

    public final Vf a() {
        this.f5258a = WireFormatNano.EMPTY_BYTES;
        this.f5259b = 0L;
        this.f5260c = 0L;
        this.f5261d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f5258a) + super.computeSerializedSize();
        long j2 = this.f5259b;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f5260c;
        if (j3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i2 = this.f5261d;
        return i2 != 0 ? computeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f5258a);
        long j2 = this.f5259b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f5260c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i2 = this.f5261d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5258a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f5259b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f5260c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5261d = readInt32;
                }
            }
        }
    }

    public static Vf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Vf().mergeFrom(codedInputByteBufferNano);
    }

    public static Vf a(byte[] bArr) {
        return (Vf) MessageNano.mergeFrom(new Vf(), bArr);
    }
}
