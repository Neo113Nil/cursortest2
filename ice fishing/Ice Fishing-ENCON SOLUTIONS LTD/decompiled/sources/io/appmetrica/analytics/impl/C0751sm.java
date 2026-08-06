package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751sm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0751sm[] f6915c;

    /* renamed from: a, reason: collision with root package name */
    public String f6916a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6917b;

    public C0751sm() {
        a();
    }

    public static C0751sm[] b() {
        if (f6915c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6915c == null) {
                        f6915c = new C0751sm[0];
                    }
                } finally {
                }
            }
        }
        return f6915c;
    }

    public final C0751sm a() {
        this.f6916a = "";
        this.f6917b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6916a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6916a);
        }
        return !Arrays.equals(this.f6917b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6917b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6916a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6916a);
        }
        if (!Arrays.equals(this.f6917b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6917b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0751sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6916a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6917b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0751sm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0751sm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0751sm a(byte[] bArr) {
        return (C0751sm) MessageNano.mergeFrom(new C0751sm(), bArr);
    }
}
