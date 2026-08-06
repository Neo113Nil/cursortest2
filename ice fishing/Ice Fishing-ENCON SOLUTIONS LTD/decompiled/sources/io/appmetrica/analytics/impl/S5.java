package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class S5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile S5[] f5040d;

    /* renamed from: a, reason: collision with root package name */
    public R5 f5041a;

    /* renamed from: b, reason: collision with root package name */
    public String f5042b;

    /* renamed from: c, reason: collision with root package name */
    public int f5043c;

    public S5() {
        a();
    }

    public static S5[] b() {
        if (f5040d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5040d == null) {
                        f5040d = new S5[0];
                    }
                } finally {
                }
            }
        }
        return f5040d;
    }

    public final S5 a() {
        this.f5041a = null;
        this.f5042b = "";
        this.f5043c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        R5 r5 = this.f5041a;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, r5);
        }
        if (!this.f5042b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5042b);
        }
        int i2 = this.f5043c;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        R5 r5 = this.f5041a;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(1, r5);
        }
        if (!this.f5042b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5042b);
        }
        int i2 = this.f5043c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5041a == null) {
                    this.f5041a = new R5();
                }
                codedInputByteBufferNano.readMessage(this.f5041a);
            } else if (readTag == 18) {
                this.f5042b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f5043c = readInt32;
                }
            }
        }
    }

    public static S5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S5().mergeFrom(codedInputByteBufferNano);
    }

    public static S5 a(byte[] bArr) {
        return (S5) MessageNano.mergeFrom(new S5(), bArr);
    }
}
