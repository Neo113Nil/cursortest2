package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0641q4 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C0641q4[] g;
    public C0554n4 a;
    public C0554n4[] b;

    public C0641q4() {
        a();
    }

    public static C0641q4[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new C0641q4[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0641q4 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0554n4();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0554n4[] c0554n4Arr = this.b;
                int length = c0554n4Arr == null ? 0 : c0554n4Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0554n4[] c0554n4Arr2 = new C0554n4[i];
                if (length != 0) {
                    System.arraycopy(c0554n4Arr, 0, c0554n4Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0554n4 c0554n4 = new C0554n4();
                    c0554n4Arr2[length] = c0554n4;
                    codedInputByteBufferNano.readMessage(c0554n4);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0554n4 c0554n42 = new C0554n4();
                c0554n4Arr2[length] = c0554n42;
                codedInputByteBufferNano.readMessage(c0554n42);
                this.b = c0554n4Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0554n4 c0554n4 = this.a;
        if (c0554n4 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0554n4);
        }
        C0554n4[] c0554n4Arr = this.b;
        if (c0554n4Arr != null && c0554n4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0554n4[] c0554n4Arr2 = this.b;
                if (i >= c0554n4Arr2.length) {
                    break;
                }
                C0554n4 c0554n42 = c0554n4Arr2[i];
                if (c0554n42 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0554n42) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0554n4 c0554n4 = this.a;
        if (c0554n4 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0554n4);
        }
        C0554n4[] c0554n4Arr = this.b;
        if (c0554n4Arr != null && c0554n4Arr.length > 0) {
            int i = 0;
            while (true) {
                C0554n4[] c0554n4Arr2 = this.b;
                if (i >= c0554n4Arr2.length) {
                    break;
                }
                C0554n4 c0554n42 = c0554n4Arr2[i];
                if (c0554n42 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0554n42);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0641q4 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0641q4().mergeFrom(codedInputByteBufferNano);
    }

    public final C0641q4 a() {
        this.a = null;
        this.b = C0554n4.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0641q4 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0641q4) MessageNano.mergeFrom(new C0641q4(), bArr);
    }
}
