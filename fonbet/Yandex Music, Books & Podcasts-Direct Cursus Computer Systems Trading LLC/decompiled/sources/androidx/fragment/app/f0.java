package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import defpackage.j5r;
import defpackage.k5r;
import defpackage.ouj;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class f0 {
    public int a;
    public int b;
    public final o c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final b0 l;

    public f0(int i, int i2, b0 b0Var) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        o oVar = b0Var.c;
        oVar.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        oVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = oVar;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = b0Var;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (j5r j5rVar : CollectionsKt.w0(this.k)) {
            j5rVar.getClass();
            if (!j5rVar.b) {
                j5rVar.b(viewGroup);
            }
            j5rVar.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (y.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.mTransitioning = false;
        this.l.k();
    }

    public final void c(j5r j5rVar) {
        j5rVar.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(j5rVar) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        int D = ouj.D(i2);
        o oVar = this.c;
        if (D == 0) {
            if (this.a != 1) {
                if (y.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + k5r.x(this.a) + " -> " + k5r.x(i) + '.');
                }
                this.a = i;
                return;
            }
            return;
        }
        if (D == 1) {
            if (this.a == 1) {
                if (y.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + k5r.w(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                this.i = true;
                return;
            }
            return;
        }
        if (D != 2) {
            return;
        }
        if (y.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + oVar + " mFinalState = " + k5r.x(this.a) + " -> REMOVED. mLifecycleImpact  = " + k5r.w(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
        this.i = true;
    }

    public final String toString() {
        StringBuilder u = ouj.u("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        u.append(k5r.x(this.a));
        u.append(" lifecycleImpact = ");
        u.append(k5r.w(this.b));
        u.append(" fragment = ");
        u.append(this.c);
        u.append('}');
        return u.toString();
    }
}
