package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class W6 extends MessageNano {
    public static volatile W6[] f;
    public String a;
    public String b;
    public U6[] c;
    public W6 d;
    public W6[] e;

    public W6() {
        a();
    }

    public static W6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new W6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                U6[] u6Arr = this.c;
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
                this.c = u6Arr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new W6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                W6[] w6Arr = this.e;
                int length2 = w6Arr == null ? 0 : w6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                W6[] w6Arr2 = new W6[i2];
                if (length2 != 0) {
                    System.arraycopy(w6Arr, 0, w6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    W6 w6 = new W6();
                    w6Arr2[length2] = w6;
                    codedInputByteBufferNano.readMessage(w6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                W6 w62 = new W6();
                w6Arr2[length2] = w62;
                codedInputByteBufferNano.readMessage(w62);
                this.e = w6Arr2;
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
        U6[] u6Arr = this.c;
        int i = 0;
        if (u6Arr != null && u6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                U6[] u6Arr2 = this.c;
                if (i2 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i2];
                if (u6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, u6) + computeStringSize;
                }
                i2++;
            }
        }
        W6 w6 = this.d;
        if (w6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, w6);
        }
        W6[] w6Arr = this.e;
        if (w6Arr != null && w6Arr.length > 0) {
            while (true) {
                W6[] w6Arr2 = this.e;
                if (i >= w6Arr2.length) {
                    break;
                }
                W6 w62 = w6Arr2[i];
                if (w62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, w62) + computeStringSize;
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
        U6[] u6Arr = this.c;
        int i = 0;
        if (u6Arr != null && u6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                U6[] u6Arr2 = this.c;
                if (i2 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i2];
                if (u6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, u6);
                }
                i2++;
            }
        }
        W6 w6 = this.d;
        if (w6 != null) {
            codedOutputByteBufferNano.writeMessage(4, w6);
        }
        W6[] w6Arr = this.e;
        if (w6Arr != null && w6Arr.length > 0) {
            while (true) {
                W6[] w6Arr2 = this.e;
                if (i >= w6Arr2.length) {
                    break;
                }
                W6 w62 = w6Arr2[i];
                if (w62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, w62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static W6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new W6().mergeFrom(codedInputByteBufferNano);
    }

    public final W6 a() {
        this.a = "";
        this.b = "";
        this.c = U6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    public static W6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (W6) MessageNano.mergeFrom(new W6(), bArr);
    }
}
