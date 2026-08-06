package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class j extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile j[] f4024b;

    /* renamed from: a, reason: collision with root package name */
    public int f4025a;

    public j() {
        a();
    }

    public static j[] b() {
        if (f4024b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4024b == null) {
                        f4024b = new j[0];
                    }
                } finally {
                }
            }
        }
        return f4024b;
    }

    public final j a() {
        this.f4025a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4025a;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4025a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1) {
                    this.f4025a = readInt32;
                }
            }
        }
    }

    public static j a(byte[] bArr) {
        return (j) MessageNano.mergeFrom(new j(), bArr);
    }

    public static j b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new j().mergeFrom(codedInputByteBufferNano);
    }
}
