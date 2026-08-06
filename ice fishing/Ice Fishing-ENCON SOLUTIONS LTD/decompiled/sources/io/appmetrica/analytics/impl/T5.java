package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile T5[] f5091c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5092a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5093b;

    public T5() {
        a();
    }

    public static T5[] b() {
        if (f5091c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5091c == null) {
                        f5091c = new T5[0];
                    }
                } finally {
                }
            }
        }
        return f5091c;
    }

    public final T5 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5092a = bArr;
        this.f5093b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5092a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5092a);
        }
        return !Arrays.equals(this.f5093b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5093b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5092a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5092a);
        }
        if (!Arrays.equals(this.f5093b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5093b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5092a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5093b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static T5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new T5().mergeFrom(codedInputByteBufferNano);
    }

    public static T5 a(byte[] bArr) {
        return (T5) MessageNano.mergeFrom(new T5(), bArr);
    }
}
