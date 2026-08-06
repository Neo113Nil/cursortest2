package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Y5 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Y5[] f5415c;

    /* renamed from: a, reason: collision with root package name */
    public int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public String f5417b;

    public Y5() {
        a();
    }

    public static Y5[] b() {
        if (f5415c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5415c == null) {
                        f5415c = new Y5[0];
                    }
                } finally {
                }
            }
        }
        return f5415c;
    }

    public final Y5 a() {
        this.f5416a = 0;
        this.f5417b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f5416a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !this.f5417b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f5417b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f5416a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f5417b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5417b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f5416a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5417b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Y5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static Y5 a(byte[] bArr) {
        return (Y5) MessageNano.mergeFrom(new Y5(), bArr);
    }
}
