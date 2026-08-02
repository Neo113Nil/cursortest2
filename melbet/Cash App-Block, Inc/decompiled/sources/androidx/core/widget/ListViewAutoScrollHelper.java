package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.DropDownListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Client;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ListViewAutoScrollHelper implements View.OnTouchListener {
    public static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    public final int mActivationDelay;
    public boolean mAlreadyDelayed;
    public boolean mAnimating;
    public final AccelerateInterpolator mEdgeInterpolator;
    public final int mEdgeType;
    public boolean mEnabled;
    public final float[] mMaximumEdges;
    public final float[] mMaximumVelocity;
    public final float[] mMinimumVelocity;
    public boolean mNeedsCancel;
    public boolean mNeedsReset;
    public final float[] mRelativeEdges;
    public final float[] mRelativeVelocity;
    public Client.AnonymousClass7 mRunnable;
    public final AutoScrollHelper$ClampedScroller mScroller;
    public final DropDownListView mTarget;
    public final DropDownListView mTarget$1;

    public ListViewAutoScrollHelper(DropDownListView dropDownListView) {
        AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = new AutoScrollHelper$ClampedScroller();
        autoScrollHelper$ClampedScroller.mStartTime = Long.MIN_VALUE;
        autoScrollHelper$ClampedScroller.mStopTime = -1L;
        autoScrollHelper$ClampedScroller.mDeltaTime = 0L;
        this.mScroller = autoScrollHelper$ClampedScroller;
        this.mEdgeInterpolator = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        this.mRelativeEdges = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.mMaximumEdges = fArr2;
        float[] fArr3 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        this.mRelativeVelocity = fArr3;
        float[] fArr4 = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        this.mMinimumVelocity = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.mMaximumVelocity = fArr5;
        this.mTarget$1 = dropDownListView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.mEdgeType = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.mActivationDelay = DEFAULT_ACTIVATION_DELAY;
        autoScrollHelper$ClampedScroller.mRampUpDuration = 500;
        autoScrollHelper$ClampedScroller.mRampDownDuration = 500;
        this.mTarget = dropDownListView;
    }

    public static float constrain(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float computeTargetVelocity(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float constrain = constrain(this.mRelativeEdges[i] * f2, RecyclerView.DECELERATION_RATE, this.mMaximumEdges[i]);
        float constrainEdgeValue = constrainEdgeValue(f2 - f, constrain) - constrainEdgeValue(f, constrain);
        AccelerateInterpolator accelerateInterpolator = this.mEdgeInterpolator;
        if (constrainEdgeValue < RecyclerView.DECELERATION_RATE) {
            interpolation = -accelerateInterpolator.getInterpolation(-constrainEdgeValue);
        } else {
            if (constrainEdgeValue <= RecyclerView.DECELERATION_RATE) {
                f4 = 0.0f;
                if (f4 != RecyclerView.DECELERATION_RATE) {
                    return RecyclerView.DECELERATION_RATE;
                }
                float f5 = this.mRelativeVelocity[i];
                float f6 = this.mMinimumVelocity[i];
                float f7 = this.mMaximumVelocity[i];
                float f8 = f5 * f3;
                return f4 > RecyclerView.DECELERATION_RATE ? constrain(f4 * f8, f6, f7) : -constrain((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(constrainEdgeValue);
        }
        f4 = constrain(interpolation, -1.0f, 1.0f);
        if (f4 != RecyclerView.DECELERATION_RATE) {
        }
    }

    public final float constrainEdgeValue(float f, float f2) {
        if (f2 != RecyclerView.DECELERATION_RATE) {
            int i = this.mEdgeType;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= RecyclerView.DECELERATION_RATE) {
                        return 1.0f - (f / f2);
                    }
                    if (this.mAnimating && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < RecyclerView.DECELERATION_RATE) {
                return f / (-f2);
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.mEnabled) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                requestStop();
                return false;
            }
            this.mNeedsCancel = true;
            this.mAlreadyDelayed = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            DropDownListView dropDownListView = this.mTarget$1;
            float computeTargetVelocity = computeTargetVelocity(x, width, dropDownListView.getWidth(), 0);
            float computeTargetVelocity2 = computeTargetVelocity(motionEvent.getY(), view.getHeight(), dropDownListView.getHeight(), 1);
            AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = this.mScroller;
            autoScrollHelper$ClampedScroller.mTargetVelocityX = computeTargetVelocity;
            autoScrollHelper$ClampedScroller.mTargetVelocityY = computeTargetVelocity2;
            if (!this.mAnimating && shouldAnimate()) {
                if (this.mRunnable == null) {
                    this.mRunnable = new Client.AnonymousClass7(this, 10);
                }
                this.mAnimating = true;
                this.mNeedsReset = true;
                if (this.mAlreadyDelayed || (i = this.mActivationDelay) <= 0) {
                    this.mRunnable.run();
                } else {
                    Client.AnonymousClass7 anonymousClass7 = this.mRunnable;
                    long j = i;
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    dropDownListView.postOnAnimationDelayed(anonymousClass7, j);
                }
                this.mAlreadyDelayed = true;
            }
        }
        return false;
    }

    public final void requestStop() {
        int i = 0;
        if (this.mNeedsReset) {
            this.mAnimating = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = this.mScroller;
        int i2 = (int) (currentAnimationTimeMillis - autoScrollHelper$ClampedScroller.mStartTime);
        int i3 = autoScrollHelper$ClampedScroller.mRampDownDuration;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        autoScrollHelper$ClampedScroller.mEffectiveRampDown = i;
        autoScrollHelper$ClampedScroller.mStopValue = autoScrollHelper$ClampedScroller.getValueAt(currentAnimationTimeMillis);
        autoScrollHelper$ClampedScroller.mStopTime = currentAnimationTimeMillis;
    }

    public final boolean shouldAnimate() {
        DropDownListView dropDownListView;
        int count;
        AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = this.mScroller;
        float f = autoScrollHelper$ClampedScroller.mTargetVelocityY;
        int abs = (int) (f / Math.abs(f));
        Math.abs(autoScrollHelper$ClampedScroller.mTargetVelocityX);
        if (abs != 0 && (count = (dropDownListView = this.mTarget).getCount()) != 0) {
            int childCount = dropDownListView.getChildCount();
            int firstVisiblePosition = dropDownListView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && dropDownListView.getChildAt(0).getTop() >= 0)) : !(i >= count && dropDownListView.getChildAt(childCount - 1).getBottom() <= dropDownListView.getHeight())) {
                return true;
            }
        }
        return false;
    }
}
