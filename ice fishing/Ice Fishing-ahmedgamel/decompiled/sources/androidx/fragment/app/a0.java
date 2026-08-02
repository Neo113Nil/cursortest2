package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u.AbstractC5050e;
import v7.AbstractC5119j;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4914a;

    /* renamed from: b, reason: collision with root package name */
    public int f4915b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0479s f4916c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4917d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4919f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4920g;

    /* renamed from: h, reason: collision with root package name */
    public final V f4921h;

    public a0(int i, int i4, V v9, K.f fVar) {
        Wv.n(i, "finalState");
        Wv.n(i4, "lifecycleImpact");
        AbstractComponentCallbacksC0479s fragment = v9.f4875c;
        kotlin.jvm.internal.h.d(fragment, "fragmentStateManager.fragment");
        Wv.n(i, "finalState");
        Wv.n(i4, "lifecycleImpact");
        kotlin.jvm.internal.h.e(fragment, "fragment");
        this.f4914a = i;
        this.f4915b = i4;
        this.f4916c = fragment;
        this.f4917d = new ArrayList();
        this.f4918e = new LinkedHashSet();
        fVar.a(new K.e() { // from class: androidx.fragment.app.b0
            @Override // K.e
            public final void a() {
                a0 this$0 = a0.this;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                this$0.a();
            }
        });
        this.f4921h = v9;
    }

    public final void a() {
        if (this.f4919f) {
            return;
        }
        this.f4919f = true;
        LinkedHashSet linkedHashSet = this.f4918e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (K.f fVar : AbstractC5119j.M(linkedHashSet)) {
            synchronized (fVar) {
                try {
                    if (!fVar.f1586a) {
                        fVar.f1586a = true;
                        fVar.f1588c = true;
                        K.e eVar = fVar.f1587b;
                        if (eVar != null) {
                            try {
                                eVar.a();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f1588c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f1588c = false;
                            fVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f4920g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4920g = true;
            Iterator it = this.f4917d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f4921h.k();
    }

    public final void c(int i, int i4) {
        Wv.n(i, "finalState");
        Wv.n(i4, "lifecycleImpact");
        int d9 = AbstractC5050e.d(i4);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4916c;
        if (d9 == 0) {
            if (this.f4914a != 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0479s + " mFinalState = " + D.x.C(this.f4914a) + " -> " + D.x.C(i) + '.');
                }
                this.f4914a = i;
                return;
            }
            return;
        }
        if (d9 == 1) {
            if (this.f4914a == 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0479s + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + D.x.B(this.f4915b) + " to ADDING.");
                }
                this.f4914a = 2;
                this.f4915b = 2;
                return;
            }
            return;
        }
        if (d9 != 2) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0479s + " mFinalState = " + D.x.C(this.f4914a) + " -> REMOVED. mLifecycleImpact  = " + D.x.B(this.f4915b) + " to REMOVING.");
        }
        this.f4914a = 1;
        this.f4915b = 3;
    }

    public final void d() {
        int i = this.f4915b;
        V v9 = this.f4921h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
                kotlin.jvm.internal.h.d(abstractComponentCallbacksC0479s, "fragmentStateManager.fragment");
                View z6 = abstractComponentCallbacksC0479s.z();
                if (N.E(2)) {
                    Log.v("FragmentManager", "Clearing focus " + z6.findFocus() + " on view " + z6 + " for Fragment " + abstractComponentCallbacksC0479s);
                }
                z6.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = v9.f4875c;
        kotlin.jvm.internal.h.d(abstractComponentCallbacksC0479s2, "fragmentStateManager.fragment");
        View findFocus = abstractComponentCallbacksC0479s2.f5018X.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0479s2.b().f4994k = findFocus;
            if (N.E(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0479s2);
            }
        }
        View z9 = this.f4916c.z();
        if (z9.getParent() == null) {
            v9.b();
            z9.setAlpha(0.0f);
        }
        if (z9.getAlpha() == 0.0f && z9.getVisibility() == 0) {
            z9.setVisibility(4);
        }
        r rVar = abstractComponentCallbacksC0479s2.f5020i0;
        z9.setAlpha(rVar == null ? 1.0f : rVar.f4993j);
    }

    public final String toString() {
        StringBuilder l9 = Wv.l("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        l9.append(D.x.C(this.f4914a));
        l9.append(" lifecycleImpact = ");
        l9.append(D.x.B(this.f4915b));
        l9.append(" fragment = ");
        l9.append(this.f4916c);
        l9.append('}');
        return l9.toString();
    }
}
