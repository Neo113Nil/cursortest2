package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622nm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0622nm[] f6635b;

    /* renamed from: a, reason: collision with root package name */
    public C0596mm[] f6636a;

    public C0622nm() {
        a();
    }

    public static C0622nm[] b() {
        if (f6635b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6635b == null) {
                        f6635b = new C0622nm[0];
                    }
                } finally {
                }
            }
        }
        return f6635b;
    }

    public final C0622nm a() {
        this.f6636a = C0596mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0596mm[] c0596mmArr = this.f6636a;
        if (c0596mmArr != null && c0596mmArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0596mm[] c0596mmArr2 = this.f6636a;
                if (i2 >= c0596mmArr2.length) {
                    break;
                }
                C0596mm c0596mm = c0596mmArr2[i2];
                if (c0596mm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0596mm) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0596mm[] c0596mmArr = this.f6636a;
        if (c0596mmArr != null && c0596mmArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0596mm[] c0596mmArr2 = this.f6636a;
                if (i2 >= c0596mmArr2.length) {
                    break;
                }
                C0596mm c0596mm = c0596mmArr2[i2];
                if (c0596mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0596mm);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0622nm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
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
                C0596mm[] c0596mmArr = this.f6636a;
                int length = c0596mmArr == null ? 0 : c0596mmArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0596mm[] c0596mmArr2 = new C0596mm[i2];
                if (length != 0) {
                    System.arraycopy(c0596mmArr, 0, c0596mmArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0596mm c0596mm = new C0596mm();
                    c0596mmArr2[length] = c0596mm;
                    codedInputByteBufferNano.readMessage(c0596mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0596mm c0596mm2 = new C0596mm();
                c0596mmArr2[length] = c0596mm2;
                codedInputByteBufferNano.readMessage(c0596mm2);
                this.f6636a = c0596mmArr2;
            }
        }
    }

    public static C0622nm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0622nm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0622nm a(byte[] bArr) {
        return (C0622nm) MessageNano.mergeFrom(new C0622nm(), bArr);
    }
}
