package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376e9 extends MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f5880A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f5881B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f5882C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f5883D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f5884E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f5885F = 25;
    public static final int G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f5886H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f5887I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f5888J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f5889K = 38;

    /* renamed from: L, reason: collision with root package name */
    public static final int f5890L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f5891M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f5892N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f5893O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f5894P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f5895Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f5896R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f5897S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile C0376e9[] f5898T = null;
    public static final int t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5899u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5900v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5901w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5902x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5903y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5904z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f5905a;

    /* renamed from: b, reason: collision with root package name */
    public long f5906b;

    /* renamed from: c, reason: collision with root package name */
    public int f5907c;

    /* renamed from: d, reason: collision with root package name */
    public String f5908d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5909e;

    /* renamed from: f, reason: collision with root package name */
    public Z8 f5910f;

    /* renamed from: g, reason: collision with root package name */
    public C0351d9 f5911g;

    /* renamed from: h, reason: collision with root package name */
    public String f5912h;

    /* renamed from: i, reason: collision with root package name */
    public int f5913i;

    /* renamed from: j, reason: collision with root package name */
    public int f5914j;

    /* renamed from: k, reason: collision with root package name */
    public int f5915k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f5916l;

    /* renamed from: m, reason: collision with root package name */
    public int f5917m;

    /* renamed from: n, reason: collision with root package name */
    public long f5918n;

    /* renamed from: o, reason: collision with root package name */
    public long f5919o;

    /* renamed from: p, reason: collision with root package name */
    public int f5920p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5921q;

    /* renamed from: r, reason: collision with root package name */
    public long f5922r;

    /* renamed from: s, reason: collision with root package name */
    public C0325c9[] f5923s;

    public C0376e9() {
        a();
    }

    public static C0376e9[] b() {
        if (f5898T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5898T == null) {
                        f5898T = new C0376e9[0];
                    }
                } finally {
                }
            }
        }
        return f5898T;
    }

    public final C0376e9 a() {
        this.f5905a = 0L;
        this.f5906b = 0L;
        this.f5907c = 0;
        this.f5908d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5909e = bArr;
        this.f5910f = null;
        this.f5911g = null;
        this.f5912h = "";
        this.f5913i = 0;
        this.f5914j = 0;
        this.f5915k = -1;
        this.f5916l = bArr;
        this.f5917m = -1;
        this.f5918n = 0L;
        this.f5919o = 0L;
        this.f5920p = 0;
        this.f5921q = false;
        this.f5922r = 1L;
        this.f5923s = C0325c9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f5907c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f5906b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f5905a) + super.computeSerializedSize();
        if (!this.f5908d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f5908d);
        }
        byte[] bArr = this.f5909e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f5909e);
        }
        Z8 z8 = this.f5910f;
        if (z8 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, z8);
        }
        C0351d9 c0351d9 = this.f5911g;
        if (c0351d9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0351d9);
        }
        if (!this.f5912h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f5912h);
        }
        int i2 = this.f5913i;
        if (i2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i2);
        }
        int i3 = this.f5914j;
        if (i3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i3);
        }
        int i4 = this.f5915k;
        if (i4 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i4);
        }
        if (!Arrays.equals(this.f5916l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f5916l);
        }
        int i5 = this.f5917m;
        if (i5 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i5);
        }
        long j2 = this.f5918n;
        if (j2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j2);
        }
        long j3 = this.f5919o;
        if (j3 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j3);
        }
        int i6 = this.f5920p;
        if (i6 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i6);
        }
        boolean z2 = this.f5921q;
        if (z2) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        long j4 = this.f5922r;
        if (j4 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j4);
        }
        C0325c9[] c0325c9Arr = this.f5923s;
        if (c0325c9Arr != null && c0325c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0325c9[] c0325c9Arr2 = this.f5923s;
                if (i7 >= c0325c9Arr2.length) {
                    break;
                }
                C0325c9 c0325c9 = c0325c9Arr2[i7];
                if (c0325c9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0325c9) + computeUInt32Size;
                }
                i7++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f5905a);
        codedOutputByteBufferNano.writeUInt64(2, this.f5906b);
        codedOutputByteBufferNano.writeUInt32(3, this.f5907c);
        if (!this.f5908d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5908d);
        }
        byte[] bArr = this.f5909e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f5909e);
        }
        Z8 z8 = this.f5910f;
        if (z8 != null) {
            codedOutputByteBufferNano.writeMessage(6, z8);
        }
        C0351d9 c0351d9 = this.f5911g;
        if (c0351d9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0351d9);
        }
        if (!this.f5912h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f5912h);
        }
        int i2 = this.f5913i;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i2);
        }
        int i3 = this.f5914j;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i3);
        }
        int i4 = this.f5915k;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i4);
        }
        if (!Arrays.equals(this.f5916l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f5916l);
        }
        int i5 = this.f5917m;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i5);
        }
        long j2 = this.f5918n;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j2);
        }
        long j3 = this.f5919o;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j3);
        }
        int i6 = this.f5920p;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i6);
        }
        boolean z2 = this.f5921q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        long j4 = this.f5922r;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j4);
        }
        C0325c9[] c0325c9Arr = this.f5923s;
        if (c0325c9Arr != null && c0325c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                C0325c9[] c0325c9Arr2 = this.f5923s;
                if (i7 >= c0325c9Arr2.length) {
                    break;
                }
                C0325c9 c0325c9 = c0325c9Arr2[i7];
                if (c0325c9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0325c9);
                }
                i7++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0376e9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0376e9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0376e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f5905a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f5906b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f5907c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f5908d = codedInputByteBufferNano.readString();
                    break;
                case f5891M /* 42 */:
                    this.f5909e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f5910f == null) {
                        this.f5910f = new Z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5910f);
                    break;
                case 58:
                    if (this.f5911g == null) {
                        this.f5911g = new C0351d9();
                    }
                    codedInputByteBufferNano.readMessage(this.f5911g);
                    break;
                case 66:
                    this.f5912h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f5913i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f5914j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5915k = readInt322;
                        break;
                    }
                case 114:
                    this.f5916l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f5917m = readInt323;
                        break;
                    }
                case 128:
                    this.f5918n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f5919o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f5920p = readInt324;
                        break;
                    }
                case 184:
                    this.f5921q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f5922r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0325c9[] c0325c9Arr = this.f5923s;
                    int length = c0325c9Arr == null ? 0 : c0325c9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0325c9[] c0325c9Arr2 = new C0325c9[i2];
                    if (length != 0) {
                        System.arraycopy(c0325c9Arr, 0, c0325c9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        C0325c9 c0325c9 = new C0325c9();
                        c0325c9Arr2[length] = c0325c9;
                        codedInputByteBufferNano.readMessage(c0325c9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0325c9 c0325c92 = new C0325c9();
                    c0325c9Arr2[length] = c0325c92;
                    codedInputByteBufferNano.readMessage(c0325c92);
                    this.f5923s = c0325c9Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0376e9 a(byte[] bArr) {
        return (C0376e9) MessageNano.mergeFrom(new C0376e9(), bArr);
    }
}
