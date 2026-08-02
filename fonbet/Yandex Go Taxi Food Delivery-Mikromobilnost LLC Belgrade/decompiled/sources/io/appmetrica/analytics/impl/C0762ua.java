package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0762ua extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static volatile C0762ua[] g;
    public C0849xa a;
    public String b;
    public int c;

    public C0762ua() {
        a();
    }

    public static C0762ua[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new C0762ua[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0762ua mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0849xa();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.c = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0849xa c0849xa = this.a;
        if (c0849xa != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0849xa);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.b) + computeSerializedSize;
        int i = this.c;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(5, i) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0849xa c0849xa = this.a;
        if (c0849xa != null) {
            codedOutputByteBufferNano.writeMessage(1, c0849xa);
        }
        codedOutputByteBufferNano.writeString(2, this.b);
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0762ua b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0762ua().mergeFrom(codedInputByteBufferNano);
    }

    public final C0762ua a() {
        this.a = null;
        this.b = "";
        this.c = 0;
        this.cachedSize = -1;
        return this;
    }

    public static C0762ua a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0762ua) MessageNano.mergeFrom(new C0762ua(), bArr);
    }
}
