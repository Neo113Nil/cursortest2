package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443go extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0443go[] f6105c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6106a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6107b;

    public C0443go() {
        a();
    }

    public static C0443go[] b() {
        if (f6105c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6105c == null) {
                        f6105c = new C0443go[0];
                    }
                } finally {
                }
            }
        }
        return f6105c;
    }

    public final C0443go a() {
        this.f6106a = false;
        this.f6107b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f6106a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        boolean z3 = this.f6107b;
        return z3 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f6106a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        boolean z3 = this.f6107b;
        if (z3) {
            codedOutputByteBufferNano.writeBool(2, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0443go mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6106a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6107b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static C0443go b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0443go().mergeFrom(codedInputByteBufferNano);
    }

    public static C0443go a(byte[] bArr) {
        return (C0443go) MessageNano.mergeFrom(new C0443go(), bArr);
    }
}
