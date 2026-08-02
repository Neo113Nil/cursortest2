package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;

/* loaded from: classes5.dex */
public final class rji0 {
    public final RecyclerShadowController$Type a;
    public RecyclerView b;
    public View c;
    public Boolean d;
    public boolean g;
    public final qji0 e = new qji0(this);
    public final yln f = new yln(17, this);
    public final pji0 h = new pji0(this);

    public rji0(RecyclerShadowController$Type recyclerShadowController$Type) {
        this.a = recyclerShadowController$Type;
    }

    public final void a(View view, RecyclerView recyclerView) {
        this.b = recyclerView;
        this.c = view;
        this.g = false;
        this.d = null;
        recyclerView.addOnScrollListener(this.e);
        recyclerView.addOnLayoutChangeListener(this.f);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.h);
        }
    }

    public final void b() {
        boolean canScrollVertically;
        RecyclerView recyclerView = this.b;
        View view = this.c;
        if (recyclerView == null || view == null) {
            return;
        }
        int i = oji0.a[this.a.ordinal()];
        if (i == 1) {
            canScrollVertically = recyclerView.canScrollVertically(1);
        } else if (i == 2) {
            canScrollVertically = recyclerView.canScrollVertically(-1);
        } else if (i == 3) {
            canScrollVertically = recyclerView.canScrollHorizontally(xw31.n(recyclerView.getContext()) ? 1 : -1);
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            canScrollVertically = recyclerView.canScrollHorizontally(xw31.n(recyclerView.getContext()) ? -1 : 1);
        }
        View view2 = this.c;
        if (view2 == null || Boolean.valueOf(canScrollVertically).equals(this.d)) {
            return;
        }
        this.d = Boolean.valueOf(canScrollVertically);
        if (canScrollVertically) {
            cma1.b(1.0f, view2);
        } else {
            cma1.b(0.0f, view2);
        }
    }

    public final void c() {
        ViewPropertyAnimator animate;
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.e);
        }
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeOnLayoutChangeListener(this.f);
        }
        RecyclerView recyclerView3 = this.b;
        if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(this.h);
        }
        View view = this.c;
        if (view != null && (animate = view.animate()) != null) {
            animate.cancel();
        }
        this.b = null;
        this.c = null;
    }
}
