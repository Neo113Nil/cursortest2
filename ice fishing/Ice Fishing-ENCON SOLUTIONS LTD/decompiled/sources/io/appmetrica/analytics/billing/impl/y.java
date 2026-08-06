package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3597f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3598g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3599h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile y[] f3600i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3601a;

    /* renamed from: b, reason: collision with root package name */
    public long f3602b;

    /* renamed from: c, reason: collision with root package name */
    public int f3603c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3604d;

    /* renamed from: e, reason: collision with root package name */
    public long f3605e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f3600i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3600i == null) {
                        f3600i = new y[0];
                    }
                } finally {
                }
            }
        }
        return f3600i;
    }

    public final y a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f3601a = bArr;
        this.f3602b = 0L;
        this.f3603c = 0;
        this.f3604d = bArr;
        this.f3605e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f3601a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f3601a);
        }
        long j2 = this.f3602b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f3603c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!Arrays.equals(this.f3604d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f3604d);
        }
        long j3 = this.f3605e;
        return j3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f3601a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f3601a);
        }
        long j2 = this.f3602b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f3603c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!Arrays.equals(this.f3604d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3604d);
        }
        long j3 = this.f3605e;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f3601a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f3602b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f3603c = readInt32;
                }
            } else if (readTag == 34) {
                this.f3604d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3605e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static y a(byte[] bArr) {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
