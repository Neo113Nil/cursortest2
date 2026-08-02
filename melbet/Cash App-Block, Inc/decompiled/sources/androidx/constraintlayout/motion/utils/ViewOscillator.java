package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$WavePoint;
import androidx.constraintlayout.core.motion.utils.MonotonicCurveFit;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.viewpager.widget.ViewPager;
import com.bugsnag.android.TraceParser;
import com.stripe.hcaptcha.HCaptcha;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ViewOscillator {
    public HCaptcha mCycleOscillator;
    public String mType;
    public int mWaveShape = 0;
    public String mWaveString = null;
    public int mVariesBy = 0;
    public final ArrayList mWavePoints = new ArrayList();

    public final class AlphaSet extends ViewOscillator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AlphaSet(int i) {
            this.$r8$classId = i;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f) {
            switch (this.$r8$classId) {
                case 0:
                    view.setAlpha(get(f));
                    break;
                case 1:
                    view.setElevation(get(f));
                    break;
                case 2:
                    view.setRotation(get(f));
                    break;
                case 3:
                    view.setRotationX(get(f));
                    break;
                case 4:
                    view.setRotationY(get(f));
                    break;
                case 5:
                    view.setScaleX(get(f));
                    break;
                case 6:
                    view.setScaleY(get(f));
                    break;
                case 7:
                    view.setTranslationX(get(f));
                    break;
                case 8:
                    view.setTranslationY(get(f));
                    break;
                default:
                    view.setTranslationZ(get(f));
                    break;
            }
        }
    }

    public final class CustomSet extends ViewOscillator {
        public ConstraintAttribute mCustom;
        public float[] mValue;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setCustom(ConstraintAttribute constraintAttribute) {
            this.mCustom = constraintAttribute;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f) {
            float[] fArr = this.mValue;
            fArr[0] = get(f);
            CustomSupport.setInterpolatedValue(this.mCustom, view, fArr);
        }
    }

    public final class PathRotateSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f) {
        }
    }

    public final class ProgressSet extends ViewOscillator {
        public boolean mNoMethod;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void setProperty(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    public static ViewOscillator makeSpline(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        if (str.startsWith("CUSTOM")) {
            CustomSet customSet = new CustomSet();
            customSet.mValue = new float[1];
            return customSet;
        }
        i = 9;
        i2 = 8;
        i3 = 7;
        i4 = 6;
        i5 = 5;
        i6 = 4;
        i7 = 3;
        i8 = 2;
        i9 = 0;
        switch (str) {
            case "rotationX":
                return new AlphaSet(i7);
            case "rotationY":
                return new AlphaSet(i6);
            case "translationX":
                return new AlphaSet(i3);
            case "translationY":
                return new AlphaSet(i2);
            case "translationZ":
                return new AlphaSet(i);
            case "progress":
                ProgressSet progressSet = new ProgressSet();
                progressSet.mNoMethod = false;
                return progressSet;
            case "scaleX":
                return new AlphaSet(i5);
            case "scaleY":
                return new AlphaSet(i4);
            case "waveVariesBy":
                return new AlphaSet(i9);
            case "rotation":
                return new AlphaSet(i8);
            case "elevation":
                return new AlphaSet(i10);
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet(i9);
            case "waveOffset":
                return new AlphaSet(i9);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float get(float f) {
        double d;
        char c;
        double signum;
        double abs;
        HCaptcha hCaptcha = this.mCycleOscillator;
        CurveFit curveFit = (CurveFit) hCaptcha.internalConfig;
        double[] dArr = (double[]) hCaptcha.captchaVerifier;
        if (curveFit != null) {
            curveFit.getPos(f, dArr);
        } else {
            dArr[0] = ((float[]) hCaptcha.onOpenListeners)[0];
            dArr[1] = ((float[]) hCaptcha.handler)[0];
            dArr[2] = ((float[]) hCaptcha.exception)[0];
        }
        double[] dArr2 = (double[]) hCaptcha.captchaVerifier;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        TraceParser traceParser = (TraceParser) hCaptcha.result;
        double d4 = f;
        traceParser.getClass();
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            c = 2;
        } else {
            if (d4 < 1.0d) {
                int binarySearch = Arrays.binarySearch((double[]) traceParser.projectPackages, d4);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                float[] fArr = (float[]) traceParser.logger;
                float f2 = fArr[binarySearch];
                int i = binarySearch - 1;
                float f3 = fArr[i];
                d = 2.0d;
                double d6 = f2 - f3;
                double[] dArr3 = (double[]) traceParser.projectPackages;
                double d7 = dArr3[binarySearch];
                double d8 = dArr3[i];
                double d9 = d6 / (d7 - d8);
                c = 2;
                d5 = ((((d4 * d4) - (d8 * d8)) * d9) / 2.0d) + ((d4 - d8) * (f3 - (d9 * d8))) + ((double[]) traceParser.currentThread)[i];
                double d10 = d5 + d3;
                switch (traceParser.state) {
                    case 1:
                        signum = Math.signum(0.5d - (d10 % 1.0d));
                        break;
                    case 2:
                        abs = Math.abs((((d10 * 4.0d) + 1.0d) % 4.0d) - d);
                        signum = 1.0d - abs;
                        break;
                    case 3:
                        signum = (((d10 * d) + 1.0d) % d) - 1.0d;
                        break;
                    case 4:
                        signum = 1.0d - (((d10 * d) + 1.0d) % d);
                        break;
                    case 5:
                        signum = Math.cos((d3 + d10) * 6.283185307179586d);
                        break;
                    case 6:
                        double abs2 = 1.0d - Math.abs(((d10 * 4.0d) % 4.0d) - d);
                        abs = abs2 * abs2;
                        signum = 1.0d - abs;
                        break;
                    case 7:
                        signum = ((MonotonicCurveFit) traceParser.threadAttrs).getPos(d10 % 1.0d);
                        break;
                    default:
                        signum = Math.sin(6.283185307179586d * d10);
                        break;
                }
                return (float) ((signum * ((double[]) hCaptcha.captchaVerifier)[c]) + d2);
            }
            c = 2;
            d5 = 1.0d;
        }
        d = 2.0d;
        double d102 = d5 + d3;
        switch (traceParser.state) {
        }
        return (float) ((signum * ((double[]) hCaptcha.captchaVerifier)[c]) + d2);
    }

    public void setCustom(ConstraintAttribute constraintAttribute) {
    }

    public abstract void setProperty(View view, float f);

    public final void setup() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList arrayList = this.mWavePoints;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new ViewPager.AnonymousClass1(6));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.mWaveShape;
        String str = this.mWaveString;
        HCaptcha hCaptcha = new HCaptcha();
        TraceParser traceParser = new TraceParser(4);
        traceParser.logger = new float[0];
        traceParser.projectPackages = new double[0];
        hCaptcha.result = traceParser;
        traceParser.state = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int indexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i7 = 0;
            d = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d2 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < copyOf.length) {
                double d3 = copyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = i8 * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            traceParser.threadAttrs = new MonotonicCurveFit(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        hCaptcha.exception = new float[size];
        hCaptcha.onSuccessListeners = new double[size];
        hCaptcha.onFailureListeners = new float[size];
        hCaptcha.onOpenListeners = new float[size];
        hCaptcha.handler = new float[size];
        float[] fArr = new float[size];
        this.mCycleOscillator = hCaptcha;
        Iterator it = arrayList.iterator();
        int i12 = i4;
        while (it.hasNext()) {
            KeyCycleOscillator$WavePoint keyCycleOscillator$WavePoint = (KeyCycleOscillator$WavePoint) it.next();
            float f = keyCycleOscillator$WavePoint.mPeriod;
            dArr[i12] = f * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = keyCycleOscillator$WavePoint.mValue;
            dArr6[i4] = f2;
            float f3 = keyCycleOscillator$WavePoint.mOffset;
            dArr6[i2] = f3;
            float f4 = keyCycleOscillator$WavePoint.mPhase;
            dArr6[i] = f4;
            HCaptcha hCaptcha2 = this.mCycleOscillator;
            ((double[]) hCaptcha2.onSuccessListeners)[i12] = keyCycleOscillator$WavePoint.mPosition / 100.0d;
            ((float[]) hCaptcha2.onFailureListeners)[i12] = f;
            ((float[]) hCaptcha2.onOpenListeners)[i12] = f3;
            ((float[]) hCaptcha2.handler)[i12] = f4;
            ((float[]) hCaptcha2.exception)[i12] = f2;
            i12++;
        }
        HCaptcha hCaptcha3 = this.mCycleOscillator;
        float[] fArr2 = (float[]) hCaptcha3.onFailureListeners;
        TraceParser traceParser2 = (TraceParser) hCaptcha3.result;
        double[] dArr7 = (double[]) hCaptcha3.onSuccessListeners;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) hCaptcha3.exception;
        hCaptcha3.captchaVerifier = new double[fArr3.length + i13];
        double[] dArr9 = new double[fArr3.length + i13];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            traceParser2.addPoint(0.0d, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            traceParser2.addPoint(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr10 = dArr8[i14];
            dArr10[i4] = ((float[]) hCaptcha3.onOpenListeners)[i14];
            dArr10[i2] = ((float[]) hCaptcha3.handler)[i14];
            dArr10[2] = fArr3[i14];
            traceParser2.addPoint(dArr7[i14], fArr2[i14]);
        }
        double d7 = 0.0d;
        int i15 = i4;
        while (true) {
            if (i15 >= ((float[]) traceParser2.logger).length) {
                break;
            }
            d7 += r9[i15];
            i15++;
        }
        double d8 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr4 = (float[]) traceParser2.logger;
            if (i16 >= fArr4.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr4[i17] + fArr4[i16]) / 2.0f;
            double[] dArr11 = (double[]) traceParser2.projectPackages;
            d8 = ((dArr11[i16] - dArr11[i17]) * f5) + d8;
            i16++;
        }
        int i18 = i4;
        while (true) {
            float[] fArr5 = (float[]) traceParser2.logger;
            if (i18 >= fArr5.length) {
                break;
            }
            fArr5[i18] = fArr5[i18] * ((float) (d7 / d8));
            i18++;
            d6 = d6;
        }
        ((double[]) traceParser2.currentThread)[i4] = d6;
        int i19 = i2;
        while (true) {
            float[] fArr6 = (float[]) traceParser2.logger;
            if (i19 >= fArr6.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr6[i20] + fArr6[i19]) / 2.0f;
            double[] dArr12 = (double[]) traceParser2.projectPackages;
            double d9 = dArr12[i19] - dArr12[i20];
            double[] dArr13 = (double[]) traceParser2.currentThread;
            dArr13[i19] = (d9 * f6) + dArr13[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            hCaptcha3.internalConfig = CurveFit.get(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            hCaptcha3.internalConfig = null;
        }
        CurveFit.get(i5, dArr, dArr2);
    }

    public final String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            KeyCycleOscillator$WavePoint keyCycleOscillator$WavePoint = (KeyCycleOscillator$WavePoint) it.next();
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, "[");
            m108m.append(keyCycleOscillator$WavePoint.mPosition);
            m108m.append(" , ");
            m108m.append(decimalFormat.format(keyCycleOscillator$WavePoint.mValue));
            m108m.append("] ");
            str = m108m.toString();
        }
        return str;
    }
}
