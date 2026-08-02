package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class f1a extends j66 {
    public final hh9 n;
    public final int o;
    public final DisplayMetrics p;

    public f1a(hh9 hh9Var, int i) {
        this.n = hh9Var;
        this.o = i;
        this.p = hh9Var.getResources().getDisplayMetrics();
    }

    @Override // defpackage.j66
    public final int U() {
        int o1;
        hh9 hh9Var = this.n;
        LinearLayoutManager y = up6.y(hh9Var);
        int i = this.o;
        if (y == null) {
            o1 = -1;
        } else {
            int D = ouj.D(i);
            if (D == 0) {
                LinearLayoutManager y2 = up6.y(hh9Var);
                Integer valueOf = y2 != null ? Integer.valueOf(y2.p) : null;
                o1 = (valueOf != null && valueOf.intValue() == 0) ? hh9Var.canScrollHorizontally(1) : (valueOf != null && valueOf.intValue() == 1) ? hh9Var.canScrollVertically(1) : false ? y.o1() : y.s1();
            } else {
                if (D != 1) {
                    b6e.s();
                    return 0;
                }
                o1 = y.o1();
            }
        }
        Integer valueOf2 = o1 != -1 ? Integer.valueOf(o1) : null;
        if (valueOf2 != null) {
            return valueOf2.intValue();
        }
        LinearLayoutManager y3 = up6.y(hh9Var);
        if (y3 == null) {
            return -1;
        }
        int D2 = ouj.D(i);
        if (D2 == 0) {
            return y3.r1();
        }
        if (D2 == 1) {
            return y3.t1();
        }
        b6e.s();
        return 0;
    }

    @Override // defpackage.j66
    public final List W(String str) {
        qon adapter = this.n.getAdapter();
        u09 u09Var = adapter instanceof u09 ? (u09) adapter : null;
        if (u09Var == null) {
            return c5b.a;
        }
        ArrayList u = u09Var.u();
        ArrayList arrayList = new ArrayList();
        Iterator it = u.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Integer valueOf = Intrinsics.d(((k79) next).a.d().getId(), str) ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.j66
    public final int X() {
        yon layoutManager = this.n.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.a0();
        }
        return 0;
    }

    @Override // defpackage.j66
    public final DisplayMetrics Y() {
        return this.p;
    }

    @Override // defpackage.j66
    public final int b0() {
        hh9 hh9Var = this.n;
        LinearLayoutManager y = up6.y(hh9Var);
        Integer valueOf = y != null ? Integer.valueOf(y.p) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? hh9Var.computeHorizontalScrollOffset() : hh9Var.computeVerticalScrollOffset();
    }

    @Override // defpackage.j66
    public final int c0() {
        return up6.M(this.n);
    }

    @Override // defpackage.j66
    public final void o0(int i, jk9 jk9Var, boolean z) {
        up6.N(this.n, i, jk9Var, this.p, z);
    }

    @Override // defpackage.j66
    public final void p0(boolean z) {
        hh9 hh9Var = this.n;
        up6.N(hh9Var, up6.M(hh9Var), jk9.PX, this.p, z);
    }

    @Override // defpackage.j66
    public final void q0(int i) {
        int X = X();
        if (i < 0 || i >= X) {
            return;
        }
        i7g v0 = v0();
        v0.a = i;
        yon layoutManager = this.n.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.e1(v0);
        }
    }

    @Override // defpackage.j66
    public final void r0(int i) {
        Unit unit;
        int X = X();
        if (i < 0 || i >= X) {
            return;
        }
        hh9 hh9Var = this.n;
        i3k pagerSnapStartHelper = hh9Var.getPagerSnapStartHelper();
        if (pagerSnapStartHelper != null) {
            w0(pagerSnapStartHelper, i, true);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            hh9Var.z0(i);
        }
    }

    public i7g v0() {
        return new d1a(this.n.getContext());
    }

    public final void w0(i3k i3kVar, int i, boolean z) {
        hh9 hh9Var = this.n;
        yon layoutManager = hh9Var.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        View L = layoutManager.L(i);
        if (L != null) {
            int[] b = i3kVar.b(layoutManager, L);
            hh9Var.scrollBy(b[0], b[1]);
        } else if (z) {
            hh9Var.addOnLayoutChangeListener(new e1a(this, i3kVar, i));
            hh9Var.z0(i);
        }
    }
}
