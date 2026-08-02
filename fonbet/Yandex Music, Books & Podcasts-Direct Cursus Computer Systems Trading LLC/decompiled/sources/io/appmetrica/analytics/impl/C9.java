package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class C9 extends MessageNano {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static volatile C9[] o;
    public int a;
    public B9 b;
    public C0830z9 c;
    public A9 d;
    public C0427l9 e;
    public C0600r9 f;

    public C9() {
        a();
    }

    public static C9[] b() {
        if (o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (o == null) {
                        o = new C9[0];
                    }
                } finally {
                }
            }
        }
        return o;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.b == null) {
                        this.b = new B9();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                } else if (readTag == 26) {
                    if (this.c == null) {
                        this.c = new C0830z9();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                } else if (readTag == 34) {
                    if (this.d == null) {
                        this.d = new A9();
                    }
                    codedInputByteBufferNano.readMessage(this.d);
                } else if (readTag == 42) {
                    if (this.e == null) {
                        this.e = new C0427l9();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                } else if (readTag == 50) {
                    if (this.f == null) {
                        this.f = new C0600r9();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                }
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        B9 b9 = this.b;
        if (b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, b9);
        }
        C0830z9 c0830z9 = this.c;
        if (c0830z9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0830z9);
        }
        A9 a9 = this.d;
        if (a9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, a9);
        }
        C0427l9 c0427l9 = this.e;
        if (c0427l9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0427l9);
        }
        C0600r9 c0600r9 = this.f;
        return c0600r9 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c0600r9) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        B9 b9 = this.b;
        if (b9 != null) {
            codedOutputByteBufferNano.writeMessage(2, b9);
        }
        C0830z9 c0830z9 = this.c;
        if (c0830z9 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0830z9);
        }
        A9 a9 = this.d;
        if (a9 != null) {
            codedOutputByteBufferNano.writeMessage(4, a9);
        }
        C0427l9 c0427l9 = this.e;
        if (c0427l9 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0427l9);
        }
        C0600r9 c0600r9 = this.f;
        if (c0600r9 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0600r9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9().mergeFrom(codedInputByteBufferNano);
    }

    public final C9 a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    public static C9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9) MessageNano.mergeFrom(new C9(), bArr);
    }
}
