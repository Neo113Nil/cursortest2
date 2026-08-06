package defpackage;

/* loaded from: classes.dex */
public abstract class ur extends android.view.ViewGroup {
    public final void IHQe1A4L2xu(defpackage.hb hbVar, android.view.View view, long j) {
        super.drawChild(defpackage.d0.IHQe1A4L2xu(hbVar), view, j);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
