package com.ionspin.kotlin.bignum.integer.base32;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.ionspin.kotlin.bignum.integer.Quadruple;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class BigInteger32Arithmetic {
    public static final int[] ZERO = new int[0];

    /* renamed from: bitLength--ajY-9A, reason: not valid java name */
    public static int m2101bitLengthajY9A(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        int i = iArr[iArr.length - 1];
        UInt.Companion companion = UInt.Companion;
        return ((iArr.length - 1) * 32) + (32 - m2105numberOfLeadingZerosInAWordWZ4Q5Ns(i));
    }

    /* renamed from: compare-Ynv0uTE, reason: not valid java name */
    public static int m2102compareYnv0uTE(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        int length = iArr.length - m2103countLeadingZeroWordsajY9A(iArr);
        int length2 = iArr2.length - m2103countLeadingZeroWordsajY9A(iArr2);
        if (length <= length2) {
            if (length2 > length) {
                return -1;
            }
            int i = length - 1;
            while (true) {
                if (i < 0) {
                    z = false;
                    z2 = true;
                    break;
                }
                int i2 = iArr[i];
                UInt.Companion companion = UInt.Companion;
                if (Integer.compareUnsigned(i2, iArr2[i]) > 0) {
                    z2 = false;
                    z = true;
                    break;
                }
                if (Integer.compareUnsigned(iArr[i], iArr2[i]) < 0) {
                    z2 = false;
                    z = false;
                    break;
                }
                i--;
            }
            if (z2) {
                return 0;
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* renamed from: countLeadingZeroWords--ajY-9A, reason: not valid java name */
    public static int m2103countLeadingZeroWordsajY9A(int[] iArr) {
        int length = iArr.length - 1;
        if (length <= 0) {
            return 0;
        }
        int i = iArr[length];
        UInt.Companion companion = UInt.Companion;
        while (i == 0 && length > 0) {
            length--;
            i = iArr[length];
            UInt.Companion companion2 = UInt.Companion;
        }
        int i2 = iArr[length];
        UInt.Companion companion3 = UInt.Companion;
        if (i2 == 0) {
            length--;
        }
        return (iArr.length - length) - 1;
    }

    /* renamed from: minus-0-0sMy4$bignum, reason: not valid java name */
    public static int[] m2104minus00sMy4$bignum(int[] iArr, int[] iArr2) {
        int[] m2106removeLeadingZeroshkIa6DI = m2106removeLeadingZeroshkIa6DI(iArr);
        int[] m2106removeLeadingZeroshkIa6DI2 = m2106removeLeadingZeroshkIa6DI(iArr2);
        boolean z = true;
        Quadruple quadruple = m2102compareYnv0uTE(m2106removeLeadingZeroshkIa6DI, m2106removeLeadingZeroshkIa6DI2) == 1 ? new Quadruple(Integer.valueOf(m2106removeLeadingZeroshkIa6DI.length), Integer.valueOf(m2106removeLeadingZeroshkIa6DI2.length), new UIntArray(m2106removeLeadingZeroshkIa6DI), new UIntArray(m2106removeLeadingZeroshkIa6DI2)) : new Quadruple(Integer.valueOf(m2106removeLeadingZeroshkIa6DI2.length), Integer.valueOf(m2106removeLeadingZeroshkIa6DI.length), new UIntArray(m2106removeLeadingZeroshkIa6DI2), new UIntArray(m2106removeLeadingZeroshkIa6DI));
        int intValue = ((Number) quadruple.a).intValue();
        int intValue2 = ((Number) quadruple.b).intValue();
        int[] iArr3 = ((UIntArray) quadruple.c).storage;
        int[] iArr4 = ((UIntArray) quadruple.d).storage;
        int i = intValue + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = 0;
        }
        int i3 = 0;
        long j = 0;
        while (true) {
            boolean z2 = z;
            if (i3 >= intValue2) {
                break;
            }
            if (i3 >= iArr3.length) {
                System.out.println((Object) "Breakpoint");
            }
            if (i3 >= iArr4.length) {
                System.out.println((Object) "Breakpoint");
            }
            int i4 = iArr3[i3];
            UInt.Companion companion = UInt.Companion;
            long j2 = i4 & BodyPartID.bodyIdMax;
            ULong.Companion companion2 = ULong.Companion;
            long j3 = (j2 - (iArr4[i3] & BodyPartID.bodyIdMax)) - j;
            iArr5[i3] = (int) j3;
            j = (j3 & 4294967296L) >>> 32;
            i3++;
            z = z2;
        }
        while (j != 0) {
            int i5 = iArr3[i3];
            UInt.Companion companion3 = UInt.Companion;
            long j4 = i5 & BodyPartID.bodyIdMax;
            ULong.Companion companion4 = ULong.Companion;
            long j5 = j4 - j;
            iArr5[i3] = (int) j5;
            j = (j5 & 4294967296L) >>> 32;
            i3++;
        }
        while (i3 < intValue) {
            int i6 = iArr3[i3];
            UInt.Companion companion5 = UInt.Companion;
            iArr5[i3] = i6;
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = iArr5[i7];
            UInt.Companion companion6 = UInt.Companion;
            if (i8 == 0) {
                arrayList.add(new UInt(i8));
            }
        }
        if (arrayList.isEmpty()) {
            return ZERO;
        }
        if (intValue >= 0) {
            while (true) {
                int i9 = intValue - 1;
                int i10 = iArr5[intValue];
                UInt.Companion companion7 = UInt.Companion;
                if (i10 != 0) {
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                intValue = i9;
            }
        }
        intValue = -1;
        return ArraysKt___ArraysJvmKt.copyOfRange(iArr5, 0, intValue + 1);
    }

    /* renamed from: numberOfLeadingZerosInAWord-WZ4Q5Ns, reason: not valid java name */
    public static int m2105numberOfLeadingZerosInAWordWZ4Q5Ns(int i) {
        int i2;
        int i3 = i >>> 16;
        UInt.Companion companion = UInt.Companion;
        if (i3 != 0) {
            i2 = 16;
            i = i3;
        } else {
            i2 = 32;
        }
        int i4 = i >>> 8;
        if (i4 != 0) {
            i2 -= 8;
            i = i4;
        }
        int i5 = i >>> 4;
        if (i5 != 0) {
            i2 -= 4;
            i = i5;
        }
        int i6 = i >>> 2;
        if (i6 != 0) {
            i2 -= 2;
            i = i6;
        }
        return (i >>> 1) != 0 ? i2 - 2 : i2 - i;
    }

    /* renamed from: removeLeadingZeros-hkIa6DI, reason: not valid java name */
    public static int[] m2106removeLeadingZeroshkIa6DI(int[] iArr) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                int i2 = iArr[length];
                UInt.Companion companion = UInt.Companion;
                if (i2 != 0) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        length = -1;
        int i3 = length + 1;
        return (i3 == -1 || i3 == 0) ? ZERO : ArraysKt___ArraysJvmKt.copyOfRange(iArr, 0, i3);
    }

    /* renamed from: shl-Wj2uyrI$bignum, reason: not valid java name */
    public static int[] m2107shlWj2uyrI$bignum(int i, int[] iArr) {
        int i2;
        int i3;
        if (iArr.length == 0 || i == 0) {
            return iArr;
        }
        int length = iArr.length;
        int i4 = iArr[iArr.length - 1];
        UInt.Companion companion = UInt.Companion;
        int i5 = i / 32;
        int i6 = i % 32;
        int i7 = i6 > m2105numberOfLeadingZerosInAWordWZ4Q5Ns(i4) ? i5 + 1 : i5;
        if (i6 == 0) {
            int length2 = iArr.length + i7;
            int[] iArr2 = new int[length2];
            for (int i8 = 0; i8 < length2; i8++) {
                if (i8 < 0 || i8 >= i5) {
                    i3 = iArr[i8 - i5];
                    UInt.Companion companion2 = UInt.Companion;
                } else {
                    i3 = 0;
                }
                iArr2[i8] = i3;
            }
            return iArr2;
        }
        int length3 = iArr.length + i7;
        int[] iArr3 = new int[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            if (i9 >= 0 && i9 < i5) {
                i2 = 0;
            } else if (i9 == i5) {
                int i10 = iArr[i9 - i5];
                UInt.Companion companion3 = UInt.Companion;
                i2 = i10 << i6;
            } else {
                int i11 = i5 + 1;
                if (i9 < length + i5 && i11 <= i9) {
                    int i12 = i9 - i5;
                    int i13 = iArr[i12];
                    UInt.Companion companion4 = UInt.Companion;
                    i2 = (iArr[i12 - 1] >>> (32 - i6)) | (i13 << i6);
                } else {
                    if (i9 != (length + i7) - 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i9, "Invalid case "));
                        return null;
                    }
                    int i14 = iArr[i9 - i7];
                    UInt.Companion companion5 = UInt.Companion;
                    i2 = i14 >>> (32 - i6);
                }
            }
            iArr3[i9] = i2;
        }
        return iArr3;
    }

    /* renamed from: times-FE_7wA8$bignum, reason: not valid java name */
    public static int[] m2108timesFE_7wA8$bignum(int i, int[] iArr) {
        int[] iArr2 = new int[iArr.length + 1];
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            UInt.Companion companion = UInt.Companion;
            long j = i3 & BodyPartID.bodyIdMax;
            ULong.Companion companion2 = ULong.Companion;
            long j2 = j * (i & BodyPartID.bodyIdMax);
            long j3 = (iArr2[i2] & BodyPartID.bodyIdMax) + (((int) (j2 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax);
            iArr2[i2] = (int) (BodyPartID.bodyIdMax & j3);
            i2++;
            iArr2[i2] = ((int) (j2 >>> 32)) + ((int) (j3 >>> 32));
        }
        return m2106removeLeadingZeroshkIa6DI(iArr2);
    }
}
