package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class S6 extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static volatile S6[] n;
    public static byte[] o;
    public static volatile boolean p;
    public W6 a;
    public M6 b;
    public String c;
    public int d;
    public U6[] e;
    public String f;
    public int g;
    public R6 h;
    public byte[] i;
    public byte[] j;
    public O6[] k;

    public S6() {
        if (!p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!p) {
                        o = InternalNano.bytesDefaultValue("JVM");
                        p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static S6[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new S6[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.g = readInt322;
                        break;
                    }
                case 66:
                    if (this.h == null) {
                        this.h = new R6();
                    }
                    codedInputByteBufferNano.readMessage(this.h);
                    break;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    O6[] o6Arr = this.k;
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
                    this.k = o6Arr2;
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
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        int i4 = this.g;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        R6 r6 = this.h;
        if (r6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, r6);
        }
        if (!Arrays.equals(this.i, o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        O6[] o6Arr = this.k;
        if (o6Arr != null && o6Arr.length > 0) {
            while (true) {
                O6[] o6Arr2 = this.k;
                if (i2 >= o6Arr2.length) {
                    break;
                }
                O6 o6 = o6Arr2[i2];
                if (o6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, o6) + computeSerializedSize;
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
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        R6 r6 = this.h;
        if (r6 != null) {
            codedOutputByteBufferNano.writeMessage(8, r6);
        }
        if (!Arrays.equals(this.i, o)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        O6[] o6Arr = this.k;
        if (o6Arr != null && o6Arr.length > 0) {
            while (true) {
                O6[] o6Arr2 = this.k;
                if (i2 >= o6Arr2.length) {
                    break;
                }
                O6 o6 = o6Arr2[i2];
                if (o6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, o6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static S6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S6().mergeFrom(codedInputByteBufferNano);
    }

    public final S6 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = U6.b();
        this.f = "";
        this.g = 0;
        this.h = null;
        this.i = (byte[]) o.clone();
        this.j = WireFormatNano.EMPTY_BYTES;
        this.k = O6.b();
        this.cachedSize = -1;
        return this;
    }

    public static S6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S6) MessageNano.mergeFrom(new S6(), bArr);
    }
}
