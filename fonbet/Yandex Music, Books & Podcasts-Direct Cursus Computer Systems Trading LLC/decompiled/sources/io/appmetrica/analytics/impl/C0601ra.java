package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0601ra extends MessageNano {
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static volatile C0601ra[] j;
    public C0515oa[] a;
    public C0370ja b;
    public C0284ga[] c;
    public C0544pa[] d;
    public String[] e;
    public byte[][] f;

    public C0601ra() {
        a();
    }

    public static C0601ra[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new C0601ra[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0601ra mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0515oa[] c0515oaArr = this.a;
                int length = c0515oaArr == null ? 0 : c0515oaArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0515oa[] c0515oaArr2 = new C0515oa[i2];
                if (length != 0) {
                    System.arraycopy(c0515oaArr, 0, c0515oaArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0515oa c0515oa = new C0515oa();
                    c0515oaArr2[length] = c0515oa;
                    codedInputByteBufferNano.readMessage(c0515oa);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0515oa c0515oa2 = new C0515oa();
                c0515oaArr2[length] = c0515oa2;
                codedInputByteBufferNano.readMessage(c0515oa2);
                this.a = c0515oaArr2;
            } else if (readTag == 34) {
                if (this.b == null) {
                    this.b = new C0370ja();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0284ga[] c0284gaArr = this.c;
                int length2 = c0284gaArr == null ? 0 : c0284gaArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C0284ga[] c0284gaArr2 = new C0284ga[i3];
                if (length2 != 0) {
                    System.arraycopy(c0284gaArr, 0, c0284gaArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C0284ga c0284ga = new C0284ga();
                    c0284gaArr2[length2] = c0284ga;
                    codedInputByteBufferNano.readMessage(c0284ga);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0284ga c0284ga2 = new C0284ga();
                c0284gaArr2[length2] = c0284ga2;
                codedInputByteBufferNano.readMessage(c0284ga2);
                this.c = c0284gaArr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0544pa[] c0544paArr = this.d;
                int length3 = c0544paArr == null ? 0 : c0544paArr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                C0544pa[] c0544paArr2 = new C0544pa[i4];
                if (length3 != 0) {
                    System.arraycopy(c0544paArr, 0, c0544paArr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    C0544pa c0544pa = new C0544pa();
                    c0544paArr2[length3] = c0544pa;
                    codedInputByteBufferNano.readMessage(c0544pa);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0544pa c0544pa2 = new C0544pa();
                c0544paArr2[length3] = c0544pa2;
                codedInputByteBufferNano.readMessage(c0544pa2);
                this.d = c0544paArr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i5];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i5 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.e = strArr2;
            } else if (readTag == 98) {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i6 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i6][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i6 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f = bArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0515oa[] c0515oaArr = this.a;
        int i2 = 0;
        if (c0515oaArr != null && c0515oaArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0515oa[] c0515oaArr2 = this.a;
                if (i3 >= c0515oaArr2.length) {
                    break;
                }
                C0515oa c0515oa = c0515oaArr2[i3];
                if (c0515oa != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0515oa) + computeSerializedSize;
                }
                i3++;
            }
        }
        C0370ja c0370ja = this.b;
        if (c0370ja != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0370ja);
        }
        C0284ga[] c0284gaArr = this.c;
        if (c0284gaArr != null && c0284gaArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0284ga[] c0284gaArr2 = this.c;
                if (i4 >= c0284gaArr2.length) {
                    break;
                }
                C0284ga c0284ga = c0284gaArr2[i4];
                if (c0284ga != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0284ga) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0544pa[] c0544paArr = this.d;
        if (c0544paArr != null && c0544paArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0544pa[] c0544paArr2 = this.d;
                if (i5 >= c0544paArr2.length) {
                    break;
                }
                C0544pa c0544pa = c0544paArr2[i5];
                if (c0544pa != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0544pa) + computeSerializedSize;
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i6];
                if (str != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i6++;
            }
            computeSerializedSize = computeSerializedSize + i7 + i8;
        }
        byte[][] bArr = this.f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i9 + i10;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i10++;
                i9 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i9;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0515oa[] c0515oaArr = this.a;
        int i2 = 0;
        if (c0515oaArr != null && c0515oaArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0515oa[] c0515oaArr2 = this.a;
                if (i3 >= c0515oaArr2.length) {
                    break;
                }
                C0515oa c0515oa = c0515oaArr2[i3];
                if (c0515oa != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0515oa);
                }
                i3++;
            }
        }
        C0370ja c0370ja = this.b;
        if (c0370ja != null) {
            codedOutputByteBufferNano.writeMessage(4, c0370ja);
        }
        C0284ga[] c0284gaArr = this.c;
        if (c0284gaArr != null && c0284gaArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0284ga[] c0284gaArr2 = this.c;
                if (i4 >= c0284gaArr2.length) {
                    break;
                }
                C0284ga c0284ga = c0284gaArr2[i4];
                if (c0284ga != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0284ga);
                }
                i4++;
            }
        }
        C0544pa[] c0544paArr = this.d;
        if (c0544paArr != null && c0544paArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0544pa[] c0544paArr2 = this.d;
                if (i5 >= c0544paArr2.length) {
                    break;
                }
                C0544pa c0544pa = c0544paArr2[i5];
                if (c0544pa != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0544pa);
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i6];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i6++;
            }
        }
        byte[][] bArr = this.f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0601ra b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0601ra().mergeFrom(codedInputByteBufferNano);
    }

    public final C0601ra a() {
        this.a = C0515oa.b();
        this.b = null;
        this.c = C0284ga.b();
        this.d = C0544pa.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public static C0601ra a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0601ra) MessageNano.mergeFrom(new C0601ra(), bArr);
    }
}
