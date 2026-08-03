package d;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Application;
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
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bc.a0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.fortheloss.st.MainActivity;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class o extends Activity implements y0, androidx.lifecycle.k, e4.e, z, g.d, androidx.lifecycle.u {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.w f1510g = new androidx.lifecycle.w(this, true);

    /* renamed from: h, reason: collision with root package name */
    public final f.a f1511h;

    /* renamed from: i, reason: collision with root package name */
    public final f8.c f1512i;

    /* renamed from: j, reason: collision with root package name */
    public final x4.s f1513j;

    /* renamed from: k, reason: collision with root package name */
    public x0 f1514k;

    /* renamed from: l, reason: collision with root package name */
    public final m f1515l;

    /* renamed from: m, reason: collision with root package name */
    public final ac.m f1516m;

    /* renamed from: n, reason: collision with root package name */
    public final n f1517n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f1518o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f1519p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f1520q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f1521r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f1522s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f1523t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1524u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1525v;

    /* renamed from: w, reason: collision with root package name */
    public final ac.m f1526w;

    /* renamed from: x, reason: collision with root package name */
    public final ac.m f1527x;

    public o() {
        f.a aVar = new f.a();
        this.f1511h = aVar;
        final MainActivity mainActivity = (MainActivity) this;
        this.f1512i = new f8.c(new e(mainActivity, 0));
        x4.s sVar = new x4.s(new g4.a(this, new n0(1, this)));
        this.f1513j = sVar;
        this.f1515l = new m(mainActivity);
        this.f1516m = a0.y(new f(mainActivity, 1));
        new AtomicInteger();
        this.f1517n = new n(mainActivity);
        this.f1518o = new CopyOnWriteArrayList();
        this.f1519p = new CopyOnWriteArrayList();
        this.f1520q = new CopyOnWriteArrayList();
        this.f1521r = new CopyOnWriteArrayList();
        this.f1522s = new CopyOnWriteArrayList();
        this.f1523t = new CopyOnWriteArrayList();
        androidx.lifecycle.w wVar = this.f1510g;
        if (wVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        wVar.a(new h(0, mainActivity));
        int i10 = 1;
        this.f1510g.a(new h(i10, mainActivity));
        this.f1510g.a(new e4.b(mainActivity, i10));
        sVar.g();
        m0.d(this);
        ((x4.l) sVar.f8357i).k("android:support:activity-result", new i(0, mainActivity));
        f.b bVar = new f.b() { // from class: d.j
            @Override // f.b
            public final void a(o oVar) {
                pc.j.e(oVar, "it");
                MainActivity mainActivity2 = MainActivity.this;
                Bundle b2 = ((x4.l) mainActivity2.f1513j.f8357i).b("android:support:activity-result");
                if (b2 != null) {
                    n nVar = mainActivity2.f1517n;
                    LinkedHashMap linkedHashMap = nVar.f1503b;
                    LinkedHashMap linkedHashMap2 = nVar.f1502a;
                    Bundle bundle = nVar.f1508g;
                    ArrayList<Integer> integerArrayList = b2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = b2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        nVar.f1505d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = b2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = stringArrayList.get(i11);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                pc.v.b(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i11);
                        pc.j.d(num2, "get(...)");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i11);
                        pc.j.d(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        nVar.f1503b.put(str3, Integer.valueOf(intValue));
                    }
                }
            }
        };
        o oVar = aVar.f2171b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        aVar.f2170a.add(bVar);
        this.f1526w = a0.y(new f(mainActivity, 2));
        this.f1527x = a0.y(new f(mainActivity, 3));
    }

    public static void f(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!pc.j.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!pc.j.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    @Override // d.z
    public final y a() {
        return (y) this.f1527x.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        this.f1515l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // e4.e
    public final x4.l b() {
        return (x4.l) this.f1513j.f8357i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        pc.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        if (i7.b.t(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z10 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!i7.b.f3219a) {
                    try {
                        i7.b.f3220b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    i7.b.f3219a = true;
                }
                Method method = i7.b.f3220b;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = h3.w.f2829a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = h3.v.f2825d;
            h3.v vVar = (h3.v) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (vVar == null) {
                vVar = new h3.v();
                vVar.f2826a = null;
                vVar.f2827b = null;
                vVar.f2828c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, vVar);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = vVar.f2826a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = h3.v.f2825d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (vVar.f2826a == null) {
                                vVar.f2826a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = h3.v.f2825d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    vVar.f2826a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        vVar.f2826a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a6 = vVar.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (vVar.f2827b == null) {
                        vVar.f2827b = new SparseArray();
                    }
                    vVar.f2827b.put(keyCode, new WeakReference(a6));
                }
            }
            if (a6 != null) {
                z10 = true;
            }
        }
        if (z10) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        pc.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        if (i7.b.t(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.k
    public final x3.b e() {
        x3.c cVar = new x3.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f8286a;
        if (application != null) {
            linkedHashMap.put(u0.f717d, getApplication());
        }
        linkedHashMap.put(m0.f686a, this);
        linkedHashMap.put(m0.f687b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(m0.f688c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.y0
    public final x0 g() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1514k == null) {
            l lVar = (l) getLastNonConfigurationInstance();
            if (lVar != null) {
                this.f1514k = lVar.f1497a;
            }
            if (this.f1514k == null) {
                this.f1514k = new x0();
            }
        }
        x0 x0Var = this.f1514k;
        pc.j.b(x0Var);
        return x0Var;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.w h() {
        return this.f1510g;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        pc.j.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        pc.j.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        pc.j.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        pc.j.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = i0.f680h;
        g0.b(this);
    }

    public final void k(Bundle bundle) {
        pc.j.e(bundle, "outState");
        androidx.lifecycle.w wVar = this.f1510g;
        wVar.c("setCurrentState");
        wVar.e(androidx.lifecycle.p.f699i);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f1517n.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        pc.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1518o.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((g3.a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1513j.h(bundle);
        f.a aVar = this.f1511h;
        aVar.getClass();
        aVar.f2171b = this;
        Iterator it = aVar.f2170a.iterator();
        while (it.hasNext()) {
            ((f.b) it.next()).a(this);
        }
        j(bundle);
        int i10 = i0.f680h;
        g0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        pc.j.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1512i.f2340h).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((s3.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        pc.j.e(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1512i.f2340h).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((s3.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f1524u) {
            return;
        }
        Iterator it = this.f1521r.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((g3.a) it.next()).accept(new x2.b(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        pc.j.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f1520q.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((g3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        pc.j.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1512i.f2340h).iterator();
        if (it.hasNext()) {
            ((s3.h) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f1525v) {
            return;
        }
        Iterator it = this.f1522s.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((g3.a) it.next()).accept(new x2.r(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        pc.j.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1512i.f2340h).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((s3.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        pc.j.e(strArr, "permissions");
        pc.j.e(iArr, "grantResults");
        if (this.f1517n.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        x0 x0Var = this.f1514k;
        if (x0Var == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            x0Var = lVar.f1497a;
        }
        if (x0Var == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f1497a = x0Var;
        return lVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        pc.j.e(bundle, "outState");
        androidx.lifecycle.w wVar = this.f1510g;
        if (wVar != null) {
            wVar.c("setCurrentState");
            wVar.e(androidx.lifecycle.p.f699i);
        }
        k(bundle);
        this.f1513j.i(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f1519p.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((g3.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1523t.iterator();
        pc.j.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (x4.f.N()) {
                x4.f.y("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = (p) this.f1516m.getValue();
            synchronized (pVar.f1528a) {
                try {
                    pVar.f1529b = true;
                    ArrayList arrayList = pVar.f1530c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((oc.a) obj).invoke();
                    }
                    pVar.f1530c.clear();
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
    public final void setContentView(int i10) {
        i();
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        this.f1515l.a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        pc.j.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        pc.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        pc.j.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        pc.j.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        pc.j.e(configuration, "newConfig");
        this.f1524u = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f1524u = false;
            Iterator it = this.f1521r.iterator();
            pc.j.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((g3.a) it.next()).accept(new x2.b(z10));
            }
        } catch (Throwable th) {
            this.f1524u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        pc.j.e(configuration, "newConfig");
        this.f1525v = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f1525v = false;
            Iterator it = this.f1522s.iterator();
            pc.j.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((g3.a) it.next()).accept(new x2.r(z10));
            }
        } catch (Throwable th) {
            this.f1525v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        this.f1515l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        this.f1515l.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
