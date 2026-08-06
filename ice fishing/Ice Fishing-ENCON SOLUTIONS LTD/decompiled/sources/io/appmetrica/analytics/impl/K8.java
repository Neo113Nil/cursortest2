package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class K8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile K8[] f4628c;

    /* renamed from: a, reason: collision with root package name */
    public String f4629a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4630b;

    public K8() {
        a();
    }

    public static K8[] b() {
        if (f4628c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4628c == null) {
                        f4628c = new K8[0];
                    }
                } finally {
                }
            }
        }
        return f4628c;
    }

    public final K8 a() {
        this.f4629a = "";
        this.f4630b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4629a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4629a);
        }
        return !Arrays.equals(this.f4630b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4630b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4629a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4629a);
        }
        if (!Arrays.equals(this.f4630b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4630b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4629a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4630b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new K8().mergeFrom(codedInputByteBufferNano);
    }

    public static K8 a(byte[] bArr) {
        return (K8) MessageNano.mergeFrom(new K8(), bArr);
    }
}
