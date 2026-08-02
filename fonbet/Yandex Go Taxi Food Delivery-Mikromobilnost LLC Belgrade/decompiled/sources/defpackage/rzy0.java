package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class rzy0 extends RecyclerView.g {
    public final int a = 12;
    public final hbb0 b;

    public rzy0(hbb0 hbb0Var) {
        this.b = hbb0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0 || !recyclerView.canScrollVertically(1)) {
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int itemCount = linearLayoutManager.getItemCount();
            int M1 = linearLayoutManager.M1();
            if (itemCount <= 0 || M1 == -1 || itemCount - M1 > this.a) {
                return;
            }
            this.b.invoke();
        }
    }
}
