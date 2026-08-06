package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777tm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0777tm[] f6955c;

    /* renamed from: a, reason: collision with root package name */
    public long f6956a;

    /* renamed from: b, reason: collision with root package name */
    public long f6957b;

    public C0777tm() {
        a();
    }

    public static C0777tm[] b() {
        if (f6955c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6955c == null) {
                        f6955c = new C0777tm[0];
                    }
                } finally {
                }
            }
        }
        return f6955c;
    }

    public final C0777tm a() {
        this.f6956a = 86400L;
        this.f6957b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f6957b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f6956a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f6956a);
        codedOutputByteBufferNano.writeInt64(2, this.f6957b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0777tm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6956a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6957b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static C0777tm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0777tm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0777tm a(byte[] bArr) {
        return (C0777tm) MessageNano.mergeFrom(new C0777tm(), bArr);
    }
}
