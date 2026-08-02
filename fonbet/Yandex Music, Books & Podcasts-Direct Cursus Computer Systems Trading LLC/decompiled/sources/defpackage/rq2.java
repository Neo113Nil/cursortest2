package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rq2 {
    public final ViewGroup a;
    public final xj9 b;
    public final int c;
    public ViewGroup d;
    public final /* synthetic */ xo9 e;

    public rq2(xo9 xo9Var, ViewGroup viewGroup, xj9 xj9Var, int i) {
        this.e = xo9Var;
        this.a = viewGroup;
        this.b = xj9Var;
        this.c = i;
    }

    public final void a() {
        if (this.d != null) {
            return;
        }
        xo9 xo9Var = this.e;
        ViewGroup viewGroup = this.a;
        xj9 xj9Var = this.b;
        int i = this.c;
        gc8 gc8Var = xo9Var.q.a;
        synchronized (d51.l) {
        }
        if (qht.a.a()) {
            int i2 = 0;
            while (i2 < viewGroup.getChildCount()) {
                int i3 = i2 + 1;
                View childAt = viewGroup.getChildAt(i2);
                if (childAt == null) {
                    rj7.m();
                    return;
                } else {
                    yd5.R(gc8Var.getReleaseViewVisitor$div_release(), childAt);
                    i2 = i3;
                }
            }
            viewGroup.removeAllViews();
        } else {
            dq7 dq7Var = ca8.a;
            x97.D(j5h.a, new seg((Continuation) null, viewGroup, gc8Var, 23));
        }
        jc8 jc8Var = xj9Var.a.a;
        View W = xo9Var.r.W(jc8Var, xj9Var.c);
        W.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xo9Var.s.b(xo9Var.q, W, jc8Var, xo9Var.a(i));
        xo9Var.x.put(viewGroup, new n1s(i, jc8Var, W));
        viewGroup.addView(W);
        this.d = viewGroup;
    }
}
