package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u.AbstractC5049e;
import v7.AbstractC5129j;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4946a;

    /* renamed from: b, reason: collision with root package name */
    public int f4947b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0475s f4948c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4949d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4950e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4951f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4952g;

    /* renamed from: h, reason: collision with root package name */
    public final V f4953h;

    public a0(int i, int i6, V v9, K.f fVar) {
        AbstractC4404f.l(i, "finalState");
        AbstractC4404f.l(i6, "lifecycleImpact");
        AbstractComponentCallbacksC0475s fragment = v9.f4907c;
        kotlin.jvm.internal.h.d(fragment, "fragmentStateManager.fragment");
        AbstractC4404f.l(i, "finalState");
        AbstractC4404f.l(i6, "lifecycleImpact");
        kotlin.jvm.internal.h.e(fragment, "fragment");
        this.f4946a = i;
        this.f4947b = i6;
        this.f4948c = fragment;
        this.f4949d = new ArrayList();
        this.f4950e = new LinkedHashSet();
        fVar.a(new K.e() { // from class: androidx.fragment.app.b0
            @Override // K.e
            public final void a() {
                a0 this$0 = a0.this;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                this$0.a();
            }
        });
        this.f4953h = v9;
    }

    public final void a() {
        if (this.f4951f) {
            return;
        }
        this.f4951f = true;
        LinkedHashSet linkedHashSet = this.f4950e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (K.f fVar : AbstractC5129j.O(linkedHashSet)) {
            synchronized (fVar) {
                try {
                    if (!fVar.f1477a) {
                        fVar.f1477a = true;
                        fVar.f1479c = true;
                        K.e eVar = fVar.f1478b;
                        if (eVar != null) {
                            try {
                                eVar.a();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f1479c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f1479c = false;
                            fVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f4952g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4952g = true;
            Iterator it = this.f4949d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f4953h.k();
    }

    public final void c(int i, int i6) {
        AbstractC4404f.l(i, "finalState");
        AbstractC4404f.l(i6, "lifecycleImpact");
        int d2 = AbstractC5049e.d(i6);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4948c;
        if (d2 == 0) {
            if (this.f4946a != 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0475s + " mFinalState = " + D.y.C(this.f4946a) + " -> " + D.y.C(i) + '.');
                }
                this.f4946a = i;
                return;
            }
            return;
        }
        if (d2 == 1) {
            if (this.f4946a == 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0475s + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + D.y.B(this.f4947b) + " to ADDING.");
                }
                this.f4946a = 2;
                this.f4947b = 2;
                return;
            }
            return;
        }
        if (d2 != 2) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0475s + " mFinalState = " + D.y.C(this.f4946a) + " -> REMOVED. mLifecycleImpact  = " + D.y.B(this.f4947b) + " to REMOVING.");
        }
        this.f4946a = 1;
        this.f4947b = 3;
    }

    public final void d() {
        int i = this.f4947b;
        V v9 = this.f4953h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
                kotlin.jvm.internal.h.d(abstractComponentCallbacksC0475s, "fragmentStateManager.fragment");
                View z3 = abstractComponentCallbacksC0475s.z();
                if (N.E(2)) {
                    Log.v("FragmentManager", "Clearing focus " + z3.findFocus() + " on view " + z3 + " for Fragment " + abstractComponentCallbacksC0475s);
                }
                z3.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = v9.f4907c;
        kotlin.jvm.internal.h.d(abstractComponentCallbacksC0475s2, "fragmentStateManager.fragment");
        View findFocus = abstractComponentCallbacksC0475s2.f5050X.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0475s2.b().f5026k = findFocus;
            if (N.E(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0475s2);
            }
        }
        View z6 = this.f4948c.z();
        if (z6.getParent() == null) {
            v9.b();
            z6.setAlpha(0.0f);
        }
        if (z6.getAlpha() == 0.0f && z6.getVisibility() == 0) {
            z6.setVisibility(4);
        }
        r rVar = abstractComponentCallbacksC0475s2.f5053n0;
        z6.setAlpha(rVar == null ? 1.0f : rVar.f5025j);
    }

    public final String toString() {
        StringBuilder j6 = AbstractC4404f.j("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        j6.append(D.y.C(this.f4946a));
        j6.append(" lifecycleImpact = ");
        j6.append(D.y.B(this.f4947b));
        j6.append(" fragment = ");
        j6.append(this.f4948c);
        j6.append('}');
        return j6.toString();
    }
}
