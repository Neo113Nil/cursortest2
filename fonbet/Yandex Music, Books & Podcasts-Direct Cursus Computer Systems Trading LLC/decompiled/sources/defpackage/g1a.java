package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g1a extends j66 {
    public final /* synthetic */ int n = 1;
    public final DisplayMetrics o;
    public final ViewGroup p;

    public g1a(oc9 oc9Var) {
        this.p = oc9Var;
        this.o = oc9Var.getResources().getDisplayMetrics();
    }

    @Override // defpackage.j66
    public final int U() {
        switch (this.n) {
            case 0:
                return ((oc9) this.p).getViewPager().getCurrentItem();
            default:
                return ((lp9) this.p).getViewPager().getCurrentItem();
        }
    }

    @Override // defpackage.j66
    public final List W(String str) {
        switch (this.n) {
            case 0:
                qon adapter = ((oc9) this.p).getViewPager().getAdapter();
                hb9 hb9Var = adapter instanceof hb9 ? (hb9) adapter : null;
                if (hb9Var == null) {
                    return c5b.a;
                }
                ArrayList u = hb9Var.u();
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
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(hb9Var.z() + ((Number) it2.next()).intValue()));
                }
                return arrayList2;
            default:
                xo9 divTabsAdapter = ((lp9) this.p).getDivTabsAdapter();
                if (divTabsAdapter == null) {
                    return c5b.a;
                }
                LinkedHashMap linkedHashMap = divTabsAdapter.x;
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((n1s) ((Map.Entry) it3.next()).getValue()).b);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                int i3 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    Integer valueOf2 = Intrinsics.d(((jc8) next2).d().getId(), str) ? Integer.valueOf(i3) : null;
                    if (valueOf2 != null) {
                        arrayList4.add(valueOf2);
                    }
                    i3 = i4;
                }
                return arrayList4;
        }
    }

    @Override // defpackage.j66
    public final int X() {
        switch (this.n) {
            case 0:
                qon adapter = ((oc9) this.p).getViewPager().getAdapter();
                if (adapter != null) {
                    return adapter.c();
                }
                return 0;
            default:
                h2k adapter2 = ((lp9) this.p).getViewPager().getAdapter();
                if (adapter2 != null) {
                    return adapter2.b();
                }
                return 0;
        }
    }

    @Override // defpackage.j66
    public final DisplayMetrics Y() {
        switch (this.n) {
        }
        return this.o;
    }

    @Override // defpackage.j66
    public final void p0(boolean z) {
        switch (this.n) {
            case 0:
                ((oc9) this.p).getViewPager().e(X() - 1, z);
                break;
            default:
                ((lp9) this.p).getViewPager().x(X() - 1, z);
                break;
        }
    }

    @Override // defpackage.j66
    public final void q0(int i) {
        switch (this.n) {
            case 0:
                int X = X();
                if (i >= 0 && i < X) {
                    ((oc9) this.p).getViewPager().e(i, true);
                    break;
                }
                break;
            default:
                int X2 = X();
                if (i >= 0 && i < X2) {
                    ((lp9) this.p).getViewPager().x(i, true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.j66
    public final void r0(int i) {
        switch (this.n) {
            case 0:
                int X = X();
                if (i >= 0 && i < X) {
                    ((oc9) this.p).getViewPager().e(i, false);
                    break;
                }
                break;
            default:
                int X2 = X();
                if (i >= 0 && i < X2) {
                    ((lp9) this.p).getViewPager().x(i, false);
                    break;
                }
                break;
        }
    }

    public g1a(lp9 lp9Var) {
        this.p = lp9Var;
        this.o = lp9Var.getResources().getDisplayMetrics();
    }
}
