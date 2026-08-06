package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270a6 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0270a6[] f5552g;

    /* renamed from: a, reason: collision with root package name */
    public String f5553a;

    /* renamed from: b, reason: collision with root package name */
    public int f5554b;

    /* renamed from: c, reason: collision with root package name */
    public long f5555c;

    /* renamed from: d, reason: collision with root package name */
    public String f5556d;

    /* renamed from: e, reason: collision with root package name */
    public int f5557e;

    /* renamed from: f, reason: collision with root package name */
    public Z5[] f5558f;

    public C0270a6() {
        a();
    }

    public static C0270a6[] b() {
        if (f5552g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5552g == null) {
                        f5552g = new C0270a6[0];
                    }
                } finally {
                }
            }
        }
        return f5552g;
    }

    public final C0270a6 a() {
        this.f5553a = "";
        this.f5554b = 0;
        this.f5555c = 0L;
        this.f5556d = "";
        this.f5557e = 0;
        this.f5558f = Z5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f5555c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f5554b) + CodedOutputByteBufferNano.computeStringSize(1, this.f5553a) + super.computeSerializedSize();
        if (!this.f5556d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f5556d);
        }
        int i2 = this.f5557e;
        if (i2 != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        Z5[] z5Arr = this.f5558f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5558f;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    computeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, z5) + computeSInt64Size;
                }
                i3++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5553a);
        codedOutputByteBufferNano.writeSInt32(2, this.f5554b);
        codedOutputByteBufferNano.writeSInt64(3, this.f5555c);
        if (!this.f5556d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5556d);
        }
        int i2 = this.f5557e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        Z5[] z5Arr = this.f5558f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f5558f;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(6, z5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0270a6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0270a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0270a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5553a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f5554b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f5555c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f5556d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f5557e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                Z5[] z5Arr = this.f5558f;
                int length = z5Arr == null ? 0 : z5Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                Z5[] z5Arr2 = new Z5[i2];
                if (length != 0) {
                    System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    Z5 z5 = new Z5();
                    z5Arr2[length] = z5;
                    codedInputByteBufferNano.readMessage(z5);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                Z5 z52 = new Z5();
                z5Arr2[length] = z52;
                codedInputByteBufferNano.readMessage(z52);
                this.f5558f = z5Arr2;
            }
        }
    }

    public static C0270a6 a(byte[] bArr) {
        return (C0270a6) MessageNano.mergeFrom(new C0270a6(), bArr);
    }
}
