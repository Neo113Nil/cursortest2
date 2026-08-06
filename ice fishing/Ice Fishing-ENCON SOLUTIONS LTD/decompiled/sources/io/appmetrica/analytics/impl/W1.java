package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class W1 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile W1[] f5274c;

    /* renamed from: a, reason: collision with root package name */
    public String f5275a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5276b;

    public W1() {
        a();
    }

    public static W1[] b() {
        if (f5274c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5274c == null) {
                        f5274c = new W1[0];
                    }
                } finally {
                }
            }
        }
        return f5274c;
    }

    public final W1 a() {
        this.f5275a = "";
        this.f5276b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f5276b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5275a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5275a);
        codedOutputByteBufferNano.writeBool(2, this.f5276b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5275a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5276b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static W1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new W1().mergeFrom(codedInputByteBufferNano);
    }

    public static W1 a(byte[] bArr) {
        return (W1) MessageNano.mergeFrom(new W1(), bArr);
    }
}
