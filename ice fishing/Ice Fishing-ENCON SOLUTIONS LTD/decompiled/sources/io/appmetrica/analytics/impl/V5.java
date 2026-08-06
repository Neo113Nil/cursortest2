package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V5 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f5209k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5210l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V5[] f5211m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f5212n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f5213o;

    /* renamed from: a, reason: collision with root package name */
    public C0296b6 f5214a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f5215b;

    /* renamed from: c, reason: collision with root package name */
    public String f5216c;

    /* renamed from: d, reason: collision with root package name */
    public int f5217d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f5218e;

    /* renamed from: f, reason: collision with root package name */
    public int f5219f;

    /* renamed from: g, reason: collision with root package name */
    public U5 f5220g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f5221h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f5222i;

    /* renamed from: j, reason: collision with root package name */
    public T5[] f5223j;

    public V5() {
        if (!f5213o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f5213o) {
                        f5212n = InternalNano.bytesDefaultValue("JVM");
                        f5213o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static V5[] b() {
        if (f5211m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5211m == null) {
                        f5211m = new V5[0];
                    }
                } finally {
                }
            }
        }
        return f5211m;
    }

    public final V5 a() {
        this.f5214a = null;
        this.f5215b = null;
        this.f5216c = "";
        this.f5217d = -1;
        this.f5218e = Z5.b();
        this.f5219f = 0;
        this.f5220g = null;
        this.f5221h = (byte[]) f5212n.clone();
        this.f5222i = WireFormatNano.EMPTY_BYTES;
        this.f5223j = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0296b6 c0296b6 = this.f5214a;
        if (c0296b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0296b6);
        }
        R5 r5 = this.f5215b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f5216c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f5216c);
        }
        int i2 = this.f5217d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        Z5[] z5Arr = this.f5218e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5218e;
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
        int i5 = this.f5219f;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i5);
        }
        U5 u5 = this.f5220g;
        if (u5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, u5);
        }
        if (!Arrays.equals(this.f5221h, f5212n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f5221h);
        }
        if (!Arrays.equals(this.f5222i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f5222i);
        }
        T5[] t5Arr = this.f5223j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f5223j;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, t5) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0296b6 c0296b6 = this.f5214a;
        if (c0296b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0296b6);
        }
        R5 r5 = this.f5215b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f5216c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5216c);
        }
        int i2 = this.f5217d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        Z5[] z5Arr = this.f5218e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5218e;
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
        int i5 = this.f5219f;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        U5 u5 = this.f5220g;
        if (u5 != null) {
            codedOutputByteBufferNano.writeMessage(7, u5);
        }
        if (!Arrays.equals(this.f5221h, f5212n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f5221h);
        }
        if (!Arrays.equals(this.f5222i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f5222i);
        }
        T5[] t5Arr = this.f5223j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f5223j;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, t5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f5214a == null) {
                        this.f5214a = new C0296b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f5214a);
                    break;
                case 18:
                    if (this.f5215b == null) {
                        this.f5215b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5215b);
                    break;
                case C0376e9.G /* 26 */:
                    this.f5216c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f5217d = readInt32;
                        break;
                    }
                case C0376e9.f5891M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f5218e;
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
                    this.f5218e = z5Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5219f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f5220g == null) {
                        this.f5220g = new U5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5220g);
                    break;
                case 66:
                    this.f5221h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f5222i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    T5[] t5Arr = this.f5223j;
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
                    this.f5223j = t5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static V5 a(byte[] bArr) {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}
