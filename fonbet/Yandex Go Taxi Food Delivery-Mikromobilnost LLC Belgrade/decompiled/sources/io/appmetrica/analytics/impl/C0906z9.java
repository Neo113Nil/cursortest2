package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0906z9 extends MessageNano {
    public static volatile C0906z9[] c;
    public C0877y9[] a;
    public int b;

    public C0906z9() {
        a();
    }

    public static C0906z9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0906z9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0906z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0877y9[] c0877y9Arr = this.a;
                int length = c0877y9Arr == null ? 0 : c0877y9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0877y9[] c0877y9Arr2 = new C0877y9[i];
                if (length != 0) {
                    System.arraycopy(c0877y9Arr, 0, c0877y9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0877y9 c0877y9 = new C0877y9();
                    c0877y9Arr2[length] = c0877y9;
                    codedInputByteBufferNano.readMessage(c0877y9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0877y9 c0877y92 = new C0877y9();
                c0877y9Arr2[length] = c0877y92;
                codedInputByteBufferNano.readMessage(c0877y92);
                this.a = c0877y9Arr2;
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0877y9[] c0877y9Arr = this.a;
        if (c0877y9Arr != null && c0877y9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0877y9[] c0877y9Arr2 = this.a;
                if (i >= c0877y9Arr2.length) {
                    break;
                }
                C0877y9 c0877y9 = c0877y9Arr2[i];
                if (c0877y9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0877y9) + computeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0877y9[] c0877y9Arr = this.a;
        if (c0877y9Arr != null && c0877y9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0877y9[] c0877y9Arr2 = this.a;
                if (i >= c0877y9Arr2.length) {
                    break;
                }
                C0877y9 c0877y9 = c0877y9Arr2[i];
                if (c0877y9 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0877y9);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0906z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0906z9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0906z9 a() {
        this.a = C0877y9.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public static C0906z9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0906z9) MessageNano.mergeFrom(new C0906z9(), bArr);
    }
}
