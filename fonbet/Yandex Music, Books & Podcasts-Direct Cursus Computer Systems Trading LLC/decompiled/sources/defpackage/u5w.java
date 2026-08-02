package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class u5w extends gc9 {
    public final RecyclerView d;
    public final boolean e;

    public u5w(RecyclerView recyclerView, boolean z, int i, cc9 cc9Var, cb9 cb9Var) {
        super(i, cc9Var, cb9Var);
        this.d = recyclerView;
        this.e = z;
    }

    @Override // defpackage.gc9
    public final Float i(int i) {
        View L;
        yon layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || (L = layoutManager.L(i)) == null) {
            return null;
        }
        return Float.valueOf(this.e ? L.getWidth() : L.getHeight());
    }
}
