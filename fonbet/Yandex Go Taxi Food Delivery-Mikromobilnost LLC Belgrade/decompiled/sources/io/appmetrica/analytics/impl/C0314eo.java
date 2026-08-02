package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0314eo extends MessageNano {
    public static volatile C0314eo[] b;
    public C0343fo[] a;

    public C0314eo() {
        a();
    }

    public static C0314eo[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C0314eo[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0314eo mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0343fo[] c0343foArr = this.a;
                int length = c0343foArr == null ? 0 : c0343foArr.length;
                int i = repeatedFieldArrayLength + length;
                C0343fo[] c0343foArr2 = new C0343fo[i];
                if (length != 0) {
                    System.arraycopy(c0343foArr, 0, c0343foArr2, 0, length);
                }
                while (length < i - 1) {
                    C0343fo c0343fo = new C0343fo();
                    c0343foArr2[length] = c0343fo;
                    codedInputByteBufferNano.readMessage(c0343fo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0343fo c0343fo2 = new C0343fo();
                c0343foArr2[length] = c0343fo2;
                codedInputByteBufferNano.readMessage(c0343fo2);
                this.a = c0343foArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0343fo[] c0343foArr = this.a;
        if (c0343foArr != null && c0343foArr.length > 0) {
            int i = 0;
            while (true) {
                C0343fo[] c0343foArr2 = this.a;
                if (i >= c0343foArr2.length) {
                    break;
                }
                C0343fo c0343fo = c0343foArr2[i];
                if (c0343fo != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0343fo) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0343fo[] c0343foArr = this.a;
        if (c0343foArr != null && c0343foArr.length > 0) {
            int i = 0;
            while (true) {
                C0343fo[] c0343foArr2 = this.a;
                if (i >= c0343foArr2.length) {
                    break;
                }
                C0343fo c0343fo = c0343foArr2[i];
                if (c0343fo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0343fo);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0314eo b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0314eo().mergeFrom(codedInputByteBufferNano);
    }

    public final C0314eo a() {
        this.a = C0343fo.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0314eo a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0314eo) MessageNano.mergeFrom(new C0314eo(), bArr);
    }
}
