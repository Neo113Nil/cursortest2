package androidx.core.view;

/* loaded from: classes.dex */
public final class NestedScrollingParentHelper {
    public int mNestedScrollAxesNonTouch;
    public int mNestedScrollAxesTouch;

    public NestedScrollingParentHelper(int i) {
        this.mNestedScrollAxesTouch = 2;
        this.mNestedScrollAxesNonTouch = i;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollAxesNonTouch | this.mNestedScrollAxesTouch;
    }

    public NestedScrollingParentHelper(int i, int i2) {
        this.mNestedScrollAxesTouch = i;
        this.mNestedScrollAxesNonTouch = i2;
    }
}
