package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428g9 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6058d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6059e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6060f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6061g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6062h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6063i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6064j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6065k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6066l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6067m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6068n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6069o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6070p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0428g9[] f6071q;

    /* renamed from: a, reason: collision with root package name */
    public long f6072a;

    /* renamed from: b, reason: collision with root package name */
    public C0402f9 f6073b;

    /* renamed from: c, reason: collision with root package name */
    public C0376e9[] f6074c;

    public C0428g9() {
        a();
    }

    public static C0428g9[] b() {
        if (f6071q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6071q == null) {
                        f6071q = new C0428g9[0];
                    }
                } finally {
                }
            }
        }
        return f6071q;
    }

    public final C0428g9 a() {
        this.f6072a = 0L;
        this.f6073b = null;
        this.f6074c = C0376e9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f6072a) + super.computeSerializedSize();
        C0402f9 c0402f9 = this.f6073b;
        if (c0402f9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0402f9);
        }
        C0376e9[] c0376e9Arr = this.f6074c;
        if (c0376e9Arr != null && c0376e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0376e9[] c0376e9Arr2 = this.f6074c;
                if (i2 >= c0376e9Arr2.length) {
                    break;
                }
                C0376e9 c0376e9 = c0376e9Arr2[i2];
                if (c0376e9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0376e9) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f6072a);
        C0402f9 c0402f9 = this.f6073b;
        if (c0402f9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0402f9);
        }
        C0376e9[] c0376e9Arr = this.f6074c;
        if (c0376e9Arr != null && c0376e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0376e9[] c0376e9Arr2 = this.f6074c;
                if (i2 >= c0376e9Arr2.length) {
                    break;
                }
                C0376e9 c0376e9 = c0376e9Arr2[i2];
                if (c0376e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0376e9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0428g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6072a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f6073b == null) {
                    this.f6073b = new C0402f9();
                }
                codedInputByteBufferNano.readMessage(this.f6073b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0376e9[] c0376e9Arr = this.f6074c;
                int length = c0376e9Arr == null ? 0 : c0376e9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0376e9[] c0376e9Arr2 = new C0376e9[i2];
                if (length != 0) {
                    System.arraycopy(c0376e9Arr, 0, c0376e9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0376e9 c0376e9 = new C0376e9();
                    c0376e9Arr2[length] = c0376e9;
                    codedInputByteBufferNano.readMessage(c0376e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0376e9 c0376e92 = new C0376e9();
                c0376e9Arr2[length] = c0376e92;
                codedInputByteBufferNano.readMessage(c0376e92);
                this.f6074c = c0376e9Arr2;
            }
        }
    }

    public static C0428g9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0428g9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0428g9 a(byte[] bArr) {
        return (C0428g9) MessageNano.mergeFrom(new C0428g9(), bArr);
    }
}
