package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class R5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile R5[] f4983d;

    /* renamed from: a, reason: collision with root package name */
    public C0270a6 f4984a;

    /* renamed from: b, reason: collision with root package name */
    public C0270a6[] f4985b;

    /* renamed from: c, reason: collision with root package name */
    public String f4986c;

    public R5() {
        a();
    }

    public static R5[] b() {
        if (f4983d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4983d == null) {
                        f4983d = new R5[0];
                    }
                } finally {
                }
            }
        }
        return f4983d;
    }

    public final R5 a() {
        this.f4984a = null;
        this.f4985b = C0270a6.b();
        this.f4986c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0270a6 c0270a6 = this.f4984a;
        if (c0270a6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0270a6);
        }
        C0270a6[] c0270a6Arr = this.f4985b;
        if (c0270a6Arr != null && c0270a6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0270a6[] c0270a6Arr2 = this.f4985b;
                if (i2 >= c0270a6Arr2.length) {
                    break;
                }
                C0270a6 c0270a62 = c0270a6Arr2[i2];
                if (c0270a62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0270a62) + computeSerializedSize;
                }
                i2++;
            }
        }
        return !this.f4986c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f4986c) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0270a6 c0270a6 = this.f4984a;
        if (c0270a6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0270a6);
        }
        C0270a6[] c0270a6Arr = this.f4985b;
        if (c0270a6Arr != null && c0270a6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0270a6[] c0270a6Arr2 = this.f4985b;
                if (i2 >= c0270a6Arr2.length) {
                    break;
                }
                C0270a6 c0270a62 = c0270a6Arr2[i2];
                if (c0270a62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0270a62);
                }
                i2++;
            }
        }
        if (!this.f4986c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f4986c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f4984a == null) {
                    this.f4984a = new C0270a6();
                }
                codedInputByteBufferNano.readMessage(this.f4984a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0270a6[] c0270a6Arr = this.f4985b;
                int length = c0270a6Arr == null ? 0 : c0270a6Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C0270a6[] c0270a6Arr2 = new C0270a6[i2];
                if (length != 0) {
                    System.arraycopy(c0270a6Arr, 0, c0270a6Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C0270a6 c0270a6 = new C0270a6();
                    c0270a6Arr2[length] = c0270a6;
                    codedInputByteBufferNano.readMessage(c0270a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0270a6 c0270a62 = new C0270a6();
                c0270a6Arr2[length] = c0270a62;
                codedInputByteBufferNano.readMessage(c0270a62);
                this.f4985b = c0270a6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4986c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static R5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new R5().mergeFrom(codedInputByteBufferNano);
    }

    public static R5 a(byte[] bArr) {
        return (R5) MessageNano.mergeFrom(new R5(), bArr);
    }
}
