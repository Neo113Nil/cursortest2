package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589mf extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0589mf[] f6515d;

    /* renamed from: a, reason: collision with root package name */
    public String f6516a;

    /* renamed from: b, reason: collision with root package name */
    public String f6517b;

    /* renamed from: c, reason: collision with root package name */
    public int f6518c;

    public C0589mf() {
        a();
    }

    public static C0589mf[] b() {
        if (f6515d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6515d == null) {
                        f6515d = new C0589mf[0];
                    }
                } finally {
                }
            }
        }
        return f6515d;
    }

    public final C0589mf a() {
        this.f6516a = "";
        this.f6517b = "";
        this.f6518c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6516a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6516a);
        }
        if (!this.f6517b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6517b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f6518c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6516a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6516a);
        }
        if (!this.f6517b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6517b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f6518c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589mf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6516a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6517b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6518c = readInt32;
                }
            }
        }
    }

    public static C0589mf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0589mf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0589mf a(byte[] bArr) {
        return (C0589mf) MessageNano.mergeFrom(new C0589mf(), bArr);
    }
}
