package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402f9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5968d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5969e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5970f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0402f9[] f5971g;

    /* renamed from: a, reason: collision with root package name */
    public C0480i9 f5972a;

    /* renamed from: b, reason: collision with root package name */
    public String f5973b;

    /* renamed from: c, reason: collision with root package name */
    public int f5974c;

    public C0402f9() {
        a();
    }

    public static C0402f9[] b() {
        if (f5971g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5971g == null) {
                        f5971g = new C0402f9[0];
                    }
                } finally {
                }
            }
        }
        return f5971g;
    }

    public final C0402f9 a() {
        this.f5972a = null;
        this.f5973b = "";
        this.f5974c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0480i9 c0480i9 = this.f5972a;
        if (c0480i9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0480i9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f5973b) + computeSerializedSize;
        int i2 = this.f5974c;
        return i2 != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i2) : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0480i9 c0480i9 = this.f5972a;
        if (c0480i9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0480i9);
        }
        codedOutputByteBufferNano.writeString(2, this.f5973b);
        int i2 = this.f5974c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0402f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5972a == null) {
                    this.f5972a = new C0480i9();
                }
                codedInputByteBufferNano.readMessage(this.f5972a);
            } else if (readTag == 18) {
                this.f5973b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5974c = readInt32;
                }
            }
        }
    }

    public static C0402f9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0402f9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0402f9 a(byte[] bArr) {
        return (C0402f9) MessageNano.mergeFrom(new C0402f9(), bArr);
    }
}
