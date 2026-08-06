package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648om extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0648om[] f6694b;

    /* renamed from: a, reason: collision with root package name */
    public long f6695a;

    public C0648om() {
        a();
    }

    public static C0648om[] b() {
        if (f6694b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6694b == null) {
                        f6694b = new C0648om[0];
                    }
                } finally {
                }
            }
        }
        return f6694b;
    }

    public final C0648om a() {
        this.f6695a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6695a;
        return j2 != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6695a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0648om mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6695a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C0648om a(byte[] bArr) {
        return (C0648om) MessageNano.mergeFrom(new C0648om(), bArr);
    }

    public static C0648om b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0648om().mergeFrom(codedInputByteBufferNano);
    }
}
