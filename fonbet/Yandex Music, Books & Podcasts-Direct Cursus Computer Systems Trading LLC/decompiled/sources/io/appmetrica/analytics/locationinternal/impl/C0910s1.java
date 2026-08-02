package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0910s1 extends MessageNano {
    public static volatile C0910s1[] f;
    public String a;
    public int b;
    public String c;
    public boolean d;
    public long e;

    public C0910s1() {
        a();
    }

    public static C0910s1[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0910s1[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0910s1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        int i = this.b;
        if (i != 0) {
            computeStringSize += CodedOutputByteBufferNano.computeSInt32Size(2, i);
        }
        if (!this.c.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        boolean z = this.d;
        if (z) {
            computeStringSize += CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        long j = this.e;
        return j != 0 ? CodedOutputByteBufferNano.computeUInt64Size(5, j) + computeStringSize : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        long j = this.e;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0910s1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0910s1().mergeFrom(codedInputByteBufferNano);
    }

    public final C0910s1 a() {
        this.a = "";
        this.b = 0;
        this.c = "";
        this.d = false;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    public static C0910s1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0910s1) MessageNano.mergeFrom(new C0910s1(), bArr);
    }
}
