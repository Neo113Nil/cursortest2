package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class rxv extends RecyclerView.d {
    public final int a;

    public rxv(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount >= 2 && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1) {
            boolean z = childAdapterPosition == 0;
            boolean z2 = childAdapterPosition == itemCount - 1;
            int i = this.a;
            rect.left = z ? 0 : i / 2;
            rect.right = z2 ? 0 : i / 2;
        }
    }
}
