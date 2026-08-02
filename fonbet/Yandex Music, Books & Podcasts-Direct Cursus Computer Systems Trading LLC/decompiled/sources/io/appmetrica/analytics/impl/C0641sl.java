package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0641sl extends MessageNano {
    public static volatile C0641sl[] d;
    public boolean a;
    public C0612rl b;
    public C0584ql c;

    public C0641sl() {
        a();
    }

    public static C0641sl[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C0641sl[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0641sl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0612rl();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0584ql();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        C0612rl c0612rl = this.b;
        if (c0612rl != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0612rl);
        }
        C0584ql c0584ql = this.c;
        return c0584ql != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0584ql) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        C0612rl c0612rl = this.b;
        if (c0612rl != null) {
            codedOutputByteBufferNano.writeMessage(2, c0612rl);
        }
        C0584ql c0584ql = this.c;
        if (c0584ql != null) {
            codedOutputByteBufferNano.writeMessage(3, c0584ql);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0641sl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0641sl().mergeFrom(codedInputByteBufferNano);
    }

    public final C0641sl a() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0641sl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0641sl) MessageNano.mergeFrom(new C0641sl(), bArr);
    }
}
