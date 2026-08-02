package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import org.commonmark.node.Node;

/* loaded from: classes4.dex */
public final class DeterminateDrawable extends DrawableWithAnimatedVisibilityChange {
    public static final MaterialButton.AnonymousClass1 INDICATOR_LENGTH_IN_LEVEL = new MaterialButton.AnonymousClass1(1);
    public final DrawingDelegate$ActiveIndicator activeIndicator;
    public ValueAnimator amplitudeAnimator;
    public TimeInterpolator amplitudeInterpolator;
    public TimeInterpolator amplitudeOffInterpolator;
    public TimeInterpolator amplitudeOnInterpolator;
    public final Node drawingDelegate;
    public final ValueAnimator phaseAnimator;
    public boolean skipAnimationOnLevelChange;
    public final SpringAnimation springAnimation;
    public float targetAmplitudeFraction;

    public DeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, Node node) {
        super(context, baseProgressIndicatorSpec);
        this.skipAnimationOnLevelChange = false;
        this.drawingDelegate = node;
        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = new DrawingDelegate$ActiveIndicator();
        this.activeIndicator = drawingDelegate$ActiveIndicator;
        drawingDelegate$ActiveIndicator.isDeterminate = true;
        SpringAnimation springAnimation = new SpringAnimation(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = springAnimation;
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        springAnimation.mSpring = springForce;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.phaseAnimator = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(RecyclerView.DECELERATION_RATE, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(4, this, baseProgressIndicatorSpec));
        if (baseProgressIndicatorSpec.hasWavyEffect(true) && baseProgressIndicatorSpec.waveSpeed != 0) {
            valueAnimator.start();
        }
        if (this.growFraction != 1.0f) {
            this.growFraction = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            canvas.save();
            Rect bounds = getBounds();
            float growFraction = getGrowFraction();
            ObjectAnimator objectAnimator = this.showAnimator;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.hideAnimator;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            Node node = this.drawingDelegate;
            ((BaseProgressIndicatorSpec) node.parent).validateSpec();
            node.adjustCanvas(canvas, bounds, growFraction, z, z2);
            float phaseFraction = getPhaseFraction();
            DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = this.activeIndicator;
            drawingDelegate$ActiveIndicator.phaseFraction = phaseFraction;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.paint;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            drawingDelegate$ActiveIndicator.color = baseProgressIndicatorSpec.indicatorColors[0];
            int i = baseProgressIndicatorSpec.indicatorTrackGapSize;
            Node node2 = this.drawingDelegate;
            if (i > 0) {
                if (!(node2 instanceof LinearDrawingDelegate)) {
                    i = (int) ((MathUtils.clamp(drawingDelegate$ActiveIndicator.endFraction, RecyclerView.DECELERATION_RATE, 0.01f) * i) / 0.01f);
                }
                this.drawingDelegate.fillTrack(canvas, paint, drawingDelegate$ActiveIndicator.endFraction, 1.0f, baseProgressIndicatorSpec.trackColor, this.totalAlpha, i);
            } else {
                node2.fillTrack(canvas, paint, RecyclerView.DECELERATION_RATE, 1.0f, baseProgressIndicatorSpec.trackColor, this.totalAlpha, 0);
            }
            int i2 = this.totalAlpha;
            Node node3 = this.drawingDelegate;
            node3.fillIndicator(canvas, paint, drawingDelegate$ActiveIndicator, i2);
            node3.drawStopIndicator(canvas, paint, baseProgressIndicatorSpec.indicatorColors[0], this.totalAlpha);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.springAnimation.skipToEnd();
        this.activeIndicator.endFraction = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
        float f2 = (f < baseProgressIndicatorSpec.waveAmplitudeRampProgressMin * 10000.0f || f > baseProgressIndicatorSpec.waveAmplitudeRampProgressMax * 10000.0f) ? RecyclerView.DECELERATION_RATE : 1.0f;
        boolean z = this.skipAnimationOnLevelChange;
        DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = this.activeIndicator;
        SpringAnimation springAnimation = this.springAnimation;
        if (z) {
            springAnimation.skipToEnd();
            drawingDelegate$ActiveIndicator.endFraction = f / 10000.0f;
            invalidateSelf();
            drawingDelegate$ActiveIndicator.amplitudeFraction = f2;
            invalidateSelf();
            return true;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            if (this.drawingDelegate instanceof LinearDrawingDelegate) {
                springAnimation.setMinimumVisibleChange(10000.0f / width);
            } else {
                springAnimation.setMinimumVisibleChange((float) (10000.0d / (Math.min(height, width) * 3.141592653589793d)));
            }
        }
        springAnimation.setStartValue(drawingDelegate$ActiveIndicator.endFraction * 10000.0f);
        springAnimation.animateToFinalPosition(f);
        return true;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        animatorDurationScaleProvider.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == RecyclerView.DECELERATION_RATE) {
            this.skipAnimationOnLevelChange = true;
            return visibleInternal;
        }
        this.skipAnimationOnLevelChange = false;
        this.springAnimation.mSpring.setStiffness(50.0f / f);
        return visibleInternal;
    }
}
