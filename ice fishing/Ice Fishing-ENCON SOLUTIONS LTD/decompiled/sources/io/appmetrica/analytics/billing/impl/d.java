package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class d extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3549c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3550d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f3551e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static volatile d[] f3552f;

    /* renamed from: a, reason: collision with root package name */
    public c[] f3553a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3554b;

    public d() {
        a();
    }

    public static d[] b() {
        if (f3552f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3552f == null) {
                        f3552f = new d[0];
                    }
                } finally {
                }
            }
        }
        return f3552f;
    }

    public final d a() {
        this.f3553a = c.b();
        this.f3554b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        c[] cVarArr = this.f3553a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                c[] cVarArr2 = this.f3553a;
                if (i2 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i2];
                if (cVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, cVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f3554b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        c[] cVarArr = this.f3553a;
        if (cVarArr != null && cVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                c[] cVarArr2 = this.f3553a;
                if (i2 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i2];
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, cVar);
                }
                i2++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f3554b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                c[] cVarArr = this.f3553a;
                int length = cVarArr == null ? 0 : cVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                c[] cVarArr2 = new c[i2];
                if (length != 0) {
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    c cVar = new c();
                    cVarArr2[length] = cVar;
                    codedInputByteBufferNano.readMessage(cVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                c cVar2 = new c();
                cVarArr2[length] = cVar2;
                codedInputByteBufferNano.readMessage(cVar2);
                this.f3553a = cVarArr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3554b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static d b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new d().mergeFrom(codedInputByteBufferNano);
    }

    public static d a(byte[] bArr) {
        return (d) MessageNano.mergeFrom(new d(), bArr);
    }
}
