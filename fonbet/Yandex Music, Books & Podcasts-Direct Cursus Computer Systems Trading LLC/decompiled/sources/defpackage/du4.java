package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes3.dex */
public final class du4 implements wp0 {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public du4(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.wp0
    public final void a(AppBarLayout appBarLayout, int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        bu4 bu4Var = collapsingToolbarLayout.m;
        bu4 bu4Var2 = collapsingToolbarLayout.l;
        collapsingToolbarLayout.B = i;
        kqv kqvVar = collapsingToolbarLayout.E;
        int d = kqvVar != null ? kqvVar.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            cu4 cu4Var = (cu4) childAt.getLayoutParams();
            nfu b = CollapsingToolbarLayout.b(childAt);
            int i3 = cu4Var.a;
            if (i3 == 1) {
                b.b(hyf.y(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((cu4) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round((-i) * cu4Var.b));
            }
        }
        collapsingToolbarLayout.d();
        if (collapsingToolbarLayout.s != null && d > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
        int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        int i4 = collapsingToolbarLayout.B + minimumHeight;
        float f = minimumHeight;
        float abs = Math.abs(i) / f;
        float f2 = scrimVisibleHeightTrigger / f;
        float min = Math.min(1.0f, f2);
        bu4Var2.d = min;
        bu4Var2.e = su4.e(1.0f, min, 0.5f, min);
        bu4Var2.f = i4;
        bu4Var2.A(abs);
        float min2 = Math.min(1.0f, f2);
        bu4Var.d = min2;
        bu4Var.e = su4.e(1.0f, min2, 0.5f, min2);
        bu4Var.f = i4;
        bu4Var.A(abs);
    }
}
