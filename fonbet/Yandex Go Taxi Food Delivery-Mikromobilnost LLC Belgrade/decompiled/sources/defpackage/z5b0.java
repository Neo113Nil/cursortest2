package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class z5b0 extends RecyclerView.g {
    public final /* synthetic */ a6b0 a;

    public z5b0(a6b0 a6b0Var) {
        this.a = a6b0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            a6b0.a(this.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        a6b0 a6b0Var = this.a;
        if (currentTimeMillis - a6b0Var.f >= 50) {
            a6b0Var.f = currentTimeMillis;
            a6b0.a(a6b0Var);
        }
    }
}
