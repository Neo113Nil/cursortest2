package io.appmetrica.analytics.networkquality.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class i extends MessageNano {
    public static volatile i[] n;
    public String a;
    public String b;
    public h[] c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    public i() {
        a();
    }

    public static i[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new i[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    h[] hVarArr = this.c;
                    int length = hVarArr == null ? 0 : hVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    h[] hVarArr2 = new h[i];
                    if (length != 0) {
                        System.arraycopy(hVarArr, 0, hVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        h hVar = new h();
                        hVarArr2[length] = hVar;
                        codedInputByteBufferNano.readMessage(hVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    h hVar2 = new h();
                    hVarArr2[length] = hVar2;
                    codedInputByteBufferNano.readMessage(hVar2);
                    this.c = hVarArr2;
                    break;
                case 34:
                    this.d = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.h = codedInputByteBufferNano.readInt32();
                    break;
                case 72:
                    this.i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.j = codedInputByteBufferNano.readInt32();
                    break;
                case HProv.ALG_SID_KECCAK_224 /* 88 */:
                    this.k = codedInputByteBufferNano.readBool();
                    break;
                case HProv.PP_RESERVED1 /* 96 */:
                    this.l = codedInputByteBufferNano.readBool();
                    break;
                case 104:
                    this.m = codedInputByteBufferNano.readBool();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        if (!this.b.equals("GET")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        h[] hVarArr = this.c;
        if (hVarArr != null && hVarArr.length > 0) {
            int i = 0;
            while (true) {
                h[] hVarArr2 = this.c;
                if (i >= hVarArr2.length) {
                    break;
                }
                h hVar = hVarArr2[i];
                if (hVar != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, hVar) + computeSerializedSize;
                }
                i++;
            }
        }
        if (!this.d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i2);
        }
        int i3 = this.f;
        if (i3 != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i3);
        }
        int i4 = this.g;
        if (i4 != 250) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        int i5 = this.h;
        if (i5 != 150) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
        }
        int i6 = this.i;
        if (i6 != 5) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i6);
        }
        int i7 = this.j;
        if (i7 != 10) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i7);
        }
        boolean z = this.k;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, z);
        }
        boolean z2 = this.l;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(12, z2);
        }
        boolean z3 = this.m;
        return z3 ? CodedOutputByteBufferNano.computeBoolSize(13, z3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("GET")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        h[] hVarArr = this.c;
        if (hVarArr != null && hVarArr.length > 0) {
            int i = 0;
            while (true) {
                h[] hVarArr2 = this.c;
                if (i >= hVarArr2.length) {
                    break;
                }
                h hVar = hVarArr2[i];
                if (hVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, hVar);
                }
                i++;
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i2);
        }
        int i3 = this.f;
        if (i3 != 2) {
            codedOutputByteBufferNano.writeInt32(6, i3);
        }
        int i4 = this.g;
        if (i4 != 250) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        int i5 = this.h;
        if (i5 != 150) {
            codedOutputByteBufferNano.writeInt32(8, i5);
        }
        int i6 = this.i;
        if (i6 != 5) {
            codedOutputByteBufferNano.writeInt32(9, i6);
        }
        int i7 = this.j;
        if (i7 != 10) {
            codedOutputByteBufferNano.writeInt32(10, i7);
        }
        boolean z = this.k;
        if (z) {
            codedOutputByteBufferNano.writeBool(11, z);
        }
        boolean z2 = this.l;
        if (z2) {
            codedOutputByteBufferNano.writeBool(12, z2);
        }
        boolean z3 = this.m;
        if (z3) {
            codedOutputByteBufferNano.writeBool(13, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static i b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new i().mergeFrom(codedInputByteBufferNano);
    }

    public final i a() {
        this.a = "";
        this.b = "GET";
        this.c = h.b();
        this.d = "";
        this.e = 0;
        this.f = 2;
        this.g = 250;
        this.h = 150;
        this.i = 5;
        this.j = 10;
        this.k = false;
        this.l = false;
        this.m = false;
        this.cachedSize = -1;
        return this;
    }

    public static i a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (i) MessageNano.mergeFrom(new i(), bArr);
    }
}
