package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479i8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0479i8[] f6176c;

    /* renamed from: a, reason: collision with root package name */
    public int f6177a;

    /* renamed from: b, reason: collision with root package name */
    public C0375e8 f6178b;

    public C0479i8() {
        a();
    }

    public static C0479i8[] b() {
        if (f6176c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6176c == null) {
                        f6176c = new C0479i8[0];
                    }
                } finally {
                }
            }
        }
        return f6176c;
    }

    public final C0479i8 a() {
        this.f6177a = 0;
        this.f6178b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6177a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        C0375e8 c0375e8 = this.f6178b;
        return c0375e8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0375e8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6177a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        C0375e8 c0375e8 = this.f6178b;
        if (c0375e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0375e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0479i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6177a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6178b == null) {
                    this.f6178b = new C0375e8();
                }
                codedInputByteBufferNano.readMessage(this.f6178b);
            }
        }
    }

    public static C0479i8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0479i8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0479i8 a(byte[] bArr) {
        return (C0479i8) MessageNano.mergeFrom(new C0479i8(), bArr);
    }
}
