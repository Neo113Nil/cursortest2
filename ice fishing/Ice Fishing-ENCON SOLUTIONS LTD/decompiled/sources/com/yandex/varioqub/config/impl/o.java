package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class o extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile o[] f2786c;

    /* renamed from: a, reason: collision with root package name */
    public String f2787a;

    /* renamed from: b, reason: collision with root package name */
    public double f2788b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f2786c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f2786c == null) {
                        f2786c = new o[0];
                    }
                } finally {
                }
            }
        }
        return f2786c;
    }

    public final void a() {
        this.f2787a = "";
        this.f2788b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2787a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f2787a);
        }
        return Double.doubleToLongBits(this.f2788b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE) ? computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(2, this.f2788b) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2787a = codedInputByteBufferNano.readString();
            } else if (readTag == 17) {
                this.f2788b = codedInputByteBufferNano.readDouble();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2787a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2787a);
        }
        if (Double.doubleToLongBits(this.f2788b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f2788b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
