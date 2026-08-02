package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class y extends MessageNano {
    public static volatile y[] f;
    public C[] a;
    public String b;
    public boolean c;
    public String d;
    public long e;

    public y() {
        a();
    }

    public static y[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new y[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C[] cArr = this.a;
                int length = cArr == null ? 0 : cArr.length;
                int i = repeatedFieldArrayLength + length;
                C[] cArr2 = new C[i];
                if (length != 0) {
                    System.arraycopy(cArr, 0, cArr2, 0, length);
                }
                while (length < i - 1) {
                    C c = new C();
                    cArr2[length] = c;
                    codedInputByteBufferNano.readMessage(c);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C c2 = new C();
                cArr2[length] = c2;
                codedInputByteBufferNano.readMessage(c2);
                this.a = cArr2;
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readBool();
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C[] cArr = this.a;
        if (cArr != null && cArr.length > 0) {
            int i = 0;
            while (true) {
                C[] cArr2 = this.a;
                if (i >= cArr2.length) {
                    break;
                }
                C c = cArr2[i];
                if (c != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c) + computeSerializedSize;
                }
                i++;
            }
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        boolean z = this.c;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        if (!this.d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        long j = this.e;
        return j != 10000 ? CodedOutputByteBufferNano.computeInt64Size(5, j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C[] cArr = this.a;
        if (cArr != null && cArr.length > 0) {
            int i = 0;
            while (true) {
                C[] cArr2 = this.a;
                if (i >= cArr2.length) {
                    break;
                }
                C c = cArr2[i];
                if (c != null) {
                    codedOutputByteBufferNano.writeMessage(1, c);
                }
                i++;
            }
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        boolean z = this.c;
        if (!z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        long j = this.e;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(5, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static y b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new y().mergeFrom(codedInputByteBufferNano);
    }

    public final y a() {
        this.a = C.b();
        this.b = "";
        this.c = true;
        this.d = "";
        this.e = 10000L;
        this.cachedSize = -1;
        return this;
    }

    public static y a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (y) MessageNano.mergeFrom(new y(), bArr);
    }
}
