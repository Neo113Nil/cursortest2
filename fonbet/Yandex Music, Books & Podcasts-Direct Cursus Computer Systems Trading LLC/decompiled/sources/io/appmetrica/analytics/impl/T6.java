package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class T6 extends MessageNano {
    public static volatile T6[] f;
    public String a;
    public String b;
    public R6[] c;
    public T6 d;
    public T6[] e;

    public T6() {
        a();
    }

    public static T6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new T6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                R6[] r6Arr = this.c;
                int length = r6Arr == null ? 0 : r6Arr.length;
                int i = repeatedFieldArrayLength + length;
                R6[] r6Arr2 = new R6[i];
                if (length != 0) {
                    System.arraycopy(r6Arr, 0, r6Arr2, 0, length);
                }
                while (length < i - 1) {
                    R6 r6 = new R6();
                    r6Arr2[length] = r6;
                    codedInputByteBufferNano.readMessage(r6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                R6 r62 = new R6();
                r6Arr2[length] = r62;
                codedInputByteBufferNano.readMessage(r62);
                this.c = r6Arr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new T6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                T6[] t6Arr = this.e;
                int length2 = t6Arr == null ? 0 : t6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                T6[] t6Arr2 = new T6[i2];
                if (length2 != 0) {
                    System.arraycopy(t6Arr, 0, t6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    T6 t6 = new T6();
                    t6Arr2[length2] = t6;
                    codedInputByteBufferNano.readMessage(t6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                T6 t62 = new T6();
                t6Arr2[length2] = t62;
                codedInputByteBufferNano.readMessage(t62);
                this.e = t6Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        if (!this.b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        R6[] r6Arr = this.c;
        int i = 0;
        if (r6Arr != null && r6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                R6[] r6Arr2 = this.c;
                if (i2 >= r6Arr2.length) {
                    break;
                }
                R6 r6 = r6Arr2[i2];
                if (r6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, r6) + computeStringSize;
                }
                i2++;
            }
        }
        T6 t6 = this.d;
        if (t6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, t6);
        }
        T6[] t6Arr = this.e;
        if (t6Arr != null && t6Arr.length > 0) {
            while (true) {
                T6[] t6Arr2 = this.e;
                if (i >= t6Arr2.length) {
                    break;
                }
                T6 t62 = t6Arr2[i];
                if (t62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, t62) + computeStringSize;
                }
                i++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        R6[] r6Arr = this.c;
        int i = 0;
        if (r6Arr != null && r6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                R6[] r6Arr2 = this.c;
                if (i2 >= r6Arr2.length) {
                    break;
                }
                R6 r6 = r6Arr2[i2];
                if (r6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, r6);
                }
                i2++;
            }
        }
        T6 t6 = this.d;
        if (t6 != null) {
            codedOutputByteBufferNano.writeMessage(4, t6);
        }
        T6[] t6Arr = this.e;
        if (t6Arr != null && t6Arr.length > 0) {
            while (true) {
                T6[] t6Arr2 = this.e;
                if (i >= t6Arr2.length) {
                    break;
                }
                T6 t62 = t6Arr2[i];
                if (t62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, t62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static T6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T6().mergeFrom(codedInputByteBufferNano);
    }

    public final T6 a() {
        this.a = "";
        this.b = "";
        this.c = R6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    public static T6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T6) MessageNano.mergeFrom(new T6(), bArr);
    }
}
