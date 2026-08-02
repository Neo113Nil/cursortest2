package com.alexvasilkov.gestures.internal.detectors;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes3.dex */
public final class ScaleGestureDetectorFixed extends ScaleGestureDetector {
    public float currY;
    public float prevY;

    @Override // android.view.ScaleGestureDetector
    public final float getScaleFactor() {
        float scaleFactor = super.getScaleFactor();
        if (!isQuickScaleEnabled() || getCurrentSpan() != getCurrentSpanY()) {
            return scaleFactor;
        }
        float f = this.currY;
        float f2 = this.prevY;
        if ((f <= f2 || scaleFactor <= 1.0f) && (f >= f2 || scaleFactor >= 1.0f)) {
            return 1.0f;
        }
        return Math.max(0.8f, Math.min(scaleFactor, 1.25f));
    }

    @Override // android.view.ScaleGestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.prevY = this.currY;
        this.currY = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.prevY = motionEvent.getY();
        }
        return onTouchEvent;
    }
}
