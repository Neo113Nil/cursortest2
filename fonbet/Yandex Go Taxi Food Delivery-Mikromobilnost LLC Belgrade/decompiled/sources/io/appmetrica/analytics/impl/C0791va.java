package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.va, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0791va extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile C0791va[] q;
    public long a;
    public C0762ua b;
    public C0733ta[] c;

    public C0791va() {
        a();
    }

    public static C0791va[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C0791va[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0791va mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C0762ua();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0733ta[] c0733taArr = this.c;
                int length = c0733taArr == null ? 0 : c0733taArr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0733ta[] c0733taArr2 = new C0733ta[i2];
                if (length != 0) {
                    System.arraycopy(c0733taArr, 0, c0733taArr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0733ta c0733ta = new C0733ta();
                    c0733taArr2[length] = c0733ta;
                    codedInputByteBufferNano.readMessage(c0733ta);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0733ta c0733ta2 = new C0733ta();
                c0733taArr2[length] = c0733ta2;
                codedInputByteBufferNano.readMessage(c0733ta2);
                this.c = c0733taArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C0762ua c0762ua = this.b;
        if (c0762ua != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c0762ua);
        }
        C0733ta[] c0733taArr = this.c;
        if (c0733taArr != null && c0733taArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0733ta[] c0733taArr2 = this.c;
                if (i2 >= c0733taArr2.length) {
                    break;
                }
                C0733ta c0733ta = c0733taArr2[i2];
                if (c0733ta != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0733ta) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        C0762ua c0762ua = this.b;
        if (c0762ua != null) {
            codedOutputByteBufferNano.writeMessage(2, c0762ua);
        }
        C0733ta[] c0733taArr = this.c;
        if (c0733taArr != null && c0733taArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0733ta[] c0733taArr2 = this.c;
                if (i2 >= c0733taArr2.length) {
                    break;
                }
                C0733ta c0733ta = c0733taArr2[i2];
                if (c0733ta != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0733ta);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0791va b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0791va().mergeFrom(codedInputByteBufferNano);
    }

    public final C0791va a() {
        this.a = 0L;
        this.b = null;
        this.c = C0733ta.b();
        this.cachedSize = -1;
        return this;
    }

    public static C0791va a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0791va) MessageNano.mergeFrom(new C0791va(), bArr);
    }
}
