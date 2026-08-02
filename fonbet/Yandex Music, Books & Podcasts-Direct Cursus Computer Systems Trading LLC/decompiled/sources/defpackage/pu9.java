package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public final class pu9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ gc8 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ iu9 d;
    public final /* synthetic */ xzb e;
    public final /* synthetic */ qu9 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ tqn h;
    public final /* synthetic */ or0 i;
    public final /* synthetic */ ku9 j;
    public final /* synthetic */ View k;
    public final /* synthetic */ e23 l;
    public final /* synthetic */ jc8 m;

    public pu9(gc8 gc8Var, View view, View view2, iu9 iu9Var, xzb xzbVar, qu9 qu9Var, boolean z, tqn tqnVar, or0 or0Var, ku9 ku9Var, View view3, e23 e23Var, jc8 jc8Var) {
        this.a = gc8Var;
        this.b = view;
        this.c = view2;
        this.d = iu9Var;
        this.e = xzbVar;
        this.f = qu9Var;
        this.g = z;
        this.h = tqnVar;
        this.i = or0Var;
        this.j = ku9Var;
        this.k = view3;
        this.l = e23Var;
        this.m = jc8Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        qu9 qu9Var = this.f;
        efb efbVar = qu9Var.c;
        view.removeOnLayoutChangeListener(this);
        Rect rect = new Rect();
        gc8 gc8Var = this.a;
        gc8Var.getWindowVisibleDisplayFrame(rect);
        iu9 iu9Var = this.d;
        xzb xzbVar = this.e;
        View view2 = this.b;
        Point A = xv.A(view2, this.c, iu9Var, xzbVar);
        int min = Math.min(view2.getWidth(), rect.width());
        int min2 = Math.min(view2.getHeight(), rect.height());
        if (min < view2.getWidth()) {
            efbVar.a(gc8Var.getDivData(), gc8Var.getDataTag()).e(new Throwable("Tooltip width > screen size, width was changed"));
        }
        if (min2 < view2.getHeight()) {
            efbVar.a(gc8Var.getDivData(), gc8Var.getDataTag()).e(new Throwable("Tooltip height > screen size, height was changed"));
        }
        boolean z = this.g;
        or0 or0Var = this.i;
        ku9 ku9Var = this.j;
        if (z) {
            Point point = this.h.a ? new Point(0, 0) : new Point(rect.left, rect.top);
            or0Var.update(0, 0, -1, -1);
            ku9.f(ku9Var.getTooltipView(), A.x - point.x, A.y - point.y, min, min2);
            View view3 = this.k;
            if (view3 != null) {
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                Point point2 = new Point(iArr[0], iArr[1]);
                ku9.f(ku9Var.getBringToTopView(), point2.x - point.x, point2.y - point.y, view3.getWidth(), view3.getHeight());
            }
        } else {
            or0Var.update(A.x, A.y, min, min2);
        }
        w1a w1aVar = qu9Var.a;
        e23 e23Var = this.l;
        gc8 gc8Var2 = e23Var.a;
        xzb xzbVar2 = e23Var.b;
        jc8 jc8Var = this.m;
        w1a.i(w1aVar, gc8Var2, xzbVar2, null, jc8Var);
        w1a.i(w1aVar, e23Var.a, xzbVar2, ku9Var, jc8Var);
    }
}
