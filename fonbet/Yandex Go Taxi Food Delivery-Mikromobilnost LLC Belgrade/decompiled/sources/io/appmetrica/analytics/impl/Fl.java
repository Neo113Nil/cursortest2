package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class Fl extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;
    public static volatile Fl[] q;
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public Al e;
    public long f;
    public boolean g;
    public int h;
    public int i;
    public El j;
    public Dl k;

    public Fl() {
        a();
    }

    public static Fl[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new Fl[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Fl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new Al();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                    break;
                case 56:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.i = readInt322;
                        break;
                    }
                case 90:
                    if (this.j == null) {
                        this.j = new El();
                    }
                    codedInputByteBufferNano.readMessage(this.j);
                    break;
                case HProv.PP_REBOOT /* 98 */:
                    if (this.k == null) {
                        this.k = new Dl();
                    }
                    codedInputByteBufferNano.readMessage(this.k);
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
        int i = this.a;
        if (i != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.b) + computeSerializedSize;
        byte[] bArr = this.c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.c);
        }
        if (!Arrays.equals(this.d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.d);
        }
        Al al = this.e;
        if (al != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, al);
        }
        long j = this.f;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z = this.g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i2 = this.h;
        if (i2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.i;
        if (i3 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        El el = this.j;
        if (el != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, el);
        }
        Dl dl = this.k;
        return dl != null ? CodedOutputByteBufferNano.computeMessageSize(12, dl) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.b);
        byte[] bArr = this.c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.c);
        }
        if (!Arrays.equals(this.d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.d);
        }
        Al al = this.e;
        if (al != null) {
            codedOutputByteBufferNano.writeMessage(6, al);
        }
        long j = this.f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z = this.g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i2 = this.h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.i;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        El el = this.j;
        if (el != null) {
            codedOutputByteBufferNano.writeMessage(11, el);
        }
        Dl dl = this.k;
        if (dl != null) {
            codedOutputByteBufferNano.writeMessage(12, dl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Fl b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Fl().mergeFrom(codedInputByteBufferNano);
    }

    public final Fl a() {
        this.a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.b = bArr;
        this.c = bArr;
        this.d = bArr;
        this.e = null;
        this.f = 0L;
        this.g = false;
        this.h = 0;
        this.i = 1;
        this.j = null;
        this.k = null;
        this.cachedSize = -1;
        return this;
    }

    public static Fl a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Fl) MessageNano.mergeFrom(new Fl(), bArr);
    }
}
