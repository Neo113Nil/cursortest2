package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class S extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile S[] f7611c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7612a;

    /* renamed from: b, reason: collision with root package name */
    public Q f7613b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f7611c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7611c == null) {
                        f7611c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f7611c;
    }

    public final S a() {
        this.f7612a = true;
        this.f7613b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7612a;
        if (!z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        Q q2 = this.f7613b;
        return q2 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, q2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7612a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        Q q2 = this.f7613b;
        if (q2 != null) {
            codedOutputByteBufferNano.writeMessage(2, q2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7612a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7613b == null) {
                    this.f7613b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f7613b);
            }
        }
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
