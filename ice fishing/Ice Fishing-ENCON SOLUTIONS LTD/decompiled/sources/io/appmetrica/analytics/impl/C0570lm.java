package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.lm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570lm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0570lm[] f6464b;

    /* renamed from: a, reason: collision with root package name */
    public String f6465a;

    public C0570lm() {
        a();
    }

    public static C0570lm[] b() {
        if (f6464b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6464b == null) {
                        f6464b = new C0570lm[0];
                    }
                } finally {
                }
            }
        }
        return f6464b;
    }

    public final C0570lm a() {
        this.f6465a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !this.f6465a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f6465a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6465a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6465a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0570lm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6465a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0570lm a(byte[] bArr) {
        return (C0570lm) MessageNano.mergeFrom(new C0570lm(), bArr);
    }

    public static C0570lm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0570lm().mergeFrom(codedInputByteBufferNano);
    }
}
