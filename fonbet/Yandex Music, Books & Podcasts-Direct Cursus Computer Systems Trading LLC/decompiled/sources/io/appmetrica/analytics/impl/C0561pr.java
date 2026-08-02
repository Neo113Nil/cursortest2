package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0561pr extends MessageNano {
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static volatile C0561pr[] i;
    public byte[] a;
    public int b;
    public C0590qr c;
    public C0618rr d;

    public C0561pr() {
        a();
    }

    public static C0561pr[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new C0561pr[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0561pr mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0590qr();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C0618rr();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.b) + CodedOutputByteBufferNano.computeBytesSize(1, this.a) + super.computeSerializedSize();
        C0590qr c0590qr = this.c;
        if (c0590qr != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c0590qr);
        }
        C0618rr c0618rr = this.d;
        return c0618rr != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0618rr) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.a);
        codedOutputByteBufferNano.writeInt32(2, this.b);
        C0590qr c0590qr = this.c;
        if (c0590qr != null) {
            codedOutputByteBufferNano.writeMessage(3, c0590qr);
        }
        C0618rr c0618rr = this.d;
        if (c0618rr != null) {
            codedOutputByteBufferNano.writeMessage(4, c0618rr);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0561pr b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0561pr().mergeFrom(codedInputByteBufferNano);
    }

    public final C0561pr a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public static C0561pr a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0561pr) MessageNano.mergeFrom(new C0561pr(), bArr);
    }
}
