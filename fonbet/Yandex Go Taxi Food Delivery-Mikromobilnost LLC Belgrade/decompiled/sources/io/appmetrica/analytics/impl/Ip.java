package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Ip extends MessageNano {
    public static volatile Ip[] c;
    public String a;
    public Hp b;

    public Ip() {
        a();
    }

    public static Ip[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new Ip[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ip mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new Hp();
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
        Hp hp = this.b;
        return hp != null ? CodedOutputByteBufferNano.computeMessageSize(2, hp) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        Hp hp = this.b;
        if (hp != null) {
            codedOutputByteBufferNano.writeMessage(2, hp);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ip b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ip().mergeFrom(codedInputByteBufferNano);
    }

    public final Ip a() {
        this.a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static Ip a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Ip) MessageNano.mergeFrom(new Ip(), bArr);
    }
}
