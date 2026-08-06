package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class X1 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile X1[] f5342d;

    /* renamed from: a, reason: collision with root package name */
    public W1[] f5343a;

    /* renamed from: b, reason: collision with root package name */
    public V1 f5344b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f5345c;

    public X1() {
        a();
    }

    public static X1[] b() {
        if (f5342d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5342d == null) {
                        f5342d = new X1[0];
                    }
                } finally {
                }
            }
        }
        return f5342d;
    }

    public final X1 a() {
        this.f5343a = W1.b();
        this.f5344b = null;
        this.f5345c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        W1[] w1Arr = this.f5343a;
        int i2 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i3 = 0;
            while (true) {
                W1[] w1Arr2 = this.f5343a;
                if (i3 >= w1Arr2.length) {
                    break;
                }
                W1 w12 = w1Arr2[i3];
                if (w12 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, w12) + computeSerializedSize;
                }
                i3++;
            }
        }
        V1 v12 = this.f5344b;
        if (v12 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, v12);
        }
        String[] strArr = this.f5345c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f5345c;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i4 + i5;
            }
            String str = strArr2[i2];
            if (str != null) {
                i5++;
                i4 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i4;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        W1[] w1Arr = this.f5343a;
        int i2 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i3 = 0;
            while (true) {
                W1[] w1Arr2 = this.f5343a;
                if (i3 >= w1Arr2.length) {
                    break;
                }
                W1 w12 = w1Arr2[i3];
                if (w12 != null) {
                    codedOutputByteBufferNano.writeMessage(1, w12);
                }
                i3++;
            }
        }
        V1 v12 = this.f5344b;
        if (v12 != null) {
            codedOutputByteBufferNano.writeMessage(2, v12);
        }
        String[] strArr = this.f5345c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f5345c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                W1[] w1Arr = this.f5343a;
                int length = w1Arr == null ? 0 : w1Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                W1[] w1Arr2 = new W1[i2];
                if (length != 0) {
                    System.arraycopy(w1Arr, 0, w1Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    W1 w12 = new W1();
                    w1Arr2[length] = w12;
                    codedInputByteBufferNano.readMessage(w12);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                W1 w13 = new W1();
                w1Arr2[length] = w13;
                codedInputByteBufferNano.readMessage(w13);
                this.f5343a = w1Arr2;
            } else if (readTag == 18) {
                if (this.f5344b == null) {
                    this.f5344b = new V1();
                }
                codedInputByteBufferNano.readMessage(this.f5344b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f5345c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i3];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f5345c = strArr2;
            }
        }
    }

    public static X1 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new X1().mergeFrom(codedInputByteBufferNano);
    }

    public static X1 a(byte[] bArr) {
        return (X1) MessageNano.mergeFrom(new X1(), bArr);
    }
}
