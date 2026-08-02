package androidx.fragment.app;

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
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0496j;
import androidx.lifecycle.InterfaceC0507v;
import com.IceFishing.LiveIceFishing.C5248R;
import h.AbstractActivityC4555k;
import h0.AbstractC4559b;
import h0.C4561d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import x0.C5180c;
import x0.C5181d;
import x0.InterfaceC5182e;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0479s implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0507v, androidx.lifecycle.Y, InterfaceC0496j, InterfaceC5182e {

    /* renamed from: t0, reason: collision with root package name */
    public static final Object f4995t0 = new Object();

    /* renamed from: B, reason: collision with root package name */
    public int f4997B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4999D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5000E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5001F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5002G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5003H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5004I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public N f5005K;

    /* renamed from: L, reason: collision with root package name */
    public C0483w f5006L;

    /* renamed from: N, reason: collision with root package name */
    public AbstractComponentCallbacksC0479s f5008N;

    /* renamed from: O, reason: collision with root package name */
    public int f5009O;

    /* renamed from: P, reason: collision with root package name */
    public int f5010P;

    /* renamed from: Q, reason: collision with root package name */
    public String f5011Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5012R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5013S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f5014T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5016V;

    /* renamed from: W, reason: collision with root package name */
    public ViewGroup f5017W;

    /* renamed from: X, reason: collision with root package name */
    public View f5018X;
    public boolean Y;

    /* renamed from: i0, reason: collision with root package name */
    public r f5020i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5021j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f5022k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f5023l0;
    public EnumC0501o m0;

    /* renamed from: n0, reason: collision with root package name */
    public C0509x f5025n0;

    /* renamed from: o0, reason: collision with root package name */
    public X f5026o0;

    /* renamed from: p0, reason: collision with root package name */
    public final androidx.lifecycle.C f5027p0;

    /* renamed from: q0, reason: collision with root package name */
    public C5181d f5028q0;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f5029r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C0477p f5030s0;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f5031u;

    /* renamed from: v, reason: collision with root package name */
    public SparseArray f5032v;

    /* renamed from: w, reason: collision with root package name */
    public Bundle f5033w;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f5035y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0479s f5036z;

    /* renamed from: n, reason: collision with root package name */
    public int f5024n = -1;

    /* renamed from: x, reason: collision with root package name */
    public String f5034x = UUID.randomUUID().toString();

    /* renamed from: A, reason: collision with root package name */
    public String f4996A = null;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f4998C = null;

    /* renamed from: M, reason: collision with root package name */
    public O f5007M = new O();

    /* renamed from: U, reason: collision with root package name */
    public final boolean f5015U = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f5019Z = true;

    public AbstractComponentCallbacksC0479s() {
        new G0.c(16, this);
        this.m0 = EnumC0501o.f5135x;
        this.f5027p0 = new androidx.lifecycle.C();
        new AtomicInteger();
        this.f5029r0 = new ArrayList();
        this.f5030s0 = new C0477p(this);
        g();
    }

    public final void A(int i, int i4, int i6, int i9) {
        if (this.f5020i0 == null && i == 0 && i4 == 0 && i6 == 0 && i9 == 0) {
            return;
        }
        b().f4986b = i;
        b().f4987c = i4;
        b().f4988d = i6;
        b().f4989e = i9;
    }

    public final void B(Bundle bundle) {
        N n9 = this.f5005K;
        if (n9 != null && (n9.f4810E || n9.f4811F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f5035y = bundle;
    }

    public X2.a a() {
        return new C0478q(this);
    }

    public final r b() {
        if (this.f5020i0 == null) {
            r rVar = new r();
            Object obj = f4995t0;
            rVar.f4991g = obj;
            rVar.f4992h = obj;
            rVar.i = obj;
            rVar.f4993j = 1.0f;
            rVar.f4994k = null;
            this.f5020i0 = rVar;
        }
        return this.f5020i0;
    }

    public final N c() {
        if (this.f5006L != null) {
            return this.f5007M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context d() {
        C0483w c0483w = this.f5006L;
        if (c0483w == null) {
            return null;
        }
        return c0483w.f5042A;
    }

    public final int e() {
        EnumC0501o enumC0501o = this.m0;
        return (enumC0501o == EnumC0501o.f5132u || this.f5008N == null) ? enumC0501o.ordinal() : Math.min(enumC0501o.ordinal(), this.f5008N.e());
    }

    public final N f() {
        N n9 = this.f5005K;
        if (n9 != null) {
            return n9;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void g() {
        this.f5025n0 = new C0509x(this);
        this.f5028q0 = new C5181d(this);
        ArrayList arrayList = this.f5029r0;
        C0477p c0477p = this.f5030s0;
        if (arrayList.contains(c0477p)) {
            return;
        }
        if (this.f5024n >= 0) {
            c0477p.a();
        } else {
            arrayList.add(c0477p);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0496j
    public final AbstractC4559b getDefaultViewModelCreationExtras() {
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
        C4561d c4561d = new C4561d(0);
        LinkedHashMap linkedHashMap = c4561d.f37969a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5115a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5087a, this);
        linkedHashMap.put(androidx.lifecycle.L.f5088b, this);
        Bundle bundle = this.f5035y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5089c, bundle);
        }
        return c4561d;
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        return this.f5025n0;
    }

    @Override // x0.InterfaceC5182e
    public final C5180c getSavedStateRegistry() {
        return this.f5028q0.f41812b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        if (this.f5005K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f5005K.f4816L.f4855c;
        androidx.lifecycle.X x9 = (androidx.lifecycle.X) hashMap.get(this.f5034x);
        if (x9 != null) {
            return x9;
        }
        androidx.lifecycle.X x10 = new androidx.lifecycle.X();
        hashMap.put(this.f5034x, x10);
        return x10;
    }

    public final void h() {
        g();
        this.f5023l0 = this.f5034x;
        this.f5034x = UUID.randomUUID().toString();
        this.f4999D = false;
        this.f5000E = false;
        this.f5001F = false;
        this.f5002G = false;
        this.f5003H = false;
        this.J = 0;
        this.f5005K = null;
        this.f5007M = new O();
        this.f5006L = null;
        this.f5009O = 0;
        this.f5010P = 0;
        this.f5011Q = null;
        this.f5012R = false;
        this.f5013S = false;
    }

    public final boolean i() {
        return this.f5006L != null && this.f4999D;
    }

    public final boolean j() {
        if (this.f5012R) {
            return true;
        }
        N n9 = this.f5005K;
        if (n9 != null) {
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f5008N;
            n9.getClass();
            if (abstractComponentCallbacksC0479s == null ? false : abstractComponentCallbacksC0479s.j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.J > 0;
    }

    public void l() {
        this.f5016V = true;
    }

    public void m(int i, int i4, Intent intent) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void n(AbstractActivityC0484x abstractActivityC0484x) {
        this.f5016V = true;
        C0483w c0483w = this.f5006L;
        if ((c0483w == null ? null : c0483w.f5046z) != null) {
            this.f5016V = true;
        }
    }

    public void o(Bundle bundle) {
        Bundle bundle2;
        this.f5016V = true;
        Bundle bundle3 = this.f5031u;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f5007M.Q(bundle2);
            O o4 = this.f5007M;
            o4.f4810E = false;
            o4.f4811F = false;
            o4.f4816L.f4858f = false;
            o4.t(1);
        }
        O o6 = this.f5007M;
        if (o6.f4835s >= 1) {
            return;
        }
        o6.f4810E = false;
        o6.f4811F = false;
        o6.f4816L.f4858f = false;
        o6.t(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5016V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0483w c0483w = this.f5006L;
        AbstractActivityC0484x abstractActivityC0484x = c0483w == null ? null : c0483w.f5046z;
        if (abstractActivityC0484x != null) {
            abstractActivityC0484x.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5016V = true;
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void q() {
        this.f5016V = true;
    }

    public void r() {
        this.f5016V = true;
    }

    public LayoutInflater s(Bundle bundle) {
        C0483w c0483w = this.f5006L;
        if (c0483w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC4555k abstractActivityC4555k = c0483w.f5045D;
        LayoutInflater cloneInContext = abstractActivityC4555k.getLayoutInflater().cloneInContext(abstractActivityC4555k);
        cloneInContext.setFactory2(this.f5007M.f4823f);
        return cloneInContext;
    }

    public abstract void t(Bundle bundle);

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5034x);
        if (this.f5009O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5009O));
        }
        if (this.f5011Q != null) {
            sb.append(" tag=");
            sb.append(this.f5011Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f5016V = true;
    }

    public void v() {
        this.f5016V = true;
    }

    public void w(Bundle bundle) {
        this.f5016V = true;
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5007M.K();
        this.f5004I = true;
        this.f5026o0 = new X(this, getViewModelStore(), new RunnableC0476o(this));
        View p9 = p(layoutInflater, viewGroup);
        this.f5018X = p9;
        if (p9 == null) {
            if (this.f5026o0.f4889w != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f5026o0 = null;
            return;
        }
        this.f5026o0.b();
        if (N.E(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f5018X + " for Fragment " + this);
        }
        View view = this.f5018X;
        X x9 = this.f5026o0;
        kotlin.jvm.internal.h.e(view, "<this>");
        view.setTag(C5248R.id.view_tree_lifecycle_owner, x9);
        View view2 = this.f5018X;
        X x10 = this.f5026o0;
        kotlin.jvm.internal.h.e(view2, "<this>");
        view2.setTag(C5248R.id.view_tree_view_model_store_owner, x10);
        View view3 = this.f5018X;
        X x11 = this.f5026o0;
        kotlin.jvm.internal.h.e(view3, "<this>");
        view3.setTag(C5248R.id.view_tree_saved_state_registry_owner, x11);
        this.f5027p0.e(this.f5026o0);
    }

    public final Context y() {
        Context d9 = d();
        if (d9 != null) {
            return d9;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View z() {
        View view = this.f5018X;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}
