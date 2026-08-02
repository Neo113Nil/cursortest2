package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class xu6 extends RecyclerView.d {
    public final int a;

    public xu6(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) >= 2 && recyclerView.getChildAdapterPosition(view) != -1) {
            rect.bottom = this.a;
        }
    }
}
