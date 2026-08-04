package com.gamericefishpro.space.d;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.k0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.z4.g0;
import com.gamericefishpro.space.z4.i0;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.t0;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.w;
import com.gamericefishpro.space.z4.x0;
import com.gamericefishpro.space.z4.y0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Activity implements y0, com.gamericefishpro.space.z4.k, com.gamericefishpro.space.z5.e, t, com.gamericefishpro.space.j5.c, com.gamericefishpro.space.h.e, u {
    public final j A;
    public final CopyOnWriteArrayList B;
    public final CopyOnWriteArrayList C;
    public final CopyOnWriteArrayList D;
    public final CopyOnWriteArrayList E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public boolean H;
    public boolean I;
    public final com.gamericefishpro.space.oh.s J;
    public final com.gamericefishpro.space.oh.s K;
    public final com.gamericefishpro.space.oh.s L;
    public final w d = new w(this);
    public final com.gamericefishpro.space.s8.j e;
    public final com.gamericefishpro.space.vb.c i;
    public final com.gamericefishpro.space.u6.c v;
    public x0 w;
    public final h y;
    public final com.gamericefishpro.space.oh.s z;

    public k() {
        com.gamericefishpro.space.s8.j jVar = new com.gamericefishpro.space.s8.j();
        this.e = jVar;
        this.i = new com.gamericefishpro.space.vb.c(new b(this, 1));
        Intrinsics.checkNotNullParameter(this, "owner");
        com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.b6.b(this, new com.gamericefishpro.space.a3.b(24, this)));
        this.v = cVar;
        this.y = new h(this);
        this.z = com.gamericefishpro.space.oh.i.b(new c(this, 1));
        new AtomicInteger();
        this.A = new j(this);
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = new CopyOnWriteArrayList();
        this.E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.J = com.gamericefishpro.space.oh.i.b(new c(this, 2));
        w wVar = this.d;
        if (wVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        wVar.a(new com.gamericefishpro.space.z4.s(this) { // from class: com.gamericefishpro.space.d.e
            public final /* synthetic */ k e;

            {
                this.e = this;
            }

            @Override // com.gamericefishpro.space.z4.s
            public final void j(u uVar, com.gamericefishpro.space.z4.o event) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        k kVar = this.e;
                        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == com.gamericefishpro.space.z4.o.ON_STOP && (window = kVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.e;
                        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == com.gamericefishpro.space.z4.o.ON_DESTROY) {
                            kVar2.e.b = null;
                            if (!kVar2.isChangingConfigurations()) {
                                kVar2.f().a();
                            }
                            h hVar = kVar2.y;
                            k kVar3 = hVar.v;
                            kVar3.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.d.a(new com.gamericefishpro.space.z4.s(this) { // from class: com.gamericefishpro.space.d.e
            public final /* synthetic */ k e;

            {
                this.e = this;
            }

            @Override // com.gamericefishpro.space.z4.s
            public final void j(u uVar, com.gamericefishpro.space.z4.o event) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        k kVar = this.e;
                        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == com.gamericefishpro.space.z4.o.ON_STOP && (window = kVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.e;
                        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == com.gamericefishpro.space.z4.o.ON_DESTROY) {
                            kVar2.e.b = null;
                            if (!kVar2.isChangingConfigurations()) {
                                kVar2.f().a();
                            }
                            h hVar = kVar2.y;
                            k kVar3 = hVar.v;
                            kVar3.getWindow().getDecorView().removeCallbacks(hVar);
                            kVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        this.d.a(new com.gamericefishpro.space.z5.b(this));
        cVar.o();
        m0.d(this);
        ((com.gamericefishpro.space.u6.s) cVar.e).l("android:support:activity-result", new com.gamericefishpro.space.b5.a(1, this));
        f listener = new f(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        k kVar = (k) jVar.b;
        if (kVar != null) {
            listener.a(kVar);
        }
        ((CopyOnWriteArraySet) jVar.a).add(listener);
        this.K = com.gamericefishpro.space.oh.i.b(new c(this, 3));
        this.L = com.gamericefishpro.space.oh.i.b(new c(this, 4));
    }

    public static void h(k kVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // com.gamericefishpro.space.d.t
    public final r a() {
        return (r) this.L.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.y.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // com.gamericefishpro.space.z5.e
    public final com.gamericefishpro.space.u6.s b() {
        return (com.gamericefishpro.space.u6.s) this.v.e;
    }

    @Override // com.gamericefishpro.space.j5.c
    public final com.gamericefishpro.space.tb.s c() {
        return a().a().c;
    }

    @Override // com.gamericefishpro.space.z4.k
    public final u0 d() {
        return (u0) this.K.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (com.gamericefishpro.space.u6.f.q(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Intrinsics.checkNotNullParameter(event, "event");
            return super.dispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!com.gamericefishpro.space.u6.f.a) {
                    try {
                        com.gamericefishpro.space.u6.f.b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    com.gamericefishpro.space.u6.f.a = true;
                }
                Method method = com.gamericefishpro.space.u6.f.b;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, event);
                        if (objInvoke == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(event)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = l0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = k0.d;
            k0 k0Var = (k0) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (k0Var == null) {
                k0Var = new k0();
                k0Var.a = null;
                k0Var.b = null;
                k0Var.c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = k0Var.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = k0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (k0Var.a == null) {
                                k0Var.a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = k0.d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    k0Var.a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        k0Var.a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            View viewA = k0Var.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (k0Var.b == null) {
                        k0Var.b = new SparseArray();
                    }
                    k0Var.b.put(keyCode, new WeakReference(viewA));
                }
            }
            if (viewA != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (com.gamericefishpro.space.u6.f.q(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // com.gamericefishpro.space.z4.k
    public final com.gamericefishpro.space.c5.c e() {
        com.gamericefishpro.space.c5.f fVar = new com.gamericefishpro.space.c5.f(0);
        if (getApplication() != null) {
            fVar.b(t0.d, getApplication());
        }
        fVar.b(m0.a, this);
        fVar.b(m0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            fVar.b(m0.c, extras);
        }
        return fVar;
    }

    @Override // com.gamericefishpro.space.z4.y0
    public final x0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.w == null) {
            g gVar = (g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this.w = gVar.a;
            }
            if (this.w == null) {
                this.w = new x0();
            }
        }
        x0 x0Var = this.w;
        Intrinsics.b(x0Var);
        return x0Var;
    }

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        return this.d;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        m0.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        m0.j(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        com.gamericefishpro.space.z5.g.c(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView6, "<this>");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = i0.e;
        g0.b(this);
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.d.g(com.gamericefishpro.space.z4.p.i);
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.A.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((com.gamericefishpro.space.j5.a) this.J.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.B.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((com.gamericefishpro.space.c4.a) it.next()).accept(newConfig);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.v.p(bundle);
        com.gamericefishpro.space.s8.j jVar = this.e;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        jVar.b = this;
        Iterator it = ((CopyOnWriteArraySet) jVar.a).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
        j(bundle);
        int i = i0.e;
        g0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.i.e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((com.gamericefishpro.space.w4.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.i.e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((com.gamericefishpro.space.w4.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.H) {
            return;
        }
        Iterator it = this.E.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((com.gamericefishpro.space.c4.a) it.next()).accept(new com.gamericefishpro.space.r3.b(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.D.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((com.gamericefishpro.space.c4.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.i.e).iterator();
        if (it.hasNext()) {
            ((com.gamericefishpro.space.w4.i) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.I) {
            return;
        }
        Iterator it = this.F.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((com.gamericefishpro.space.c4.a) it.next()).accept(new com.gamericefishpro.space.r3.q(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.i.e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((com.gamericefishpro.space.w4.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.A.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        g gVar;
        x0 x0Var = this.w;
        if (x0Var == null && (gVar = (g) getLastNonConfigurationInstance()) != null) {
            x0Var = gVar.a;
        }
        if (x0Var == null) {
            return null;
        }
        g gVar2 = new g();
        gVar2.a = x0Var;
        return gVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        w wVar = this.d;
        if (wVar != null) {
            wVar.g(com.gamericefishpro.space.z4.p.i);
        }
        k(outState);
        this.v.q(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.C.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((com.gamericefishpro.space.c4.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.G.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (com.gamericefishpro.space.u6.f.F()) {
                com.gamericefishpro.space.u6.f.k("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            m mVar = (m) this.z.getValue();
            synchronized (mVar.b) {
                try {
                    mVar.c = true;
                    ArrayList arrayList = mVar.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Function0) obj).invoke();
                    }
                    mVar.d.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.y.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i2, int i3, int i4, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.H = true;
        try {
            super.onMultiWindowModeChanged(z, newConfig);
            this.H = false;
            Iterator it = this.E.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                com.gamericefishpro.space.c4.a aVar = (com.gamericefishpro.space.c4.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new com.gamericefishpro.space.r3.b(z));
            }
        } catch (Throwable th) {
            this.H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.I = true;
        try {
            super.onPictureInPictureModeChanged(z, newConfig);
            this.I = false;
            Iterator it = this.F.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                com.gamericefishpro.space.c4.a aVar = (com.gamericefishpro.space.c4.a) it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                aVar.accept(new com.gamericefishpro.space.r3.q(z));
            }
        } catch (Throwable th) {
            this.I = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.y.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.y.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
