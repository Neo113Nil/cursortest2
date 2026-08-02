package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Zh extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile Zh[] g;
    public Xh a;
    public Yh[] b;

    public Zh() {
        a();
    }

    public static Zh[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new Zh[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Zh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new Xh();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Yh[] yhArr = this.b;
                int length = yhArr == null ? 0 : yhArr.length;
                int i = repeatedFieldArrayLength + length;
                Yh[] yhArr2 = new Yh[i];
                if (length != 0) {
                    System.arraycopy(yhArr, 0, yhArr2, 0, length);
                }
                while (length < i - 1) {
                    Yh yh = new Yh();
                    yhArr2[length] = yh;
                    codedInputByteBufferNano.readMessage(yh);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Yh yh2 = new Yh();
                yhArr2[length] = yh2;
                codedInputByteBufferNano.readMessage(yh2);
                this.b = yhArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Xh xh = this.a;
        if (xh != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, xh);
        }
        Yh[] yhArr = this.b;
        if (yhArr != null && yhArr.length > 0) {
            int i = 0;
            while (true) {
                Yh[] yhArr2 = this.b;
                if (i >= yhArr2.length) {
                    break;
                }
                Yh yh = yhArr2[i];
                if (yh != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, yh) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Xh xh = this.a;
        if (xh != null) {
            codedOutputByteBufferNano.writeMessage(1, xh);
        }
        Yh[] yhArr = this.b;
        if (yhArr != null && yhArr.length > 0) {
            int i = 0;
            while (true) {
                Yh[] yhArr2 = this.b;
                if (i >= yhArr2.length) {
                    break;
                }
                Yh yh = yhArr2[i];
                if (yh != null) {
                    codedOutputByteBufferNano.writeMessage(2, yh);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Zh b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Zh().mergeFrom(codedInputByteBufferNano);
    }

    public final Zh a() {
        this.a = null;
        this.b = Yh.b();
        this.cachedSize = -1;
        return this;
    }

    public static Zh a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Zh) MessageNano.mergeFrom(new Zh(), bArr);
    }
}
