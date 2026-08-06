package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608n8 extends MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0608n8[] f6565h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6566a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6567b;

    /* renamed from: c, reason: collision with root package name */
    public C0401f8 f6568c;

    /* renamed from: d, reason: collision with root package name */
    public C0556l8 f6569d;

    /* renamed from: e, reason: collision with root package name */
    public C0582m8 f6570e;

    /* renamed from: f, reason: collision with root package name */
    public C0582m8 f6571f;

    /* renamed from: g, reason: collision with root package name */
    public C0634o8[] f6572g;

    public C0608n8() {
        a();
    }

    public static C0608n8[] b() {
        if (f6565h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6565h == null) {
                        f6565h = new C0608n8[0];
                    }
                } finally {
                }
            }
        }
        return f6565h;
    }

    public final C0608n8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6566a = bArr;
        this.f6567b = bArr;
        this.f6568c = null;
        this.f6569d = null;
        this.f6570e = null;
        this.f6571f = null;
        this.f6572g = C0634o8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6566a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6566a);
        }
        if (!Arrays.equals(this.f6567b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6567b);
        }
        C0401f8 c0401f8 = this.f6568c;
        if (c0401f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0401f8);
        }
        C0556l8 c0556l8 = this.f6569d;
        if (c0556l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0556l8);
        }
        C0582m8 c0582m8 = this.f6570e;
        if (c0582m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0582m8);
        }
        C0582m8 c0582m82 = this.f6571f;
        if (c0582m82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c0582m82);
        }
        C0634o8[] c0634o8Arr = this.f6572g;
        if (c0634o8Arr != null && c0634o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0634o8[] c0634o8Arr2 = this.f6572g;
                if (i2 >= c0634o8Arr2.length) {
                    break;
                }
                C0634o8 c0634o8 = c0634o8Arr2[i2];
                if (c0634o8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c0634o8) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6566a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6566a);
        }
        if (!Arrays.equals(this.f6567b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6567b);
        }
        C0401f8 c0401f8 = this.f6568c;
        if (c0401f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0401f8);
        }
        C0556l8 c0556l8 = this.f6569d;
        if (c0556l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0556l8);
        }
        C0582m8 c0582m8 = this.f6570e;
        if (c0582m8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0582m8);
        }
        C0582m8 c0582m82 = this.f6571f;
        if (c0582m82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0582m82);
        }
        C0634o8[] c0634o8Arr = this.f6572g;
        if (c0634o8Arr != null && c0634o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0634o8[] c0634o8Arr2 = this.f6572g;
                if (i2 >= c0634o8Arr2.length) {
                    break;
                }
                C0634o8 c0634o8 = c0634o8Arr2[i2];
                if (c0634o8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0634o8);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0608n8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0608n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0608n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6566a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6567b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6568c == null) {
                    this.f6568c = new C0401f8();
                }
                codedInputByteBufferNano.readMessage(this.f6568c);
            } else if (readTag == 34) {
                if (this.f6569d == null) {
                    this.f6569d = new C0556l8();
                }
                codedInputByteBufferNano.readMessage(this.f6569d);
            } else if (readTag == 42) {
                if (this.f6570e == null) {
                    this.f6570e = new C0582m8();
                }
                codedInputByteBufferNano.readMessage(this.f6570e);
            } else if (readTag == 50) {
                if (this.f6571f == null) {
                    this.f6571f = new C0582m8();
                }
                codedInputByteBufferNano.readMessage(this.f6571f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C0634o8[] c0634o8Arr = this.f6572g;
                int length = c0634o8Arr == null ? 0 : c0634o8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0634o8[] c0634o8Arr2 = new C0634o8[i2];
                if (length != 0) {
                    System.arraycopy(c0634o8Arr, 0, c0634o8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0634o8 c0634o8 = new C0634o8();
                    c0634o8Arr2[length] = c0634o8;
                    codedInputByteBufferNano.readMessage(c0634o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0634o8 c0634o82 = new C0634o8();
                c0634o8Arr2[length] = c0634o82;
                codedInputByteBufferNano.readMessage(c0634o82);
                this.f6572g = c0634o8Arr2;
            }
        }
    }

    public static C0608n8 a(byte[] bArr) {
        return (C0608n8) MessageNano.mergeFrom(new C0608n8(), bArr);
    }
}
