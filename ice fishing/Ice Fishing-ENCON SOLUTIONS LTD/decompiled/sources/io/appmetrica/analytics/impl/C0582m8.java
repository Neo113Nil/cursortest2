package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582m8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0582m8[] f6503c;

    /* renamed from: a, reason: collision with root package name */
    public C0324c8 f6504a;

    /* renamed from: b, reason: collision with root package name */
    public C0324c8[] f6505b;

    public C0582m8() {
        a();
    }

    public static C0582m8[] b() {
        if (f6503c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6503c == null) {
                        f6503c = new C0582m8[0];
                    }
                } finally {
                }
            }
        }
        return f6503c;
    }

    public final C0582m8 a() {
        this.f6504a = null;
        this.f6505b = C0324c8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0324c8 c0324c8 = this.f6504a;
        if (c0324c8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0324c8);
        }
        C0324c8[] c0324c8Arr = this.f6505b;
        if (c0324c8Arr != null && c0324c8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0324c8[] c0324c8Arr2 = this.f6505b;
                if (i2 >= c0324c8Arr2.length) {
                    break;
                }
                C0324c8 c0324c82 = c0324c8Arr2[i2];
                if (c0324c82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0324c82) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0324c8 c0324c8 = this.f6504a;
        if (c0324c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0324c8);
        }
        C0324c8[] c0324c8Arr = this.f6505b;
        if (c0324c8Arr != null && c0324c8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0324c8[] c0324c8Arr2 = this.f6505b;
                if (i2 >= c0324c8Arr2.length) {
                    break;
                }
                C0324c8 c0324c82 = c0324c8Arr2[i2];
                if (c0324c82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0324c82);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0582m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6504a == null) {
                    this.f6504a = new C0324c8();
                }
                codedInputByteBufferNano.readMessage(this.f6504a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0324c8[] c0324c8Arr = this.f6505b;
                int length = c0324c8Arr == null ? 0 : c0324c8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0324c8[] c0324c8Arr2 = new C0324c8[i2];
                if (length != 0) {
                    System.arraycopy(c0324c8Arr, 0, c0324c8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0324c8 c0324c8 = new C0324c8();
                    c0324c8Arr2[length] = c0324c8;
                    codedInputByteBufferNano.readMessage(c0324c8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0324c8 c0324c82 = new C0324c8();
                c0324c8Arr2[length] = c0324c82;
                codedInputByteBufferNano.readMessage(c0324c82);
                this.f6505b = c0324c8Arr2;
            }
        }
    }

    public static C0582m8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0582m8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0582m8 a(byte[] bArr) {
        return (C0582m8) MessageNano.mergeFrom(new C0582m8(), bArr);
    }
}
