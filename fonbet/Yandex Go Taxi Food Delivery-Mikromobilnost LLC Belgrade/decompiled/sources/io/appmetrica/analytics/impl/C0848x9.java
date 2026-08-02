package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0848x9 extends MessageNano {
    public static volatile C0848x9[] b;
    public C0790v9 a;

    public C0848x9() {
        a();
    }

    public static C0848x9[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0848x9[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0848x9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0790v9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0790v9 c0790v9 = this.a;
        return c0790v9 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0790v9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0790v9 c0790v9 = this.a;
        if (c0790v9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0790v9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0848x9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0848x9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0848x9 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0848x9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0848x9) MessageNano.mergeFrom(new C0848x9(), bArr);
    }
}
