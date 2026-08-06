package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836w3 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0836w3[] f7088b;

    /* renamed from: a, reason: collision with root package name */
    public C0810v3[] f7089a;

    public C0836w3() {
        a();
    }

    public static C0836w3[] b() {
        if (f7088b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7088b == null) {
                        f7088b = new C0836w3[0];
                    }
                } finally {
                }
            }
        }
        return f7088b;
    }

    public final C0836w3 a() {
        this.f7089a = C0810v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0810v3[] c0810v3Arr = this.f7089a;
        if (c0810v3Arr != null && c0810v3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0810v3[] c0810v3Arr2 = this.f7089a;
                if (i2 >= c0810v3Arr2.length) {
                    break;
                }
                C0810v3 c0810v3 = c0810v3Arr2[i2];
                if (c0810v3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0810v3) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0810v3[] c0810v3Arr = this.f7089a;
        if (c0810v3Arr != null && c0810v3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0810v3[] c0810v3Arr2 = this.f7089a;
                if (i2 >= c0810v3Arr2.length) {
                    break;
                }
                C0810v3 c0810v3 = c0810v3Arr2[i2];
                if (c0810v3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0810v3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0836w3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0810v3[] c0810v3Arr = this.f7089a;
                int length = c0810v3Arr == null ? 0 : c0810v3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0810v3[] c0810v3Arr2 = new C0810v3[i2];
                if (length != 0) {
                    System.arraycopy(c0810v3Arr, 0, c0810v3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0810v3 c0810v3 = new C0810v3();
                    c0810v3Arr2[length] = c0810v3;
                    codedInputByteBufferNano.readMessage(c0810v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0810v3 c0810v32 = new C0810v3();
                c0810v3Arr2[length] = c0810v32;
                codedInputByteBufferNano.readMessage(c0810v32);
                this.f7089a = c0810v3Arr2;
            }
        }
    }

    public static C0836w3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0836w3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0836w3 a(byte[] bArr) {
        return (C0836w3) MessageNano.mergeFrom(new C0836w3(), bArr);
    }
}
