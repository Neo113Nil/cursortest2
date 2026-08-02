package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Q6 extends MessageNano {
    public static final int k = 0;
    public static final int l = 1;
    public static volatile Q6[] m;
    public static byte[] n;
    public static volatile boolean o;
    public W6 a;
    public M6 b;
    public String c;
    public int d;
    public U6[] e;
    public int f;
    public P6 g;
    public byte[] h;
    public byte[] i;
    public O6[] j;

    public Q6() {
        if (!o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!o) {
                        n = InternalNano.bytesDefaultValue("JVM");
                        o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static Q6[] b() {
        if (m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (m == null) {
                        m = new Q6[0];
                    }
                } finally {
                }
            }
        }
        return m;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new W6();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new M6();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    break;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.d = readInt32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    U6[] u6Arr = this.e;
                    int length = u6Arr == null ? 0 : u6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    U6[] u6Arr2 = new U6[i];
                    if (length != 0) {
                        System.arraycopy(u6Arr, 0, u6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        U6 u6 = new U6();
                        u6Arr2[length] = u6;
                        codedInputByteBufferNano.readMessage(u6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    U6 u62 = new U6();
                    u6Arr2[length] = u62;
                    codedInputByteBufferNano.readMessage(u62);
                    this.e = u6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f = readInt322;
                        break;
                    }
                case 58:
                    if (this.g == null) {
                        this.g = new P6();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    break;
                case 66:
                    this.h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    O6[] o6Arr = this.j;
                    int length2 = o6Arr == null ? 0 : o6Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    O6[] o6Arr2 = new O6[i2];
                    if (length2 != 0) {
                        System.arraycopy(o6Arr, 0, o6Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        O6 o6 = new O6();
                        o6Arr2[length2] = o6;
                        codedInputByteBufferNano.readMessage(o6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    O6 o62 = new O6();
                    o6Arr2[length2] = o62;
                    codedInputByteBufferNano.readMessage(o62);
                    this.j = o6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        W6 w6 = this.a;
        if (w6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, w6);
        }
        M6 m6 = this.b;
        if (m6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, m6);
        }
        if (!this.c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        U6[] u6Arr = this.e;
        int i2 = 0;
        if (u6Arr != null && u6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                U6[] u6Arr2 = this.e;
                if (i3 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i3];
                if (u6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, u6) + computeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        P6 p6 = this.g;
        if (p6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, p6);
        }
        if (!Arrays.equals(this.h, n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        O6[] o6Arr = this.j;
        if (o6Arr != null && o6Arr.length > 0) {
            while (true) {
                O6[] o6Arr2 = this.j;
                if (i2 >= o6Arr2.length) {
                    break;
                }
                O6 o6 = o6Arr2[i2];
                if (o6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, o6) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        W6 w6 = this.a;
        if (w6 != null) {
            codedOutputByteBufferNano.writeMessage(1, w6);
        }
        M6 m6 = this.b;
        if (m6 != null) {
            codedOutputByteBufferNano.writeMessage(2, m6);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        U6[] u6Arr = this.e;
        int i2 = 0;
        if (u6Arr != null && u6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                U6[] u6Arr2 = this.e;
                if (i3 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i3];
                if (u6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, u6);
                }
                i3++;
            }
        }
        int i4 = this.f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        P6 p6 = this.g;
        if (p6 != null) {
            codedOutputByteBufferNano.writeMessage(7, p6);
        }
        if (!Arrays.equals(this.h, n)) {
            codedOutputByteBufferNano.writeBytes(8, this.h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        O6[] o6Arr = this.j;
        if (o6Arr != null && o6Arr.length > 0) {
            while (true) {
                O6[] o6Arr2 = this.j;
                if (i2 >= o6Arr2.length) {
                    break;
                }
                O6 o6 = o6Arr2[i2];
                if (o6 != null) {
                    codedOutputByteBufferNano.writeMessage(10, o6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Q6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Q6().mergeFrom(codedInputByteBufferNano);
    }

    public final Q6 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = U6.b();
        this.f = 0;
        this.g = null;
        this.h = (byte[]) n.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.j = O6.b();
        this.cachedSize = -1;
        return this;
    }

    public static Q6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Q6) MessageNano.mergeFrom(new Q6(), bArr);
    }
}
