package androidx.activity;

import D.AbstractActivityC0283m;
import D.C0284n;
import D.N;
import O.C0342l;
import O.C0343m;
import O.C0344n;
import O.InterfaceC0346p;
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
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0498l;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0496j;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.IceFishing.LiveIceFishing.C5248R;
import d.C4447a;
import d.InterfaceC4448b;
import e.AbstractC4468c;
import e.InterfaceC4467b;
import f.AbstractC4511a;
import h0.AbstractC4559b;
import h0.C4561d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u7.InterfaceC5079e;
import x0.C5180c;
import x0.C5181d;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public abstract class p extends AbstractActivityC0283m implements Y, InterfaceC0496j, InterfaceC5182e {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0461i Companion = new C0461i();
    private X _viewModelStore;
    private final e.i activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC5079e defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC5079e fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC5079e onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<N.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<N.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<N.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<N.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final C5181d savedStateRegistryController;
    private final C4447a contextAwareHelper = new C4447a();
    private final C0344n menuHostHelper = new C0344n(new RunnableC0456d(this, 0));

    public p() {
        C5181d c5181d = new C5181d(this);
        this.savedStateRegistryController = c5181d;
        this.reportFullyDrawnExecutor = new l(this);
        this.fullyDrawnReporter$delegate = N3.C.O(new o(this, 2));
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
        getLifecycle().a(new C0457e(0, this));
        getLifecycle().a(new C0457e(1, this));
        getLifecycle().a(new InterfaceC0505t() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0505t
            public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
                p pVar = p.this;
                p.access$ensureViewModelStore(pVar);
                pVar.getLifecycle().b(this);
            }
        });
        c5181d.a();
        L.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C0458f(0, this));
        addOnContextAvailableListener(new InterfaceC4448b() { // from class: androidx.activity.g
            @Override // d.InterfaceC4448b
            public final void a(p pVar) {
                p.a(p.this, pVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = N3.C.O(new o(this, 0));
        this.onBackPressedDispatcher$delegate = N3.C.O(new o(this, 3));
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
                iVar.f37202d.addAll(stringArrayList2);
            }
            Bundle bundle = a9.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = iVar.f37205g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                LinkedHashMap linkedHashMap = iVar.f37200b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = iVar.f37199a;
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
                pVar._viewModelStore = jVar.f4417b;
            }
            if (pVar._viewModelStore == null) {
                pVar._viewModelStore = new X();
            }
        }
    }

    public static void b(p pVar, InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n == EnumC0500n.ON_DESTROY) {
            pVar.contextAwareHelper.f37117b = null;
            if (!pVar.isChangingConfigurations()) {
                pVar.getViewModelStore().a();
            }
            l lVar = (l) pVar.reportFullyDrawnExecutor;
            p pVar2 = lVar.f4421w;
            pVar2.getWindow().getDecorView().removeCallbacks(lVar);
            pVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
        }
    }

    public static Bundle c(p pVar) {
        Bundle bundle = new Bundle();
        e.i iVar = pVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f37200b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f37202d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f37205g));
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

    public void addMenuProvider(InterfaceC0346p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        C0344n c0344n = this.menuHostHelper;
        c0344n.f2200b.add(provider);
        c0344n.f2199a.run();
    }

    public final void addOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC4448b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4447a c4447a = this.contextAwareHelper;
        c4447a.getClass();
        p pVar = c4447a.f37117b;
        if (pVar != null) {
            listener.a(pVar);
        }
        c4447a.f37116a.add(listener);
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

    @Override // androidx.lifecycle.InterfaceC0496j
    public AbstractC4559b getDefaultViewModelCreationExtras() {
        C4561d c4561d = new C4561d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c4561d.f37969a;
        if (application != null) {
            T t6 = T.f5115a;
            Application application2 = getApplication();
            kotlin.jvm.internal.h.d(application2, "application");
            linkedHashMap.put(t6, application2);
        }
        linkedHashMap.put(L.f5087a, this);
        linkedHashMap.put(L.f5088b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(L.f5089c, extras);
        }
        return c4561d;
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
            return jVar.f4416a;
        }
        return null;
    }

    @Override // D.AbstractActivityC0283m, androidx.lifecycle.InterfaceC0507v
    public AbstractC0502p getLifecycle() {
        return super.getLifecycle();
    }

    public final G getOnBackPressedDispatcher() {
        return (G) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // x0.InterfaceC5182e
    public final C5180c getSavedStateRegistry() {
        return this.savedStateRegistryController.f41812b;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.f4417b;
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
        decorView.setTag(C5248R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window.decorView");
        decorView2.setTag(C5248R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window.decorView");
        decorView3.setTag(C5248R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView4, "window.decorView");
        decorView4.setTag(C5248R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView5, "window.decorView");
        decorView5.setTag(C5248R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        if (this.activityResultRegistry.a(i, i4, intent)) {
            return;
        }
        super.onActivityResult(i, i4, intent);
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

    @Override // D.AbstractActivityC0283m, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        C4447a c4447a = this.contextAwareHelper;
        c4447a.getClass();
        c4447a.f37117b = this;
        Iterator it = c4447a.f37116a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4448b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = J.f5079u;
        androidx.lifecycle.H.b(this);
        int i4 = this.contentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        C0344n c0344n = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0344n.f2200b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0346p) it.next())).f4792a.j();
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
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0284n(z6));
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
        Iterator it = this.menuHostHelper.f2200b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0346p) it.next())).f4792a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new N(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.h.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f2200b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.F) ((InterfaceC0346p) it.next())).f4792a.s();
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
            x9 = jVar.f4417b;
        }
        if (x9 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f4416a = onRetainCustomNonConfigurationInstance;
        jVar2.f4417b = x9;
        return jVar2;
    }

    @Override // D.AbstractActivityC0283m, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        if (getLifecycle() instanceof C0509x) {
            AbstractC0502p lifecycle = getLifecycle();
            kotlin.jvm.internal.h.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C0509x) lifecycle).g();
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
        return this.contextAwareHelper.f37117b;
    }

    public final <I, O> AbstractC4468c registerForActivityResult(final AbstractC4511a contract, final e.i registry, final InterfaceC4467b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        kotlin.jvm.internal.h.e(key, "key");
        AbstractC0502p lifecycle = getLifecycle();
        C0509x c0509x = (C0509x) lifecycle;
        if (c0509x.f5145d.compareTo(EnumC0501o.f5134w) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0509x.f5145d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        LinkedHashMap linkedHashMap = registry.f37201c;
        e.f fVar = (e.f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new e.f(lifecycle);
        }
        InterfaceC0505t interfaceC0505t = new InterfaceC0505t() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0505t
            public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
                EnumC0500n enumC0500n2 = EnumC0500n.ON_START;
                i iVar = i.this;
                String str = key;
                LinkedHashMap linkedHashMap2 = iVar.f37203e;
                if (enumC0500n2 != enumC0500n) {
                    if (EnumC0500n.ON_STOP == enumC0500n) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (EnumC0500n.ON_DESTROY == enumC0500n) {
                            iVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                InterfaceC4467b interfaceC4467b = callback;
                AbstractC4511a abstractC4511a = contract;
                linkedHashMap2.put(str, new C4470e(abstractC4511a, interfaceC4467b));
                LinkedHashMap linkedHashMap3 = iVar.f37204f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC4467b.f(obj);
                }
                Bundle bundle = iVar.f37205g;
                C4466a c4466a = (C4466a) com.bumptech.glide.g.o(bundle, str, C4466a.class);
                if (c4466a != null) {
                    bundle.remove(str);
                    interfaceC4467b.f(abstractC4511a.c(c4466a.f37186n, c4466a.f37187u));
                }
            }
        };
        fVar.f37194a.a(interfaceC0505t);
        fVar.f37195b.add(interfaceC0505t);
        linkedHashMap.put(key, fVar);
        return new e.g();
    }

    public void removeMenuProvider(InterfaceC0346p provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    public final void removeOnConfigurationChangedListener(N.a listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC4448b listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        C4447a c4447a = this.contextAwareHelper;
        c4447a.getClass();
        c4447a.f37116a.remove(listener);
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
            if (S0.f.o()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f4434a) {
                try {
                    fullyDrawnReporter.f4435b = true;
                    Iterator it = fullyDrawnReporter.f4436c.iterator();
                    while (it.hasNext()) {
                        ((I7.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f4436c.clear();
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
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i6, int i9) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i6, i9);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i4, int i6, int i9, Bundle bundle) {
        kotlin.jvm.internal.h.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i4, i6, i9, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<N.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0284n(z6));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<N.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new N(z6));
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

    public void addMenuProvider(InterfaceC0346p provider, InterfaceC0507v owner) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        C0344n c0344n = this.menuHostHelper;
        c0344n.f2200b.add(provider);
        c0344n.f2199a.run();
        AbstractC0502p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0344n.f2201c;
        C0343m c0343m = (C0343m) hashMap.remove(provider);
        if (c0343m != null) {
            c0343m.f2193a.b(c0343m.f2194b);
            c0343m.f2194b = null;
        }
        hashMap.put(provider, new C0343m(lifecycle, new C0342l(0, c0344n, provider)));
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

    public void addMenuProvider(final InterfaceC0346p provider, InterfaceC0507v owner, final EnumC0501o state) {
        kotlin.jvm.internal.h.e(provider, "provider");
        kotlin.jvm.internal.h.e(owner, "owner");
        kotlin.jvm.internal.h.e(state, "state");
        final C0344n c0344n = this.menuHostHelper;
        c0344n.getClass();
        AbstractC0502p lifecycle = owner.getLifecycle();
        HashMap hashMap = c0344n.f2201c;
        C0343m c0343m = (C0343m) hashMap.remove(provider);
        if (c0343m != null) {
            c0343m.f2193a.b(c0343m.f2194b);
            c0343m.f2194b = null;
        }
        hashMap.put(provider, new C0343m(lifecycle, new InterfaceC0505t() { // from class: O.k
            @Override // androidx.lifecycle.InterfaceC0505t
            public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
                C0344n c0344n2 = C0344n.this;
                c0344n2.getClass();
                C0498l c0498l = EnumC0500n.Companion;
                EnumC0501o enumC0501o = state;
                c0498l.getClass();
                int ordinal = enumC0501o.ordinal();
                EnumC0500n enumC0500n2 = null;
                EnumC0500n enumC0500n3 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0500n.ON_RESUME : EnumC0500n.ON_START : EnumC0500n.ON_CREATE;
                InterfaceC0346p interfaceC0346p = provider;
                Runnable runnable = c0344n2.f2199a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0344n2.f2200b;
                if (enumC0500n == enumC0500n3) {
                    copyOnWriteArrayList.add(interfaceC0346p);
                    runnable.run();
                    return;
                }
                EnumC0500n enumC0500n4 = EnumC0500n.ON_DESTROY;
                if (enumC0500n == enumC0500n4) {
                    c0344n2.b(interfaceC0346p);
                    return;
                }
                int ordinal2 = enumC0501o.ordinal();
                if (ordinal2 == 2) {
                    enumC0500n2 = enumC0500n4;
                } else if (ordinal2 == 3) {
                    enumC0500n2 = EnumC0500n.ON_STOP;
                } else if (ordinal2 == 4) {
                    enumC0500n2 = EnumC0500n.ON_PAUSE;
                }
                if (enumC0500n == enumC0500n2) {
                    copyOnWriteArrayList.remove(interfaceC0346p);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC4468c registerForActivityResult(AbstractC4511a contract, InterfaceC4467b callback) {
        kotlin.jvm.internal.h.e(contract, "contract");
        kotlin.jvm.internal.h.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }
}
