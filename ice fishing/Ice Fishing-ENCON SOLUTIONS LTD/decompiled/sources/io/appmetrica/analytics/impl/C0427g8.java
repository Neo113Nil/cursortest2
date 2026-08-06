package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427g8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0427g8[] f6055c;

    /* renamed from: a, reason: collision with root package name */
    public long f6056a;

    /* renamed from: b, reason: collision with root package name */
    public int f6057b;

    public C0427g8() {
        a();
    }

    public static C0427g8[] b() {
        if (f6055c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6055c == null) {
                        f6055c = new C0427g8[0];
                    }
                } finally {
                }
            }
        }
        return f6055c;
    }

    public final C0427g8 a() {
        this.f6056a = 0L;
        this.f6057b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6056a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int i2 = this.f6057b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6056a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int i2 = this.f6057b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0427g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6056a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6057b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static C0427g8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0427g8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0427g8 a(byte[] bArr) {
        return (C0427g8) MessageNano.mergeFrom(new C0427g8(), bArr);
    }
}
