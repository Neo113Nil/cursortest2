package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ArcCurveFit extends CurveFit {
    public final Arc[] mArcs;
    public final double[] mTime;

    public final class Arc {
        public static final double[] sOurPercent = new double[91];
        public double mArcDistance;
        public double mArcVelocity;
        public double mEllipseA;
        public double mEllipseB;
        public double mEllipseCenterX;
        public double mEllipseCenterY;
        public boolean mLinear;
        public double[] mLut;
        public double mOneOverDeltaTime;
        public double mTime1;
        public double mTime2;
        public double mTmpCosAngle;
        public double mTmpSinAngle;
        public boolean mVertical;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        public final double getDX() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d) * hypot : d * hypot;
        }

        public final double getDY() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double d2 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, d2);
            return this.mVertical ? (-d2) * hypot : d2 * hypot;
        }

        public final double getLinearX(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mX1;
            return ((this.mX2 - d3) * d2) + d3;
        }

        public final double getLinearY(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mY1;
            return ((this.mY2 - d3) * d2) + d3;
        }

        public final double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        public final double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        public final void setPoint(double d) {
            double d2 = (this.mVertical ? this.mTime2 - d : d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.mLut;
                    double length = d2 * (dArr.length - 1);
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - i)) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(d5);
            this.mTmpCosAngle = Math.cos(d5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0030, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.core.motion.utils.ArcCurveFit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        int i;
        double[] dArr3;
        double[] dArr4;
        double[] dArr5 = dArr;
        ?? obj = new Object();
        obj.mTime = dArr5;
        int i2 = 1;
        obj.mArcs = new Arc[dArr5.length - 1];
        char c = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        ArcCurveFit arcCurveFit = obj;
        while (true) {
            Arc[] arcArr = arcCurveFit.mArcs;
            if (i3 >= arcArr.length) {
                return;
            }
            int i6 = iArr[i3];
            if (i6 != 0) {
                if (i6 != i2) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                i5 = 4;
                            } else if (i6 == 5) {
                                i5 = 5;
                            }
                        }
                    }
                    i4 = 2;
                    i5 = i4;
                }
                i4 = i2;
                i5 = i4;
            } else {
                i5 = 3;
            }
            double d3 = dArr5[i3];
            int i7 = i3 + 1;
            double d4 = dArr5[i7];
            double[] dArr6 = dArr2[i3];
            double d5 = dArr6[c];
            int i8 = i2;
            int i9 = i3;
            double d6 = dArr6[i8];
            double[] dArr7 = dArr2[i7];
            boolean z2 = c;
            double d7 = dArr7[z2 ? 1 : 0];
            double d8 = dArr7[i8];
            Arc arc = new Arc();
            arc.mLinear = z2;
            int i10 = i4;
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            boolean z3 = i8;
            if (i5 != z3) {
                if (i5 == 4) {
                    arc.mVertical = d10 > 0.0d;
                } else if (i5 != 5) {
                    arc.mVertical = false;
                } else {
                    arc.mVertical = d10 < 0.0d;
                }
                d = d9;
                d2 = d3;
                z = true;
            } else {
                arc.mVertical = z3;
                d = d9;
                d2 = d3;
                z = z3;
            }
            arc.mTime1 = d2;
            arc.mTime2 = d4;
            double d11 = d4 - d2;
            double d12 = 1.0d / d11;
            arc.mOneOverDeltaTime = d12;
            if (3 == i5) {
                arc.mLinear = z;
            }
            if (arc.mLinear || Math.abs(d) < 0.001d || Math.abs(d10) < 0.001d) {
                i = 1;
                arc.mLinear = true;
                arc.mX1 = d5;
                arc.mX2 = d7;
                arc.mY1 = d6;
                arc.mY2 = d8;
                double d13 = d;
                double hypot = Math.hypot(d10, d13);
                arc.mArcDistance = hypot;
                arc.mArcVelocity = hypot * d12;
                arc.mEllipseCenterX = d13 / d11;
                arc.mEllipseCenterY = d10 / d11;
            } else {
                double[] dArr8 = new double[101];
                arc.mLut = dArr8;
                boolean z4 = arc.mVertical;
                arc.mEllipseA = (z4 ? -1 : 1) * d;
                arc.mEllipseB = (z4 ? 1 : -1) * d10;
                arc.mEllipseCenterX = z4 ? d7 : d5;
                arc.mEllipseCenterY = z4 ? d6 : d8;
                double d14 = d6 - d8;
                double d15 = 0.0d;
                double d16 = 0.0d;
                double d17 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = Arc.sOurPercent;
                    if (i11 >= 91) {
                        break;
                    }
                    double d18 = d17;
                    double radians = Math.toRadians((i11 * 90.0d) / 90.0d);
                    double sin = Math.sin(radians) * d;
                    double cos = Math.cos(radians) * d14;
                    if (i11 > 0) {
                        dArr4 = dArr8;
                        d15 += Math.hypot(sin - d16, cos - d18);
                        dArr3[i11] = d15;
                    } else {
                        dArr4 = dArr8;
                    }
                    i11++;
                    d17 = cos;
                    d16 = sin;
                    dArr8 = dArr4;
                }
                double[] dArr9 = dArr8;
                arc.mArcDistance = d15;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / d15;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d19 = i13 / 100.0d;
                    int binarySearch = Arrays.binarySearch(dArr3, d19);
                    if (binarySearch >= 0) {
                        dArr9[i13] = binarySearch / 90.0d;
                    } else if (binarySearch == -1) {
                        dArr9[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double d20 = dArr3[i15];
                        dArr9[i13] = (((d19 - d20) / (dArr3[i14 - 1] - d20)) + i15) / 90.0d;
                    }
                }
                arc.mArcVelocity = arc.mArcDistance * arc.mOneOverDeltaTime;
                i = 1;
            }
            arcArr[i9] = arc;
            arcCurveFit = this;
            dArr5 = dArr;
            i2 = i;
            i3 = i7;
            i4 = i10;
            c = 0;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        Arc arc = arcArr[0];
        double d2 = arc.mTime1;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.mLinear) {
                double linearX = arc.getLinearX(d2);
                Arc arc2 = arcArr[0];
                dArr[0] = (arc2.mEllipseCenterX * d3) + linearX;
                dArr[1] = (d3 * arcArr[0].mEllipseCenterY) + arc2.getLinearY(d2);
                return;
            }
            arc.setPoint(d2);
            dArr[0] = (arcArr[0].getDX() * d3) + arcArr[0].getX();
            dArr[1] = (arcArr[0].getDY() * d3) + arcArr[0].getY();
            return;
        }
        if (d <= arcArr[arcArr.length - 1].mTime2) {
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc3 = arcArr[i];
                if (d <= arc3.mTime2) {
                    if (arc3.mLinear) {
                        dArr[0] = arc3.getLinearX(d);
                        dArr[1] = arcArr[i].getLinearY(d);
                        return;
                    } else {
                        arc3.setPoint(d);
                        dArr[0] = arcArr[i].getX();
                        dArr[1] = arcArr[i].getY();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = arcArr[arcArr.length - 1].mTime2;
        double d5 = d - d4;
        int length = arcArr.length - 1;
        Arc arc4 = arcArr[length];
        if (arc4.mLinear) {
            double linearX2 = arc4.getLinearX(d4);
            Arc arc5 = arcArr[length];
            dArr[0] = (arc5.mEllipseCenterX * d5) + linearX2;
            dArr[1] = (d5 * arcArr[length].mEllipseCenterY) + arc5.getLinearY(d4);
            return;
        }
        arc4.setPoint(d);
        dArr[0] = (arcArr[length].getDX() * d5) + arcArr[length].getX();
        dArr[1] = (arcArr[length].getDY() * d5) + arcArr[length].getY();
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getSlope(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc = arcArr[i];
            if (d <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.mEllipseCenterX;
                    dArr[1] = arc.mEllipseCenterY;
                    return;
                } else {
                    arc.setPoint(d);
                    dArr[0] = arcArr[i].getDX();
                    dArr[1] = arcArr[i].getDY();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double d, float[] fArr) {
        Arc[] arcArr = this.mArcs;
        Arc arc = arcArr[0];
        double d2 = arc.mTime1;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.mLinear) {
                double linearX = arc.getLinearX(d2);
                Arc arc2 = arcArr[0];
                fArr[0] = (float) ((arc2.mEllipseCenterX * d3) + linearX);
                fArr[1] = (float) ((d3 * arcArr[0].mEllipseCenterY) + arc2.getLinearY(d2));
                return;
            }
            arc.setPoint(d2);
            fArr[0] = (float) ((arcArr[0].getDX() * d3) + arcArr[0].getX());
            fArr[1] = (float) ((arcArr[0].getDY() * d3) + arcArr[0].getY());
            return;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            double d4 = arcArr[arcArr.length - 1].mTime2;
            double d5 = d - d4;
            int length = arcArr.length - 1;
            Arc arc3 = arcArr[length];
            if (arc3.mLinear) {
                double linearX2 = arc3.getLinearX(d4);
                Arc arc4 = arcArr[length];
                fArr[0] = (float) ((arc4.mEllipseCenterX * d5) + linearX2);
                fArr[1] = (float) ((d5 * arcArr[length].mEllipseCenterY) + arc4.getLinearY(d4));
                return;
            }
            arc3.setPoint(d);
            fArr[0] = (float) arcArr[length].getX();
            fArr[1] = (float) arcArr[length].getY();
            return;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc5 = arcArr[i];
            if (d <= arc5.mTime2) {
                if (arc5.mLinear) {
                    fArr[0] = (float) arc5.getLinearX(d);
                    fArr[1] = (float) arcArr[i].getLinearY(d);
                    return;
                } else {
                    arc5.setPoint(d);
                    fArr[0] = (float) arcArr[i].getX();
                    fArr[1] = (float) arcArr[i].getY();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double getPos(double d) {
        Arc[] arcArr = this.mArcs;
        Arc arc = arcArr[0];
        double d2 = arc.mTime1;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.mLinear) {
                return (d3 * arcArr[0].mEllipseCenterX) + arc.getLinearX(d2);
            }
            arc.setPoint(d2);
            return (arcArr[0].getDX() * d3) + arcArr[0].getX();
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            double d4 = arcArr[arcArr.length - 1].mTime2;
            double d5 = d - d4;
            int length = arcArr.length - 1;
            return (d5 * arcArr[length].mEllipseCenterX) + arcArr[length].getLinearX(d4);
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc2 = arcArr[i];
            if (d <= arc2.mTime2) {
                if (arc2.mLinear) {
                    return arc2.getLinearX(d);
                }
                arc2.setPoint(d);
                return arcArr[i].getX();
            }
        }
        return Double.NaN;
    }
}
