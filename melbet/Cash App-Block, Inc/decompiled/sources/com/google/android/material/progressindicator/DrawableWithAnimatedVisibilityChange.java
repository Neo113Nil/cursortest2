package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ViewUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable {
    public static final ViewUtils.AnonymousClass1 GROW_FRACTION = new ViewUtils.AnonymousClass1(18, Float.class, "growFraction");
    public ArrayList animationCallbacks;
    public final BaseProgressIndicatorSpec baseSpec;
    public final Context context;
    public float growFraction;
    public ObjectAnimator hideAnimator;
    public boolean ignoreCallbacks;
    public ObjectAnimator showAnimator;
    public int totalAlpha;
    public final float mockPhaseFraction = -1.0f;
    public final Paint paint = new Paint();
    public final Rect clipBounds = new Rect();
    public AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    public DrawableWithAnimatedVisibilityChange(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.totalAlpha;
    }

    public final float getGrowFraction() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
        if (baseProgressIndicatorSpec.showAnimationBehavior == 0 && baseProgressIndicatorSpec.hideAnimationBehavior == 0) {
            return 1.0f;
        }
        return this.growFraction;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final float getPhaseFraction() {
        float f = this.mockPhaseFraction;
        if (f > RecyclerView.DECELERATION_RATE) {
            return f;
        }
        boolean z = this instanceof DeterminateDrawable;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
        if (baseProgressIndicatorSpec.hasWavyEffect(z) && baseProgressIndicatorSpec.waveSpeed != 0) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
            ContentResolver contentResolver = this.context.getContentResolver();
            animatorDurationScaleProvider.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > RecyclerView.DECELERATION_RATE) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r7) / ((int) ((((z ? baseProgressIndicatorSpec.wavelengthDeterminate : baseProgressIndicatorSpec.wavelengthIndeterminate) * 1000.0f) / baseProgressIndicatorSpec.waveSpeed) * f2));
                return uptimeMillis < RecyclerView.DECELERATION_RATE ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.showAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.hideAnimator;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2, boolean z3) {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        animatorDurationScaleProvider.getClass();
        return setVisibleInternal(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > RecyclerView.DECELERATION_RATE);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.showAnimator;
        final int i = 0;
        ViewUtils.AnonymousClass1 anonymousClass1 = GROW_FRACTION;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, anonymousClass1, RecyclerView.DECELERATION_RATE, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ObjectAnimator objectAnimator2 = this.showAnimator;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.showAnimator = objectAnimator2;
            objectAnimator2.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                public final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 1:
                            super.onAnimationEnd(animator);
                            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = this.this$0;
                            DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                            ArrayList arrayList = drawableWithAnimatedVisibilityChange.animationCallbacks;
                            if (arrayList != null && !drawableWithAnimatedVisibilityChange.ignoreCallbacks) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((Animatable2Compat$AnimationCallback) it.next()).onAnimationEnd(drawableWithAnimatedVisibilityChange);
                                }
                                break;
                            }
                            break;
                        default:
                            super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (i) {
                        case 0:
                            super.onAnimationStart(animator);
                            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = this.this$0;
                            ArrayList arrayList = drawableWithAnimatedVisibilityChange.animationCallbacks;
                            if (arrayList != null && !drawableWithAnimatedVisibilityChange.ignoreCallbacks) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((Animatable2Compat$AnimationCallback) it.next()).onAnimationStart(drawableWithAnimatedVisibilityChange);
                                }
                                break;
                            }
                            break;
                        default:
                            super.onAnimationStart(animator);
                            break;
                    }
                }
            });
        }
        final int i2 = 1;
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, anonymousClass1, 1.0f, RecyclerView.DECELERATION_RATE);
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ObjectAnimator objectAnimator3 = this.hideAnimator;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.hideAnimator = objectAnimator3;
            objectAnimator3.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                public final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 1:
                            super.onAnimationEnd(animator);
                            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = this.this$0;
                            DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                            ArrayList arrayList = drawableWithAnimatedVisibilityChange.animationCallbacks;
                            if (arrayList != null && !drawableWithAnimatedVisibilityChange.ignoreCallbacks) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((Animatable2Compat$AnimationCallback) it.next()).onAnimationEnd(drawableWithAnimatedVisibilityChange);
                                }
                                break;
                            }
                            break;
                        default:
                            super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    switch (i2) {
                        case 0:
                            super.onAnimationStart(animator);
                            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = this.this$0;
                            ArrayList arrayList = drawableWithAnimatedVisibilityChange.animationCallbacks;
                            if (arrayList != null && !drawableWithAnimatedVisibilityChange.ignoreCallbacks) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((Animatable2Compat$AnimationCallback) it.next()).onAnimationStart(drawableWithAnimatedVisibilityChange);
                                }
                                break;
                            }
                            break;
                        default:
                            super.onAnimationStart(animator);
                            break;
                    }
                }
            });
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.showAnimator : this.hideAnimator;
            ObjectAnimator objectAnimator5 = z ? this.hideAnimator : this.showAnimator;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.ignoreCallbacks;
                    this.ignoreCallbacks = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.ignoreCallbacks = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.ignoreCallbacks;
                    this.ignoreCallbacks = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.ignoreCallbacks = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
                if (!z ? baseProgressIndicatorSpec.hideAnimationBehavior != 0 : baseProgressIndicatorSpec.showAnimationBehavior != 0) {
                    boolean z7 = this.ignoreCallbacks;
                    this.ignoreCallbacks = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.ignoreCallbacks = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisibleInternal(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisibleInternal(false, true, false);
    }

    public final void unregisterAnimationCallback(MaterialCheckBox.AnonymousClass1 anonymousClass1) {
        ArrayList arrayList = this.animationCallbacks;
        if (arrayList == null || !arrayList.contains(anonymousClass1)) {
            return;
        }
        this.animationCallbacks.remove(anonymousClass1);
        if (this.animationCallbacks.isEmpty()) {
            this.animationCallbacks = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }
}
