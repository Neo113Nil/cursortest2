package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803um extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0803um[] f7024b;

    /* renamed from: a, reason: collision with root package name */
    public int f7025a;

    public C0803um() {
        a();
    }

    public static C0803um[] b() {
        if (f7024b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7024b == null) {
                        f7024b = new C0803um[0];
                    }
                } finally {
                }
            }
        }
        return f7024b;
    }

    public final C0803um a() {
        this.f7025a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f7025a;
        return i2 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f7025a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0803um mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7025a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C0803um a(byte[] bArr) {
        return (C0803um) MessageNano.mergeFrom(new C0803um(), bArr);
    }

    public static C0803um b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0803um().mergeFrom(codedInputByteBufferNano);
    }
}
