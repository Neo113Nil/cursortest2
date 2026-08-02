package io.appmetrica.analytics.locationinternal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0896n1 extends MessageNano {
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static volatile C0896n1[] w;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public C0896n1() {
        a();
    }

    public static C0896n1[] b() {
        if (w == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (w == null) {
                        w = new C0896n1[0];
                    }
                } finally {
                }
            }
        }
        return w;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0896n1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.a = codedInputByteBufferNano.readUInt32();
                    break;
                case 16:
                    this.b = codedInputByteBufferNano.readSInt32();
                    break;
                case 24:
                    this.c = codedInputByteBufferNano.readUInt32();
                    break;
                case 32:
                    this.d = codedInputByteBufferNano.readUInt32();
                    break;
                case 40:
                    this.e = codedInputByteBufferNano.readUInt32();
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    this.g = codedInputByteBufferNano.readBool();
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2 && readInt32 != 3 && readInt32 != 4) {
                        break;
                    } else {
                        this.h = readInt32;
                        break;
                    }
                case 72:
                    this.i = codedInputByteBufferNano.readUInt32();
                    break;
                case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                    this.j = codedInputByteBufferNano.readUInt64();
                    break;
                case 88:
                    this.k = codedInputByteBufferNano.readSInt32();
                    break;
                case 96:
                    this.l = codedInputByteBufferNano.readSInt32();
                    break;
                case 104:
                    this.m = codedInputByteBufferNano.readSInt32();
                    break;
                case 112:
                    this.n = codedInputByteBufferNano.readUInt32();
                    break;
                case 120:
                    this.o = codedInputByteBufferNano.readUInt32();
                    break;
                case 128:
                    this.p = codedInputByteBufferNano.readUInt32();
                    break;
                case 136:
                    this.q = codedInputByteBufferNano.readUInt32();
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
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i4);
        }
        int i5 = this.e;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i5);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        boolean z = this.g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
        }
        int i6 = this.h;
        if (i6 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i6);
        }
        int i7 = this.i;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, i7);
        }
        long j = this.j;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(10, j);
        }
        int i8 = this.k;
        if (i8 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(11, i8);
        }
        int i9 = this.l;
        if (i9 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(12, i9);
        }
        int i10 = this.m;
        if (i10 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(13, i10);
        }
        int i11 = this.n;
        if (i11 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(14, i11);
        }
        int i12 = this.o;
        if (i12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(15, i12);
        }
        int i13 = this.p;
        if (i13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(16, i13);
        }
        int i14 = this.q;
        return i14 != -1 ? CodedOutputByteBufferNano.computeUInt32Size(17, i14) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i4);
        }
        int i5 = this.e;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i5);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        boolean z = this.g;
        if (z) {
            codedOutputByteBufferNano.writeBool(7, z);
        }
        int i6 = this.h;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i6);
        }
        int i7 = this.i;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeUInt32(9, i7);
        }
        long j = this.j;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(10, j);
        }
        int i8 = this.k;
        if (i8 != 0) {
            codedOutputByteBufferNano.writeSInt32(11, i8);
        }
        int i9 = this.l;
        if (i9 != 0) {
            codedOutputByteBufferNano.writeSInt32(12, i9);
        }
        int i10 = this.m;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeSInt32(13, i10);
        }
        int i11 = this.n;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(14, i11);
        }
        int i12 = this.o;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(15, i12);
        }
        int i13 = this.p;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeUInt32(16, i13);
        }
        int i14 = this.q;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeUInt32(17, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0896n1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0896n1().mergeFrom(codedInputByteBufferNano);
    }

    public final C0896n1 a() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = 0L;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = -1;
        this.q = -1;
        this.cachedSize = -1;
        return this;
    }

    public static C0896n1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0896n1) MessageNano.mergeFrom(new C0896n1(), bArr);
    }
}
