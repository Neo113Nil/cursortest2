package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453h8 extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0453h8[] f6127f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6128a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6129b;

    /* renamed from: c, reason: collision with root package name */
    public C0556l8 f6130c;

    /* renamed from: d, reason: collision with root package name */
    public C0479i8[] f6131d;

    /* renamed from: e, reason: collision with root package name */
    public int f6132e;

    public C0453h8() {
        a();
    }

    public static C0453h8[] b() {
        if (f6127f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6127f == null) {
                        f6127f = new C0453h8[0];
                    }
                } finally {
                }
            }
        }
        return f6127f;
    }

    public final C0453h8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6128a = bArr;
        this.f6129b = bArr;
        this.f6130c = null;
        this.f6131d = C0479i8.b();
        this.f6132e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6128a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6128a);
        }
        if (!Arrays.equals(this.f6129b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6129b);
        }
        C0556l8 c0556l8 = this.f6130c;
        if (c0556l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0556l8);
        }
        C0479i8[] c0479i8Arr = this.f6131d;
        if (c0479i8Arr != null && c0479i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0479i8[] c0479i8Arr2 = this.f6131d;
                if (i2 >= c0479i8Arr2.length) {
                    break;
                }
                C0479i8 c0479i8 = c0479i8Arr2[i2];
                if (c0479i8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0479i8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f6132e;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6128a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6128a);
        }
        if (!Arrays.equals(this.f6129b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6129b);
        }
        C0556l8 c0556l8 = this.f6130c;
        if (c0556l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0556l8);
        }
        C0479i8[] c0479i8Arr = this.f6131d;
        if (c0479i8Arr != null && c0479i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0479i8[] c0479i8Arr2 = this.f6131d;
                if (i2 >= c0479i8Arr2.length) {
                    break;
                }
                C0479i8 c0479i8 = c0479i8Arr2[i2];
                if (c0479i8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0479i8);
                }
                i2++;
            }
        }
        int i3 = this.f6132e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0453h8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0453h8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0453h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6128a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6129b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6130c == null) {
                    this.f6130c = new C0556l8();
                }
                codedInputByteBufferNano.readMessage(this.f6130c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0479i8[] c0479i8Arr = this.f6131d;
                int length = c0479i8Arr == null ? 0 : c0479i8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0479i8[] c0479i8Arr2 = new C0479i8[i2];
                if (length != 0) {
                    System.arraycopy(c0479i8Arr, 0, c0479i8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0479i8 c0479i8 = new C0479i8();
                    c0479i8Arr2[length] = c0479i8;
                    codedInputByteBufferNano.readMessage(c0479i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0479i8 c0479i82 = new C0479i8();
                c0479i8Arr2[length] = c0479i82;
                codedInputByteBufferNano.readMessage(c0479i82);
                this.f6131d = c0479i8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6132e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static C0453h8 a(byte[] bArr) {
        return (C0453h8) MessageNano.mergeFrom(new C0453h8(), bArr);
    }
}
