package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324c8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0324c8[] f5728c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5729a;

    /* renamed from: b, reason: collision with root package name */
    public C0427g8 f5730b;

    public C0324c8() {
        a();
    }

    public static C0324c8[] b() {
        if (f5728c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5728c == null) {
                        f5728c = new C0324c8[0];
                    }
                } finally {
                }
            }
        }
        return f5728c;
    }

    public final C0324c8 a() {
        this.f5729a = WireFormatNano.EMPTY_BYTES;
        this.f5730b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5729a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5729a);
        }
        C0427g8 c0427g8 = this.f5730b;
        return c0427g8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0427g8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f5729a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5729a);
        }
        C0427g8 c0427g8 = this.f5730b;
        if (c0427g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0427g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0324c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5729a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5730b == null) {
                    this.f5730b = new C0427g8();
                }
                codedInputByteBufferNano.readMessage(this.f5730b);
            }
        }
    }

    public static C0324c8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0324c8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0324c8 a(byte[] bArr) {
        return (C0324c8) MessageNano.mergeFrom(new C0324c8(), bArr);
    }
}
