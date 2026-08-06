package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class L8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile L8[] f4689b;

    /* renamed from: a, reason: collision with root package name */
    public K8[] f4690a;

    public L8() {
        a();
    }

    public static L8[] b() {
        if (f4689b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4689b == null) {
                        f4689b = new L8[0];
                    }
                } finally {
                }
            }
        }
        return f4689b;
    }

    public final L8 a() {
        this.f4690a = K8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        K8[] k8Arr = this.f4690a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                K8[] k8Arr2 = this.f4690a;
                if (i2 >= k8Arr2.length) {
                    break;
                }
                K8 k8 = k8Arr2[i2];
                if (k8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, k8) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        K8[] k8Arr = this.f4690a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                K8[] k8Arr2 = this.f4690a;
                if (i2 >= k8Arr2.length) {
                    break;
                }
                K8 k8 = k8Arr2[i2];
                if (k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, k8);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                K8[] k8Arr = this.f4690a;
                int length = k8Arr == null ? 0 : k8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                K8[] k8Arr2 = new K8[i2];
                if (length != 0) {
                    System.arraycopy(k8Arr, 0, k8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    K8 k8 = new K8();
                    k8Arr2[length] = k8;
                    codedInputByteBufferNano.readMessage(k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                K8 k82 = new K8();
                k8Arr2[length] = k82;
                codedInputByteBufferNano.readMessage(k82);
                this.f4690a = k8Arr2;
            }
        }
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new L8().mergeFrom(codedInputByteBufferNano);
    }

    public static L8 a(byte[] bArr) {
        return (L8) MessageNano.mergeFrom(new L8(), bArr);
    }
}
