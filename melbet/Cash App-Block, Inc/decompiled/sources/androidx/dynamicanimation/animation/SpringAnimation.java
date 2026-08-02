package androidx.dynamicanimation.animation;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.camera.video.Recorder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Renderer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SpringAnimation {
    public static final DynamicAnimation$1 ALPHA;
    public static final DynamicAnimation$1 ROTATION;
    public static final DynamicAnimation$1 ROTATION_X;
    public static final DynamicAnimation$1 ROTATION_Y;
    public static final DynamicAnimation$1 SCALE_X;
    public static final DynamicAnimation$1 SCALE_Y;
    public static final DynamicAnimation$1 TRANSLATION_X;
    public static final DynamicAnimation$1 TRANSLATION_Y;
    public final ArrayList mEndListeners;
    public boolean mEndRequested;
    public long mLastFrameTime;
    public float mMaxValue;
    public float mMinValue;
    public float mMinVisibleChange;
    public float mPendingPosition;
    public final PlatformKt mProperty;
    public boolean mRunning;
    public SpringForce mSpring;
    public boolean mStartValueIsSet;
    public final Object mTarget;
    public final ArrayList mUpdateListeners;
    public float mValue;
    public float mVelocity;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.dynamicanimation.animation.DynamicAnimation$1] */
    static {
        final int i = 0;
        TRANSLATION_X = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i2 = 2;
        TRANSLATION_Y = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i2) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i2) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i3 = 3;
        SCALE_X = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i3) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i3) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i4 = 4;
        SCALE_Y = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i4) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i4) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i5 = 5;
        ROTATION = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i5) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i5) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i6 = 6;
        ROTATION_X = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i6) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i6) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i7 = 7;
        ROTATION_Y = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i7) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i7) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
        final int i8 = 1;
        ALPHA = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$1
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                switch (i8) {
                    case 0:
                        return ((View) obj).getTranslationX();
                    case 1:
                        return ((View) obj).getAlpha();
                    case 2:
                        return ((View) obj).getTranslationY();
                    case 3:
                        return ((View) obj).getScaleX();
                    case 4:
                        return ((View) obj).getScaleY();
                    case 5:
                        return ((View) obj).getRotation();
                    case 6:
                        return ((View) obj).getRotationX();
                    case 7:
                        return ((View) obj).getRotationY();
                    default:
                        return ((View) obj).getX();
                }
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                switch (i8) {
                    case 0:
                        ((View) obj).setTranslationX(f);
                        break;
                    case 1:
                        ((View) obj).setAlpha(f);
                        break;
                    case 2:
                        ((View) obj).setTranslationY(f);
                        break;
                    case 3:
                        ((View) obj).setScaleX(f);
                        break;
                    case 4:
                        ((View) obj).setScaleY(f);
                        break;
                    case 5:
                        ((View) obj).setRotation(f);
                        break;
                    case 6:
                        ((View) obj).setRotationX(f);
                        break;
                    case 7:
                        ((View) obj).setRotationY(f);
                        break;
                    default:
                        ((View) obj).setX(f);
                        break;
                }
            }
        };
    }

    public SpringAnimation(Object obj, PlatformKt platformKt) {
        this.mVelocity = RecyclerView.DECELERATION_RATE;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -3.4028235E38f;
        this.mLastFrameTime = 0L;
        this.mEndListeners = new ArrayList();
        this.mUpdateListeners = new ArrayList();
        this.mTarget = obj;
        this.mProperty = platformKt;
        if (platformKt == ROTATION || platformKt == ROTATION_X || platformKt == ROTATION_Y) {
            this.mMinVisibleChange = 0.1f;
        } else if (platformKt == ALPHA) {
            this.mMinVisibleChange = 0.00390625f;
        } else if (platformKt == SCALE_X || platformKt == SCALE_Y) {
            this.mMinVisibleChange = 0.002f;
        } else {
            this.mMinVisibleChange = 1.0f;
        }
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public static AnimationHandler getAnimationHandler() {
        ThreadLocal threadLocal = AnimationHandler.sAnimatorHandler;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler(new Recorder.AnonymousClass1(26)));
        }
        return (AnimationHandler) threadLocal.get();
    }

    public final void addEndListener(DynamicAnimation$OnAnimationEndListener dynamicAnimation$OnAnimationEndListener) {
        ArrayList arrayList = this.mEndListeners;
        if (arrayList.contains(dynamicAnimation$OnAnimationEndListener)) {
            return;
        }
        arrayList.add(dynamicAnimation$OnAnimationEndListener);
    }

    public final void animateToFinalPosition(float f) {
        if (this.mRunning) {
            this.mPendingPosition = f;
            return;
        }
        if (this.mSpring == null) {
            this.mSpring = new SpringForce(f);
        }
        this.mSpring.mFinalPosition = f;
        start();
    }

    public final void cancel() {
        if (!getAnimationHandler().isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.mRunning) {
            endAnimationInternal(true);
        }
        float f = this.mPendingPosition;
        if (f != Float.MAX_VALUE) {
            SpringForce springForce = this.mSpring;
            if (springForce == null) {
                this.mSpring = new SpringForce(f);
            } else {
                springForce.mFinalPosition = f;
            }
            this.mPendingPosition = Float.MAX_VALUE;
        }
    }

    public final void endAnimationInternal(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.mRunning = false;
        AnimationHandler animationHandler = getAnimationHandler();
        animationHandler.mDelayedCallbackStartTime.remove(this);
        ArrayList arrayList2 = animationHandler.mAnimationCallbacks;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            animationHandler.mListDirty = true;
        }
        this.mLastFrameTime = 0L;
        this.mStartValueIsSet = false;
        while (true) {
            arrayList = this.mEndListeners;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((DynamicAnimation$OnAnimationEndListener) arrayList.get(i)).onAnimationEnd(this, z, this.mValue, this.mVelocity);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void setMinimumVisibleChange(float f) {
        if (f > RecyclerView.DECELERATION_RATE) {
            this.mMinVisibleChange = f;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Minimum visible change must be positive.");
        }
    }

    public final void setPropertyValue(float f) {
        ArrayList arrayList;
        this.mProperty.setValue(this.mTarget, f);
        int i = 0;
        while (true) {
            arrayList = this.mUpdateListeners;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                Transition.SeekController seekController = (Transition.SeekController) arrayList.get(i);
                float f2 = this.mValue;
                TransitionSet transitionSet = seekController.this$0;
                long max = Math.max(-1L, Math.min(transitionSet.mTotalDuration + 1, Math.round(f2)));
                transitionSet.setCurrentPlayTimeMillis(max, seekController.mCurrentPlayTime);
                seekController.mCurrentPlayTime = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void setStartValue(float f) {
        this.mValue = f;
        this.mStartValueIsSet = true;
    }

    public final void skipToEnd() {
        if (this.mSpring.mDampingRatio <= 0.0d) {
            a$$ExternalSyntheticBUOutline0.m("Spring animations can only come to an end when there is damping");
        } else {
            if (!getAnimationHandler().isCurrentThread()) {
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            if (this.mRunning) {
                this.mEndRequested = true;
            }
        }
    }

    public final void start() {
        SpringForce springForce = this.mSpring;
        if (springForce == null) {
            a$$ExternalSyntheticBUOutline0.m("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
            return;
        }
        double d = (float) springForce.mFinalPosition;
        if (d > this.mMaxValue) {
            a$$ExternalSyntheticBUOutline0.m("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d < this.mMinValue) {
            a$$ExternalSyntheticBUOutline0.m("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.mMinVisibleChange * 0.75f);
        springForce.mValueThreshold = abs;
        springForce.mVelocityThreshold = abs * 62.5d;
        if (!getAnimationHandler().isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.mRunning;
        if (z || z) {
            return;
        }
        this.mRunning = true;
        if (!this.mStartValueIsSet) {
            this.mValue = this.mProperty.getValue(this.mTarget);
        }
        float f = this.mValue;
        if (f > this.mMaxValue || f < this.mMinValue) {
            a$$ExternalSyntheticBUOutline0.m$3("Starting value need to be in between min value and max value");
        } else {
            getAnimationHandler().addAnimationFrameCallback(this);
        }
    }

    public SpringAnimation(final Renderer.DisplayInfo displayInfo) {
        this.mVelocity = RecyclerView.DECELERATION_RATE;
        this.mValue = Float.MAX_VALUE;
        this.mStartValueIsSet = false;
        this.mRunning = false;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -3.4028235E38f;
        this.mLastFrameTime = 0L;
        this.mEndListeners = new ArrayList();
        this.mUpdateListeners = new ArrayList();
        this.mTarget = null;
        this.mProperty = new PlatformKt() { // from class: androidx.dynamicanimation.animation.DynamicAnimation$15
            @Override // app.cash.molecule.PlatformKt
            public final float getValue(Object obj) {
                return Renderer.DisplayInfo.this.refreshRate;
            }

            @Override // app.cash.molecule.PlatformKt
            public final void setValue(Object obj, float f) {
                Renderer.DisplayInfo.this.refreshRate = f;
            }
        };
        this.mMinVisibleChange = 1.0f;
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }
}
