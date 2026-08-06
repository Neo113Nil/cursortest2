package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class s extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile s[] f3571c;

    /* renamed from: a, reason: collision with root package name */
    public int f3572a;

    /* renamed from: b, reason: collision with root package name */
    public int f3573b;

    public s() {
        a();
    }

    public static s[] b() {
        if (f3571c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3571c == null) {
                        f3571c = new s[0];
                    }
                } finally {
                }
            }
        }
        return f3571c;
    }

    public final s a() {
        this.f3572a = 86400;
        this.f3573b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f3572a;
        if (i2 != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        int i3 = this.f3573b;
        return i3 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f3572a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        int i3 = this.f3573b;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3572a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3573b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new s().mergeFrom(codedInputByteBufferNano);
    }

    public static s a(byte[] bArr) {
        return (s) MessageNano.mergeFrom(new s(), bArr);
    }
}
