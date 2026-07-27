package androidx.activity;

import D.AbstractActivityC0295n;
import D.C0296o;
import D.O;
import O.C0337l;
import O.C0338m;
import O.C0339n;
import O.InterfaceC0341p;
import a.AbstractC0422a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0494l;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0492j;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.icefishing.icefishinglive2.C5275R;
import d.C4432a;
import d.InterfaceC4433b;
import e.AbstractC4457c;
import e.InterfaceC4456b;
import f.AbstractC4494a;
import h0.AbstractC4554b;
import h0.C4556d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u7.InterfaceC5087e;
import x0.C5181c;
import x0.C5182d;
import x0.InterfaceC5183e;

/* loaded from: classes.dex */
public abstract class p extends AbstractActivityC0295n implements Y, InterfaceC0492j, InterfaceC5183e {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0457i Companion = new C0457i();
    private X _viewModelStore;
    private final e.i activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC5087e defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC5087e fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC5087e onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<N.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<N.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<N.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final C5182d savedStateRegistryController;
    private final C4432a contextAwareHelper = new C4432a();
    private final C0339n menuHostHelper = new C0339n(new RunnableC0452d(this, 0));

    public p() {
        C5182d c5182d = new C5182d(this);
        this.savedStateRegistryController = c5182d;
        this.reportFullyDrawnExecutor = new l(this);
        this.fullyDrawnReporter$delegate = AbstractC0422a.q(new o(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new n(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new C0453e(0, this));
        getLifecycle().a(new C0453e(1, this));
        getLifecycle().a(new InterfaceC0501t() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0501t
            public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
                p pVar = p.this;
                p.access$ensureViewModelStore(pVar);
                pVar.getLifecycle().b(this);
            }
        });
        c5182d.a();
        L.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C0454f(0, this));
        addOnContextAvailableListener(new InterfaceC4433b() { // from class: androidx.activity.g
            @Override // d.InterfaceC4433b
            public final void a(p pVar) {
                p.a(p.this, pVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC0422a.q(new o(this, 0));
        this.onBackPressedDispatcher$delegate = AbstractC0422a.q(new o(this, 3));
    }

    public static void a(p pVar, p it) {
        kotlin.jvm.internal.h.e(it, "it");
        Bundle a9 = pVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a9 != null) {
            e.i iVar = pVar.activityResultRegistry;
            iVar.getClass();
            ArrayList<Integer> integerArrayList = a9.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a9.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                iVar.f37094d.addAll(stringArrayList2);
            }
            Bundle bundle = a9.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = iVar.f37097g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = iVar.f37092b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = iVar.f37091a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (bundle2.containsKey(str)) {
                        continue;
                    } else {
                        if ((linkedHashMap2 instanceof J7.a) && !(linkedHashMap2 instanceof J7.d)) {
                            kotlin.jvm.internal.u.d(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                kotlin.jvm.internal.h.d(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                kotlin.jvm.internal.h.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(p pVar) {
        if (pVar._viewModelStore == null) {
            j jVar = (j) pVar.getLastNonConfigurationInstance();
            if (jVar != null) {
                pVar._viewModelStore = jVar.f4449b;
            }
            if (pVar._viewModelStore == null) {
                pVar._viewModelStore = new X();
            }
        }
    }

    public static void b(p pVar, InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n == EnumC0496n.ON_DESTROY) {
            pVar.contextAwareHelper.f36964b = null;
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            l lVar = (l) pVar.reportFullyDrawnExecutor;
            p pVar2 = lVar.f4453w;
            pVar2.getWindow().getDecorView().removeCallbacks(lVar);
            pVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
        }
    }

    public static Bundle c(p pVar) {
        Bundle bundle = new Bundle();
        e.i iVar = pVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f37092b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f37094d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f37097g));
        return bundle;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0341p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        C0339n c0339n = this.menuHostHelper;
        c0339n.f2112b.add(provider);
        c0339n.f2111a.run();
    }

    public final void addOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC4433b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4432a c4432a = this.contextAwareHelper;
        c4432a.getClass();
        p pVar = c4432a.f36964b;
        if (pVar != null) {
            listener.a(pVar);
        }
        c4432a.f36963a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final e.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0492j
    public AbstractC4554b getDefaultViewModelCreationExtras() {
        C4556d c4556d = new C4556d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c4556d.f37943a;
        if (application != null) {
            T t6 = T.f5148a;
            Application application2 = getApplication();
            kotlin.jvm.internal.h.d(application2, "application");
            linkedHashMap.put(t6, application2);
        }
        linkedHashMap.put(L.f5120a, this);
        linkedHashMap.put(L.f5121b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(L.f5122c, extras);
        }
        return c4556d;
    }

    public V getDefaultViewModelProviderFactory() {
        return (V) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public x getFullyDrawnReporter() {
        return (x) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f4448a;
        }
        return null;
    }

    @Override // D.AbstractActivityC0295n, androidx.lifecycle.InterfaceC0503v
    public AbstractC0498p getLifecycle() {
        return super.getLifecycle();
    }

    public final G getOnBackPressedDispatcher() {
        return (G) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // x0.InterfaceC5183e
    public final C5181c getSavedStateRegistry() {
        return this.savedStateRegistryController.f41754b;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.f4449b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new X();
            }
        }
        X x9 = this._viewModelStore;
        kotlin.jvm.internal.h.b(x9);
        return x9;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        decorView.setTag(C5275R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window.decorView");
        decorView2.setTag(C5275R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window.decorView");
        decorView3.setTag(C5275R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView4, "window.decorView");
        decorView4.setTag(C5275R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView5, "window.decorView");
        decorView5.setTag(C5275R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i6, Intent intent) {
        if (this.activityResultRegistry.a(i, i6, intent)) {
            return;
        }
        super.onActivityResult(i, i6, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<N.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // D.AbstractActivityC0295n, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C4432a c4432a = this.contextAwareHelper;
        c4432a.getClass();
        c4432a.f36964b = this;
        Iterator it = c4432a.f36963a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4433b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = J.f5112u;
        androidx.lifecycle.H.b(this);
        int i6 = this.contentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0339n c0339n = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0339n.f2112b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0341p) it.next())).f4824a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        kotlin.jvm.internal.h.e(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z3) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0296o(z3));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<N.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        Iterator it = this.menuHostHelper.f2112b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0341p) it.next())).f4824a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z3) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new O(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f2112b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0341p) it.next())).f4824a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.h.e(permissions, "permissions");
        kotlin.jvm.internal.h.e(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X x9 = this._viewModelStore;
        if (x9 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            x9 = jVar.f4449b;
        }
        if (x9 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f4448a = onRetainCustomNonConfigurationInstance;
        jVar2.f4449b = x9;
        return jVar2;
    }

    @Override // D.AbstractActivityC0295n, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        if (getLifecycle() instanceof C0505x) {
            AbstractC0498p lifecycle = getLifecycle();
            kotlin.jvm.internal.h.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0505x) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<N.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f36964b;
    }

    public final <I, O> AbstractC4457c registerForActivityResult(final AbstractC4494a contract, final e.i registry, final InterfaceC4456b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        kotlin.jvm.internal.h.e(key, "key");
        AbstractC0498p lifecycle = getLifecycle();
        C0505x c0505x = (C0505x) lifecycle;
        if (c0505x.f5178d.compareTo(EnumC0497o.f5167w) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0505x.f5178d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        LinkedHashMap linkedHashMap = registry.f37093c;
        e.f fVar = (e.f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new e.f(lifecycle);
        }
        InterfaceC0501t interfaceC0501t = new InterfaceC0501t() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0501t
            public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
                EnumC0496n enumC0496n2 = EnumC0496n.ON_START;
                i iVar = i.this;
                String str = key;
                LinkedHashMap linkedHashMap2 = iVar.f37095e;
                if (enumC0496n2 != enumC0496n) {
                    if (EnumC0496n.ON_STOP == enumC0496n) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (EnumC0496n.ON_DESTROY == enumC0496n) {
                            iVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                InterfaceC4456b interfaceC4456b = callback;
                AbstractC4494a abstractC4494a = contract;
                linkedHashMap2.put(str, new C4459e(abstractC4494a, interfaceC4456b));
                LinkedHashMap linkedHashMap3 = iVar.f37096f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC4456b.g(obj);
                }
                Bundle bundle = iVar.f37097g;
                C4455a c4455a = (C4455a) com.bumptech.glide.f.g(bundle, str, C4455a.class);
                if (c4455a != null) {
                    bundle.remove(str);
                    interfaceC4456b.g(abstractC4494a.c(c4455a.f37078n, c4455a.f37079u));
                }
            }
        };
        fVar.f37086a.a(interfaceC0501t);
        fVar.f37087b.add(interfaceC0501t);
        linkedHashMap.put(key, fVar);
        return new e.g();
    }

    public void removeMenuProvider(InterfaceC0341p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    public final void removeOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC4433b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4432a c4432a = this.contextAwareHelper;
        c4432a.getClass();
        c4432a.f36963a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0422a.o()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f4466a) {
                try {
                    fullyDrawnReporter.f4467b = true;
                    Iterator it = fullyDrawnReporter.f4468c.iterator();
                    while (it.hasNext()) {
                        ((I7.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f4468c.clear();
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
    public void setContentView(int i) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i6, int i9, int i10) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i6, i9, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i6, int i9, int i10, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i6, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z3, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z3, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0296o(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z3, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z3, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new O(z3));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0341p provider, InterfaceC0503v owner) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        C0339n c0339n = this.menuHostHelper;
        c0339n.f2112b.add(provider);
        c0339n.f2111a.run();
        AbstractC0498p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0339n.f2113c;
        C0338m c0338m = (C0338m) hashMap.remove(provider);
        if (c0338m != null) {
            c0338m.f2105a.b(c0338m.f2106b);
            c0338m.f2106b = null;
        }
        hashMap.put(provider, new C0338m(lifecycle, new C0337l(0, c0339n, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        ((l) kVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0341p provider, InterfaceC0503v owner, final EnumC0497o state) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        kotlin.jvm.internal.h.e(state, "state");
        final C0339n c0339n = this.menuHostHelper;
        c0339n.getClass();
        AbstractC0498p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0339n.f2113c;
        C0338m c0338m = (C0338m) hashMap.remove(provider);
        if (c0338m != null) {
            c0338m.f2105a.b(c0338m.f2106b);
            c0338m.f2106b = null;
        }
        hashMap.put(provider, new C0338m(lifecycle, new InterfaceC0501t() { // from class: O.k
            @Override // androidx.lifecycle.InterfaceC0501t
            public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
                C0339n c0339n2 = C0339n.this;
                c0339n2.getClass();
                C0494l c0494l = EnumC0496n.Companion;
                EnumC0497o enumC0497o = state;
                c0494l.getClass();
                int ordinal = enumC0497o.ordinal();
                EnumC0496n enumC0496n2 = null;
                EnumC0496n enumC0496n3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0496n.ON_RESUME : EnumC0496n.ON_START : EnumC0496n.ON_CREATE;
                InterfaceC0341p interfaceC0341p = provider;
                Runnable runnable = c0339n2.f2111a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0339n2.f2112b;
                if (enumC0496n == enumC0496n3) {
                    copyOnWriteArrayList.add(interfaceC0341p);
                    runnable.run();
                    return;
                }
                EnumC0496n enumC0496n4 = EnumC0496n.ON_DESTROY;
                if (enumC0496n == enumC0496n4) {
                    c0339n2.b(interfaceC0341p);
                    return;
                }
                int ordinal2 = enumC0497o.ordinal();
                if (ordinal2 == 2) {
                    enumC0496n2 = enumC0496n4;
                } else if (ordinal2 == 3) {
                    enumC0496n2 = EnumC0496n.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0496n2 = EnumC0496n.ON_PAUSE;
                }
                if (enumC0496n == enumC0496n2) {
                    copyOnWriteArrayList.remove(interfaceC0341p);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC4457c registerForActivityResult(AbstractC4494a contract, InterfaceC4456b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }
}
