package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class s extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile s[] f2810d;

    /* renamed from: a, reason: collision with root package name */
    public String f2811a;

    /* renamed from: b, reason: collision with root package name */
    public long f2812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2813c;

    public s() {
        a();
    }

    public final void a() {
        this.f2811a = "";
        this.f2812b = 0L;
        this.f2813c = false;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2811a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f2811a);
        }
        long j2 = this.f2812b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        boolean z2 = this.f2813c;
        return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, z2) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2811a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f2812b = codedInputByteBufferNano.readInt64();
            } else if (readTag == 24) {
                this.f2813c = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2811a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2811a);
        }
        long j2 = this.f2812b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        boolean z2 = this.f2813c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
