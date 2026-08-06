package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Ii extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile Ii[] f4549e;

    /* renamed from: a, reason: collision with root package name */
    public long f4550a;

    /* renamed from: b, reason: collision with root package name */
    public Ji f4551b;

    /* renamed from: c, reason: collision with root package name */
    public int f4552c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4553d;

    public Ii() {
        a();
    }

    public static Ii[] b() {
        if (f4549e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4549e == null) {
                        f4549e = new Ii[0];
                    }
                } finally {
                }
            }
        }
        return f4549e;
    }

    public final Ii a() {
        this.f4550a = 0L;
        this.f4551b = null;
        this.f4552c = 0;
        this.f4553d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f4550a;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        Ji ji = this.f4551b;
        if (ji != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        int i2 = this.f4552c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !Arrays.equals(this.f4553d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f4553d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f4550a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        Ji ji = this.f4551b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        int i2 = this.f4552c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!Arrays.equals(this.f4553d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4553d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4550a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f4551b == null) {
                    this.f4551b = new Ji();
                }
                codedInputByteBufferNano.readMessage(this.f4551b);
            } else if (readTag == 24) {
                this.f4552c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4553d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static Ii b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static Ii a(byte[] bArr) {
        return (Ii) MessageNano.mergeFrom(new Ii(), bArr);
    }
}
