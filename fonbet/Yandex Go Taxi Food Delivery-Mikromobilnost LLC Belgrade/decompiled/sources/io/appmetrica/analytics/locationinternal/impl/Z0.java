package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Z0 extends MessageNano {
    public static volatile Z0[] d;
    public boolean a;
    public Y0 b;
    public Y0 c;

    public Z0() {
        a();
    }

    public static Z0[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new Z0[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new Y0();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new Y0();
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
        Y0 y0 = this.b;
        if (y0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, y0);
        }
        Y0 y02 = this.c;
        return y02 != null ? CodedOutputByteBufferNano.computeMessageSize(3, y02) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Y0 y0 = this.b;
        if (y0 != null) {
            codedOutputByteBufferNano.writeMessage(2, y0);
        }
        Y0 y02 = this.c;
        if (y02 != null) {
            codedOutputByteBufferNano.writeMessage(3, y02);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z0().mergeFrom(codedInputByteBufferNano);
    }

    public final Z0 a() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    public static Z0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z0) MessageNano.mergeFrom(new Z0(), bArr);
    }
}
