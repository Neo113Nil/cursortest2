package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class V6 extends MessageNano {
    public static volatile V6[] g;
    public String a;
    public int b;
    public long c;
    public String d;
    public int e;
    public U6[] f;

    public V6() {
        a();
    }

    public static V6[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new V6[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 50) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                U6[] u6Arr = this.f;
                int length = u6Arr == null ? 0 : u6Arr.length;
                int i = repeatedFieldArrayLength + length;
                U6[] u6Arr2 = new U6[i];
                if (length != 0) {
                    System.arraycopy(u6Arr, 0, u6Arr2, 0, length);
                }
                while (length < i - 1) {
                    U6 u6 = new U6();
                    u6Arr2[length] = u6;
                    codedInputByteBufferNano.readMessage(u6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                U6 u62 = new U6();
                u6Arr2[length] = u62;
                codedInputByteBufferNano.readMessage(u62);
                this.f = u6Arr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.b) + CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        if (!this.d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        int i = this.e;
        if (i != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        U6[] u6Arr = this.f;
        if (u6Arr != null && u6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                U6[] u6Arr2 = this.f;
                if (i2 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i2];
                if (u6 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, u6) + computeSInt64Size;
                }
                i2++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        codedOutputByteBufferNano.writeSInt32(2, this.b);
        codedOutputByteBufferNano.writeSInt64(3, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        int i = this.e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        U6[] u6Arr = this.f;
        if (u6Arr != null && u6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                U6[] u6Arr2 = this.f;
                if (i2 >= u6Arr2.length) {
                    break;
                }
                U6 u6 = u6Arr2[i2];
                if (u6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, u6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static V6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V6().mergeFrom(codedInputByteBufferNano);
    }

    public final V6 a() {
        this.a = "";
        this.b = 0;
        this.c = 0L;
        this.d = "";
        this.e = 0;
        this.f = U6.b();
        this.cachedSize = -1;
        return this;
    }

    public static V6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V6) MessageNano.mergeFrom(new V6(), bArr);
    }
}
