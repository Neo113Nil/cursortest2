package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700qm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0700qm[] f6790b;

    /* renamed from: a, reason: collision with root package name */
    public long f6791a;

    public C0700qm() {
        a();
    }

    public static C0700qm[] b() {
        if (f6790b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6790b == null) {
                        f6790b = new C0700qm[0];
                    }
                } finally {
                }
            }
        }
        return f6790b;
    }

    public final C0700qm a() {
        this.f6791a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6791a;
        return j2 != 864000000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6791a;
        if (j2 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0700qm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6791a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C0700qm a(byte[] bArr) {
        return (C0700qm) MessageNano.mergeFrom(new C0700qm(), bArr);
    }

    public static C0700qm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0700qm().mergeFrom(codedInputByteBufferNano);
    }
}
