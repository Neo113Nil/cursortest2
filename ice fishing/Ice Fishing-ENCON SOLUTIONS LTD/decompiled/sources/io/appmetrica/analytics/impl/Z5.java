package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Z5 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Z5[] f5467g;

    /* renamed from: a, reason: collision with root package name */
    public String f5468a;

    /* renamed from: b, reason: collision with root package name */
    public String f5469b;

    /* renamed from: c, reason: collision with root package name */
    public int f5470c;

    /* renamed from: d, reason: collision with root package name */
    public String f5471d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5472e;

    /* renamed from: f, reason: collision with root package name */
    public int f5473f;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f5467g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5467g == null) {
                        f5467g = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f5467g;
    }

    public final Z5 a() {
        this.f5468a = "";
        this.f5469b = "";
        this.f5470c = -1;
        this.f5471d = "";
        this.f5472e = false;
        this.f5473f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5468a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5468a);
        }
        if (!this.f5469b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5469b);
        }
        int i2 = this.f5470c;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i2);
        }
        if (!this.f5471d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f5471d);
        }
        boolean z2 = this.f5472e;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z2);
        }
        int i3 = this.f5473f;
        return i3 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5468a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5468a);
        }
        if (!this.f5469b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5469b);
        }
        int i2 = this.f5470c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i2);
        }
        if (!this.f5471d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5471d);
        }
        boolean z2 = this.f5472e;
        if (z2) {
            codedOutputByteBufferNano.writeBool(5, z2);
        }
        int i3 = this.f5473f;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5468a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5469b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f5470c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f5471d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f5472e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5473f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    public static Z5 a(byte[] bArr) {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
