package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class l extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l[] f4036c;

    /* renamed from: a, reason: collision with root package name */
    public long f4037a;

    /* renamed from: b, reason: collision with root package name */
    public k[] f4038b;

    public l() {
        a();
    }

    public static l[] b() {
        if (f4036c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4036c == null) {
                        f4036c = new l[0];
                    }
                } finally {
                }
            }
        }
        return f4036c;
    }

    public final l a() {
        this.f4037a = 10000L;
        this.f4038b = k.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f4037a;
        if (j2 != 10000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(1, j2);
        }
        k[] kVarArr = this.f4038b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                k[] kVarArr2 = this.f4038b;
                if (i2 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i2];
                if (kVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, kVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f4037a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j2);
        }
        k[] kVarArr = this.f4038b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                k[] kVarArr2 = this.f4038b;
                if (i2 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i2];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, kVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4037a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                k[] kVarArr = this.f4038b;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                k[] kVarArr2 = new k[i2];
                if (length != 0) {
                    System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    k kVar = new k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                k kVar2 = new k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f4038b = kVarArr2;
            }
        }
    }

    public static l b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new l().mergeFrom(codedInputByteBufferNano);
    }

    public static l a(byte[] bArr) {
        return (l) MessageNano.mergeFrom(new l(), bArr);
    }
}
