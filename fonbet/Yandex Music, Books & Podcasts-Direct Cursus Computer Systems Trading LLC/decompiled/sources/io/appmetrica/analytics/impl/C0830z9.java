package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0830z9 extends MessageNano {
    public static volatile C0830z9[] c;
    public C0716v9 a;
    public C0802y9 b;

    public C0830z9() {
        a();
    }

    public static C0830z9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0830z9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0830z9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0716v9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0802y9();
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
        C0716v9 c0716v9 = this.a;
        if (c0716v9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0716v9);
        }
        C0802y9 c0802y9 = this.b;
        return c0802y9 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0802y9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0716v9 c0716v9 = this.a;
        if (c0716v9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0716v9);
        }
        C0802y9 c0802y9 = this.b;
        if (c0802y9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0802y9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0830z9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0830z9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0830z9 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0830z9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0830z9) MessageNano.mergeFrom(new C0830z9(), bArr);
    }
}
