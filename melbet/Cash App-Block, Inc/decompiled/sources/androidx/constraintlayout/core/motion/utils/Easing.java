package androidx.constraintlayout.core.motion.utils;

import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Easing {
    public final /* synthetic */ int $r8$classId;
    public Serializable mStr;
    public static final Easing sDefault = new Easing(0);
    public static final String[] NAMED_EASING = {"standard", "accelerate", "decelerate", "linear"};

    public final class CubicEasing extends Easing {
        public final double mX1;
        public final double mX2;
        public final double mY1;
        public final double mY2;

        public CubicEasing(String str) {
            super(0);
            this.mStr = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.mX1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.mY1 = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.mX2 = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.mY2 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public final double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x2 = getX(d5);
            double y = getY(d4);
            return (((d - x) * (getY(d5) - y)) / (x2 - x)) + y;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public final double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        public final double getX(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.mX2 * d5) + (this.mX1 * d4) + (d * d * d);
        }

        public final double getY(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.mY2 * d5) + (this.mY1 * d4) + (d * d * d);
        }
    }

    public Easing(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.mStr = new HashMap();
                break;
            default:
                this.mStr = "identity";
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        if (r19.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        char c = 3;
        if (str.startsWith("spline")) {
            StepCurve stepCurve = new StepCurve(0);
            stepCurve.mStr = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i = 0;
            while (indexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < copyOf.length; i2++) {
                double d2 = copyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = i2 * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
            System.out.println(" 0 " + monotonicCurveFit.getPos(0.0d));
            System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d));
            stepCurve.mCurveFit = monotonicCurveFit;
            return stepCurve;
        }
        if (str.startsWith("Schlick")) {
            Schlick schlick = new Schlick(0);
            schlick.mStr = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            schlick.mS = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i6 = indexOf4 + 1;
            schlick.mT = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return schlick;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case 4:
                return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return sDefault;
        }
    }

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    public float getFloatValue(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.mStr;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return (String) this.mStr;
            default:
                return super.toString();
        }
    }
}
