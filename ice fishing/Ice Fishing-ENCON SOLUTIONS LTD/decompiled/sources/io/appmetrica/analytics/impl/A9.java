package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f4126c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4127d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4128e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4129f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4130g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4131h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4132i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile A9[] f4133j;

    /* renamed from: a, reason: collision with root package name */
    public int f4134a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4135b;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (f4133j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4133j == null) {
                        f4133j = new A9[0];
                    }
                } finally {
                }
            }
        }
        return f4133j;
    }

    public final A9 a() {
        this.f4134a = 0;
        this.f4135b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4134a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !Arrays.equals(this.f4135b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4135b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4134a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!Arrays.equals(this.f4135b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4135b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f4134a = readInt32;
                        break;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4135b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public static A9 a(byte[] bArr) {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
