package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import sqip.internal.CardImage;

/* loaded from: classes3.dex */
public final class KeyAttributes extends Key {
    public int mCurveFit = -1;
    public float mAlpha = Float.NaN;
    public float mElevation = Float.NaN;
    public float mRotation = Float.NaN;
    public float mRotationX = Float.NaN;
    public float mRotationY = Float.NaN;
    public float mPivotX = Float.NaN;
    public float mPivotY = Float.NaN;
    public float mTransitionPathRotate = Float.NaN;
    public float mScaleX = Float.NaN;
    public float mScaleY = Float.NaN;
    public float mTranslationX = Float.NaN;
    public float mTranslationY = Float.NaN;
    public float mTranslationZ = Float.NaN;
    public float mProgress = Float.NaN;

    public abstract class Loader {
        public static final SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public KeyAttributes() {
        this.mCustomConstraints = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a1, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // androidx.constraintlayout.motion.widget.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addValues(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = (ViewSpline) hashMap.get(str);
            if (viewSpline != null) {
                char c = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals(CardImage.ELEVATION)) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = '\r';
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
                            if (Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mRotationX, this.mFramePosition);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mRotationY, this.mFramePosition);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mTranslationX, this.mFramePosition);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mTranslationY, this.mFramePosition);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mTranslationZ, this.mFramePosition);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mProgress, this.mFramePosition);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mScaleX, this.mFramePosition);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mScaleY, this.mFramePosition);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.mRotationX)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mPivotX, this.mFramePosition);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mPivotY, this.mFramePosition);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mRotation, this.mFramePosition);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mElevation, this.mFramePosition);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mTransitionPathRotate, this.mFramePosition);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                viewSpline.setPoint(this.mAlpha, this.mFramePosition);
                                break;
                            }
                    }
                } else {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((ViewSpline.CustomSet) viewSpline).mConstraintAttributeList.append(this.mFramePosition, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final Key m1082clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        super.copy(this);
        keyAttributes.mCurveFit = this.mCurveFit;
        keyAttributes.mAlpha = this.mAlpha;
        keyAttributes.mElevation = this.mElevation;
        keyAttributes.mRotation = this.mRotation;
        keyAttributes.mRotationX = this.mRotationX;
        keyAttributes.mRotationY = this.mRotationY;
        keyAttributes.mPivotX = this.mPivotX;
        keyAttributes.mPivotY = this.mPivotY;
        keyAttributes.mTransitionPathRotate = this.mTransitionPathRotate;
        keyAttributes.mScaleX = this.mScaleX;
        keyAttributes.mScaleY = this.mScaleY;
        keyAttributes.mTranslationX = this.mTranslationX;
        keyAttributes.mTranslationY = this.mTranslationY;
        keyAttributes.mTranslationZ = this.mTranslationZ;
        keyAttributes.mProgress = this.mProgress;
        return keyAttributes;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void getAttributeNames(HashSet hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add(CardImage.ELEVATION);
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void load(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute);
        SparseIntArray sparseIntArray = Loader.sAttrMap;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.sAttrMap;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.mAlpha = obtainStyledAttributes.getFloat(index, this.mAlpha);
                    break;
                case 2:
                    this.mElevation = obtainStyledAttributes.getDimension(index, this.mElevation);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.mRotation = obtainStyledAttributes.getFloat(index, this.mRotation);
                    break;
                case 5:
                    this.mRotationX = obtainStyledAttributes.getFloat(index, this.mRotationX);
                    break;
                case 6:
                    this.mRotationY = obtainStyledAttributes.getFloat(index, this.mRotationY);
                    break;
                case 7:
                    this.mScaleX = obtainStyledAttributes.getFloat(index, this.mScaleX);
                    break;
                case 8:
                    this.mTransitionPathRotate = obtainStyledAttributes.getFloat(index, this.mTransitionPathRotate);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    int i2 = MotionLayout.$r8$clinit;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.mTargetString = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                        break;
                    }
                case 12:
                    this.mFramePosition = obtainStyledAttributes.getInt(index, this.mFramePosition);
                    break;
                case 13:
                    this.mCurveFit = obtainStyledAttributes.getInteger(index, this.mCurveFit);
                    break;
                case 14:
                    this.mScaleY = obtainStyledAttributes.getFloat(index, this.mScaleY);
                    break;
                case 15:
                    this.mTranslationX = obtainStyledAttributes.getDimension(index, this.mTranslationX);
                    break;
                case 16:
                    this.mTranslationY = obtainStyledAttributes.getDimension(index, this.mTranslationY);
                    break;
                case 17:
                    this.mTranslationZ = obtainStyledAttributes.getDimension(index, this.mTranslationZ);
                    break;
                case 18:
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                    break;
                case 19:
                    this.mPivotX = obtainStyledAttributes.getDimension(index, this.mPivotX);
                    break;
                case 20:
                    this.mPivotY = obtainStyledAttributes.getDimension(index, this.mPivotY);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void setInterpolation(HashMap hashMap) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            hashMap.put(CardImage.ELEVATION, Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            hashMap.put("rotation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotX)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashMap.put("translationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashMap.put("translationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashMap.put("translationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashMap.put("scaleX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashMap.put("scaleY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mProgress)) {
            hashMap.put("progress", Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(Recorder$$ExternalSyntheticOutline2.m("CUSTOM,", (String) it.next()), Integer.valueOf(this.mCurveFit));
            }
        }
    }
}
