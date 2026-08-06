package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class c extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile c[] f3543f;

    /* renamed from: a, reason: collision with root package name */
    public int f3544a;

    /* renamed from: b, reason: collision with root package name */
    public String f3545b;

    /* renamed from: c, reason: collision with root package name */
    public String f3546c;

    /* renamed from: d, reason: collision with root package name */
    public long f3547d;

    /* renamed from: e, reason: collision with root package name */
    public long f3548e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f3543f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3543f == null) {
                        f3543f = new c[0];
                    }
                } finally {
                }
            }
        }
        return f3543f;
    }

    public final c a() {
        this.f3544a = 1;
        this.f3545b = "";
        this.f3546c = "";
        this.f3547d = 0L;
        this.f3548e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f3548e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f3547d) + CodedOutputByteBufferNano.computeStringSize(3, this.f3546c) + CodedOutputByteBufferNano.computeStringSize(2, this.f3545b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f3544a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(1, this.f3544a);
        codedOutputByteBufferNano.writeString(2, this.f3545b);
        codedOutputByteBufferNano.writeString(3, this.f3546c);
        codedOutputByteBufferNano.writeUInt64(4, this.f3547d);
        codedOutputByteBufferNano.writeUInt64(5, this.f3548e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f3544a = readInt32;
                }
            } else if (readTag == 18) {
                this.f3545b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f3546c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f3547d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3548e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static c a(byte[] bArr) {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}
