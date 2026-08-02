package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.a1;
import androidx.core.app.i;
import androidx.core.app.t;
import androidx.core.app.v0;
import androidx.core.app.w0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class hn5 extends i implements kfu, ssd, woo, rpj, ji, sh, tpj, wqj, v0, w0, jxh {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final bn5 Companion = new bn5();
    private jfu _viewModelStore;

    @NotNull
    private final fi activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final xe6 contextAwareHelper;

    @NotNull
    private final arf defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final arf fullyDrawnReporter$delegate;

    @NotNull
    private final mxh menuHostHelper;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final arf onBackPressedDispatcher$delegate;

    @NotNull
    private final CopyOnWriteArrayList<xa6> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<xa6> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<xa6> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<xa6> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<xa6> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final dn5 reportFullyDrawnExecutor;

    @NotNull
    private final voo savedStateRegistryController;

    public hn5() {
        this.contextAwareHelper = new xe6();
        this.menuHostHelper = new mxh(new wm5(this, 0));
        bnh bnhVar = new bnh(this, new b6n(28, this));
        this.savedStateRegistryController = new voo(bnhVar);
        this.reportFullyDrawnExecutor = new en5(this);
        this.fullyDrawnReporter$delegate = btf.b(new gn5(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new fn5(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            xq0.q("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        getLifecycle().a(new uyf(this) { // from class: xm5
            public final /* synthetic */ hn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.uyf
            public final void Q(dzf dzfVar, kyf kyfVar) {
                Window window;
                View peekDecorView;
                switch (i) {
                    case 0:
                        if (kyfVar == kyf.ON_STOP && (window = this.b.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        hn5.e(this.b, dzfVar, kyfVar);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new uyf(this) { // from class: xm5
            public final /* synthetic */ hn5 b;

            {
                this.b = this;
            }

            @Override // defpackage.uyf
            public final void Q(dzf dzfVar, kyf kyfVar) {
                Window window;
                View peekDecorView;
                switch (i2) {
                    case 0:
                        if (kyfVar == kyf.ON_STOP && (window = this.b.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        hn5.e(this.b, dzfVar, kyfVar);
                        break;
                }
            }
        });
        getLifecycle().a(new xnn(i2, this));
        bnhVar.a();
        q6k.p(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new ym5(0, this));
        addOnContextAvailableListener(new vpj() { // from class: zm5
            @Override // defpackage.vpj
            public final void a(hn5 hn5Var) {
                hn5.c(hn5.this, hn5Var);
            }
        });
        this.defaultViewModelProviderFactory$delegate = btf.b(new gn5(this, 0));
        this.onBackPressedDispatcher$delegate = btf.b(new gn5(this, 3));
    }

    public static final void access$ensureViewModelStore(hn5 hn5Var) {
        if (hn5Var._viewModelStore == null) {
            cn5 cn5Var = (cn5) hn5Var.getLastNonConfigurationInstance();
            if (cn5Var != null) {
                hn5Var._viewModelStore = cn5Var.b;
            }
            if (hn5Var._viewModelStore == null) {
                hn5Var._viewModelStore = new jfu();
            }
        }
    }

    public static void c(hn5 hn5Var, Context context) {
        context.getClass();
        Bundle a = hn5Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            fi fiVar = hn5Var.activityResultRegistry;
            LinkedHashMap linkedHashMap = fiVar.b;
            LinkedHashMap linkedHashMap2 = fiVar.a;
            Bundle bundle = fiVar.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                fiVar.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        wct.n(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                fiVar.b.put(str3, Integer.valueOf(intValue));
            }
        }
    }

    public static void e(hn5 hn5Var, dzf dzfVar, kyf kyfVar) {
        if (kyfVar == kyf.ON_DESTROY) {
            hn5Var.contextAwareHelper.b = null;
            if (!hn5Var.isChangingConfigurations()) {
                hn5Var.getViewModelStore().a();
            }
            en5 en5Var = (en5) hn5Var.reportFullyDrawnExecutor;
            hn5 hn5Var2 = en5Var.d;
            hn5Var2.getWindow().getDecorView().removeCallbacks(en5Var);
            hn5Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(en5Var);
        }
    }

    public static Bundle f(hn5 hn5Var) {
        Bundle bundle = new Bundle();
        fi fiVar = hn5Var.activityResultRegistry;
        fiVar.getClass();
        LinkedHashMap linkedHashMap = fiVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fiVar.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(fiVar.g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        dn5 dn5Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((en5) dn5Var).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(@NotNull hyh hyhVar, @NotNull dzf dzfVar) {
        hyhVar.getClass();
        dzfVar.getClass();
        mxh mxhVar = this.menuHostHelper;
        mxhVar.b.add(hyhVar);
        mxhVar.a.run();
        nyf lifecycle = dzfVar.getLifecycle();
        HashMap hashMap = mxhVar.c;
        lxh lxhVar = (lxh) hashMap.remove(hyhVar);
        if (lxhVar != null) {
            lxhVar.a.d(lxhVar.b);
            lxhVar.b = null;
        }
        hashMap.put(hyhVar, new lxh(lifecycle, new an5(3, mxhVar, hyhVar)));
    }

    @Override // defpackage.tpj
    public final void addOnConfigurationChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onConfigurationChangedListeners.add(xa6Var);
    }

    public final void addOnContextAvailableListener(@NotNull vpj vpjVar) {
        vpjVar.getClass();
        xe6 xe6Var = this.contextAwareHelper;
        xe6Var.getClass();
        hn5 hn5Var = xe6Var.b;
        if (hn5Var != null) {
            vpjVar.a(hn5Var);
        }
        xe6Var.a.add(vpjVar);
    }

    @Override // androidx.core.app.v0
    public final void addOnMultiWindowModeChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onMultiWindowModeChangedListeners.add(xa6Var);
    }

    public final void addOnNewIntentListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onNewIntentListeners.add(xa6Var);
    }

    @Override // androidx.core.app.w0
    public final void addOnPictureInPictureModeChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(xa6Var);
    }

    @Override // defpackage.wqj
    public final void addOnTrimMemoryListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onTrimMemoryListeners.add(xa6Var);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // defpackage.ji
    @NotNull
    public final fi getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.ssd
    @NotNull
    public is6 getDefaultViewModelCreationExtras() {
        noi noiVar = new noi(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = noiVar.a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(ffu.d, application2);
        }
        linkedHashMap.put(q6k.h, this);
        linkedHashMap.put(q6k.i, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(q6k.j, extras);
        }
        return noiVar;
    }

    @Override // defpackage.ssd
    @NotNull
    public gfu getDefaultViewModelProviderFactory() {
        return (gfu) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @NotNull
    public eyc getFullyDrawnReporter() {
        return (eyc) this.fullyDrawnReporter$delegate.getValue();
    }

    @vx7
    public Object getLastCustomNonConfigurationInstance() {
        cn5 cn5Var = (cn5) getLastNonConfigurationInstance();
        if (cn5Var != null) {
            return cn5Var.a;
        }
        return null;
    }

    @Override // androidx.core.app.i, defpackage.dzf
    @NotNull
    public nyf getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.rpj
    @NotNull
    public final qpj getOnBackPressedDispatcher() {
        return (qpj) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.woo
    @NotNull
    public final uoo getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.kfu
    @NotNull
    public jfu getViewModelStore() {
        if (getApplication() == null) {
            xq0.q("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            cn5 cn5Var = (cn5) getLastNonConfigurationInstance();
            if (cn5Var != null) {
                this._viewModelStore = cn5Var.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new jfu();
            }
        }
        jfu jfuVar = this._viewModelStore;
        jfuVar.getClass();
        return jfuVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @vx7
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<xa6> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        xe6 xe6Var = this.contextAwareHelper;
        xe6Var.getClass();
        xe6Var.b = this;
        Iterator it = xe6Var.a.iterator();
        while (it.hasNext()) {
            ((vpj) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = nzn.b;
        lzn.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NotNull Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        mxh mxhVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = mxhVar.b.iterator();
        while (it.hasNext()) {
            ((ttc) ((hyh) it.next())).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NotNull MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, @NotNull Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<xa6> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                xa6 next = it.next();
                configuration.getClass();
                next.accept(new t(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<xa6> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NotNull Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ttc) ((hyh) it.next())).a.q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, @NotNull Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<xa6> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                xa6 next = it.next();
                configuration.getClass();
                next.accept(new a1(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, @NotNull Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((ttc) ((hyh) it.next())).a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @vx7
    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @vx7
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        cn5 cn5Var;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        jfu jfuVar = this._viewModelStore;
        if (jfuVar == null && (cn5Var = (cn5) getLastNonConfigurationInstance()) != null) {
            jfuVar = cn5Var.b;
        }
        if (jfuVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        cn5 cn5Var2 = new cn5();
        cn5Var2.a = onRetainCustomNonConfigurationInstance;
        cn5Var2.b = jfuVar;
        return cn5Var2;
    }

    @Override // androidx.core.app.i, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof gzf) {
            nyf lifecycle = getLifecycle();
            lifecycle.getClass();
            ((gzf) lifecycle).i(lyf.c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<xa6> it = this.onTrimMemoryListeners.iterator();
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
        return this.contextAwareHelper.b;
    }

    @NotNull
    public final <I, O> zh registerForActivityResult(@NotNull uh uhVar, @NotNull fi fiVar, @NotNull rh rhVar) {
        uhVar.getClass();
        fiVar.getClass();
        rhVar.getClass();
        return fiVar.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, uhVar, rhVar);
    }

    @Override // defpackage.jxh
    public void removeMenuProvider(@NotNull hyh hyhVar) {
        hyhVar.getClass();
        this.menuHostHelper.b(hyhVar);
    }

    @Override // defpackage.tpj
    public final void removeOnConfigurationChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onConfigurationChangedListeners.remove(xa6Var);
    }

    public final void removeOnContextAvailableListener(@NotNull vpj vpjVar) {
        vpjVar.getClass();
        xe6 xe6Var = this.contextAwareHelper;
        xe6Var.getClass();
        xe6Var.a.remove(vpjVar);
    }

    @Override // androidx.core.app.v0
    public final void removeOnMultiWindowModeChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(xa6Var);
    }

    public final void removeOnNewIntentListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onNewIntentListeners.remove(xa6Var);
    }

    @Override // androidx.core.app.w0
    public final void removeOnPictureInPictureModeChangedListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(xa6Var);
    }

    @Override // defpackage.wqj
    public final void removeOnTrimMemoryListener(@NotNull xa6 xa6Var) {
        xa6Var.getClass();
        this.onTrimMemoryListeners.remove(xa6Var);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (y7g.H()) {
                Trace.beginSection(y7g.X("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            eyc fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    Iterator it = fullyDrawnReporter.c.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    fullyDrawnReporter.c.clear();
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
        dn5 dn5Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((en5) dn5Var).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @vx7
    public void startActivityForResult(@NotNull Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @vx7
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @vx7
    public void startActivityForResult(@NotNull Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @vx7
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        dn5 dn5Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((en5) dn5Var).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        dn5 dn5Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((en5) dn5Var).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // defpackage.sh
    @NotNull
    public final <I, O> zh registerForActivityResult(@NotNull uh uhVar, @NotNull rh rhVar) {
        uhVar.getClass();
        rhVar.getClass();
        return registerForActivityResult(uhVar, this.activityResultRegistry, rhVar);
    }

    @Override // android.app.Activity
    @vx7
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<xa6> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new t(z));
        }
    }

    @Override // android.app.Activity
    @vx7
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<xa6> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new a1(z));
        }
    }

    @Override // defpackage.jxh
    public void addMenuProvider(@NotNull hyh hyhVar) {
        hyhVar.getClass();
        mxh mxhVar = this.menuHostHelper;
        mxhVar.b.add(hyhVar);
        mxhVar.a.run();
    }

    public void addMenuProvider(@NotNull final hyh hyhVar, @NotNull dzf dzfVar, @NotNull final lyf lyfVar) {
        hyhVar.getClass();
        dzfVar.getClass();
        lyfVar.getClass();
        final mxh mxhVar = this.menuHostHelper;
        mxhVar.getClass();
        nyf lifecycle = dzfVar.getLifecycle();
        HashMap hashMap = mxhVar.c;
        lxh lxhVar = (lxh) hashMap.remove(hyhVar);
        if (lxhVar != null) {
            lxhVar.a.d(lxhVar.b);
            lxhVar.b = null;
        }
        hashMap.put(hyhVar, new lxh(lifecycle, new uyf() { // from class: kxh
            @Override // defpackage.uyf
            public final void Q(dzf dzfVar2, kyf kyfVar) {
                mxh mxhVar2 = mxh.this;
                mxhVar2.getClass();
                Runnable runnable = mxhVar2.a;
                CopyOnWriteArrayList copyOnWriteArrayList = mxhVar2.b;
                kyf.Companion.getClass();
                lyf lyfVar2 = lyfVar;
                lyfVar2.getClass();
                int ordinal = lyfVar2.ordinal();
                kyf kyfVar2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : kyf.ON_RESUME : kyf.ON_START : kyf.ON_CREATE;
                hyh hyhVar2 = hyhVar;
                if (kyfVar == kyfVar2) {
                    copyOnWriteArrayList.add(hyhVar2);
                    runnable.run();
                } else if (kyfVar == kyf.ON_DESTROY) {
                    mxhVar2.b(hyhVar2);
                } else if (kyfVar == iyf.a(lyfVar2)) {
                    copyOnWriteArrayList.remove(hyhVar2);
                    runnable.run();
                }
            }
        }));
    }

    public hn5(int i) {
        this();
        this.contentLayoutId = i;
    }
}
