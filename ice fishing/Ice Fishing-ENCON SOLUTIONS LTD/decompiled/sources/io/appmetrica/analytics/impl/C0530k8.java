package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530k8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0530k8[] f6352c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6353a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6354b;

    public C0530k8() {
        a();
    }

    public static C0530k8[] b() {
        if (f6352c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6352c == null) {
                        f6352c = new C0530k8[0];
                    }
                } finally {
                }
            }
        }
        return f6352c;
    }

    public final C0530k8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6353a = bArr;
        this.f6354b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6353a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6353a);
        }
        return !Arrays.equals(this.f6354b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6354b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6353a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6353a);
        }
        if (!Arrays.equals(this.f6354b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6354b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0530k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6353a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6354b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0530k8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0530k8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0530k8 a(byte[] bArr) {
        return (C0530k8) MessageNano.mergeFrom(new C0530k8(), bArr);
    }
}
