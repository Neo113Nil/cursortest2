package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class w1n extends RecyclerView.g {
    public final /* synthetic */ x1n a;

    public w1n(x1n x1nVar) {
        this.a = x1nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        View e;
        super.onScrollStateChanged(recyclerView, i);
        boolean z = i == 0;
        x1n x1nVar = this.a;
        if (z && x1nVar.k) {
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            int viewLayoutPosition = (layoutManager == null || (e = x1nVar.e(layoutManager)) == null) ? -1 : ((RecyclerView.LayoutParams) e.getLayoutParams()).getViewLayoutPosition();
            if (viewLayoutPosition != x1nVar.i && viewLayoutPosition != -1) {
                tls tlsVar = x1nVar.o;
                if (tlsVar != null) {
                    tlsVar.invoke(Integer.valueOf(viewLayoutPosition));
                }
                x1nVar.i = viewLayoutPosition;
            }
        }
        x1nVar.k = !z;
        if (z) {
            x1nVar.l = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View e;
        x1n x1nVar = this.a;
        if (x1nVar.l) {
            return;
        }
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        int viewLayoutPosition = (layoutManager == null || (e = x1nVar.e(layoutManager)) == null) ? -1 : ((RecyclerView.LayoutParams) e.getLayoutParams()).getViewLayoutPosition();
        if (viewLayoutPosition == x1nVar.j || viewLayoutPosition == -1) {
            return;
        }
        tls tlsVar = x1nVar.n;
        if (tlsVar != null) {
            tlsVar.invoke(Integer.valueOf(viewLayoutPosition));
        }
        x1nVar.j = viewLayoutPosition;
    }
}
