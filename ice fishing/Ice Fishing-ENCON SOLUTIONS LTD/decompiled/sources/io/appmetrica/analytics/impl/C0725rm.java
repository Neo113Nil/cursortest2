package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725rm extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0725rm[] f6847g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6848a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6849b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6850c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6851d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6852e;

    /* renamed from: f, reason: collision with root package name */
    public int f6853f;

    public C0725rm() {
        a();
    }

    public static C0725rm[] b() {
        if (f6847g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6847g == null) {
                        f6847g = new C0725rm[0];
                    }
                } finally {
                }
            }
        }
        return f6847g;
    }

    public final C0725rm a() {
        this.f6848a = false;
        this.f6849b = false;
        this.f6850c = false;
        this.f6851d = false;
        this.f6852e = false;
        this.f6853f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f6851d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f6850c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f6849b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f6848a) + super.computeSerializedSize();
        boolean z2 = this.f6852e;
        if (z2) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int i2 = this.f6853f;
        return i2 != -1 ? computeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i2) : computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBool(1, this.f6848a);
        codedOutputByteBufferNano.writeBool(2, this.f6849b);
        codedOutputByteBufferNano.writeBool(3, this.f6850c);
        codedOutputByteBufferNano.writeBool(4, this.f6851d);
        boolean z2 = this.f6852e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int i2 = this.f6853f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0725rm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0725rm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0725rm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6848a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f6849b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f6850c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f6851d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f6852e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f6853f = readInt32;
                }
            }
        }
    }

    public static C0725rm a(byte[] bArr) {
        return (C0725rm) MessageNano.mergeFrom(new C0725rm(), bArr);
    }
}
