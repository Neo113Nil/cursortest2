package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0456m9 extends MessageNano {
    public static volatile C0456m9[] e;
    public C0716v9 a;
    public C0774x9 b;
    public C0514o9 c;
    public C0687u9 d;

    public C0456m9() {
        a();
    }

    public static C0456m9[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C0456m9[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0456m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new C0774x9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0514o9();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C0687u9();
                }
                codedInputByteBufferNano.readMessage(this.d);
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
        C0774x9 c0774x9 = this.b;
        if (c0774x9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0774x9);
        }
        C0514o9 c0514o9 = this.c;
        if (c0514o9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0514o9);
        }
        C0687u9 c0687u9 = this.d;
        return c0687u9 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0687u9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0716v9 c0716v9 = this.a;
        if (c0716v9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0716v9);
        }
        C0774x9 c0774x9 = this.b;
        if (c0774x9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0774x9);
        }
        C0514o9 c0514o9 = this.c;
        if (c0514o9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0514o9);
        }
        C0687u9 c0687u9 = this.d;
        if (c0687u9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0687u9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0456m9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0456m9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0456m9 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0456m9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0456m9) MessageNano.mergeFrom(new C0456m9(), bArr);
    }
}
