package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273a9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0273a9[] f5561c;

    /* renamed from: a, reason: collision with root package name */
    public String f5562a;

    /* renamed from: b, reason: collision with root package name */
    public long f5563b;

    public C0273a9() {
        a();
    }

    public static C0273a9[] b() {
        if (f5561c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5561c == null) {
                        f5561c = new C0273a9[0];
                    }
                } finally {
                }
            }
        }
        return f5561c;
    }

    public final C0273a9 a() {
        this.f5562a = "";
        this.f5563b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f5563b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5562a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5562a);
        codedOutputByteBufferNano.writeUInt64(2, this.f5563b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0273a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5562a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5563b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static C0273a9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0273a9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0273a9 a(byte[] bArr) {
        return (C0273a9) MessageNano.mergeFrom(new C0273a9(), bArr);
    }
}
