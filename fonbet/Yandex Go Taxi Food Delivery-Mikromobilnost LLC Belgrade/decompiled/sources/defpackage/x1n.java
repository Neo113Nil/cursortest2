package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class x1n extends y69 {
    public RecyclerView h;
    public boolean k;
    public boolean l;
    public tls n;
    public tls o;
    public int i = -1;
    public int j = -1;
    public final w1n m = new w1n(this);

    @Override // androidx.recyclerview.widget.e1
    public final void b(RecyclerView recyclerView) {
        this.h = recyclerView;
        if (recyclerView != null) {
            w1n w1nVar = this.m;
            recyclerView.removeOnScrollListener(w1nVar);
            recyclerView.addOnScrollListener(w1nVar);
        }
        super.b(recyclerView);
    }
}
