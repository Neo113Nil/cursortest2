package com.alexvasilkov.gestures.internal;

import android.graphics.Point;
import android.graphics.RectF;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.alexvasilkov.gestures.GestureController;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.State;
import com.alexvasilkov.gestures.animation.ViewPositionAnimator;
import com.alexvasilkov.gestures.views.GestureImageView;

/* loaded from: classes3.dex */
public final class ExitController {
    public static final RectF tmpArea = new RectF();
    public static final Point tmpPivot = new Point();
    public final GestureImageView animatorView;
    public final GestureController controller;
    public float initialY;
    public float initialZoom;
    public boolean isRotationInAction;
    public boolean isScrollDetected;
    public boolean isZoomDetected;
    public boolean isZoomInAction;
    public float scrollDirection;
    public final float scrollThresholdScaled;
    public boolean skipScrollDetection;
    public boolean skipZoomDetection;
    public float totalScrollX;
    public float totalScrollY;
    public float exitState = 1.0f;
    public float zoomAccumulator = 1.0f;

    public ExitController(GestureImageView gestureImageView, GestureController gestureController) {
        this.controller = gestureController;
        this.animatorView = gestureImageView;
        this.scrollThresholdScaled = TypedValue.applyDimension(1, 30.0f, gestureImageView.getContext().getResources().getDisplayMetrics());
    }

    public final boolean canDetectExit() {
        GestureImageView gestureImageView;
        Settings settings = this.controller.settings;
        return ((settings.isGesturesEnabled() ? settings.exitType : 4) == 4 || (gestureImageView = this.animatorView) == null || gestureImageView.getPositionAnimator().isLeaving) ? false : true;
    }

    public final void finishDetection() {
        if (isExitDetected()) {
            GestureController gestureController = this.controller;
            gestureController.settings.boundsDisableCount--;
            ViewPositionAnimator positionAnimator = this.animatorView.getPositionAnimator();
            if (!positionAnimator.isAnimating && canDetectExit()) {
                float f = positionAnimator.position;
                if (f < 0.75f) {
                    a$$ExternalSyntheticBUOutline0.m$1("You should call enter(...) before calling exit(...)");
                    return;
                }
                State state = gestureController.state;
                float f2 = state.y;
                float f3 = state.zoom;
                if (this.isScrollDetected) {
                    State.equals(f2, this.initialY);
                }
                if (this.isZoomDetected) {
                    State.equals(f3, this.initialZoom);
                }
                if (f < 1.0f) {
                    positionAnimator.setState(f, false, true);
                    throw null;
                }
            }
        }
        this.isScrollDetected = false;
        this.isZoomDetected = false;
        this.skipScrollDetection = false;
        this.exitState = 1.0f;
        this.scrollDirection = RecyclerView.DECELERATION_RATE;
        this.totalScrollX = RecyclerView.DECELERATION_RATE;
        this.totalScrollY = RecyclerView.DECELERATION_RATE;
        this.zoomAccumulator = 1.0f;
    }

    public final boolean isExitDetected() {
        return this.isScrollDetected || this.isZoomDetected;
    }

    public final void updateState() {
        if (canDetectExit()) {
            GestureImageView gestureImageView = this.animatorView;
            ViewPositionAnimator positionAnimator = gestureImageView.getPositionAnimator();
            State state = this.controller.state;
            float f = this.exitState;
            positionAnimator.getClass();
            if (f <= RecyclerView.DECELERATION_RATE) {
                a$$ExternalSyntheticBUOutline0.m$3("'To' position cannot be <= 0");
            } else if (f <= 1.0f) {
                positionAnimator.toState.set(state);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("'To' position cannot be > 1");
            }
            gestureImageView.getPositionAnimator().setState(this.exitState, false, false);
            throw null;
        }
    }
}
