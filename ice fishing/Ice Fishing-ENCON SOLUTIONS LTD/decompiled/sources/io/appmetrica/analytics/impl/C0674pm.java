package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674pm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0674pm[] f6754c;

    /* renamed from: a, reason: collision with root package name */
    public String f6755a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f6756b;

    public C0674pm() {
        a();
    }

    public static C0674pm[] b() {
        if (f6754c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6754c == null) {
                        f6754c = new C0674pm[0];
                    }
                } finally {
                }
            }
        }
        return f6754c;
    }

    public final C0674pm a() {
        this.f6755a = "";
        this.f6756b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6755a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6755a);
        }
        String[] strArr = this.f6756b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f6756b;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            String str = strArr2[i2];
            if (str != null) {
                i4++;
                i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6755a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6755a);
        }
        String[] strArr = this.f6756b;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f6756b;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0674pm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6755a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f6756b;
                int length = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i2];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i2 - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f6756b = strArr2;
            }
        }
    }

    public static C0674pm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0674pm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0674pm a(byte[] bArr) {
        return (C0674pm) MessageNano.mergeFrom(new C0674pm(), bArr);
    }
}
