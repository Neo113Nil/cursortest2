package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0974o1 extends MessageNano {
    public static volatile C0974o1[] f;
    public C0971n1[] a;
    public C0985s1[] b;
    public int c;
    public int d;
    public int e;

    public C0974o1() {
        a();
    }

    public static C0974o1[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C0974o1[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0974o1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C0971n1[] c0971n1Arr = this.a;
                int length = c0971n1Arr == null ? 0 : c0971n1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0971n1[] c0971n1Arr2 = new C0971n1[i];
                if (length != 0) {
                    System.arraycopy(c0971n1Arr, 0, c0971n1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0971n1 c0971n1 = new C0971n1();
                    c0971n1Arr2[length] = c0971n1;
                    codedInputByteBufferNano.readMessage(c0971n1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0971n1 c0971n12 = new C0971n1();
                c0971n1Arr2[length] = c0971n12;
                codedInputByteBufferNano.readMessage(c0971n12);
                this.a = c0971n1Arr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0985s1[] c0985s1Arr = this.b;
                int length2 = c0985s1Arr == null ? 0 : c0985s1Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C0985s1[] c0985s1Arr2 = new C0985s1[i2];
                if (length2 != 0) {
                    System.arraycopy(c0985s1Arr, 0, c0985s1Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C0985s1 c0985s1 = new C0985s1();
                    c0985s1Arr2[length2] = c0985s1;
                    codedInputByteBufferNano.readMessage(c0985s1);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0985s1 c0985s12 = new C0985s1();
                c0985s1Arr2[length2] = c0985s12;
                codedInputByteBufferNano.readMessage(c0985s12);
                this.b = c0985s1Arr2;
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.c = readInt32;
                }
            } else if (readTag == 32) {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == 0 || readInt322 == 1) {
                    this.d = readInt322;
                }
            } else if (readTag == 40) {
                int readInt323 = codedInputByteBufferNano.readInt32();
                if (readInt323 == -1 || readInt323 == 0 || readInt323 == 1) {
                    this.e = readInt323;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0971n1[] c0971n1Arr = this.a;
        int i = 0;
        if (c0971n1Arr != null && c0971n1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0971n1[] c0971n1Arr2 = this.a;
                if (i2 >= c0971n1Arr2.length) {
                    break;
                }
                C0971n1 c0971n1 = c0971n1Arr2[i2];
                if (c0971n1 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c0971n1) + computeSerializedSize;
                }
                i2++;
            }
        }
        C0985s1[] c0985s1Arr = this.b;
        if (c0985s1Arr != null && c0985s1Arr.length > 0) {
            while (true) {
                C0985s1[] c0985s1Arr2 = this.b;
                if (i >= c0985s1Arr2.length) {
                    break;
                }
                C0985s1 c0985s1 = c0985s1Arr2[i];
                if (c0985s1 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c0985s1) + computeSerializedSize;
                }
                i++;
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i4);
        }
        int i5 = this.e;
        return i5 != -1 ? CodedOutputByteBufferNano.computeInt32Size(5, i5) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0971n1[] c0971n1Arr = this.a;
        int i = 0;
        if (c0971n1Arr != null && c0971n1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0971n1[] c0971n1Arr2 = this.a;
                if (i2 >= c0971n1Arr2.length) {
                    break;
                }
                C0971n1 c0971n1 = c0971n1Arr2[i2];
                if (c0971n1 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0971n1);
                }
                i2++;
            }
        }
        C0985s1[] c0985s1Arr = this.b;
        if (c0985s1Arr != null && c0985s1Arr.length > 0) {
            while (true) {
                C0985s1[] c0985s1Arr2 = this.b;
                if (i >= c0985s1Arr2.length) {
                    break;
                }
                C0985s1 c0985s1 = c0985s1Arr2[i];
                if (c0985s1 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0985s1);
                }
                i++;
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i4);
        }
        int i5 = this.e;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0974o1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0974o1().mergeFrom(codedInputByteBufferNano);
    }

    public final C0974o1 a() {
        this.a = C0971n1.b();
        this.b = C0985s1.b();
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.cachedSize = -1;
        return this;
    }

    public static C0974o1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0974o1) MessageNano.mergeFrom(new C0974o1(), bArr);
    }
}
