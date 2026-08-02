package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class pq2 extends h2k {
    public SparseArray c;
    public final /* synthetic */ xo9 d;

    public pq2(xo9 xo9Var) {
        this.d = xo9Var;
    }

    @Override // defpackage.h2k
    public final void a(lgu lguVar, int i, Object obj) {
        if (wyf.N(this.d.d)) {
            i = (b() - i) - 1;
        }
        ViewGroup viewGroup = (ViewGroup) obj;
        rq2 rq2Var = (rq2) this.d.g.remove(viewGroup);
        ViewGroup viewGroup2 = rq2Var.d;
        if (viewGroup2 != null) {
            xo9 xo9Var = rq2Var.e;
            xo9Var.x.remove(viewGroup2);
            gc8 gc8Var = xo9Var.q.a;
            synchronized (d51.l) {
            }
            Continuation continuation = null;
            if (qht.a.a()) {
                int i2 = 0;
                while (i2 < viewGroup2.getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt == null) {
                        rj7.m();
                        return;
                    } else {
                        yd5.R(gc8Var.getReleaseViewVisitor$div_release(), childAt);
                        i2 = i3;
                    }
                }
                viewGroup2.removeAllViews();
            } else {
                dq7 dq7Var = ca8.a;
                x97.D(j5h.a, new seg(continuation, viewGroup2, gc8Var, 23));
            }
            rq2Var.d = null;
        }
        this.d.h.remove(Integer.valueOf(i));
        lguVar.removeView(viewGroup);
    }

    @Override // defpackage.h2k
    public final int b() {
        n nVar = this.d.m;
        if (nVar == null) {
            return 0;
        }
        return nVar.m().size();
    }
}
