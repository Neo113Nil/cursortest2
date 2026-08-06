package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296b6 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0296b6[] f5606f;

    /* renamed from: a, reason: collision with root package name */
    public String f5607a;

    /* renamed from: b, reason: collision with root package name */
    public String f5608b;

    /* renamed from: c, reason: collision with root package name */
    public Z5[] f5609c;

    /* renamed from: d, reason: collision with root package name */
    public C0296b6 f5610d;

    /* renamed from: e, reason: collision with root package name */
    public C0296b6[] f5611e;

    public C0296b6() {
        a();
    }

    public static C0296b6[] b() {
        if (f5606f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5606f == null) {
                        f5606f = new C0296b6[0];
                    }
                } finally {
                }
            }
        }
        return f5606f;
    }

    public final C0296b6 a() {
        this.f5607a = "";
        this.f5608b = "";
        this.f5609c = Z5.b();
        this.f5610d = null;
        this.f5611e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f5607a) + super.computeSerializedSize();
        if (!this.f5608b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5608b);
        }
        Z5[] z5Arr = this.f5609c;
        int i2 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5609c;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, z5) + computeStringSize;
                }
                i3++;
            }
        }
        C0296b6 c0296b6 = this.f5610d;
        if (c0296b6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c0296b6);
        }
        C0296b6[] c0296b6Arr = this.f5611e;
        if (c0296b6Arr != null && c0296b6Arr.length > 0) {
            while (true) {
                C0296b6[] c0296b6Arr2 = this.f5611e;
                if (i2 >= c0296b6Arr2.length) {
                    break;
                }
                C0296b6 c0296b62 = c0296b6Arr2[i2];
                if (c0296b62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c0296b62) + computeStringSize;
                }
                i2++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5607a);
        if (!this.f5608b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5608b);
        }
        Z5[] z5Arr = this.f5609c;
        int i2 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5609c;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(3, z5);
                }
                i3++;
            }
        }
        C0296b6 c0296b6 = this.f5610d;
        if (c0296b6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0296b6);
        }
        C0296b6[] c0296b6Arr = this.f5611e;
        if (c0296b6Arr != null && c0296b6Arr.length > 0) {
            while (true) {
                C0296b6[] c0296b6Arr2 = this.f5611e;
                if (i2 >= c0296b6Arr2.length) {
                    break;
                }
                C0296b6 c0296b62 = c0296b6Arr2[i2];
                if (c0296b62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0296b62);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0296b6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0296b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0296b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5607a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5608b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                Z5[] z5Arr = this.f5609c;
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
                this.f5609c = z5Arr2;
            } else if (readTag == 34) {
                if (this.f5610d == null) {
                    this.f5610d = new C0296b6();
                }
                codedInputByteBufferNano.readMessage(this.f5610d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0296b6[] c0296b6Arr = this.f5611e;
                int length2 = c0296b6Arr == null ? 0 : c0296b6Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C0296b6[] c0296b6Arr2 = new C0296b6[i3];
                if (length2 != 0) {
                    System.arraycopy(c0296b6Arr, 0, c0296b6Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C0296b6 c0296b6 = new C0296b6();
                    c0296b6Arr2[length2] = c0296b6;
                    codedInputByteBufferNano.readMessage(c0296b6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0296b6 c0296b62 = new C0296b6();
                c0296b6Arr2[length2] = c0296b62;
                codedInputByteBufferNano.readMessage(c0296b62);
                this.f5611e = c0296b6Arr2;
            }
        }
    }

    public static C0296b6 a(byte[] bArr) {
        return (C0296b6) MessageNano.mergeFrom(new C0296b6(), bArr);
    }
}
