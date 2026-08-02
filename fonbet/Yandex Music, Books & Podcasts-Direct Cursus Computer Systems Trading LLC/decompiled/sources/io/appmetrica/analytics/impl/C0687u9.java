package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0687u9 extends MessageNano {
    public static volatile C0687u9[] c;
    public C0398k9 a;
    public C0398k9[] b;

    public C0687u9() {
        a();
    }

    public static C0687u9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0687u9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0687u9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0398k9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0398k9[] c0398k9Arr = this.b;
                int length = c0398k9Arr == null ? 0 : c0398k9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0398k9[] c0398k9Arr2 = new C0398k9[i];
                if (length != 0) {
                    System.arraycopy(c0398k9Arr, 0, c0398k9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0398k9 c0398k9 = new C0398k9();
                    c0398k9Arr2[length] = c0398k9;
                    codedInputByteBufferNano.readMessage(c0398k9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0398k9 c0398k92 = new C0398k9();
                c0398k9Arr2[length] = c0398k92;
                codedInputByteBufferNano.readMessage(c0398k92);
                this.b = c0398k9Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0398k9 c0398k9 = this.a;
        if (c0398k9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0398k9);
        }
        C0398k9[] c0398k9Arr = this.b;
        if (c0398k9Arr != null && c0398k9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0398k9[] c0398k9Arr2 = this.b;
                if (i >= c0398k9Arr2.length) {
                    break;
                }
                C0398k9 c0398k92 = c0398k9Arr2[i];
                if (c0398k92 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0398k92) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0398k9 c0398k9 = this.a;
        if (c0398k9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0398k9);
        }
        C0398k9[] c0398k9Arr = this.b;
        if (c0398k9Arr != null && c0398k9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0398k9[] c0398k9Arr2 = this.b;
                if (i >= c0398k9Arr2.length) {
                    break;
                }
                C0398k9 c0398k92 = c0398k9Arr2[i];
                if (c0398k92 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0398k92);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0687u9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0687u9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0687u9 a() {
        this.a = null;
        this.b = C0398k9.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0687u9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0687u9) MessageNano.mergeFrom(new C0687u9(), bArr);
    }
}
