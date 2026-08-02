package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class E9 extends MessageNano {
    public static volatile E9[] e;
    public byte[] a;
    public C0732t9 b;
    public byte[] c;
    public C0906z9 d;

    public E9() {
        a();
    }

    public static E9[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new E9[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0732t9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                this.c = codedInputByteBufferNano.readBytes();
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C0906z9();
                }
                codedInputByteBufferNano.readMessage(this.d);
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
        C0732t9 c0732t9 = this.b;
        if (c0732t9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0732t9);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.c);
        }
        C0906z9 c0906z9 = this.d;
        return c0906z9 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0906z9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        C0732t9 c0732t9 = this.b;
        if (c0732t9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0732t9);
        }
        if (!Arrays.equals(this.c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.c);
        }
        C0906z9 c0906z9 = this.d;
        if (c0906z9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0906z9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static E9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E9().mergeFrom(codedInputByteBufferNano);
    }

    public final E9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = null;
        this.c = bArr;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public static E9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E9) MessageNano.mergeFrom(new E9(), bArr);
    }
}
