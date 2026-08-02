package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class uyu extends RecyclerView.d {
    public final int a;

    public uyu(int i) {
        this.a = i;
    }

    public static boolean f(h0v h0vVar) {
        if ((h0vVar instanceof szu) || (h0vVar instanceof f0v)) {
            return false;
        }
        if ((h0vVar instanceof uzu) || (h0vVar instanceof xzu) || (h0vVar instanceof zzu) || (h0vVar instanceof b0v) || jl40.l(h0vVar, d0v.a)) {
            return true;
        }
        w511.b();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        super.c(rect, view, recyclerView, kVar);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            bc31 bc31Var = adapter2 instanceof bc31 ? (bc31) adapter2 : null;
            if (bc31Var == null) {
                return;
            }
            h0v h0vVar = (h0v) bc31Var.getItem(childAdapterPosition);
            int i = childAdapterPosition + 1;
            h0v h0vVar2 = i < itemCount ? (h0v) bc31Var.getItem(i) : null;
            if (h0vVar2 != null && f(h0vVar) && f(h0vVar2)) {
                rect.bottom = this.a;
            }
        }
    }
}
