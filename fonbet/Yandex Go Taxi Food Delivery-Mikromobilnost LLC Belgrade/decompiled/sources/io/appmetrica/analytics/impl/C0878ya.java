package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0878ya extends MessageNano {
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static volatile C0878ya[] j;
    public C0791va[] a;
    public C0647qa b;
    public C0560na[] c;
    public C0820wa[] d;
    public String[] e;
    public byte[][] f;

    public C0878ya() {
        a();
    }

    public static C0878ya[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new C0878ya[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0878ya mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0791va[] c0791vaArr = this.a;
                int length = c0791vaArr == null ? 0 : c0791vaArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0791va[] c0791vaArr2 = new C0791va[i2];
                if (length != 0) {
                    System.arraycopy(c0791vaArr, 0, c0791vaArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0791va c0791va = new C0791va();
                    c0791vaArr2[length] = c0791va;
                    codedInputByteBufferNano.readMessage(c0791va);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0791va c0791va2 = new C0791va();
                c0791vaArr2[length] = c0791va2;
                codedInputByteBufferNano.readMessage(c0791va2);
                this.a = c0791vaArr2;
            } else if (readTag == 34) {
                if (this.b == null) {
                    this.b = new C0647qa();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0560na[] c0560naArr = this.c;
                int length2 = c0560naArr == null ? 0 : c0560naArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C0560na[] c0560naArr2 = new C0560na[i3];
                if (length2 != 0) {
                    System.arraycopy(c0560naArr, 0, c0560naArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C0560na c0560na = new C0560na();
                    c0560naArr2[length2] = c0560na;
                    codedInputByteBufferNano.readMessage(c0560na);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0560na c0560na2 = new C0560na();
                c0560naArr2[length2] = c0560na2;
                codedInputByteBufferNano.readMessage(c0560na2);
                this.c = c0560naArr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0820wa[] c0820waArr = this.d;
                int length3 = c0820waArr == null ? 0 : c0820waArr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                C0820wa[] c0820waArr2 = new C0820wa[i4];
                if (length3 != 0) {
                    System.arraycopy(c0820waArr, 0, c0820waArr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    C0820wa c0820wa = new C0820wa();
                    c0820waArr2[length3] = c0820wa;
                    codedInputByteBufferNano.readMessage(c0820wa);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0820wa c0820wa2 = new C0820wa();
                c0820waArr2[length3] = c0820wa2;
                codedInputByteBufferNano.readMessage(c0820wa2);
                this.d = c0820waArr2;
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
        C0791va[] c0791vaArr = this.a;
        int i2 = 0;
        if (c0791vaArr != null && c0791vaArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0791va[] c0791vaArr2 = this.a;
                if (i3 >= c0791vaArr2.length) {
                    break;
                }
                C0791va c0791va = c0791vaArr2[i3];
                if (c0791va != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0791va) + computeSerializedSize;
                }
                i3++;
            }
        }
        C0647qa c0647qa = this.b;
        if (c0647qa != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0647qa);
        }
        C0560na[] c0560naArr = this.c;
        if (c0560naArr != null && c0560naArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0560na[] c0560naArr2 = this.c;
                if (i4 >= c0560naArr2.length) {
                    break;
                }
                C0560na c0560na = c0560naArr2[i4];
                if (c0560na != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0560na) + computeSerializedSize;
                }
                i4++;
            }
        }
        C0820wa[] c0820waArr = this.d;
        if (c0820waArr != null && c0820waArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0820wa[] c0820waArr2 = this.d;
                if (i5 >= c0820waArr2.length) {
                    break;
                }
                C0820wa c0820wa = c0820waArr2[i5];
                if (c0820wa != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0820wa) + computeSerializedSize;
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
        C0791va[] c0791vaArr = this.a;
        int i2 = 0;
        if (c0791vaArr != null && c0791vaArr.length > 0) {
            int i3 = 0;
            while (true) {
                C0791va[] c0791vaArr2 = this.a;
                if (i3 >= c0791vaArr2.length) {
                    break;
                }
                C0791va c0791va = c0791vaArr2[i3];
                if (c0791va != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0791va);
                }
                i3++;
            }
        }
        C0647qa c0647qa = this.b;
        if (c0647qa != null) {
            codedOutputByteBufferNano.writeMessage(4, c0647qa);
        }
        C0560na[] c0560naArr = this.c;
        if (c0560naArr != null && c0560naArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0560na[] c0560naArr2 = this.c;
                if (i4 >= c0560naArr2.length) {
                    break;
                }
                C0560na c0560na = c0560naArr2[i4];
                if (c0560na != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0560na);
                }
                i4++;
            }
        }
        C0820wa[] c0820waArr = this.d;
        if (c0820waArr != null && c0820waArr.length > 0) {
            int i5 = 0;
            while (true) {
                C0820wa[] c0820waArr2 = this.d;
                if (i5 >= c0820waArr2.length) {
                    break;
                }
                C0820wa c0820wa = c0820waArr2[i5];
                if (c0820wa != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0820wa);
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

    public static C0878ya b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0878ya().mergeFrom(codedInputByteBufferNano);
    }

    public final C0878ya a() {
        this.a = C0791va.b();
        this.b = null;
        this.c = C0560na.b();
        this.d = C0820wa.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public static C0878ya a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0878ya) MessageNano.mergeFrom(new C0878ya(), bArr);
    }
}
