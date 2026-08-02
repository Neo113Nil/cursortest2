package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.x0;
import java.util.List;

/* loaded from: classes10.dex */
public class qa3 extends RecyclerView.Adapter {
    public final s70 a;
    public final c b;

    public qa3(zij zijVar) {
        s70 s70Var = new s70();
        if (zijVar == null) {
            ny61.t("ItemCallback is null");
            throw null;
        }
        this.b = new c(this, zijVar);
        this.a = s70Var;
    }

    public final List f() {
        return this.b.f;
    }

    public void g(List list) {
        this.b.b(list, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.a.c(i, this.b.f);
    }

    public void h(List list, Runnable runnable) {
        this.b.b(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        this.a.d(this.b.f, i, x0Var, null);
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        this.a.d(this.b.f, i, x0Var, list);
    }

    public qa3(zij zijVar, m70... m70VarArr) {
        if (zijVar != null) {
            this.b = new c(this, zijVar);
            this.a = new s70(m70VarArr);
        } else {
            ny61.t("ItemCallback is null");
            throw null;
        }
    }

    public qa3(lb7 lb7Var, m70... m70VarArr) {
        this.b = new c(new b(this), lb7Var);
        this.a = new s70(m70VarArr);
    }
}
