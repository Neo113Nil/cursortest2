package defpackage;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h3k extends bpn {
    public RecyclerView a;
    public final x1r b = new x1r(this);
    public cxj c;
    public cxj d;

    public static int c(View view, gc9 gc9Var) {
        return ((gc9Var.c(view) / 2) + gc9Var.e(view)) - ((gc9Var.o() / 2) + gc9Var.n());
    }

    public static View d(yon yonVar, gc9 gc9Var) {
        int Q = yonVar.Q();
        View view = null;
        if (Q == 0) {
            return null;
        }
        int o = (gc9Var.o() / 2) + gc9Var.n();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < Q; i2++) {
            View P = yonVar.P(i2);
            int abs = Math.abs(((gc9Var.c(P) / 2) + gc9Var.e(P)) - o);
            if (abs < i) {
                view = P;
                i = abs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        x1r x1rVar = this.b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.P0;
            if (arrayList != null) {
                arrayList.remove(x1rVar);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                xq0.q("An instance of OnFlingListener already set.");
                return;
            }
            this.a.t(x1rVar);
            this.a.setOnFlingListener(this);
            new Scroller(this.a.getContext(), new DecelerateInterpolator());
            i();
        }
    }

    public int[] b(yon yonVar, View view) {
        int[] iArr = new int[2];
        if (yonVar.x()) {
            iArr[0] = c(view, g(yonVar));
        } else {
            iArr[0] = 0;
        }
        if (yonVar.y()) {
            iArr[1] = c(view, h(yonVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(yon yonVar) {
        if (yonVar.y()) {
            return d(yonVar, h(yonVar));
        }
        if (yonVar.x()) {
            return d(yonVar, g(yonVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(yon yonVar, int i, int i2) {
        PointF c;
        int a0 = yonVar.a0();
        if (a0 != 0) {
            View view = null;
            gc9 h = yonVar.y() ? h(yonVar) : yonVar.x() ? g(yonVar) : null;
            if (h != null) {
                int Q = yonVar.Q();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < Q; i5++) {
                    View P = yonVar.P(i5);
                    if (P != null) {
                        int c2 = c(P, h);
                        if (c2 <= 0 && c2 > i4) {
                            view2 = P;
                            i4 = c2;
                        }
                        if (c2 >= 0 && c2 < i3) {
                            view = P;
                            i3 = c2;
                        }
                    }
                }
                boolean z2 = !yonVar.x() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return yon.f0(view);
                }
                if (!z2 && view2 != null) {
                    return yon.f0(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int f0 = yon.f0(view);
                    int a02 = yonVar.a0();
                    if ((yonVar instanceof jpn) && (c = ((jpn) yonVar).c(a02 - 1)) != null && (c.x < 0.0f || c.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = f0 + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < a0) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final gc9 g(yon yonVar) {
        cxj cxjVar = this.d;
        if (cxjVar == null || ((yon) cxjVar.b) != yonVar) {
            this.d = new cxj(yonVar, 0);
        }
        return this.d;
    }

    public final gc9 h(yon yonVar) {
        cxj cxjVar = this.c;
        if (cxjVar == null || ((yon) cxjVar.b) != yonVar) {
            this.c = new cxj(yonVar, 1);
        }
        return this.c;
    }

    public final void i() {
        yon layoutManager;
        View e;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (e = e(layoutManager)) == null) {
            return;
        }
        int[] b = b(layoutManager, e);
        int i = b[0];
        if (i == 0 && b[1] == 0) {
            return;
        }
        this.a.B0(i, b[1], false);
    }
}
