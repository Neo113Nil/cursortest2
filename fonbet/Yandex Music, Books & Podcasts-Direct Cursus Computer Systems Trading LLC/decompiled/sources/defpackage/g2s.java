package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes5.dex */
public final class g2s implements wp0 {
    public final View a;

    public g2s(View view) {
        this.a = view;
    }

    @Override // defpackage.wp0
    public final void a(AppBarLayout appBarLayout, int i) {
        int top = appBarLayout.getTop() + appBarLayout.getTotalScrollRange();
        View view = this.a;
        if (top != view.getPaddingBottom()) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), top);
            view.requestLayout();
        }
    }
}
