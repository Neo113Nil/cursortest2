package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784u3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0784u3[] f6963c;

    /* renamed from: a, reason: collision with root package name */
    public C0836w3 f6964a;

    /* renamed from: b, reason: collision with root package name */
    public int f6965b;

    public C0784u3() {
        a();
    }

    public static C0784u3[] b() {
        if (f6963c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6963c == null) {
                        f6963c = new C0784u3[0];
                    }
                } finally {
                }
            }
        }
        return f6963c;
    }

    public final C0784u3 a() {
        this.f6964a = null;
        this.f6965b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0836w3 c0836w3 = this.f6964a;
        if (c0836w3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0836w3);
        }
        int i2 = this.f6965b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0836w3 c0836w3 = this.f6964a;
        if (c0836w3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0836w3);
        }
        int i2 = this.f6965b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0784u3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6964a == null) {
                    this.f6964a = new C0836w3();
                }
                codedInputByteBufferNano.readMessage(this.f6964a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6965b = readInt32;
                }
            }
        }
    }

    public static C0784u3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0784u3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0784u3 a(byte[] bArr) {
        return (C0784u3) MessageNano.mergeFrom(new C0784u3(), bArr);
    }
}
