package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494io extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0494io[] f6232b;

    /* renamed from: a, reason: collision with root package name */
    public C0417fo[] f6233a;

    public C0494io() {
        a();
    }

    public static C0494io[] b() {
        if (f6232b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6232b == null) {
                        f6232b = new C0494io[0];
                    }
                } finally {
                }
            }
        }
        return f6232b;
    }

    public final C0494io a() {
        this.f6233a = C0417fo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0417fo[] c0417foArr = this.f6233a;
        if (c0417foArr != null && c0417foArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0417fo[] c0417foArr2 = this.f6233a;
                if (i2 >= c0417foArr2.length) {
                    break;
                }
                C0417fo c0417fo = c0417foArr2[i2];
                if (c0417fo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0417fo) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0417fo[] c0417foArr = this.f6233a;
        if (c0417foArr != null && c0417foArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0417fo[] c0417foArr2 = this.f6233a;
                if (i2 >= c0417foArr2.length) {
                    break;
                }
                C0417fo c0417fo = c0417foArr2[i2];
                if (c0417fo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0417fo);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0494io mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0417fo[] c0417foArr = this.f6233a;
                int length = c0417foArr == null ? 0 : c0417foArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0417fo[] c0417foArr2 = new C0417fo[i2];
                if (length != 0) {
                    System.arraycopy(c0417foArr, 0, c0417foArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0417fo c0417fo = new C0417fo();
                    c0417foArr2[length] = c0417fo;
                    codedInputByteBufferNano.readMessage(c0417fo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0417fo c0417fo2 = new C0417fo();
                c0417foArr2[length] = c0417fo2;
                codedInputByteBufferNano.readMessage(c0417fo2);
                this.f6233a = c0417foArr2;
            }
        }
    }

    public static C0494io b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0494io().mergeFrom(codedInputByteBufferNano);
    }

    public static C0494io a(byte[] bArr) {
        return (C0494io) MessageNano.mergeFrom(new C0494io(), bArr);
    }
}
