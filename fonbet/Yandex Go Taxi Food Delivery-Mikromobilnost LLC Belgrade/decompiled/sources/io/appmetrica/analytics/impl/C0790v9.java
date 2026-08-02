package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0790v9 extends MessageNano {
    public static volatile C0790v9[] f;
    public byte[] a;
    public byte[] b;
    public C0906z9 c;
    public C0819w9[] d;
    public int e;

    public C0790v9() {
        a();
    }

    public static C0790v9[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0790v9[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0790v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C0906z9();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0819w9[] c0819w9Arr = this.d;
                int length = c0819w9Arr == null ? 0 : c0819w9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0819w9[] c0819w9Arr2 = new C0819w9[i];
                if (length != 0) {
                    System.arraycopy(c0819w9Arr, 0, c0819w9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0819w9 c0819w9 = new C0819w9();
                    c0819w9Arr2[length] = c0819w9;
                    codedInputByteBufferNano.readMessage(c0819w9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0819w9 c0819w92 = new C0819w9();
                c0819w9Arr2[length] = c0819w92;
                codedInputByteBufferNano.readMessage(c0819w92);
                this.d = c0819w9Arr2;
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readUInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C0906z9 c0906z9 = this.c;
        if (c0906z9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0906z9);
        }
        C0819w9[] c0819w9Arr = this.d;
        if (c0819w9Arr != null && c0819w9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0819w9[] c0819w9Arr2 = this.d;
                if (i >= c0819w9Arr2.length) {
                    break;
                }
                C0819w9 c0819w9 = c0819w9Arr2[i];
                if (c0819w9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c0819w9) + computeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.e;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C0906z9 c0906z9 = this.c;
        if (c0906z9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0906z9);
        }
        C0819w9[] c0819w9Arr = this.d;
        if (c0819w9Arr != null && c0819w9Arr.length > 0) {
            int i = 0;
            while (true) {
                C0819w9[] c0819w9Arr2 = this.d;
                if (i >= c0819w9Arr2.length) {
                    break;
                }
                C0819w9 c0819w9 = c0819w9Arr2[i];
                if (c0819w9 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0819w9);
                }
                i++;
            }
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0790v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0790v9().mergeFrom(codedInputByteBufferNano);
    }

    public final C0790v9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = C0819w9.b();
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    public static C0790v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0790v9) MessageNano.mergeFrom(new C0790v9(), bArr);
    }
}
