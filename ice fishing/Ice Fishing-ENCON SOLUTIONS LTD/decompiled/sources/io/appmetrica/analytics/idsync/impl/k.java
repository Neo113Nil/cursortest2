package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.impl.C0376e9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static volatile k[] f4026j;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4027a;

    /* renamed from: b, reason: collision with root package name */
    public j f4028b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4029c;

    /* renamed from: d, reason: collision with root package name */
    public i[] f4030d;

    /* renamed from: e, reason: collision with root package name */
    public long f4031e;

    /* renamed from: f, reason: collision with root package name */
    public long f4032f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4033g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4034h;

    /* renamed from: i, reason: collision with root package name */
    public String f4035i;

    public k() {
        a();
    }

    public static k[] b() {
        if (f4026j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4026j == null) {
                        f4026j = new k[0];
                    }
                } finally {
                }
            }
        }
        return f4026j;
    }

    public final k a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4027a = bArr;
        this.f4028b = null;
        this.f4029c = bArr;
        this.f4030d = i.b();
        this.f4031e = 86400000L;
        this.f4032f = 3600000L;
        this.f4033g = WireFormatNano.EMPTY_INT_ARRAY;
        this.f4034h = true;
        this.f4035i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4027a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f4027a);
        }
        j jVar = this.f4028b;
        if (jVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, jVar);
        }
        if (!Arrays.equals(this.f4029c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f4029c);
        }
        i[] iVarArr = this.f4030d;
        int i2 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                i[] iVarArr2 = this.f4030d;
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
        long j2 = this.f4031e;
        if (j2 != 86400000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j2);
        }
        long j3 = this.f4032f;
        if (j3 != 3600000) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(6, j3);
        }
        int[] iArr2 = this.f4033g;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f4033g;
                if (i2 >= iArr.length) {
                    break;
                }
                i4 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(iArr[i2]);
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i4 + iArr.length;
        }
        boolean z2 = this.f4034h;
        if (!z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        return !this.f4035i.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(9, this.f4035i) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4027a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4027a);
        }
        j jVar = this.f4028b;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(2, jVar);
        }
        if (!Arrays.equals(this.f4029c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f4029c);
        }
        i[] iVarArr = this.f4030d;
        int i2 = 0;
        if (iVarArr != null && iVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                i[] iVarArr2 = this.f4030d;
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
        long j2 = this.f4031e;
        if (j2 != 86400000) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        long j3 = this.f4032f;
        if (j3 != 3600000) {
            codedOutputByteBufferNano.writeUInt64(6, j3);
        }
        int[] iArr = this.f4033g;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f4033g;
                if (i2 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeUInt32(7, iArr2[i2]);
                i2++;
            }
        }
        boolean z2 = this.f4034h;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        if (!this.f4035i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f4035i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static k b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new k().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f4027a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f4028b == null) {
                        this.f4028b = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f4028b);
                    break;
                case C0376e9.G /* 26 */:
                    this.f4029c = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    i[] iVarArr = this.f4030d;
                    int length = iVarArr == null ? 0 : iVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    i[] iVarArr2 = new i[i2];
                    if (length != 0) {
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        i iVar = new i();
                        iVarArr2[length] = iVar;
                        codedInputByteBufferNano.readMessage(iVar);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    i iVar2 = new i();
                    iVarArr2[length] = iVar2;
                    codedInputByteBufferNano.readMessage(iVar2);
                    this.f4030d = iVarArr2;
                    break;
                case C0376e9.f5890L /* 40 */:
                    this.f4031e = codedInputByteBufferNano.readUInt64();
                    break;
                case 48:
                    this.f4032f = codedInputByteBufferNano.readUInt64();
                    break;
                case 56:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 56);
                    int[] iArr = this.f4033g;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    int[] iArr2 = new int[i3];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        iArr2[length2] = codedInputByteBufferNano.readUInt32();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    iArr2[length2] = codedInputByteBufferNano.readUInt32();
                    this.f4033g = iArr2;
                    break;
                case 58:
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i4 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        codedInputByteBufferNano.readUInt32();
                        i4++;
                    }
                    codedInputByteBufferNano.rewindToPosition(position);
                    int[] iArr3 = this.f4033g;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i5 = i4 + length3;
                    int[] iArr4 = new int[i5];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i5) {
                        iArr4[length3] = codedInputByteBufferNano.readUInt32();
                        length3++;
                    }
                    this.f4033g = iArr4;
                    codedInputByteBufferNano.popLimit(pushLimit);
                    break;
                case 64:
                    this.f4034h = codedInputByteBufferNano.readBool();
                    break;
                case 74:
                    this.f4035i = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static k a(byte[] bArr) {
        return (k) MessageNano.mergeFrom(new k(), bArr);
    }
}
