package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711r8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0711r8[] f6815c;

    /* renamed from: a, reason: collision with root package name */
    public C0608n8 f6816a;

    /* renamed from: b, reason: collision with root package name */
    public C0686q8 f6817b;

    public C0711r8() {
        a();
    }

    public static C0711r8[] b() {
        if (f6815c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6815c == null) {
                        f6815c = new C0711r8[0];
                    }
                } finally {
                }
            }
        }
        return f6815c;
    }

    public final C0711r8 a() {
        this.f6816a = null;
        this.f6817b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0608n8 c0608n8 = this.f6816a;
        if (c0608n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0608n8);
        }
        C0686q8 c0686q8 = this.f6817b;
        return c0686q8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0686q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0608n8 c0608n8 = this.f6816a;
        if (c0608n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0608n8);
        }
        C0686q8 c0686q8 = this.f6817b;
        if (c0686q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0686q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0711r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6816a == null) {
                    this.f6816a = new C0608n8();
                }
                codedInputByteBufferNano.readMessage(this.f6816a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6817b == null) {
                    this.f6817b = new C0686q8();
                }
                codedInputByteBufferNano.readMessage(this.f6817b);
            }
        }
    }

    public static C0711r8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0711r8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0711r8 a(byte[] bArr) {
        return (C0711r8) MessageNano.mergeFrom(new C0711r8(), bArr);
    }
}
