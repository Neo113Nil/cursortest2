package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class P extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile P[] f7604c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7605a;

    /* renamed from: b, reason: collision with root package name */
    public long f7606b;

    public P() {
        a();
    }

    public static P[] b() {
        if (f7604c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7604c == null) {
                        f7604c = new P[0];
                    }
                } finally {
                }
            }
        }
        return f7604c;
    }

    public final P a() {
        this.f7605a = true;
        this.f7606b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7605a;
        if (!z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        long j2 = this.f7606b;
        return j2 != 1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7605a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        long j2 = this.f7606b;
        if (j2 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7605a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7606b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static P b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new P().mergeFrom(codedInputByteBufferNano);
    }

    public static P a(byte[] bArr) {
        return (P) MessageNano.mergeFrom(new P(), bArr);
    }
}
