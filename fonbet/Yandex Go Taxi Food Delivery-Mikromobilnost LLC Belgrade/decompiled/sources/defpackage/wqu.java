package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class wqu extends RecyclerView.d {
    public final int a;

    public wqu(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1 && childAdapterPosition < itemCount - 1) {
            boolean k = xw31.k(recyclerView.getContext());
            int i = this.a;
            if (k) {
                rect.right = i;
            } else {
                rect.left = i;
            }
        }
    }
}
