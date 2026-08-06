package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789u8 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6975g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6976h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6977i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f6978j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f6979k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6980l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6981m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6982n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static volatile C0789u8[] f6983o;

    /* renamed from: a, reason: collision with root package name */
    public int f6984a;

    /* renamed from: b, reason: collision with root package name */
    public C0763t8 f6985b;

    /* renamed from: c, reason: collision with root package name */
    public C0711r8 f6986c;

    /* renamed from: d, reason: collision with root package name */
    public C0737s8 f6987d;

    /* renamed from: e, reason: collision with root package name */
    public C0350d8 f6988e;

    /* renamed from: f, reason: collision with root package name */
    public C0504j8 f6989f;

    public C0789u8() {
        a();
    }

    public static C0789u8[] b() {
        if (f6983o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6983o == null) {
                        f6983o = new C0789u8[0];
                    }
                } finally {
                }
            }
        }
        return f6983o;
    }

    public final C0789u8 a() {
        this.f6984a = 0;
        this.f6985b = null;
        this.f6986c = null;
        this.f6987d = null;
        this.f6988e = null;
        this.f6989f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6984a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        C0763t8 c0763t8 = this.f6985b;
        if (c0763t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0763t8);
        }
        C0711r8 c0711r8 = this.f6986c;
        if (c0711r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c0711r8);
        }
        C0737s8 c0737s8 = this.f6987d;
        if (c0737s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0737s8);
        }
        C0350d8 c0350d8 = this.f6988e;
        if (c0350d8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0350d8);
        }
        C0504j8 c0504j8 = this.f6989f;
        return c0504j8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c0504j8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6984a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        C0763t8 c0763t8 = this.f6985b;
        if (c0763t8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0763t8);
        }
        C0711r8 c0711r8 = this.f6986c;
        if (c0711r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0711r8);
        }
        C0737s8 c0737s8 = this.f6987d;
        if (c0737s8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0737s8);
        }
        C0350d8 c0350d8 = this.f6988e;
        if (c0350d8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0350d8);
        }
        C0504j8 c0504j8 = this.f6989f;
        if (c0504j8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0504j8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0789u8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0789u8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0789u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f6984a = readInt32;
                        break;
                }
            } else if (readTag == 18) {
                if (this.f6985b == null) {
                    this.f6985b = new C0763t8();
                }
                codedInputByteBufferNano.readMessage(this.f6985b);
            } else if (readTag == 26) {
                if (this.f6986c == null) {
                    this.f6986c = new C0711r8();
                }
                codedInputByteBufferNano.readMessage(this.f6986c);
            } else if (readTag == 34) {
                if (this.f6987d == null) {
                    this.f6987d = new C0737s8();
                }
                codedInputByteBufferNano.readMessage(this.f6987d);
            } else if (readTag == 42) {
                if (this.f6988e == null) {
                    this.f6988e = new C0350d8();
                }
                codedInputByteBufferNano.readMessage(this.f6988e);
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6989f == null) {
                    this.f6989f = new C0504j8();
                }
                codedInputByteBufferNano.readMessage(this.f6989f);
            }
        }
    }

    public static C0789u8 a(byte[] bArr) {
        return (C0789u8) MessageNano.mergeFrom(new C0789u8(), bArr);
    }
}
