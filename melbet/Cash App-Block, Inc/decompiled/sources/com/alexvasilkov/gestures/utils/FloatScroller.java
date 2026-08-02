package com.alexvasilkov.gestures.utils;

import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes3.dex */
public final class FloatScroller {
    public float currValue;
    public float finalValue;
    public long startRtc;
    public float startValue;
    public boolean finished = true;
    public long duration = 250;
    public final AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();

    public final void computeScroll() {
        if (this.finished) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.startRtc;
        long j = this.duration;
        if (elapsedRealtime >= j) {
            this.finished = true;
            this.currValue = this.finalValue;
        } else {
            float interpolation = this.interpolator.getInterpolation(elapsedRealtime / j);
            float f = this.startValue;
            this.currValue = CameraState$Type$EnumUnboxingLocalUtility.m(this.finalValue, f, interpolation, f);
        }
    }
}
