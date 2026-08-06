package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Ab extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile Ab[] f4136f;

    /* renamed from: a, reason: collision with root package name */
    public String f4137a;

    /* renamed from: b, reason: collision with root package name */
    public String f4138b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4139c;

    /* renamed from: d, reason: collision with root package name */
    public String f4140d;

    /* renamed from: e, reason: collision with root package name */
    public String f4141e;

    public Ab() {
        a();
    }

    public static Ab[] b() {
        if (f4136f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4136f == null) {
                        f4136f = new Ab[0];
                    }
                } finally {
                }
            }
        }
        return f4136f;
    }

    public final Ab a() {
        this.f4137a = "";
        this.f4138b = "";
        this.f4139c = false;
        this.f4140d = "";
        this.f4141e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4137a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4137a);
        }
        if (!this.f4138b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f4138b);
        }
        boolean z2 = this.f4139c;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z2);
        }
        if (!this.f4140d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f4140d);
        }
        return !this.f4141e.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f4141e) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4137a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4137a);
        }
        if (!this.f4138b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f4138b);
        }
        boolean z2 = this.f4139c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(22, z2);
        }
        if (!this.f4140d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f4140d);
        }
        if (!this.f4141e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f4141e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Ab b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ab().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ab mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4137a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f4138b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f4139c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f4140d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4141e = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Ab a(byte[] bArr) {
        return (Ab) MessageNano.mergeFrom(new Ab(), bArr);
    }
}
