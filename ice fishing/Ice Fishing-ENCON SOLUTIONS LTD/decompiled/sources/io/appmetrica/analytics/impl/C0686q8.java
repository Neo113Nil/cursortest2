package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686q8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0686q8[] f6769e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6770a;

    /* renamed from: b, reason: collision with root package name */
    public C0401f8 f6771b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6772c;

    /* renamed from: d, reason: collision with root package name */
    public C0556l8 f6773d;

    public C0686q8() {
        a();
    }

    public static C0686q8[] b() {
        if (f6769e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6769e == null) {
                        f6769e = new C0686q8[0];
                    }
                } finally {
                }
            }
        }
        return f6769e;
    }

    public final C0686q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6770a = bArr;
        this.f6771b = null;
        this.f6772c = bArr;
        this.f6773d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6770a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6770a);
        }
        C0401f8 c0401f8 = this.f6771b;
        if (c0401f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0401f8);
        }
        if (!Arrays.equals(this.f6772c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f6772c);
        }
        C0556l8 c0556l8 = this.f6773d;
        return c0556l8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c0556l8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6770a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6770a);
        }
        C0401f8 c0401f8 = this.f6771b;
        if (c0401f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0401f8);
        }
        if (!Arrays.equals(this.f6772c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f6772c);
        }
        C0556l8 c0556l8 = this.f6773d;
        if (c0556l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0556l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0686q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6770a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f6771b == null) {
                    this.f6771b = new C0401f8();
                }
                codedInputByteBufferNano.readMessage(this.f6771b);
            } else if (readTag == 26) {
                this.f6772c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6773d == null) {
                    this.f6773d = new C0556l8();
                }
                codedInputByteBufferNano.readMessage(this.f6773d);
            }
        }
    }

    public static C0686q8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0686q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0686q8 a(byte[] bArr) {
        return (C0686q8) MessageNano.mergeFrom(new C0686q8(), bArr);
    }
}
