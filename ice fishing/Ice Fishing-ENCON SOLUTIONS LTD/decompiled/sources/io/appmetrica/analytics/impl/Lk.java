package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Lk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Lk[] f4716c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4717a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4718b;

    public Lk() {
        a();
    }

    public static Lk[] b() {
        if (f4716c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4716c == null) {
                        f4716c = new Lk[0];
                    }
                } finally {
                }
            }
        }
        return f4716c;
    }

    public final Lk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4717a = bArr;
        this.f4718b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4717a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f4717a);
        }
        return !Arrays.equals(this.f4718b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4718b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4717a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4717a);
        }
        if (!Arrays.equals(this.f4718b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4718b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4717a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4718b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Lk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static Lk a(byte[] bArr) {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}
