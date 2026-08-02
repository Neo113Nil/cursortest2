package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class S0 extends MessageNano {
    public static volatile S0[] i;
    public boolean a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public S0() {
        a();
    }

    public static S0[] b() {
        if (i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (i == null) {
                        i = new S0[0];
                    }
                } finally {
                }
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readBool();
            } else if (readTag == 48) {
                this.f = codedInputByteBufferNano.readBool();
            } else if (readTag == 56) {
                this.g = codedInputByteBufferNano.readBool();
            } else if (readTag == 64) {
                this.h = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        long j = this.b;
        if (j != 60000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        boolean z2 = this.c;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z2);
        }
        boolean z3 = this.d;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z3);
        }
        boolean z4 = this.e;
        if (z4) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z4);
        }
        boolean z5 = this.f;
        if (z5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(6, z5);
        }
        boolean z6 = this.g;
        if (z6) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z6);
        }
        boolean z7 = this.h;
        return z7 ? CodedOutputByteBufferNano.computeBoolSize(8, z7) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        long j = this.b;
        if (j != 60000) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        boolean z3 = this.d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        boolean z4 = this.e;
        if (z4) {
            codedOutputByteBufferNano.writeBool(5, z4);
        }
        boolean z5 = this.f;
        if (z5) {
            codedOutputByteBufferNano.writeBool(6, z5);
        }
        boolean z6 = this.g;
        if (z6) {
            codedOutputByteBufferNano.writeBool(7, z6);
        }
        boolean z7 = this.h;
        if (z7) {
            codedOutputByteBufferNano.writeBool(8, z7);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static S0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S0().mergeFrom(codedInputByteBufferNano);
    }

    public final S0 a() {
        this.a = false;
        this.b = 60000L;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.cachedSize = -1;
        return this;
    }

    public static S0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (S0) MessageNano.mergeFrom(new S0(), bArr);
    }
}
