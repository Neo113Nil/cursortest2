package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class tkw extends RecyclerView.d {
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || itemCount < 2 || childAdapterPosition >= itemCount - 1) {
            return;
        }
        if (xw31.n(recyclerView.getContext())) {
            rect.left = 16;
        } else {
            rect.right = 16;
        }
    }
}
