package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505j9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6257g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6258h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6259i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0505j9[] f6260j;

    /* renamed from: a, reason: collision with root package name */
    public C0428g9[] f6261a;

    /* renamed from: b, reason: collision with root package name */
    public C0299b9 f6262b;

    /* renamed from: c, reason: collision with root package name */
    public Y8[] f6263c;

    /* renamed from: d, reason: collision with root package name */
    public C0454h9[] f6264d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f6265e;

    /* renamed from: f, reason: collision with root package name */
    public byte[][] f6266f;

    public C0505j9() {
        a();
    }

    public static C0505j9[] b() {
        if (f6260j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6260j == null) {
                        f6260j = new C0505j9[0];
                    }
                } finally {
                }
            }
        }
        return f6260j;
    }

    public final C0505j9 a() {
        this.f6261a = C0428g9.b();
        this.f6262b = null;
        this.f6263c = Y8.b();
        this.f6264d = C0454h9.b();
        this.f6265e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f6266f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0428g9[] c0428g9Arr = this.f6261a;
        int i2 = 0;
        if (c0428g9Arr != null && c0428g9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0428g9[] c0428g9Arr2 = this.f6261a;
                if (i3 >= c0428g9Arr2.length) {
                    break;
                }
                C0428g9 c0428g9 = c0428g9Arr2[i3];
                if (c0428g9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0428g9) + computeSerializedSize;
                }
                i3++;
            }
        }
        C0299b9 c0299b9 = this.f6262b;
        if (c0299b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0299b9);
        }
        Y8[] y8Arr = this.f6263c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f6263c;
                if (i4 >= y8Arr2.length) {
                    break;
                }
                Y8 y8 = y8Arr2[i4];
                if (y8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, y8) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0454h9[] c0454h9Arr = this.f6264d;
        if (c0454h9Arr != null && c0454h9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0454h9[] c0454h9Arr2 = this.f6264d;
                if (i5 >= c0454h9Arr2.length) {
                    break;
                }
                C0454h9 c0454h9 = c0454h9Arr2[i5];
                if (c0454h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0454h9) + computeSerializedSize;
                }
                i5++;
            }
        }
        String[] strArr = this.f6265e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f6265e;
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
        byte[][] bArr = this.f6266f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = this.f6266f;
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
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0428g9[] c0428g9Arr = this.f6261a;
        int i2 = 0;
        if (c0428g9Arr != null && c0428g9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C0428g9[] c0428g9Arr2 = this.f6261a;
                if (i3 >= c0428g9Arr2.length) {
                    break;
                }
                C0428g9 c0428g9 = c0428g9Arr2[i3];
                if (c0428g9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0428g9);
                }
                i3++;
            }
        }
        C0299b9 c0299b9 = this.f6262b;
        if (c0299b9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0299b9);
        }
        Y8[] y8Arr = this.f6263c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f6263c;
                if (i4 >= y8Arr2.length) {
                    break;
                }
                Y8 y8 = y8Arr2[i4];
                if (y8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, y8);
                }
                i4++;
            }
        }
        C0454h9[] c0454h9Arr = this.f6264d;
        if (c0454h9Arr != null && c0454h9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0454h9[] c0454h9Arr2 = this.f6264d;
                if (i5 >= c0454h9Arr2.length) {
                    break;
                }
                C0454h9 c0454h9 = c0454h9Arr2[i5];
                if (c0454h9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0454h9);
                }
                i5++;
            }
        }
        String[] strArr = this.f6265e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f6265e;
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
        byte[][] bArr = this.f6266f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f6266f;
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

    public static C0505j9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0505j9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0505j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0428g9[] c0428g9Arr = this.f6261a;
                int length = c0428g9Arr == null ? 0 : c0428g9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0428g9[] c0428g9Arr2 = new C0428g9[i2];
                if (length != 0) {
                    System.arraycopy(c0428g9Arr, 0, c0428g9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0428g9 c0428g9 = new C0428g9();
                    c0428g9Arr2[length] = c0428g9;
                    codedInputByteBufferNano.readMessage(c0428g9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0428g9 c0428g92 = new C0428g9();
                c0428g9Arr2[length] = c0428g92;
                codedInputByteBufferNano.readMessage(c0428g92);
                this.f6261a = c0428g9Arr2;
            } else if (readTag == 34) {
                if (this.f6262b == null) {
                    this.f6262b = new C0299b9();
                }
                codedInputByteBufferNano.readMessage(this.f6262b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Y8[] y8Arr = this.f6263c;
                int length2 = y8Arr == null ? 0 : y8Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                Y8[] y8Arr2 = new Y8[i3];
                if (length2 != 0) {
                    System.arraycopy(y8Arr, 0, y8Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    Y8 y8 = new Y8();
                    y8Arr2[length2] = y8;
                    codedInputByteBufferNano.readMessage(y8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Y8 y82 = new Y8();
                y8Arr2[length2] = y82;
                codedInputByteBufferNano.readMessage(y82);
                this.f6263c = y8Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0454h9[] c0454h9Arr = this.f6264d;
                int length3 = c0454h9Arr == null ? 0 : c0454h9Arr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                C0454h9[] c0454h9Arr2 = new C0454h9[i4];
                if (length3 != 0) {
                    System.arraycopy(c0454h9Arr, 0, c0454h9Arr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    C0454h9 c0454h9 = new C0454h9();
                    c0454h9Arr2[length3] = c0454h9;
                    codedInputByteBufferNano.readMessage(c0454h9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0454h9 c0454h92 = new C0454h9();
                c0454h9Arr2[length3] = c0454h92;
                codedInputByteBufferNano.readMessage(c0454h92);
                this.f6264d = c0454h9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f6265e;
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
                this.f6265e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f6266f;
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
                this.f6266f = bArr2;
            }
        }
    }

    public static C0505j9 a(byte[] bArr) {
        return (C0505j9) MessageNano.mergeFrom(new C0505j9(), bArr);
    }
}
