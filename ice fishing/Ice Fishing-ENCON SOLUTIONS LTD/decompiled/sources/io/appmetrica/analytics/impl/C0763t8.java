package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763t8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0763t8[] f6938b;

    /* renamed from: a, reason: collision with root package name */
    public C0686q8 f6939a;

    public C0763t8() {
        a();
    }

    public static C0763t8[] b() {
        if (f6938b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6938b == null) {
                        f6938b = new C0763t8[0];
                    }
                } finally {
                }
            }
        }
        return f6938b;
    }

    public final C0763t8 a() {
        this.f6939a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0686q8 c0686q8 = this.f6939a;
        return c0686q8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c0686q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0686q8 c0686q8 = this.f6939a;
        if (c0686q8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0686q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0763t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f6939a == null) {
                    this.f6939a = new C0686q8();
                }
                codedInputByteBufferNano.readMessage(this.f6939a);
            }
        }
    }

    public static C0763t8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0763t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0763t8 a(byte[] bArr) {
        return (C0763t8) MessageNano.mergeFrom(new C0763t8(), bArr);
    }
}
