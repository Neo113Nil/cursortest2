package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563lf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0563lf[] f6448f;

    /* renamed from: a, reason: collision with root package name */
    public String f6449a;

    /* renamed from: b, reason: collision with root package name */
    public String f6450b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6451c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6452d;

    /* renamed from: e, reason: collision with root package name */
    public int f6453e;

    public C0563lf() {
        a();
    }

    public static C0563lf[] b() {
        if (f6448f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6448f == null) {
                        f6448f = new C0563lf[0];
                    }
                } finally {
                }
            }
        }
        return f6448f;
    }

    public final C0563lf a() {
        this.f6449a = "";
        this.f6450b = "";
        this.f6451c = false;
        this.f6452d = false;
        this.f6453e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6449a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6449a);
        }
        if (!this.f6450b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6450b);
        }
        boolean z2 = this.f6451c;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z2);
        }
        boolean z3 = this.f6452d;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z3);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f6453e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6449a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6449a);
        }
        if (!this.f6450b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6450b);
        }
        boolean z2 = this.f6451c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        boolean z3 = this.f6452d;
        if (z3) {
            codedOutputByteBufferNano.writeBool(4, z3);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f6453e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0563lf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0563lf().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0563lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6449a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6450b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f6451c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f6452d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6453e = readInt32;
                }
            }
        }
    }

    public static C0563lf a(byte[] bArr) {
        return (C0563lf) MessageNano.mergeFrom(new C0563lf(), bArr);
    }
}
