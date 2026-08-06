package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660p8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0660p8[] f6729d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6730a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6731b;

    /* renamed from: c, reason: collision with root package name */
    public C0686q8 f6732c;

    public C0660p8() {
        a();
    }

    public static C0660p8[] b() {
        if (f6729d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6729d == null) {
                        f6729d = new C0660p8[0];
                    }
                } finally {
                }
            }
        }
        return f6729d;
    }

    public final C0660p8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6730a = bArr;
        this.f6731b = bArr;
        this.f6732c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6730a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6730a);
        }
        if (!Arrays.equals(this.f6731b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6731b);
        }
        C0686q8 c0686q8 = this.f6732c;
        return c0686q8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c0686q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6730a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6730a);
        }
        if (!Arrays.equals(this.f6731b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6731b);
        }
        C0686q8 c0686q8 = this.f6732c;
        if (c0686q8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0686q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0660p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6730a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6731b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6732c == null) {
                    this.f6732c = new C0686q8();
                }
                codedInputByteBufferNano.readMessage(this.f6732c);
            }
        }
    }

    public static C0660p8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0660p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0660p8 a(byte[] bArr) {
        return (C0660p8) MessageNano.mergeFrom(new C0660p8(), bArr);
    }
}
