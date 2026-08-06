package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350d8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0350d8[] f5806b;

    /* renamed from: a, reason: collision with root package name */
    public C0375e8 f5807a;

    public C0350d8() {
        a();
    }

    public static C0350d8[] b() {
        if (f5806b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5806b == null) {
                        f5806b = new C0350d8[0];
                    }
                } finally {
                }
            }
        }
        return f5806b;
    }

    public final C0350d8 a() {
        this.f5807a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0375e8 c0375e8 = this.f5807a;
        return c0375e8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c0375e8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0375e8 c0375e8 = this.f5807a;
        if (c0375e8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0375e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0350d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f5807a == null) {
                    this.f5807a = new C0375e8();
                }
                codedInputByteBufferNano.readMessage(this.f5807a);
            }
        }
    }

    public static C0350d8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0350d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0350d8 a(byte[] bArr) {
        return (C0350d8) MessageNano.mergeFrom(new C0350d8(), bArr);
    }
}
