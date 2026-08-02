package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import sqip.internal.CardImage;

/* loaded from: classes3.dex */
public final class MotionConstrainedPoint implements Comparable {
    public int mVisibility;
    public float rotationY = RecyclerView.DECELERATION_RATE;
    public int mVisibilityMode = 0;
    public final LinkedHashMap mAttributes = new LinkedHashMap();
    public float mAlpha = 1.0f;
    public float mElevation = RecyclerView.DECELERATION_RATE;
    public float mRotation = RecyclerView.DECELERATION_RATE;
    public float mRotationX = RecyclerView.DECELERATION_RATE;
    public float mScaleX = 1.0f;
    public float mScaleY = 1.0f;
    public float mPivotX = Float.NaN;
    public float mPivotY = Float.NaN;
    public float mTranslationX = RecyclerView.DECELERATION_RATE;
    public float mTranslationY = RecyclerView.DECELERATION_RATE;
    public float mTranslationZ = RecyclerView.DECELERATION_RATE;
    public float mPathRotate = Float.NaN;
    public float mProgress = Float.NaN;

    public static boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void addValues(HashMap hashMap, int i) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = (ViewSpline) hashMap.get(str);
            if (viewSpline != null) {
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals(CardImage.ELEVATION)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                float f = RecyclerView.DECELERATION_RATE;
                switch (c) {
                    case 0:
                        if (!Float.isNaN(this.mRotationX)) {
                            f = this.mRotationX;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 1:
                        if (!Float.isNaN(this.rotationY)) {
                            f = this.rotationY;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 2:
                        if (!Float.isNaN(this.mTranslationX)) {
                            f = this.mTranslationX;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 3:
                        if (!Float.isNaN(this.mTranslationY)) {
                            f = this.mTranslationY;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 4:
                        if (!Float.isNaN(this.mTranslationZ)) {
                            f = this.mTranslationZ;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 5:
                        if (!Float.isNaN(this.mProgress)) {
                            f = this.mProgress;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 6:
                        viewSpline.setPoint(Float.isNaN(this.mScaleX) ? 1.0f : this.mScaleX, i);
                        break;
                    case 7:
                        viewSpline.setPoint(Float.isNaN(this.mScaleY) ? 1.0f : this.mScaleY, i);
                        break;
                    case '\b':
                        if (!Float.isNaN(this.mPivotX)) {
                            f = this.mPivotX;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case '\t':
                        if (!Float.isNaN(this.mPivotY)) {
                            f = this.mPivotY;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case '\n':
                        if (!Float.isNaN(this.mRotation)) {
                            f = this.mRotation;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case 11:
                        if (!Float.isNaN(this.mElevation)) {
                            f = this.mElevation;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case '\f':
                        if (!Float.isNaN(this.mPathRotate)) {
                            f = this.mPathRotate;
                        }
                        viewSpline.setPoint(f, i);
                        break;
                    case '\r':
                        viewSpline.setPoint(Float.isNaN(this.mAlpha) ? 1.0f : this.mAlpha, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.mAttributes;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) linkedHashMap.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).mConstraintAttributeList.append(i, constraintAttribute);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        }
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((MotionConstrainedPoint) obj).getClass();
        return Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    public final void setState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        rect.width();
        rect.height();
        ConstraintSet.Constraint constraint = constraintSet.get(i2);
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        ConstraintSet.Motion motion = constraint.motion;
        int i3 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i3;
        int i4 = propertySet.visibility;
        this.mVisibility = i4;
        this.mAlpha = (i4 == 0 || i3 != 0) ? propertySet.alpha : RecyclerView.DECELERATION_RATE;
        ConstraintSet.Transform transform = constraint.transform;
        boolean z = transform.applyElevation;
        this.mElevation = transform.elevation;
        this.mRotation = transform.rotation;
        this.mRotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.mScaleX = transform.scaleX;
        this.mScaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.mTranslationX = transform.translationX;
        this.mTranslationY = transform.translationY;
        this.mTranslationZ = transform.translationZ;
        Easing.getInterpolator(motion.mTransitionEasing);
        this.mPathRotate = motion.mPathRotate;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraint.mCustomConstraints.get(str);
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAttribute.mType);
            if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.mRotation + 90.0f;
            this.mRotation = f;
            if (f > 180.0f) {
                this.mRotation = f - 360.0f;
                return;
            }
            return;
        }
        this.mRotation -= 90.0f;
    }
}
