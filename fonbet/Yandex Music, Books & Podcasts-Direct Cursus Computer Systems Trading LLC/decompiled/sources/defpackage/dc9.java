package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public final class dc9 extends dgu {
    public final eb9 a;
    public final List b;
    public final e23 c;
    public final RecyclerView d;
    public final oc9 e;
    public int f = -1;
    public final gc8 g;
    public int h;

    public dc9(eb9 eb9Var, fb9 fb9Var, e23 e23Var, RecyclerView recyclerView, oc9 oc9Var) {
        this.a = eb9Var;
        this.b = fb9Var;
        this.c = e23Var;
        this.d = recyclerView;
        this.e = oc9Var;
        gc8 gc8Var = e23Var.a;
        this.g = gc8Var;
        gc8Var.getConfig().getClass();
    }

    @Override // defpackage.dgu
    public final void a(int i) {
        if (i == 0) {
            e();
        }
    }

    @Override // defpackage.dgu
    public final void b(int i, float f, int i2) {
        yon layoutManager = this.d.getLayoutManager();
        int i3 = (layoutManager != null ? layoutManager.n : 0) / 20;
        int i4 = this.h + i2;
        this.h = i4;
        if (i4 > i3) {
            this.h = 0;
            e();
        }
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        int i2;
        e();
        int i3 = this.f;
        if (i == i3) {
            return;
        }
        oc9 oc9Var = this.e;
        gc8 gc8Var = this.g;
        if (i3 != -1) {
            gc8Var.Y(oc9Var);
        }
        if (i == -1) {
            this.f = i;
            return;
        }
        int i4 = this.f;
        List list = this.b;
        if (i4 != -1) {
            i2 = i;
            gc8Var.getDiv2Component$div_release().i().g(gc8Var, ((k79) list.get(i)).b, this.a, i2, i > i4 ? "next" : "back");
        } else {
            i2 = i;
        }
        jc8 jc8Var = ((k79) list.get(i2)).a;
        if (vq1.V(jc8Var.d())) {
            gc8Var.u(oc9Var, jc8Var);
        }
        this.f = i2;
    }

    public final void d() {
        int i = 0;
        while (true) {
            RecyclerView recyclerView = this.d;
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int Y = RecyclerView.Y(childAt);
            if (Y == -1) {
                return;
            }
            k79 k79Var = (k79) this.b.get(Y);
            w1a A = this.g.getDiv2Component$div_release().A();
            e23 a = this.c.a(k79Var.b);
            jc8 jc8Var = k79Var.a;
            A.getClass();
            w1a.f(a, childAt, jc8Var, new r1a(A, a, 1));
            i = i2;
        }
    }

    public final void e() {
        int i = 0;
        int i2 = 0;
        while (true) {
            RecyclerView recyclerView = this.d;
            if (!(i2 < recyclerView.getChildCount())) {
                if (i > 0) {
                    d();
                    return;
                } else if (!wyf.K(recyclerView) || recyclerView.isLayoutRequested()) {
                    recyclerView.addOnLayoutChangeListener(new f27(3, this));
                    return;
                } else {
                    d();
                    return;
                }
            }
            int i3 = i2 + 1;
            if (recyclerView.getChildAt(i2) == null) {
                rj7.m();
                return;
            }
            i++;
            if (i < 0) {
                u75.m();
                throw null;
            }
            i2 = i3;
        }
    }
}
