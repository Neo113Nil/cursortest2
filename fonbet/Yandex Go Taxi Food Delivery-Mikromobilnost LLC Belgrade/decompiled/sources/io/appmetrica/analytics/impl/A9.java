package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class A9 extends MessageNano {
    public static volatile A9[] c;
    public C0646q9 a;
    public C0646q9[] b;

    public A9() {
        a();
    }

    public static A9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new A9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0646q9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0646q9[] c0646q9Arr = this.b;
                int length = c0646q9Arr == null ? 0 : c0646q9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0646q9[] c0646q9Arr2 = new C0646q9[i];
                if (length != 0) {
                    System.arraycopy(c0646q9Arr, 0, c0646q9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0646q9 c0646q9 = new C0646q9();
                    c0646q9Arr2[length] = c0646q9;
                    codedInputByteBufferNano.readMessage(c0646q9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0646q9 c0646q92 = new C0646q9();
                c0646q9Arr2[length] = c0646q92;
                codedInputByteBufferNano.readMessage(c0646q92);
                this.b = c0646q9Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0646q9 c0646q9 = this.a;
        if (c0646q9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0646q9);
        }
        C0646q9[] c0646q9Arr = this.b;
        if (c0646q9Arr != null && c0646q9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0646q9[] c0646q9Arr2 = this.b;
                if (i >= c0646q9Arr2.length) {
                    break;
                }
                C0646q9 c0646q92 = c0646q9Arr2[i];
                if (c0646q92 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0646q92) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0646q9 c0646q9 = this.a;
        if (c0646q9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0646q9);
        }
        C0646q9[] c0646q9Arr = this.b;
        if (c0646q9Arr != null && c0646q9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0646q9[] c0646q9Arr2 = this.b;
                if (i >= c0646q9Arr2.length) {
                    break;
                }
                C0646q9 c0646q92 = c0646q9Arr2[i];
                if (c0646q92 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0646q92);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static A9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A9().mergeFrom(codedInputByteBufferNano);
    }

    public final A9 a() {
        this.a = null;
        this.b = C0646q9.b();
        this.cachedSize = -1;
        return this;
    }

    public static A9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (A9) MessageNano.mergeFrom(new A9(), bArr);
    }
}
