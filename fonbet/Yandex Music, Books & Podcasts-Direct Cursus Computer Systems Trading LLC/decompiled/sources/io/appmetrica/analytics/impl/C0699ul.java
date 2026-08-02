package io.appmetrica.analytics.impl;

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
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0699ul extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;
    public static volatile C0699ul[] q;
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public C0555pl e;
    public long f;
    public boolean g;
    public int h;
    public int i;
    public C0670tl j;
    public C0641sl k;

    public C0699ul() {
        a();
    }

    public static C0699ul[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C0699ul[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0699ul mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                case com.yandex.pulse.metrics.o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    this.c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new C0555pl();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                    break;
                case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                    this.f = codedInputByteBufferNano.readInt64();
                    break;
                case SQLiteDatabase.OPEN_URI /* 64 */:
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
                case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.i = readInt322;
                        break;
                    }
                case 90:
                    if (this.j == null) {
                        this.j = new C0670tl();
                    }
                    codedInputByteBufferNano.readMessage(this.j);
                    break;
                case 98:
                    if (this.k == null) {
                        this.k = new C0641sl();
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
        C0555pl c0555pl = this.e;
        if (c0555pl != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, c0555pl);
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
        C0670tl c0670tl = this.j;
        if (c0670tl != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, c0670tl);
        }
        C0641sl c0641sl = this.k;
        return c0641sl != null ? CodedOutputByteBufferNano.computeMessageSize(12, c0641sl) + computeBytesSize : computeBytesSize;
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
        C0555pl c0555pl = this.e;
        if (c0555pl != null) {
            codedOutputByteBufferNano.writeMessage(6, c0555pl);
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
        C0670tl c0670tl = this.j;
        if (c0670tl != null) {
            codedOutputByteBufferNano.writeMessage(11, c0670tl);
        }
        C0641sl c0641sl = this.k;
        if (c0641sl != null) {
            codedOutputByteBufferNano.writeMessage(12, c0641sl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0699ul b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0699ul().mergeFrom(codedInputByteBufferNano);
    }

    public final C0699ul a() {
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

    public static C0699ul a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0699ul) MessageNano.mergeFrom(new C0699ul(), bArr);
    }
}
