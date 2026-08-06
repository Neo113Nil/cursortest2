package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351d9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0351d9[] f5808c;

    /* renamed from: a, reason: collision with root package name */
    public int f5809a;

    /* renamed from: b, reason: collision with root package name */
    public String f5810b;

    public C0351d9() {
        a();
    }

    public static C0351d9[] b() {
        if (f5808c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5808c == null) {
                        f5808c = new C0351d9[0];
                    }
                } finally {
                }
            }
        }
        return f5808c;
    }

    public final C0351d9 a() {
        this.f5809a = 2;
        this.f5810b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f5809a;
        if (i2 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        return !this.f5810b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f5810b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f5809a;
        if (i2 != 2) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!this.f5810b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5810b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0351d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f5809a = readInt32;
                        break;
                }
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5810b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static C0351d9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0351d9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0351d9 a(byte[] bArr) {
        return (C0351d9) MessageNano.mergeFrom(new C0351d9(), bArr);
    }
}
