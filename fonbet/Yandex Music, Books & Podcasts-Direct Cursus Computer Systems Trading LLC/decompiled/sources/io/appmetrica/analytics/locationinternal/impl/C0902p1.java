package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0902p1 extends MessageNano {
    public static volatile C0902p1[] h;
    public long a;
    public long b;
    public C0896n1[] c;
    public C0910s1[] d;
    public long e;
    public int f;
    public int g;

    public C0902p1() {
        a();
    }

    public static C0902p1[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C0902p1[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0902p1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0896n1[] c0896n1Arr = this.c;
                int length = c0896n1Arr == null ? 0 : c0896n1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C0896n1[] c0896n1Arr2 = new C0896n1[i];
                if (length != 0) {
                    System.arraycopy(c0896n1Arr, 0, c0896n1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C0896n1 c0896n1 = new C0896n1();
                    c0896n1Arr2[length] = c0896n1;
                    codedInputByteBufferNano.readMessage(c0896n1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0896n1 c0896n12 = new C0896n1();
                c0896n1Arr2[length] = c0896n12;
                codedInputByteBufferNano.readMessage(c0896n12);
                this.c = c0896n1Arr2;
            } else if (readTag == 34) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C0910s1[] c0910s1Arr = this.d;
                int length2 = c0910s1Arr == null ? 0 : c0910s1Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C0910s1[] c0910s1Arr2 = new C0910s1[i2];
                if (length2 != 0) {
                    System.arraycopy(c0910s1Arr, 0, c0910s1Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C0910s1 c0910s1 = new C0910s1();
                    c0910s1Arr2[length2] = c0910s1;
                    codedInputByteBufferNano.readMessage(c0910s1);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C0910s1 c0910s12 = new C0910s1();
                c0910s1Arr2[length2] = c0910s12;
                codedInputByteBufferNano.readMessage(c0910s12);
                this.d = c0910s1Arr2;
            } else if (readTag == 40) {
                this.e = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 48) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f = readInt32;
                }
            } else if (readTag == 56) {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == 0 || readInt322 == 1) {
                    this.g = readInt322;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(2, this.b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C0896n1[] c0896n1Arr = this.c;
        int i = 0;
        if (c0896n1Arr != null && c0896n1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0896n1[] c0896n1Arr2 = this.c;
                if (i2 >= c0896n1Arr2.length) {
                    break;
                }
                C0896n1 c0896n1 = c0896n1Arr2[i2];
                if (c0896n1 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c0896n1) + computeUInt64Size;
                }
                i2++;
            }
        }
        C0910s1[] c0910s1Arr = this.d;
        if (c0910s1Arr != null && c0910s1Arr.length > 0) {
            while (true) {
                C0910s1[] c0910s1Arr2 = this.d;
                if (i >= c0910s1Arr2.length) {
                    break;
                }
                C0910s1 c0910s1 = c0910s1Arr2[i];
                if (c0910s1 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(4, c0910s1) + computeUInt64Size;
                }
                i++;
            }
        }
        long j = this.e;
        if (j != 0) {
            computeUInt64Size += CodedOutputByteBufferNano.computeUInt64Size(5, j);
        }
        int i3 = this.f;
        if (i3 != 0) {
            computeUInt64Size += CodedOutputByteBufferNano.computeInt32Size(6, i3);
        }
        int i4 = this.g;
        return i4 != 0 ? CodedOutputByteBufferNano.computeInt32Size(7, i4) + computeUInt64Size : computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        codedOutputByteBufferNano.writeUInt64(2, this.b);
        C0896n1[] c0896n1Arr = this.c;
        int i = 0;
        if (c0896n1Arr != null && c0896n1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C0896n1[] c0896n1Arr2 = this.c;
                if (i2 >= c0896n1Arr2.length) {
                    break;
                }
                C0896n1 c0896n1 = c0896n1Arr2[i2];
                if (c0896n1 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0896n1);
                }
                i2++;
            }
        }
        C0910s1[] c0910s1Arr = this.d;
        if (c0910s1Arr != null && c0910s1Arr.length > 0) {
            while (true) {
                C0910s1[] c0910s1Arr2 = this.d;
                if (i >= c0910s1Arr2.length) {
                    break;
                }
                C0910s1 c0910s1 = c0910s1Arr2[i];
                if (c0910s1 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0910s1);
                }
                i++;
            }
        }
        long j = this.e;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i3);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0902p1 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0902p1().mergeFrom(codedInputByteBufferNano);
    }

    public final C0902p1 a() {
        this.a = 0L;
        this.b = 0L;
        this.c = C0896n1.b();
        this.d = C0910s1.b();
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.cachedSize = -1;
        return this;
    }

    public static C0902p1 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0902p1) MessageNano.mergeFrom(new C0902p1(), bArr);
    }
}
