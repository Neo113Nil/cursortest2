package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0621pd extends MessageNano {
    public static volatile C0621pd[] f;
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;

    public C0621pd() {
        a();
    }

    public static C0621pd[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0621pd[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0621pd mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 210) {
                this.e = codedInputByteBufferNano.readString();
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
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.b);
        }
        boolean z = this.c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.d);
        }
        return !this.e.equals("") ? CodedOutputByteBufferNano.computeStringSize(26, this.e) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.b);
        }
        boolean z = this.c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0621pd b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0621pd().mergeFrom(codedInputByteBufferNano);
    }

    public final C0621pd a() {
        this.a = "";
        this.b = "";
        this.c = false;
        this.d = "";
        this.e = "";
        this.cachedSize = -1;
        return this;
    }

    public static C0621pd a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0621pd) MessageNano.mergeFrom(new C0621pd(), bArr);
    }
}
