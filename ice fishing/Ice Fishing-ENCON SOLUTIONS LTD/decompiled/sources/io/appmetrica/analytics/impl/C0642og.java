package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642og extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6679e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6680f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6681g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0642og[] f6682h;

    /* renamed from: a, reason: collision with root package name */
    public String f6683a;

    /* renamed from: b, reason: collision with root package name */
    public long f6684b;

    /* renamed from: c, reason: collision with root package name */
    public long f6685c;

    /* renamed from: d, reason: collision with root package name */
    public int f6686d;

    public C0642og() {
        a();
    }

    public static C0642og[] b() {
        if (f6682h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6682h == null) {
                        f6682h = new C0642og[0];
                    }
                } finally {
                }
            }
        }
        return f6682h;
    }

    public final C0642og a() {
        this.f6683a = "";
        this.f6684b = 0L;
        this.f6685c = 0L;
        this.f6686d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6683a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6683a);
        }
        long j2 = this.f6684b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f6685c;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i2 = this.f6686d;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6683a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6683a);
        }
        long j2 = this.f6684b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f6685c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i2 = this.f6686d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0642og mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6683a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6684b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f6685c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6686d = readInt32;
                }
            }
        }
    }

    public static C0642og b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0642og().mergeFrom(codedInputByteBufferNano);
    }

    public static C0642og a(byte[] bArr) {
        return (C0642og) MessageNano.mergeFrom(new C0642og(), bArr);
    }
}
