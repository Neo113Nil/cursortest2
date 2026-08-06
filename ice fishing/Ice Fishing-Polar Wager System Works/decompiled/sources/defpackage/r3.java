package defpackage;

/* loaded from: classes.dex */
public final class r3 extends android.view.ViewGroup {
    public final java.util.HashMap adDC3e2L;
    public final java.util.HashMap xiZrDbcSW0;

    public r3(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.adDC3e2L = new java.util.HashMap();
        this.xiZrDbcSW0 = new java.util.HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final java.util.HashMap<java.lang.Object, defpackage.ma0> getHolderToLayoutNode() {
        return this.adDC3e2L;
    }

    public final java.util.HashMap<defpackage.ma0, java.lang.Object> getLayoutNodeToHolder() {
        return this.xiZrDbcSW0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.util.Iterator it = this.adDC3e2L.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.db.kd6TUFXn();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            defpackage.x50.IHQe1A4L2xu("widthMeasureSpec should be EXACTLY");
        }
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            defpackage.x50.IHQe1A4L2xu("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
        java.util.Iterator it = this.adDC3e2L.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.db.kd6TUFXn();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            defpackage.ma0 ma0Var = (defpackage.ma0) this.adDC3e2L.get(childAt);
            if (childAt.isLayoutRequested() && ma0Var != null) {
                defpackage.ma0.wKlPRKlRnfqr(ma0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
    }
}
