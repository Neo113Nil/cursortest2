package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class q6 extends RecyclerView.Adapter {
    public final s70 a;
    public Object b;

    public q6() {
        this(new s70());
    }

    public final void f(List list) {
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.a.c(i, this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        this.a.d(this.b, i, x0Var, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.a.e(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(x0 x0Var) {
        this.a.f(x0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        this.a.g(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        this.a.h(x0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        this.a.i(x0Var);
    }

    public q6(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        this.a.d(this.b, i, x0Var, list);
    }
}
