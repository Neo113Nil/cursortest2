package Z;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* renamed from: Z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063k {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1559a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1560b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1561c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1562d;
    public boolean e;

    public C0063k(ViewGroup viewGroup) {
        D1.i.e(viewGroup, "container");
        this.f1559a = viewGroup;
        this.f1560b = new ArrayList();
        this.f1561c = new ArrayList();
    }

    public static final C0063k g(ViewGroup viewGroup, M m2) {
        D1.i.e(viewGroup, "container");
        D1.i.e(m2, "fragmentManager");
        D1.i.d(m2.E(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0063k) {
            return (C0063k) tag;
        }
        C0063k c0063k = new C0063k(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0063k);
        return c0063k;
    }

    public final void a(int i, int i2, T t2) {
        synchronized (this.f1560b) {
            K.d dVar = new K.d();
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
            D1.i.d(abstractComponentCallbacksC0070s, "fragmentStateManager.fragment");
            Y e = e(abstractComponentCallbacksC0070s);
            if (e != null) {
                e.c(i, i2);
                return;
            }
            final Y y2 = new Y(i, i2, t2, dVar);
            this.f1560b.add(y2);
            final int i3 = 0;
            y2.f1506d.add(new Runnable(this) { // from class: Z.X

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0063k f1501b;

                {
                    this.f1501b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            C0063k c0063k = this.f1501b;
                            D1.i.e(c0063k, "this$0");
                            Y y3 = y2;
                            if (c0063k.f1560b.contains(y3)) {
                                int i4 = y3.f1503a;
                                View view = y3.f1505c.f1584F;
                                D1.i.d(view, "operation.fragment.mView");
                                D1.h.a(view, i4);
                                break;
                            }
                            break;
                        default:
                            C0063k c0063k2 = this.f1501b;
                            D1.i.e(c0063k2, "this$0");
                            Y y4 = y2;
                            c0063k2.f1560b.remove(y4);
                            c0063k2.f1561c.remove(y4);
                            break;
                    }
                }
            });
            final int i4 = 1;
            y2.f1506d.add(new Runnable(this) { // from class: Z.X

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0063k f1501b;

                {
                    this.f1501b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            C0063k c0063k = this.f1501b;
                            D1.i.e(c0063k, "this$0");
                            Y y3 = y2;
                            if (c0063k.f1560b.contains(y3)) {
                                int i42 = y3.f1503a;
                                View view = y3.f1505c.f1584F;
                                D1.i.d(view, "operation.fragment.mView");
                                D1.h.a(view, i42);
                                break;
                            }
                            break;
                        default:
                            C0063k c0063k2 = this.f1501b;
                            D1.i.e(c0063k2, "this$0");
                            Y y4 = y2;
                            c0063k2.f1560b.remove(y4);
                            c0063k2.f1561c.remove(y4);
                            break;
                    }
                }
            });
        }
    }

    public final void b(int i, T t2) {
        D1.h.j("finalState", i);
        D1.i.e(t2, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + t2.f1485c);
        }
        a(i, 2, t2);
    }

    public final void c(ArrayList arrayList, boolean z2) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            Y y2 = (Y) obj2;
            View view = y2.f1505c.f1584F;
            D1.i.d(view, "operation.fragment.mView");
            if (R.j.f(view) == 2 && y2.f1503a != 2) {
                break;
            }
        }
        Y y3 = (Y) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            Y y4 = (Y) previous;
            View view2 = y4.f1505c.f1584F;
            D1.i.d(view2, "operation.fragment.mView");
            if (R.j.f(view2) != 2 && y4.f1503a == 2) {
                obj = previous;
                break;
            }
        }
        Y y5 = (Y) obj;
        String str = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + y3 + " to " + y5);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList Z2 = u1.g.Z(arrayList);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = ((Y) u1.g.R(arrayList)).f1505c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r rVar = ((Y) it2.next()).f1505c.f1587I;
            r rVar2 = abstractComponentCallbacksC0070s.f1587I;
            rVar.f1571b = rVar2.f1571b;
            rVar.f1572c = rVar2.f1572c;
            rVar.f1573d = rVar2.f1573d;
            rVar.e = rVar2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Y y6 = (Y) it3.next();
            K.d dVar = new K.d();
            y6.d();
            LinkedHashSet linkedHashSet = y6.e;
            linkedHashSet.add(dVar);
            arrayList3.add(new C0058f(y6, dVar, z2));
            K.d dVar2 = new K.d();
            y6.d();
            linkedHashSet.add(dVar2);
            boolean z3 = !z2 ? y6 != y5 : y6 != y3;
            C0060h c0060h = new C0060h(y6, dVar2);
            int i = y6.f1503a;
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = y6.f1505c;
            if (i == 2) {
                if (z2) {
                    r rVar3 = abstractComponentCallbacksC0070s2.f1587I;
                } else {
                    abstractComponentCallbacksC0070s2.getClass();
                }
            } else if (z2) {
                r rVar4 = abstractComponentCallbacksC0070s2.f1587I;
            } else {
                abstractComponentCallbacksC0070s2.getClass();
            }
            if (y6.f1503a == 2) {
                if (z2) {
                    r rVar5 = abstractComponentCallbacksC0070s2.f1587I;
                } else {
                    r rVar6 = abstractComponentCallbacksC0070s2.f1587I;
                }
            }
            if (z3) {
                if (z2) {
                    r rVar7 = abstractComponentCallbacksC0070s2.f1587I;
                } else {
                    abstractComponentCallbacksC0070s2.getClass();
                }
            }
            arrayList4.add(c0060h);
            y6.f1506d.add(new V.l(Z2, y6, this, 1));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0060h) next).h()) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0060h) it5.next()).getClass();
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            ((C0060h) it6.next()).getClass();
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0060h c0060h2 = (C0060h) it7.next();
            linkedHashMap.put((Y) c0060h2.f1549a, Boolean.FALSE);
            c0060h2.d();
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1559a;
        Context context = viewGroup.getContext();
        ArrayList arrayList7 = new ArrayList();
        Iterator it8 = arrayList3.iterator();
        boolean z4 = false;
        while (it8.hasNext()) {
            C0058f c0058f = (C0058f) it8.next();
            if (c0058f.h()) {
                c0058f.d();
            } else {
                D1.i.d(context, "context");
                F.i k2 = c0058f.k(context);
                if (k2 == null) {
                    c0058f.d();
                } else {
                    final Animator animator = (Animator) k2.f209c;
                    if (animator == null) {
                        arrayList7.add(c0058f);
                    } else {
                        final Y y7 = (Y) c0058f.f1549a;
                        arrayList2 = arrayList7;
                        boolean a2 = D1.i.a(linkedHashMap.get(y7), Boolean.TRUE);
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = y7.f1505c;
                        if (a2) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0070s3 + " as this Fragment was involved in a Transition.");
                            }
                            c0058f.d();
                            arrayList7 = arrayList2;
                        } else {
                            boolean z5 = y7.f1503a == 3;
                            if (z5) {
                                Z2.remove(y7);
                            }
                            View view3 = abstractComponentCallbacksC0070s3.f1584F;
                            viewGroup.startViewTransition(view3);
                            Y y8 = y5;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            String str2 = str;
                            boolean z6 = z5;
                            Y y9 = y3;
                            Context context2 = context;
                            ArrayList arrayList8 = Z2;
                            ViewGroup viewGroup2 = viewGroup;
                            animator.addListener(new C0061i(this, view3, z6, y7, c0058f));
                            animator.setTarget(view3);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animator from operation " + y7 + " has started.");
                            }
                            ((K.d) c0058f.f1550b).a(new K.c() { // from class: Z.d
                                @Override // K.c
                                public final void a() {
                                    Y y10 = y7;
                                    D1.i.e(y10, "$operation");
                                    animator.end();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "Animator from operation " + y10 + " has been canceled.");
                                    }
                                }
                            });
                            context = context2;
                            viewGroup = viewGroup2;
                            arrayList7 = arrayList2;
                            y3 = y9;
                            linkedHashMap = linkedHashMap2;
                            y5 = y8;
                            str = str2;
                            Z2 = arrayList8;
                            z4 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList7;
            arrayList7 = arrayList2;
        }
        Y y10 = y3;
        Y y11 = y5;
        String str3 = str;
        ArrayList arrayList9 = Z2;
        Context context3 = context;
        ViewGroup viewGroup3 = viewGroup;
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            final C0058f c0058f2 = (C0058f) it9.next();
            final Y y12 = (Y) c0058f2.f1549a;
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s4 = y12.f1505c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0070s4 + " as Animations cannot run alongside Transitions.");
                }
                c0058f2.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0070s4 + " as Animations cannot run alongside Animators.");
                }
                c0058f2.d();
            } else {
                final View view4 = abstractComponentCallbacksC0070s4.f1584F;
                D1.i.d(context3, "context");
                F.i k3 = c0058f2.k(context3);
                if (k3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) k3.f208b;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (y12.f1503a != 1) {
                    view4.startAnimation(animation);
                    c0058f2.d();
                } else {
                    viewGroup3.startViewTransition(view4);
                    RunnableC0075x runnableC0075x = new RunnableC0075x(animation, viewGroup3, view4);
                    runnableC0075x.setAnimationListener(new AnimationAnimationListenerC0062j(c0058f2, this, y12, view4));
                    view4.startAnimation(runnableC0075x);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + y12 + " has started.");
                    }
                }
                ((K.d) c0058f2.f1550b).a(new K.c() { // from class: Z.e
                    @Override // K.c
                    public final void a() {
                        C0063k c0063k = this;
                        D1.i.e(c0063k, "this$0");
                        C0058f c0058f3 = c0058f2;
                        D1.i.e(c0058f3, "$animationInfo");
                        Y y13 = y12;
                        D1.i.e(y13, "$operation");
                        View view5 = view4;
                        view5.clearAnimation();
                        c0063k.f1559a.endViewTransition(view5);
                        c0058f3.d();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Animation from operation " + y13 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        Iterator it10 = arrayList9.iterator();
        while (it10.hasNext()) {
            Y y13 = (Y) it10.next();
            View view5 = y13.f1505c.f1584F;
            int i2 = y13.f1503a;
            D1.i.d(view5, "view");
            D1.h.a(view5, i2);
        }
        arrayList9.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + y10 + str3 + y11);
        }
    }

    public final void d() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f1559a;
        WeakHashMap weakHashMap = O.K.f747a;
        if (!viewGroup.isAttachedToWindow()) {
            f();
            this.f1562d = false;
            return;
        }
        synchronized (this.f1560b) {
            try {
                if (!this.f1560b.isEmpty()) {
                    ArrayList Z2 = u1.g.Z(this.f1561c);
                    this.f1561c.clear();
                    Iterator it = Z2.iterator();
                    while (it.hasNext()) {
                        Y y2 = (Y) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + y2);
                        }
                        y2.a();
                        if (!y2.f1508g) {
                            this.f1561c.add(y2);
                        }
                    }
                    h();
                    ArrayList Z3 = u1.g.Z(this.f1560b);
                    this.f1560b.clear();
                    this.f1561c.addAll(Z3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = Z3.iterator();
                    while (it2.hasNext()) {
                        ((Y) it2.next()).d();
                    }
                    c(Z3, this.f1562d);
                    this.f1562d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y e(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        Object obj;
        Iterator it = this.f1560b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Y y2 = (Y) obj;
            if (D1.i.a(y2.f1505c, abstractComponentCallbacksC0070s) && !y2.f1507f) {
                break;
            }
        }
        return (Y) obj;
    }

    public final void f() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1559a;
        WeakHashMap weakHashMap = O.K.f747a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1560b) {
            try {
                h();
                Iterator it = this.f1560b.iterator();
                while (it.hasNext()) {
                    ((Y) it.next()).d();
                }
                Iterator it2 = u1.g.Z(this.f1561c).iterator();
                while (it2.hasNext()) {
                    Y y2 = (Y) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1559a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + y2);
                    }
                    y2.a();
                }
                Iterator it3 = u1.g.Z(this.f1560b).iterator();
                while (it3.hasNext()) {
                    Y y3 = (Y) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1559a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + y3);
                    }
                    y3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Iterator it = this.f1560b.iterator();
        while (it.hasNext()) {
            Y y2 = (Y) it.next();
            int i = 2;
            if (y2.f1504b == 2) {
                int visibility = y2.f1505c.I().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(D1.h.e("Unknown visibility ", visibility));
                        }
                        i = 3;
                    }
                }
                y2.c(i, 1);
            }
        }
    }
}
