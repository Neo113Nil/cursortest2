package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class xj80 extends RecyclerView.d {
    public final i3y a;
    public final i3y b;

    public xj80(Context context) {
        qd00 qd00Var = new qd00(context, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = a.b(lazyThreadSafetyMode, qd00Var);
        this.b = a.b(lazyThreadSafetyMode, new qd00(context, 6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        i3y i3yVar = this.b;
        if (childAdapterPosition == 0) {
            rect.left = ((Number) i3yVar.getValue()).intValue();
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        i3y i3yVar2 = this.a;
        if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
            rect.left = ((Number) i3yVar2.getValue()).intValue();
        } else {
            rect.right = ((Number) i3yVar.getValue()).intValue();
            rect.left = ((Number) i3yVar2.getValue()).intValue();
        }
    }
}
