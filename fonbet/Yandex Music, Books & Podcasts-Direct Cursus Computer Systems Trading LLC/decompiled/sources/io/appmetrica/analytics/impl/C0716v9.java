package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0716v9 extends MessageNano {
    public static volatile C0716v9[] h;
    public byte[] a;
    public byte[] b;
    public C0485n9 c;
    public C0658t9 d;
    public C0687u9 e;
    public C0687u9 f;
    public C0745w9[] g;

    public C0716v9() {
        a();
    }

    public static C0716v9[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C0716v9[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0716v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.c = new C0485n9();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C0658t9();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                if (this.e == null) {
                    this.e = new C0687u9();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (readTag == 50) {
                if (this.f == null) {
                    this.f = new C0687u9();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0745w9[] c0745w9Arr = this.g;
                int length = c0745w9Arr == null ? 0 : c0745w9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0745w9[] c0745w9Arr2 = new C0745w9[i];
                if (length != 0) {
                    System.arraycopy(c0745w9Arr, 0, c0745w9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0745w9 c0745w9 = new C0745w9();
                    c0745w9Arr2[length] = c0745w9;
                    codedInputByteBufferNano.readMessage(c0745w9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0745w9 c0745w92 = new C0745w9();
                c0745w9Arr2[length] = c0745w92;
                codedInputByteBufferNano.readMessage(c0745w92);
                this.g = c0745w9Arr2;
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
        C0485n9 c0485n9 = this.c;
        if (c0485n9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0485n9);
        }
        C0658t9 c0658t9 = this.d;
        if (c0658t9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0658t9);
        }
        C0687u9 c0687u9 = this.e;
        if (c0687u9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0687u9);
        }
        C0687u9 c0687u92 = this.f;
        if (c0687u92 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0687u92);
        }
        C0745w9[] c0745w9Arr = this.g;
        if (c0745w9Arr != null && c0745w9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0745w9[] c0745w9Arr2 = this.g;
                if (i >= c0745w9Arr2.length) {
                    break;
                }
                C0745w9 c0745w9 = c0745w9Arr2[i];
                if (c0745w9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0745w9) + computeSerializedSize;
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
        C0485n9 c0485n9 = this.c;
        if (c0485n9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0485n9);
        }
        C0658t9 c0658t9 = this.d;
        if (c0658t9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0658t9);
        }
        C0687u9 c0687u9 = this.e;
        if (c0687u9 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0687u9);
        }
        C0687u9 c0687u92 = this.f;
        if (c0687u92 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0687u92);
        }
        C0745w9[] c0745w9Arr = this.g;
        if (c0745w9Arr != null && c0745w9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0745w9[] c0745w9Arr2 = this.g;
                if (i >= c0745w9Arr2.length) {
                    break;
                }
                C0745w9 c0745w9 = c0745w9Arr2[i];
                if (c0745w9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0745w9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0716v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0716v9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0716v9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = C0745w9.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0716v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0716v9) MessageNano.mergeFrom(new C0716v9(), bArr);
    }
}
