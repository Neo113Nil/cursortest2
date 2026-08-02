package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class KeyTrigger extends Key {
    public float mFireLastPos;
    public float mTriggerSlack = 0.1f;
    public int mViewTransitionOnNegativeCross = -1;
    public int mViewTransitionOnPositiveCross = -1;
    public int mViewTransitionOnCross = -1;
    public RectF mCollisionRect = new RectF();
    public RectF mTargetRect = new RectF();
    public HashMap mMethodHashMap = new HashMap();
    public String mCross = null;
    public int mTriggerReceiver = -1;
    public String mNegativeCross = null;
    public String mPositiveCross = null;
    public int mTriggerID = -1;
    public int mTriggerCollisionId = -1;
    public View mTriggerCollisionView = null;
    public boolean mFireCrossReset = true;
    public boolean mFireNegativeReset = true;
    public boolean mFirePositiveReset = true;
    public float mFireThreshold = Float.NaN;
    public boolean mPostLayout = false;

    public abstract class Loader {
        public static final SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public KeyTrigger() {
        this.mCustomConstraints = new HashMap();
    }

    public static void setUpRect(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void addValues(HashMap hashMap) {
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final Key m1086clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        super.copy(this);
        keyTrigger.mCross = this.mCross;
        keyTrigger.mTriggerReceiver = this.mTriggerReceiver;
        keyTrigger.mNegativeCross = this.mNegativeCross;
        keyTrigger.mPositiveCross = this.mPositiveCross;
        keyTrigger.mTriggerID = this.mTriggerID;
        keyTrigger.mTriggerCollisionId = this.mTriggerCollisionId;
        keyTrigger.mTriggerCollisionView = this.mTriggerCollisionView;
        keyTrigger.mTriggerSlack = this.mTriggerSlack;
        keyTrigger.mFireCrossReset = this.mFireCrossReset;
        keyTrigger.mFireNegativeReset = this.mFireNegativeReset;
        keyTrigger.mFirePositiveReset = this.mFirePositiveReset;
        keyTrigger.mFireThreshold = this.mFireThreshold;
        keyTrigger.mFireLastPos = this.mFireLastPos;
        keyTrigger.mPostLayout = this.mPostLayout;
        keyTrigger.mCollisionRect = this.mCollisionRect;
        keyTrigger.mTargetRect = this.mTargetRect;
        keyTrigger.mMethodHashMap = this.mMethodHashMap;
        return keyTrigger;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void conditionallyFire(View view, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.mTriggerCollisionId != -1) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((ViewGroup) view.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, view, this.mPostLayout);
            boolean intersect = this.mCollisionRect.intersect(this.mTargetRect);
            boolean z9 = this.mFireCrossReset;
            if (intersect) {
                if (z9) {
                    this.mFireCrossReset = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.mFirePositiveReset) {
                    this.mFirePositiveReset = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.mFireNegativeReset = true;
            } else {
                if (z9) {
                    z = false;
                } else {
                    this.mFireCrossReset = true;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    this.mFireNegativeReset = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.mFirePositiveReset = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.mFireCrossReset;
            float f2 = this.mFireThreshold;
            if (z11) {
                if ((this.mFireLastPos - f2) * (f - f2) < RecyclerView.DECELERATION_RATE) {
                    this.mFireCrossReset = false;
                    z = true;
                    z2 = this.mFireNegativeReset;
                    float f3 = this.mFireThreshold;
                    if (!z2) {
                        float f4 = f - f3;
                        if ((this.mFireLastPos - f3) * f4 < RecyclerView.DECELERATION_RATE && f4 < RecyclerView.DECELERATION_RATE) {
                            this.mFireNegativeReset = false;
                            z3 = true;
                            z4 = this.mFirePositiveReset;
                            float f5 = this.mFireThreshold;
                            if (z4) {
                                float f6 = f - f5;
                                if ((this.mFireLastPos - f5) * f6 < RecyclerView.DECELERATION_RATE && f6 > RecyclerView.DECELERATION_RATE) {
                                    this.mFirePositiveReset = false;
                                    z8 = z3;
                                }
                            } else if (Math.abs(f - f5) > this.mTriggerSlack) {
                                this.mFirePositiveReset = true;
                            }
                            z7 = false;
                            z8 = z3;
                        }
                    } else if (Math.abs(f - f3) > this.mTriggerSlack) {
                        this.mFireNegativeReset = true;
                    }
                    z3 = false;
                    z4 = this.mFirePositiveReset;
                    float f52 = this.mFireThreshold;
                    if (z4) {
                    }
                    z7 = false;
                    z8 = z3;
                }
            } else if (Math.abs(f - f2) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            z = false;
            z2 = this.mFireNegativeReset;
            float f32 = this.mFireThreshold;
            if (!z2) {
            }
            z3 = false;
            z4 = this.mFirePositiveReset;
            float f522 = this.mFireThreshold;
            if (z4) {
            }
            z7 = false;
            z8 = z3;
        }
        this.mFireLastPos = f;
        if (z8 || z || z7) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.TransitionListener transitionListener = motionLayout.mTransitionListener;
            CopyOnWriteArrayList copyOnWriteArrayList = motionLayout.mTransitionListeners;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((MotionLayout.TransitionListener) it.next()).getClass();
                }
            }
        }
        View findViewById = this.mTriggerReceiver == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.mTriggerReceiver);
        if (z8) {
            String str = this.mNegativeCross;
            if (str != null) {
                fire(findViewById, str);
            }
            if (this.mViewTransitionOnNegativeCross != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnNegativeCross, findViewById);
            }
        }
        if (z7) {
            String str2 = this.mPositiveCross;
            if (str2 != null) {
                fire(findViewById, str2);
            }
            if (this.mViewTransitionOnPositiveCross != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnPositiveCross, findViewById);
            }
        }
        if (z) {
            String str3 = this.mCross;
            if (str3 != null) {
                fire(findViewById, str3);
            }
            if (this.mViewTransitionOnCross != -1) {
                ((MotionLayout) view.getParent()).viewTransition(this.mViewTransitionOnCross, findViewById);
            }
        }
    }

    public final void fire(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.mMethodHashMap.containsKey(str)) {
                method = (Method) this.mMethodHashMap.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.mMethodHashMap.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.mMethodHashMap.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    String str3 = constraintAttribute.mName;
                    String m = !constraintAttribute.mMethod ? Recorder$$ExternalSyntheticOutline2.m("set", str3) : str3;
                    try {
                        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(constraintAttribute.mType);
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (ordinal) {
                            case 0:
                            case 7:
                                cls.getMethod(m, cls2).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                                break;
                            case 1:
                                cls.getMethod(m, cls3).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                                break;
                            case 2:
                                cls.getMethod(m, cls2).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(m, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.mColorValue);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(m, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                                break;
                            case 5:
                                cls.getMethod(m, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                                break;
                            case 6:
                                cls.getMethod(m, cls3).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m(" Custom Attribute \"", str3, "\" not found on ");
                        m3m.append(cls.getName());
                        Log.e("TransitionLayout", m3m.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + m, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m(" Custom Attribute \"", str3, "\" not found on ");
                        m3m2.append(cls.getName());
                        Log.e("TransitionLayout", m3m2.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void getAttributeNames(HashSet hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void load(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTrigger);
        SparseIntArray sparseIntArray = Loader.sAttrMap;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = Loader.sAttrMap;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.mNegativeCross = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.mPositiveCross = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.mCross = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.mTriggerSlack = obtainStyledAttributes.getFloat(index, this.mTriggerSlack);
                    break;
                case 6:
                    this.mTriggerID = obtainStyledAttributes.getResourceId(index, this.mTriggerID);
                    break;
                case 7:
                    int i2 = MotionLayout.$r8$clinit;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.mTargetString = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.mFramePosition);
                    this.mFramePosition = integer;
                    this.mFireThreshold = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.mTriggerCollisionId = obtainStyledAttributes.getResourceId(index, this.mTriggerCollisionId);
                    break;
                case 10:
                    this.mPostLayout = obtainStyledAttributes.getBoolean(index, this.mPostLayout);
                    break;
                case 11:
                    this.mTriggerReceiver = obtainStyledAttributes.getResourceId(index, this.mTriggerReceiver);
                    break;
                case 12:
                    this.mViewTransitionOnCross = obtainStyledAttributes.getResourceId(index, this.mViewTransitionOnCross);
                    break;
                case 13:
                    this.mViewTransitionOnNegativeCross = obtainStyledAttributes.getResourceId(index, this.mViewTransitionOnNegativeCross);
                    break;
                case 14:
                    this.mViewTransitionOnPositiveCross = obtainStyledAttributes.getResourceId(index, this.mViewTransitionOnPositiveCross);
                    break;
            }
        }
    }
}
