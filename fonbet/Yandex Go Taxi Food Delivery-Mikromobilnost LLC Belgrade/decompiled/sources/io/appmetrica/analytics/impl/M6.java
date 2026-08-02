package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class M6 extends MessageNano {
    public static volatile M6[] d;
    public V6 a;
    public V6[] b;
    public String c;

    public M6() {
        a();
    }

    public static M6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new M6[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new V6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                V6[] v6Arr = this.b;
                int length = v6Arr == null ? 0 : v6Arr.length;
                int i = repeatedFieldArrayLength + length;
                V6[] v6Arr2 = new V6[i];
                if (length != 0) {
                    System.arraycopy(v6Arr, 0, v6Arr2, 0, length);
                }
                while (length < i - 1) {
                    V6 v6 = new V6();
                    v6Arr2[length] = v6;
                    codedInputByteBufferNano.readMessage(v6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                V6 v62 = new V6();
                v6Arr2[length] = v62;
                codedInputByteBufferNano.readMessage(v62);
                this.b = v6Arr2;
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        V6 v6 = this.a;
        if (v6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, v6);
        }
        V6[] v6Arr = this.b;
        if (v6Arr != null && v6Arr.length > 0) {
            int i = 0;
            while (true) {
                V6[] v6Arr2 = this.b;
                if (i >= v6Arr2.length) {
                    break;
                }
                V6 v62 = v6Arr2[i];
                if (v62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, v62) + computeSerializedSize;
                }
                i++;
            }
        }
        return !this.c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        V6 v6 = this.a;
        if (v6 != null) {
            codedOutputByteBufferNano.writeMessage(1, v6);
        }
        V6[] v6Arr = this.b;
        if (v6Arr != null && v6Arr.length > 0) {
            int i = 0;
            while (true) {
                V6[] v6Arr2 = this.b;
                if (i >= v6Arr2.length) {
                    break;
                }
                V6 v62 = v6Arr2[i];
                if (v62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, v62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static M6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M6().mergeFrom(codedInputByteBufferNano);
    }

    public final M6 a() {
        this.a = null;
        this.b = V6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    public static M6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (M6) MessageNano.mergeFrom(new M6(), bArr);
    }
}
