package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class U0 extends MessageNano {
    public static volatile U0[] f;
    public Q0[] a;
    public X0 b;
    public byte[][] c;
    public Z0 d;
    public P0 e;

    public U0() {
        a();
    }

    public static U0[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new U0[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Q0[] q0Arr = this.a;
                int length = q0Arr == null ? 0 : q0Arr.length;
                int i = repeatedFieldArrayLength + length;
                Q0[] q0Arr2 = new Q0[i];
                if (length != 0) {
                    System.arraycopy(q0Arr, 0, q0Arr2, 0, length);
                }
                while (length < i - 1) {
                    Q0 q0 = new Q0();
                    q0Arr2[length] = q0;
                    codedInputByteBufferNano.readMessage(q0);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Q0 q02 = new Q0();
                q0Arr2[length] = q02;
                codedInputByteBufferNano.readMessage(q02);
                this.a = q0Arr2;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new X0();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                byte[][] bArr = this.c;
                int length2 = bArr == null ? 0 : bArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                byte[][] bArr2 = new byte[i2][];
                if (length2 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    bArr2[length2] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                bArr2[length2] = codedInputByteBufferNano.readBytes();
                this.c = bArr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new Z0();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                if (this.e == null) {
                    this.e = new P0();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Q0[] q0Arr = this.a;
        int i = 0;
        if (q0Arr != null && q0Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Q0[] q0Arr2 = this.a;
                if (i2 >= q0Arr2.length) {
                    break;
                }
                Q0 q0 = q0Arr2[i2];
                if (q0 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, q0) + computeSerializedSize;
                }
                i2++;
            }
        }
        X0 x0 = this.b;
        if (x0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, x0);
        }
        byte[][] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[][] bArr2 = this.c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i4++;
                    i3 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i3;
                }
                i++;
            }
            computeSerializedSize = computeSerializedSize + i3 + i4;
        }
        Z0 z0 = this.d;
        if (z0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, z0);
        }
        P0 p0 = this.e;
        return p0 != null ? CodedOutputByteBufferNano.computeMessageSize(5, p0) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Q0[] q0Arr = this.a;
        int i = 0;
        if (q0Arr != null && q0Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Q0[] q0Arr2 = this.a;
                if (i2 >= q0Arr2.length) {
                    break;
                }
                Q0 q0 = q0Arr2[i2];
                if (q0 != null) {
                    codedOutputByteBufferNano.writeMessage(1, q0);
                }
                i2++;
            }
        }
        X0 x0 = this.b;
        if (x0 != null) {
            codedOutputByteBufferNano.writeMessage(2, x0);
        }
        byte[][] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(3, bArr3);
                }
                i++;
            }
        }
        Z0 z0 = this.d;
        if (z0 != null) {
            codedOutputByteBufferNano.writeMessage(4, z0);
        }
        P0 p0 = this.e;
        if (p0 != null) {
            codedOutputByteBufferNano.writeMessage(5, p0);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static U0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U0().mergeFrom(codedInputByteBufferNano);
    }

    public final U0 a() {
        this.a = Q0.b();
        this.b = null;
        this.c = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.d = null;
        this.e = null;
        this.cachedSize = -1;
        return this;
    }

    public static U0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (U0) MessageNano.mergeFrom(new U0(), bArr);
    }
}
