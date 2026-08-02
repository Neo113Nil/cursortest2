package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import sqip.internal.CardImage;

/* loaded from: classes3.dex */
public final class MotionController {
    public ArcCurveFit mArcSpline;
    public int[] mAttributeInterpolatorCount;
    public String[] mAttributeNames;
    public HashMap mAttributesMap;
    public HashMap mCycleMap;
    public final int mId;
    public double[] mInterpolateData;
    public int[] mInterpolateVariables;
    public double[] mInterpolateVelocity;
    public KeyTrigger[] mKeyTriggers;
    public CurveFit[] mSpline;
    public HashMap mTimeCycleAttributesMap;
    public final View mView;
    public final Rect mTempRect = new Rect();
    public boolean mForceMeasure = false;
    public int mCurveFitType = -1;
    public final MotionPaths mStartMotionPath = new MotionPaths();
    public final MotionPaths mEndMotionPath = new MotionPaths();
    public final MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    public final MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    public float mMotionStagger = Float.NaN;
    public float mStaggerOffset = RecyclerView.DECELERATION_RATE;
    public float mStaggerScale = 1.0f;
    public final float[] mValuesBuff = new float[4];
    public final ArrayList mMotionPaths = new ArrayList();
    public final float[] mVelocity = new float[1];
    public final ArrayList mKeyList = new ArrayList();
    public int mPathMotionArc = -1;
    public int mTransformPivotTarget = -1;
    public View mTransformPivotView = null;
    public int mQuantizeMotionSteps = -1;
    public float mQuantizeMotionPhase = Float.NaN;
    public Interpolator mQuantizeMotionInterpolator = null;
    public boolean mNoMovement = false;

    public MotionController(View view) {
        this.mView = view;
        this.mId = view.getId();
        view.getLayoutParams();
    }

    public static void rotate(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float getAdjustedPosition(float f, float[] fArr) {
        float f2 = RecyclerView.DECELERATION_RATE;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator it = this.mMotionPaths.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths motionPaths = (MotionPaths) it.next();
            Easing easing2 = motionPaths.mKeyFrameEasing;
            if (easing2 != null) {
                float f6 = motionPaths.mTime;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.mTime;
                }
            }
        }
        if (easing == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float f8 = (((float) easing.get(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) easing.getDiff(d);
        }
        return f8;
    }

    public final void getCenter(double d, float[] fArr, float[] fArr2) {
        float f;
        char c;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        float f2 = RecyclerView.DECELERATION_RATE;
        Arrays.fill(fArr2, RecyclerView.DECELERATION_RATE);
        int[] iArr = this.mInterpolateVariables;
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.mX;
        float f4 = motionPaths.mY;
        float f5 = motionPaths.mWidth;
        float f6 = motionPaths.mHeight;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i = 0;
        while (i < iArr.length) {
            double[] dArr3 = dArr;
            float f10 = (float) dArr3[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                c = 4;
                f3 = f10;
                f7 = f11;
            } else if (i2 == 2) {
                c = 4;
                f4 = f10;
                f2 = f11;
            } else if (i2 != 3) {
                c = 4;
                if (i2 == 4) {
                    f6 = f10;
                    f9 = f11;
                }
            } else {
                c = 4;
                f5 = f10;
                f8 = f11;
            }
            i++;
            dArr = dArr3;
        }
        float f12 = (f8 / 2.0f) + f7;
        float f13 = (f9 / 2.0f) + f2;
        MotionController motionController = motionPaths.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) (((Math.sin(d3) * d2) + f14) - (f5 / 2.0f));
            float cos = (float) ((f15 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f7;
            f = 2.0f;
            double d5 = f2;
            float cos2 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f16);
            float sin2 = (float) ((Math.sin(d3) * d5) + (f17 - (Math.cos(d3) * d4)));
            f3 = sin;
            f4 = cos;
            f12 = cos2;
            f13 = sin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + RecyclerView.DECELERATION_RATE;
        fArr[1] = (f6 / f) + f4 + RecyclerView.DECELERATION_RATE;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final float getPreCycleDistance() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float f = RecyclerView.DECELERATION_RATE;
        for (int i = 0; i < 100; i++) {
            float f2 = i * 0.01010101f;
            double d3 = f2;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator it = this.mMotionPaths.iterator();
            float f3 = Float.NaN;
            float f4 = RecyclerView.DECELERATION_RATE;
            while (it.hasNext()) {
                MotionPaths motionPaths = (MotionPaths) it.next();
                Easing easing2 = motionPaths.mKeyFrameEasing;
                float f5 = f2;
                if (easing2 != null) {
                    float f6 = motionPaths.mTime;
                    if (f6 < f5) {
                        f4 = f6;
                        easing = easing2;
                    } else if (Float.isNaN(f3)) {
                        f3 = motionPaths.mTime;
                    }
                }
                f2 = f5;
            }
            float f7 = f2;
            if (easing != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                d3 = (((float) easing.get((f7 - f4) / r8)) * (f3 - f4)) + f4;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d3, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i > 0) {
                f += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f;
    }

    public final boolean interpolate(float f, long j, View view, Easing easing) {
        boolean z;
        boolean z2;
        float f2;
        ViewTimeCycle.PathRotate pathRotate;
        float f3;
        boolean z3;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        ViewTimeCycle.PathRotate pathRotate2 = null;
        float adjustedPosition = getAdjustedPosition(f, null);
        int i = this.mQuantizeMotionSteps;
        if (i != -1) {
            float f9 = 1.0f / i;
            float floor = ((float) Math.floor(adjustedPosition / f9)) * f9;
            float f10 = (adjustedPosition % f9) / f9;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f10 = (f10 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f10) : ((double) f10) > 0.5d ? 1.0f : RecyclerView.DECELERATION_RATE) * f9) + floor;
        }
        HashMap hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).setProperty(view, adjustedPosition);
            }
        }
        HashMap hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate3 = null;
            z = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate3 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z |= viewTimeCycle.setProperty(adjustedPosition, j, view, easing);
                }
            }
            pathRotate2 = pathRotate3;
        } else {
            z = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        MotionPaths motionPaths = this.mStartMotionPath;
        if (curveFitArr != null) {
            double d2 = adjustedPosition;
            curveFitArr[0].getPos(d2, this.mInterpolateData);
            this.mSpline[0].getSlope(d2, this.mInterpolateVelocity);
            ArcCurveFit arcCurveFit = this.mArcSpline;
            if (arcCurveFit != null) {
                double[] dArr = this.mInterpolateData;
                f2 = RecyclerView.DECELERATION_RATE;
                if (dArr.length > 0) {
                    arcCurveFit.getPos(d2, dArr);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                }
            } else {
                f2 = RecyclerView.DECELERATION_RATE;
            }
            if (this.mNoMovement) {
                pathRotate = pathRotate2;
                f3 = 1.0f;
                z3 = z;
                d = d2;
                f4 = 2.0f;
            } else {
                int[] iArr = this.mInterpolateVariables;
                double[] dArr2 = this.mInterpolateData;
                f4 = 2.0f;
                double[] dArr3 = this.mInterpolateVelocity;
                f3 = 1.0f;
                boolean z4 = this.mForceMeasure;
                float f11 = motionPaths.mX;
                float f12 = motionPaths.mY;
                float f13 = motionPaths.mWidth;
                int i2 = 1;
                float f14 = motionPaths.mHeight;
                pathRotate = pathRotate2;
                if (iArr.length != 0) {
                    f5 = f13;
                    if (motionPaths.mTempValue.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        motionPaths.mTempValue = new double[i3];
                        motionPaths.mTempDelta = new double[i3];
                    }
                } else {
                    f5 = f13;
                }
                Arrays.fill(motionPaths.mTempValue, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = motionPaths.mTempValue;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    motionPaths.mTempDelta[i5] = dArr3[i4];
                }
                float f15 = Float.NaN;
                float f16 = f2;
                float f17 = f16;
                float f18 = f17;
                float f19 = f18;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = motionPaths.mTempValue;
                    f6 = f14;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f8 = f11;
                    } else {
                        f8 = f11;
                        float f20 = (float) (Double.isNaN(motionPaths.mTempValue[i6]) ? 0.0d : motionPaths.mTempValue[i6] + 0.0d);
                        float f21 = (float) motionPaths.mTempDelta[i6];
                        if (i6 == i2) {
                            f17 = f21;
                            f14 = f6;
                            f11 = f20;
                        } else if (i6 == 2) {
                            f16 = f21;
                            f11 = f8;
                            f14 = f6;
                            f12 = f20;
                        } else if (i6 == 3) {
                            f18 = f21;
                            f11 = f8;
                            f14 = f6;
                            f5 = f20;
                        } else if (i6 == 4) {
                            f19 = f21;
                            f11 = f8;
                            f14 = f20;
                        } else if (i6 == 5) {
                            f11 = f8;
                            f14 = f6;
                            f15 = f20;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f11 = f8;
                    f14 = f6;
                    i6++;
                    i2 = 1;
                }
                float f22 = f11;
                MotionController motionController = motionPaths.mRelativeToController;
                if (motionController != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motionController.getCenter(d2, fArr, fArr2);
                    float f23 = fArr[0];
                    float f24 = fArr[1];
                    float f25 = fArr2[0];
                    float f26 = fArr2[1];
                    z3 = z;
                    d = d2;
                    double d3 = f22;
                    double d4 = f12;
                    f7 = (float) (((Math.sin(d4) * d3) + f23) - (f5 / 2.0f));
                    f12 = (float) ((f24 - (Math.cos(d4) * d3)) - (f6 / 2.0f));
                    double d5 = f17;
                    double d6 = f16;
                    float cos = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + f25);
                    float sin = (float) ((Math.sin(d4) * d3 * d6) + (f26 - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos;
                        dArr3[1] = sin;
                    }
                    if (!Float.isNaN(f15)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos)) + f15));
                    }
                } else {
                    f7 = f22;
                    z3 = z;
                    d = d2;
                    if (!Float.isNaN(f15)) {
                        view.setRotation(f15 + ((float) Math.toDegrees(Math.atan2((f19 / 2.0f) + f16, (f18 / 2.0f) + f17))) + f2);
                    }
                }
                float f27 = f7 + 0.5f;
                int i7 = (int) f27;
                float f28 = f12 + 0.5f;
                int i8 = (int) f28;
                int i9 = (int) (f27 + f5);
                int i10 = (int) (f28 + f6);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z4) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view.layout(i7, i8, i9, i10);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / f4;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / f4;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr6 = this.mInterpolateVelocity;
                        if (dArr6.length > 1) {
                            view.setRotation(((ViewSpline.PathRotate) viewSpline).get(adjustedPosition) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr7 = this.mInterpolateVelocity;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                ViewTimeCycle.PathRotate pathRotate4 = pathRotate;
                view.setRotation(pathRotate4.get(adjustedPosition, j, view, easing) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z2 = z3 | pathRotate4.mContinue;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i13 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit = curveFitArr2[i13];
                float[] fArr3 = this.mValuesBuff;
                curveFit.getPos(d, fArr3);
                CustomSupport.setInterpolatedValue((ConstraintAttribute) motionPaths.mAttributes.get(this.mAttributeNames[i13 - 1]), view, fArr3);
                i13++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= f2) {
                    view.setVisibility(motionConstrainedPoint.mVisibility);
                } else {
                    MotionConstrainedPoint motionConstrainedPoint2 = this.mEndPoint;
                    if (adjustedPosition >= f3) {
                        view.setVisibility(motionConstrainedPoint2.mVisibility);
                    } else if (motionConstrainedPoint2.mVisibility != motionConstrainedPoint.mVisibility) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.mKeyTriggers != null) {
                int i14 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i14 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i14].conditionallyFire(view, adjustedPosition);
                    i14++;
                }
            }
        } else {
            boolean z5 = z;
            float f29 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float m = CameraState$Type$EnumUnboxingLocalUtility.m(motionPaths2.mX, f29, adjustedPosition, f29);
            float f30 = motionPaths.mY;
            float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(motionPaths2.mY, f30, adjustedPosition, f30);
            float f31 = motionPaths.mWidth;
            float f32 = motionPaths2.mWidth;
            float m3 = CameraState$Type$EnumUnboxingLocalUtility.m(f32, f31, adjustedPosition, f31);
            float f33 = motionPaths.mHeight;
            float f34 = motionPaths2.mHeight;
            float f35 = m + 0.5f;
            int i15 = (int) f35;
            float f36 = m2 + 0.5f;
            int i16 = (int) f36;
            int i17 = (int) (f35 + m3);
            int m4 = (int) (f36 + CameraState$Type$EnumUnboxingLocalUtility.m(f34, f33, adjustedPosition, f33));
            int i18 = i17 - i15;
            int i19 = m4 - i16;
            if (f32 != f31 || f34 != f33 || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i15, i16, i17, m4);
            z2 = z5;
        }
        HashMap hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr8 = this.mInterpolateVelocity;
                    view.setRotation(((ViewOscillator.PathRotateSet) viewOscillator).get(adjustedPosition) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    viewOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return z2;
    }

    public final void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:403:0x0cbd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v92, types: [androidx.constraintlayout.motion.utils.ViewSpline, androidx.constraintlayout.motion.utils.ViewSpline$CustomSet] */
    /* JADX WARN: Type inference failed for: r4v67, types: [androidx.constraintlayout.motion.utils.ViewTimeCycle, androidx.constraintlayout.motion.utils.ViewTimeCycle$CustomSet] */
    /* JADX WARN: Type inference failed for: r6v104, types: [androidx.constraintlayout.motion.utils.ViewSpline, androidx.constraintlayout.motion.utils.ViewSpline$ProgressSet] */
    /* JADX WARN: Type inference failed for: r6v112, types: [androidx.constraintlayout.motion.utils.ViewSpline] */
    /* JADX WARN: Type inference failed for: r9v41, types: [androidx.constraintlayout.motion.utils.ViewTimeCycle, androidx.constraintlayout.motion.utils.ViewTimeCycle$ProgressSet] */
    /* JADX WARN: Type inference failed for: r9v46, types: [androidx.constraintlayout.motion.utils.ViewTimeCycle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setup(int i, int i2, long j) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet2;
        HashSet hashSet3;
        MotionPaths motionPaths;
        Object obj2;
        String str7;
        ArrayList arrayList2;
        MotionPaths motionPaths2;
        Object obj3;
        String str8;
        int i3;
        String str9;
        int i4;
        ConstraintAttribute constraintAttribute;
        HashSet hashSet4;
        String str10;
        HashMap hashMap;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        char c;
        char c2;
        ViewTimeCycle.AlphaSet alphaSet;
        String str12;
        Object obj6;
        ViewTimeCycle.AlphaSet alphaSet2;
        ViewTimeCycle.AlphaSet alphaSet3;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet hashSet5;
        String str13;
        String str14;
        String str15;
        String str16;
        HashSet hashSet6;
        String str17;
        ArrayList arrayList3;
        Object obj7;
        Iterator it2;
        String str18;
        HashSet hashSet7;
        Object obj8;
        MotionPaths motionPaths3;
        Object obj9;
        MotionPaths motionPaths4;
        Object obj10;
        char c3;
        char c4;
        char c5;
        Object obj11;
        ViewSpline.AlphaSet alphaSet4;
        ViewSpline.AlphaSet alphaSet5;
        ConstraintAttribute constraintAttribute3;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i5;
        float min;
        float f;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap hashMap2 = new HashMap();
        int i6 = this.mPathMotionArc;
        MotionPaths motionPaths5 = this.mStartMotionPath;
        if (i6 != -1) {
            motionPaths5.mPathMotionArc = i6;
        }
        MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
        float f2 = motionConstrainedPoint.mAlpha;
        MotionConstrainedPoint motionConstrainedPoint2 = this.mEndPoint;
        if (MotionConstrainedPoint.diff(f2, motionConstrainedPoint2.mAlpha)) {
            hashSet9.add("alpha");
        }
        boolean diff = MotionConstrainedPoint.diff(motionConstrainedPoint.mElevation, motionConstrainedPoint2.mElevation);
        String str24 = CardImage.ELEVATION;
        if (diff) {
            hashSet9.add(CardImage.ELEVATION);
        }
        int i7 = motionConstrainedPoint.mVisibility;
        int i8 = motionConstrainedPoint2.mVisibility;
        if (i7 != i8 && motionConstrainedPoint.mVisibilityMode == 0 && (i7 == 0 || i8 == 0)) {
            hashSet9.add("alpha");
        }
        String str25 = "rotation";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mRotation, motionConstrainedPoint2.mRotation)) {
            hashSet9.add("rotation");
        }
        String str26 = "transitionPathRotate";
        if (!Float.isNaN(motionConstrainedPoint.mPathRotate) || !Float.isNaN(motionConstrainedPoint2.mPathRotate)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(motionConstrainedPoint.mProgress) || !Float.isNaN(motionConstrainedPoint2.mProgress)) {
            hashSet9.add("progress");
        }
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mRotationX, motionConstrainedPoint2.mRotationX)) {
            hashSet9.add("rotationX");
        }
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.rotationY, motionConstrainedPoint2.rotationY)) {
            hashSet9.add("rotationY");
        }
        Object obj12 = "rotationX";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mPivotX, motionConstrainedPoint2.mPivotX)) {
            hashSet9.add("transformPivotX");
        }
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mPivotY, motionConstrainedPoint2.mPivotY)) {
            hashSet9.add("transformPivotY");
        }
        String str27 = "scaleX";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mScaleX, motionConstrainedPoint2.mScaleX)) {
            hashSet9.add("scaleX");
        }
        Object obj13 = "rotationY";
        String str28 = "scaleY";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mScaleY, motionConstrainedPoint2.mScaleY)) {
            hashSet9.add("scaleY");
        }
        Object obj14 = "progress";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mTranslationX, motionConstrainedPoint2.mTranslationX)) {
            hashSet9.add("translationX");
        }
        Object obj15 = "translationX";
        String str29 = "translationY";
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mTranslationY, motionConstrainedPoint2.mTranslationY)) {
            hashSet9.add("translationY");
        }
        if (MotionConstrainedPoint.diff(motionConstrainedPoint.mTranslationZ, motionConstrainedPoint2.mTranslationZ)) {
            hashSet9.add("translationZ");
        }
        MotionPaths motionPaths6 = this.mEndMotionPath;
        ArrayList arrayList4 = this.mMotionPaths;
        ArrayList arrayList5 = this.mKeyList;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it3.hasNext()) {
                Key key = (Key) it3.next();
                String str30 = str29;
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    MotionPaths motionPaths7 = new MotionPaths();
                    str23 = str27;
                    motionPaths7.mDrawPath = 0;
                    motionPaths7.mPathRotate = Float.NaN;
                    motionPaths7.mPathMotionArc = -1;
                    motionPaths7.mAnimateRelativeTo = -1;
                    motionPaths7.mRelativeAngle = Float.NaN;
                    motionPaths7.mRelativeToController = null;
                    motionPaths7.mAttributes = new LinkedHashMap();
                    motionPaths7.mMode = 0;
                    str19 = str28;
                    motionPaths7.mTempValue = new double[18];
                    motionPaths7.mTempDelta = new double[18];
                    if (motionPaths5.mAnimateRelativeTo != -1) {
                        float f3 = keyPosition.mFramePosition / 100.0f;
                        motionPaths7.mTime = f3;
                        motionPaths7.mDrawPath = keyPosition.mDrawPath;
                        motionPaths7.mMode = keyPosition.mPositionType;
                        float f4 = Float.isNaN(keyPosition.mPercentWidth) ? f3 : keyPosition.mPercentWidth;
                        str21 = str25;
                        float f5 = Float.isNaN(keyPosition.mPercentHeight) ? f3 : keyPosition.mPercentHeight;
                        str20 = str24;
                        float f6 = motionPaths6.mWidth - motionPaths5.mWidth;
                        float f7 = motionPaths6.mHeight;
                        float f8 = motionPaths5.mHeight;
                        motionPaths7.mPosition = motionPaths7.mTime;
                        motionPaths7.mWidth = (int) ((f6 * f4) + r11);
                        motionPaths7.mHeight = (int) (((f7 - f8) * f5) + f8);
                        int i9 = keyPosition.mPositionType;
                        str22 = str26;
                        float f9 = keyPosition.mPercentX;
                        if (i9 != 2) {
                            float f10 = Float.isNaN(f9) ? f3 : keyPosition.mPercentX;
                            float f11 = motionPaths6.mX;
                            float f12 = motionPaths5.mX;
                            motionPaths7.mX = CameraState$Type$EnumUnboxingLocalUtility.m(f11, f12, f10, f12);
                            if (!Float.isNaN(keyPosition.mPercentY)) {
                                f3 = keyPosition.mPercentY;
                            }
                            float f13 = motionPaths6.mY;
                            float f14 = motionPaths5.mY;
                            motionPaths7.mY = CameraState$Type$EnumUnboxingLocalUtility.m(f13, f14, f3, f14);
                        } else {
                            if (Float.isNaN(f9)) {
                                float f15 = motionPaths6.mX;
                                float f16 = motionPaths5.mX;
                                min = CameraState$Type$EnumUnboxingLocalUtility.m(f15, f16, f3, f16);
                            } else {
                                min = keyPosition.mPercentX * Math.min(f5, f4);
                            }
                            motionPaths7.mX = min;
                            if (Float.isNaN(keyPosition.mPercentY)) {
                                float f17 = motionPaths6.mY;
                                float f18 = motionPaths5.mY;
                                f = CameraState$Type$EnumUnboxingLocalUtility.m(f17, f18, f3, f18);
                            } else {
                                f = keyPosition.mPercentY;
                            }
                            motionPaths7.mY = f;
                        }
                        motionPaths7.mAnimateRelativeTo = motionPaths5.mAnimateRelativeTo;
                        motionPaths7.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
                        motionPaths7.mPathMotionArc = keyPosition.mPathMotionArc;
                    } else {
                        str20 = str24;
                        str21 = str25;
                        str22 = str26;
                        int i10 = keyPosition.mPositionType;
                        int i11 = keyPosition.mFramePosition;
                        if (i10 == 1) {
                            float f19 = i11 / 100.0f;
                            motionPaths7.mTime = f19;
                            motionPaths7.mDrawPath = keyPosition.mDrawPath;
                            float f20 = Float.isNaN(keyPosition.mPercentWidth) ? f19 : keyPosition.mPercentWidth;
                            float f21 = Float.isNaN(keyPosition.mPercentHeight) ? f19 : keyPosition.mPercentHeight;
                            float f22 = motionPaths6.mWidth - motionPaths5.mWidth;
                            float f23 = f19;
                            float f24 = motionPaths6.mHeight - motionPaths5.mHeight;
                            motionPaths7.mPosition = motionPaths7.mTime;
                            if (!Float.isNaN(keyPosition.mPercentX)) {
                                f23 = keyPosition.mPercentX;
                            }
                            float f25 = (motionPaths5.mWidth / 2.0f) + motionPaths5.mX;
                            float f26 = motionPaths5.mY;
                            float f27 = motionPaths5.mHeight;
                            float f28 = ((motionPaths6.mWidth / 2.0f) + motionPaths6.mX) - f25;
                            float f29 = ((motionPaths6.mHeight / 2.0f) + motionPaths6.mY) - ((f27 / 2.0f) + f26);
                            float f30 = f28 * f23;
                            float f31 = (f22 * f20) / 2.0f;
                            motionPaths7.mX = (int) ((r8 + f30) - f31);
                            float f32 = f23 * f29;
                            float f33 = (f24 * f21) / 2.0f;
                            motionPaths7.mY = (int) ((f26 + f32) - f33);
                            motionPaths7.mWidth = (int) (r8 + r13);
                            motionPaths7.mHeight = (int) (f27 + r15);
                            float f34 = Float.isNaN(keyPosition.mPercentY) ? RecyclerView.DECELERATION_RATE : keyPosition.mPercentY;
                            motionPaths7.mMode = 1;
                            float f35 = (int) ((motionPaths5.mX + f30) - f31);
                            float f36 = (int) ((motionPaths5.mY + f32) - f33);
                            motionPaths7.mX = f35 + ((-f29) * f34);
                            motionPaths7.mY = f36 + (f28 * f34);
                            motionPaths7.mAnimateRelativeTo = motionPaths7.mAnimateRelativeTo;
                            motionPaths7.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
                            motionPaths7.mPathMotionArc = keyPosition.mPathMotionArc;
                        } else if (i10 == 2) {
                            float f37 = i11 / 100.0f;
                            motionPaths7.mTime = f37;
                            motionPaths7.mDrawPath = keyPosition.mDrawPath;
                            float f38 = Float.isNaN(keyPosition.mPercentWidth) ? f37 : keyPosition.mPercentWidth;
                            float f39 = Float.isNaN(keyPosition.mPercentHeight) ? f37 : keyPosition.mPercentHeight;
                            float f40 = motionPaths6.mWidth;
                            float f41 = motionPaths5.mWidth;
                            float f42 = f40 - f41;
                            float f43 = motionPaths6.mHeight;
                            float f44 = motionPaths5.mHeight;
                            float f45 = f43 - f44;
                            motionPaths7.mPosition = motionPaths7.mTime;
                            float f46 = (f41 / 2.0f) + motionPaths5.mX;
                            float f47 = motionPaths5.mY;
                            float f48 = (f40 / 2.0f) + motionPaths6.mX;
                            float f49 = ((f43 / 2.0f) + motionPaths6.mY) - ((f44 / 2.0f) + f47);
                            float f50 = f42 * f38;
                            motionPaths7.mX = (int) ((((f48 - f46) * f37) + r8) - (f50 / 2.0f));
                            float f51 = f45 * f39;
                            motionPaths7.mY = (int) (((f49 * f37) + f47) - (f51 / 2.0f));
                            motionPaths7.mWidth = (int) (f41 + f50);
                            motionPaths7.mHeight = (int) (f44 + f51);
                            motionPaths7.mMode = 2;
                            if (!Float.isNaN(keyPosition.mPercentX)) {
                                motionPaths7.mX = (int) (keyPosition.mPercentX * (i - ((int) motionPaths7.mWidth)));
                            }
                            if (!Float.isNaN(keyPosition.mPercentY)) {
                                motionPaths7.mY = (int) (keyPosition.mPercentY * (i2 - ((int) motionPaths7.mHeight)));
                            }
                            motionPaths7.mAnimateRelativeTo = motionPaths7.mAnimateRelativeTo;
                            motionPaths7.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
                            motionPaths7.mPathMotionArc = keyPosition.mPathMotionArc;
                        } else if (i10 != 3) {
                            float f52 = i11 / 100.0f;
                            motionPaths7.mTime = f52;
                            motionPaths7.mDrawPath = keyPosition.mDrawPath;
                            float f53 = Float.isNaN(keyPosition.mPercentWidth) ? f52 : keyPosition.mPercentWidth;
                            float f54 = Float.isNaN(keyPosition.mPercentHeight) ? f52 : keyPosition.mPercentHeight;
                            float f55 = motionPaths6.mWidth;
                            float f56 = motionPaths5.mWidth;
                            float f57 = f55 - f56;
                            float f58 = motionPaths6.mHeight;
                            float f59 = motionPaths5.mHeight;
                            float f60 = f58 - f59;
                            motionPaths7.mPosition = motionPaths7.mTime;
                            float f61 = (f56 / 2.0f) + motionPaths5.mX;
                            float f62 = motionPaths5.mY;
                            float f63 = ((f55 / 2.0f) + motionPaths6.mX) - f61;
                            float f64 = ((f58 / 2.0f) + motionPaths6.mY) - ((f59 / 2.0f) + f62);
                            float f65 = (f57 * f53) / 2.0f;
                            motionPaths7.mX = (int) (((f63 * f52) + r8) - f65);
                            float f66 = (f60 * f54) / 2.0f;
                            motionPaths7.mY = (int) (((f64 * f52) + f62) - f66);
                            motionPaths7.mWidth = (int) (f56 + r34);
                            motionPaths7.mHeight = (int) (f59 + r42);
                            float f67 = Float.isNaN(keyPosition.mPercentX) ? f52 : keyPosition.mPercentX;
                            float f68 = Float.isNaN(Float.NaN) ? RecyclerView.DECELERATION_RATE : Float.NaN;
                            float f69 = f67;
                            float f70 = Float.isNaN(keyPosition.mPercentY) ? f52 : keyPosition.mPercentY;
                            float f71 = Float.isNaN(Float.NaN) ? RecyclerView.DECELERATION_RATE : Float.NaN;
                            float f72 = f70;
                            motionPaths7.mMode = 0;
                            motionPaths7.mX = (int) (((f71 * f64) + ((f69 * f63) + motionPaths5.mX)) - f65);
                            motionPaths7.mY = (int) (((f64 * f72) + ((f63 * f68) + motionPaths5.mY)) - f66);
                            motionPaths7.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
                            motionPaths7.mPathMotionArc = keyPosition.mPathMotionArc;
                        } else {
                            float f73 = i11 / 100.0f;
                            motionPaths7.mTime = f73;
                            motionPaths7.mDrawPath = keyPosition.mDrawPath;
                            float f74 = Float.isNaN(keyPosition.mPercentWidth) ? f73 : keyPosition.mPercentWidth;
                            float f75 = Float.isNaN(keyPosition.mPercentHeight) ? f73 : keyPosition.mPercentHeight;
                            float f76 = motionPaths6.mWidth;
                            float f77 = motionPaths5.mWidth;
                            float f78 = f76 - f77;
                            float f79 = motionPaths6.mHeight;
                            float f80 = motionPaths5.mHeight;
                            float f81 = f79 - f80;
                            motionPaths7.mPosition = motionPaths7.mTime;
                            float f82 = (f77 / 2.0f) + motionPaths5.mX;
                            float f83 = (f80 / 2.0f) + motionPaths5.mY;
                            float f84 = (f76 / 2.0f) + motionPaths6.mX;
                            float f85 = (f79 / 2.0f) + motionPaths6.mY;
                            if (f82 > f84) {
                                f82 = f84;
                                f84 = f82;
                            }
                            if (f83 <= f85) {
                                f83 = f85;
                                f85 = f83;
                            }
                            float f86 = f84 - f82;
                            float f87 = f83 - f85;
                            float f88 = (f78 * f74) / 2.0f;
                            motionPaths7.mX = (int) (((f86 * f73) + r8) - f88);
                            float f89 = (f81 * f75) / 2.0f;
                            motionPaths7.mY = (int) (((f87 * f73) + r8) - f89);
                            motionPaths7.mWidth = (int) (f77 + r34);
                            motionPaths7.mHeight = (int) (f80 + r42);
                            float f90 = Float.isNaN(keyPosition.mPercentX) ? f73 : keyPosition.mPercentX;
                            float f91 = Float.isNaN(Float.NaN) ? RecyclerView.DECELERATION_RATE : Float.NaN;
                            float f92 = f90;
                            float f93 = Float.isNaN(keyPosition.mPercentY) ? f73 : keyPosition.mPercentY;
                            float f94 = Float.isNaN(Float.NaN) ? RecyclerView.DECELERATION_RATE : Float.NaN;
                            float f95 = f93;
                            motionPaths7.mMode = 0;
                            motionPaths7.mX = (int) (((f94 * f87) + ((f92 * f86) + motionPaths5.mX)) - f88);
                            motionPaths7.mY = (int) (((f87 * f95) + ((f86 * f91) + motionPaths5.mY)) - f89);
                            motionPaths7.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
                            motionPaths7.mPathMotionArc = keyPosition.mPathMotionArc;
                        }
                        if (Collections.binarySearch(arrayList4, motionPaths7) == 0) {
                            Log.e("MotionController", " KeyPath position \"" + motionPaths7.mPosition + "\" outside of range");
                        }
                        arrayList4.add((-r8) - 1, motionPaths7);
                        i5 = keyPosition.mCurveFit;
                        if (i5 == -1) {
                            this.mCurveFitType = i5;
                        }
                    }
                    if (Collections.binarySearch(arrayList4, motionPaths7) == 0) {
                    }
                    arrayList4.add((-r8) - 1, motionPaths7);
                    i5 = keyPosition.mCurveFit;
                    if (i5 == -1) {
                    }
                } else {
                    str19 = str28;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    str23 = str27;
                    if (key instanceof KeyCycle) {
                        key.getAttributeNames(hashSet10);
                    } else if (key instanceof KeyTimeCycle) {
                        key.getAttributeNames(hashSet8);
                    } else if (key instanceof KeyTrigger) {
                        ArrayList arrayList7 = arrayList6 == null ? new ArrayList() : arrayList6;
                        arrayList7.add((KeyTrigger) key);
                        arrayList6 = arrayList7;
                    } else {
                        key.setInterpolation(hashMap2);
                        key.getAttributeNames(hashSet9);
                    }
                }
                str29 = str30;
                str27 = str23;
                str28 = str19;
                str25 = str21;
                str24 = str20;
                str26 = str22;
            }
            str = str28;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str31 = str24;
        String str32 = str25;
        String str33 = str26;
        String str34 = str29;
        String str35 = str27;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        String str36 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            motionPaths = motionPaths6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            motionPaths2 = motionPaths5;
            obj3 = obj14;
        } else {
            this.mAttributesMap = new HashMap();
            Iterator it4 = hashSet9.iterator();
            while (it4.hasNext()) {
                String str37 = (String) it4.next();
                if (!str37.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str37.hashCode()) {
                        case -1249320806:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            if (str37.equals(obj10)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1249320805:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            if (str37.equals(obj9)) {
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 1;
                                break;
                            }
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497657:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            if (str37.equals(obj8)) {
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 2;
                                break;
                            }
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497656:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            if (str37.equals(str18)) {
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 3;
                                break;
                            }
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497655:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            if (str37.equals("translationZ")) {
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 4;
                                break;
                            }
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1001078227:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            if (str37.equals(obj7)) {
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 5;
                                break;
                            }
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189618:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            if (str37.equals(str17)) {
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 6;
                                break;
                            }
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189617:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str13)) {
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 7;
                                break;
                            }
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -797520672:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("waveVariesBy")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = '\b';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884510:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotX")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = '\t';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884509:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotY")) {
                                c4 = '\n';
                                String str38 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str38;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -40300674:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str14)) {
                                c4 = 11;
                                String str382 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str382;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -4379043:
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str15)) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = '\f';
                                str14 = str32;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 37232917:
                            str16 = str33;
                            if (str37.equals(str16)) {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = '\r';
                                str15 = str31;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 92909918:
                            if (str37.equals("alpha")) {
                                c5 = 14;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case 156108012:
                            if (str37.equals("waveOffset")) {
                                c5 = 15;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                motionPaths3 = motionPaths5;
                                obj9 = obj13;
                                motionPaths4 = motionPaths6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        default:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            motionPaths3 = motionPaths5;
                            obj9 = obj13;
                            motionPaths4 = motionPaths6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(5);
                            break;
                        case 1:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(6);
                            break;
                        case 2:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(9);
                            break;
                        case 3:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(10);
                            break;
                        case 4:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(11);
                            break;
                        case 5:
                            obj11 = obj9;
                            obj12 = obj10;
                            ?? progressSet = new ViewSpline.ProgressSet();
                            progressSet.mNoMethod = false;
                            alphaSet5 = progressSet;
                            break;
                        case 6:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(7);
                            break;
                        case 7:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(8);
                            break;
                        case '\b':
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(0);
                            break;
                        case '\t':
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(2);
                            break;
                        case '\n':
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(3);
                            break;
                        case 11:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(4);
                            break;
                        case '\f':
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.AlphaSet(1);
                            break;
                        case '\r':
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = new ViewSpline.PathRotate();
                            break;
                        case 14:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet4 = new ViewSpline.AlphaSet(0);
                            alphaSet5 = alphaSet4;
                            break;
                        case 15:
                            obj12 = obj10;
                            obj11 = obj9;
                            alphaSet4 = new ViewSpline.AlphaSet(0);
                            alphaSet5 = alphaSet4;
                            break;
                        default:
                            obj11 = obj9;
                            obj12 = obj10;
                            alphaSet5 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str37.split(",")[1];
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Key key2 = (Key) it5.next();
                        HashSet hashSet11 = hashSet8;
                        HashMap hashMap3 = key2.mCustomConstraints;
                        if (hashMap3 != null && (constraintAttribute3 = (ConstraintAttribute) hashMap3.get(str39)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    ?? customSet = new ViewSpline.CustomSet();
                    String str40 = str37.split(",")[1];
                    customSet.mConstraintAttributeList = sparseArray;
                    obj11 = obj13;
                    str13 = str;
                    str14 = str32;
                    str15 = str31;
                    hashSet6 = hashSet10;
                    motionPaths4 = motionPaths6;
                    str17 = str35;
                    arrayList3 = arrayList4;
                    obj7 = obj14;
                    it2 = it4;
                    str18 = str34;
                    hashSet7 = hashSet9;
                    obj8 = obj15;
                    motionPaths3 = motionPaths5;
                    alphaSet5 = customSet;
                    str16 = str33;
                }
                if (alphaSet5 != null) {
                    alphaSet5.mType = str37;
                    this.mAttributesMap.put(str37, alphaSet5);
                }
                str33 = str16;
                str31 = str15;
                str32 = str14;
                motionPaths6 = motionPaths4;
                motionPaths5 = motionPaths3;
                obj13 = obj11;
                hashSet8 = hashSet5;
                obj15 = obj8;
                hashSet9 = hashSet7;
                str34 = str18;
                it4 = it2;
                obj14 = obj7;
                arrayList4 = arrayList3;
                str35 = str17;
                hashSet10 = hashSet6;
                str = str13;
            }
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            motionPaths = motionPaths6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            motionPaths2 = motionPaths5;
            obj3 = obj14;
            if (arrayList5 != null) {
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    Key key3 = (Key) it6.next();
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            motionConstrainedPoint.addValues(this.mAttributesMap, 0);
            motionConstrainedPoint2.addValues(this.mAttributesMap, 100);
            Iterator it7 = this.mAttributesMap.keySet().iterator();
            while (it7.hasNext()) {
                String str41 = (String) it7.next();
                int intValue = (!hashMap2.containsKey(str41) || (num = (Integer) hashMap2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it8 = it7;
                ViewSpline viewSpline = (ViewSpline) this.mAttributesMap.get(str41);
                if (viewSpline != null) {
                    viewSpline.setup(intValue);
                }
                it7 = it8;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap();
            }
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                String str42 = (String) it9.next();
                if (!this.mTimeCycleAttributesMap.containsKey(str42)) {
                    if (str42.startsWith(str36)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it9;
                        String str43 = str42.split(",")[1];
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            String str44 = str36;
                            Key key4 = (Key) it10.next();
                            HashMap hashMap4 = hashMap2;
                            HashMap hashMap5 = key4.mCustomConstraints;
                            if (hashMap5 != null && (constraintAttribute2 = (ConstraintAttribute) hashMap5.get(str43)) != null) {
                                sparseArray2.append(key4.mFramePosition, constraintAttribute2);
                            }
                            hashMap2 = hashMap4;
                            str36 = str44;
                        }
                        hashMap = hashMap2;
                        str11 = str36;
                        ?? customSet2 = new ViewTimeCycle.CustomSet();
                        customSet2.mWaveProperties = new SparseArray();
                        customSet2.mAttributeName = str42.split(",")[1];
                        customSet2.mConstraintAttributeList = sparseArray2;
                        str12 = str6;
                        obj6 = obj2;
                        alphaSet2 = customSet2;
                        obj4 = obj12;
                        obj5 = obj;
                    } else {
                        hashMap = hashMap2;
                        it = it9;
                        str11 = str36;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj12;
                                obj5 = obj;
                                if (str42.equals(obj4)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj12;
                                    c = 1;
                                    break;
                                } else {
                                    obj4 = obj12;
                                    c = 65535;
                                    break;
                                }
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 2;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497656:
                                if (str42.equals(str2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 3;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 4;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 5;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189618:
                                if (str42.equals(str7)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 6;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189617:
                                if (str42.equals(str3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 7;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -40300674:
                                if (str42.equals(str4)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\b';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -4379043:
                                if (str42.equals(str5)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\t';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 37232917:
                                if (str42.equals(str6)) {
                                    c2 = '\n';
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    c2 = 11;
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            default:
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                alphaSet = new ViewTimeCycle.AlphaSet(3);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 1:
                                alphaSet = new ViewTimeCycle.AlphaSet(4);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 2:
                                alphaSet = new ViewTimeCycle.AlphaSet(7);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 3:
                                alphaSet = new ViewTimeCycle.AlphaSet(8);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 4:
                                alphaSet = new ViewTimeCycle.AlphaSet(9);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 5:
                                ?? progressSet2 = new ViewTimeCycle.ProgressSet();
                                progressSet2.mNoMethod = false;
                                alphaSet = progressSet2;
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 6:
                                alphaSet = new ViewTimeCycle.AlphaSet(5);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 7:
                                alphaSet = new ViewTimeCycle.AlphaSet(6);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case '\b':
                                alphaSet = new ViewTimeCycle.AlphaSet(2);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case '\t':
                                alphaSet = new ViewTimeCycle.AlphaSet(1);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case '\n':
                                alphaSet = new ViewTimeCycle.PathRotate();
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            case 11:
                                alphaSet = new ViewTimeCycle.AlphaSet(0);
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet.mLastTime = j;
                                alphaSet3 = alphaSet;
                                break;
                            default:
                                str12 = str6;
                                obj6 = obj2;
                                alphaSet2 = null;
                                break;
                        }
                        if (alphaSet3 != null) {
                            alphaSet3.mType = str42;
                            this.mTimeCycleAttributesMap.put(str42, alphaSet3);
                        }
                        obj12 = obj4;
                        obj = obj5;
                        obj2 = obj6;
                        it9 = it;
                        hashMap2 = hashMap;
                        str36 = str11;
                        str6 = str12;
                    }
                    alphaSet3 = alphaSet2;
                    if (alphaSet3 != null) {
                    }
                    obj12 = obj4;
                    obj = obj5;
                    obj2 = obj6;
                    it9 = it;
                    hashMap2 = hashMap;
                    str36 = str11;
                    str6 = str12;
                }
            }
            HashMap hashMap6 = hashMap2;
            str8 = str36;
            if (arrayList5 != null) {
                Iterator it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    Key key5 = (Key) it11.next();
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str45 : this.mTimeCycleAttributesMap.keySet()) {
                HashMap hashMap7 = hashMap6;
                ((ViewTimeCycle) this.mTimeCycleAttributesMap.get(str45)).setup(hashMap7.containsKey(str45) ? ((Integer) hashMap7.get(str45)).intValue() : 0);
                hashMap6 = hashMap7;
            }
        }
        int size = arrayList2.size();
        int i12 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i12];
        motionPathsArr[0] = motionPaths2;
        motionPathsArr[size + 1] = motionPaths;
        if (arrayList2.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator it12 = arrayList2.iterator();
        int i13 = 1;
        while (it12.hasNext()) {
            motionPathsArr[i13] = (MotionPaths) it12.next();
            i13++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : motionPaths.mAttributes.keySet()) {
            MotionPaths motionPaths8 = motionPaths2;
            if (motionPaths8.mAttributes.containsKey(str46)) {
                str10 = str8;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str10 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str10 = str8;
            }
            motionPaths2 = motionPaths8;
            str8 = str10;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpolatorCount = new int[strArr.length];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.mAttributeNames;
            if (i14 < strArr2.length) {
                String str47 = strArr2[i14];
                this.mAttributeInterpolatorCount[i14] = 0;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        break;
                    }
                    if (!motionPathsArr[i15].mAttributes.containsKey(str47) || (constraintAttribute = (ConstraintAttribute) motionPathsArr[i15].mAttributes.get(str47)) == null) {
                        i15++;
                    } else {
                        int[] iArr = this.mAttributeInterpolatorCount;
                        iArr[i14] = constraintAttribute.numberOfInterpolatedValues() + iArr[i14];
                    }
                }
                i14++;
            } else {
                boolean z = motionPathsArr[0].mPathMotionArc != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i16 = 1; i16 < i12; i16++) {
                    MotionPaths motionPaths9 = motionPathsArr[i16];
                    MotionPaths motionPaths10 = motionPathsArr[i16 - 1];
                    boolean diff2 = MotionPaths.diff(motionPaths9.mX, motionPaths10.mX);
                    boolean diff3 = MotionPaths.diff(motionPaths9.mY, motionPaths10.mY);
                    zArr[0] = zArr[0] | MotionPaths.diff(motionPaths9.mPosition, motionPaths10.mPosition);
                    boolean z2 = diff2 | diff3 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | MotionPaths.diff(motionPaths9.mWidth, motionPaths10.mWidth);
                    zArr[4] = MotionPaths.diff(motionPaths9.mHeight, motionPaths10.mHeight) | zArr[4];
                }
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        i17++;
                    }
                }
                this.mInterpolateVariables = new int[i17];
                int max = Math.max(2, i17);
                this.mInterpolateData = new double[max];
                this.mInterpolateVelocity = new double[max];
                int i19 = 0;
                for (int i20 = 1; i20 < length; i20++) {
                    if (zArr[i20]) {
                        this.mInterpolateVariables[i19] = i20;
                        i19++;
                    }
                }
                int[] iArr2 = {i12, this.mInterpolateVariables.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i12];
                int i21 = 0;
                while (i21 < i12) {
                    MotionPaths motionPaths11 = motionPathsArr[i21];
                    double[] dArr3 = dArr[i21];
                    int[] iArr3 = this.mInterpolateVariables;
                    MotionPaths[] motionPathsArr2 = motionPathsArr;
                    int i22 = 6;
                    float[] fArr = {motionPaths11.mPosition, motionPaths11.mX, motionPaths11.mY, motionPaths11.mWidth, motionPaths11.mHeight, motionPaths11.mPathRotate};
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr3.length) {
                        if (iArr3[i23] < i22) {
                            dArr3[i24] = fArr[r11];
                            i24++;
                        }
                        i23++;
                        i22 = 6;
                    }
                    dArr2[i21] = motionPathsArr2[i21].mTime;
                    i21++;
                    motionPathsArr = motionPathsArr2;
                }
                MotionPaths[] motionPathsArr3 = motionPathsArr;
                int i25 = 0;
                while (true) {
                    int[] iArr4 = this.mInterpolateVariables;
                    if (i25 < iArr4.length) {
                        if (iArr4[i25] < 6) {
                            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), MotionPaths.sNames[this.mInterpolateVariables[i25]], " [");
                            for (int i26 = 0; i26 < i12; i26++) {
                                StringBuilder m2 = Boxes$$ExternalSyntheticOutline1.m(m);
                                m2.append(dArr[i26][i25]);
                                m = m2.toString();
                            }
                        }
                        i25++;
                    } else {
                        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
                        int i27 = 0;
                        while (true) {
                            String[] strArr3 = this.mAttributeNames;
                            if (i27 >= strArr3.length) {
                                this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
                                if (motionPathsArr3[0].mPathMotionArc != -1) {
                                    int[] iArr5 = new int[i12];
                                    double[] dArr4 = new double[i12];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                    for (int i28 = 0; i28 < i12; i28++) {
                                        iArr5[i28] = motionPathsArr3[i28].mPathMotionArc;
                                        dArr4[i28] = r5.mTime;
                                        double[] dArr6 = dArr5[i28];
                                        dArr6[0] = r5.mX;
                                        dArr6[1] = r5.mY;
                                    }
                                    this.mArcSpline = new ArcCurveFit(iArr5, dArr4, dArr5);
                                }
                                this.mCycleMap = new HashMap();
                                if (arrayList5 != null) {
                                    Iterator it13 = hashSet3.iterator();
                                    float f96 = Float.NaN;
                                    while (it13.hasNext()) {
                                        String str48 = (String) it13.next();
                                        ViewOscillator makeSpline = ViewOscillator.makeSpline(str48);
                                        if (makeSpline != null) {
                                            if (makeSpline.mVariesBy == 1 && Float.isNaN(f96)) {
                                                f96 = getPreCycleDistance();
                                            }
                                            makeSpline.mType = str48;
                                            this.mCycleMap.put(str48, makeSpline);
                                        }
                                    }
                                    Iterator it14 = arrayList5.iterator();
                                    while (it14.hasNext()) {
                                        Key key6 = (Key) it14.next();
                                        if (key6 instanceof KeyCycle) {
                                            ((KeyCycle) key6).addCycleValues(this.mCycleMap);
                                        }
                                    }
                                    Iterator it15 = this.mCycleMap.values().iterator();
                                    while (it15.hasNext()) {
                                        ((ViewOscillator) it15.next()).setup();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str49 = strArr3[i27];
                            int i29 = 0;
                            int i30 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i29 < i12) {
                                if (motionPathsArr3[i29].mAttributes.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i12];
                                        ConstraintAttribute constraintAttribute4 = (ConstraintAttribute) motionPathsArr3[i29].mAttributes.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, constraintAttribute4 == null ? 0 : constraintAttribute4.numberOfInterpolatedValues());
                                    }
                                    MotionPaths motionPaths12 = motionPathsArr3[i29];
                                    dArr7[i30] = motionPaths12.mTime;
                                    double[] dArr9 = dArr8[i30];
                                    ConstraintAttribute constraintAttribute5 = (ConstraintAttribute) motionPaths12.mAttributes.get(str49);
                                    if (constraintAttribute5 != null) {
                                        if (constraintAttribute5.numberOfInterpolatedValues() == 1) {
                                            dArr9[0] = constraintAttribute5.getValueToInterpolate();
                                        } else {
                                            int numberOfInterpolatedValues = constraintAttribute5.numberOfInterpolatedValues();
                                            constraintAttribute5.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
                                            int i31 = 0;
                                            int i32 = 0;
                                            while (i31 < numberOfInterpolatedValues) {
                                                dArr9[i32] = r14[i31];
                                                i31++;
                                                str49 = str49;
                                                i32++;
                                                i27 = i27;
                                                i29 = i29;
                                            }
                                        }
                                    }
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                    i30++;
                                } else {
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                }
                                i29 = i4 + 1;
                                str49 = str9;
                                i27 = i3;
                            }
                            int i33 = i27;
                            double[] copyOf = Arrays.copyOf(dArr7, i30);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i30);
                            int i34 = i33 + 1;
                            this.mSpline[i34] = CurveFit.get(this.mCurveFitType, copyOf, dArr10);
                            i27 = i34;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.mStartMotionPath;
        sb.append(motionPaths.mX);
        sb.append(" y: ");
        sb.append(motionPaths.mY);
        sb.append(" end: x: ");
        MotionPaths motionPaths2 = this.mEndMotionPath;
        sb.append(motionPaths2.mX);
        sb.append(" y: ");
        sb.append(motionPaths2.mY);
        return sb.toString();
    }
}
