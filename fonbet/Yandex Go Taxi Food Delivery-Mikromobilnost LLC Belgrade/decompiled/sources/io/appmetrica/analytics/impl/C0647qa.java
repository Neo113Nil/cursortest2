package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0647qa extends MessageNano {
    public static volatile C0647qa[] n;
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public int k;
    public C0618pa[] l;
    public String m;

    public C0647qa() {
        a();
    }

    public static C0647qa[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new C0647qa[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0647qa mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                case 34:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case HProv.PP_LCD_QUERY /* 136 */:
                    this.g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.i = codedInputByteBufferNano.readString();
                    break;
                case MSException.ERROR_BUSY /* 170 */:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0618pa[] c0618paArr = this.l;
                    int length = c0618paArr == null ? 0 : c0618paArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0618pa[] c0618paArr2 = new C0618pa[i];
                    if (length != 0) {
                        System.arraycopy(c0618paArr, 0, c0618paArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C0618pa c0618pa = new C0618pa();
                        c0618paArr2[length] = c0618pa;
                        codedInputByteBufferNano.readMessage(c0618pa);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0618pa c0618pa2 = new C0618pa();
                    c0618paArr2[length] = c0618pa2;
                    codedInputByteBufferNano.readMessage(c0618pa2);
                    this.l = c0618paArr2;
                    break;
                case 194:
                    this.m = codedInputByteBufferNano.readString();
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
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        if (!this.c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.c);
        }
        int i = this.d;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.e);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f);
        }
        boolean z = this.g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i2 = this.h;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i2);
        }
        if (!this.i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.i);
        }
        if (!this.j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.j);
        }
        int i3 = this.k;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i3);
        }
        C0618pa[] c0618paArr = this.l;
        if (c0618paArr != null && c0618paArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0618pa[] c0618paArr2 = this.l;
                if (i4 >= c0618paArr2.length) {
                    break;
                }
                C0618pa c0618pa = c0618paArr2[i4];
                if (c0618pa != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0618pa) + computeSerializedSize;
                }
                i4++;
            }
        }
        return !this.m.equals("") ? CodedOutputByteBufferNano.computeStringSize(24, this.m) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.c);
        }
        int i = this.d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f);
        }
        boolean z = this.g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i2);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.j);
        }
        int i3 = this.k;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i3);
        }
        C0618pa[] c0618paArr = this.l;
        if (c0618paArr != null && c0618paArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0618pa[] c0618paArr2 = this.l;
                if (i4 >= c0618paArr2.length) {
                    break;
                }
                C0618pa c0618pa = c0618paArr2[i4];
                if (c0618pa != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0618pa);
                }
                i4++;
            }
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0647qa b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0647qa().mergeFrom(codedInputByteBufferNano);
    }

    public final C0647qa a() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = 0;
        this.i = "";
        this.j = "";
        this.k = 0;
        this.l = C0618pa.b();
        this.m = "";
        this.cachedSize = -1;
        return this;
    }

    public static C0647qa a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0647qa) MessageNano.mergeFrom(new C0647qa(), bArr);
    }
}
