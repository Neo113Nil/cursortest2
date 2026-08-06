package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728s extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f6854l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6855m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6856n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6857o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6858p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f6859q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6860r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f6861s = 7;
    public static volatile C0728s[] t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f6862u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f6863v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6864a;

    /* renamed from: b, reason: collision with root package name */
    public r f6865b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6866c;

    /* renamed from: d, reason: collision with root package name */
    public int f6867d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f6868e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f6869f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f6870g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f6871h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f6872i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f6873j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f6874k;

    public C0728s() {
        if (!f6863v) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f6863v) {
                        f6862u = InternalNano.bytesDefaultValue("manual");
                        f6863v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C0728s[] b() {
        if (t == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (t == null) {
                        t = new C0728s[0];
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public final C0728s a() {
        this.f6864a = (byte[]) f6862u.clone();
        this.f6865b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6866c = bArr;
        this.f6867d = 0;
        this.f6868e = bArr;
        this.f6869f = bArr;
        this.f6870g = bArr;
        this.f6871h = bArr;
        this.f6872i = bArr;
        this.f6873j = bArr;
        this.f6874k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f6864a, f6862u)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6864a);
        }
        r rVar = this.f6865b;
        if (rVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f6866c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f6866c);
        }
        int i2 = this.f6867d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        if (!Arrays.equals(this.f6868e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6868e);
        }
        if (!Arrays.equals(this.f6869f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f6869f);
        }
        if (!Arrays.equals(this.f6870g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f6870g);
        }
        if (!Arrays.equals(this.f6871h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f6871h);
        }
        if (!Arrays.equals(this.f6872i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f6872i);
        }
        if (!Arrays.equals(this.f6873j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f6873j);
        }
        return !Arrays.equals(this.f6874k, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f6874k) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f6864a, f6862u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6864a);
        }
        r rVar = this.f6865b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f6866c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f6866c);
        }
        int i2 = this.f6867d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        if (!Arrays.equals(this.f6868e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6868e);
        }
        if (!Arrays.equals(this.f6869f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f6869f);
        }
        if (!Arrays.equals(this.f6870g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f6870g);
        }
        if (!Arrays.equals(this.f6871h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f6871h);
        }
        if (!Arrays.equals(this.f6872i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f6872i);
        }
        if (!Arrays.equals(this.f6873j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f6873j);
        }
        if (!Arrays.equals(this.f6874k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f6874k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0728s b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0728s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0728s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f6864a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f6865b == null) {
                        this.f6865b = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.f6865b);
                    break;
                case C0376e9.G /* 26 */:
                    this.f6866c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f6867d = readInt32;
                            break;
                    }
                case C0376e9.f5891M /* 42 */:
                    this.f6868e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f6869f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f6870g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f6871h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f6872i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f6873j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6874k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0728s a(byte[] bArr) {
        return (C0728s) MessageNano.mergeFrom(new C0728s(), bArr);
    }
}
