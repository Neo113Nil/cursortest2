package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;

/* loaded from: classes.dex */
public abstract class xkp0 {
    public static int a(RecyclerView.k kVar, d0 d0Var, View view, View view2, RecyclerView.e eVar) {
        if (eVar.d0() == 0 || kVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition());
        ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
        return m810.b((Math.max(0, min) * (Math.abs(d0Var.b(view2) - d0Var.e(view)) / (Math.abs(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() - ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition()) + 1))) + (d0Var.k() - d0Var.e(view)));
    }
}
