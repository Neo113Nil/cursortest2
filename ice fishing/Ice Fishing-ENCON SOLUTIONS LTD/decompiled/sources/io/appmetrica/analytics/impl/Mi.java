package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Mi extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f4767l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4768m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4769n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4770o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4771p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile Mi[] f4772q;

    /* renamed from: a, reason: collision with root package name */
    public int f4773a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4774b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4775c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4776d;

    /* renamed from: e, reason: collision with root package name */
    public Hi f4777e;

    /* renamed from: f, reason: collision with root package name */
    public long f4778f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4779g;

    /* renamed from: h, reason: collision with root package name */
    public int f4780h;

    /* renamed from: i, reason: collision with root package name */
    public int f4781i;

    /* renamed from: j, reason: collision with root package name */
    public Li f4782j;

    /* renamed from: k, reason: collision with root package name */
    public Ki f4783k;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f4772q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4772q == null) {
                        f4772q = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return f4772q;
    }

    public final Mi a() {
        this.f4773a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4774b = bArr;
        this.f4775c = bArr;
        this.f4776d = bArr;
        this.f4777e = null;
        this.f4778f = 0L;
        this.f4779g = false;
        this.f4780h = 0;
        this.f4781i = 1;
        this.f4782j = null;
        this.f4783k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4773a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f4774b) + computeSerializedSize;
        byte[] bArr = this.f4775c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f4775c);
        }
        if (!Arrays.equals(this.f4776d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f4776d);
        }
        Hi hi = this.f4777e;
        if (hi != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, hi);
        }
        long j2 = this.f4778f;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z2 = this.f4779g;
        if (z2) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        int i3 = this.f4780h;
        if (i3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f4781i;
        if (i4 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        Li li = this.f4782j;
        if (li != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, li);
        }
        Ki ki = this.f4783k;
        return ki != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, ki) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4773a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f4774b);
        byte[] bArr = this.f4775c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4775c);
        }
        if (!Arrays.equals(this.f4776d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f4776d);
        }
        Hi hi = this.f4777e;
        if (hi != null) {
            codedOutputByteBufferNano.writeMessage(6, hi);
        }
        long j2 = this.f4778f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z2 = this.f4779g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        int i3 = this.f4780h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f4781i;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        Li li = this.f4782j;
        if (li != null) {
            codedOutputByteBufferNano.writeMessage(11, li);
        }
        Ki ki = this.f4783k;
        if (ki != null) {
            codedOutputByteBufferNano.writeMessage(12, ki);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f4773a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0376e9.G /* 26 */:
                    this.f4774b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f4775c = codedInputByteBufferNano.readBytes();
                    break;
                case C0376e9.f5891M /* 42 */:
                    this.f4776d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f4777e == null) {
                        this.f4777e = new Hi();
                    }
                    codedInputByteBufferNano.readMessage(this.f4777e);
                    break;
                case 56:
                    this.f4778f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f4779g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f4780h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f4781i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f4782j == null) {
                        this.f4782j = new Li();
                    }
                    codedInputByteBufferNano.readMessage(this.f4782j);
                    break;
                case 98:
                    if (this.f4783k == null) {
                        this.f4783k = new Ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f4783k);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static Mi a(byte[] bArr) {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
