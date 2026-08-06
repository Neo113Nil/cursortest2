package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class x extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile x[] f3593d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3594a;

    /* renamed from: b, reason: collision with root package name */
    public w f3595b;

    /* renamed from: c, reason: collision with root package name */
    public v f3596c;

    public x() {
        a();
    }

    public static x[] b() {
        if (f3593d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3593d == null) {
                        f3593d = new x[0];
                    }
                } finally {
                }
            }
        }
        return f3593d;
    }

    public final x a() {
        this.f3594a = false;
        this.f3595b = null;
        this.f3596c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f3594a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        w wVar = this.f3595b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        v vVar = this.f3596c;
        return vVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, vVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f3594a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        w wVar = this.f3595b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        v vVar = this.f3596c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3594a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f3595b == null) {
                    this.f3595b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f3595b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f3596c == null) {
                    this.f3596c = new v();
                }
                codedInputByteBufferNano.readMessage(this.f3596c);
            }
        }
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public static x a(byte[] bArr) {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
