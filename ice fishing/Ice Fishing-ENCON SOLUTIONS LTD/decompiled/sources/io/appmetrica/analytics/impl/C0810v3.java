package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810v3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0810v3[] f7036c;

    /* renamed from: a, reason: collision with root package name */
    public String f7037a;

    /* renamed from: b, reason: collision with root package name */
    public String f7038b;

    public C0810v3() {
        a();
    }

    public static C0810v3[] b() {
        if (f7036c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7036c == null) {
                        f7036c = new C0810v3[0];
                    }
                } finally {
                }
            }
        }
        return f7036c;
    }

    public final C0810v3 a() {
        this.f7037a = "";
        this.f7038b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7037a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7037a);
        }
        return !this.f7038b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f7038b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7037a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7037a);
        }
        if (!this.f7038b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7038b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0810v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7037a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7038b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0810v3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0810v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0810v3 a(byte[] bArr) {
        return (C0810v3) MessageNano.mergeFrom(new C0810v3(), bArr);
    }
}
