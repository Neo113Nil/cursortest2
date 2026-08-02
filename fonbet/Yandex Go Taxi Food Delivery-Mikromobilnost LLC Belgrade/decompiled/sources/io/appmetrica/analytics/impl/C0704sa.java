package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0704sa extends MessageNano {
    public static volatile C0704sa[] c;
    public int a;
    public String b;

    public C0704sa() {
        a();
    }

    public static C0704sa[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0704sa[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0704sa mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
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
                            this.a = readInt32;
                            break;
                    }
                } else if (readTag == 34) {
                    this.b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                }
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return !this.b.equals("") ? CodedOutputByteBufferNano.computeStringSize(4, this.b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0704sa b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0704sa().mergeFrom(codedInputByteBufferNano);
    }

    public final C0704sa a() {
        this.a = 2;
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    public static C0704sa a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0704sa) MessageNano.mergeFrom(new C0704sa(), bArr);
    }
}
