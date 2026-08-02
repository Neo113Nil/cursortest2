package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Lr extends MessageNano {
    public static volatile Lr[] b;
    public Ir[] a;

    public Lr() {
        a();
    }

    public static Lr[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Lr[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lr mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Ir[] irArr = this.a;
                int length = irArr == null ? 0 : irArr.length;
                int i = repeatedFieldArrayLength + length;
                Ir[] irArr2 = new Ir[i];
                if (length != 0) {
                    System.arraycopy(irArr, 0, irArr2, 0, length);
                }
                while (length < i - 1) {
                    Ir ir = new Ir();
                    irArr2[length] = ir;
                    codedInputByteBufferNano.readMessage(ir);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Ir ir2 = new Ir();
                irArr2[length] = ir2;
                codedInputByteBufferNano.readMessage(ir2);
                this.a = irArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ir[] irArr = this.a;
        if (irArr != null && irArr.length > 0) {
            int i = 0;
            while (true) {
                Ir[] irArr2 = this.a;
                if (i >= irArr2.length) {
                    break;
                }
                Ir ir = irArr2[i];
                if (ir != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, ir) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Ir[] irArr = this.a;
        if (irArr != null && irArr.length > 0) {
            int i = 0;
            while (true) {
                Ir[] irArr2 = this.a;
                if (i >= irArr2.length) {
                    break;
                }
                Ir ir = irArr2[i];
                if (ir != null) {
                    codedOutputByteBufferNano.writeMessage(1, ir);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Lr b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Lr().mergeFrom(codedInputByteBufferNano);
    }

    public final Lr a() {
        this.a = Ir.b();
        this.cachedSize = -1;
        return this;
    }

    public static Lr a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Lr) MessageNano.mergeFrom(new Lr(), bArr);
    }
}
