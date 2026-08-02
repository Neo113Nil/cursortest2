package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0515oa extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile C0515oa[] q;
    public long a;
    public C0486na b;
    public C0457ma[] c;

    public C0515oa() {
        a();
    }

    public static C0515oa[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C0515oa[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0515oa mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0486na();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0457ma[] c0457maArr = this.c;
                int length = c0457maArr == null ? 0 : c0457maArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0457ma[] c0457maArr2 = new C0457ma[i2];
                if (length != 0) {
                    System.arraycopy(c0457maArr, 0, c0457maArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0457ma c0457ma = new C0457ma();
                    c0457maArr2[length] = c0457ma;
                    codedInputByteBufferNano.readMessage(c0457ma);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0457ma c0457ma2 = new C0457ma();
                c0457maArr2[length] = c0457ma2;
                codedInputByteBufferNano.readMessage(c0457ma2);
                this.c = c0457maArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C0486na c0486na = this.b;
        if (c0486na != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0486na);
        }
        C0457ma[] c0457maArr = this.c;
        if (c0457maArr != null && c0457maArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0457ma[] c0457maArr2 = this.c;
                if (i2 >= c0457maArr2.length) {
                    break;
                }
                C0457ma c0457ma = c0457maArr2[i2];
                if (c0457ma != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0457ma) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        C0486na c0486na = this.b;
        if (c0486na != null) {
            codedOutputByteBufferNano.writeMessage(2, c0486na);
        }
        C0457ma[] c0457maArr = this.c;
        if (c0457maArr != null && c0457maArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0457ma[] c0457maArr2 = this.c;
                if (i2 >= c0457maArr2.length) {
                    break;
                }
                C0457ma c0457ma = c0457maArr2[i2];
                if (c0457ma != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0457ma);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0515oa b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0515oa().mergeFrom(codedInputByteBufferNano);
    }

    public final C0515oa a() {
        this.a = 0L;
        this.b = null;
        this.c = C0457ma.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0515oa a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0515oa) MessageNano.mergeFrom(new C0515oa(), bArr);
    }
}
