package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325c9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0325c9[] f5731c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5732a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5733b;

    public C0325c9() {
        a();
    }

    public static C0325c9[] b() {
        if (f5731c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5731c == null) {
                        f5731c = new C0325c9[0];
                    }
                } finally {
                }
            }
        }
        return f5731c;
    }

    public final C0325c9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5732a = bArr;
        this.f5733b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5732a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5732a);
        }
        return !Arrays.equals(this.f5733b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5733b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5732a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5732a);
        }
        if (!Arrays.equals(this.f5733b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5733b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0325c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5732a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5733b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0325c9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0325c9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0325c9 a(byte[] bArr) {
        return (C0325c9) MessageNano.mergeFrom(new C0325c9(), bArr);
    }
}
