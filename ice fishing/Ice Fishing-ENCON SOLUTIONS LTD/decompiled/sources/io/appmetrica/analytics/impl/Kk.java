package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Kk extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Kk[] f4646b;

    /* renamed from: a, reason: collision with root package name */
    public Lk[] f4647a;

    public Kk() {
        a();
    }

    public static Kk[] b() {
        if (f4646b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4646b == null) {
                        f4646b = new Kk[0];
                    }
                } finally {
                }
            }
        }
        return f4646b;
    }

    public final Kk a() {
        this.f4647a = Lk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Lk[] lkArr = this.f4647a;
        if (lkArr != null && lkArr.length > 0) {
            int i2 = 0;
            while (true) {
                Lk[] lkArr2 = this.f4647a;
                if (i2 >= lkArr2.length) {
                    break;
                }
                Lk lk = lkArr2[i2];
                if (lk != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, lk) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Lk[] lkArr = this.f4647a;
        if (lkArr != null && lkArr.length > 0) {
            int i2 = 0;
            while (true) {
                Lk[] lkArr2 = this.f4647a;
                if (i2 >= lkArr2.length) {
                    break;
                }
                Lk lk = lkArr2[i2];
                if (lk != null) {
                    codedOutputByteBufferNano.writeMessage(1, lk);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                Lk[] lkArr = this.f4647a;
                int length = lkArr == null ? 0 : lkArr.length;
                int i2 = repeatedFieldArrayLength + length;
                Lk[] lkArr2 = new Lk[i2];
                if (length != 0) {
                    System.arraycopy(lkArr, 0, lkArr2, 0, length);
                }
                while (length < i2 - 1) {
                    Lk lk = new Lk();
                    lkArr2[length] = lk;
                    codedInputByteBufferNano.readMessage(lk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Lk lk2 = new Lk();
                lkArr2[length] = lk2;
                codedInputByteBufferNano.readMessage(lk2);
                this.f4647a = lkArr2;
            }
        }
    }

    public static Kk b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Kk().mergeFrom(codedInputByteBufferNano);
    }

    public static Kk a(byte[] bArr) {
        return (Kk) MessageNano.mergeFrom(new Kk(), bArr);
    }
}
