package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Y8[] f5421c;

    /* renamed from: a, reason: collision with root package name */
    public String f5422a;

    /* renamed from: b, reason: collision with root package name */
    public String f5423b;

    public Y8() {
        a();
    }

    public static Y8[] b() {
        if (f5421c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5421c == null) {
                        f5421c = new Y8[0];
                    }
                } finally {
                }
            }
        }
        return f5421c;
    }

    public final Y8 a() {
        this.f5422a = "";
        this.f5423b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f5423b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5422a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5422a);
        codedOutputByteBufferNano.writeString(2, this.f5423b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5422a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5423b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Y8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Y8().mergeFrom(codedInputByteBufferNano);
    }

    public static Y8 a(byte[] bArr) {
        return (Y8) MessageNano.mergeFrom(new Y8(), bArr);
    }
}
