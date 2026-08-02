package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes11.dex */
public final class ray extends RecyclerView.g {
    public final o9y a;
    public final String b;
    public final LinearLayoutManager c;

    public ray(String str, o9y o9yVar, LinearLayoutManager linearLayoutManager) {
        this.a = o9yVar;
        this.b = str;
        this.c = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int K1 = this.c.K1();
        x0 findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(K1);
        this.a.b.put(this.b, new p9y(K1, findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.a.getLeft() : 0));
    }
}
