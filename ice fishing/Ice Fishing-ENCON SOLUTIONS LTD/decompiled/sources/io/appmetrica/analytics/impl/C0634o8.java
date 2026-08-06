package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634o8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0634o8[] f6666b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6667a;

    public C0634o8() {
        a();
    }

    public static C0634o8[] b() {
        if (f6666b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6666b == null) {
                        f6666b = new C0634o8[0];
                    }
                } finally {
                }
            }
        }
        return f6666b;
    }

    public final C0634o8 a() {
        this.f6667a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f6667a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f6667a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6667a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6667a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0634o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6667a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0634o8 a(byte[] bArr) {
        return (C0634o8) MessageNano.mergeFrom(new C0634o8(), bArr);
    }

    public static C0634o8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0634o8().mergeFrom(codedInputByteBufferNano);
    }
}
