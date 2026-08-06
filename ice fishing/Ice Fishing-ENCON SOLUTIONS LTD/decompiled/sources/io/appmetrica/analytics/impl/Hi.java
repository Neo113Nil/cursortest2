package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Hi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Hi[] f4479c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4480a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4481b;

    public Hi() {
        a();
    }

    public static Hi[] b() {
        if (f4479c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4479c == null) {
                        f4479c = new Hi[0];
                    }
                } finally {
                }
            }
        }
        return f4479c;
    }

    public final Hi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4480a = bArr;
        this.f4481b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4480a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f4480a);
        }
        return !Arrays.equals(this.f4481b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4481b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4480a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4480a);
        }
        if (!Arrays.equals(this.f4481b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4481b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4480a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4481b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Hi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Hi().mergeFrom(codedInputByteBufferNano);
    }

    public static Hi a(byte[] bArr) {
        return (Hi) MessageNano.mergeFrom(new Hi(), bArr);
    }
}
