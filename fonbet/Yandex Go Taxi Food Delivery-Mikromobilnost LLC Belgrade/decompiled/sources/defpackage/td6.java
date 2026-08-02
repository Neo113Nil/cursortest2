package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class td6 extends RecyclerView.d {
    public final int a = (int) uh6.o(8.0f);
    public final int b = (int) uh6.o(12.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition == itemCount - 1) {
            int i = this.a;
            rect.left = i;
            rect.right = i;
            rect.bottom = this.b;
        }
    }
}
