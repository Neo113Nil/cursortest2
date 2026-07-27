package com.onesignal.core.internal.application.impl;

import D.RunnableC0282a;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.C;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;
import androidx.fragment.app.J;
import androidx.fragment.app.N;
import com.google.android.gms.internal.ads.C2991bm;
import com.onesignal.common.AndroidUtils;
import h.AbstractActivityC4551k;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import u7.v;
import v7.AbstractC5129j;
import x4.C5197a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements x4.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C0181a Companion = new C0181a(null);
    private static volatile a sharedInstance;
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private final b componentCallbacks;
    private boolean isActivityChangingConfigurations;
    private boolean lifecycleObserverInstalled;
    private boolean nextResumeIsFirstActivity;
    private final Set<Activity> startedActivities;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();
    private x4.b entryState = x4.b.APP_CLOSE;

    /* renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0181a {
        public /* synthetic */ C0181a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final a getInstance() {
            a aVar;
            a aVar2 = a.sharedInstance;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (this) {
                aVar = a.sharedInstance;
                if (aVar == null) {
                    aVar = new a();
                    a.sharedInstance = aVar;
                }
            }
            return aVar;
        }

        public final a getInstanceOrNull() {
            return a.sharedInstance;
        }

        private C0181a() {
        }
    }

    public static final class b implements ComponentCallbacks {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            kotlin.jvm.internal.h.e(newConfig, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                kotlin.jvm.internal.h.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i = newConfig.orientation;
                    Activity current2 = aVar.getCurrent();
                    kotlin.jvm.internal.h.b(current2);
                    aVar.onOrientationChanged(i, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.d) obj);
            return v.f41350a;
        }

        public final void invoke(x4.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onActivityAvailable(this.$value);
        }
    }

    public static final class d extends C5197a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public d(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // x4.C5197a, x4.d
        public void onActivityAvailable(Activity currentActivity) {
            kotlin.jvm.internal.h.e(currentActivity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(currentActivity, this.$runnable);
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements I7.l {
        public static final e INSTANCE = new e();

        public e() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.e) obj);
            return v.f41350a;
        }

        public final void invoke(x4.e it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onFocus(false);
        }
    }

    public static final class f extends kotlin.jvm.internal.i implements I7.l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.e) obj);
            return v.f41350a;
        }

        public final void invoke(x4.e it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onUnfocused();
        }
    }

    public static final class g extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.d) obj);
            return v.f41350a;
        }

        public final void invoke(x4.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements I7.l {
        public static final h INSTANCE = new h();

        public h() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return v.f41350a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.systemConditionChanged();
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.d) obj);
            return v.f41350a;
        }

        public final void invoke(x4.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    public static final class j extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x4.d) obj);
            return v.f41350a;
        }

        public final void invoke(x4.d it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onActivityAvailable(this.$activity);
        }
    }

    public static final class k extends B7.c {
        int label;
        /* synthetic */ Object result;

        public k(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    public static final class l extends B7.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    public static final class m extends J {
        final /* synthetic */ N $manager;
        final /* synthetic */ com.onesignal.common.threading.e $waiter;

        public m(N n9, com.onesignal.common.threading.e eVar) {
            this.$manager = n9;
            this.$waiter = eVar;
        }

        public void onFragmentDetached(N fm, AbstractComponentCallbacksC0475s fragmentDetached) {
            kotlin.jvm.internal.h.e(fm, "fm");
            kotlin.jvm.internal.h.e(fragmentDetached, "fragmentDetached");
            if (fragmentDetached instanceof DialogInterfaceOnCancelListenerC0471n) {
                C2991bm c2991bm = this.$manager.f4860l;
                synchronized (((CopyOnWriteArrayList) c2991bm.f29323u)) {
                    try {
                        int size = ((CopyOnWriteArrayList) c2991bm.f29323u).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((C) ((CopyOnWriteArrayList) c2991bm.f29323u).get(i)).f4817a == this) {
                                ((CopyOnWriteArrayList) c2991bm.f29323u).remove(i);
                                break;
                            }
                            i++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.$waiter.wake();
            }
        }
    }

    public static final class n implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.e $waiter;

        public n(com.onesignal.common.threading.e eVar) {
            this.$waiter = eVar;
        }

        @Override // com.onesignal.core.internal.application.impl.b
        public void systemConditionChanged() {
            if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(a.this.getCurrent()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    public a() {
        Set<Activity> synchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        kotlin.jvm.internal.h.d(synchronizedSet, "synchronizedSet(...)");
        this.startedActivities = synchronizedSet;
        this.componentCallbacks = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(a self, Runnable runnable, a this$0) {
        kotlin.jvm.internal.h.e(self, "$self");
        kotlin.jvm.internal.h.e(runnable, "$runnable");
        kotlin.jvm.internal.h.e(this$0, "this$0");
        self.addActivityLifecycleHandler(self.new d(runnable, this$0));
    }

    private final void decrementStartedActivity(Activity activity, boolean z3) {
        if (this.startedActivities.remove(activity)) {
            int i6 = this.activityReferences - 1;
            this.activityReferences = i6;
            if (i6 <= 0) {
                this.activityReferences = 0;
                if (z3 && getCurrent() == null) {
                    resetStaleNotificationEntryIfBackgrounded(z3);
                    return;
                } else {
                    setCurrent(null);
                    handleLostFocus();
                    return;
                }
            }
        }
        resetStaleNotificationEntryIfBackgrounded(z3);
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != x4.b.NOTIFICATION_CLICK) {
            setEntryState(x4.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(e.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(x4.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(f.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i6, Activity activity) {
        if (i6 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i6 + ") on activity: " + activity, null, 2, null);
        } else if (i6 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i6 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new i(activity));
        this.activityLifecycleNotifier.fire(new j(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    private final void resetStaleNotificationEntryIfBackgrounded(boolean z3) {
        if (z3 && getCurrent() == null && getEntryState() == x4.b.NOTIFICATION_CLICK) {
            setEntryState(x4.b.APP_CLOSE);
        }
    }

    private final void seedFocusFromInitContext(Context context) {
        boolean z3 = context instanceof Activity;
        boolean z6 = getCurrent() == null;
        if (z6 && !z3) {
            this.nextResumeIsFirstActivity = true;
            setEntryState(x4.b.APP_CLOSE);
            return;
        }
        setEntryState(x4.b.APP_OPEN);
        if (z6 && z3) {
            kotlin.jvm.internal.h.c(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            setCurrent(activity);
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            this.nextResumeIsFirstActivity = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(com.onesignal.common.threading.e waiter) {
        kotlin.jvm.internal.h.e(waiter, "$waiter");
        waiter.wake();
    }

    @Override // x4.f
    public void addActivityLifecycleHandler(x4.d handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            kotlin.jvm.internal.h.b(current);
            handler.onActivityAvailable(current);
        }
    }

    @Override // x4.f
    public void addApplicationLifecycleHandler(x4.e handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            handler.onFocus(true);
        }
    }

    public final void attachToApplication(Application application) {
        kotlin.jvm.internal.h.e(application, "application");
        if (this.lifecycleObserverInstalled) {
            return;
        }
        this.lifecycleObserverInstalled = true;
        if (this._appContext == null) {
            this._appContext = application;
        }
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(this.componentCallbacks);
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(runnable, "runnable");
        runnable.toString();
        activity.getWindow().getDecorView().post(new androidx.emoji2.text.k(4, this, runnable, this));
    }

    @Override // x4.f
    public Context getAppContext() {
        Context context = this._appContext;
        kotlin.jvm.internal.h.b(context);
        return context;
    }

    @Override // x4.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // x4.f
    public x4.b getEntryState() {
        return this.entryState;
    }

    @Override // x4.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (activity instanceof x4.g) {
            return;
        }
        if (!kotlin.jvm.internal.h.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.startedActivities.clear();
        this.startedActivities.add(activity);
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p02, Bundle p1) {
        kotlin.jvm.internal.h.e(p02, "p0");
        kotlin.jvm.internal.h.e(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (kotlin.jvm.internal.h.a(getCurrent(), activity) && this.startedActivities.contains(activity)) {
            return;
        }
        boolean z3 = activity instanceof x4.g;
        boolean z6 = this.isActivityChangingConfigurations;
        if (!z3 && getCurrent() == null && !z6) {
            this.nextResumeIsFirstActivity = true;
        }
        if (!z3 && !kotlin.jvm.internal.h.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        boolean add = this.startedActivities.add(activity);
        if (!z3 && getWasInBackground() && !this.isActivityChangingConfigurations) {
            this.startedActivities.clear();
            this.startedActivities.add(activity);
            this.activityReferences = 1;
            handleFocus();
            return;
        }
        if (!z3 && z6) {
            this.isActivityChangingConfigurations = false;
        } else if (add) {
            this.activityReferences++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean z3 = activity instanceof x4.g;
        if (!z3) {
            this.isActivityChangingConfigurations = activity.isChangingConfigurations();
        }
        if (z3 || !this.isActivityChangingConfigurations) {
            decrementStartedActivity(activity, z3);
        }
        this.activityLifecycleNotifier.fire(new g(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(h.INSTANCE);
    }

    @Override // x4.f
    public void removeActivityLifecycleHandler(x4.d handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // x4.f
    public void removeApplicationLifecycleHandler(x4.e handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new c(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // x4.f
    public void setEntryState(x4.b bVar) {
        kotlin.jvm.internal.h.e(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        boolean z3 = this.lifecycleObserverInstalled;
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        attachToApplication((Application) applicationContext);
        if (!z3) {
            seedFocusFromInitContext(context);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // x4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(InterfaceC5267d interfaceC5267d) {
        k kVar;
        int i6;
        if (interfaceC5267d instanceof k) {
            kVar = (k) interfaceC5267d;
            int i9 = kVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                kVar.label = i9 - Integer.MIN_VALUE;
                Object obj = kVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = kVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
                    decorViewReady(current, new RunnableC0282a(17, eVar));
                    kVar.label = 1;
                    if (eVar.waitForWake(kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.TRUE;
            }
        }
        kVar = new k(interfaceC5267d);
        Object obj2 = kVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = kVar.label;
        if (i6 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (S7.AbstractC0406y.f(100, r0) == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x008c -> B:32:0x005a). Please report as a decompilation issue!!! */
    @Override // x4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(InterfaceC5267d interfaceC5267d) {
        l lVar;
        int i6;
        Activity current;
        int i9;
        a aVar;
        a aVar2;
        l lVar2;
        a aVar3;
        View view;
        n nVar;
        n nVar2;
        if (interfaceC5267d instanceof l) {
            lVar = (l) interfaceC5267d;
            int i10 = lVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.label = i10 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                A7.a aVar4 = A7.a.f58n;
                i6 = lVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    current = getCurrent();
                    i9 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    aVar = this;
                    if (current != null) {
                    }
                    return aVar4;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (n) lVar.L$1;
                        aVar3 = (a) lVar.L$0;
                        com.bumptech.glide.d.k(obj);
                        nVar = nVar2;
                        aVar3.systemConditionNotifier.unsubscribe(nVar);
                        return Boolean.TRUE;
                    }
                    current = (Activity) lVar.L$1;
                    aVar2 = (a) lVar.L$0;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (NoClassDefFoundError e9) {
                        e = e9;
                        com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                        lVar2 = lVar;
                        aVar3 = aVar2;
                        com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
                        nVar = aVar3.new n(eVar);
                        aVar3.systemConditionNotifier.subscribe(nVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar3.systemConditionNotifier.unsubscribe(nVar);
                        return Boolean.TRUE;
                    }
                    lVar2 = lVar;
                    aVar3 = aVar2;
                    com.onesignal.common.threading.e eVar2 = new com.onesignal.common.threading.e();
                    nVar = aVar3.new n(eVar2);
                    aVar3.systemConditionNotifier.subscribe(nVar);
                    if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                        lVar2.L$0 = aVar3;
                        lVar2.L$1 = nVar;
                        lVar2.label = 3;
                        if (eVar2.waitForWake(lVar2) != aVar4) {
                            nVar2 = nVar;
                            nVar = nVar2;
                        }
                        return aVar4;
                    }
                    aVar3.systemConditionNotifier.unsubscribe(nVar);
                    return Boolean.TRUE;
                }
                int i11 = lVar.I$0;
                aVar = (a) lVar.L$0;
                com.bumptech.glide.d.k(obj);
                i9 = i11;
                current = aVar.getCurrent();
                if (current != null) {
                    try {
                    } catch (NoClassDefFoundError e10) {
                        e = e10;
                        aVar2 = aVar;
                        com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e, null, 2, null);
                        lVar2 = lVar;
                        aVar3 = aVar2;
                        com.onesignal.common.threading.e eVar22 = new com.onesignal.common.threading.e();
                        nVar = aVar3.new n(eVar22);
                        aVar3.systemConditionNotifier.subscribe(nVar);
                        if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar3.systemConditionNotifier.unsubscribe(nVar);
                        return Boolean.TRUE;
                    }
                    if (current instanceof AbstractActivityC4551k) {
                        N supportFragmentManager = ((AbstractActivityC4551k) current).getSupportFragmentManager();
                        kotlin.jvm.internal.h.d(supportFragmentManager, "getSupportFragmentManager(...)");
                        List l9 = supportFragmentManager.f4852c.l();
                        kotlin.jvm.internal.h.d(l9, "getFragments(...)");
                        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = (AbstractComponentCallbacksC0475s) AbstractC5129j.G(l9);
                        if (abstractComponentCallbacksC0475s != null && abstractComponentCallbacksC0475s.i() && !abstractComponentCallbacksC0475s.j() && (view = abstractComponentCallbacksC0475s.f5050X) != null && view.getWindowToken() != null && abstractComponentCallbacksC0475s.f5050X.getVisibility() == 0 && (abstractComponentCallbacksC0475s instanceof DialogInterfaceOnCancelListenerC0471n)) {
                            com.onesignal.common.threading.e eVar3 = new com.onesignal.common.threading.e();
                            ((CopyOnWriteArrayList) supportFragmentManager.f4860l.f29323u).add(new C(new m(supportFragmentManager, eVar3)));
                            lVar.L$0 = aVar;
                            lVar.L$1 = current;
                            lVar.label = 2;
                            if (eVar3.waitForWake(lVar) != aVar4) {
                                aVar2 = aVar;
                                lVar2 = lVar;
                                aVar3 = aVar2;
                                com.onesignal.common.threading.e eVar222 = new com.onesignal.common.threading.e();
                                nVar = aVar3.new n(eVar222);
                                aVar3.systemConditionNotifier.subscribe(nVar);
                                if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                                }
                                aVar3.systemConditionNotifier.unsubscribe(nVar);
                                return Boolean.TRUE;
                            }
                        }
                    }
                    lVar2 = lVar;
                    aVar3 = aVar;
                    com.onesignal.common.threading.e eVar2222 = new com.onesignal.common.threading.e();
                    nVar = aVar3.new n(eVar2222);
                    aVar3.systemConditionNotifier.subscribe(nVar);
                    if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    }
                    aVar3.systemConditionNotifier.unsubscribe(nVar);
                    return Boolean.TRUE;
                }
                i11 = i9 + 1;
                if (i11 > 50) {
                    com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                    return Boolean.FALSE;
                }
                lVar.L$0 = aVar;
                lVar.I$0 = i11;
                lVar.label = 1;
                return aVar4;
            }
        }
        lVar = new l(interfaceC5267d);
        Object obj2 = lVar.result;
        A7.a aVar42 = A7.a.f58n;
        i6 = lVar.label;
        if (i6 != 0) {
        }
    }
}
