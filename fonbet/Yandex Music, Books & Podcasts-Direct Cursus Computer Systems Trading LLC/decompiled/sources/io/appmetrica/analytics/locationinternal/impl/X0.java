package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class X0 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 0;
    public static final int i = 2;
    public static final int j = 3;
    public static volatile X0[] k;
    public int[] a;
    public int[] b;

    public X0() {
        a();
    }

    public static X0[] b() {
        if (k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (k == null) {
                        k = new X0[0];
                    }
                } finally {
                }
            }
        }
        return k;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X0 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (readTag != 10) {
                    if (readTag != 16) {
                        if (readTag != 18) {
                            if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        } else {
                            int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                            int position = codedInputByteBufferNano.getPosition();
                            int i2 = 0;
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int readInt32 = codedInputByteBufferNano.readInt32();
                                if (readInt32 == 0 || readInt32 == 2 || readInt32 == 3) {
                                    i2++;
                                }
                            }
                            if (i2 != 0) {
                                codedInputByteBufferNano.rewindToPosition(position);
                                int[] iArr = this.b;
                                int length = iArr == null ? 0 : iArr.length;
                                int[] iArr2 = new int[i2 + length];
                                if (length != 0) {
                                    System.arraycopy(iArr, 0, iArr2, 0, length);
                                }
                                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                    int readInt322 = codedInputByteBufferNano.readInt32();
                                    if (readInt322 == 0 || readInt322 == 2 || readInt322 == 3) {
                                        iArr2[length] = readInt322;
                                        length++;
                                    }
                                }
                                this.b = iArr2;
                            }
                            codedInputByteBufferNano.popLimit(pushLimit);
                        }
                    } else {
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                        int[] iArr3 = new int[repeatedFieldArrayLength];
                        int i3 = 0;
                        for (int i4 = 0; i4 < repeatedFieldArrayLength; i4++) {
                            if (i4 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == 0 || readInt323 == 2 || readInt323 == 3) {
                                iArr3[i3] = readInt323;
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            int[] iArr4 = this.b;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            if (length2 == 0 && i3 == repeatedFieldArrayLength) {
                                this.b = iArr3;
                            } else {
                                int[] iArr5 = new int[length2 + i3];
                                if (length2 != 0) {
                                    System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                }
                                System.arraycopy(iArr3, 0, iArr5, length2, i3);
                                this.b = iArr5;
                            }
                        }
                    }
                } else {
                    int pushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position2 = codedInputByteBufferNano.getPosition();
                    int i5 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt324 = codedInputByteBufferNano.readInt32();
                        if (readInt324 == 0 || readInt324 == 1 || readInt324 == 2 || readInt324 == 3 || readInt324 == 4) {
                            i5++;
                        }
                    }
                    if (i5 != 0) {
                        codedInputByteBufferNano.rewindToPosition(position2);
                        int[] iArr6 = this.a;
                        int length3 = iArr6 == null ? 0 : iArr6.length;
                        int[] iArr7 = new int[i5 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length3);
                        }
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt325 = codedInputByteBufferNano.readInt32();
                            if (readInt325 == 0 || readInt325 == 1 || readInt325 == 2 || readInt325 == 3 || readInt325 == 4) {
                                iArr7[length3] = readInt325;
                                length3++;
                            }
                        }
                        this.a = iArr7;
                    }
                    codedInputByteBufferNano.popLimit(pushLimit2);
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                int[] iArr8 = new int[repeatedFieldArrayLength2];
                int i6 = 0;
                for (int i7 = 0; i7 < repeatedFieldArrayLength2; i7++) {
                    if (i7 != 0) {
                        codedInputByteBufferNano.readTag();
                    }
                    int readInt326 = codedInputByteBufferNano.readInt32();
                    if (readInt326 == 0 || readInt326 == 1 || readInt326 == 2 || readInt326 == 3 || readInt326 == 4) {
                        iArr8[i6] = readInt326;
                        i6++;
                    }
                }
                if (i6 != 0) {
                    int[] iArr9 = this.a;
                    int length4 = iArr9 == null ? 0 : iArr9.length;
                    if (length4 == 0 && i6 == repeatedFieldArrayLength2) {
                        this.a = iArr8;
                    } else {
                        int[] iArr10 = new int[length4 + i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr9, 0, iArr10, 0, length4);
                        }
                        System.arraycopy(iArr8, 0, iArr10, length4, i6);
                        this.a = iArr10;
                    }
                }
            }
        }
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int[] iArr;
        int computeSerializedSize = super.computeSerializedSize();
        int[] iArr2 = this.a;
        int i2 = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                iArr = this.a;
                if (i3 >= iArr.length) {
                    break;
                }
                i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i3]);
                i3++;
            }
            computeSerializedSize = computeSerializedSize + i4 + iArr.length;
        }
        int[] iArr3 = this.b;
        if (iArr3 == null || iArr3.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.b;
            if (i2 >= iArr4.length) {
                return computeSerializedSize + i5 + iArr4.length;
            }
            i5 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr4[i2]);
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int[] iArr = this.a;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.a;
                if (i3 >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(1, iArr2[i3]);
                i3++;
            }
        }
        int[] iArr3 = this.b;
        if (iArr3 != null && iArr3.length > 0) {
            while (true) {
                int[] iArr4 = this.b;
                if (i2 >= iArr4.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(2, iArr4[i2]);
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static X0 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X0().mergeFrom(codedInputByteBufferNano);
    }

    public final X0 a() {
        int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
        this.a = iArr;
        this.b = iArr;
        this.cachedSize = -1;
        return this;
    }

    public static X0 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X0) MessageNano.mergeFrom(new X0(), bArr);
    }
}
