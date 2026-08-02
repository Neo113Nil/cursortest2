package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class hp8 {
    public final py9 a;
    public final er9 b;
    public final rt8 c;
    public final si9 d;
    public final v29 e;
    public final o19 f;
    public final x19 g;
    public final w09 h;
    public final kb9 i;
    public final cp9 j;
    public final gm9 k;
    public final av8 l;
    public final m39 m;
    public final jl9 n;
    public final rt8 o;
    public final x19 p;
    public final tz9 q;
    public final tx8 r;
    public final l2k s;
    public final m39 t;

    public hp8(py9 py9Var, er9 er9Var, rt8 rt8Var, si9 si9Var, v29 v29Var, o19 o19Var, x19 x19Var, w09 w09Var, kb9 kb9Var, cp9 cp9Var, gm9 gm9Var, av8 av8Var, m39 m39Var, jl9 jl9Var, rt8 rt8Var2, x19 x19Var2, tz9 tz9Var, tx8 tx8Var, l2k l2kVar, m39 m39Var2) {
        this.a = py9Var;
        this.b = er9Var;
        this.c = rt8Var;
        this.d = si9Var;
        this.e = v29Var;
        this.f = o19Var;
        this.g = x19Var;
        this.h = w09Var;
        this.i = kb9Var;
        this.j = cp9Var;
        this.k = gm9Var;
        this.l = av8Var;
        this.m = m39Var;
        this.n = jl9Var;
        this.o = rt8Var2;
        this.p = x19Var2;
        this.q = tz9Var;
        this.r = tx8Var;
        this.s = l2kVar;
        this.t = m39Var2;
    }

    public final void a(gc8 gc8Var) {
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (qht.a.a()) {
            this.s.a();
            return;
        }
        g23 d = gc8Var.getViewComponent$div_release().d();
        f23 a = d.a();
        try {
            d51Var.p(new t03(10, d, a, this));
        } catch (Throwable th) {
            g23.b(a);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e23 e23Var, View view, jc8 jc8Var, pm9 pm9Var) {
        npb npbVar;
        tx8 tx8Var = this.r;
        try {
            e23 a = e23Var.a(e23Var.a.getRuntimeStore$div_release().h(jc8Var, e23Var.b, pm9Var.c()).a);
            gc8 gc8Var = a.a;
            xzb xzbVar = a.b;
            ado currentRebindReusableList$div_release = gc8Var.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release != null) {
                int c = jc8Var.c();
                HashMap hashMap = currentRebindReusableList$div_release.a;
                LinkedList linkedList = (LinkedList) hashMap.get(Integer.valueOf(c));
                if (linkedList != null && !linkedList.isEmpty()) {
                    npbVar = (npb) linkedList.pop();
                    Collection collection = (Collection) hashMap.get(Integer.valueOf(c));
                    if (collection == null || collection.isEmpty()) {
                        hashMap.remove(Integer.valueOf(c));
                    }
                    if (npbVar != null) {
                        return;
                    }
                }
                npbVar = null;
                if (npbVar != null) {
                }
            }
            if (!((Boolean) this.a.U(jc8Var, xzbVar)).booleanValue()) {
                bg3.l(view, jc8Var.d().j(), xzbVar);
                return;
            }
            dp8 d = jc8Var.d();
            if (tx8Var.b(d)) {
                for (ux8 ux8Var : tx8Var.a) {
                    if (ux8Var.c(d)) {
                        ux8Var.d(view);
                    }
                }
            }
            if (!(jc8Var instanceof db8)) {
                view.getClass();
                jc8 div = ((f29) view).getDiv();
                if (div != null) {
                    tx8Var.e(gc8Var, xzbVar, view, div.d());
                }
            }
            if (jc8Var instanceof rb8) {
                er9 er9Var = this.b;
                view.getClass();
                er9Var.m(a, (d89) view, (rb8) jc8Var, null);
            } else if (jc8Var instanceof hb8) {
                v29 v29Var = this.e;
                view.getClass();
                v29Var.m(a, (i39) view, (hb8) jc8Var, null);
            } else if (jc8Var instanceof fb8) {
                o19 o19Var = this.f;
                view.getClass();
                o19Var.m(a, (v19) view, (fb8) jc8Var, null);
            } else if (jc8Var instanceof mb8) {
                si9 si9Var = this.d;
                view.getClass();
                si9Var.m(a, (cj9) view, (mb8) jc8Var, null);
            } else if (jc8Var instanceof cb8) {
                c(a, view, (cb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof gb8) {
                f(a, view, (gb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof eb8) {
                e(a, view, (eb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof kb8) {
                h(a, view, (kb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof qb8) {
                j(a, view, (qb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof ob8) {
                i(a, view, (ob8) jc8Var, pm9Var);
            } else if (jc8Var instanceof db8) {
                d(a, view, (db8) jc8Var, pm9Var);
            } else if (jc8Var instanceof ib8) {
                g(a, view, (ib8) jc8Var);
            } else if (jc8Var instanceof nb8) {
                jl9 jl9Var = this.n;
                view.getClass();
                jl9Var.m(a, (wl9) view, (nb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof jb8) {
                rt8 rt8Var = this.o;
                view.getClass();
                rt8Var.m(a, (j79) view, (jb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof lb8) {
                x19 x19Var = this.p;
                view.getClass();
                x19Var.m(a, (oi9) view, (lb8) jc8Var, pm9Var);
            } else if (jc8Var instanceof sb8) {
                tz9 tz9Var = this.q;
                view.getClass();
                tz9Var.m(a, (l0a) view, (sb8) jc8Var, pm9Var);
            } else {
                if (!(jc8Var instanceof pb8)) {
                    throw new x7j();
                }
                m39 m39Var = this.t;
                view.getClass();
                m39Var.m(a, (qo9) view, (pb8) jc8Var, pm9Var);
            }
            if (jc8Var instanceof db8) {
                return;
            }
            tx8Var.a(gc8Var, xzbVar, view, jc8Var.d());
        } catch (z7k e) {
            b8k b8kVar = b8k.c;
            b8k b8kVar2 = e.a;
            if (b8kVar2 != b8kVar && b8kVar2 != b8k.e && b8kVar2 != b8k.d) {
                throw e;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(e23 e23Var, View view, cb8 cb8Var, pm9 pm9Var) {
        xzb oldExpressionResolver$div_release;
        gc8 gc8Var = e23Var.a;
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view;
        f29 f29Var = (f29) viewGroup;
        cb8 cb8Var2 = (cb8) f29Var.getDiv();
        e23 bindingContext = f29Var.getBindingContext();
        if (bindingContext == null || (oldExpressionResolver$div_release = bindingContext.b) == null) {
            oldExpressionResolver$div_release = gc8Var.getOldExpressionResolver$div_release();
        }
        xzb xzbVar = oldExpressionResolver$div_release;
        rt8 rt8Var = this.c;
        if (cb8Var == cb8Var2) {
            rt8Var.N(viewGroup, e23Var, cb8Var.c, cb8Var2.c, xzbVar, pm9Var, false);
            return;
        }
        rt8Var.c.d(e23Var, viewGroup, cb8Var, cb8Var2);
        jt8 jt8Var = cb8Var.c;
        rt8Var.M(viewGroup, e23Var, jt8Var, cb8Var2 != null ? cb8Var2.c : null);
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                gc8Var.Y(childAt);
                i = i2;
            }
        }
        rt8Var.N(viewGroup, e23Var, jt8Var, cb8Var2 != null ? cb8Var2.c : null, xzbVar, pm9Var, true);
    }

    public final void d(e23 e23Var, View view, db8 db8Var, pm9 pm9Var) {
        e23 bindingContext;
        xzb xzbVar;
        av8 av8Var = this.l;
        view.getClass();
        kv8 kv8Var = (kv8) view;
        View customView = kv8Var.getCustomView();
        db8 div = kv8Var.getDiv();
        gc8 gc8Var = e23Var.a;
        xzb xzbVar2 = e23Var.b;
        if (div == db8Var) {
            vq2.P(kv8Var, new al(16, (hp8) av8Var.e.get(), e23Var));
            return;
        }
        if (customView != null && div != null && (bindingContext = kv8Var.getBindingContext()) != null && (xzbVar = bindingContext.b) != null) {
            av8Var.d.e(gc8Var, xzbVar, customView, div.d());
        }
        av8Var.b.d(e23Var, kv8Var, db8Var, div);
        av8Var.b.getClass();
        int a = gc8Var.getViewComponent$div_release().l().a(null);
        kv8Var.setTag(null);
        kv8Var.setId(a);
        yu8 yu8Var = db8Var.c;
        synchronized (d51.l) {
        }
        if (!qht.a.a()) {
            dq7 dq7Var = ca8.a;
            x97.D(j5h.a, new zu8(null, av8Var, yu8Var, kv8Var, customView, div, e23Var, gc8Var, xzbVar2, pm9Var));
        } else if (av8Var.c.b(yu8Var.j)) {
            av8.G(av8Var, kv8Var, customView, div != null ? div.c : null, yu8Var, e23Var, new vh0(av8Var, yu8Var, gc8Var, xzbVar2, pm9Var, 3), new ii(av8Var, yu8Var, gc8Var, xzbVar2, pm9Var, 9));
        }
    }

    public final void e(e23 e23Var, View view, eb8 eb8Var, pm9 pm9Var) {
        gc8 gc8Var = e23Var.a;
        view.getClass();
        hh9 hh9Var = (hh9) view;
        w09 w09Var = this.h;
        szm szmVar = w09Var.d;
        eb8 div = hh9Var.getDiv();
        if (eb8Var == div) {
            qon adapter = hh9Var.getAdapter();
            if ((adapter instanceof u09 ? (u09) adapter : null) == null) {
                return;
            }
            if (w09Var.e.a.get(gc8Var.getDataTag()) == null) {
                vq2.P(hh9Var, new al(16, (hp8) szmVar.get(), e23Var));
                return;
            } else {
                l1j.f();
                return;
            }
        }
        w09Var.b.d(e23Var, hh9Var, eb8Var, div);
        xzb xzbVar = e23Var.b;
        s09 s09Var = eb8Var.c;
        pr8 pr8Var = s09Var.s;
        u09 u09Var = new u09(qwp.x(s09Var.u, pr8Var, xzbVar), e23Var, (hp8) szmVar.get(), w09Var.c, pm9Var);
        ii iiVar = new ii(w09Var, hh9Var, e23Var, s09Var, u09Var, 10);
        hh9Var.i(s09Var.x.c(xzbVar, iiVar));
        hh9Var.i(s09Var.D.c(xzbVar, iiVar));
        hh9Var.i(s09Var.C.c(xzbVar, iiVar));
        hh9Var.i(s09Var.t.c(xzbVar, iiVar));
        hh9Var.i(s09Var.z.c(xzbVar, iiVar));
        szb szbVar = s09Var.h;
        if (szbVar != null) {
            hh9Var.i(szbVar.c(xzbVar, iiVar));
        }
        hh9Var.setRecycledViewPool(new utn(gc8Var.getReleaseViewVisitor$div_release()));
        hh9Var.setScrollingTouchSlop(1);
        hh9Var.setClipToPadding(false);
        hh9Var.setOverScrollMode(2);
        hh9Var.setAdapter(u09Var);
        if (pr8Var != null) {
            bg3.r(pr8Var, xzbVar, new lj0(19, hh9Var, pr8Var, e23Var));
        }
        von itemAnimator = hh9Var.getItemAnimator();
        hh9Var.setItemAnimator(null);
        if (!wyf.K(hh9Var) || hh9Var.isLayoutRequested()) {
            hh9Var.addOnLayoutChangeListener(new v09(0, hh9Var, itemAnimator));
        } else if (hh9Var.getItemAnimator() == null) {
            hh9Var.setItemAnimator(itemAnimator);
        }
        w09Var.G(hh9Var, e23Var, s09Var, u09Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ja8] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [ja8] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a0c] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [hp8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [gc8] */
    public final void f(e23 e23Var, View view, gb8 gb8Var, pm9 pm9Var) {
        List list;
        List c;
        e23 e23Var2 = e23Var;
        ?? r3 = e23Var2.a;
        xzb xzbVar = e23Var2.b;
        view.getClass();
        d29 d29Var = (d29) view;
        x19 x19Var = this.g;
        x19Var.m(e23Var2, d29Var, gb8Var, pm9Var);
        w19 w19Var = gb8Var.c;
        gb8 div = d29Var.getDiv();
        ArrayList arrayList = null;
        w19 w19Var2 = div != null ? div.c : null;
        List list2 = w19Var.y;
        if (list2 == null) {
            list2 = c5b.a;
        }
        ngg.Q(d29Var, r3, qwp.r0(list2, xzbVar), (szm) x19Var.e);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            jc8 jc8Var = (jc8) obj;
            if (jc8Var.d().getId() == null || r3.getComplexRebindInProgress$div_release()) {
                c = t75.c(jc8Var);
            } else {
                if (((dd9) x19Var.c).a.a.get(r3.getDataTag()) != null) {
                    l1j.f();
                    return;
                }
                c = t75.c(jc8Var);
            }
            c.size();
            z75.t(arrayList2, c);
            i2 = i3;
        }
        ArrayList K = wvo.K(arrayList2, gd9.s, gd9.t);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                ?? r18 = arrayList;
                u75.n();
                throw r18;
            }
            jc8 jc8Var2 = (jc8) next;
            ?? childAt = d29Var.getChildAt(i);
            ArrayList arrayList3 = arrayList;
            dp8 d = jc8Var2.d();
            ArrayList arrayList4 = K;
            ((hp8) ((szm) x19Var.d).get()).b(e23Var2, childAt, jc8Var2, pm9Var.b((String) K.get(i)));
            x19.G(d, xzbVar, childAt);
            if (childAt instanceof a0c) {
                ep8 ep8Var = new ep8(x19Var, (View) childAt, xzbVar, d);
                ?? r11 = (a0c) childAt;
                szb h = d.h();
                r11.i(h != null ? h.c(xzbVar, ep8Var) : arrayList3);
                szb k = d.k();
                r11.i(k != null ? k.c(xzbVar, ep8Var) : arrayList3);
            }
            if (vq1.V(d)) {
                r3.u(childAt, jc8Var2);
            } else {
                r3.Y(childAt);
            }
            e23Var2 = e23Var;
            arrayList = arrayList3;
            K = arrayList4;
            i = i4;
        }
        bg3.l0(d29Var, r3, qwp.r0(arrayList2, xzbVar), (w19Var2 == null || (list = w19Var2.y) == null) ? arrayList : qwp.r0(list, xzbVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(e23 e23Var, View view, ib8 ib8Var) {
        dp8 dp8Var;
        eb9 eb9Var;
        qv8 Q;
        m39 m39Var = this.m;
        view.getClass();
        lb9 lb9Var = (lb9) view;
        gc8 gc8Var = e23Var.a;
        rv8 divData = gc8Var.getDivData();
        jc8 jc8Var = (divData == null || (Q = gc8Var.Q(divData)) == null) ? null : Q.a;
        if (jc8Var != null) {
            zzb zzbVar = gc8Var.getRuntimeStore$div_release().h(jc8Var, gc8Var.getExpressionResolver(), gc8Var.getCurrentRootPath$div_release().c()).a;
            dp8 d = ib8Var.d();
            xqn xqnVar = new xqn();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = new gx9(jc8Var, zzbVar, new l39(arrayList, xqnVar, 0), new l39(arrayList, xqnVar, 1), vq9.z0).iterator();
            int i = 0;
            while (true) {
                x6 x6Var = (x6) it;
                if (x6Var.hasNext()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    dp8 d2 = ((k79) x6Var.next()).a.d();
                    if (d2 == d) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            i5p i5pVar = (i5p) it2.next();
                            Object obj = i5pVar.a;
                            if (((dp8) obj) != null) {
                                linkedHashMap.put(obj, Integer.valueOf(i5pVar.c));
                            }
                        }
                        arrayList.clear();
                        xqnVar.a = new i5p(null);
                    }
                    if (d2 instanceof eb9) {
                        eb9 eb9Var2 = (eb9) d2;
                        String str = ib8Var.c.A;
                        if (str == null || Intrinsics.d(eb9Var2.p, str)) {
                            Object obj2 = xqnVar.a;
                            if (obj2 != null) {
                                linkedHashMap.put(d2, Integer.valueOf(((i5p) obj2).c));
                            } else {
                                arrayList.add(new i5p(eb9Var2));
                            }
                        }
                    }
                    i = i2;
                } else {
                    Integer num = (Integer) CollectionsKt.b0(linkedHashMap.values());
                    if (num != null) {
                        int intValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((Number) entry.getValue()).intValue() == intValue) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set keySet = linkedHashMap2.keySet();
                        if (!keySet.isEmpty()) {
                            if (keySet.size() > 1) {
                                Log.w("SearchUtil", "Distance clash when searching for the nearest " + ern.a(eb9.class).h() + ". First found is taken");
                            }
                            dp8Var = (dp8) CollectionsKt.P(keySet);
                            eb9Var = (eb9) dp8Var;
                            if (eb9Var != null) {
                                l2k l2kVar = (l2k) m39Var.c;
                                synchronized (l2kVar.a) {
                                    l2kVar.c.add(new k2k(lb9Var, eb9Var));
                                }
                            }
                        }
                    }
                    dp8Var = null;
                    eb9Var = (eb9) dp8Var;
                    if (eb9Var != null) {
                    }
                }
            }
        }
        m39Var.m(e23Var, lb9Var, ib8Var, null);
    }

    public final void h(e23 e23Var, View view, kb8 kb8Var, pm9 pm9Var) {
        int z;
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        n2k n2kVar;
        tje tjeVar;
        kb9 kb9Var = this.i;
        view.getClass();
        oc9 oc9Var = (oc9) view;
        l2k l2kVar = kb9Var.g;
        eb9 eb9Var = kb8Var.c;
        synchronized (l2kVar.a) {
            l2kVar.b.put(eb9Var, oc9Var);
        }
        kb8 div = oc9Var.getDiv();
        if (kb8Var == div) {
            ViewPager2 viewPager = oc9Var.getViewPager();
            qon adapter = viewPager.getAdapter();
            if ((adapter instanceof hb9 ? (hb9) adapter : null) == null) {
                return;
            }
            oc9Var.getRecyclerView();
            if (kb9Var.e.a.get(e23Var.a.getDataTag()) != null) {
                l1j.f();
                return;
            } else {
                vq2.P(oc9Var, new al(16, (hp8) kb9Var.d.get(), e23Var));
                viewPager.addOnLayoutChangeListener(new f27(2, viewPager));
                return;
            }
        }
        if (div != null) {
            oc9Var.setChangePageCallbackForOffScreenPages$div_release(null);
            ViewPager2 viewPager2 = oc9Var.getViewPager();
            int itemDecorationCount = viewPager2.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                viewPager2.j.v0(i);
            }
            oc9Var.setPageTransformer$div_release(null);
        }
        kb9Var.b.d(e23Var, oc9Var, kb8Var, div);
        eb9 eb9Var2 = kb8Var.c;
        RecyclerView recyclerView = oc9Var.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        gc8 gc8Var = e23Var.a;
        xzb xzbVar = e23Var.b;
        SparseArray sparseArray = new SparseArray();
        boolean a = kb9Var.h.a(oc9Var.getContext());
        oc9Var.setRecycledViewPool(new utn(gc8Var.getReleaseViewVisitor$div_release()));
        List x = qwp.x(eb9Var2.t, eb9Var2.r, xzbVar);
        jz8 jz8Var = eb9Var2.s;
        szb szbVar5 = eb9Var2.i;
        ix8 ix8Var = eb9Var2.y;
        hb9 hb9Var = new hb9(x, e23Var, (hp8) kb9Var.d.get(), sparseArray, kb9Var.c, pm9Var, oc9Var);
        fb9 fb9Var = hb9Var.q;
        oc9Var.getViewPager().setAdapter(hb9Var);
        View childAt = oc9Var.getViewPager().getChildAt(0);
        childAt.getClass();
        eb9Var2.q.d(xzbVar, new lj0(oc9Var, new xqn(), kb9Var, (RecyclerView) childAt));
        kc9 pagerOnItemsCountChange$div_release = oc9Var.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null && (tjeVar = (n2kVar = (n2k) ((uvg) pagerOnItemsCountChange$div_release).b).a) != null) {
            n2kVar.f(tjeVar);
        }
        oc9Var.setClipToPage$div_release(gc8Var.getDiv2Component$div_release().f());
        oc9Var.setOrientation((eb9Var2.x.a(xzbVar) == db9.HORIZONTAL ? 1 : 0) ^ 1);
        hb9Var.s = (cb9) szbVar5.a(xzbVar);
        ii iiVar = new ii(kb9Var, oc9Var, eb9Var2, xzbVar, sparseArray, hb9Var, 17);
        oc9Var.i((ix8Var == null || (szbVar4 = ix8Var.c) == null) ? null : szbVar4.c(xzbVar, iiVar));
        oc9Var.i((ix8Var == null || (szbVar3 = ix8Var.d) == null) ? null : szbVar3.c(xzbVar, iiVar));
        oc9Var.i((ix8Var == null || (szbVar2 = ix8Var.f) == null) ? null : szbVar2.c(xzbVar, iiVar));
        oc9Var.i((ix8Var == null || (szbVar = ix8Var.a) == null) ? null : szbVar.c(xzbVar, iiVar));
        oc9Var.i(jz8Var.b.c(xzbVar, iiVar));
        oc9Var.i(jz8Var.a.c(xzbVar, iiVar));
        oc9Var.i(eb9Var2.D.c(xzbVar, iiVar));
        oc9Var.i(szbVar5.c(xzbVar, iiVar));
        oc9Var.i(eb9Var2.x.c(xzbVar, iiVar));
        oc9Var.i(new jb9(oc9Var.getViewPager(), iiVar, eb9Var2));
        ub9 ub9Var = eb9Var2.u;
        if (ub9Var instanceof rb9) {
            g99 g99Var = ((rb9) ub9Var).b;
            oc9Var.i(g99Var.a.b.c(xzbVar, iiVar));
            oc9Var.i(g99Var.a.a.c(xzbVar, iiVar));
        } else if (ub9Var instanceof tb9) {
            oc9Var.i(((tb9) ub9Var).b.a.a.c(xzbVar, iiVar));
        }
        oc9Var.setPagerSelectedActionsDispatcher$div_release(new d3k(gc8Var, fb9Var, kb9Var.f));
        oc9Var.setChangePageCallbackForLogger$div_release(new dc9(eb9Var2, fb9Var, e23Var, recyclerView, oc9Var));
        b1a currentState = gc8Var.getCurrentState();
        if (currentState != null) {
            String str = eb9Var2.p;
            if (str == null) {
                str = String.valueOf(eb9Var2.hashCode());
            }
            a1a a1aVar = (a1a) currentState.b.get(str);
            n3k n3kVar = a1aVar instanceof n3k ? (n3k) a1aVar : null;
            oc9Var.setChangePageCallbackForState$div_release(new f2k(str, currentState));
            if (n3kVar != null) {
                int i2 = n3kVar.a;
                Integer valueOf = i2 < fb9Var.f() - hb9Var.z() ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    z = valueOf.intValue();
                    oc9Var.setCurrentItem$div_release(z);
                }
            }
            long longValue = ((Number) eb9Var2.j.a(xzbVar)).longValue();
            long j = longValue >> 31;
            z = ((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE) + hb9Var.z();
            oc9Var.setCurrentItem$div_release(z);
        }
        oc9Var.i(eb9Var2.A.d(xzbVar, new az6(21, oc9Var)));
        pr8 pr8Var = eb9Var2.r;
        if (pr8Var != null) {
            bg3.r(pr8Var, e23Var.b, new lj0(23, oc9Var, pr8Var, e23Var));
        }
        if (a) {
            oc9Var.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02e2, code lost:
    
        if (defpackage.vq1.G(r3, r8) == true) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0474, code lost:
    
        if (defpackage.h1b.B(r8, r15, r6, r3) != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, r8 != null ? r8.f : null) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0274, code lost:
    
        if (r9 == null) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0449  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(e23 e23Var, View view, ob8 ob8Var, pm9 pm9Var) {
        Object obj;
        Object obj2;
        e23 e23Var2;
        ob8 ob8Var2;
        jc8 jc8Var;
        mm9 mm9Var;
        String str;
        xzb xzbVar;
        gm9 gm9Var;
        cm9 cm9Var;
        pm9 pm9Var2;
        cm9 cm9Var2;
        dm9 dm9Var;
        pm9 pm9Var3;
        cm9 cm9Var3;
        dm9 dm9Var2;
        View view2;
        xzb xzbVar2;
        cm9 cm9Var4;
        jc8 jc8Var2;
        xzb xzbVar3;
        jc8 jc8Var3;
        View view3;
        dm9 dm9Var3;
        mm9 mm9Var2;
        pm9 pm9Var4;
        xzb xzbVar4;
        gc8 gc8Var;
        View view4;
        Object obj3;
        Pair pair;
        pm9 pm9Var5;
        xzb xzbVar5;
        boolean z;
        jc8 jc8Var4;
        boolean z2;
        cm9 cm9Var5;
        ViewGroup viewGroup;
        Sequence sequence;
        xzb xzbVar6;
        um9 um9Var;
        gx9 gx9Var;
        n8t n8tVar;
        View view5;
        xzb xzbVar7;
        cm9 cm9Var6;
        xzb xzbVar8;
        xzb xzbVar9;
        cm9 cm9Var7;
        ViewGroup viewGroup2;
        sq8 E;
        ado currentRebindReusableList$div_release;
        om8 e0;
        pm8 f0;
        gm9 gm9Var2;
        vh0 vh0Var;
        gm9 gm9Var3 = this.k;
        view.getClass();
        mm9 mm9Var3 = (mm9) view;
        dm9 dm9Var4 = ob8Var.c;
        ob8 div = mm9Var3.getDiv();
        e23 bindingContext = mm9Var3.getBindingContext();
        xzb xzbVar10 = bindingContext != null ? bindingContext.b : null;
        gc8 gc8Var2 = e23Var.a;
        xzb xzbVar11 = e23Var.b;
        t03 t03Var = new t03(11, gm9Var3, gc8Var2, pm9Var);
        String str2 = dm9Var4.p;
        if (str2 == null && (str2 = dm9Var4.x) == null) {
            t03Var.invoke();
            str2 = "";
        }
        String str3 = str2;
        Iterator it = dm9Var4.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((cm9) obj).d, mm9Var3.getStateId())) {
                    break;
                }
            }
        }
        cm9 cm9Var8 = (cm9) obj;
        if (cm9Var8 == null) {
            cm9Var8 = vq1.S(dm9Var4, xzbVar11);
        }
        cm9 cm9Var9 = cm9Var8;
        String b = gm9Var3.e.b(dm9Var4, gc8Var2, xzbVar11, pm9Var.f() + '/' + str3);
        Iterator it2 = dm9Var4.I.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (Intrinsics.d(((cm9) obj2).d, b)) {
                    break;
                }
            }
        }
        cm9 cm9Var10 = (cm9) obj2;
        if (cm9Var10 == null) {
            cm9Var10 = vq1.S(dm9Var4, xzbVar11);
        }
        cm9 cm9Var11 = cm9Var10;
        if (cm9Var9 == null || cm9Var11 == null) {
            return;
        }
        jc8 activeStateDiv$div_release = mm9Var3.getActiveStateDiv$div_release();
        if (div != ob8Var) {
            gm9Var3.b.d(e23Var, mm9Var3, ob8Var, activeStateDiv$div_release);
            dm9 dm9Var5 = div != null ? div.c : null;
            mm9 mm9Var4 = mm9Var3;
            str = str3;
            ob8Var2 = div;
            xzbVar = xzbVar10;
            cm9Var2 = cm9Var11;
            cm9Var = cm9Var9;
            jc8Var = activeStateDiv$div_release;
            bg3.k(mm9Var4, e23Var, dm9Var4.b, dm9Var4.d, dm9Var4.z, dm9Var4.q, dm9Var4.w, dm9Var4.v, dm9Var4.D, dm9Var4.C, dm9Var4.c, dm9Var4.k);
            xzb xzbVar12 = e23Var.b;
            szb szbVar = dm9Var4.e;
            szb szbVar2 = dm9Var4.f;
            if (Intrinsics.d(szbVar, dm9Var5 != null ? dm9Var5.e : null)) {
            }
            if (szbVar == null || (e0 = (om8) szbVar.a(xzbVar12)) == null) {
                ViewParent parent = mm9Var4.getParent();
                f29 f29Var = parent instanceof f29 ? (f29) parent : null;
                jc8 div2 = f29Var != null ? f29Var.getDiv() : null;
                cb8 cb8Var = div2 instanceof cb8 ? (cb8) div2 : null;
                du8 du8Var = cb8Var == null ? null : (du8) cb8Var.c.o.a(xzbVar12);
                e0 = du8Var != null ? vq1.e0(du8Var) : null;
            }
            if (szbVar2 == null || (f0 = (pm8) szbVar2.a(xzbVar12)) == null) {
                ViewParent parent2 = mm9Var4.getParent();
                f29 f29Var2 = parent2 instanceof f29 ? (f29) parent2 : null;
                jc8 div3 = f29Var2 != null ? f29Var2.getDiv() : null;
                cb8 cb8Var2 = div3 instanceof cb8 ? (cb8) div3 : null;
                eu8 eu8Var = cb8Var2 == null ? null : (eu8) cb8Var2.c.p.a(xzbVar12);
                f0 = eu8Var != null ? vq1.f0(eu8Var) : null;
            }
            bg3.j(mm9Var4, e0, f0);
            String str4 = dm9Var4.H;
            if (str4 == null) {
                gm9Var2 = gm9Var3;
                pm9Var2 = pm9Var;
            } else {
                qct qctVar = gm9Var3.k;
                gm9Var2 = gm9Var3;
                dn9 dn9Var = new dn9(mm9Var4, dm9Var4, pm9Var, e23Var, gm9Var2, 10);
                pm9Var2 = pm9Var;
                mm9Var4 = mm9Var4;
                mm9Var4.i(qctVar.l(e23Var, str4, dn9Var));
            }
            bg3.q(mm9Var4, dm9Var4.l, dm9Var5 != null ? dm9Var5.l : null, xzbVar12);
            gm9Var = gm9Var2;
            List list = cm9Var2.e;
            if (list != null) {
                mm9 mm9Var5 = mm9Var4;
                e23Var2 = e23Var;
                mm9Var = mm9Var5;
                vh0Var = new vh0(gm9Var, e23Var, xzbVar12, mm9Var5, list, 5);
            } else {
                e23Var2 = e23Var;
                mm9Var = mm9Var4;
                vh0Var = null;
            }
            mm9Var.setSwipeOutCallback(vh0Var);
        } else {
            e23Var2 = e23Var;
            ob8Var2 = div;
            jc8Var = activeStateDiv$div_release;
            mm9Var = mm9Var3;
            str = str3;
            xzbVar = xzbVar10;
            gm9Var = gm9Var3;
            cm9Var = cm9Var9;
            pm9Var2 = pm9Var;
            cm9Var2 = cm9Var11;
        }
        dm9 dm9Var6 = ob8Var2 != null ? ob8Var2.c : null;
        gc8 gc8Var3 = e23Var2.a;
        xzb xzbVar13 = e23Var2.b;
        jc8 jc8Var5 = cm9Var2.c;
        dp8 d = jc8Var5 != null ? jc8Var5.d() : null;
        pm9 a = pm9Var2.a(str, cm9Var2, cm9Var2.d);
        View childAt = mm9Var.getChildCount() != 0 ? mm9Var.getChildAt(0) : null;
        View a2 = (jc8Var5 == null || (currentRebindReusableList$div_release = gc8Var3.getCurrentRebindReusableList$div_release()) == null) ? null : currentRebindReusableList$div_release.a(jc8Var5);
        if (Intrinsics.d(mm9Var.getStateId(), cm9Var2.d)) {
            dm9Var = dm9Var6;
            pm9Var3 = a;
            cm9Var3 = cm9Var2;
            dm9Var2 = dm9Var4;
            view2 = childAt;
            xzbVar2 = xzbVar;
            cm9Var4 = cm9Var;
            jc8Var2 = jc8Var5;
            boolean z3 = true;
            if (d != null) {
                if (view2 == null || xzbVar2 == null) {
                    jc8Var3 = jc8Var;
                } else {
                    jc8Var3 = jc8Var;
                }
                z3 = false;
                if (z3) {
                    xzbVar3 = xzbVar13;
                    a2 = view2;
                } else if (a2 == null) {
                    a2 = gm9Var.c.W(jc8Var2, xzbVar13);
                    xzbVar3 = xzbVar13;
                    a2.setLayoutParams(new u79(-1, -2));
                } else {
                    xzbVar3 = xzbVar13;
                }
                if (!z3) {
                    synchronized (d51.l) {
                    }
                    if (qht.a.a()) {
                        int i = 0;
                        while (i < mm9Var.getChildCount()) {
                            int i2 = i + 1;
                            View childAt2 = mm9Var.getChildAt(i);
                            if (childAt2 == null) {
                                rj7.m();
                                return;
                            } else {
                                yd5.R(gc8Var3.getReleaseViewVisitor$div_release(), childAt2);
                                i = i2;
                            }
                        }
                        mm9Var.removeAllViews();
                    } else {
                        dq7 dq7Var = ca8.a;
                        x97.D(j5h.a, new seg((Continuation) null, mm9Var, gc8Var3, 23));
                    }
                    mm9Var.addView(a2);
                }
                if (a2 != null) {
                    ((hp8) gm9Var.d.get()).b(e23Var2, a2, jc8Var2, pm9Var3);
                }
                view3 = a2;
            } else {
                xzbVar3 = xzbVar13;
                jc8Var3 = jc8Var;
                synchronized (d51.l) {
                }
                if (qht.a.a()) {
                    int i3 = 0;
                    while (i3 < mm9Var.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt3 = mm9Var.getChildAt(i3);
                        if (childAt3 == null) {
                            rj7.m();
                            return;
                        } else {
                            yd5.R(gc8Var3.getReleaseViewVisitor$div_release(), childAt3);
                            i3 = i4;
                        }
                    }
                    mm9Var.removeAllViews();
                } else {
                    dq7 dq7Var2 = ca8.a;
                    x97.D(j5h.a, new seg((Continuation) null, mm9Var, gc8Var3, 23));
                }
                view3 = null;
            }
        } else {
            if (jc8Var5 != null) {
                if (a2 == null) {
                    a2 = gm9Var.c.W(jc8Var5, xzbVar13);
                    a2.setLayoutParams(new u79(-1, -2));
                }
                view4 = a2;
            } else {
                view4 = null;
            }
            cm9 cm9Var12 = cm9Var;
            if (childAt != null) {
                jc8 jc8Var6 = cm9Var12.c;
                if (jc8Var6 == null || (E = jc8Var6.d().E()) == null) {
                    obj3 = null;
                    pair = null;
                } else {
                    obj3 = null;
                    pair = gm9.G(mm9Var, t75.c(new fw9(E)), null, false, false);
                }
            } else {
                obj3 = null;
            }
            pair = new Pair(mm9Var, obj3);
            ViewGroup viewGroup3 = (ViewGroup) pair.a;
            Sequence sequence2 = (Sequence) pair.b;
            if (xzbVar == null) {
                cm9 cm9Var13 = cm9Var2;
                jc8Var4 = jc8Var5;
                viewGroup = viewGroup3;
                cm9Var3 = cm9Var13;
                cm9Var4 = cm9Var12;
                view5 = view4;
                view2 = childAt;
                n8tVar = gm9.H(cm9Var13, cm9Var12, view4, childAt, xzbVar13, null);
                dm9Var = dm9Var6;
                pm9Var3 = a;
                dm9Var2 = dm9Var4;
                xzbVar7 = xzbVar13;
                xzbVar2 = xzbVar;
            } else {
                cm9 cm9Var14 = cm9Var2;
                cm9Var4 = cm9Var12;
                int ordinal = ((mw9) dm9Var4.M.a(xzbVar13)).ordinal();
                if (ordinal == 2 || ordinal == 3) {
                    jc8 jc8Var7 = cm9Var4.c;
                    if (jc8Var7 != null) {
                        xzbVar5 = xzbVar;
                        pm9Var5 = a;
                        z = true;
                    } else {
                        pm9Var5 = a;
                        xzbVar5 = xzbVar;
                        z = true;
                    }
                    jc8 jc8Var8 = cm9Var14.c;
                    if (jc8Var8 == null || vq1.G(jc8Var8, xzbVar13) != z) {
                        jc8Var4 = jc8Var5;
                        dm9Var = dm9Var6;
                        viewGroup = viewGroup3;
                        pm9Var3 = pm9Var5;
                        dm9Var2 = dm9Var4;
                        cm9Var6 = cm9Var14;
                        xzbVar8 = xzbVar13;
                        xzbVar9 = xzbVar5;
                        cm9Var7 = cm9Var4;
                    }
                    hw9 k = gc8Var3.getViewComponent$div_release().k();
                    um9 s = gc8Var3.getViewComponent$div_release().s();
                    if (cm9Var14.equals(cm9Var4)) {
                        jc8Var4 = jc8Var5;
                        dm9Var = dm9Var6;
                        cm9Var3 = cm9Var14;
                        xzbVar2 = xzbVar5;
                        xzbVar7 = xzbVar13;
                        pm9Var3 = pm9Var5;
                        view5 = view4;
                        view2 = childAt;
                        viewGroup = viewGroup3;
                        n8tVar = null;
                        dm9Var2 = dm9Var4;
                    } else {
                        jc8 jc8Var9 = cm9Var4.c;
                        if (jc8Var9 != null) {
                            cm9Var5 = cm9Var4;
                            cm9Var3 = cm9Var14;
                            viewGroup = viewGroup3;
                            xzbVar6 = xzbVar13;
                            sequence = sequence2;
                            jc8Var4 = jc8Var5;
                            dm9Var = dm9Var6;
                            pm9Var3 = pm9Var5;
                            z2 = true;
                            dm9Var2 = dm9Var4;
                            um9Var = s;
                            gx9Var = new gx9(jc8Var9, xzbVar5, rk9.y, null, new fm9(0, (boolean) (0 == true ? 1 : 0)));
                        } else {
                            jc8Var4 = jc8Var5;
                            z2 = z;
                            cm9Var5 = cm9Var4;
                            cm9Var3 = cm9Var14;
                            viewGroup = viewGroup3;
                            dm9Var = dm9Var6;
                            sequence = sequence2;
                            xzbVar6 = xzbVar13;
                            pm9Var3 = pm9Var5;
                            dm9Var2 = dm9Var4;
                            um9Var = s;
                            gx9Var = null;
                        }
                        xzb xzbVar14 = xzbVar5;
                        if (sequence == null) {
                            sequence = gx9Var;
                        } else if (gx9Var != null) {
                            sequence = jhp.i(sequence, gx9Var);
                        }
                        jc8 jc8Var10 = cm9Var3.c;
                        n8t b2 = k.b(sequence, jc8Var10 != null ? new gx9(jc8Var10, xzbVar6, rk9.y, null, new fm9(0, z2)) : null);
                        um9Var.b.add(b2);
                        if (!um9Var.c) {
                            gc8 gc8Var4 = um9Var.a;
                            srj.c(gc8Var4, new pv7(gc8Var4, um9Var, false, 4));
                            um9Var.c = z2;
                        }
                        n8tVar = b2;
                        view5 = view4;
                        view2 = childAt;
                        xzbVar7 = xzbVar6;
                        xzbVar2 = xzbVar14;
                        cm9Var4 = cm9Var5;
                    }
                } else {
                    jc8Var4 = jc8Var5;
                    dm9Var = dm9Var6;
                    pm9Var3 = a;
                    cm9Var6 = cm9Var14;
                    viewGroup = viewGroup3;
                    xzbVar8 = xzbVar13;
                    cm9Var7 = cm9Var4;
                    dm9Var2 = dm9Var4;
                    xzbVar9 = xzbVar;
                }
                view5 = view4;
                view2 = childAt;
                n8tVar = gm9.H(cm9Var6, cm9Var7, view5, view2, xzbVar8, xzbVar9);
                cm9Var3 = cm9Var6;
                cm9Var4 = cm9Var7;
                xzbVar7 = xzbVar8;
                xzbVar2 = xzbVar9;
            }
            if (n8tVar != null) {
                l8t.b(viewGroup);
                viewGroup2 = viewGroup;
                jb jbVar = new jb(10, viewGroup2);
                viewGroup2.addOnAttachStateChangeListener(jbVar);
                n8tVar.b(new eto(0, n8tVar, viewGroup2, jbVar));
                l8t.a(viewGroup2, n8tVar);
            } else {
                viewGroup2 = viewGroup;
            }
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                int i5 = 0;
                while (i5 < mm9Var.getChildCount()) {
                    int i6 = i5 + 1;
                    View childAt4 = mm9Var.getChildAt(i5);
                    if (childAt4 == null) {
                        rj7.m();
                        return;
                    } else {
                        yd5.R(gc8Var3.getReleaseViewVisitor$div_release(), childAt4);
                        i5 = i6;
                    }
                }
                mm9Var.removeAllViews();
            } else {
                dq7 dq7Var3 = ca8.a;
                x97.D(j5h.a, new seg((Continuation) null, mm9Var, gc8Var3, 23));
            }
            if (view5 != null) {
                mm9Var.addView(view5);
                if (jc8Var4 != null) {
                    jc8Var2 = jc8Var4;
                    ((hp8) gm9Var.d.get()).b(e23Var2, view5, jc8Var2, pm9Var3);
                    if (view2 != null) {
                        lw9 divTransitionHandler$div_release = gc8Var3.getDivTransitionHandler$div_release();
                        divTransitionHandler$div_release.d = false;
                        divTransitionHandler$div_release.a(viewGroup2, false);
                    }
                    xzbVar3 = xzbVar7;
                    view3 = view5;
                    jc8Var3 = jc8Var;
                }
            }
            jc8Var2 = jc8Var4;
            if (view2 != null) {
            }
            xzbVar3 = xzbVar7;
            view3 = view5;
            jc8Var3 = jc8Var;
        }
        if (view2 != null) {
            view2.startAnimation(new AnimationSet(false));
            dm9Var3 = dm9Var2;
            if (!Intrinsics.d(dm9Var, dm9Var3) || !cm9Var3.equals(cm9Var4)) {
                gc8Var3.Y(view2);
                if (jc8Var3 != null && xzbVar2 != null) {
                    w1a.i(gm9Var.i, gc8Var3, xzbVar2, null, jc8Var3);
                    gm9Var.I(view2, gc8Var3, xzbVar2);
                }
            }
        } else {
            dm9Var3 = dm9Var2;
        }
        if (view3 == null || d == null || (d.y() == null && d.g() == null)) {
            mm9Var2 = mm9Var;
            pm9Var4 = pm9Var3;
            xzbVar4 = xzbVar3;
            gc8Var = gc8Var3;
        } else {
            gc8Var3.u(view3, jc8Var2);
            mm9 mm9Var6 = mm9Var;
            gc8Var = gc8Var3;
            mm9Var2 = mm9Var6;
            pm9Var4 = pm9Var3;
            xzbVar4 = xzbVar3;
            view3.addOnLayoutChangeListener(new em9(gm9Var, gc8Var, xzbVar4, view3, jc8Var2));
        }
        if (jc8Var3 != null && jc8Var3.d().getId() != null) {
            if (gm9Var.g.a.a.get(e23Var2.a.getDataTag()) != null) {
                l1j.f();
                return;
            } else {
                if (gm9Var.h.a.get(gc8Var.getDataTag()) != null) {
                    l1j.f();
                    return;
                }
            }
        }
        mm9Var2.setActiveStateDiv$div_release(jc8Var2);
        mm9Var2.setPath(pm9Var4);
        if (view2 != null) {
            wh9 wh9Var = gm9Var.l;
            wh9Var.getClass();
            d0c i7 = gc8Var.getRuntimeStore$div_release().i(xzbVar4);
            if (i7 == null) {
                return;
            }
            wh9Var.e(dm9Var3, gc8Var, pm9Var, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(e23 e23Var, View view, qb8 qb8Var, pm9 pm9Var) {
        Unit unit;
        vo9 vo9Var;
        Iterator it;
        boolean z;
        long longValue;
        Long l;
        view.getClass();
        lp9 lp9Var = (lp9) view;
        qb8 div = lp9Var.getDiv();
        cp9 cp9Var = this.j;
        if (div == qb8Var) {
            xo9 divTabsAdapter = lp9Var.getDivTabsAdapter();
            if (divTabsAdapter != null) {
                if (divTabsAdapter.w.a.get(divTabsAdapter.q.a.getDataTag()) != null) {
                    l1j.f();
                    return;
                }
            }
        } else {
            cp9Var.b.d(e23Var, lp9Var, qb8Var, div);
            cp9Var.I(lp9Var, e23Var, qb8Var.c);
        }
        vo9 vo9Var2 = div != null ? div.c : null;
        vo9 vo9Var3 = qb8Var.c;
        List list = vo9Var3.q;
        hp8 hp8Var = (hp8) cp9Var.d.get();
        xzb xzbVar = e23Var.b;
        szb szbVar = vo9Var3.y;
        szb szbVar2 = vo9Var3.j;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new xj9((ro9) it2.next(), lp9Var.getResources().getDisplayMetrics(), xzbVar));
        }
        xo9 divTabsAdapter2 = lp9Var.getDivTabsAdapter();
        if (divTabsAdapter2 != null) {
            if (divTabsAdapter2.p != ((Boolean) szbVar2.a(xzbVar)).booleanValue()) {
                divTabsAdapter2 = null;
            }
            if (divTabsAdapter2 != null) {
                divTabsAdapter2.q = e23Var;
                divTabsAdapter2.v = pm9Var;
                divTabsAdapter2.y.clear();
                divTabsAdapter2.t.f = vo9Var3;
                divTabsAdapter2.u.f = vo9Var3;
                if (vo9Var2 == vo9Var3) {
                    divTabsAdapter2.b();
                } else {
                    divTabsAdapter2.c(new n(28, arrayList));
                }
                unit = Unit.a;
                if (unit != null) {
                    vo9Var = vo9Var3;
                    cp9Var.J(lp9Var, e23Var, vo9Var, hp8Var, pm9Var, arrayList, null);
                } else {
                    vo9Var = vo9Var3;
                }
                ap9 ap9Var = new ap9(lp9Var, 3);
                it = list.iterator();
                while (it.hasNext()) {
                    bk9 a = ((ro9) it.next()).a.d().a();
                    if (a instanceof yj9) {
                        jz8 jz8Var = ((yj9) a).b;
                        lp9Var.i(jz8Var.a.c(xzbVar, ap9Var));
                        lp9Var.i(jz8Var.b.c(xzbVar, ap9Var));
                    }
                }
                sv4 sv4Var = new sv4(26, cp9Var, lp9Var);
                vo9 vo9Var4 = vo9Var;
                lp9Var.i(szbVar2.c(xzbVar, new lt8(lp9Var, cp9Var, e23Var, vo9Var4, hp8Var, pm9Var, arrayList)));
                lp9Var.i(szbVar.c(xzbVar, sv4Var));
                gc8 gc8Var = e23Var.a;
                z = !Intrinsics.d(gc8Var.getPrevDataTag(), dw8.b) || Intrinsics.d(gc8Var.getDataTag(), gc8Var.getPrevDataTag());
                longValue = ((Number) szbVar.a(xzbVar)).longValue();
                if (z || (l = cp9Var.o) == null || l.longValue() != longValue) {
                    sv4Var.invoke(Long.valueOf(longValue));
                }
                lp9Var.i(vo9Var4.B.d(xzbVar, new sv4(lp9Var, cp9Var, vo9Var4)));
            }
        }
        unit = null;
        if (unit != null) {
        }
        ap9 ap9Var2 = new ap9(lp9Var, 3);
        it = list.iterator();
        while (it.hasNext()) {
        }
        sv4 sv4Var2 = new sv4(26, cp9Var, lp9Var);
        vo9 vo9Var42 = vo9Var;
        lp9Var.i(szbVar2.c(xzbVar, new lt8(lp9Var, cp9Var, e23Var, vo9Var42, hp8Var, pm9Var, arrayList)));
        lp9Var.i(szbVar.c(xzbVar, sv4Var2));
        gc8 gc8Var2 = e23Var.a;
        if (Intrinsics.d(gc8Var2.getPrevDataTag(), dw8.b)) {
        }
        longValue = ((Number) szbVar.a(xzbVar)).longValue();
        if (z) {
        }
        sv4Var2.invoke(Long.valueOf(longValue));
        lp9Var.i(vo9Var42.B.d(xzbVar, new sv4(lp9Var, cp9Var, vo9Var42)));
    }
}
