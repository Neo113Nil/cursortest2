package com.alexvasilkov.gestures;

/* loaded from: classes3.dex */
public final class Settings {
    public long animationsDuration;
    public int boundsDisableCount;
    public int boundsType;
    public float doubleTapZoom;
    public int exitType;
    public int fitMethod;
    public int gesturesDisableCount;
    public int gravity;
    public int imageH;
    public int imageW;
    public boolean isDoubleTapEnabled;
    public boolean isFillViewport;
    public boolean isFlingEnabled;
    public boolean isMovementAreaSpecified;
    public boolean isPanEnabled;
    public boolean isRestrictRotation;
    public boolean isRotationEnabled;
    public boolean isZoomEnabled;
    public float maxZoom;
    public float minZoom;
    public int movementAreaH;
    public int movementAreaW;
    public float overscrollDistanceX;
    public float overscrollDistanceY;
    public float overzoomFactor;
    public int viewportH;
    public int viewportW;

    public final boolean isEnabled() {
        if (isGesturesEnabled()) {
            return this.isPanEnabled || this.isZoomEnabled || this.isRotationEnabled || this.isDoubleTapEnabled;
        }
        return false;
    }

    public final boolean isGesturesEnabled() {
        return this.gesturesDisableCount <= 0;
    }

    public final boolean isPanEnabled() {
        return isGesturesEnabled() && this.isPanEnabled;
    }
}
