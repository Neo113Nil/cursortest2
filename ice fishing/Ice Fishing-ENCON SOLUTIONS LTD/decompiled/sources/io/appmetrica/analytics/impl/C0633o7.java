package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633o7 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0633o7[] f6662d;

    /* renamed from: a, reason: collision with root package name */
    public long f6663a;

    /* renamed from: b, reason: collision with root package name */
    public long f6664b;

    /* renamed from: c, reason: collision with root package name */
    public int f6665c;

    public C0633o7() {
        a();
    }

    public static C0633o7[] b() {
        if (f6662d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6662d == null) {
                        f6662d = new C0633o7[0];
                    }
                } finally {
                }
            }
        }
        return f6662d;
    }

    public final C0633o7 a() {
        this.f6663a = -1L;
        this.f6664b = -1L;
        this.f6665c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6663a;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        long j3 = this.f6664b;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j3);
        }
        int i2 = this.f6665c;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6663a;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        long j3 = this.f6664b;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j3);
        }
        int i2 = this.f6665c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0633o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6663a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f6664b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f6665c = readInt32;
                }
            }
        }
    }

    public static C0633o7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0633o7().mergeFrom(codedInputByteBufferNano);
    }

    public static C0633o7 a(byte[] bArr) {
        return (C0633o7) MessageNano.mergeFrom(new C0633o7(), bArr);
    }
}
