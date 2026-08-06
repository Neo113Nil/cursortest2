package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615nf extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6617c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6618d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6619e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6620f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0615nf[] f6621g;

    /* renamed from: a, reason: collision with root package name */
    public C0563lf f6622a;

    /* renamed from: b, reason: collision with root package name */
    public C0589mf[] f6623b;

    public C0615nf() {
        a();
    }

    public static C0615nf[] b() {
        if (f6621g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6621g == null) {
                        f6621g = new C0615nf[0];
                    }
                } finally {
                }
            }
        }
        return f6621g;
    }

    public final C0615nf a() {
        this.f6622a = null;
        this.f6623b = C0589mf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0563lf c0563lf = this.f6622a;
        if (c0563lf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0563lf);
        }
        C0589mf[] c0589mfArr = this.f6623b;
        if (c0589mfArr != null && c0589mfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0589mf[] c0589mfArr2 = this.f6623b;
                if (i2 >= c0589mfArr2.length) {
                    break;
                }
                C0589mf c0589mf = c0589mfArr2[i2];
                if (c0589mf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0589mf) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0563lf c0563lf = this.f6622a;
        if (c0563lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c0563lf);
        }
        C0589mf[] c0589mfArr = this.f6623b;
        if (c0589mfArr != null && c0589mfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0589mf[] c0589mfArr2 = this.f6623b;
                if (i2 >= c0589mfArr2.length) {
                    break;
                }
                C0589mf c0589mf = c0589mfArr2[i2];
                if (c0589mf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0589mf);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0615nf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6622a == null) {
                    this.f6622a = new C0563lf();
                }
                codedInputByteBufferNano.readMessage(this.f6622a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0589mf[] c0589mfArr = this.f6623b;
                int length = c0589mfArr == null ? 0 : c0589mfArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0589mf[] c0589mfArr2 = new C0589mf[i2];
                if (length != 0) {
                    System.arraycopy(c0589mfArr, 0, c0589mfArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0589mf c0589mf = new C0589mf();
                    c0589mfArr2[length] = c0589mf;
                    codedInputByteBufferNano.readMessage(c0589mf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0589mf c0589mf2 = new C0589mf();
                c0589mfArr2[length] = c0589mf2;
                codedInputByteBufferNano.readMessage(c0589mf2);
                this.f6623b = c0589mfArr2;
            }
        }
    }

    public static C0615nf b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0615nf().mergeFrom(codedInputByteBufferNano);
    }

    public static C0615nf a(byte[] bArr) {
        return (C0615nf) MessageNano.mergeFrom(new C0615nf(), bArr);
    }
}
