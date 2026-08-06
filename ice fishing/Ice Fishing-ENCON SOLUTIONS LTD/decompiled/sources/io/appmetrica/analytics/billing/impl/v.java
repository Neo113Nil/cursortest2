package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v[] f3580e;

    /* renamed from: a, reason: collision with root package name */
    public long f3581a;

    /* renamed from: b, reason: collision with root package name */
    public w f3582b;

    /* renamed from: c, reason: collision with root package name */
    public int f3583c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3584d;

    public v() {
        a();
    }

    public static v[] b() {
        if (f3580e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3580e == null) {
                        f3580e = new v[0];
                    }
                } finally {
                }
            }
        }
        return f3580e;
    }

    public final v a() {
        this.f3581a = 0L;
        this.f3582b = null;
        this.f3583c = 0;
        this.f3584d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f3581a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        w wVar = this.f3582b;
        if (wVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i2 = this.f3583c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !Arrays.equals(this.f3584d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f3584d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f3581a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        w wVar = this.f3582b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i2 = this.f3583c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!Arrays.equals(this.f3584d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3584d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3581a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f3582b == null) {
                    this.f3582b = new w();
                }
                codedInputByteBufferNano.readMessage(this.f3582b);
            } else if (readTag == 24) {
                this.f3583c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3584d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static v b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new v().mergeFrom(codedInputByteBufferNano);
    }

    public static v a(byte[] bArr) {
        return (v) MessageNano.mergeFrom(new v(), bArr);
    }
}
