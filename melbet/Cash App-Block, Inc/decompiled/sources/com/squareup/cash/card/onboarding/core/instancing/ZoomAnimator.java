package com.squareup.cash.card.onboarding.core.instancing;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.ZoomLevel;

/* loaded from: classes6.dex */
public final class ZoomAnimator {
    public ZoomLevel currentZoom;
    public float farPanMaxY;
    public float farPanMinY;
    public float farRestOffsetY;
    public float farTileOriginY;
    public int focusedCardIndex;
    public int focusedCol;
    public int focusedRow;
    public boolean isPinchDriven;
    public float panAnimProgress;
    public float panAnimStartX;
    public float panAnimStartY;
    public float panAnimTargetX;
    public float panAnimTargetY;
    public float panSettleDuration;
    public float panX;
    public float panY;
    public ZoomLevel targetZoom;
    public float transitionProgress;

    public static void animatePanTo$default(ZoomAnimator zoomAnimator, float f, float f2) {
        zoomAnimator.panAnimStartX = zoomAnimator.panX;
        zoomAnimator.panAnimStartY = zoomAnimator.panY;
        zoomAnimator.panAnimTargetX = f;
        zoomAnimator.panAnimTargetY = f2;
        zoomAnimator.panSettleDuration = 0.5f;
        zoomAnimator.panAnimProgress = RecyclerView.DECELERATION_RATE;
    }

    public final float getEasedProgress() {
        boolean z = this.isPinchDriven;
        float f = this.transitionProgress;
        if (z) {
            return f;
        }
        float f2 = 1.0f - f;
        return 1.0f - ((f2 * f2) * f2);
    }

    public final boolean isAnimating() {
        return this.transitionProgress < 1.0f || this.isPinchDriven;
    }

    public final void zoomTo(ZoomLevel zoomLevel) {
        zoomLevel.getClass();
        if (zoomLevel != this.targetZoom || isAnimating()) {
            this.currentZoom = this.targetZoom;
            this.targetZoom = zoomLevel;
            this.transitionProgress = RecyclerView.DECELERATION_RATE;
        }
    }
}
