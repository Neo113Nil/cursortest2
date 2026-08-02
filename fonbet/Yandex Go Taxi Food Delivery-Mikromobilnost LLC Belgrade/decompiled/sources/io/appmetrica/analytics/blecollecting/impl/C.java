package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class C extends MessageNano {
    public static volatile C[] f;
    public String a;
    public String b;
    public z c;
    public A d;
    public B e;

    public C() {
        a();
    }

    public static C[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new z();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new A();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                if (this.e == null) {
                    this.e = new B();
                }
                codedInputByteBufferNano.readMessage(this.e);
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
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        z zVar = this.c;
        if (zVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, zVar);
        }
        A a = this.d;
        if (a != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, a);
        }
        B b = this.e;
        return b != null ? CodedOutputByteBufferNano.computeMessageSize(5, b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        z zVar = this.c;
        if (zVar != null) {
            codedOutputByteBufferNano.writeMessage(3, zVar);
        }
        A a = this.d;
        if (a != null) {
            codedOutputByteBufferNano.writeMessage(4, a);
        }
        B b = this.e;
        if (b != null) {
            codedOutputByteBufferNano.writeMessage(5, b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C().mergeFrom(codedInputByteBufferNano);
    }

    public final C a() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.cachedSize = -1;
        return this;
    }

    public static C a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C) MessageNano.mergeFrom(new C(), bArr);
    }
}
