package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607n7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0607n7[] f6554k;

    /* renamed from: a, reason: collision with root package name */
    public int f6555a;

    /* renamed from: b, reason: collision with root package name */
    public double f6556b;

    /* renamed from: c, reason: collision with root package name */
    public double f6557c;

    /* renamed from: d, reason: collision with root package name */
    public int f6558d;

    /* renamed from: e, reason: collision with root package name */
    public int f6559e;

    /* renamed from: f, reason: collision with root package name */
    public int f6560f;

    /* renamed from: g, reason: collision with root package name */
    public int f6561g;

    /* renamed from: h, reason: collision with root package name */
    public long f6562h;

    /* renamed from: i, reason: collision with root package name */
    public String f6563i;

    /* renamed from: j, reason: collision with root package name */
    public String f6564j;

    public C0607n7() {
        a();
    }

    public static C0607n7[] b() {
        if (f6554k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6554k == null) {
                        f6554k = new C0607n7[0];
                    }
                } finally {
                }
            }
        }
        return f6554k;
    }

    public final C0607n7 a() {
        this.f6555a = -1;
        this.f6556b = -1.0d;
        this.f6557c = -1.0d;
        this.f6558d = -1;
        this.f6559e = -1;
        this.f6560f = -1;
        this.f6561g = -1;
        this.f6562h = -1L;
        this.f6563i = "";
        this.f6564j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6555a;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (Double.doubleToLongBits(this.f6556b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f6556b);
        }
        if (Double.doubleToLongBits(this.f6557c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f6557c);
        }
        int i3 = this.f6558d;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        int i4 = this.f6559e;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i4);
        }
        int i5 = this.f6560f;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i5);
        }
        int i6 = this.f6561g;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        long j2 = this.f6562h;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        if (!this.f6563i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f6563i);
        }
        return !this.f6564j.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f6564j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6555a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (Double.doubleToLongBits(this.f6556b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f6556b);
        }
        if (Double.doubleToLongBits(this.f6557c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f6557c);
        }
        int i3 = this.f6558d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        int i4 = this.f6559e;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i4);
        }
        int i5 = this.f6560f;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        int i6 = this.f6561g;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        long j2 = this.f6562h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        if (!this.f6563i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f6563i);
        }
        if (!this.f6564j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f6564j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0607n7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0607n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0607n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6555a = readInt32;
                        break;
                    }
                case 17:
                    this.f6556b = codedInputByteBufferNano.readDouble();
                    break;
                case C0376e9.f5885F /* 25 */:
                    this.f6557c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f6558d = codedInputByteBufferNano.readInt32();
                    break;
                case C0376e9.f5890L /* 40 */:
                    this.f6559e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f6560f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f6561g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f6562h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f6563i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f6564j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0607n7 a(byte[] bArr) {
        return (C0607n7) MessageNano.mergeFrom(new C0607n7(), bArr);
    }
}
