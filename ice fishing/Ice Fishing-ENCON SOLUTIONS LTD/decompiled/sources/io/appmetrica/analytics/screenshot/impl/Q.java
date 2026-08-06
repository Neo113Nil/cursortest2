package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Q extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Q[] f7607d;

    /* renamed from: a, reason: collision with root package name */
    public N f7608a;

    /* renamed from: b, reason: collision with root package name */
    public P f7609b;

    /* renamed from: c, reason: collision with root package name */
    public O f7610c;

    public Q() {
        a();
    }

    public static Q[] b() {
        if (f7607d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7607d == null) {
                        f7607d = new Q[0];
                    }
                } finally {
                }
            }
        }
        return f7607d;
    }

    public final Q a() {
        this.f7608a = null;
        this.f7609b = null;
        this.f7610c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        N n2 = this.f7608a;
        if (n2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, n2);
        }
        P p2 = this.f7609b;
        if (p2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, p2);
        }
        O o2 = this.f7610c;
        return o2 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, o2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        N n2 = this.f7608a;
        if (n2 != null) {
            codedOutputByteBufferNano.writeMessage(1, n2);
        }
        P p2 = this.f7609b;
        if (p2 != null) {
            codedOutputByteBufferNano.writeMessage(2, p2);
        }
        O o2 = this.f7610c;
        if (o2 != null) {
            codedOutputByteBufferNano.writeMessage(3, o2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7608a == null) {
                    this.f7608a = new N();
                }
                codedInputByteBufferNano.readMessage(this.f7608a);
            } else if (readTag == 18) {
                if (this.f7609b == null) {
                    this.f7609b = new P();
                }
                codedInputByteBufferNano.readMessage(this.f7609b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7610c == null) {
                    this.f7610c = new O();
                }
                codedInputByteBufferNano.readMessage(this.f7610c);
            }
        }
    }

    public static Q b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Q().mergeFrom(codedInputByteBufferNano);
    }

    public static Q a(byte[] bArr) {
        return (Q) MessageNano.mergeFrom(new Q(), bArr);
    }
}
