package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556l8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0556l8[] f6438c;

    /* renamed from: a, reason: collision with root package name */
    public C0530k8[] f6439a;

    /* renamed from: b, reason: collision with root package name */
    public int f6440b;

    public C0556l8() {
        a();
    }

    public static C0556l8[] b() {
        if (f6438c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6438c == null) {
                        f6438c = new C0556l8[0];
                    }
                } finally {
                }
            }
        }
        return f6438c;
    }

    public final C0556l8 a() {
        this.f6439a = C0530k8.b();
        this.f6440b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0530k8[] c0530k8Arr = this.f6439a;
        if (c0530k8Arr != null && c0530k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0530k8[] c0530k8Arr2 = this.f6439a;
                if (i2 >= c0530k8Arr2.length) {
                    break;
                }
                C0530k8 c0530k8 = c0530k8Arr2[i2];
                if (c0530k8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0530k8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f6440b;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0530k8[] c0530k8Arr = this.f6439a;
        if (c0530k8Arr != null && c0530k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0530k8[] c0530k8Arr2 = this.f6439a;
                if (i2 >= c0530k8Arr2.length) {
                    break;
                }
                C0530k8 c0530k8 = c0530k8Arr2[i2];
                if (c0530k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0530k8);
                }
                i2++;
            }
        }
        int i3 = this.f6440b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0556l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0530k8[] c0530k8Arr = this.f6439a;
                int length = c0530k8Arr == null ? 0 : c0530k8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0530k8[] c0530k8Arr2 = new C0530k8[i2];
                if (length != 0) {
                    System.arraycopy(c0530k8Arr, 0, c0530k8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0530k8 c0530k8 = new C0530k8();
                    c0530k8Arr2[length] = c0530k8;
                    codedInputByteBufferNano.readMessage(c0530k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0530k8 c0530k82 = new C0530k8();
                c0530k8Arr2[length] = c0530k82;
                codedInputByteBufferNano.readMessage(c0530k82);
                this.f6439a = c0530k8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6440b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C0556l8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0556l8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0556l8 a(byte[] bArr) {
        return (C0556l8) MessageNano.mergeFrom(new C0556l8(), bArr);
    }
}
