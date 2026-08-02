package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class B9 extends MessageNano {
    public static volatile B9[] h;
    public byte[] a;
    public byte[] b;
    public C0732t9 c;
    public C0906z9 d;
    public A9 e;
    public A9 f;
    public C9[] g;

    public B9() {
        a();
    }

    public static B9[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new B9[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0732t9();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C0906z9();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                if (this.e == null) {
                    this.e = new A9();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (readTag == 50) {
                if (this.f == null) {
                    this.f = new A9();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C9[] c9Arr = this.g;
                int length = c9Arr == null ? 0 : c9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9[] c9Arr2 = new C9[i];
                if (length != 0) {
                    System.arraycopy(c9Arr, 0, c9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9 c9 = new C9();
                    c9Arr2[length] = c9;
                    codedInputByteBufferNano.readMessage(c9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9 c92 = new C9();
                c9Arr2[length] = c92;
                codedInputByteBufferNano.readMessage(c92);
                this.g = c9Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C0732t9 c0732t9 = this.c;
        if (c0732t9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0732t9);
        }
        C0906z9 c0906z9 = this.d;
        if (c0906z9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0906z9);
        }
        A9 a9 = this.e;
        if (a9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, a9);
        }
        A9 a92 = this.f;
        if (a92 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, a92);
        }
        C9[] c9Arr = this.g;
        if (c9Arr != null && c9Arr.length > 0) {
            int i = 0;
            while (true) {
                C9[] c9Arr2 = this.g;
                if (i >= c9Arr2.length) {
                    break;
                }
                C9 c9 = c9Arr2[i];
                if (c9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c9) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C0732t9 c0732t9 = this.c;
        if (c0732t9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0732t9);
        }
        C0906z9 c0906z9 = this.d;
        if (c0906z9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0906z9);
        }
        A9 a9 = this.e;
        if (a9 != null) {
            codedOutputByteBufferNano.writeMessage(5, a9);
        }
        A9 a92 = this.f;
        if (a92 != null) {
            codedOutputByteBufferNano.writeMessage(6, a92);
        }
        C9[] c9Arr = this.g;
        if (c9Arr != null && c9Arr.length > 0) {
            int i = 0;
            while (true) {
                C9[] c9Arr2 = this.g;
                if (i >= c9Arr2.length) {
                    break;
                }
                C9 c9 = c9Arr2[i];
                if (c9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().mergeFrom(codedInputByteBufferNano);
    }

    public final B9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = C9.b();
        this.cachedSize = -1;
        return this;
    }

    public static B9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (B9) MessageNano.mergeFrom(new B9(), bArr);
    }
}
