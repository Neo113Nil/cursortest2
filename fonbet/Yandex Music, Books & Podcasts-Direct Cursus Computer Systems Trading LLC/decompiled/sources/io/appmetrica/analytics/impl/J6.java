package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class J6 extends MessageNano {
    public static volatile J6[] d;
    public S6 a;
    public S6[] b;
    public String c;

    public J6() {
        a();
    }

    public static J6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new J6[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new S6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                S6[] s6Arr = this.b;
                int length = s6Arr == null ? 0 : s6Arr.length;
                int i = repeatedFieldArrayLength + length;
                S6[] s6Arr2 = new S6[i];
                if (length != 0) {
                    System.arraycopy(s6Arr, 0, s6Arr2, 0, length);
                }
                while (length < i - 1) {
                    S6 s6 = new S6();
                    s6Arr2[length] = s6;
                    codedInputByteBufferNano.readMessage(s6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                S6 s62 = new S6();
                s6Arr2[length] = s62;
                codedInputByteBufferNano.readMessage(s62);
                this.b = s6Arr2;
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
        S6 s6 = this.a;
        if (s6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, s6);
        }
        S6[] s6Arr = this.b;
        if (s6Arr != null && s6Arr.length > 0) {
            int i = 0;
            while (true) {
                S6[] s6Arr2 = this.b;
                if (i >= s6Arr2.length) {
                    break;
                }
                S6 s62 = s6Arr2[i];
                if (s62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, s62) + computeSerializedSize;
                }
                i++;
            }
        }
        return !this.c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        S6 s6 = this.a;
        if (s6 != null) {
            codedOutputByteBufferNano.writeMessage(1, s6);
        }
        S6[] s6Arr = this.b;
        if (s6Arr != null && s6Arr.length > 0) {
            int i = 0;
            while (true) {
                S6[] s6Arr2 = this.b;
                if (i >= s6Arr2.length) {
                    break;
                }
                S6 s62 = s6Arr2[i];
                if (s62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, s62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static J6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J6().mergeFrom(codedInputByteBufferNano);
    }

    public final J6 a() {
        this.a = null;
        this.b = S6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    public static J6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (J6) MessageNano.mergeFrom(new J6(), bArr);
    }
}
