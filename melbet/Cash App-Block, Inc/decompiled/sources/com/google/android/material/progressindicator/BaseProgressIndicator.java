package com.google.android.material.progressindicator;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition$SeekController$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.commonmark.node.Node;

/* loaded from: classes4.dex */
public abstract class BaseProgressIndicator extends ProgressBar {
    public AnimatorDurationScaleProvider animatorDurationScaleProvider;
    public final AnonymousClass1 delayedHide;
    public final AnonymousClass1 delayedShow;
    public final Transition$SeekController$$ExternalSyntheticLambda0 hideAfterMaxProgressListener;
    public final MaterialCheckBox.AnonymousClass1 hideAnimationCallback;
    public boolean initialized;
    public boolean isIndeterminateModeChangeRequested;
    public final boolean isParentDoneInitializing;
    public long lastShowStartTime;
    public final int minHideDelay;
    public final BaseProgressIndicatorSpec spec;
    public int storedProgress;
    public boolean storedProgressAnimated;
    public final MaterialCheckBox.AnonymousClass1 switchIndeterminateModeCallback;
    public int visibilityAfterHide;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BaseProgressIndicator this$0;

        public /* synthetic */ AnonymousClass1(BaseProgressIndicator baseProgressIndicator, int i) {
            this.$r8$classId = i;
            this.this$0 = baseProgressIndicator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            BaseProgressIndicator baseProgressIndicator = this.this$0;
            switch (i) {
                case 0:
                    if (baseProgressIndicator.minHideDelay > 0) {
                        baseProgressIndicator.lastShowStartTime = SystemClock.uptimeMillis();
                    }
                    baseProgressIndicator.setVisibility(0);
                    break;
                default:
                    BaseProgressIndicator.access$100(baseProgressIndicator);
                    baseProgressIndicator.lastShowStartTime = -1L;
                    break;
            }
        }
    }

    public static void $r8$lambda$9LFVkjgCbQazReD7AnEDM8_FfLk(BaseProgressIndicator baseProgressIndicator) {
        if (((DeterminateDrawable) super.getProgressDrawable()) == null || ((DeterminateDrawable) super.getProgressDrawable()).getLevel() != 10000) {
            return;
        }
        AnonymousClass1 anonymousClass1 = baseProgressIndicator.delayedHide;
        if (baseProgressIndicator.getVisibility() != 0) {
            baseProgressIndicator.removeCallbacks(baseProgressIndicator.delayedShow);
            return;
        }
        baseProgressIndicator.removeCallbacks(anonymousClass1);
        long uptimeMillis = SystemClock.uptimeMillis() - baseProgressIndicator.lastShowStartTime;
        long j = baseProgressIndicator.minHideDelay;
        if (uptimeMillis >= j) {
            anonymousClass1.run();
        } else {
            baseProgressIndicator.postDelayed(anonymousClass1, j - uptimeMillis);
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.lastShowStartTime = -1L;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        int i3 = 1;
        this.hideAfterMaxProgressListener = new Transition$SeekController$$ExternalSyntheticLambda0(this, i3);
        this.delayedShow = new AnonymousClass1(this, 0);
        this.delayedHide = new AnonymousClass1(this, i3);
        this.switchIndeterminateModeCallback = new MaterialCheckBox.AnonymousClass1(this, i3);
        this.hideAnimationCallback = new MaterialCheckBox.AnonymousClass1(this, 2);
        Context context2 = getContext();
        this.spec = createSpec(context2, attributeSet);
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.BaseProgressIndicator, i, i2, new int[0]);
        obtainStyledAttributes.getInt(7, -1);
        this.minHideDelay = Math.min(obtainStyledAttributes.getInt(5, -1), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
        obtainStyledAttributes.recycle();
        this.animatorDurationScaleProvider = new AnimatorDurationScaleProvider();
        this.isParentDoneInitializing = true;
    }

    public static void access$100(BaseProgressIndicator baseProgressIndicator) {
        ((DrawableWithAnimatedVisibilityChange) baseProgressIndicator.getCurrentDrawable()).setVisible(false, false, true);
        if (((DeterminateDrawable) super.getProgressDrawable()) == null || !((DeterminateDrawable) super.getProgressDrawable()).isVisible()) {
            if (((IndeterminateDrawable) super.getIndeterminateDrawable()) == null || !((IndeterminateDrawable) super.getIndeterminateDrawable()).isVisible()) {
                baseProgressIndicator.setVisibility(4);
            }
        }
    }

    public abstract BaseProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? (IndeterminateDrawable) super.getIndeterminateDrawable() : (DeterminateDrawable) super.getProgressDrawable();
    }

    public final Node getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (((IndeterminateDrawable) super.getIndeterminateDrawable()) == null) {
                return null;
            }
            return ((IndeterminateDrawable) super.getIndeterminateDrawable()).drawingDelegate;
        }
        if (((DeterminateDrawable) super.getProgressDrawable()) == null) {
            return null;
        }
        return ((DeterminateDrawable) super.getProgressDrawable()).drawingDelegate;
    }

    @Override // android.widget.ProgressBar
    public final Drawable getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public final Drawable getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerSwitchIndeterminateModeCallback();
        DeterminateDrawable determinateDrawable = (DeterminateDrawable) super.getProgressDrawable();
        MaterialCheckBox.AnonymousClass1 anonymousClass1 = this.hideAnimationCallback;
        if (determinateDrawable != null) {
            DeterminateDrawable determinateDrawable2 = (DeterminateDrawable) super.getProgressDrawable();
            if (determinateDrawable2.animationCallbacks == null) {
                determinateDrawable2.animationCallbacks = new ArrayList();
            }
            if (!determinateDrawable2.animationCallbacks.contains(anonymousClass1)) {
                determinateDrawable2.animationCallbacks.add(anonymousClass1);
            }
        }
        if (((IndeterminateDrawable) super.getIndeterminateDrawable()) != null) {
            IndeterminateDrawable indeterminateDrawable = (IndeterminateDrawable) super.getIndeterminateDrawable();
            if (indeterminateDrawable.animationCallbacks == null) {
                indeterminateDrawable.animationCallbacks = new ArrayList();
            }
            if (!indeterminateDrawable.animationCallbacks.contains(anonymousClass1)) {
                indeterminateDrawable.animationCallbacks.add(anonymousClass1);
            }
        }
        if (visibleToUser()) {
            if (this.minHideDelay > 0) {
                this.lastShowStartTime = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, false);
        IndeterminateDrawable indeterminateDrawable = (IndeterminateDrawable) super.getIndeterminateDrawable();
        MaterialCheckBox.AnonymousClass1 anonymousClass1 = this.hideAnimationCallback;
        if (indeterminateDrawable != null) {
            ((IndeterminateDrawable) super.getIndeterminateDrawable()).unregisterAnimationCallback(anonymousClass1);
            ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDelegate.unregisterAnimatorsCompleteCallback();
        }
        if (((DeterminateDrawable) super.getProgressDrawable()) != null) {
            ((DeterminateDrawable) super.getProgressDrawable()).unregisterAnimationCallback(anonymousClass1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().invalidateCachedPaths();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            Node currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.getPreferredWidth() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.getPreferredWidth() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.getPreferredHeight() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.getPreferredHeight() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.isParentDoneInitializing) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.isParentDoneInitializing) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, false);
        }
    }

    public final void registerSwitchIndeterminateModeCallback() {
        if (((DeterminateDrawable) super.getProgressDrawable()) == null || ((IndeterminateDrawable) super.getIndeterminateDrawable()) == null) {
            return;
        }
        ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDelegate.registerAnimatorsCompleteCallback(this.switchIndeterminateModeCallback);
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.animatorDurationScaleProvider = animatorDurationScaleProvider;
        if (((DeterminateDrawable) super.getProgressDrawable()) != null) {
            ((DeterminateDrawable) super.getProgressDrawable()).animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
        if (((IndeterminateDrawable) super.getIndeterminateDrawable()) != null) {
            ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
    }

    public void setHideAfterMaxProgress(boolean z) {
        if (((DeterminateDrawable) super.getProgressDrawable()) == null) {
            return;
        }
        Transition$SeekController$$ExternalSyntheticLambda0 transition$SeekController$$ExternalSyntheticLambda0 = this.hideAfterMaxProgressListener;
        if (z) {
            ((DeterminateDrawable) super.getProgressDrawable()).springAnimation.addEndListener(transition$SeekController$$ExternalSyntheticLambda0);
            return;
        }
        ArrayList arrayList = ((DeterminateDrawable) super.getProgressDrawable()).springAnimation.mEndListeners;
        int indexOf = arrayList.indexOf(transition$SeekController$$ExternalSyntheticLambda0);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.spec.hideAnimationBehavior = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.setVisible(false, false, false);
            }
            super.setIndeterminate(z);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.setVisible(visibleToUser(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && visibleToUser()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).animatorDelegate.startAnimator();
            }
            this.isIndeterminateModeChangeRequested = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.indeterminateAnimatorDurationScale != f) {
            baseProgressIndicatorSpec.indeterminateAnimatorDurationScale = f;
            ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDelegate.invalidateSpecValues();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).setVisible(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.initialized) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorPrimary);
            iArr = new int[]{colorOrNull != null ? colorOrNull.intValue() : -1};
        }
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (Arrays.equals(baseProgressIndicatorSpec.indicatorColors, iArr)) {
            return;
        }
        baseProgressIndicatorSpec.indicatorColors = iArr;
        ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDelegate.invalidateSpecValues();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.indicatorTrackGapSize != i) {
            baseProgressIndicatorSpec.indicatorTrackGapSize = i;
            baseProgressIndicatorSpec.validateSpec();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i, false);
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (((DeterminateDrawable) super.getProgressDrawable()) == null || z) {
                return;
            }
            ((DeterminateDrawable) super.getProgressDrawable()).jumpToCurrentState();
            return;
        }
        if (((DeterminateDrawable) super.getProgressDrawable()) != null) {
            this.storedProgress = i;
            this.storedProgressAnimated = z;
            this.isIndeterminateModeChangeRequested = true;
            if (((IndeterminateDrawable) super.getIndeterminateDrawable()).isVisible()) {
                AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
                ContentResolver contentResolver = getContext().getContentResolver();
                animatorDurationScaleProvider.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != RecyclerView.DECELERATION_RATE) {
                    ((IndeterminateDrawable) super.getIndeterminateDrawable()).animatorDelegate.requestCancelAnimatorAfterCurrentCycle();
                    return;
                }
            }
            this.switchIndeterminateModeCallback.onAnimationEnd((IndeterminateDrawable) super.getIndeterminateDrawable());
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.setVisible(false, false, false);
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.initialized) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.spec.showAnimationBehavior = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.trackColor != i) {
            baseProgressIndicatorSpec.trackColor = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.trackCornerRadius != i) {
            baseProgressIndicatorSpec.trackCornerRadius = Math.min(i, baseProgressIndicatorSpec.trackThickness / 2);
            baseProgressIndicatorSpec.useRelativeTrackCornerRadius = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.trackCornerRadiusFraction != f) {
            baseProgressIndicatorSpec.trackCornerRadiusFraction = Math.min(f, 0.5f);
            baseProgressIndicatorSpec.useRelativeTrackCornerRadius = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.trackThickness != i) {
            baseProgressIndicatorSpec.trackThickness = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.visibilityAfterHide = i;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.waveAmplitude != i) {
            baseProgressIndicatorSpec.waveAmplitude = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveAmplitudeRampProgressMax(float f) {
        DeterminateDrawable determinateDrawable = (DeterminateDrawable) super.getProgressDrawable();
        determinateDrawable.baseSpec.waveAmplitudeRampProgressMax = f;
        determinateDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveAmplitudeRampProgressMin(float f) {
        DeterminateDrawable determinateDrawable = (DeterminateDrawable) super.getProgressDrawable();
        determinateDrawable.baseSpec.waveAmplitudeRampProgressMin = f;
        determinateDrawable.invalidateSelf();
        invalidate();
    }

    public void setWaveSpeed(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        baseProgressIndicatorSpec.waveSpeed = i;
        DeterminateDrawable determinateDrawable = (DeterminateDrawable) super.getProgressDrawable();
        boolean z = baseProgressIndicatorSpec.waveSpeed != 0;
        ValueAnimator valueAnimator = determinateDrawable.phaseAnimator;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.wavelengthDeterminate != i) {
            baseProgressIndicatorSpec.wavelengthDeterminate = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec.wavelengthIndeterminate != i) {
            baseProgressIndicatorSpec.wavelengthIndeterminate = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public final boolean visibleToUser() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final IndeterminateDrawable getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public final DeterminateDrawable getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
