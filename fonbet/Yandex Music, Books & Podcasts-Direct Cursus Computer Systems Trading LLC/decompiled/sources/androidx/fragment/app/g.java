package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.avc;
import defpackage.bvc;
import defpackage.cy1;
import defpackage.he0;
import defpackage.hu3;
import defpackage.j5r;
import defpackage.jt6;
import defpackage.kr1;
import defpackage.ndu;
import defpackage.oeu;
import defpackage.ri2;
import defpackage.rr7;
import defpackage.sr7;
import defpackage.srj;
import defpackage.tr7;
import defpackage.ur7;
import defpackage.v75;
import defpackage.vuc;
import defpackage.wdu;
import defpackage.xqn;
import defpackage.xy0;
import defpackage.zg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g extends j5r {
    public final ArrayList c;
    public final f0 d;
    public final f0 e;
    public final bvc f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final xy0 j;
    public final ArrayList k;
    public final ArrayList l;
    public final xy0 m;
    public final xy0 n;
    public final boolean o;
    public final hu3 p;
    public Object q;

    public g(ArrayList arrayList, f0 f0Var, f0 f0Var2, bvc bvcVar, Object obj, ArrayList arrayList2, ArrayList arrayList3, xy0 xy0Var, ArrayList arrayList4, ArrayList arrayList5, xy0 xy0Var2, xy0 xy0Var3, boolean z) {
        arrayList4.getClass();
        this.c = arrayList;
        this.d = f0Var;
        this.e = f0Var2;
        this.f = bvcVar;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = xy0Var;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = xy0Var2;
        this.n = xy0Var3;
        this.o = z;
        this.p = new hu3();
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        WindowInsets windowInsets = oeu.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // defpackage.j5r
    public final boolean a() {
        Object obj;
        bvc bvcVar = this.f;
        if (!bvcVar.l()) {
            return false;
        }
        ArrayList<ur7> arrayList = this.c;
        if (!arrayList.isEmpty()) {
            for (ur7 ur7Var : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = ur7Var.b) == null || !bvcVar.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.g;
        return obj2 == null || bvcVar.m(obj2);
    }

    @Override // defpackage.j5r
    public final void b(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.p.a();
    }

    @Override // defpackage.j5r
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList<ur7> arrayList = this.c;
        if (!isLaidOut) {
            for (ur7 ur7Var : arrayList) {
                f0 f0Var = ur7Var.a;
                if (y.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + f0Var);
                }
                ur7Var.a.c(this);
            }
            return;
        }
        Object obj = this.q;
        bvc bvcVar = this.f;
        f0 f0Var2 = this.e;
        f0 f0Var3 = this.d;
        if (obj != null) {
            bvcVar.c(obj);
            if (y.M(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + f0Var3 + " to " + f0Var2);
                return;
            }
            return;
        }
        Pair g = g(viewGroup, f0Var2, f0Var3);
        ArrayList arrayList2 = (ArrayList) g.a;
        Object obj2 = g.b;
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ur7) it.next()).a);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            f0 f0Var4 = (f0) it2.next();
            bvcVar.u(f0Var4.c, obj2, this.p, new rr7(f0Var4, this, 1));
        }
        i(arrayList2, viewGroup, new tr7(this, viewGroup, obj2));
        if (y.M(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + f0Var3 + " to " + f0Var2);
        }
    }

    @Override // defpackage.j5r
    public final void d(ri2 ri2Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.q;
        if (obj != null) {
            this.f.r(obj, ri2Var.c);
        }
    }

    @Override // defpackage.j5r
    public final void e(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean isLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (isLaidOut) {
            boolean h = h();
            f0 f0Var = this.e;
            f0 f0Var2 = this.d;
            if (h && (obj = this.g) != null && !a()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + f0Var2 + " and " + f0Var + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (a() && h()) {
                xqn xqnVar = new xqn();
                Pair g = g(viewGroup, f0Var, f0Var2);
                ArrayList arrayList2 = (ArrayList) g.a;
                Object obj2 = g.b;
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ur7) it.next()).a);
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    f0 f0Var3 = (f0) it2.next();
                    he0 he0Var = new he0(29, xqnVar);
                    o oVar = f0Var3.c;
                    this.f.v(obj2, this.p, he0Var, new rr7(f0Var3, this, 0));
                }
                i(arrayList2, viewGroup, new zg(this, viewGroup, obj2, xqnVar, 4));
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                f0 f0Var4 = ((ur7) it3.next()).a;
                if (y.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + f0Var4);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair g(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        bvc bvcVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        f0 f0Var3 = f0Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.c;
        Iterator it = arrayList5.iterator();
        View view2 = null;
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.i;
            arrayList2 = this.h;
            obj = this.g;
            bvcVar = this.f;
            if (!hasNext) {
                break;
            }
            if (((ur7) it.next()).d == null || f0Var2 == null || f0Var3 == null || this.j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
            } else {
                o oVar = f0Var3.c;
                o oVar2 = f0Var2.c;
                avc avcVar = vuc.a;
                oVar.getClass();
                oVar2.getClass();
                arrayList4 = arrayList5;
                if (this.o) {
                    oVar2.getEnterTransitionCallback();
                } else {
                    oVar.getEnterTransitionCallback();
                }
                srj.c(viewGroup, new cy1(14, f0Var3, f0Var2, this));
                xy0 xy0Var = this.m;
                arrayList2.addAll(xy0Var.values());
                ArrayList arrayList6 = this.l;
                if (!arrayList6.isEmpty()) {
                    Object obj2 = arrayList6.get(0);
                    obj2.getClass();
                    View view3 = (View) xy0Var.get((String) obj2);
                    bvcVar.s(view3, obj);
                    view2 = view3;
                }
                xy0 xy0Var2 = this.n;
                arrayList.addAll(xy0Var2.values());
                ArrayList arrayList7 = this.k;
                if (!arrayList7.isEmpty()) {
                    Object obj3 = arrayList7.get(0);
                    obj3.getClass();
                    View view4 = (View) xy0Var2.get((String) obj3);
                    if (view4 != null) {
                        srj.c(viewGroup, new jt6(bvcVar, view4, rect));
                        z = true;
                    }
                }
                bvcVar.w(view, obj, arrayList2);
                Object obj4 = this.g;
                bvcVar.q(obj4, null, null, obj4, arrayList);
            }
            arrayList5 = arrayList4;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList;
        ArrayList arrayList10 = new ArrayList();
        Iterator it2 = arrayList8.iterator();
        Object obj5 = null;
        Object obj6 = null;
        while (it2.hasNext()) {
            ArrayList arrayList11 = arrayList9;
            ur7 ur7Var = (ur7) it2.next();
            Iterator it3 = it2;
            f0 f0Var4 = ur7Var.a;
            boolean z2 = z;
            Object h = bvcVar.h(ur7Var.b);
            if (h != null) {
                ArrayList arrayList12 = arrayList2;
                ArrayList arrayList13 = new ArrayList();
                Object obj7 = obj;
                o oVar3 = f0Var4.c;
                Object obj8 = obj6;
                View view5 = oVar3.mView;
                view5.getClass();
                f(view5, arrayList13);
                if (obj7 != null && (f0Var4 == f0Var2 || f0Var4 == f0Var3)) {
                    if (f0Var4 == f0Var2) {
                        arrayList13.removeAll(CollectionsKt.A0(arrayList12));
                    } else {
                        arrayList13.removeAll(CollectionsKt.A0(arrayList11));
                    }
                }
                if (arrayList13.isEmpty()) {
                    bvcVar.a(view, h);
                    arrayList3 = arrayList13;
                } else {
                    bvcVar.b(h, arrayList13);
                    bvcVar.q(h, h, arrayList13, null, null);
                    arrayList3 = arrayList13;
                    if (f0Var4.a == 3) {
                        f0Var4.i = false;
                        ArrayList arrayList14 = new ArrayList(arrayList3);
                        arrayList14.remove(oVar3.mView);
                        bvcVar.p(oVar3.mView, h, arrayList14);
                        srj.c(viewGroup, new sr7(0, arrayList3));
                        if (f0Var4.a != 2) {
                            arrayList10.addAll(arrayList3);
                            if (z2) {
                                bvcVar.t(h, rect);
                            }
                            if (y.M(2)) {
                                Log.v("FragmentManager", "Entering Transition: " + h);
                                Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    next.getClass();
                                    Log.v("FragmentManager", "View: " + ((View) next));
                                }
                            }
                        } else {
                            bvcVar.s(view2, h);
                            if (y.M(2)) {
                                Log.v("FragmentManager", "Exiting Transition: " + h);
                                Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    next2.getClass();
                                    Log.v("FragmentManager", "View: " + ((View) next2));
                                }
                            }
                        }
                        if (ur7Var.c) {
                            obj6 = bvcVar.o(obj8, h);
                            f0Var3 = f0Var;
                            arrayList9 = arrayList11;
                            it2 = it3;
                            z = z2;
                            arrayList2 = arrayList12;
                            obj = obj7;
                        } else {
                            obj5 = bvcVar.o(obj5, h);
                            f0Var3 = f0Var;
                            arrayList9 = arrayList11;
                            it2 = it3;
                            z = z2;
                            arrayList2 = arrayList12;
                            obj = obj7;
                            obj6 = obj8;
                        }
                    }
                }
                if (f0Var4.a != 2) {
                }
                if (ur7Var.c) {
                }
            } else {
                arrayList9 = arrayList11;
                it2 = it3;
                z = z2;
                f0Var3 = f0Var;
            }
        }
        Object n = bvcVar.n(obj5, obj6, obj);
        if (y.M(2)) {
            Log.v("FragmentManager", "Final merged transition: " + n);
        }
        return new Pair(arrayList10, n);
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ur7) it.next()).a.c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        vuc.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = wdu.a;
            arrayList2.add(ndu.g(view));
            ndu.o(view, null);
        }
        boolean M = y.M(2);
        ArrayList arrayList4 = this.h;
        if (M) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view2);
                sb.append(" Name: ");
                WeakHashMap weakHashMap2 = wdu.a;
                sb.append(ndu.g(view2));
                Log.v("FragmentManager", sb.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view3);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap3 = wdu.a;
                sb2.append(ndu.g(view3));
                Log.v("FragmentManager", sb2.toString());
            }
        }
        function0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = wdu.a;
            String g = ndu.g(view4);
            arrayList5.add(g);
            if (g != null) {
                ndu.o(view4, null);
                String str = (String) this.j.get(g);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        ndu.o((View) arrayList3.get(i3), g);
                        break;
                    }
                    i3++;
                }
            }
        }
        srj.c(viewGroup, new kr1(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        vuc.a(arrayList, 0);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
