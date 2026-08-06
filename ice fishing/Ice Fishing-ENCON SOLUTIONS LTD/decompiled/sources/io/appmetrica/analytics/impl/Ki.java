package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Ki extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Ki[] f4640d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4641a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f4642b;

    /* renamed from: c, reason: collision with root package name */
    public Ii f4643c;

    public Ki() {
        a();
    }

    public static Ki[] b() {
        if (f4640d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4640d == null) {
                        f4640d = new Ki[0];
                    }
                } finally {
                }
            }
        }
        return f4640d;
    }

    public final Ki a() {
        this.f4641a = false;
        this.f4642b = null;
        this.f4643c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f4641a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        Ji ji = this.f4642b;
        if (ji != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        Ii ii = this.f4643c;
        return ii != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, ii) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f4641a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        Ji ji = this.f4642b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        Ii ii = this.f4643c;
        if (ii != null) {
            codedOutputByteBufferNano.writeMessage(3, ii);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ki mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4641a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f4642b == null) {
                    this.f4642b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f4642b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f4643c == null) {
                    this.f4643c = new Ii();
                }
                codedInputByteBufferNano.readMessage(this.f4643c);
            }
        }
    }

    public static Ki b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static Ki a(byte[] bArr) {
        return (Ki) MessageNano.mergeFrom(new Ki(), bArr);
    }
}
