package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class x09 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y09 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public x09(int i, y09 y09Var, int i2, int i3) {
        this.a = i;
        this.b = y09Var;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = this.c;
        int i10 = this.a;
        y09 y09Var = this.b;
        if (i10 == 0) {
            if (y09Var.s() != 0 || !wyf.N(y09Var.getF())) {
                i9 = -i9;
            }
            y09Var.getF().scrollBy(i9, i9);
            return;
        }
        y09Var.getF().scrollBy(-y09Var.getF().getScrollX(), -y09Var.getF().getScrollY());
        yon layoutManager = y09Var.getF().getLayoutManager();
        View L = layoutManager != null ? layoutManager.L(i10) : null;
        while (L == null && (y09Var.getF().canScrollVertically(1) || y09Var.getF().canScrollHorizontally(1))) {
            yon layoutManager2 = y09Var.getF().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.R0();
            }
            yon layoutManager3 = y09Var.getF().getLayoutManager();
            L = layoutManager3 != null ? layoutManager3.L(i10) : null;
            if (L != null) {
                break;
            } else {
                y09Var.getF().scrollBy(y09Var.getF().getWidth(), y09Var.getF().getHeight());
            }
        }
        if (L != null) {
            int D = ouj.D(this.d);
            if (D == 0) {
                int d = y09Var.d(L) - i9;
                if (wyf.N(y09Var.getF())) {
                    d = -d;
                }
                y09Var.getF().scrollBy(d, d);
                return;
            }
            if (D != 1) {
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            y09Var.getF().getLocationOnScreen(iArr2);
            L.getLocationOnScreen(iArr);
            y09Var.getF().scrollBy(((L.getWidth() - y09Var.getF().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((L.getHeight() - y09Var.getF().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }
}
