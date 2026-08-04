package com.gamericefishpro.space.k4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public abstract int clampViewPositionHorizontal(View view, int i, int i2);

    public abstract int clampViewPositionVertical(View view, int i, int i2);

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i) {
        return false;
    }

    public abstract void onViewReleased(View view, float f, float f2);

    public abstract boolean tryCaptureView(View view, int i);

    public int getOrderedChildIndex(int i) {
        return i;
    }

    public void onViewDragStateChanged(int i) {
    }

    public void onEdgeDragStarted(int i, int i2) {
    }

    public void onEdgeTouched(int i, int i2) {
    }

    public void onViewCaptured(View view, int i) {
    }

    public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
    }
}
