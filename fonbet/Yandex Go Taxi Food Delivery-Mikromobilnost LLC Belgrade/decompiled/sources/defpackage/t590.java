package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class t590 extends RecyclerView.d {
    public final int a;

    public t590(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 1 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1 && childAdapterPosition < itemCount - 1) {
            boolean n = xw31.n(recyclerView.getContext());
            int i = this.a;
            if (n) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }
}
