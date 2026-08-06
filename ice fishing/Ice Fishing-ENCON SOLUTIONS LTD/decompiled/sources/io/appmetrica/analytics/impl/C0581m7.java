package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581m7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile C0581m7[] f6484s;

    /* renamed from: a, reason: collision with root package name */
    public int f6485a;

    /* renamed from: b, reason: collision with root package name */
    public String f6486b;

    /* renamed from: c, reason: collision with root package name */
    public String f6487c;

    /* renamed from: d, reason: collision with root package name */
    public long f6488d;

    /* renamed from: e, reason: collision with root package name */
    public C0607n7 f6489e;

    /* renamed from: f, reason: collision with root package name */
    public String f6490f;

    /* renamed from: g, reason: collision with root package name */
    public String f6491g;

    /* renamed from: h, reason: collision with root package name */
    public long f6492h;

    /* renamed from: i, reason: collision with root package name */
    public int f6493i;

    /* renamed from: j, reason: collision with root package name */
    public int f6494j;

    /* renamed from: k, reason: collision with root package name */
    public String f6495k;

    /* renamed from: l, reason: collision with root package name */
    public int f6496l;

    /* renamed from: m, reason: collision with root package name */
    public String f6497m;

    /* renamed from: n, reason: collision with root package name */
    public int f6498n;

    /* renamed from: o, reason: collision with root package name */
    public int f6499o;

    /* renamed from: p, reason: collision with root package name */
    public int f6500p;

    /* renamed from: q, reason: collision with root package name */
    public int f6501q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f6502r;

    public C0581m7() {
        a();
    }

    public static C0581m7[] b() {
        if (f6484s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6484s == null) {
                        f6484s = new C0581m7[0];
                    }
                } finally {
                }
            }
        }
        return f6484s;
    }

    public final C0581m7 a() {
        this.f6485a = -1;
        this.f6486b = "";
        this.f6487c = "";
        this.f6488d = -1L;
        this.f6489e = null;
        this.f6490f = "";
        this.f6491g = "";
        this.f6492h = -1L;
        this.f6493i = -1;
        this.f6494j = -1;
        this.f6495k = "";
        this.f6496l = -1;
        this.f6497m = "";
        this.f6498n = -1;
        this.f6499o = -1;
        this.f6500p = -1;
        this.f6501q = -1;
        this.f6502r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6485a;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (!this.f6486b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6486b);
        }
        if (!this.f6487c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6487c);
        }
        long j2 = this.f6488d;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j2);
        }
        C0607n7 c0607n7 = this.f6489e;
        if (c0607n7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0607n7);
        }
        if (!this.f6490f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f6490f);
        }
        if (!this.f6491g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f6491g);
        }
        long j3 = this.f6492h;
        if (j3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j3);
        }
        int i3 = this.f6493i;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f6494j;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        if (!this.f6495k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f6495k);
        }
        int i5 = this.f6496l;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i5);
        }
        if (!this.f6497m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f6497m);
        }
        int i6 = this.f6498n;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i6);
        }
        int i7 = this.f6499o;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i7);
        }
        int i8 = this.f6500p;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i8);
        }
        int i9 = this.f6501q;
        if (i9 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i9);
        }
        return !Arrays.equals(this.f6502r, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f6502r) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6485a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f6486b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6486b);
        }
        if (!this.f6487c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6487c);
        }
        long j2 = this.f6488d;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j2);
        }
        C0607n7 c0607n7 = this.f6489e;
        if (c0607n7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0607n7);
        }
        if (!this.f6490f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f6490f);
        }
        if (!this.f6491g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f6491g);
        }
        long j3 = this.f6492h;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j3);
        }
        int i3 = this.f6493i;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f6494j;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        if (!this.f6495k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f6495k);
        }
        int i5 = this.f6496l;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i5);
        }
        if (!this.f6497m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f6497m);
        }
        int i6 = this.f6498n;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i6);
        }
        int i7 = this.f6499o;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i7);
        }
        int i8 = this.f6500p;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i8);
        }
        int i9 = this.f6501q;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i9);
        }
        if (!Arrays.equals(this.f6502r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f6502r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0581m7 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0581m7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0581m7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6485a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f6486b = codedInputByteBufferNano.readString();
                    break;
                case C0376e9.G /* 26 */:
                    this.f6487c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f6488d = codedInputByteBufferNano.readInt64();
                    break;
                case C0376e9.f5891M /* 42 */:
                    if (this.f6489e == null) {
                        this.f6489e = new C0607n7();
                    }
                    codedInputByteBufferNano.readMessage(this.f6489e);
                    break;
                case 50:
                    this.f6490f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f6491g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f6492h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f6493i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f6494j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6495k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f6496l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f6497m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f6498n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f6499o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6500p = readInt32;
                        break;
                    }
                case 136:
                    this.f6501q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f6502r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0581m7 a(byte[] bArr) {
        return (C0581m7) MessageNano.mergeFrom(new C0581m7(), bArr);
    }
}
