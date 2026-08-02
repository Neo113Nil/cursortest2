package io.appmetrica.analytics.networkquality.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class j extends MessageNano {
    public static volatile j[] e;
    public boolean a;
    public int b;
    public int c;
    public i[] d;

    public j() {
        a();
    }

    public static j[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new j[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readInt32();
            } else if (readTag == 24) {
                this.c = codedInputByteBufferNano.readInt32();
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                i[] iVarArr = this.d;
                int length = iVarArr == null ? 0 : iVarArr.length;
                int i = repeatedFieldArrayLength + length;
                i[] iVarArr2 = new i[i];
                if (length != 0) {
                    System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                }
                while (length < i - 1) {
                    i iVar = new i();
                    iVarArr2[length] = iVar;
                    codedInputByteBufferNano.readMessage(iVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                i iVar2 = new i();
                iVarArr2[length] = iVar2;
                codedInputByteBufferNano.readMessage(iVar2);
                this.d = iVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        int i = this.b;
        if (i != 10) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i);
        }
        int i2 = this.c;
        if (i2 != 300) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        i[] iVarArr = this.d;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                i[] iVarArr2 = this.d;
                if (i3 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i3];
                if (iVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, iVar) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        int i = this.b;
        if (i != 10) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        int i2 = this.c;
        if (i2 != 300) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        i[] iVarArr = this.d;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                i[] iVarArr2 = this.d;
                if (i3 >= iVarArr2.length) {
                    break;
                }
                i iVar = iVarArr2[i3];
                if (iVar != null) {
                    codedOutputByteBufferNano.writeMessage(4, iVar);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static j b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new j().mergeFrom(codedInputByteBufferNano);
    }

    public final j a() {
        this.a = true;
        this.b = 10;
        this.c = 300;
        this.d = i.b();
        this.cachedSize = -1;
        return this;
    }

    public static j a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (j) MessageNano.mergeFrom(new j(), bArr);
    }
}
