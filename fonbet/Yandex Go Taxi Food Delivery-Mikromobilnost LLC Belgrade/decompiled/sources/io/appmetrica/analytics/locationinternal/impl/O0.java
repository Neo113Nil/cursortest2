package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class O0 extends MessageNano {
    public static volatile O0[] e;
    public R0 a;
    public T0 b;
    public S0 c;
    public V0 d;

    public O0() {
        a();
    }

    public static O0[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new O0[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new R0();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new T0();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new S0();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new V0();
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
        R0 r0 = this.a;
        if (r0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, r0);
        }
        T0 t0 = this.b;
        if (t0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, t0);
        }
        S0 s0 = this.c;
        if (s0 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, s0);
        }
        V0 v0 = this.d;
        return v0 != null ? CodedOutputByteBufferNano.computeMessageSize(4, v0) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        R0 r0 = this.a;
        if (r0 != null) {
            codedOutputByteBufferNano.writeMessage(1, r0);
        }
        T0 t0 = this.b;
        if (t0 != null) {
            codedOutputByteBufferNano.writeMessage(2, t0);
        }
        S0 s0 = this.c;
        if (s0 != null) {
            codedOutputByteBufferNano.writeMessage(3, s0);
        }
        V0 v0 = this.d;
        if (v0 != null) {
            codedOutputByteBufferNano.writeMessage(4, v0);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static O0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O0().mergeFrom(codedInputByteBufferNano);
    }

    public final O0 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public static O0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (O0) MessageNano.mergeFrom(new O0(), bArr);
    }
}
