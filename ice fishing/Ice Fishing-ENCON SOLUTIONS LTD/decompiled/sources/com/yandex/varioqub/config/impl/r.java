package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class r extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public String f2806a;

    /* renamed from: b, reason: collision with root package name */
    public String f2807b;

    /* renamed from: c, reason: collision with root package name */
    public q[] f2808c;

    /* renamed from: d, reason: collision with root package name */
    public String f2809d;

    public r() {
        a();
    }

    public final void a() {
        this.f2806a = "";
        this.f2807b = "";
        if (q.f2803c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q.f2803c == null) {
                        q.f2803c = new q[0];
                    }
                } finally {
                }
            }
        }
        this.f2808c = q.f2803c;
        this.f2809d = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2806a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f2806a);
        }
        if (!this.f2807b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f2807b);
        }
        q[] qVarArr = this.f2808c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                q[] qVarArr2 = this.f2808c;
                if (i2 >= qVarArr2.length) {
                    break;
                }
                q qVar = qVarArr2[i2];
                if (qVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, qVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return !this.f2809d.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f2809d) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2806a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f2807b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                q[] qVarArr = this.f2808c;
                int length = qVarArr == null ? 0 : qVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                q[] qVarArr2 = new q[i2];
                if (length != 0) {
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    q qVar = new q();
                    qVarArr2[length] = qVar;
                    codedInputByteBufferNano.readMessage(qVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                q qVar2 = new q();
                qVarArr2[length] = qVar2;
                codedInputByteBufferNano.readMessage(qVar2);
                this.f2808c = qVarArr2;
            } else if (readTag == 34) {
                this.f2809d = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2806a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2806a);
        }
        if (!this.f2807b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2807b);
        }
        q[] qVarArr = this.f2808c;
        if (qVarArr != null && qVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                q[] qVarArr2 = this.f2808c;
                if (i2 >= qVarArr2.length) {
                    break;
                }
                q qVar = qVarArr2[i2];
                if (qVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, qVar);
                }
                i2++;
            }
        }
        if (!this.f2809d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f2809d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
