package com.onesignal.core.internal.application.impl;

import ac.o;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements q8.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();
    private q8.b entryState = q8.b.APP_CLOSE;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0007a extends pc.k implements oc.c {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0007a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.d) obj);
            return o.f277a;
        }

        public final void invoke(q8.d dVar) {
            pc.j.e(dVar, "it");
            dVar.onActivityAvailable(this.$value);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends q8.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public b(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // q8.a, q8.d
        public void onActivityAvailable(Activity activity) {
            pc.j.e(activity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(activity, this.$runnable);
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends pc.k implements oc.c {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.e) obj);
            return o.f277a;
        }

        public final void invoke(q8.e eVar) {
            pc.j.e(eVar, "it");
            eVar.onFocus(false);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends pc.k implements oc.c {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.e) obj);
            return o.f277a;
        }

        public final void invoke(q8.e eVar) {
            pc.j.e(eVar, "it");
            eVar.onUnfocused();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends pc.k implements oc.c {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.d) obj);
            return o.f277a;
        }

        public final void invoke(q8.d dVar) {
            pc.j.e(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends pc.k implements oc.c {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return o.f277a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b bVar) {
            pc.j.e(bVar, "it");
            bVar.systemConditionChanged();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends pc.k implements oc.c {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.d) obj);
            return o.f277a;
        }

        public final void invoke(q8.d dVar) {
            pc.j.e(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends pc.k implements oc.c {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q8.d) obj);
            return o.f277a;
        }

        public final void invoke(q8.d dVar) {
            pc.j.e(dVar, "it");
            dVar.onActivityAvailable(this.$activity);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.c {
        int label;
        /* synthetic */ Object result;

        public j(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class k extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class l implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.c $waiter;

        public l(com.onesignal.common.threading.c cVar) {
            this.$waiter = cVar;
        }

        @Override // com.onesignal.core.internal.application.impl.b
        public void systemConditionChanged() {
            if (com.onesignal.common.d.INSTANCE.isKeyboardUp(new WeakReference<>(a.this.getCurrent()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decorViewReady$lambda-1, reason: not valid java name */
    public static final void m7decorViewReady$lambda1(a aVar, Runnable runnable, a aVar2) {
        pc.j.e(aVar, "$self");
        pc.j.e(runnable, "$runnable");
        pc.j.e(aVar2, "this$0");
        aVar.addActivityLifecycleHandler(aVar.new b(runnable, aVar2));
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
        if (getEntryState() != q8.b.NOTIFICATION_CLICK) {
            setEntryState(q8.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(c.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(q8.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(d.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i10, Activity activity) {
        if (i10 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i10 + ") on activity: " + activity, null, 2, null);
        } else if (i10 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i10 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: waitUntilActivityReady$lambda-0, reason: not valid java name */
    public static final void m8waitUntilActivityReady$lambda0(com.onesignal.common.threading.c cVar) {
        pc.j.e(cVar, "$waiter");
        cVar.wake();
    }

    @Override // q8.f
    public void addActivityLifecycleHandler(q8.d dVar) {
        pc.j.e(dVar, "handler");
        this.activityLifecycleNotifier.subscribe(dVar);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            pc.j.b(current);
            dVar.onActivityAvailable(current);
        }
    }

    @Override // q8.f
    public void addApplicationLifecycleHandler(q8.e eVar) {
        pc.j.e(eVar, "handler");
        this.applicationLifecycleNotifier.subscribe(eVar);
        if (getCurrent() != null) {
            eVar.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        pc.j.e(activity, "activity");
        pc.j.e(runnable, "runnable");
        runnable.toString();
        activity.getWindow().getDecorView().post(new b6.a(this, runnable, this, 1));
    }

    @Override // q8.f
    public Context getAppContext() {
        Context context = this._appContext;
        pc.j.b(context);
        return context;
    }

    @Override // q8.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // q8.f
    public q8.b getEntryState() {
        return this.entryState;
    }

    @Override // q8.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!pc.j.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        pc.j.e(activity, "p0");
        pc.j.e(bundle, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (pc.j.a(getCurrent(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        pc.j.e(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = isChangingConfigurations;
        if (!isChangingConfigurations) {
            int i10 = this.activityReferences - 1;
            this.activityReferences = i10;
            if (i10 <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new e(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(f.INSTANCE);
    }

    @Override // q8.f
    public void removeActivityLifecycleHandler(q8.d dVar) {
        pc.j.e(dVar, "handler");
        this.activityLifecycleNotifier.unsubscribe(dVar);
    }

    @Override // q8.f
    public void removeApplicationLifecycleHandler(q8.e eVar) {
        pc.j.e(eVar, "handler");
        this.applicationLifecycleNotifier.unsubscribe(eVar);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new C0007a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // q8.f
    public void setEntryState(q8.b bVar) {
        pc.j.e(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        pc.j.e(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        pc.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i());
        boolean z10 = context instanceof Activity;
        boolean z11 = getCurrent() == null;
        if (!z11 || z10) {
            setEntryState(q8.b.APP_OPEN);
            if (z11 && z10) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(q8.b.APP_CLOSE);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // q8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(fc.d dVar) {
        j jVar;
        int i10;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i11 = jVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.label = i11 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                i10 = jVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                    decorViewReady(current, new a1.a(4, cVar));
                    jVar.label = 1;
                    Object waitForWake = cVar.waitForWake(jVar);
                    gc.a aVar = gc.a.f2559g;
                    if (waitForWake == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return Boolean.TRUE;
            }
        }
        jVar = new j(dVar);
        Object obj2 = jVar.result;
        i10 = jVar.label;
        if (i10 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (yc.a0.f(100, r0) == r7) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009d -> B:32:0x006b). Please report as a decompilation issue!!! */
    @Override // q8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(fc.d dVar) {
        k kVar;
        int i10;
        Activity current;
        int i11;
        a aVar;
        k kVar2;
        a aVar2;
        l lVar;
        l lVar2;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i12 = kVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.label = i12 - Integer.MIN_VALUE;
                Object obj = kVar.result;
                i10 = kVar.label;
                gc.a aVar3 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    current = getCurrent();
                    i11 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    aVar = this;
                    if (current != null) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar2 = (l) kVar.L$1;
                            aVar2 = (a) kVar.L$0;
                            v6.a.W(obj);
                            lVar = lVar2;
                            aVar2.systemConditionNotifier.unsubscribe(lVar);
                            return Boolean.TRUE;
                        }
                        current = (Activity) kVar.L$1;
                        a aVar4 = (a) kVar.L$0;
                        try {
                            v6.a.W(obj);
                        } catch (NoClassDefFoundError e10) {
                            com.onesignal.debug.internal.logging.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e10, null, 2, null);
                        }
                        kVar2 = kVar;
                        aVar2 = aVar4;
                        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                        lVar = aVar2.new l(cVar);
                        aVar2.systemConditionNotifier.subscribe(lVar);
                        if (com.onesignal.common.d.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                            kVar2.L$0 = aVar2;
                            kVar2.L$1 = lVar;
                            kVar2.label = 3;
                            if (cVar.waitForWake(kVar2) != aVar3) {
                                lVar2 = lVar;
                                lVar = lVar2;
                            }
                            return aVar3;
                        }
                        aVar2.systemConditionNotifier.unsubscribe(lVar);
                        return Boolean.TRUE;
                    }
                    int i13 = kVar.I$0;
                    aVar = (a) kVar.L$0;
                    v6.a.W(obj);
                    i11 = i13;
                    current = aVar.getCurrent();
                    if (current != null) {
                        kVar2 = kVar;
                        aVar2 = aVar;
                        com.onesignal.common.threading.c cVar2 = new com.onesignal.common.threading.c();
                        lVar = aVar2.new l(cVar2);
                        aVar2.systemConditionNotifier.subscribe(lVar);
                        if (com.onesignal.common.d.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        aVar2.systemConditionNotifier.unsubscribe(lVar);
                        return Boolean.TRUE;
                    }
                    i13 = i11 + 1;
                    if (i13 > 50) {
                        com.onesignal.debug.internal.logging.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                        return Boolean.FALSE;
                    }
                    kVar.L$0 = aVar;
                    kVar.I$0 = i13;
                    kVar.label = 1;
                }
            }
        }
        kVar = new k(dVar);
        Object obj2 = kVar.result;
        i10 = kVar.label;
        gc.a aVar32 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i implements ComponentCallbacks {
        public i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            pc.j.e(configuration, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                pc.j.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i10 = configuration.orientation;
                    Activity current2 = aVar.getCurrent();
                    pc.j.b(current2);
                    aVar.onOrientationChanged(i10, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
