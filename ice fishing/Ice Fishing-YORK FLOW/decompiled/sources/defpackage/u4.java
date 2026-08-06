package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u4 extends android.view.ViewGroup {
    public final java.util.HashMap WDYagTQQm9ns;
    public final java.util.HashMap oh71FJcDz6S2;

    public u4(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.WDYagTQQm9ns = new java.util.HashMap();
        this.oh71FJcDz6S2 = new java.util.HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final java.util.HashMap<java.lang.Object, defpackage.jd0> getHolderToLayoutNode() {
        return this.WDYagTQQm9ns;
    }

    public final java.util.HashMap<defpackage.jd0, java.lang.Object> getLayoutNodeToHolder() {
        return this.oh71FJcDz6S2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.util.Iterator it = this.WDYagTQQm9ns.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.p81.ZpBGe2uQfcn8();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            defpackage.e80.ZpBGe2uQfcn8("widthMeasureSpec should be EXACTLY");
        }
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            defpackage.e80.ZpBGe2uQfcn8("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
        java.util.Iterator it = this.WDYagTQQm9ns.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.p81.ZpBGe2uQfcn8();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            defpackage.jd0 jd0Var = (defpackage.jd0) this.WDYagTQQm9ns.get(childAt);
            if (childAt.isLayoutRequested() && jd0Var != null) {
                defpackage.jd0.z16KqenTjq8o(jd0Var, false, 7);
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
