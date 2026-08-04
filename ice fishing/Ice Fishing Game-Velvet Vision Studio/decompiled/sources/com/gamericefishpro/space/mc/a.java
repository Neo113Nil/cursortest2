package com.gamericefishpro.space.mc;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.lc.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final com.gamericefishpro.space.dc.b activityLifecycleNotifier = new com.gamericefishpro.space.dc.b();
    private final com.gamericefishpro.space.dc.b applicationLifecycleNotifier = new com.gamericefishpro.space.dc.b();
    private final com.gamericefishpro.space.dc.b systemConditionNotifier = new com.gamericefishpro.space.dc.b();
    private com.gamericefishpro.space.lc.b entryState = com.gamericefishpro.space.lc.b.APP_CLOSE;

    /* JADX INFO: renamed from: com.gamericefishpro.space.mc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0035a extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0035a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.lc.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public b(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // com.gamericefishpro.space.lc.a, com.gamericefishpro.space.lc.d
        public void onActivityAvailable(Activity currentActivity) {
            Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(currentActivity, this.$runnable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.ei.l implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.e) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onFocus(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.ei.l implements Function1 {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.e) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onUnfocused();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.ei.l implements Function1 {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.mc.b) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.mc.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.systemConditionChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityStopped(this.$activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.ei.l implements Function1 {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.lc.d) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.lc.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onActivityAvailable(this.$activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public j(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class k extends com.gamericefishpro.space.vh.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class l implements com.gamericefishpro.space.mc.b {
        final /* synthetic */ com.gamericefishpro.space.ic.c $waiter;

        public l(com.gamericefishpro.space.ic.c cVar) {
            this.$waiter = cVar;
        }

        @Override // com.gamericefishpro.space.mc.b
        public void systemConditionChanged() {
            if (com.gamericefishpro.space.yb.b.INSTANCE.isKeyboardUp(new WeakReference<>(a.this.getCurrent()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(a self, Runnable runnable, a this$0) {
        Intrinsics.checkNotNullParameter(self, "$self");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        self.addActivityLifecycleHandler(self.new b(runnable, this$0));
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            com.gamericefishpro.space.od.b.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != com.gamericefishpro.space.lc.b.NOTIFICATION_CLICK) {
            setEntryState(com.gamericefishpro.space.lc.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(c.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.gamericefishpro.space.od.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(com.gamericefishpro.space.lc.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(d.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i2, Activity activity) {
        if (i2 == 1) {
            com.gamericefishpro.space.od.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i2 + ") on activity: " + activity, null, 2, null);
        } else if (i2 == 2) {
            com.gamericefishpro.space.od.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i2 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(com.gamericefishpro.space.ic.c waiter) {
        Intrinsics.checkNotNullParameter(waiter, "$waiter");
        waiter.wake();
    }

    @Override // com.gamericefishpro.space.lc.f
    public void addActivityLifecycleHandler(com.gamericefishpro.space.lc.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            Intrinsics.b(current);
            handler.onActivityAvailable(current);
        }
    }

    @Override // com.gamericefishpro.space.lc.f
    public void addApplicationLifecycleHandler(com.gamericefishpro.space.lc.e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            handler.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new com.appsflyer.internal.d(this, runnable, this, 5));
    }

    @Override // com.gamericefishpro.space.lc.f
    public Context getAppContext() {
        Context context = this._appContext;
        Intrinsics.b(context);
        return context;
    }

    @Override // com.gamericefishpro.space.lc.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // com.gamericefishpro.space.lc.f
    public com.gamericefishpro.space.lc.b getEntryState() {
        return this.entryState;
    }

    @Override // com.gamericefishpro.space.lc.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!Intrinsics.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (Intrinsics.a(getCurrent(), activity)) {
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
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = zIsChangingConfigurations;
        if (!zIsChangingConfigurations) {
            int i2 = this.activityReferences - 1;
            this.activityReferences = i2;
            if (i2 <= 0) {
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

    @Override // com.gamericefishpro.space.lc.f
    public void removeActivityLifecycleHandler(com.gamericefishpro.space.lc.d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // com.gamericefishpro.space.lc.f
    public void removeApplicationLifecycleHandler(com.gamericefishpro.space.lc.e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.gamericefishpro.space.od.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new C0035a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.gamericefishpro.space.lc.f
    public void setEntryState(com.gamericefishpro.space.lc.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i());
        boolean z = context instanceof Activity;
        boolean z2 = getCurrent() == null;
        if (!z2 || z) {
            setEntryState(com.gamericefishpro.space.lc.b.APP_OPEN);
            if (z2 && z) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(com.gamericefishpro.space.lc.b.APP_CLOSE);
        }
        com.gamericefishpro.space.od.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.lc.f
    public Object waitUntilActivityReady(com.gamericefishpro.space.th.a aVar) {
        j jVar;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(aVar);
            }
        } else {
            jVar = new j(aVar);
        }
        Object obj = jVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            Activity current = getCurrent();
            if (current == null) {
                return Boolean.FALSE;
            }
            com.gamericefishpro.space.ic.c cVar = new com.gamericefishpro.space.ic.c();
            decorViewReady(current, new com.appsflyer.a(11, cVar));
            jVar.label = 1;
            if (cVar.waitForWake(jVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (com.gamericefishpro.space.pi.a0.i(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:22:0x006b). Please report as a decompilation issue!!! */
    @Override // com.gamericefishpro.space.lc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(com.gamericefishpro.space.th.a aVar) {
        k kVar;
        Activity current;
        int i2;
        a aVar2;
        a aVar3;
        int i3;
        com.gamericefishpro.space.ic.c cVar;
        l lVar;
        l lVar2;
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i4 = kVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.label = i4 - Integer.MIN_VALUE;
            } else {
                kVar = new k(aVar);
            }
        } else {
            kVar = new k(aVar);
        }
        Object obj = kVar.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i5 = kVar.label;
        if (i5 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            current = getCurrent();
            i2 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
            aVar2 = this;
            if (current != null) {
                aVar3 = aVar2;
                cVar = new com.gamericefishpro.space.ic.c();
                lVar = aVar3.new l(cVar);
                aVar3.systemConditionNotifier.subscribe(lVar);
                if (com.gamericefishpro.space.yb.b.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    com.gamericefishpro.space.od.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                    kVar.L$0 = aVar3;
                    kVar.L$1 = lVar;
                    kVar.label = 3;
                    if (cVar.waitForWake(kVar) != aVar4) {
                        lVar2 = lVar;
                    }
                }
                aVar3.systemConditionNotifier.unsubscribe(lVar);
                return Boolean.TRUE;
            }
            i3 = i2 + 1;
            if (i3 > 50) {
                com.gamericefishpro.space.od.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                return Boolean.FALSE;
            }
            kVar.L$0 = aVar2;
            kVar.I$0 = i3;
            kVar.label = 1;
            return aVar4;
        }
        if (i5 == 1) {
            i3 = kVar.I$0;
            aVar2 = (a) kVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            i2 = i3;
            current = aVar2.getCurrent();
            if (current != null) {
                aVar3 = aVar2;
                cVar = new com.gamericefishpro.space.ic.c();
                lVar = aVar3.new l(cVar);
                aVar3.systemConditionNotifier.subscribe(lVar);
                if (com.gamericefishpro.space.yb.b.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                    com.gamericefishpro.space.od.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                    kVar.L$0 = aVar3;
                    kVar.L$1 = lVar;
                    kVar.label = 3;
                    if (cVar.waitForWake(kVar) != aVar4) {
                        lVar2 = lVar;
                    }
                }
                aVar3.systemConditionNotifier.unsubscribe(lVar);
                return Boolean.TRUE;
            }
            i3 = i2 + 1;
            if (i3 > 50) {
                com.gamericefishpro.space.od.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                return Boolean.FALSE;
            }
            kVar.L$0 = aVar2;
            kVar.I$0 = i3;
            kVar.label = 1;
            return aVar4;
        }
        if (i5 == 2) {
            current = (Activity) kVar.L$1;
            a aVar5 = (a) kVar.L$0;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
            } catch (NoClassDefFoundError e2) {
                com.gamericefishpro.space.od.b.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e2, null, 2, null);
            }
            aVar3 = aVar5;
            cVar = new com.gamericefishpro.space.ic.c();
            lVar = aVar3.new l(cVar);
            aVar3.systemConditionNotifier.subscribe(lVar);
            if (com.gamericefishpro.space.yb.b.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                com.gamericefishpro.space.od.b.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                kVar.L$0 = aVar3;
                kVar.L$1 = lVar;
                kVar.label = 3;
                if (cVar.waitForWake(kVar) != aVar4) {
                    lVar2 = lVar;
                }
                return aVar4;
            }
            aVar3.systemConditionNotifier.unsubscribe(lVar);
            return Boolean.TRUE;
        }
        if (i5 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lVar2 = (l) kVar.L$1;
        aVar3 = (a) kVar.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        lVar = lVar2;
        aVar3.systemConditionNotifier.unsubscribe(lVar);
        return Boolean.TRUE;
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i implements ComponentCallbacks {
        public i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                Intrinsics.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i = newConfig.orientation;
                    Activity current2 = aVar.getCurrent();
                    Intrinsics.b(current2);
                    aVar.onOrientationChanged(i, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }
}
