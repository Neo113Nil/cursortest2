package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0185aa extends MessageNano {
    public static volatile C0185aa[] b;
    public Z9[] a;

    public C0185aa() {
        a();
    }

    public static C0185aa[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0185aa[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0185aa mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Z9[] z9Arr = this.a;
                int length = z9Arr == null ? 0 : z9Arr.length;
                int i = repeatedFieldArrayLength + length;
                Z9[] z9Arr2 = new Z9[i];
                if (length != 0) {
                    System.arraycopy(z9Arr, 0, z9Arr2, 0, length);
                }
                while (length < i - 1) {
                    Z9 z9 = new Z9();
                    z9Arr2[length] = z9;
                    codedInputByteBufferNano.readMessage(z9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Z9 z92 = new Z9();
                z9Arr2[length] = z92;
                codedInputByteBufferNano.readMessage(z92);
                this.a = z9Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Z9[] z9Arr = this.a;
        if (z9Arr != null && z9Arr.length > 0) {
            int i = 0;
            while (true) {
                Z9[] z9Arr2 = this.a;
                if (i >= z9Arr2.length) {
                    break;
                }
                Z9 z9 = z9Arr2[i];
                if (z9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, z9) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Z9[] z9Arr = this.a;
        if (z9Arr != null && z9Arr.length > 0) {
            int i = 0;
            while (true) {
                Z9[] z9Arr2 = this.a;
                if (i >= z9Arr2.length) {
                    break;
                }
                Z9 z9 = z9Arr2[i];
                if (z9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, z9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0185aa b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0185aa().mergeFrom(codedInputByteBufferNano);
    }

    public final C0185aa a() {
        this.a = Z9.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0185aa a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0185aa) MessageNano.mergeFrom(new C0185aa(), bArr);
    }
}
