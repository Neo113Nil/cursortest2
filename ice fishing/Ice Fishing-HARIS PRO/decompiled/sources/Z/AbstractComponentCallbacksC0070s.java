package Z;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0092i;
import androidx.lifecycle.InterfaceC0101s;
import b.C0115k;
import c0.C0122c;
import com.lumenpath.harispro.hrnavigator.R;
import h.AbstractActivityC0168i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0233d;
import l0.InterfaceC0234e;

/* renamed from: Z.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0070s implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0101s, androidx.lifecycle.V, InterfaceC0092i, InterfaceC0234e {

    /* renamed from: V, reason: collision with root package name */
    public static final Object f1578V = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1579A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1580B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1582D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup f1583E;

    /* renamed from: F, reason: collision with root package name */
    public View f1584F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1585G;

    /* renamed from: I, reason: collision with root package name */
    public r f1587I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public LayoutInflater f1588K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f1589L;

    /* renamed from: M, reason: collision with root package name */
    public String f1590M;

    /* renamed from: N, reason: collision with root package name */
    public EnumC0097n f1591N;

    /* renamed from: O, reason: collision with root package name */
    public C0103u f1592O;

    /* renamed from: P, reason: collision with root package name */
    public V f1593P;

    /* renamed from: Q, reason: collision with root package name */
    public final androidx.lifecycle.z f1594Q;

    /* renamed from: R, reason: collision with root package name */
    public C0115k f1595R;

    /* renamed from: S, reason: collision with root package name */
    public int f1596S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f1597T;

    /* renamed from: U, reason: collision with root package name */
    public final C0068p f1598U;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1600b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1601c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1602d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1603f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0070s f1604g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1606k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1607l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1608m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1609n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1610o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1611p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1612q;

    /* renamed from: r, reason: collision with root package name */
    public int f1613r;

    /* renamed from: s, reason: collision with root package name */
    public M f1614s;

    /* renamed from: t, reason: collision with root package name */
    public C0074w f1615t;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0070s f1617v;

    /* renamed from: w, reason: collision with root package name */
    public int f1618w;

    /* renamed from: x, reason: collision with root package name */
    public int f1619x;

    /* renamed from: y, reason: collision with root package name */
    public String f1620y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1621z;

    /* renamed from: a, reason: collision with root package name */
    public int f1599a = -1;
    public String e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f1605h = null;
    public Boolean j = null;

    /* renamed from: u, reason: collision with root package name */
    public M f1616u = new M();

    /* renamed from: C, reason: collision with root package name */
    public final boolean f1581C = true;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1586H = true;

    public AbstractComponentCallbacksC0070s() {
        new B0.j(6, this);
        this.f1591N = EnumC0097n.e;
        this.f1594Q = new androidx.lifecycle.z();
        new AtomicInteger();
        this.f1597T = new ArrayList();
        this.f1598U = new C0068p(this);
        l();
    }

    public void A() {
        this.f1582D = true;
    }

    public void B() {
        this.f1582D = true;
    }

    public void C(View view) {
    }

    public void D(Bundle bundle) {
        this.f1582D = true;
    }

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1616u.M();
        this.f1612q = true;
        this.f1593P = new V(this, c(), new D.a(8, this));
        View u2 = u(layoutInflater, viewGroup, bundle);
        this.f1584F = u2;
        if (u2 == null) {
            if (this.f1593P.f1497d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1593P = null;
            return;
        }
        this.f1593P.f();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f1584F + " for Fragment " + this);
        }
        androidx.lifecycle.L.f(this.f1584F, this.f1593P);
        View view = this.f1584F;
        V v2 = this.f1593P;
        D1.i.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, v2);
        h0.f.z(this.f1584F, this.f1593P);
        this.f1594Q.d(this.f1593P);
    }

    public final AbstractActivityC0168i F() {
        C0074w c0074w = this.f1615t;
        AbstractActivityC0168i abstractActivityC0168i = c0074w == null ? null : c0074w.f1628a;
        if (abstractActivityC0168i != null) {
            return abstractActivityC0168i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle G() {
        Bundle bundle = this.f1603f;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context H() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View I() {
        View view = this.f1584F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void J() {
        Bundle bundle;
        Bundle bundle2 = this.f1600b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f1616u.S(bundle);
        M m2 = this.f1616u;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(1);
    }

    public final void K(int i, int i2, int i3, int i4) {
        if (this.f1587I == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1571b = i;
        f().f1572c = i2;
        f().f1573d = i3;
        f().e = i4;
    }

    public final void L(Bundle bundle) {
        M m2 = this.f1614s;
        if (m2 != null) {
            if (m2 == null ? false : m2.K()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1603f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0092i
    public final C0122c a() {
        Application application;
        Context applicationContext = H().getApplicationContext();
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
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + H().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0122c c0122c = new C0122c(0);
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.S.f2023f, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f2008a, this);
        linkedHashMap.put(androidx.lifecycle.L.f2009b, this);
        Bundle bundle = this.f1603f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.L.f2010c, bundle);
        }
        return c0122c;
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        return (C0233d) this.f1595R.f2300c;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U c() {
        if (this.f1614s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1614s.f1433M.f1469d;
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) hashMap.get(this.e);
        if (u2 != null) {
            return u2;
        }
        androidx.lifecycle.U u3 = new androidx.lifecycle.U();
        hashMap.put(this.e, u3);
        return u3;
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return this.f1592O;
    }

    public R.j e() {
        return new C0069q(this);
    }

    public final r f() {
        if (this.f1587I == null) {
            r rVar = new r();
            Object obj = f1578V;
            rVar.f1575g = obj;
            rVar.f1576h = obj;
            rVar.i = obj;
            rVar.j = 1.0f;
            rVar.f1577k = null;
            this.f1587I = rVar;
        }
        return this.f1587I;
    }

    public final M g() {
        if (this.f1615t != null) {
            return this.f1616u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0074w c0074w = this.f1615t;
        if (c0074w == null) {
            return null;
        }
        return c0074w.f1629b;
    }

    public final int i() {
        EnumC0097n enumC0097n = this.f1591N;
        return (enumC0097n == EnumC0097n.f2039b || this.f1617v == null) ? enumC0097n.ordinal() : Math.min(enumC0097n.ordinal(), this.f1617v.i());
    }

    public final M j() {
        M m2 = this.f1614s;
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String k(int i) {
        return H().getResources().getString(i);
    }

    public final void l() {
        this.f1592O = new C0103u(this);
        this.f1595R = new C0115k(this);
        ArrayList arrayList = this.f1597T;
        C0068p c0068p = this.f1598U;
        if (arrayList.contains(c0068p)) {
            return;
        }
        if (this.f1599a < 0) {
            arrayList.add(c0068p);
            return;
        }
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = c0068p.f1568a;
        abstractComponentCallbacksC0070s.f1595R.a();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0070s);
        Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
        abstractComponentCallbacksC0070s.f1595R.b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void m() {
        l();
        this.f1590M = this.e;
        this.e = UUID.randomUUID().toString();
        this.f1606k = false;
        this.f1607l = false;
        this.f1609n = false;
        this.f1610o = false;
        this.f1611p = false;
        this.f1613r = 0;
        this.f1614s = null;
        this.f1616u = new M();
        this.f1615t = null;
        this.f1618w = 0;
        this.f1619x = 0;
        this.f1620y = null;
        this.f1621z = false;
        this.f1579A = false;
    }

    public final boolean n() {
        return this.f1615t != null && this.f1606k;
    }

    public final boolean o() {
        if (!this.f1621z) {
            M m2 = this.f1614s;
            if (m2 == null) {
                return false;
            }
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1617v;
            m2.getClass();
            if (!(abstractComponentCallbacksC0070s == null ? false : abstractComponentCallbacksC0070s.o())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1582D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        F().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1582D = true;
    }

    public final boolean p() {
        return this.f1613r > 0;
    }

    public void q() {
        this.f1582D = true;
    }

    public final void r(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void s(AbstractActivityC0168i abstractActivityC0168i) {
        this.f1582D = true;
        C0074w c0074w = this.f1615t;
        if ((c0074w == null ? null : c0074w.f1628a) != null) {
            this.f1582D = true;
        }
    }

    public void t(Bundle bundle) {
        this.f1582D = true;
        J();
        M m2 = this.f1616u;
        if (m2.f1451t >= 1) {
            return;
        }
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.f1618w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1618w));
        }
        if (this.f1620y != null) {
            sb.append(" tag=");
            sb.append(this.f1620y);
        }
        sb.append(")");
        return sb.toString();
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f1596S;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void v() {
        this.f1582D = true;
    }

    public void w() {
        this.f1582D = true;
    }

    public LayoutInflater x(Bundle bundle) {
        C0074w c0074w = this.f1615t;
        if (c0074w == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0168i abstractActivityC0168i = c0074w.e;
        LayoutInflater cloneInContext = abstractActivityC0168i.getLayoutInflater().cloneInContext(abstractActivityC0168i);
        cloneInContext.setFactory2(this.f1616u.f1439f);
        return cloneInContext;
    }

    public void y(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1582D = true;
        C0074w c0074w = this.f1615t;
        if ((c0074w == null ? null : c0074w.f1628a) != null) {
            this.f1582D = true;
        }
    }

    public void z(Bundle bundle) {
    }
}
