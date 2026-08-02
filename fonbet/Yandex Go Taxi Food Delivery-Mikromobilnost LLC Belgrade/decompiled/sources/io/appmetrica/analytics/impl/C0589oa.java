package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0589oa extends MessageNano {
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static volatile C0589oa[] m;
    public double a;
    public double b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;

    public C0589oa() {
        a();
    }

    public static C0589oa[] b() {
        if (m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (m == null) {
                        m = new C0589oa[0];
                    }
                } finally {
                }
            }
        }
        return m;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589oa mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.h = readInt32;
                }
            } else if (readTag == 74) {
                this.i = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.a) + super.computeSerializedSize();
        long j2 = this.c;
        if (j2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.d;
        if (i != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        int i5 = this.h;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
        }
        return !this.i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.a);
        codedOutputByteBufferNano.writeDouble(2, this.b);
        long j2 = this.c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        int i5 = this.h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i5);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0589oa b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0589oa().mergeFrom(codedInputByteBufferNano);
    }

    public final C0589oa a() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    public static C0589oa a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0589oa) MessageNano.mergeFrom(new C0589oa(), bArr);
    }
}
