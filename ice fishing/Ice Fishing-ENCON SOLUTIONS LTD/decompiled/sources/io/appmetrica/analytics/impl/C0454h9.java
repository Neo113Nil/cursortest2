package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454h9 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0454h9[] f6133e;

    /* renamed from: a, reason: collision with root package name */
    public int f6134a;

    /* renamed from: b, reason: collision with root package name */
    public int f6135b;

    /* renamed from: c, reason: collision with root package name */
    public String f6136c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6137d;

    public C0454h9() {
        a();
    }

    public static C0454h9[] b() {
        if (f6133e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6133e == null) {
                        f6133e = new C0454h9[0];
                    }
                } finally {
                }
            }
        }
        return f6133e;
    }

    public final C0454h9 a() {
        this.f6134a = 0;
        this.f6135b = 0;
        this.f6136c = "";
        this.f6137d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6134a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f6135b;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i3);
        }
        if (!this.f6136c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6136c);
        }
        boolean z2 = this.f6137d;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6134a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f6135b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        if (!this.f6136c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6136c);
        }
        boolean z2 = this.f6137d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0454h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6134a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f6135b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f6136c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6137d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0454h9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0454h9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0454h9 a(byte[] bArr) {
        return (C0454h9) MessageNano.mergeFrom(new C0454h9(), bArr);
    }
}
