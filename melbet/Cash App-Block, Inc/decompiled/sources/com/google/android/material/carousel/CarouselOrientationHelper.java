package com.google.android.material.carousel;

/* loaded from: classes4.dex */
public abstract class CarouselOrientationHelper {
    public final int orientation;

    public CarouselOrientationHelper(int i) {
        this.orientation = i;
    }

    public abstract int getParentBottom();

    public abstract int getParentLeft();

    public abstract int getParentRight();

    public abstract int getParentStart();

    public abstract int getParentTop();
}
