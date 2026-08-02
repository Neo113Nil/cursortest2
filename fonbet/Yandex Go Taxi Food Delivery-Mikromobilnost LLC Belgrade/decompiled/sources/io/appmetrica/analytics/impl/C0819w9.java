package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0819w9 extends MessageNano {
    public static volatile C0819w9[] c;
    public int a;
    public C0703s9 b;

    public C0819w9() {
        a();
    }

    public static C0819w9[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0819w9[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0819w9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0703s9();
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
        int i = this.a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C0703s9 c0703s9 = this.b;
        return c0703s9 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0703s9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C0703s9 c0703s9 = this.b;
        if (c0703s9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0703s9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0819w9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0819w9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0819w9 a() {
        this.a = 0;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0819w9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0819w9) MessageNano.mergeFrom(new C0819w9(), bArr);
    }
}
