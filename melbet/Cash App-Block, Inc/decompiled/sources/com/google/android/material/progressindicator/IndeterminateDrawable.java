package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.mlkit.vision.text.Text;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.commonmark.node.Node;

/* loaded from: classes4.dex */
public final class IndeterminateDrawable extends DrawableWithAnimatedVisibilityChange {
    public Text.TextBase animatorDelegate;
    public final Node drawingDelegate;
    public VectorDrawableCompat staticDummyDrawable;

    public IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseProgressIndicatorSpec, Node node, Text.TextBase textBase) {
        super(context, baseProgressIndicatorSpec);
        this.drawingDelegate = node;
        this.animatorDelegate = textBase;
        textBase.zza = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        VectorDrawableCompat vectorDrawableCompat;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            if (animatorDurationScaleProvider != null && Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f) == RecyclerView.DECELERATION_RATE && (vectorDrawableCompat = this.staticDummyDrawable) != null) {
                vectorDrawableCompat.setBounds(getBounds());
                this.staticDummyDrawable.setTint(baseProgressIndicatorSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
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
            int i2 = baseProgressIndicatorSpec.indicatorTrackGapSize;
            int i3 = this.totalAlpha;
            boolean z3 = (baseProgressIndicatorSpec instanceof LinearProgressIndicatorSpec) || ((baseProgressIndicatorSpec instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateTrackVisible);
            boolean z4 = z3 && i2 == 0 && !baseProgressIndicatorSpec.hasWavyEffect(false);
            Paint paint = this.paint;
            if (z4) {
                this.drawingDelegate.fillTrack(canvas, paint, RecyclerView.DECELERATION_RATE, 1.0f, baseProgressIndicatorSpec.trackColor, i3, 0);
            } else if (z3) {
                DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator) ((ArrayList) this.animatorDelegate.zzd).get(0);
                DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator2 = (DrawingDelegate$ActiveIndicator) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, (ArrayList) this.animatorDelegate.zzd);
                Node node2 = this.drawingDelegate;
                if (node2 instanceof LinearDrawingDelegate) {
                    i = i2;
                    node2.fillTrack(canvas, paint, RecyclerView.DECELERATION_RATE, drawingDelegate$ActiveIndicator.startFraction, baseProgressIndicatorSpec.trackColor, i3, i);
                    this.drawingDelegate.fillTrack(canvas, paint, drawingDelegate$ActiveIndicator2.endFraction, 1.0f, baseProgressIndicatorSpec.trackColor, i3, i);
                } else {
                    i = i2;
                    canvas.save();
                    canvas.rotate(drawingDelegate$ActiveIndicator2.rotationDegree);
                    this.drawingDelegate.fillTrack(canvas, paint, drawingDelegate$ActiveIndicator2.endFraction, drawingDelegate$ActiveIndicator.startFraction + 1.0f, baseProgressIndicatorSpec.trackColor, i3, i);
                    canvas.restore();
                }
                for (int i4 = 0; i4 < ((ArrayList) this.animatorDelegate.zzd).size(); i4++) {
                    DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator3 = (DrawingDelegate$ActiveIndicator) ((ArrayList) this.animatorDelegate.zzd).get(i4);
                    drawingDelegate$ActiveIndicator3.phaseFraction = getPhaseFraction();
                    this.drawingDelegate.fillIndicator(canvas, paint, drawingDelegate$ActiveIndicator3, this.totalAlpha);
                    if (i4 > 0 && !z4 && z3) {
                        this.drawingDelegate.fillTrack(canvas, paint, ((DrawingDelegate$ActiveIndicator) ((ArrayList) this.animatorDelegate.zzd).get(i4 - 1)).endFraction, drawingDelegate$ActiveIndicator3.startFraction, baseProgressIndicatorSpec.trackColor, i3, i);
                    }
                }
                canvas.restore();
            }
            i = i2;
            while (i4 < ((ArrayList) this.animatorDelegate.zzd).size()) {
            }
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

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public final boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        VectorDrawableCompat vectorDrawableCompat;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (this.animatorDurationScaleProvider != null && Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f) == RecyclerView.DECELERATION_RATE && (vectorDrawableCompat = this.staticDummyDrawable) != null) {
            return vectorDrawableCompat.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (z && z3) {
            this.animatorDelegate.startAnimator();
        }
        return visibleInternal;
    }
}
