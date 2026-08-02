package com.google.zxing.common.reedsolomon;

import bo.app.a$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class GenericGFPoly {
    public final int[] coefficients;
    public final GenericGF field;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
        this.field = genericGF;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.coefficients = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.coefficients = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.coefficients = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final GenericGFPoly addOrSubtract(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.field;
        GenericGF genericGF2 = this.field;
        if (!genericGF2.equals(genericGF)) {
            a$$ExternalSyntheticBUOutline0.m$3("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (isZero()) {
            return genericGFPoly;
        }
        if (genericGFPoly.isZero()) {
            return this;
        }
        int[] iArr = genericGFPoly.coefficients;
        int[] iArr2 = this.coefficients;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final int evaluateAt(int i) {
        if (i == 0) {
            return getCoefficient(0);
        }
        int[] iArr = this.coefficients;
        if (i != 1) {
            int i2 = iArr[0];
            int length = iArr.length;
            for (int i3 = 1; i3 < length; i3++) {
                i2 = this.field.multiply(i, i2) ^ iArr[i3];
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            GenericGF genericGF = GenericGF.QR_CODE_FIELD_256;
            i4 ^= i5;
        }
        return i4;
    }

    public final int getCoefficient(int i) {
        return this.coefficients[(r1.length - 1) - i];
    }

    public final int getDegree() {
        return this.coefficients.length - 1;
    }

    public final boolean isZero() {
        return this.coefficients[0] == 0;
    }

    public final GenericGFPoly multiply(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.field;
        GenericGF genericGF2 = this.field;
        if (!genericGF2.equals(genericGF)) {
            a$$ExternalSyntheticBUOutline0.m$3("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (isZero() || genericGFPoly.isZero()) {
            return genericGF2.zero;
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ genericGF2.multiply(i2, iArr2[i3]);
            }
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final GenericGFPoly multiplyByMonomial(int i, int i2) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        GenericGF genericGF = this.field;
        if (i2 == 0) {
            return genericGF.zero;
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = genericGF.multiply(iArr[i3], i2);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }

    public final String toString() {
        if (isZero()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(getDegree() * 8);
        for (int degree = getDegree(); degree >= 0; degree--) {
            int coefficient = getCoefficient(degree);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    if (degree == getDegree()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    coefficient = -coefficient;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (degree == 0 || coefficient != 1) {
                    GenericGF genericGF = this.field;
                    if (coefficient == 0) {
                        genericGF.getClass();
                        Path$$ExternalSyntheticBUOutline0.m$3();
                        return null;
                    }
                    int i = genericGF.logTable[coefficient];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(degree);
                    }
                }
            }
        }
        return sb.toString();
    }

    public final GenericGFPoly multiply(int i) {
        GenericGF genericGF = this.field;
        if (i == 0) {
            return genericGF.zero;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = genericGF.multiply(iArr[i2], i);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }
}
