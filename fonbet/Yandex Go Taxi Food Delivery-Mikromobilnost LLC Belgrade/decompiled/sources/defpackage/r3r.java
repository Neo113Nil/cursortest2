package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.u0;

/* loaded from: classes9.dex */
public final class r3r extends RecyclerView.d {
    public final /* synthetic */ t3r a;

    public r3r(t3r t3rVar) {
        this.a = t3rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        PointF d;
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == 0) {
            return;
        }
        t3r t3rVar = this.a;
        if (t3rVar.d == null) {
            aul aulVar = (aul) t3rVar.a.invoke(view);
            u3r u3rVar = aulVar != null ? aulVar.j : null;
            if (u3rVar != null) {
                d0 a = t3rVar.a(layoutManager);
                Integer valueOf = a != null ? Integer.valueOf(a.l()) : null;
                t3rVar.d = valueOf != null ? Integer.valueOf(valueOf.intValue() - rzo.t(u3rVar.getA(), view.getContext())) : 0;
            }
        }
        if (((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition() == layoutManager.getItemCount() - 1) {
            Integer num = t3rVar.d;
            int intValue = num != null ? num.intValue() : 0;
            if (layoutManager.J()) {
                rect.bottom = intValue;
                return;
            }
            if (layoutManager.I()) {
                int itemCount = layoutManager.getItemCount();
                if (!(layoutManager instanceof u0) || (d = ((u0) layoutManager).d(itemCount - 1)) == null || (d.x >= 0.0f && d.y >= 0.0f)) {
                    rect.right = intValue;
                } else {
                    rect.left = intValue;
                }
            }
        }
    }
}
