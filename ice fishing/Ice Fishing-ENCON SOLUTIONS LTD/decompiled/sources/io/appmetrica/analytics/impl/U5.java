package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile U5[] f5147c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5148a;

    /* renamed from: b, reason: collision with root package name */
    public Y5 f5149b;

    public U5() {
        a();
    }

    public static U5[] b() {
        if (f5147c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5147c == null) {
                        f5147c = new U5[0];
                    }
                } finally {
                }
            }
        }
        return f5147c;
    }

    public final U5 a() {
        this.f5148a = WireFormatNano.EMPTY_BYTES;
        this.f5149b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5148a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5148a);
        }
        Y5 y5 = this.f5149b;
        return y5 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, y5) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f5148a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5148a);
        }
        Y5 y5 = this.f5149b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5148a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5149b == null) {
                    this.f5149b = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f5149b);
            }
        }
    }

    public static U5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new U5().mergeFrom(codedInputByteBufferNano);
    }

    public static U5 a(byte[] bArr) {
        return (U5) MessageNano.mergeFrom(new U5(), bArr);
    }
}
