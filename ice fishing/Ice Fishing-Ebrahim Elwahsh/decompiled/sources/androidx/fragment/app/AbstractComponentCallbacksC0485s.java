package androidx.fragment.app;

import a.AbstractC0415a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0502j;
import androidx.lifecycle.InterfaceC0513v;
import com.icefishing.icefishingliveapp.C5284R;
import h.AbstractActivityC4553l;
import h0.AbstractC4556b;
import h0.C4558d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import x0.C5202c;
import x0.C5203d;
import x0.InterfaceC5204e;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0485s implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0513v, androidx.lifecycle.Y, InterfaceC0502j, InterfaceC5204e {

    /* renamed from: y0, reason: collision with root package name */
    public static final Object f5139y0 = new Object();

    /* renamed from: B, reason: collision with root package name */
    public int f5141B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5143D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5144E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5145F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5146G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5147H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5148I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public N f5149K;

    /* renamed from: L, reason: collision with root package name */
    public C0489w f5150L;

    /* renamed from: N, reason: collision with root package name */
    public AbstractComponentCallbacksC0485s f5152N;

    /* renamed from: O, reason: collision with root package name */
    public int f5153O;

    /* renamed from: P, reason: collision with root package name */
    public int f5154P;

    /* renamed from: Q, reason: collision with root package name */
    public String f5155Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5156R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5157S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f5158T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5160V;

    /* renamed from: W, reason: collision with root package name */
    public ViewGroup f5161W;

    /* renamed from: X, reason: collision with root package name */
    public View f5162X;
    public boolean Y;

    /* renamed from: n0, reason: collision with root package name */
    public r f5165n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f5166o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f5167p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f5168q0;

    /* renamed from: r0, reason: collision with root package name */
    public EnumC0507o f5169r0;

    /* renamed from: s0, reason: collision with root package name */
    public C0515x f5170s0;

    /* renamed from: t0, reason: collision with root package name */
    public X f5171t0;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f5172u;

    /* renamed from: u0, reason: collision with root package name */
    public final androidx.lifecycle.C f5173u0;

    /* renamed from: v, reason: collision with root package name */
    public SparseArray f5174v;

    /* renamed from: v0, reason: collision with root package name */
    public C5203d f5175v0;

    /* renamed from: w, reason: collision with root package name */
    public Bundle f5176w;

    /* renamed from: w0, reason: collision with root package name */
    public final ArrayList f5177w0;

    /* renamed from: x0, reason: collision with root package name */
    public final C0483p f5179x0;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f5180y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0485s f5181z;

    /* renamed from: n, reason: collision with root package name */
    public int f5164n = -1;

    /* renamed from: x, reason: collision with root package name */
    public String f5178x = UUID.randomUUID().toString();

    /* renamed from: A, reason: collision with root package name */
    public String f5140A = null;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f5142C = null;

    /* renamed from: M, reason: collision with root package name */
    public O f5151M = new O();

    /* renamed from: U, reason: collision with root package name */
    public final boolean f5159U = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f5163Z = true;

    public AbstractComponentCallbacksC0485s() {
        new F3.C(14, this);
        this.f5169r0 = EnumC0507o.f5280x;
        this.f5173u0 = new androidx.lifecycle.C();
        new AtomicInteger();
        this.f5177w0 = new ArrayList();
        this.f5179x0 = new C0483p(this);
        g();
    }

    public final void A(int i, int i4, int i9, int i10) {
        if (this.f5165n0 == null && i == 0 && i4 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        b().f5130b = i;
        b().f5131c = i4;
        b().f5132d = i9;
        b().f5133e = i10;
    }

    public final void B(Bundle bundle) {
        N n9 = this.f5149K;
        if (n9 != null && (n9.f4954E || n9.f4955F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f5180y = bundle;
    }

    public AbstractC0415a a() {
        return new C0484q(this);
    }

    public final r b() {
        if (this.f5165n0 == null) {
            r rVar = new r();
            Object obj = f5139y0;
            rVar.f5135g = obj;
            rVar.f5136h = obj;
            rVar.i = obj;
            rVar.f5137j = 1.0f;
            rVar.f5138k = null;
            this.f5165n0 = rVar;
        }
        return this.f5165n0;
    }

    public final N c() {
        if (this.f5150L != null) {
            return this.f5151M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context d() {
        C0489w c0489w = this.f5150L;
        if (c0489w == null) {
            return null;
        }
        return c0489w.f5188u;
    }

    public final int e() {
        EnumC0507o enumC0507o = this.f5169r0;
        return (enumC0507o == EnumC0507o.f5277u || this.f5152N == null) ? enumC0507o.ordinal() : Math.min(enumC0507o.ordinal(), this.f5152N.e());
    }

    public final N f() {
        N n9 = this.f5149K;
        if (n9 != null) {
            return n9;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void g() {
        this.f5170s0 = new C0515x(this);
        this.f5175v0 = new C5203d(this);
        ArrayList arrayList = this.f5177w0;
        C0483p c0483p = this.f5179x0;
        if (arrayList.contains(c0483p)) {
            return;
        }
        if (this.f5164n >= 0) {
            c0483p.a();
        } else {
            arrayList.add(c0483p);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0502j
    public final AbstractC4556b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && N.E(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C4558d c4558d = new C4558d(0);
        LinkedHashMap linkedHashMap = c4558d.f38143a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5260a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5232a, this);
        linkedHashMap.put(androidx.lifecycle.L.f5233b, this);
        Bundle bundle = this.f5180y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5234c, bundle);
        }
        return c4558d;
    }

    @Override // androidx.lifecycle.InterfaceC0513v
    public final AbstractC0508p getLifecycle() {
        return this.f5170s0;
    }

    @Override // x0.InterfaceC5204e
    public final C5202c getSavedStateRegistry() {
        return this.f5175v0.f41773b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        if (this.f5149K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f5149K.f4960L.f4999c;
        androidx.lifecycle.X x3 = (androidx.lifecycle.X) hashMap.get(this.f5178x);
        if (x3 != null) {
            return x3;
        }
        androidx.lifecycle.X x9 = new androidx.lifecycle.X();
        hashMap.put(this.f5178x, x9);
        return x9;
    }

    public final void h() {
        g();
        this.f5168q0 = this.f5178x;
        this.f5178x = UUID.randomUUID().toString();
        this.f5143D = false;
        this.f5144E = false;
        this.f5145F = false;
        this.f5146G = false;
        this.f5147H = false;
        this.J = 0;
        this.f5149K = null;
        this.f5151M = new O();
        this.f5150L = null;
        this.f5153O = 0;
        this.f5154P = 0;
        this.f5155Q = null;
        this.f5156R = false;
        this.f5157S = false;
    }

    public final boolean i() {
        return this.f5150L != null && this.f5143D;
    }

    public final boolean j() {
        if (this.f5156R) {
            return true;
        }
        N n9 = this.f5149K;
        if (n9 != null) {
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5152N;
            n9.getClass();
            if (abstractComponentCallbacksC0485s == null ? false : abstractComponentCallbacksC0485s.j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.J > 0;
    }

    public void l() {
        this.f5160V = true;
    }

    public void m(int i, int i4, Intent intent) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void n(AbstractActivityC0490x abstractActivityC0490x) {
        this.f5160V = true;
        C0489w c0489w = this.f5150L;
        if ((c0489w == null ? null : c0489w.f5187n) != null) {
            this.f5160V = true;
        }
    }

    public void o(Bundle bundle) {
        Bundle bundle2;
        this.f5160V = true;
        Bundle bundle3 = this.f5172u;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f5151M.Q(bundle2);
            O o9 = this.f5151M;
            o9.f4954E = false;
            o9.f4955F = false;
            o9.f4960L.f5002f = false;
            o9.t(1);
        }
        O o10 = this.f5151M;
        if (o10.f4979s >= 1) {
            return;
        }
        o10.f4954E = false;
        o10.f4955F = false;
        o10.f4960L.f5002f = false;
        o10.t(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5160V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0489w c0489w = this.f5150L;
        AbstractActivityC0490x abstractActivityC0490x = c0489w == null ? null : c0489w.f5187n;
        if (abstractActivityC0490x != null) {
            abstractActivityC0490x.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5160V = true;
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void q() {
        this.f5160V = true;
    }

    public void r() {
        this.f5160V = true;
    }

    public LayoutInflater s(Bundle bundle) {
        C0489w c0489w = this.f5150L;
        if (c0489w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC4553l abstractActivityC4553l = c0489w.f5191x;
        LayoutInflater cloneInContext = abstractActivityC4553l.getLayoutInflater().cloneInContext(abstractActivityC4553l);
        cloneInContext.setFactory2(this.f5151M.f4967f);
        return cloneInContext;
    }

    public abstract void t(Bundle bundle);

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5178x);
        if (this.f5153O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5153O));
        }
        if (this.f5155Q != null) {
            sb.append(" tag=");
            sb.append(this.f5155Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f5160V = true;
    }

    public void v() {
        this.f5160V = true;
    }

    public void w(Bundle bundle) {
        this.f5160V = true;
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5151M.K();
        this.f5148I = true;
        this.f5171t0 = new X(this, getViewModelStore(), new RunnableC0482o(this));
        View p6 = p(layoutInflater, viewGroup);
        this.f5162X = p6;
        if (p6 == null) {
            if (this.f5171t0.f5033w != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f5171t0 = null;
            return;
        }
        this.f5171t0.b();
        if (N.E(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f5162X + " for Fragment " + this);
        }
        View view = this.f5162X;
        X x3 = this.f5171t0;
        kotlin.jvm.internal.h.e(view, "<this>");
        view.setTag(C5284R.id.view_tree_lifecycle_owner, x3);
        View view2 = this.f5162X;
        X x9 = this.f5171t0;
        kotlin.jvm.internal.h.e(view2, "<this>");
        view2.setTag(C5284R.id.view_tree_view_model_store_owner, x9);
        View view3 = this.f5162X;
        X x10 = this.f5171t0;
        kotlin.jvm.internal.h.e(view3, "<this>");
        view3.setTag(C5284R.id.view_tree_saved_state_registry_owner, x10);
        this.f5173u0.e(this.f5171t0);
    }

    public final Context y() {
        Context d2 = d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View z() {
        View view = this.f5162X;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}
