package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.w;

/* loaded from: classes9.dex */
public final class y6e extends w {
    public final int p;
    public final float q;
    public final int r;
    public final int s;
    public final int t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6e(Context context) {
        super(context);
        int t = rzo.t(100, context);
        int t2 = rzo.t(10, context);
        int t3 = rzo.t(1000, context);
        this.p = 500;
        this.q = rzo.t(500, context) / 500.0f;
        this.r = t;
        this.s = t2;
        this.t = t3;
    }

    @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.RecyclerView.j
    public final void f() {
        Object obj = this.c;
        gki0 j = obj instanceof gki0 ? (gki0) obj : obj instanceof LinearLayoutManager ? h2b1.j((LinearLayoutManager) obj) : null;
        int a = j != null ? j.a() : 0;
        if (a == -1) {
            return;
        }
        ylt0 r = obj instanceof ylt0 ? (ylt0) obj : obj instanceof GridLayoutManager ? qtb1.r((GridLayoutManager) obj) : null;
        int m = r != null ? r.getM() / Math.max(r.o(a), 1) : 1;
        View b = b(a);
        Integer valueOf = b != null ? Integer.valueOf(b.getHeight()) : null;
        if (valueOf == null || valueOf.intValue() < this.s || valueOf.intValue() > this.t) {
            valueOf = Integer.valueOf(this.r);
        }
        this.u = Math.abs(((valueOf.intValue() * ((a - this.a) - 1)) / m) + (b != null ? (int) b.getY() : 0));
    }

    @Override // androidx.recyclerview.widget.w
    public final int n(int i) {
        return Math.min(super.n(i), (int) (i / this.q));
    }

    @Override // androidx.recyclerview.widget.w
    public final int o(int i) {
        return (int) ((this.p * i) / this.u);
    }

    @Override // androidx.recyclerview.widget.w
    public final int p() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.w
    public final int q() {
        return -1;
    }
}
