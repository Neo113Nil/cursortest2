package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X5 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5367l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5368m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile X5[] f5369n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f5370o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f5371p;

    /* renamed from: a, reason: collision with root package name */
    public C0296b6 f5372a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f5373b;

    /* renamed from: c, reason: collision with root package name */
    public String f5374c;

    /* renamed from: d, reason: collision with root package name */
    public int f5375d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f5376e;

    /* renamed from: f, reason: collision with root package name */
    public String f5377f;

    /* renamed from: g, reason: collision with root package name */
    public int f5378g;

    /* renamed from: h, reason: collision with root package name */
    public W5 f5379h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f5380i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f5381j;

    /* renamed from: k, reason: collision with root package name */
    public T5[] f5382k;

    public X5() {
        if (!f5371p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f5371p) {
                        f5370o = InternalNano.bytesDefaultValue("JVM");
                        f5371p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static X5[] b() {
        if (f5369n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5369n == null) {
                        f5369n = new X5[0];
                    }
                } finally {
                }
            }
        }
        return f5369n;
    }

    public final X5 a() {
        this.f5372a = null;
        this.f5373b = null;
        this.f5374c = "";
        this.f5375d = -1;
        this.f5376e = Z5.b();
        this.f5377f = "";
        this.f5378g = 0;
        this.f5379h = null;
        this.f5380i = (byte[]) f5370o.clone();
        this.f5381j = WireFormatNano.EMPTY_BYTES;
        this.f5382k = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0296b6 c0296b6 = this.f5372a;
        if (c0296b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0296b6);
        }
        R5 r5 = this.f5373b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f5374c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f5374c);
        }
        int i2 = this.f5375d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        Z5[] z5Arr = this.f5376e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5376e;
                if (i4 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i4];
                if (z5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, z5) + computeSerializedSize;
                }
                i4++;
            }
        }
        if (!this.f5377f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f5377f);
        }
        int i5 = this.f5378g;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        W5 w5 = this.f5379h;
        if (w5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, w5);
        }
        if (!Arrays.equals(this.f5380i, f5370o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f5380i);
        }
        if (!Arrays.equals(this.f5381j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f5381j);
        }
        T5[] t5Arr = this.f5382k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f5382k;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, t5) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0296b6 c0296b6 = this.f5372a;
        if (c0296b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0296b6);
        }
        R5 r5 = this.f5373b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f5374c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5374c);
        }
        int i2 = this.f5375d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        Z5[] z5Arr = this.f5376e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5376e;
                if (i4 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i4];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(5, z5);
                }
                i4++;
            }
        }
        if (!this.f5377f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f5377f);
        }
        int i5 = this.f5378g;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        W5 w5 = this.f5379h;
        if (w5 != null) {
            codedOutputByteBufferNano.writeMessage(8, w5);
        }
        if (!Arrays.equals(this.f5380i, f5370o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f5380i);
        }
        if (!Arrays.equals(this.f5381j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f5381j);
        }
        T5[] t5Arr = this.f5382k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f5382k;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, t5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f5372a == null) {
                        this.f5372a = new C0296b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f5372a);
                    break;
                case 18:
                    if (this.f5373b == null) {
                        this.f5373b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5373b);
                    break;
                case C0376e9.G /* 26 */:
                    this.f5374c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f5375d = readInt32;
                        break;
                    }
                case C0376e9.f5891M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f5376e;
                    int length = z5Arr == null ? 0 : z5Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    Z5[] z5Arr2 = new Z5[i2];
                    if (length != 0) {
                        System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        Z5 z5 = new Z5();
                        z5Arr2[length] = z5;
                        codedInputByteBufferNano.readMessage(z5);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    Z5 z52 = new Z5();
                    z5Arr2[length] = z52;
                    codedInputByteBufferNano.readMessage(z52);
                    this.f5376e = z5Arr2;
                    break;
                case 50:
                    this.f5377f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5378g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f5379h == null) {
                        this.f5379h = new W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5379h);
                    break;
                case 74:
                    this.f5380i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f5381j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    T5[] t5Arr = this.f5382k;
                    int length2 = t5Arr == null ? 0 : t5Arr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    T5[] t5Arr2 = new T5[i3];
                    if (length2 != 0) {
                        System.arraycopy(t5Arr, 0, t5Arr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        T5 t5 = new T5();
                        t5Arr2[length2] = t5;
                        codedInputByteBufferNano.readMessage(t5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    T5 t52 = new T5();
                    t5Arr2[length2] = t52;
                    codedInputByteBufferNano.readMessage(t52);
                    this.f5382k = t5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static X5 a(byte[] bArr) {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }
}
