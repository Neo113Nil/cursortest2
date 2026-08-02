package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0703s9 extends MessageNano {
    public static volatile C0703s9[] e;
    public B9 a;
    public D9 b;
    public C0761u9 c;
    public A9 d;

    public C0703s9() {
        a();
    }

    public static C0703s9[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C0703s9[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0703s9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new B9();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new D9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0761u9();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new A9();
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
        B9 b9 = this.a;
        if (b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, b9);
        }
        D9 d9 = this.b;
        if (d9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, d9);
        }
        C0761u9 c0761u9 = this.c;
        if (c0761u9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0761u9);
        }
        A9 a9 = this.d;
        return a9 != null ? CodedOutputByteBufferNano.computeMessageSize(4, a9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        B9 b9 = this.a;
        if (b9 != null) {
            codedOutputByteBufferNano.writeMessage(1, b9);
        }
        D9 d9 = this.b;
        if (d9 != null) {
            codedOutputByteBufferNano.writeMessage(2, d9);
        }
        C0761u9 c0761u9 = this.c;
        if (c0761u9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0761u9);
        }
        A9 a9 = this.d;
        if (a9 != null) {
            codedOutputByteBufferNano.writeMessage(4, a9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0703s9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0703s9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0703s9 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0703s9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0703s9) MessageNano.mergeFrom(new C0703s9(), bArr);
    }
}
