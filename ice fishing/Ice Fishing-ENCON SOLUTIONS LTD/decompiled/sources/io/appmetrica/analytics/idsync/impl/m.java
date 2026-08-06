package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class m extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f4039c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4040d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile m[] f4041e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4042a;

    /* renamed from: b, reason: collision with root package name */
    public l f4043b;

    public m() {
        a();
    }

    public static m[] b() {
        if (f4041e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4041e == null) {
                        f4041e = new m[0];
                    }
                } finally {
                }
            }
        }
        return f4041e;
    }

    public final m a() {
        this.f4042a = false;
        this.f4043b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f4042a;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        l lVar = this.f4043b;
        return lVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, lVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f4042a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        l lVar = this.f4043b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4042a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f4043b == null) {
                    this.f4043b = new l();
                }
                codedInputByteBufferNano.readMessage(this.f4043b);
            }
        }
    }

    public static m b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new m().mergeFrom(codedInputByteBufferNano);
    }

    public static m a(byte[] bArr) {
        return (m) MessageNano.mergeFrom(new m(), bArr);
    }
}
