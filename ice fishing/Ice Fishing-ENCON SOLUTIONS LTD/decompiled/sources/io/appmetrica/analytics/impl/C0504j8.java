package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504j8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0504j8[] f6255b;

    /* renamed from: a, reason: collision with root package name */
    public C0453h8 f6256a;

    public C0504j8() {
        a();
    }

    public static C0504j8[] b() {
        if (f6255b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6255b == null) {
                        f6255b = new C0504j8[0];
                    }
                } finally {
                }
            }
        }
        return f6255b;
    }

    public final C0504j8 a() {
        this.f6256a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0453h8 c0453h8 = this.f6256a;
        return c0453h8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c0453h8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0453h8 c0453h8 = this.f6256a;
        if (c0453h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0453h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0504j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f6256a == null) {
                    this.f6256a = new C0453h8();
                }
                codedInputByteBufferNano.readMessage(this.f6256a);
            }
        }
    }

    public static C0504j8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0504j8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0504j8 a(byte[] bArr) {
        return (C0504j8) MessageNano.mergeFrom(new C0504j8(), bArr);
    }
}
