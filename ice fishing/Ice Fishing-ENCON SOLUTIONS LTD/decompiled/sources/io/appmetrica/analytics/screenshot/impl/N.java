package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class N extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile N[] f7598b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7599a;

    public N() {
        a();
    }

    public static N[] b() {
        if (f7598b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7598b == null) {
                        f7598b = new N[0];
                    }
                } finally {
                }
            }
        }
        return f7598b;
    }

    public final N a() {
        this.f7599a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7599a;
        return !z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7599a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7599a = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static N a(byte[] bArr) {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new N().mergeFrom(codedInputByteBufferNano);
    }
}
