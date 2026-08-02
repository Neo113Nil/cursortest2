package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0982r1 extends MessageNano {
    public static volatile C0982r1[] c;
    public C0980q1[] a;
    public C0977p1[] b;

    public C0982r1() {
        a();
    }

    public static C0982r1[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0982r1[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0982r1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0980q1[] c0980q1Arr = this.a;
                int length = c0980q1Arr == null ? 0 : c0980q1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0980q1[] c0980q1Arr2 = new C0980q1[i];
                if (length != 0) {
                    System.arraycopy(c0980q1Arr, 0, c0980q1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0980q1 c0980q1 = new C0980q1();
                    c0980q1Arr2[length] = c0980q1;
                    codedInputByteBufferNano.readMessage(c0980q1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0980q1 c0980q12 = new C0980q1();
                c0980q1Arr2[length] = c0980q12;
                codedInputByteBufferNano.readMessage(c0980q12);
                this.a = c0980q1Arr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0977p1[] c0977p1Arr = this.b;
                int length2 = c0977p1Arr == null ? 0 : c0977p1Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C0977p1[] c0977p1Arr2 = new C0977p1[i2];
                if (length2 != 0) {
                    System.arraycopy(c0977p1Arr, 0, c0977p1Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C0977p1 c0977p1 = new C0977p1();
                    c0977p1Arr2[length2] = c0977p1;
                    codedInputByteBufferNano.readMessage(c0977p1);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0977p1 c0977p12 = new C0977p1();
                c0977p1Arr2[length2] = c0977p12;
                codedInputByteBufferNano.readMessage(c0977p12);
                this.b = c0977p1Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0980q1[] c0980q1Arr = this.a;
        int i = 0;
        if (c0980q1Arr != null && c0980q1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0980q1[] c0980q1Arr2 = this.a;
                if (i2 >= c0980q1Arr2.length) {
                    break;
                }
                C0980q1 c0980q1 = c0980q1Arr2[i2];
                if (c0980q1 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0980q1) + computeSerializedSize;
                }
                i2++;
            }
        }
        C0977p1[] c0977p1Arr = this.b;
        if (c0977p1Arr != null && c0977p1Arr.length > 0) {
            while (true) {
                C0977p1[] c0977p1Arr2 = this.b;
                if (i >= c0977p1Arr2.length) {
                    break;
                }
                C0977p1 c0977p1 = c0977p1Arr2[i];
                if (c0977p1 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0977p1) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0980q1[] c0980q1Arr = this.a;
        int i = 0;
        if (c0980q1Arr != null && c0980q1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0980q1[] c0980q1Arr2 = this.a;
                if (i2 >= c0980q1Arr2.length) {
                    break;
                }
                C0980q1 c0980q1 = c0980q1Arr2[i2];
                if (c0980q1 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0980q1);
                }
                i2++;
            }
        }
        C0977p1[] c0977p1Arr = this.b;
        if (c0977p1Arr != null && c0977p1Arr.length > 0) {
            while (true) {
                C0977p1[] c0977p1Arr2 = this.b;
                if (i >= c0977p1Arr2.length) {
                    break;
                }
                C0977p1 c0977p1 = c0977p1Arr2[i];
                if (c0977p1 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0977p1);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0982r1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0982r1().mergeFrom(codedInputByteBufferNano);
    }

    public final C0982r1 a() {
        this.a = C0980q1.b();
        this.b = C0977p1.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0982r1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0982r1) MessageNano.mergeFrom(new C0982r1(), bArr);
    }
}
