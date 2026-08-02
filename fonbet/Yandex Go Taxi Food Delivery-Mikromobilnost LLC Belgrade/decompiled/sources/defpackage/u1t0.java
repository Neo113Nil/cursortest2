package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import just.adapter.scroll.ScrollDirection;
import just.adapter.snapping.c;

/* loaded from: classes9.dex */
public final class u1t0 extends RecyclerView.f {
    public final /* synthetic */ c a;

    public u1t0(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean a(int i, int i2) {
        RecyclerView.e layoutManager;
        c cVar = this.a;
        RecyclerView recyclerView = cVar.j;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (!layoutManager.I()) {
                i = i2;
            }
            float f = cVar.c * cVar.f * 386.0878f * 0.84f;
            double log = Math.log((Math.abs(i) * 0.35f) / f);
            double d = e2t0.a;
            cVar.g = (int) (Math.signum(i) * Math.exp((d / (d - 1.0d)) * log) * f);
            cVar.h = true;
            ScrollDirection f0 = tje.f0(i);
            int i3 = cVar.g;
            q1t0 q1t0Var = cVar.l;
            o1t0 b = q1t0Var.b(layoutManager, f0, i3);
            if (b != null) {
                int[] a = q1t0Var.a(layoutManager, f0, b.b());
                if (a[0] != 0 || a[1] != 0) {
                    t1t0 e = b.a().e();
                    if (e != null) {
                        cVar.e.c(e);
                    }
                    RecyclerView recyclerView2 = cVar.j;
                    if (recyclerView2 != null) {
                        recyclerView2.smoothScrollBy(a[0], a[1]);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
