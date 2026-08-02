package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class x extends MessageNano {
    public static volatile x[] e;
    public D a;
    public y[] b;
    public long c;
    public long d;

    public x() {
        a();
    }

    public static x[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new x[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new D();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                y[] yVarArr = this.b;
                int length = yVarArr == null ? 0 : yVarArr.length;
                int i = repeatedFieldArrayLength + length;
                y[] yVarArr2 = new y[i];
                if (length != 0) {
                    System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                }
                while (length < i - 1) {
                    y yVar = new y();
                    yVarArr2[length] = yVar;
                    codedInputByteBufferNano.readMessage(yVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                y yVar2 = new y();
                yVarArr2[length] = yVar2;
                codedInputByteBufferNano.readMessage(yVar2);
                this.b = yVarArr2;
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readInt64();
            } else if (readTag == 32) {
                this.d = codedInputByteBufferNano.readInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        D d = this.a;
        if (d != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, d);
        }
        y[] yVarArr = this.b;
        if (yVarArr != null && yVarArr.length > 0) {
            int i = 0;
            while (true) {
                y[] yVarArr2 = this.b;
                if (i >= yVarArr2.length) {
                    break;
                }
                y yVar = yVarArr2[i];
                if (yVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, yVar) + computeSerializedSize;
                }
                i++;
            }
        }
        long j = this.c;
        if (j != 5000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        long j2 = this.d;
        return j2 != 0 ? CodedOutputByteBufferNano.computeInt64Size(4, j2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D d = this.a;
        if (d != null) {
            codedOutputByteBufferNano.writeMessage(1, d);
        }
        y[] yVarArr = this.b;
        if (yVarArr != null && yVarArr.length > 0) {
            int i = 0;
            while (true) {
                y[] yVarArr2 = this.b;
                if (i >= yVarArr2.length) {
                    break;
                }
                y yVar = yVarArr2[i];
                if (yVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, yVar);
                }
                i++;
            }
        }
        long j = this.c;
        if (j != 5000) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(4, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static x b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new x().mergeFrom(codedInputByteBufferNano);
    }

    public final x a() {
        this.a = null;
        this.b = y.b();
        this.c = 5000L;
        this.d = 0L;
        this.cachedSize = -1;
        return this;
    }

    public static x a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (x) MessageNano.mergeFrom(new x(), bArr);
    }
}
