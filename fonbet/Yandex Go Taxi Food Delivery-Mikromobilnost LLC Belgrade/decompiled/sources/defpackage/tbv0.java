package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.SuggestsGroupView;

/* loaded from: classes4.dex */
public final class tbv0 extends RecyclerView.d {
    public final qa3 a;

    public tbv0(qa3 qa3Var) {
        this.a = qa3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        sbv0 sbv0Var;
        int i;
        super.c(rect, view, recyclerView, kVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Integer valueOf = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition == -1) {
            valueOf = null;
        }
        if (valueOf == null || valueOf.intValue() == scc.f(this.a.b.f)) {
            return;
        }
        sbv0Var = SuggestsGroupView.Companion;
        sbv0Var.getClass();
        i = SuggestsGroupView.SPACE_DECORATION_PX;
        rect.right = i;
    }
}
