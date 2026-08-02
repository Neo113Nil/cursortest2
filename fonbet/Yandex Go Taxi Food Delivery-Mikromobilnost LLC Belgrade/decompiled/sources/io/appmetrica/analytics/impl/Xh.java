package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Xh extends MessageNano {
    public static volatile Xh[] f;
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public int e;

    public Xh() {
        a();
    }

    public static Xh[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new Xh[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.e = readInt32;
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
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        boolean z = this.c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z2 = this.d;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z2 = this.d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Xh b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Xh().mergeFrom(codedInputByteBufferNano);
    }

    public final Xh a() {
        this.a = "";
        this.b = "";
        this.c = false;
        this.d = false;
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    public static Xh a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Xh) MessageNano.mergeFrom(new Xh(), bArr);
    }
}
