package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609n9 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0609n9[] f6573b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6574a;

    public C0609n9() {
        a();
    }

    public static C0609n9[] b() {
        if (f6573b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6573b == null) {
                        f6573b = new C0609n9[0];
                    }
                } finally {
                }
            }
        }
        return f6573b;
    }

    public final C0609n9 a() {
        this.f6574a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f6574a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f6574a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6574a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6574a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609n9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6574a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0609n9 a(byte[] bArr) {
        return (C0609n9) MessageNano.mergeFrom(new C0609n9(), bArr);
    }

    public static C0609n9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0609n9().mergeFrom(codedInputByteBufferNano);
    }
}
