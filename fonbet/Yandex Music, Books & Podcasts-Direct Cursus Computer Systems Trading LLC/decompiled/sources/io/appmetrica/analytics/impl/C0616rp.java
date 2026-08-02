package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0616rp extends MessageNano {
    public static volatile C0616rp[] b;
    public C0588qp[] a;

    public C0616rp() {
        a();
    }

    public static C0616rp[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0616rp[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0616rp mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0588qp[] c0588qpArr = this.a;
                int length = c0588qpArr == null ? 0 : c0588qpArr.length;
                int i = repeatedFieldArrayLength + length;
                C0588qp[] c0588qpArr2 = new C0588qp[i];
                if (length != 0) {
                    System.arraycopy(c0588qpArr, 0, c0588qpArr2, 0, length);
                }
                while (length < i - 1) {
                    C0588qp c0588qp = new C0588qp();
                    c0588qpArr2[length] = c0588qp;
                    codedInputByteBufferNano.readMessage(c0588qp);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0588qp c0588qp2 = new C0588qp();
                c0588qpArr2[length] = c0588qp2;
                codedInputByteBufferNano.readMessage(c0588qp2);
                this.a = c0588qpArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0588qp[] c0588qpArr = this.a;
        if (c0588qpArr != null && c0588qpArr.length > 0) {
            int i = 0;
            while (true) {
                C0588qp[] c0588qpArr2 = this.a;
                if (i >= c0588qpArr2.length) {
                    break;
                }
                C0588qp c0588qp = c0588qpArr2[i];
                if (c0588qp != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0588qp) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0588qp[] c0588qpArr = this.a;
        if (c0588qpArr != null && c0588qpArr.length > 0) {
            int i = 0;
            while (true) {
                C0588qp[] c0588qpArr2 = this.a;
                if (i >= c0588qpArr2.length) {
                    break;
                }
                C0588qp c0588qp = c0588qpArr2[i];
                if (c0588qp != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0588qp);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0616rp b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0616rp().mergeFrom(codedInputByteBufferNano);
    }

    public final C0616rp a() {
        this.a = C0588qp.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0616rp a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0616rp) MessageNano.mergeFrom(new C0616rp(), bArr);
    }
}
