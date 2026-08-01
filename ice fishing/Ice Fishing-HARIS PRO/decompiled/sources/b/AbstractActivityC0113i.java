package b;

import O.InterfaceC0034j;
import Z.C0071t;
import Z.C0073v;
import Z.E;
import a.AbstractC0078a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0092i;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import c.C0119a;
import c0.C0122c;
import com.lumenpath.harispro.hrnavigator.R;
import h.AbstractActivityC0168i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0230a;
import l0.C0233d;
import l0.InterfaceC0234e;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0113i extends Activity implements V, InterfaceC0092i, InterfaceC0234e, v, InterfaceC0101s, InterfaceC0034j {

    /* renamed from: a, reason: collision with root package name */
    public final C0103u f2281a = new C0103u(this);

    /* renamed from: b, reason: collision with root package name */
    public final C0119a f2282b = new C0119a();

    /* renamed from: c, reason: collision with root package name */
    public final M0.h f2283c;

    /* renamed from: d, reason: collision with root package name */
    public final C0103u f2284d;
    public final C0115k e;

    /* renamed from: f, reason: collision with root package name */
    public U f2285f;

    /* renamed from: g, reason: collision with root package name */
    public u f2286g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorC0112h f2287h;
    public final C0115k i;
    public final C0108d j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f2288k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f2289l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2290m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f2291n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f2292o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2293p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2294q;

    public AbstractActivityC0113i() {
        AbstractActivityC0168i abstractActivityC0168i = (AbstractActivityC0168i) this;
        this.f2283c = new M0.h(new D.a(10, abstractActivityC0168i));
        C0103u c0103u = new C0103u(this);
        this.f2284d = c0103u;
        C0115k c0115k = new C0115k(this);
        this.e = c0115k;
        this.f2286g = null;
        ExecutorC0112h executorC0112h = new ExecutorC0112h(abstractActivityC0168i);
        this.f2287h = executorC0112h;
        this.i = new C0115k(executorC0112h, new b1.b(6, abstractActivityC0168i));
        new AtomicInteger();
        this.j = new C0108d();
        this.f2288k = new CopyOnWriteArrayList();
        this.f2289l = new CopyOnWriteArrayList();
        this.f2290m = new CopyOnWriteArrayList();
        this.f2291n = new CopyOnWriteArrayList();
        this.f2292o = new CopyOnWriteArrayList();
        this.f2293p = false;
        this.f2294q = false;
        c0103u.a(new C0109e(abstractActivityC0168i, 0));
        c0103u.a(new C0109e(abstractActivityC0168i, 1));
        c0103u.a(new C0109e(abstractActivityC0168i, 2));
        c0115k.a();
        L.d(this);
        ((C0233d) c0115k.f2300c).f("android:support:activity-result", new C0071t(abstractActivityC0168i, 1));
        h(new C0073v(abstractActivityC0168i, 1));
    }

    @Override // androidx.lifecycle.InterfaceC0092i
    public final C0122c a() {
        C0122c c0122c = new C0122c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        if (application != null) {
            linkedHashMap.put(S.f2023f, getApplication());
        }
        linkedHashMap.put(L.f2008a, this);
        linkedHashMap.put(L.f2009b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(L.f2010c, getIntent().getExtras());
        }
        return c0122c;
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        return (C0233d) this.e.f2300c;
    }

    @Override // androidx.lifecycle.V
    public final U c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2285f == null) {
            C0111g c0111g = (C0111g) getLastNonConfigurationInstance();
            if (c0111g != null) {
                this.f2285f = c0111g.f2276a;
            }
            if (this.f2285f == null) {
                this.f2285f = new U();
            }
        }
        return this.f2285f;
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return this.f2284d;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        D1.i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        D1.i.d(decorView, "window.decorView");
        if (AbstractC0078a.u(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0078a.v(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        D1.i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        D1.i.d(decorView, "window.decorView");
        if (AbstractC0078a.u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // O.InterfaceC0034j
    public final boolean e(KeyEvent keyEvent) {
        D1.i.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g(N.a aVar) {
        this.f2288k.add(aVar);
    }

    public final void h(c.b bVar) {
        C0119a c0119a = this.f2282b;
        c0119a.getClass();
        if (c0119a.f2338b != null) {
            bVar.a();
        }
        c0119a.f2337a.add(bVar);
    }

    public final u i() {
        if (this.f2286g == null) {
            this.f2286g = new u(new B0.j(9, this));
            this.f2284d.a(new C0230a(4, this));
        }
        return this.f2286g;
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = H.f1998b;
        F.b(this);
    }

    public final void k(Bundle bundle) {
        D1.i.e(bundle, "outState");
        this.f2281a.g(EnumC0097n.f2040c);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.j.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2288k.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.b(bundle);
        C0119a c0119a = this.f2282b;
        c0119a.getClass();
        c0119a.f2338b = this;
        Iterator it = c0119a.f2337a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a();
        }
        j(bundle);
        int i = H.f1998b;
        F.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2283c.f617c).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f1409a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2283c.f617c).iterator();
        while (it.hasNext()) {
            if (((E) it.next()).f1409a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f2293p) {
            return;
        }
        Iterator it = this.f2291n.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).accept(new D.g(z2));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2290m.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f2283c.f617c).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f1409a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f2294q) {
            return;
        }
        Iterator it = this.f2292o.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).accept(new D.h(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2283c.f617c).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f1409a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.j.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0111g c0111g;
        U u2 = this.f2285f;
        if (u2 == null && (c0111g = (C0111g) getLastNonConfigurationInstance()) != null) {
            u2 = c0111g.f2276a;
        }
        if (u2 == null) {
            return null;
        }
        C0111g c0111g2 = new C0111g();
        c0111g2.f2276a = u2;
        return c0111g2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0103u c0103u = this.f2284d;
        if (c0103u != null) {
            c0103u.g(EnumC0097n.f2040c);
        }
        k(bundle);
        this.e.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f2289l.iterator();
        while (it.hasNext()) {
            ((N.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h0.f.q()) {
                h0.f.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0115k c0115k = this.i;
            synchronized (c0115k.f2299b) {
                try {
                    c0115k.f2298a = true;
                    Iterator it = ((ArrayList) c0115k.f2300c).iterator();
                    while (it.hasNext()) {
                        ((C1.a) it.next()).c();
                    }
                    ((ArrayList) c0115k.f2300c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        L.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        D1.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        h0.f.z(getWindow().getDecorView(), this);
        R.j.h0(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        D1.i.e(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
        View decorView3 = getWindow().getDecorView();
        ExecutorC0112h executorC0112h = this.f2287h;
        if (!executorC0112h.f2279c) {
            executorC0112h.f2279c = true;
            decorView3.getViewTreeObserver().addOnDrawListener(executorC0112h);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        this.f2293p = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f2293p = false;
            Iterator it = this.f2291n.iterator();
            while (it.hasNext()) {
                N.a aVar = (N.a) it.next();
                D1.i.e(configuration, "newConfig");
                aVar.accept(new D.g(z2));
            }
        } catch (Throwable th) {
            this.f2293p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        this.f2294q = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f2294q = false;
            Iterator it = this.f2292o.iterator();
            while (it.hasNext()) {
                N.a aVar = (N.a) it.next();
                D1.i.e(configuration, "newConfig");
                aVar.accept(new D.h(z2));
            }
        } catch (Throwable th) {
            this.f2294q = false;
            throw th;
        }
    }
}
