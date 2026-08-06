package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596mm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0596mm[] f6536c;

    /* renamed from: a, reason: collision with root package name */
    public String f6537a;

    /* renamed from: b, reason: collision with root package name */
    public C0570lm f6538b;

    public C0596mm() {
        a();
    }

    public static C0596mm[] b() {
        if (f6536c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6536c == null) {
                        f6536c = new C0596mm[0];
                    }
                } finally {
                }
            }
        }
        return f6536c;
    }

    public final C0596mm a() {
        this.f6537a = "";
        this.f6538b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6537a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6537a);
        }
        C0570lm c0570lm = this.f6538b;
        return c0570lm != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0570lm) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6537a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6537a);
        }
        C0570lm c0570lm = this.f6538b;
        if (c0570lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0570lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0596mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6537a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6538b == null) {
                    this.f6538b = new C0570lm();
                }
                codedInputByteBufferNano.readMessage(this.f6538b);
            }
        }
    }

    public static C0596mm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0596mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0596mm a(byte[] bArr) {
        return (C0596mm) MessageNano.mergeFrom(new C0596mm(), bArr);
    }
}
