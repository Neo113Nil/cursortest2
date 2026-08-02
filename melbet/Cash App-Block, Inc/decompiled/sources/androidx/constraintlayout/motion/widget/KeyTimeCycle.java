package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import sqip.internal.CardImage;

/* loaded from: classes3.dex */
public final class KeyTimeCycle extends Key {
    public int mCurveFit = -1;
    public float mAlpha = Float.NaN;
    public float mElevation = Float.NaN;
    public float mRotation = Float.NaN;
    public float mRotationX = Float.NaN;
    public float mRotationY = Float.NaN;
    public float mTransitionPathRotate = Float.NaN;
    public float mScaleX = Float.NaN;
    public float mScaleY = Float.NaN;
    public float mTranslationX = Float.NaN;
    public float mTranslationY = Float.NaN;
    public float mTranslationZ = Float.NaN;
    public float mProgress = Float.NaN;
    public int mWaveShape = 0;
    public float mWavePeriod = Float.NaN;
    public float mWaveOffset = RecyclerView.DECELERATION_RATE;

    public abstract class Loader {
        public static final SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public KeyTimeCycle() {
        this.mCustomConstraints = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00eb, code lost:
    
        if (r1.equals("rotationY") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addTimeValues(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            ViewTimeCycle viewTimeCycle = (ViewTimeCycle) hashMap.get(str);
            if (viewTimeCycle != null) {
                char c = 1;
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
                            if (str.equals("scaleY")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals(CardImage.ELEVATION)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = 11;
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
                                viewTimeCycle.setPoint(this.mRotationX, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.mRotationY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mRotationY, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.mTranslationX)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mTranslationX, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.mTranslationY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mTranslationY, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.mTranslationZ)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mTranslationZ, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.mProgress)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mProgress, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.mScaleX)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mScaleX, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.mScaleY)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mScaleY, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.mRotation)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mRotation, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.mElevation)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mElevation, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.mTransitionPathRotate)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mTransitionPathRotate, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.mAlpha)) {
                                break;
                            } else {
                                viewTimeCycle.setPoint(this.mAlpha, this.mWavePeriod, this.mWaveOffset, this.mFramePosition, this.mWaveShape);
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ViewTimeCycle.CustomSet customSet = (ViewTimeCycle.CustomSet) viewTimeCycle;
                        int i = this.mFramePosition;
                        float f = this.mWavePeriod;
                        int i2 = this.mWaveShape;
                        float f2 = this.mWaveOffset;
                        customSet.mConstraintAttributeList.append(i, constraintAttribute);
                        customSet.mWaveProperties.append(i, new float[]{f, f2});
                        customSet.mWaveShape = Math.max(customSet.mWaveShape, i2);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void addValues(HashMap hashMap) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final Key m1085clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        super.copy(this);
        keyTimeCycle.mCurveFit = this.mCurveFit;
        keyTimeCycle.mWaveShape = this.mWaveShape;
        keyTimeCycle.mWavePeriod = this.mWavePeriod;
        keyTimeCycle.mWaveOffset = this.mWaveOffset;
        keyTimeCycle.mProgress = this.mProgress;
        keyTimeCycle.mAlpha = this.mAlpha;
        keyTimeCycle.mElevation = this.mElevation;
        keyTimeCycle.mRotation = this.mRotation;
        keyTimeCycle.mTransitionPathRotate = this.mTransitionPathRotate;
        keyTimeCycle.mRotationX = this.mRotationX;
        keyTimeCycle.mRotationY = this.mRotationY;
        keyTimeCycle.mScaleX = this.mScaleX;
        keyTimeCycle.mScaleY = this.mScaleY;
        keyTimeCycle.mTranslationX = this.mTranslationX;
        keyTimeCycle.mTranslationY = this.mTranslationY;
        keyTimeCycle.mTranslationZ = this.mTranslationZ;
        return keyTimeCycle;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTimeCycle);
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
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.mWaveShape = 7;
                        break;
                    } else {
                        this.mWaveShape = obtainStyledAttributes.getInt(index, this.mWaveShape);
                        break;
                    }
                case 20:
                    this.mWavePeriod = obtainStyledAttributes.getFloat(index, this.mWavePeriod);
                    break;
                case 21:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.mWaveOffset;
                    if (i3 == 5) {
                        this.mWaveOffset = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.mWaveOffset = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
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
        if (!Float.isNaN(this.mScaleX)) {
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
