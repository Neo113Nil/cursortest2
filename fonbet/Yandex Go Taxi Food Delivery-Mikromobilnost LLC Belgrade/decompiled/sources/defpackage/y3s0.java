package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.impl.view.adapter.t;
import com.yandex.go.shortcuts.models.LoadingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView$MvpView$sendAppearAnalytics$$inlined$safeCollectIn$1;

/* loaded from: classes6.dex */
public final class y3s0 implements c3s0 {
    public final /* synthetic */ ShortcutsView a;

    public y3s0(ShortcutsView shortcutsView) {
        this.a = shortcutsView;
    }

    @Override // defpackage.c3s0
    public final LoadingMode Ab() {
        ShortcutsView shortcutsView = this.a;
        return !shortcutsView.shortcutItemDecorator.g() ? LoadingMode.IDLE : shortcutsView.shortcutItemDecorator.f() instanceof czg ? LoadingMode.LOADING_ALL : LoadingMode.LOADING_SINGLE;
    }

    @Override // defpackage.c3s0
    public final void Od(ga5 ga5Var) {
        t tVar;
        tVar = this.a.adapter;
        h(new dzg(tVar.x.f.indexOf(ga5Var)));
    }

    @Override // defpackage.c3s0
    public final void Sd(d4s0 d4s0Var) {
        t tVar;
        t4s0 t4s0Var;
        Layout layout;
        boolean z;
        boolean z2;
        t tVar2;
        l8x l8xVar;
        k3s0 k3s0Var;
        hbp0 hbp0Var;
        SwipeRefreshLayout swipeRefreshLayout;
        SpannedGridLayoutManager spannedGridLayoutManager;
        ms2 ms2Var;
        f1z f1zVar = d4s0Var.b;
        Layout layout2 = d4s0Var.a;
        List<e6v> list = d4s0Var.d;
        boolean z3 = d4s0Var.j;
        boolean l = jl40.l(f1zVar, d1z.a);
        boolean l2 = jl40.l(f1zVar, e1z.a);
        ShortcutsView shortcutsView = this.a;
        tVar = shortcutsView.adapter;
        tVar.getClass();
        boolean z4 = tVar instanceof r680;
        if (l) {
            ms2Var = shortcutsView.appCreateAnalytics;
            Milestone milestone = Milestone.ShortcutsRender;
            ms2Var.getClass();
            ((os2) ms2Var).d(milestone, SystemClock.elapsedRealtime());
        }
        if (l && !z4) {
            spannedGridLayoutManager = shortcutsView.layoutManager;
            spannedGridLayoutManager.R.clear();
        }
        if (l2) {
            swipeRefreshLayout = shortcutsView.shortcutsRefreshLayout;
            swipeRefreshLayout.setRefreshing(false);
        }
        jst.e.getClass();
        ArrayList arrayList = new ArrayList();
        for (e6v e6vVar : list) {
            ycc.r(e6vVar instanceof zj11 ? a.A0(((zj11) e6vVar).b, 5) : e6vVar instanceof kx00 ? ((kx00) e6vVar).c() : e6vVar instanceof n3q0 ? ((n3q0) e6vVar).c : e6vVar instanceof x5b0 ? ((x5b0) e6vVar).d : Collections.singletonList(e6vVar), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof hx31) {
                arrayList2.add(next);
            }
        }
        t4s0Var = shortcutsView.shortcutsVisibilityTracker;
        u4s0 u4s0Var = (u4s0) t4s0Var;
        u4s0Var.getClass();
        int d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap.put(((hx31) next2).c(), next2);
        }
        u4s0Var.c = linkedHashMap;
        Set keySet = u4s0Var.a.keySet();
        Collection values = u4s0Var.c.values();
        HashSet hashSet = new HashSet();
        Iterator it3 = values.iterator();
        while (it3.hasNext()) {
            hashSet.add(((hx31) it3.next()).c());
        }
        keySet.retainAll(hashSet);
        layout = shortcutsView.currentLayout;
        if (!jl40.l(layout, layout2)) {
            shortcutsView.currentLayout = layout2;
            shortcutsView.updateGridLayout(z3);
            l8xVar = shortcutsView.sendAppearEventJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            k3s0Var = shortcutsView.shortcutsOnPreDrawTracker;
            tpr tprVar = k3s0Var.b;
            hbp0Var = shortcutsView.scope;
            shortcutsView.sendAppearEventJob = tje.N(hbp0Var, null, null, new ShortcutsView$MvpView$sendAppearAnalytics$$inlined$safeCollectIn$1(tprVar, null, shortcutsView, arrayList2), 3);
        }
        z = shortcutsView.skipAddAnimation;
        shortcutsView.skipAddAnimation = z || z3;
        z2 = shortcutsView.currentItemsIsFallback;
        if (z2 != z3) {
            shortcutsView.currentItemsIsFallback = z3;
            shortcutsView.skipAddAnimation = true;
        }
        tVar2 = shortcutsView.adapter;
        tVar2.submitList(list, new uf4(shortcutsView, f1zVar, z4, 6));
        if (l2) {
            List list2 = d4s0Var.l;
            if (list2.isEmpty()) {
                h(azg.c);
            } else {
                h(new bzg(list2));
            }
        }
        if (l) {
            shortcutsView.shortcutItemDecorator.j(false);
        }
    }

    @Override // defpackage.c3s0
    public final void a3(ga5 ga5Var) {
        t tVar;
        ShortcutsView shortcutsView = this.a;
        wp81 f = shortcutsView.shortcutItemDecorator.f();
        if (f instanceof dzg) {
            tVar = shortcutsView.adapter;
            if (tVar.x.f.indexOf(ga5Var) == ((dzg) f).c) {
                shortcutsView.shortcutItemDecorator.j(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        defpackage.jst.e.k(new java.lang.IndexOutOfBoundsException(defpackage.oyr.h(r9, r2.size(), "Invalid index ", ", size is  ")), "ShortcutsView: adapter's current list is not consistent with layout manager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        return null;
     */
    @Override // defpackage.c3s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ngz da() {
        SpannedGridLayoutManager spannedGridLayoutManager;
        t tVar;
        RecyclerView recyclerView;
        int i;
        SpannedGridLayoutManager spannedGridLayoutManager2;
        SpannedGridLayoutManager spannedGridLayoutManager3;
        SpannedGridLayoutManager spannedGridLayoutManager4;
        int n0;
        SpannedGridLayoutManager spannedGridLayoutManager5;
        int k0;
        ShortcutsView shortcutsView = this.a;
        spannedGridLayoutManager = shortcutsView.layoutManager;
        int d0 = spannedGridLayoutManager.d0();
        if (d0 != 0) {
            tVar = shortcutsView.adapter;
            List list = tVar.x.f;
            recyclerView = shortcutsView.shortcutsRecyclerView;
            int bottom = recyclerView.getBottom();
            int i2 = d0 - 1;
            String str = null;
            String str2 = null;
            while (true) {
                if (-1 >= i2) {
                    i = 0;
                    break;
                }
                spannedGridLayoutManager2 = shortcutsView.layoutManager;
                View c0 = spannedGridLayoutManager2.c0(i2);
                if (c0 != null) {
                    spannedGridLayoutManager3 = shortcutsView.layoutManager;
                    spannedGridLayoutManager3.getClass();
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                    if (viewLayoutPosition < 0 || viewLayoutPosition >= list.size()) {
                        break;
                    }
                    e6v e6vVar = (e6v) list.get(viewLayoutPosition);
                    if (e6vVar instanceof yyr0) {
                        yyr0 yyr0Var = (yyr0) e6vVar;
                        if (yyr0Var.d() != null) {
                            str2 = yyr0Var.d();
                        }
                    }
                    if (e6vVar instanceof zj11) {
                        yj11 yj11Var = (yj11) a.b0(((zj11) e6vVar).b);
                        if (yj11Var != null) {
                            str = yj11Var.b;
                            spannedGridLayoutManager4 = shortcutsView.layoutManager;
                            n0 = spannedGridLayoutManager4.n0(c0);
                            spannedGridLayoutManager5 = shortcutsView.layoutManager;
                            k0 = spannedGridLayoutManager5.k0(c0);
                            if (k0 > 0 && n0 < bottom) {
                                i = ((bottom - n0) * 100) / k0;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (e6vVar instanceof ga5) {
                        str = ((ga5) e6vVar).getBase().j;
                        spannedGridLayoutManager4 = shortcutsView.layoutManager;
                        n0 = spannedGridLayoutManager4.n0(c0);
                        spannedGridLayoutManager5 = shortcutsView.layoutManager;
                        k0 = spannedGridLayoutManager5.k0(c0);
                        if (k0 > 0) {
                            i = ((bottom - n0) * 100) / k0;
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i2--;
            }
            if (str != null) {
                return new ngz(str, str2, Math.max(0, Math.min(100, i)));
            }
        }
        return null;
    }

    public final void h(wp81 wp81Var) {
        RecyclerView recyclerView;
        ShortcutsView shortcutsView = this.a;
        shortcutsView.shortcutItemDecorator.l(wp81Var);
        shortcutsView.shortcutItemDecorator.j(true);
        recyclerView = shortcutsView.shortcutsRecyclerView;
        recyclerView.postInvalidateOnAnimation();
    }

    @Override // defpackage.c3s0
    public final boolean ha() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ShortcutsView shortcutsView = this.a;
        recyclerView = shortcutsView.shortcutsRecyclerView;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        recyclerView2 = shortcutsView.shortcutsRecyclerView;
        return canScrollVertically || recyclerView2.canScrollVertically(1);
    }

    @Override // defpackage.c3s0
    public final void r7(e6v e6vVar) {
        t tVar;
        n3q0 findSectionScrollableModel;
        RecyclerView recyclerView;
        ShortcutsView shortcutsView = this.a;
        tVar = shortcutsView.adapter;
        int indexOf = tVar.x.f.indexOf(e6vVar);
        if (indexOf >= 0) {
            recyclerView = shortcutsView.shortcutsRecyclerView;
            recyclerView.smoothScrollToPosition(indexOf);
        } else {
            findSectionScrollableModel = shortcutsView.findSectionScrollableModel(e6vVar);
            if (findSectionScrollableModel != null) {
                r7(findSectionScrollableModel);
            }
        }
    }

    @Override // defpackage.c3s0
    public final boolean ub(e6v e6vVar) {
        t tVar;
        SpannedGridLayoutManager spannedGridLayoutManager;
        n3q0 findSectionScrollableModel;
        ShortcutsView shortcutsView = this.a;
        tVar = shortcutsView.adapter;
        int indexOf = tVar.x.f.indexOf(e6vVar);
        if (indexOf >= 0) {
            spannedGridLayoutManager = shortcutsView.layoutManager;
            View X = spannedGridLayoutManager.X(indexOf);
            return X != null && X.getTop() >= 0;
        }
        findSectionScrollableModel = shortcutsView.findSectionScrollableModel(e6vVar);
        if (findSectionScrollableModel != null) {
            return ub(findSectionScrollableModel);
        }
        return false;
    }
}
