package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class yzs0 extends w {
    public final zzs0 p;
    public final lz40 q;

    public yzs0(RecyclerView recyclerView, zzs0 zzs0Var, n0 n0Var) {
        super(recyclerView.getContext());
        this.p = zzs0Var;
        this.q = n0Var;
        this.a = zzs0Var.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final PointF a(int i) {
        if (c() == 0) {
            return null;
        }
        return this.p.b(i);
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void g() {
        super.g();
        this.q.g(Integer.valueOf(this.p.a));
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(int i, View view) {
        return this.p.a(view);
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(int i) {
        return Math.max(super.o(i), 120);
    }
}
