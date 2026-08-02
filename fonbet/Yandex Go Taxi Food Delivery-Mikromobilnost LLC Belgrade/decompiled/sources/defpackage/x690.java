package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class x690 extends RecyclerView.g {
    public final u290 a;

    public x690(u290 u290Var) {
        this.a = u290Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int K1 = i < 0 ? linearLayoutManager.K1() : linearLayoutManager.M1();
            View X = linearLayoutManager.X(K1);
            if (X != null) {
                if (Math.abs(X.getX()) <= recyclerView.getWidth() / 2 || i == 0) {
                    this.a.invoke(Integer.valueOf(K1));
                }
            }
        }
    }
}
