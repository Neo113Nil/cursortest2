package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0554n4 extends MessageNano {
    public static volatile C0554n4[] c;
    public C0612p4 a;
    public int b;

    public C0554n4() {
        a();
    }

    public static C0554n4[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C0554n4[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0554n4 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C0612p4();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.b = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0612p4 c0612p4 = this.a;
        if (c0612p4 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0612p4);
        }
        int i = this.b;
        return i != 0 ? CodedOutputByteBufferNano.computeInt32Size(2, i) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0612p4 c0612p4 = this.a;
        if (c0612p4 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0612p4);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0554n4 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0554n4().mergeFrom(codedInputByteBufferNano);
    }

    public final C0554n4 a() {
        this.a = null;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public static C0554n4 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0554n4) MessageNano.mergeFrom(new C0554n4(), bArr);
    }
}
