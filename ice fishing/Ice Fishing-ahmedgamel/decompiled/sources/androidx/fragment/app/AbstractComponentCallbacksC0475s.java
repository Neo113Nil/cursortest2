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
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0492j;
import androidx.lifecycle.InterfaceC0503v;
import com.icefishing.icefishingbigwin.C5275R;
import h.AbstractActivityC4551k;
import h0.AbstractC4554b;
import h0.C4556d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import x0.C5181c;
import x0.C5182d;
import x0.InterfaceC5183e;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0475s implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0503v, androidx.lifecycle.Y, InterfaceC0492j, InterfaceC5183e {

    /* renamed from: y0, reason: collision with root package name */
    public static final Object f5027y0 = new Object();

    /* renamed from: B, reason: collision with root package name */
    public int f5029B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5031D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5032E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5033F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5034G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5035H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5036I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public N f5037K;

    /* renamed from: L, reason: collision with root package name */
    public C0479w f5038L;

    /* renamed from: N, reason: collision with root package name */
    public AbstractComponentCallbacksC0475s f5040N;

    /* renamed from: O, reason: collision with root package name */
    public int f5041O;

    /* renamed from: P, reason: collision with root package name */
    public int f5042P;

    /* renamed from: Q, reason: collision with root package name */
    public String f5043Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5044R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5045S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f5046T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5048V;

    /* renamed from: W, reason: collision with root package name */
    public ViewGroup f5049W;

    /* renamed from: X, reason: collision with root package name */
    public View f5050X;
    public boolean Y;

    /* renamed from: n0, reason: collision with root package name */
    public r f5053n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f5054o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f5055p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f5056q0;

    /* renamed from: r0, reason: collision with root package name */
    public EnumC0497o f5057r0;

    /* renamed from: s0, reason: collision with root package name */
    public C0505x f5058s0;

    /* renamed from: t0, reason: collision with root package name */
    public X f5059t0;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f5060u;

    /* renamed from: u0, reason: collision with root package name */
    public final androidx.lifecycle.C f5061u0;

    /* renamed from: v, reason: collision with root package name */
    public SparseArray f5062v;

    /* renamed from: v0, reason: collision with root package name */
    public C5182d f5063v0;

    /* renamed from: w, reason: collision with root package name */
    public Bundle f5064w;

    /* renamed from: w0, reason: collision with root package name */
    public final ArrayList f5065w0;

    /* renamed from: x0, reason: collision with root package name */
    public final C0473p f5067x0;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f5068y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0475s f5069z;

    /* renamed from: n, reason: collision with root package name */
    public int f5052n = -1;

    /* renamed from: x, reason: collision with root package name */
    public String f5066x = UUID.randomUUID().toString();

    /* renamed from: A, reason: collision with root package name */
    public String f5028A = null;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f5030C = null;

    /* renamed from: M, reason: collision with root package name */
    public O f5039M = new O();

    /* renamed from: U, reason: collision with root package name */
    public final boolean f5047U = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f5051Z = true;

    public AbstractComponentCallbacksC0475s() {
        new G0.c(17, this);
        this.f5057r0 = EnumC0497o.f5168x;
        this.f5061u0 = new androidx.lifecycle.C();
        new AtomicInteger();
        this.f5065w0 = new ArrayList();
        this.f5067x0 = new C0473p(this);
        g();
    }

    public final void A(int i, int i6, int i9, int i10) {
        if (this.f5053n0 == null && i == 0 && i6 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        b().f5018b = i;
        b().f5019c = i6;
        b().f5020d = i9;
        b().f5021e = i10;
    }

    public final void B(Bundle bundle) {
        N n9 = this.f5037K;
        if (n9 != null && (n9.f4842E || n9.f4843F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f5068y = bundle;
    }

    public S0.f a() {
        return new C0474q(this);
    }

    public final r b() {
        if (this.f5053n0 == null) {
            r rVar = new r();
            Object obj = f5027y0;
            rVar.f5023g = obj;
            rVar.f5024h = obj;
            rVar.i = obj;
            rVar.f5025j = 1.0f;
            rVar.f5026k = null;
            this.f5053n0 = rVar;
        }
        return this.f5053n0;
    }

    public final N c() {
        if (this.f5038L != null) {
            return this.f5039M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context d() {
        C0479w c0479w = this.f5038L;
        if (c0479w == null) {
            return null;
        }
        return c0479w.f5076u;
    }

    public final int e() {
        EnumC0497o enumC0497o = this.f5057r0;
        return (enumC0497o == EnumC0497o.f5165u || this.f5040N == null) ? enumC0497o.ordinal() : Math.min(enumC0497o.ordinal(), this.f5040N.e());
    }

    public final N f() {
        N n9 = this.f5037K;
        if (n9 != null) {
            return n9;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void g() {
        this.f5058s0 = new C0505x(this);
        this.f5063v0 = new C5182d(this);
        ArrayList arrayList = this.f5065w0;
        C0473p c0473p = this.f5067x0;
        if (arrayList.contains(c0473p)) {
            return;
        }
        if (this.f5052n >= 0) {
            c0473p.a();
        } else {
            arrayList.add(c0473p);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0492j
    public final AbstractC4554b getDefaultViewModelCreationExtras() {
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
        C4556d c4556d = new C4556d(0);
        LinkedHashMap linkedHashMap = c4556d.f37943a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f5148a, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f5120a, this);
        linkedHashMap.put(androidx.lifecycle.L.f5121b, this);
        Bundle bundle = this.f5068y;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f5122c, bundle);
        }
        return c4556d;
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        return this.f5058s0;
    }

    @Override // x0.InterfaceC5183e
    public final C5181c getSavedStateRegistry() {
        return this.f5063v0.f41757b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        if (this.f5037K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f5037K.f4848L.f4887c;
        androidx.lifecycle.X x9 = (androidx.lifecycle.X) hashMap.get(this.f5066x);
        if (x9 != null) {
            return x9;
        }
        androidx.lifecycle.X x10 = new androidx.lifecycle.X();
        hashMap.put(this.f5066x, x10);
        return x10;
    }

    public final void h() {
        g();
        this.f5056q0 = this.f5066x;
        this.f5066x = UUID.randomUUID().toString();
        this.f5031D = false;
        this.f5032E = false;
        this.f5033F = false;
        this.f5034G = false;
        this.f5035H = false;
        this.J = 0;
        this.f5037K = null;
        this.f5039M = new O();
        this.f5038L = null;
        this.f5041O = 0;
        this.f5042P = 0;
        this.f5043Q = null;
        this.f5044R = false;
        this.f5045S = false;
    }

    public final boolean i() {
        return this.f5038L != null && this.f5031D;
    }

    public final boolean j() {
        if (this.f5044R) {
            return true;
        }
        N n9 = this.f5037K;
        if (n9 != null) {
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f5040N;
            n9.getClass();
            if (abstractComponentCallbacksC0475s == null ? false : abstractComponentCallbacksC0475s.j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.J > 0;
    }

    public void l() {
        this.f5048V = true;
    }

    public void m(int i, int i6, Intent intent) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i6 + " data: " + intent);
        }
    }

    public void n(AbstractActivityC0480x abstractActivityC0480x) {
        this.f5048V = true;
        C0479w c0479w = this.f5038L;
        if ((c0479w == null ? null : c0479w.f5075n) != null) {
            this.f5048V = true;
        }
    }

    public void o(Bundle bundle) {
        Bundle bundle2;
        this.f5048V = true;
        Bundle bundle3 = this.f5060u;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f5039M.Q(bundle2);
            O o6 = this.f5039M;
            o6.f4842E = false;
            o6.f4843F = false;
            o6.f4848L.f4890f = false;
            o6.t(1);
        }
        O o9 = this.f5039M;
        if (o9.f4867s >= 1) {
            return;
        }
        o9.f4842E = false;
        o9.f4843F = false;
        o9.f4848L.f4890f = false;
        o9.t(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5048V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0479w c0479w = this.f5038L;
        AbstractActivityC0480x abstractActivityC0480x = c0479w == null ? null : c0479w.f5075n;
        if (abstractActivityC0480x != null) {
            abstractActivityC0480x.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5048V = true;
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void q() {
        this.f5048V = true;
    }

    public void r() {
        this.f5048V = true;
    }

    public LayoutInflater s(Bundle bundle) {
        C0479w c0479w = this.f5038L;
        if (c0479w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC4551k abstractActivityC4551k = c0479w.f5079x;
        LayoutInflater cloneInContext = abstractActivityC4551k.getLayoutInflater().cloneInContext(abstractActivityC4551k);
        cloneInContext.setFactory2(this.f5039M.f4855f);
        return cloneInContext;
    }

    public abstract void t(Bundle bundle);

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5066x);
        if (this.f5041O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5041O));
        }
        if (this.f5043Q != null) {
            sb.append(" tag=");
            sb.append(this.f5043Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f5048V = true;
    }

    public void v() {
        this.f5048V = true;
    }

    public void w(Bundle bundle) {
        this.f5048V = true;
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5039M.K();
        this.f5036I = true;
        this.f5059t0 = new X(this, getViewModelStore(), new RunnableC0472o(this));
        View p9 = p(layoutInflater, viewGroup);
        this.f5050X = p9;
        if (p9 == null) {
            if (this.f5059t0.f4921w != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f5059t0 = null;
            return;
        }
        this.f5059t0.b();
        if (N.E(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f5050X + " for Fragment " + this);
        }
        View view = this.f5050X;
        X x9 = this.f5059t0;
        kotlin.jvm.internal.h.e(view, "<this>");
        view.setTag(C5275R.id.view_tree_lifecycle_owner, x9);
        View view2 = this.f5050X;
        X x10 = this.f5059t0;
        kotlin.jvm.internal.h.e(view2, "<this>");
        view2.setTag(C5275R.id.view_tree_view_model_store_owner, x10);
        View view3 = this.f5050X;
        X x11 = this.f5059t0;
        kotlin.jvm.internal.h.e(view3, "<this>");
        view3.setTag(C5275R.id.view_tree_saved_state_registry_owner, x11);
        this.f5061u0.e(this.f5059t0);
    }

    public final Context y() {
        Context d2 = d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View z() {
        View view = this.f5050X;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}
