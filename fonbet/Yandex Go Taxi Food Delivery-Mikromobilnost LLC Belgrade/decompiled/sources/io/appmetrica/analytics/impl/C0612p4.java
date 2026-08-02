package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0612p4 extends MessageNano {
    public static volatile C0612p4[] b;
    public C0583o4[] a;

    public C0612p4() {
        a();
    }

    public static C0612p4[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0612p4[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0612p4 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0583o4[] c0583o4Arr = this.a;
                int length = c0583o4Arr == null ? 0 : c0583o4Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0583o4[] c0583o4Arr2 = new C0583o4[i];
                if (length != 0) {
                    System.arraycopy(c0583o4Arr, 0, c0583o4Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0583o4 c0583o4 = new C0583o4();
                    c0583o4Arr2[length] = c0583o4;
                    codedInputByteBufferNano.readMessage(c0583o4);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0583o4 c0583o42 = new C0583o4();
                c0583o4Arr2[length] = c0583o42;
                codedInputByteBufferNano.readMessage(c0583o42);
                this.a = c0583o4Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0583o4[] c0583o4Arr = this.a;
        if (c0583o4Arr != null && c0583o4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0583o4[] c0583o4Arr2 = this.a;
                if (i >= c0583o4Arr2.length) {
                    break;
                }
                C0583o4 c0583o4 = c0583o4Arr2[i];
                if (c0583o4 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0583o4) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0583o4[] c0583o4Arr = this.a;
        if (c0583o4Arr != null && c0583o4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0583o4[] c0583o4Arr2 = this.a;
                if (i >= c0583o4Arr2.length) {
                    break;
                }
                C0583o4 c0583o4 = c0583o4Arr2[i];
                if (c0583o4 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0583o4);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0612p4 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0612p4().mergeFrom(codedInputByteBufferNano);
    }

    public final C0612p4 a() {
        this.a = C0583o4.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0612p4 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0612p4) MessageNano.mergeFrom(new C0612p4(), bArr);
    }
}
