package Z;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f1503a;

    /* renamed from: b, reason: collision with root package name */
    public int f1504b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0070s f1505c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1506d;
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1507f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1508g;

    /* renamed from: h, reason: collision with root package name */
    public final T f1509h;

    public Y(int i, int i2, T t2, K.d dVar) {
        D1.h.j("finalState", i);
        D1.h.j("lifecycleImpact", i2);
        D1.i.e(t2, "fragmentStateManager");
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
        D1.i.d(abstractComponentCallbacksC0070s, "fragmentStateManager.fragment");
        D1.h.j("finalState", i);
        D1.h.j("lifecycleImpact", i2);
        D1.i.e(abstractComponentCallbacksC0070s, "fragment");
        this.f1503a = i;
        this.f1504b = i2;
        this.f1505c = abstractComponentCallbacksC0070s;
        this.f1506d = new ArrayList();
        this.e = new LinkedHashSet();
        dVar.a(new Q.a(this));
        this.f1509h = t2;
    }

    public final void a() {
        if (this.f1507f) {
            return;
        }
        this.f1507f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        for (K.d dVar : u1.g.a0(this.e)) {
            synchronized (dVar) {
                try {
                    if (!dVar.f378a) {
                        dVar.f378a = true;
                        dVar.f380c = true;
                        K.c cVar = dVar.f379b;
                        if (cVar != null) {
                            try {
                                cVar.a();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f380c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f380c = false;
                            dVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1508g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1508g = true;
            Iterator it = this.f1506d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1509h.k();
    }

    public final void c(int i, int i2) {
        D1.h.j("finalState", i);
        D1.h.j("lifecycleImpact", i2);
        int a2 = AbstractC0357e.a(i2);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1505c;
        if (a2 == 0) {
            if (this.f1503a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0070s + " mFinalState = " + D1.h.m(this.f1503a) + " -> " + D1.h.m(i) + '.');
                }
                this.f1503a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1503a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0070s + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + D1.h.l(this.f1504b) + " to ADDING.");
                }
                this.f1503a = 2;
                this.f1504b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0070s + " mFinalState = " + D1.h.m(this.f1503a) + " -> REMOVED. mLifecycleImpact  = " + D1.h.l(this.f1504b) + " to REMOVING.");
        }
        this.f1503a = 1;
        this.f1504b = 3;
    }

    public final void d() {
        int i = this.f1504b;
        T t2 = this.f1509h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
                D1.i.d(abstractComponentCallbacksC0070s, "fragmentStateManager.fragment");
                View I2 = abstractComponentCallbacksC0070s.I();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + I2.findFocus() + " on view " + I2 + " for Fragment " + abstractComponentCallbacksC0070s);
                }
                I2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = t2.f1485c;
        D1.i.d(abstractComponentCallbacksC0070s2, "fragmentStateManager.fragment");
        View findFocus = abstractComponentCallbacksC0070s2.f1584F.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0070s2.f().f1577k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0070s2);
            }
        }
        View I3 = this.f1505c.I();
        if (I3.getParent() == null) {
            t2.b();
            I3.setAlpha(RecyclerView.f2111C0);
        }
        if (I3.getAlpha() == RecyclerView.f2111C0 && I3.getVisibility() == 0) {
            I3.setVisibility(4);
        }
        r rVar = abstractComponentCallbacksC0070s2.f1587I;
        I3.setAlpha(rVar == null ? 1.0f : rVar.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + D1.h.m(this.f1503a) + " lifecycleImpact = " + D1.h.l(this.f1504b) + " fragment = " + this.f1505c + '}';
    }
}
