package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0451m4 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C0451m4[] g;
    public C0364j4 a;
    public C0364j4[] b;

    public C0451m4() {
        a();
    }

    public static C0451m4[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new C0451m4[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0451m4 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0364j4();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0364j4[] c0364j4Arr = this.b;
                int length = c0364j4Arr == null ? 0 : c0364j4Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0364j4[] c0364j4Arr2 = new C0364j4[i];
                if (length != 0) {
                    System.arraycopy(c0364j4Arr, 0, c0364j4Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0364j4 c0364j4 = new C0364j4();
                    c0364j4Arr2[length] = c0364j4;
                    codedInputByteBufferNano.readMessage(c0364j4);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0364j4 c0364j42 = new C0364j4();
                c0364j4Arr2[length] = c0364j42;
                codedInputByteBufferNano.readMessage(c0364j42);
                this.b = c0364j4Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0364j4 c0364j4 = this.a;
        if (c0364j4 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0364j4);
        }
        C0364j4[] c0364j4Arr = this.b;
        if (c0364j4Arr != null && c0364j4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0364j4[] c0364j4Arr2 = this.b;
                if (i >= c0364j4Arr2.length) {
                    break;
                }
                C0364j4 c0364j42 = c0364j4Arr2[i];
                if (c0364j42 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0364j42) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0364j4 c0364j4 = this.a;
        if (c0364j4 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0364j4);
        }
        C0364j4[] c0364j4Arr = this.b;
        if (c0364j4Arr != null && c0364j4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0364j4[] c0364j4Arr2 = this.b;
                if (i >= c0364j4Arr2.length) {
                    break;
                }
                C0364j4 c0364j42 = c0364j4Arr2[i];
                if (c0364j42 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0364j42);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0451m4 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0451m4().mergeFrom(codedInputByteBufferNano);
    }

    public final C0451m4 a() {
        this.a = null;
        this.b = C0364j4.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0451m4 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0451m4) MessageNano.mergeFrom(new C0451m4(), bArr);
    }
}
