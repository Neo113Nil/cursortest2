package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299b9 extends MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0299b9[] f5614n;

    /* renamed from: a, reason: collision with root package name */
    public String f5615a;

    /* renamed from: b, reason: collision with root package name */
    public String f5616b;

    /* renamed from: c, reason: collision with root package name */
    public String f5617c;

    /* renamed from: d, reason: collision with root package name */
    public int f5618d;

    /* renamed from: e, reason: collision with root package name */
    public String f5619e;

    /* renamed from: f, reason: collision with root package name */
    public String f5620f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5621g;

    /* renamed from: h, reason: collision with root package name */
    public int f5622h;

    /* renamed from: i, reason: collision with root package name */
    public String f5623i;

    /* renamed from: j, reason: collision with root package name */
    public String f5624j;

    /* renamed from: k, reason: collision with root package name */
    public int f5625k;

    /* renamed from: l, reason: collision with root package name */
    public C0273a9[] f5626l;

    /* renamed from: m, reason: collision with root package name */
    public String f5627m;

    public C0299b9() {
        a();
    }

    public static C0299b9[] b() {
        if (f5614n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5614n == null) {
                        f5614n = new C0299b9[0];
                    }
                } finally {
                }
            }
        }
        return f5614n;
    }

    public final C0299b9 a() {
        this.f5615a = "";
        this.f5616b = "";
        this.f5617c = "";
        this.f5618d = 0;
        this.f5619e = "";
        this.f5620f = "";
        this.f5621g = false;
        this.f5622h = 0;
        this.f5623i = "";
        this.f5624j = "";
        this.f5625k = 0;
        this.f5626l = C0273a9.b();
        this.f5627m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5615a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5615a);
        }
        if (!this.f5616b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5616b);
        }
        if (!this.f5617c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f5617c);
        }
        int i2 = this.f5618d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        if (!this.f5619e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f5619e);
        }
        if (!this.f5620f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f5620f);
        }
        boolean z2 = this.f5621g;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        int i3 = this.f5622h;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i3);
        }
        if (!this.f5623i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f5623i);
        }
        if (!this.f5624j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f5624j);
        }
        int i4 = this.f5625k;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i4);
        }
        C0273a9[] c0273a9Arr = this.f5626l;
        if (c0273a9Arr != null && c0273a9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0273a9[] c0273a9Arr2 = this.f5626l;
                if (i5 >= c0273a9Arr2.length) {
                    break;
                }
                C0273a9 c0273a9 = c0273a9Arr2[i5];
                if (c0273a9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c0273a9) + computeSerializedSize;
                }
                i5++;
            }
        }
        return !this.f5627m.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f5627m) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5615a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5615a);
        }
        if (!this.f5616b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5616b);
        }
        if (!this.f5617c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5617c);
        }
        int i2 = this.f5618d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        if (!this.f5619e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f5619e);
        }
        if (!this.f5620f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f5620f);
        }
        boolean z2 = this.f5621g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        int i3 = this.f5622h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i3);
        }
        if (!this.f5623i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f5623i);
        }
        if (!this.f5624j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f5624j);
        }
        int i4 = this.f5625k;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i4);
        }
        C0273a9[] c0273a9Arr = this.f5626l;
        if (c0273a9Arr != null && c0273a9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C0273a9[] c0273a9Arr2 = this.f5626l;
                if (i5 >= c0273a9Arr2.length) {
                    break;
                }
                C0273a9 c0273a9 = c0273a9Arr2[i5];
                if (c0273a9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0273a9);
                }
                i5++;
            }
        }
        if (!this.f5627m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f5627m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0299b9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0299b9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0299b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f5615a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f5616b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f5617c = codedInputByteBufferNano.readString();
                    break;
                case C0376e9.f5890L /* 40 */:
                    this.f5618d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f5619e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f5620f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f5621g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f5622h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f5623i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f5624j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f5625k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C0273a9[] c0273a9Arr = this.f5626l;
                    int length = c0273a9Arr == null ? 0 : c0273a9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0273a9[] c0273a9Arr2 = new C0273a9[i2];
                    if (length != 0) {
                        System.arraycopy(c0273a9Arr, 0, c0273a9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        C0273a9 c0273a9 = new C0273a9();
                        c0273a9Arr2[length] = c0273a9;
                        codedInputByteBufferNano.readMessage(c0273a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0273a9 c0273a92 = new C0273a9();
                    c0273a9Arr2[length] = c0273a92;
                    codedInputByteBufferNano.readMessage(c0273a92);
                    this.f5626l = c0273a9Arr2;
                    break;
                case 194:
                    this.f5627m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0299b9 a(byte[] bArr) {
        return (C0299b9) MessageNano.mergeFrom(new C0299b9(), bArr);
    }
}
