package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.qp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0588qp extends MessageNano {
    public static volatile C0588qp[] c;
    public String a;
    public C0559pp b;

    public C0588qp() {
        a();
    }

    public static C0588qp[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0588qp[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0588qp mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0559pp();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        C0559pp c0559pp = this.b;
        return c0559pp != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0559pp) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        C0559pp c0559pp = this.b;
        if (c0559pp != null) {
            codedOutputByteBufferNano.writeMessage(2, c0559pp);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0588qp b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0588qp().mergeFrom(codedInputByteBufferNano);
    }

    public final C0588qp a() {
        this.a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0588qp a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0588qp) MessageNano.mergeFrom(new C0588qp(), bArr);
    }
}
