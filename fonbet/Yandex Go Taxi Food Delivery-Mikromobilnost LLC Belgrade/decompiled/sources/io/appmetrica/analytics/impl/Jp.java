package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class Jp extends MessageNano {
    public static volatile Jp[] b;
    public Ip[] a;

    public Jp() {
        a();
    }

    public static Jp[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new Jp[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Jp mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Ip[] ipArr = this.a;
                int length = ipArr == null ? 0 : ipArr.length;
                int i = repeatedFieldArrayLength + length;
                Ip[] ipArr2 = new Ip[i];
                if (length != 0) {
                    System.arraycopy(ipArr, 0, ipArr2, 0, length);
                }
                while (length < i - 1) {
                    Ip ip = new Ip();
                    ipArr2[length] = ip;
                    codedInputByteBufferNano.readMessage(ip);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Ip ip2 = new Ip();
                ipArr2[length] = ip2;
                codedInputByteBufferNano.readMessage(ip2);
                this.a = ipArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ip[] ipArr = this.a;
        if (ipArr != null && ipArr.length > 0) {
            int i = 0;
            while (true) {
                Ip[] ipArr2 = this.a;
                if (i >= ipArr2.length) {
                    break;
                }
                Ip ip = ipArr2[i];
                if (ip != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, ip) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Ip[] ipArr = this.a;
        if (ipArr != null && ipArr.length > 0) {
            int i = 0;
            while (true) {
                Ip[] ipArr2 = this.a;
                if (i >= ipArr2.length) {
                    break;
                }
                Ip ip = ipArr2[i];
                if (ip != null) {
                    codedOutputByteBufferNano.writeMessage(1, ip);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Jp b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Jp().mergeFrom(codedInputByteBufferNano);
    }

    public final Jp a() {
        this.a = Ip.b();
        this.cachedSize = -1;
        return this;
    }

    public static Jp a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Jp) MessageNano.mergeFrom(new Jp(), bArr);
    }
}
