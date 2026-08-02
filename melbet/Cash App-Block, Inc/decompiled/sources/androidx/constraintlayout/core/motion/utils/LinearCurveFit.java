package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes3.dex */
public final class LinearCurveFit extends CurveFit {
    public double[] mSlopeTemp;
    public double[] mT;
    public double[][] mY;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double d, float[] fArr) {
        double[] dArr = this.mSlopeTemp;
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        double[][] dArr3 = this.mY;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            getSlope(d2, dArr);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            getSlope(d3, dArr);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r10 >= r4) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getSlope(double d, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        double[][] dArr3 = this.mY;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] getTimePoints() {
        return this.mT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double getSlope(double d) {
        double[] dArr = this.mT;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.mY;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
            }
            i = i2;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double d, double[] dArr) {
        double[] dArr2 = this.mSlopeTemp;
        double[] dArr3 = this.mT;
        int length = dArr3.length;
        double[][] dArr4 = this.mY;
        int i = 0;
        int length2 = dArr4[0].length;
        double d2 = dArr3[0];
        if (d <= d2) {
            getSlope(d2, dArr2);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr3[i3];
        if (d >= d3) {
            getSlope(d3, dArr2);
            while (i < length2) {
                dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr3[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr4[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double getPos(double d) {
        double d2;
        double d3;
        double slope;
        double[][] dArr = this.mY;
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        double d4 = dArr2[0];
        if (d <= d4) {
            d2 = dArr[0][0];
            d3 = d - d4;
            slope = getSlope(d4);
        } else {
            int i = length - 1;
            double d5 = dArr2[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr2[i2];
                    if (d == d6) {
                        return dArr[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr2[i3];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr[i3][0] * d8) + ((1.0d - d8) * dArr[i2][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr[i][0];
            d3 = d - d5;
            slope = getSlope(d5);
        }
        return (slope * d3) + d2;
    }
}
