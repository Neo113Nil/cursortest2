package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class Jh extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile Jh[] g;
    public Hh a;
    public Ih[] b;

    public Jh() {
        a();
    }

    public static Jh[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new Jh[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new Hh();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Ih[] ihArr = this.b;
                int length = ihArr == null ? 0 : ihArr.length;
                int i = repeatedFieldArrayLength + length;
                Ih[] ihArr2 = new Ih[i];
                if (length != 0) {
                    System.arraycopy(ihArr, 0, ihArr2, 0, length);
                }
                while (length < i - 1) {
                    Ih ih = new Ih();
                    ihArr2[length] = ih;
                    codedInputByteBufferNano.readMessage(ih);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Ih ih2 = new Ih();
                ihArr2[length] = ih2;
                codedInputByteBufferNano.readMessage(ih2);
                this.b = ihArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Hh hh = this.a;
        if (hh != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, hh);
        }
        Ih[] ihArr = this.b;
        if (ihArr != null && ihArr.length > 0) {
            int i = 0;
            while (true) {
                Ih[] ihArr2 = this.b;
                if (i >= ihArr2.length) {
                    break;
                }
                Ih ih = ihArr2[i];
                if (ih != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, ih) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Hh hh = this.a;
        if (hh != null) {
            codedOutputByteBufferNano.writeMessage(1, hh);
        }
        Ih[] ihArr = this.b;
        if (ihArr != null && ihArr.length > 0) {
            int i = 0;
            while (true) {
                Ih[] ihArr2 = this.b;
                if (i >= ihArr2.length) {
                    break;
                }
                Ih ih = ihArr2[i];
                if (ih != null) {
                    codedOutputByteBufferNano.writeMessage(2, ih);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Jh b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Jh().mergeFrom(codedInputByteBufferNano);
    }

    public final Jh a() {
        this.a = null;
        this.b = Ih.b();
        this.cachedSize = -1;
        return this;
    }

    public static Jh a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Jh) MessageNano.mergeFrom(new Jh(), bArr);
    }
}
