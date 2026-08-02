package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class npb extends n9 {
    public final View e;
    public final npb f;

    public npb(k79 k79Var, int i, View view, npb npbVar) {
        super(k79Var, i);
        this.e = view;
        this.f = npbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k(npb npbVar) {
        jc8 activeStateDiv$div_release;
        ViewPager2 viewPager;
        View childAt;
        k79 k79Var = (k79) this.c;
        jc8 jc8Var = (jc8) this.d;
        if (jc8Var instanceof rb8) {
            return c5b.a;
        }
        if (jc8Var instanceof hb8) {
            return c5b.a;
        }
        if (jc8Var instanceof fb8) {
            return c5b.a;
        }
        if (jc8Var instanceof mb8) {
            return c5b.a;
        }
        if (jc8Var instanceof ib8) {
            return c5b.a;
        }
        if (jc8Var instanceof nb8) {
            return c5b.a;
        }
        if (jc8Var instanceof jb8) {
            return c5b.a;
        }
        if (jc8Var instanceof lb8) {
            return c5b.a;
        }
        if (jc8Var instanceof sb8) {
            return c5b.a;
        }
        if (jc8Var instanceof pb8) {
            return c5b.a;
        }
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            return l(qwp.x(jt8Var.B, jt8Var.z, k79Var.b), npbVar);
        }
        boolean z = jc8Var instanceof db8;
        int i = 0;
        View view = this.e;
        if (z) {
            yu8 yu8Var = ((db8) jc8Var).c;
            xzb xzbVar = k79Var.b;
            ArrayList arrayList = new ArrayList();
            kv8 kv8Var = view instanceof kv8 ? (kv8) view : null;
            View customView = kv8Var != null ? kv8Var.getCustomView() : null;
            ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
            if (viewGroup == null) {
                return c5b.a;
            }
            Iterable iterable = yu8Var.q;
            if (iterable == null) {
                iterable = c5b.a;
            }
            for (Object obj : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    u75.n();
                    throw null;
                }
                k79 k79Var2 = new k79((jc8) obj, xzbVar);
                View childAt2 = viewGroup.getChildAt(i);
                if (childAt2 == null) {
                    return c5b.a;
                }
                arrayList.add(new npb(k79Var2, i, childAt2, npbVar == null ? this : npbVar));
                i = i2;
            }
            return arrayList;
        }
        if (jc8Var instanceof gb8) {
            w19 w19Var = ((gb8) jc8Var).c;
            xzb xzbVar2 = k79Var.b;
            List list = w19Var.y;
            if (list == null) {
                list = c5b.a;
            }
            return l(qwp.r0(list, xzbVar2), npbVar);
        }
        if (jc8Var instanceof eb8) {
            s09 s09Var = ((eb8) jc8Var).c;
            xzb xzbVar3 = k79Var.b;
            ArrayList arrayList2 = new ArrayList();
            hh9 hh9Var = view instanceof hh9 ? (hh9) view : null;
            qon adapter = hh9Var != null ? hh9Var.getAdapter() : null;
            u09 u09Var = adapter instanceof u09 ? (u09) adapter : null;
            if (u09Var == null) {
                return c5b.a;
            }
            ArrayList u = u09Var.u();
            ArrayList arrayList3 = new ArrayList(v75.o(u, 10));
            Iterator it = u.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((k79) it.next()).a.b()));
            }
            int i3 = 0;
            for (Object obj2 : qwp.x(s09Var.u, s09Var.s, xzbVar3)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    u75.n();
                    throw null;
                }
                k79 k79Var3 = (k79) obj2;
                if (arrayList3.contains(Integer.valueOf(k79Var3.a.b()))) {
                    View childAt3 = ((hh9) view).getChildAt(i3);
                    ViewGroup viewGroup2 = childAt3 instanceof ViewGroup ? (ViewGroup) childAt3 : null;
                    View childAt4 = viewGroup2 == null ? null : viewGroup2.getChildAt(0);
                    if (childAt4 != null) {
                        arrayList2.add(new npb(k79Var3, i3, childAt4, npbVar == null ? this : npbVar));
                    }
                }
                i3 = i4;
            }
            return arrayList2;
        }
        if (!(jc8Var instanceof kb8)) {
            if (jc8Var instanceof qb8) {
                throw new jln(jc8Var.getClass());
            }
            if (!(jc8Var instanceof ob8)) {
                b6e.s();
                return null;
            }
            xzb xzbVar4 = k79Var.b;
            mm9 mm9Var = view instanceof mm9 ? (mm9) view : null;
            return (mm9Var == null || (activeStateDiv$div_release = mm9Var.getActiveStateDiv$div_release()) == null) ? c5b.a : l(qwp.r0(t75.c(activeStateDiv$div_release), xzbVar4), npbVar);
        }
        eb9 eb9Var = ((kb8) jc8Var).c;
        xzb xzbVar5 = k79Var.b;
        ArrayList arrayList4 = new ArrayList();
        oc9 oc9Var = view instanceof oc9 ? (oc9) view : null;
        if (oc9Var == null || (viewPager = oc9Var.getViewPager()) == null) {
            return c5b.a;
        }
        qon adapter2 = viewPager.getAdapter();
        hb9 hb9Var = adapter2 instanceof hb9 ? (hb9) adapter2 : null;
        if (hb9Var == null) {
            return c5b.a;
        }
        fb9 fb9Var = hb9Var.q;
        ArrayList arrayList5 = new ArrayList(v75.o(fb9Var, 10));
        c7 c7Var = new c7(0, fb9Var);
        while (c7Var.hasNext()) {
            arrayList5.add(Integer.valueOf(((k79) c7Var.next()).a.b()));
        }
        int i5 = 0;
        for (Object obj3 : qwp.x(eb9Var.t, eb9Var.r, xzbVar5)) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var4 = (k79) obj3;
            if (arrayList5.contains(Integer.valueOf(k79Var4.a.b()))) {
                int indexOf = arrayList5.indexOf(Integer.valueOf(k79Var4.a.b()));
                RecyclerView recyclerView = ((oc9) view).getRecyclerView();
                if (recyclerView != null) {
                    View childAt5 = recyclerView.getChildAt(indexOf);
                    ViewGroup viewGroup3 = childAt5 instanceof ViewGroup ? (ViewGroup) childAt5 : null;
                    if (viewGroup3 != null) {
                        childAt = viewGroup3.getChildAt(0);
                        if (childAt != null) {
                            arrayList4.add(new npb(k79Var4, i5, childAt, npbVar == null ? this : npbVar));
                        }
                    }
                }
                childAt = null;
                if (childAt != null) {
                }
            }
            i5 = i6;
        }
        return arrayList4;
    }

    public final List l(List list, npb npbVar) {
        View childAt;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var = (k79) obj;
            View view = this.e;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (childAt = viewGroup.getChildAt(i)) == null) {
                return c5b.a;
            }
            arrayList.add(new npb(k79Var, i, childAt, npbVar == null ? this : npbVar));
            i = i2;
        }
        return arrayList;
    }
}
