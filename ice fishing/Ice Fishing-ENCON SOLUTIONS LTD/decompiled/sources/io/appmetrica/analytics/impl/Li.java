package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Li extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f4707f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4708g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4709h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Li[] f4710i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4711a;

    /* renamed from: b, reason: collision with root package name */
    public long f4712b;

    /* renamed from: c, reason: collision with root package name */
    public int f4713c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4714d;

    /* renamed from: e, reason: collision with root package name */
    public long f4715e;

    public Li() {
        a();
    }

    public static Li[] b() {
        if (f4710i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4710i == null) {
                        f4710i = new Li[0];
                    }
                } finally {
                }
            }
        }
        return f4710i;
    }

    public final Li a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4711a = bArr;
        this.f4712b = 0L;
        this.f4713c = 0;
        this.f4714d = bArr;
        this.f4715e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4711a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f4711a);
        }
        long j2 = this.f4712b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f4713c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!Arrays.equals(this.f4714d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f4714d);
        }
        long j3 = this.f4715e;
        return j3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4711a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4711a);
        }
        long j2 = this.f4712b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f4713c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!Arrays.equals(this.f4714d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4714d);
        }
        long j3 = this.f4715e;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Li b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Li().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Li mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4711a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f4712b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f4713c = readInt32;
                }
            } else if (readTag == 34) {
                this.f4714d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4715e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static Li a(byte[] bArr) {
        return (Li) MessageNano.mergeFrom(new Li(), bArr);
    }
}
