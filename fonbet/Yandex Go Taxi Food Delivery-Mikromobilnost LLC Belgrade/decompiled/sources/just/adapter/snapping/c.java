package just.adapter.snapping;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.cip0;
import defpackage.jl40;
import defpackage.kn2;
import defpackage.lq80;
import defpackage.ny61;
import defpackage.o1t0;
import defpackage.q1t0;
import defpackage.t1t0;
import defpackage.u1t0;
import defpackage.w1t0;
import just.adapter.scroll.ScrollDirection;

/* loaded from: classes9.dex */
public final class c {
    public final kn2 a;
    public final kn2 b;
    public final float c;
    public final lq80 d;
    public final b e;
    public float f;
    public int g;
    public boolean h;
    public boolean i;
    public RecyclerView j;
    public final cip0 k;
    public final q1t0 l;
    public final u1t0 m;
    public final w1t0 n;

    public c(kn2 kn2Var, kn2 kn2Var2, b bVar) {
        float scrollFriction = ViewConfiguration.getScrollFriction();
        lq80 lq80Var = new lq80();
        this.a = kn2Var;
        this.b = kn2Var2;
        this.c = scrollFriction;
        this.d = lq80Var;
        this.e = bVar;
        this.f = -1.0f;
        this.k = new cip0();
        this.l = new q1t0(kn2Var, kn2Var2, lq80Var);
        this.m = new u1t0(this);
        this.n = new w1t0(this);
    }

    public static final void a(c cVar) {
        RecyclerView.e layoutManager;
        ScrollDirection scrollDirection;
        o1t0 b;
        q1t0 q1t0Var = cVar.l;
        RecyclerView recyclerView = cVar.j;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (b = q1t0Var.b(layoutManager, (scrollDirection = ScrollDirection.IGNORE), 0)) == null) {
            return;
        }
        int[] a = q1t0Var.a(layoutManager, scrollDirection, b.b());
        if (a[0] == 0 && a[1] == 0) {
            return;
        }
        t1t0 e = b.a().e();
        if (e != null) {
            cVar.e.c(e);
        }
        RecyclerView recyclerView2 = cVar.j;
        if (recyclerView2 != null) {
            recyclerView2.smoothScrollBy(a[0], a[1]);
        }
    }

    public final void b(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        if (jl40.l(this.j, orientationAwareRecyclerView)) {
            return;
        }
        RecyclerView recyclerView = this.j;
        w1t0 w1t0Var = this.n;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(w1t0Var);
            recyclerView.setOnFlingListener(null);
        }
        this.j = orientationAwareRecyclerView;
        if (orientationAwareRecyclerView != null) {
            if (this.f == -1.0f) {
                this.f = orientationAwareRecyclerView.getContext().getResources().getDisplayMetrics().density * 160.0f;
            }
            orientationAwareRecyclerView.addOnScrollListener(w1t0Var);
            if (orientationAwareRecyclerView.getOnFlingListener() != null) {
                ny61.r("An instance of OnFlingListener already set.");
                return;
            }
            orientationAwareRecyclerView.setOnFlingListener(this.m);
        }
        b bVar = this.e;
        bVar.getClass();
        bVar.c = SnappingCallbacksHelper$State.TERMINAL;
        bVar.d = null;
    }
}
