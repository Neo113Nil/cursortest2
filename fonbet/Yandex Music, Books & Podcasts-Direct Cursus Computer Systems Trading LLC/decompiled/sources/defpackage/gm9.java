package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class gm9 extends p9 {
    public final gp8 b;
    public final p0a c;
    public final szm d;
    public final nm9 e;
    public final qg8 f;
    public final dd9 g;
    public final xc9 h;
    public final w1a i;
    public final efb j;
    public final qct k;
    public final wh9 l;

    public gm9(gp8 gp8Var, p0a p0aVar, szm szmVar, nm9 nm9Var, qg8 qg8Var, dd9 dd9Var, xc9 xc9Var, w1a w1aVar, efb efbVar, qct qctVar, wh9 wh9Var) {
        super(gp8Var);
        this.b = gp8Var;
        this.c = p0aVar;
        this.d = szmVar;
        this.e = nm9Var;
        this.f = qg8Var;
        this.g = dd9Var;
        this.h = xc9Var;
        this.i = w1aVar;
        this.j = efbVar;
        this.k = qctVar;
        this.l = wh9Var;
    }

    public static Pair G(ViewGroup viewGroup, List list, Sequence sequence, boolean z, boolean z2) {
        xzb xzbVar;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            return new Pair(viewGroup, sequence);
        }
        boolean z3 = true;
        boolean z4 = z || !((i2 = layoutParams.width) == -2 || i2 == -3);
        if (!z2 && ((i = layoutParams.height) == -2 || i == -3)) {
            z3 = false;
        }
        if (z4 && z3) {
            return new Pair(viewGroup, sequence);
        }
        f29 D = bg3.D(viewGroup);
        if (D == null) {
            return new Pair(viewGroup, sequence);
        }
        jc8 div = D.getDiv();
        if (div == null) {
            return new Pair(viewGroup, sequence);
        }
        String id = div.d().getId();
        if (id == null) {
            return new Pair(viewGroup, sequence);
        }
        e23 bindingContext = D.getBindingContext();
        if (bindingContext == null || (xzbVar = bindingContext.b) == null) {
            return new Pair(viewGroup, sequence);
        }
        Sequence r = xz0.r(new f8t[]{new f8t(id, list, xzbVar)});
        if (sequence != null) {
            r = jhp.i(r, sequence);
        }
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return viewGroup2 == null ? new Pair(viewGroup, r) : G(viewGroup2, list, r, z4, z3);
    }

    public static n8t H(cm9 cm9Var, cm9 cm9Var2, View view, View view2, xzb xzbVar, xzb xzbVar2) {
        List<sm8> list;
        List<sm8> list2;
        sm8 sm8Var = cm9Var.a;
        sm8 sm8Var2 = cm9Var2.b;
        if (sm8Var == null && sm8Var2 == null) {
            return null;
        }
        n8t n8tVar = new n8t();
        rm8 rm8Var = rm8.SET;
        if (sm8Var != null && view != null) {
            if (sm8Var.e.a(xzbVar) != rm8Var) {
                list2 = t75.c(sm8Var);
            } else {
                list2 = sm8Var.d;
                if (list2 == null) {
                    list2 = c5b.a;
                }
            }
            for (sm8 sm8Var3 : list2) {
                dyj q = bcx.q(sm8Var3, true, xzbVar);
                if (q != null) {
                    q.f.add(view);
                    q.c = ((Number) sm8Var3.a.a(xzbVar)).longValue();
                    q.b = ((Number) sm8Var3.g.a(xzbVar)).longValue();
                    q.d = vq1.Q((um8) sm8Var3.c.a(xzbVar));
                    n8tVar.W(q);
                }
            }
        }
        if (sm8Var2 != null && xzbVar2 != null) {
            if (sm8Var2.e.a(xzbVar2) != rm8Var) {
                list = t75.c(sm8Var2);
            } else {
                list = sm8Var2.d;
                if (list == null) {
                    list = c5b.a;
                }
            }
            for (sm8 sm8Var4 : list) {
                dyj q2 = bcx.q(sm8Var4, false, xzbVar2);
                if (q2 != null) {
                    q2.f.add(view2);
                    q2.c = ((Number) sm8Var4.a.a(xzbVar2)).longValue();
                    q2.b = ((Number) sm8Var4.g.a(xzbVar2)).longValue();
                    q2.d = vq1.Q((um8) sm8Var4.c.a(xzbVar2));
                    n8tVar.W(q2);
                }
            }
        }
        if (view2 != null) {
            wyf.w(view2);
        }
        return n8tVar;
    }

    public final void I(View view, gc8 gc8Var, xzb xzbVar) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            jc8 Y = gc8Var.Y(childAt);
            if (Y != null) {
                w1a.i(this.i, gc8Var, xzbVar, null, Y);
            }
            I(childAt, gc8Var, xzbVar);
            i = i2;
        }
    }
}
