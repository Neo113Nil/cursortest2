package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b2 extends ViewGroup {
    public final HashMap EljAMC1QTz;
    public final HashMap OOA6hdeuvCS;

    public b2(Context context) {
        super(context);
        setClipChildren(false);
        this.OOA6hdeuvCS = new HashMap();
        this.EljAMC1QTz = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, g60> getHolderToLayoutNode() {
        return this.OOA6hdeuvCS;
    }

    public final HashMap<g60, Object> getLayoutNodeToHolder() {
        return this.EljAMC1QTz;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = this.OOA6hdeuvCS.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            o4.YmKjaVtbfp5Z();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            t10.GWasM1elztuh("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            t10.GWasM1elztuh("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Iterator it = this.OOA6hdeuvCS.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            o4.YmKjaVtbfp5Z();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            g60 g60Var = (g60) this.OOA6hdeuvCS.get(childAt);
            if (childAt.isLayoutRequested() && g60Var != null) {
                g60.MItybXapHX(g60Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
