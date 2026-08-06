package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737s8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0737s8[] f6887c;

    /* renamed from: a, reason: collision with root package name */
    public C0608n8 f6888a;

    /* renamed from: b, reason: collision with root package name */
    public C0660p8 f6889b;

    public C0737s8() {
        a();
    }

    public static C0737s8[] b() {
        if (f6887c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6887c == null) {
                        f6887c = new C0737s8[0];
                    }
                } finally {
                }
            }
        }
        return f6887c;
    }

    public final C0737s8 a() {
        this.f6888a = null;
        this.f6889b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0608n8 c0608n8 = this.f6888a;
        if (c0608n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0608n8);
        }
        C0660p8 c0660p8 = this.f6889b;
        return c0660p8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0660p8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0608n8 c0608n8 = this.f6888a;
        if (c0608n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0608n8);
        }
        C0660p8 c0660p8 = this.f6889b;
        if (c0660p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0660p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0737s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6888a == null) {
                    this.f6888a = new C0608n8();
                }
                codedInputByteBufferNano.readMessage(this.f6888a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6889b == null) {
                    this.f6889b = new C0660p8();
                }
                codedInputByteBufferNano.readMessage(this.f6889b);
            }
        }
    }

    public static C0737s8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0737s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0737s8 a(byte[] bArr) {
        return (C0737s8) MessageNano.mergeFrom(new C0737s8(), bArr);
    }
}
