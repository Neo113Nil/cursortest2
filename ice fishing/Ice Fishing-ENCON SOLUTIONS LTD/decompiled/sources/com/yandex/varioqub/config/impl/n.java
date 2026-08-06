package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class n extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n[] f2783c;

    /* renamed from: a, reason: collision with root package name */
    public String f2784a;

    /* renamed from: b, reason: collision with root package name */
    public String f2785b;

    public n() {
        a();
    }

    public final void a() {
        this.f2784a = "";
        this.f2785b = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2784a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f2784a);
        }
        return !this.f2785b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f2785b) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2784a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f2785b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2784a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2784a);
        }
        if (!this.f2785b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2785b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
