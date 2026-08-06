package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401f8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0401f8[] f5966b;

    /* renamed from: a, reason: collision with root package name */
    public byte[][] f5967a;

    public C0401f8() {
        a();
    }

    public static C0401f8[] b() {
        if (f5966b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5966b == null) {
                        f5966b = new C0401f8[0];
                    }
                } finally {
                }
            }
        }
        return f5966b;
    }

    public final C0401f8 a() {
        this.f5967a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f5967a;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[][] bArr2 = this.f5967a;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i4++;
                i3 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[][] bArr = this.f5967a;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f5967a;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0401f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f5967a;
                int length = bArr == null ? 0 : bArr.length;
                int i2 = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i2][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i2 - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f5967a = bArr2;
            }
        }
    }

    public static C0401f8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0401f8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0401f8 a(byte[] bArr) {
        return (C0401f8) MessageNano.mergeFrom(new C0401f8(), bArr);
    }
}
