package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class D extends MessageNano {
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static volatile D[] q;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;

    public D() {
        a();
    }

    public static D[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new D[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.a = readInt32;
                }
            } else if (readTag == 16) {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == 1 || readInt322 == 2) {
                    this.b = readInt322;
                }
            } else if (readTag == 24) {
                int readInt323 = codedInputByteBufferNano.readInt32();
                if (readInt323 == 1 || readInt323 == 2 || readInt323 == 3) {
                    this.c = readInt323;
                }
            } else if (readTag == 32) {
                int readInt324 = codedInputByteBufferNano.readInt32();
                if (readInt324 == 1 || readInt324 == 2 || readInt324 == 3) {
                    this.d = readInt324;
                }
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        int i3 = this.b;
        if (i3 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i3);
        }
        int i4 = this.c;
        if (i4 != 3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i4);
        }
        int i5 = this.d;
        if (i5 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        long j2 = this.e;
        return j2 != 0 ? CodedOutputByteBufferNano.computeInt64Size(5, j2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        int i3 = this.b;
        if (i3 != 2) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        int i4 = this.c;
        if (i4 != 3) {
            codedOutputByteBufferNano.writeInt32(3, i4);
        }
        int i5 = this.d;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        long j2 = this.e;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(5, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static D b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D().mergeFrom(codedInputByteBufferNano);
    }

    public final D a() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
        this.d = 1;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    public static D a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D) MessageNano.mergeFrom(new D(), bArr);
    }
}
