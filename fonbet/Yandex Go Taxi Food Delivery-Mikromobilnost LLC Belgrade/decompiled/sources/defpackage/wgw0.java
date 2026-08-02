package defpackage;

import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class wgw0 extends RecyclerView.g {
    public final /* synthetic */ pgw0 a;

    public wgw0(pgw0 pgw0Var) {
        this.a = pgw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(recyclerView);
        if ((a == null ? false : a.a.q(8)) && i2 != 0) {
            recyclerView.post(new ce0(recyclerView, 15));
        }
        x4e.z(recyclerView.computeVerticalScrollOffset(), this.a.a, null);
    }
}
