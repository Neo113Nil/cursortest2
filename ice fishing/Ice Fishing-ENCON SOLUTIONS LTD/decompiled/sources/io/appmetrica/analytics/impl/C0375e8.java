package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375e8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0375e8[] f5875e;

    /* renamed from: a, reason: collision with root package name */
    public C0608n8 f5876a;

    /* renamed from: b, reason: collision with root package name */
    public C0660p8 f5877b;

    /* renamed from: c, reason: collision with root package name */
    public C0427g8 f5878c;

    /* renamed from: d, reason: collision with root package name */
    public C0582m8 f5879d;

    public C0375e8() {
        a();
    }

    public static C0375e8[] b() {
        if (f5875e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5875e == null) {
                        f5875e = new C0375e8[0];
                    }
                } finally {
                }
            }
        }
        return f5875e;
    }

    public final C0375e8 a() {
        this.f5876a = null;
        this.f5877b = null;
        this.f5878c = null;
        this.f5879d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0608n8 c0608n8 = this.f5876a;
        if (c0608n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0608n8);
        }
        C0660p8 c0660p8 = this.f5877b;
        if (c0660p8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0660p8);
        }
        C0427g8 c0427g8 = this.f5878c;
        if (c0427g8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0427g8);
        }
        C0582m8 c0582m8 = this.f5879d;
        return c0582m8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c0582m8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0608n8 c0608n8 = this.f5876a;
        if (c0608n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0608n8);
        }
        C0660p8 c0660p8 = this.f5877b;
        if (c0660p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0660p8);
        }
        C0427g8 c0427g8 = this.f5878c;
        if (c0427g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0427g8);
        }
        C0582m8 c0582m8 = this.f5879d;
        if (c0582m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0582m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0375e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5876a == null) {
                    this.f5876a = new C0608n8();
                }
                codedInputByteBufferNano.readMessage(this.f5876a);
            } else if (readTag == 18) {
                if (this.f5877b == null) {
                    this.f5877b = new C0660p8();
                }
                codedInputByteBufferNano.readMessage(this.f5877b);
            } else if (readTag == 26) {
                if (this.f5878c == null) {
                    this.f5878c = new C0427g8();
                }
                codedInputByteBufferNano.readMessage(this.f5878c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5879d == null) {
                    this.f5879d = new C0582m8();
                }
                codedInputByteBufferNano.readMessage(this.f5879d);
            }
        }
    }

    public static C0375e8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0375e8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0375e8 a(byte[] bArr) {
        return (C0375e8) MessageNano.mergeFrom(new C0375e8(), bArr);
    }
}
