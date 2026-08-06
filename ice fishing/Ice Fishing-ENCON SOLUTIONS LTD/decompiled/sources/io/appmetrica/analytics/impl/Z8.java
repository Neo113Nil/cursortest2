package io.appmetrica.analytics.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Z8 extends MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f5477j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5478k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5479l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Z8[] f5480m;

    /* renamed from: a, reason: collision with root package name */
    public double f5481a;

    /* renamed from: b, reason: collision with root package name */
    public double f5482b;

    /* renamed from: c, reason: collision with root package name */
    public long f5483c;

    /* renamed from: d, reason: collision with root package name */
    public int f5484d;

    /* renamed from: e, reason: collision with root package name */
    public int f5485e;

    /* renamed from: f, reason: collision with root package name */
    public int f5486f;

    /* renamed from: g, reason: collision with root package name */
    public int f5487g;

    /* renamed from: h, reason: collision with root package name */
    public int f5488h;

    /* renamed from: i, reason: collision with root package name */
    public String f5489i;

    public Z8() {
        a();
    }

    public static Z8[] b() {
        if (f5480m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5480m == null) {
                        f5480m = new Z8[0];
                    }
                } finally {
                }
            }
        }
        return f5480m;
    }

    public final Z8 a() {
        this.f5481a = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f5482b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f5483c = 0L;
        this.f5484d = 0;
        this.f5485e = 0;
        this.f5486f = 0;
        this.f5487g = 0;
        this.f5488h = 0;
        this.f5489i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f5482b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f5481a) + super.computeSerializedSize();
        long j2 = this.f5483c;
        if (j2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i2 = this.f5484d;
        if (i2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i2);
        }
        int i3 = this.f5485e;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        int i4 = this.f5486f;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i4);
        }
        int i5 = this.f5487g;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        int i6 = this.f5488h;
        if (i6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i6);
        }
        return !this.f5489i.equals("") ? computeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f5489i) : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeDouble(1, this.f5481a);
        codedOutputByteBufferNano.writeDouble(2, this.f5482b);
        long j2 = this.f5483c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i2 = this.f5484d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i2);
        }
        int i3 = this.f5485e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        int i4 = this.f5486f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i4);
        }
        int i5 = this.f5487g;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        int i6 = this.f5488h;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i6);
        }
        if (!this.f5489i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f5489i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.f5481a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f5482b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f5483c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f5484d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f5485e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f5486f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f5487g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5488h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5489i = codedInputByteBufferNano.readString();
            }
        }
    }

    public static Z8 a(byte[] bArr) {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}
