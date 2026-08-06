package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862x3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7166c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7167d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7168e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7169f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0862x3[] f7170g;

    /* renamed from: a, reason: collision with root package name */
    public C0784u3 f7171a;

    /* renamed from: b, reason: collision with root package name */
    public C0784u3[] f7172b;

    public C0862x3() {
        a();
    }

    public static C0862x3[] b() {
        if (f7170g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7170g == null) {
                        f7170g = new C0862x3[0];
                    }
                } finally {
                }
            }
        }
        return f7170g;
    }

    public final C0862x3 a() {
        this.f7171a = null;
        this.f7172b = C0784u3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0784u3 c0784u3 = this.f7171a;
        if (c0784u3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0784u3);
        }
        C0784u3[] c0784u3Arr = this.f7172b;
        if (c0784u3Arr != null && c0784u3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0784u3[] c0784u3Arr2 = this.f7172b;
                if (i2 >= c0784u3Arr2.length) {
                    break;
                }
                C0784u3 c0784u32 = c0784u3Arr2[i2];
                if (c0784u32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0784u32) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0784u3 c0784u3 = this.f7171a;
        if (c0784u3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0784u3);
        }
        C0784u3[] c0784u3Arr = this.f7172b;
        if (c0784u3Arr != null && c0784u3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0784u3[] c0784u3Arr2 = this.f7172b;
                if (i2 >= c0784u3Arr2.length) {
                    break;
                }
                C0784u3 c0784u32 = c0784u3Arr2[i2];
                if (c0784u32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0784u32);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0862x3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7171a == null) {
                    this.f7171a = new C0784u3();
                }
                codedInputByteBufferNano.readMessage(this.f7171a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0784u3[] c0784u3Arr = this.f7172b;
                int length = c0784u3Arr == null ? 0 : c0784u3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0784u3[] c0784u3Arr2 = new C0784u3[i2];
                if (length != 0) {
                    System.arraycopy(c0784u3Arr, 0, c0784u3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0784u3 c0784u3 = new C0784u3();
                    c0784u3Arr2[length] = c0784u3;
                    codedInputByteBufferNano.readMessage(c0784u3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0784u3 c0784u32 = new C0784u3();
                c0784u3Arr2[length] = c0784u32;
                codedInputByteBufferNano.readMessage(c0784u32);
                this.f7172b = c0784u3Arr2;
            }
        }
    }

    public static C0862x3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0862x3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0862x3 a(byte[] bArr) {
        return (C0862x3) MessageNano.mergeFrom(new C0862x3(), bArr);
    }
}
