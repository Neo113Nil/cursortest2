package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480i9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0480i9[] f6179e;

    /* renamed from: a, reason: collision with root package name */
    public long f6180a;

    /* renamed from: b, reason: collision with root package name */
    public int f6181b;

    /* renamed from: c, reason: collision with root package name */
    public long f6182c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6183d;

    public C0480i9() {
        a();
    }

    public static C0480i9[] b() {
        if (f6179e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6179e == null) {
                        f6179e = new C0480i9[0];
                    }
                } finally {
                }
            }
        }
        return f6179e;
    }

    public final C0480i9 a() {
        this.f6180a = 0L;
        this.f6181b = 0;
        this.f6182c = 0L;
        this.f6183d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f6181b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6180a) + super.computeSerializedSize();
        long j2 = this.f6182c;
        if (j2 != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j2);
        }
        boolean z2 = this.f6183d;
        return z2 ? computeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6180a);
        codedOutputByteBufferNano.writeSInt32(2, this.f6181b);
        long j2 = this.f6182c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(3, j2);
        }
        boolean z2 = this.f6183d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0480i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6180a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f6181b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f6182c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6183d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0480i9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0480i9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0480i9 a(byte[] bArr) {
        return (C0480i9) MessageNano.mergeFrom(new C0480i9(), bArr);
    }
}
