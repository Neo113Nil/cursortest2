package com.gamericefishpro.space.ag;

import android.app.Activity;
import android.os.Build;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ve.r;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.ed.e, com.gamericefishpro.space.zf.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0001b Companion = new C0001b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final com.gamericefishpro.space.lc.f _application;
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.gd.b _preferenceService;
    private final com.gamericefishpro.space.ed.f _requestPermission;
    private final x coroutineScope;
    private boolean enabled;
    private final com.gamericefishpro.space.dc.b events;
    private long pollingWaitInterval;
    private final com.gamericefishpro.space.ic.c pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.gamericefishpro.space.ic.d waiter;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.ag.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0001b {
        public /* synthetic */ C0001b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0001b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.zf.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.zf.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends l implements Function1 {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$enabled = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.zf.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.zf.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new f(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                return obj;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ic.c cVar = b.this.pollingWaiter;
            this.label = 1;
            Object objWaitForWake = cVar.waitForWake(this);
            return objWaitForWake == aVar ? aVar : objWaitForWake;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.lc.c {
        public h() {
        }

        @Override // com.gamericefishpro.space.lc.c, com.gamericefishpro.space.lc.e
        public void onFocus(boolean z) {
            super.onFocus(z);
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.gamericefishpro.space.rc.a) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
            b.this.pollingWaiter.wake();
        }

        @Override // com.gamericefishpro.space.lc.c, com.gamericefishpro.space.lc.e
        public void onUnfocused() {
            super.onUnfocused();
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.gamericefishpro.space.rc.a) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i implements com.gamericefishpro.space.ed.c {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.lc.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // com.gamericefishpro.space.lc.c, com.gamericefishpro.space.lc.e
            public void onFocus(boolean z) {
                if (z) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public i(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.gamericefishpro.space.ed.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.gamericefishpro.space.ag.a.INSTANCE.show(this.$activity);
        }

        @Override // com.gamericefishpro.space.ed.c
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(com.gamericefishpro.space.lc.f _application, com.gamericefishpro.space.ed.f _requestPermission, com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.gd.b _preferenceService, com.gamericefishpro.space.rc.b _configModelStore) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_preferenceService, "_preferenceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new com.gamericefishpro.space.ic.d();
        this.pollingWaiter = new com.gamericefishpro.space.ic.c();
        this.events = new com.gamericefishpro.space.dc.b();
        com.gamericefishpro.space.ui.c cVarB = a0.b(a0.v("NotificationPermissionController"));
        this.coroutineScope = cVarB;
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.gamericefishpro.space.rc.a) _configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        a0.u(cVarB, null, new a(null), 3);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return com.gamericefishpro.space.mf.e.areNotificationsEnabled$default(com.gamericefishpro.space.mf.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z) {
        this.enabled = z;
        this.waiter.wake(Boolean.valueOf(z));
        this.events.fire(new c(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pollForPermission(com.gamericefishpro.space.th.a aVar) {
        d dVar;
        b bVar;
        long j;
        f fVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = dVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            bVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) dVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        do {
            boolean zNotificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != zNotificationsEnabled) {
                bVar.enabled = zNotificationsEnabled;
                bVar.events.fire(new e(zNotificationsEnabled));
            }
            j = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar.L$0 = bVar;
            dVar.label = 1;
        } while (a0.F(j, fVar, dVar) != aVar2);
        return aVar2;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        com.gamericefishpro.space.ed.d dVar = com.gamericefishpro.space.ed.d.INSTANCE;
        String string = current.getString(r.notification_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = current.getString(r.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        dVar.show(current, string, string2, new i(current));
        return true;
    }

    @Override // com.gamericefishpro.space.zf.b
    public boolean getCanRequestPermission() {
        Boolean bool = this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE);
        Intrinsics.b(bool);
        return !bool.booleanValue();
    }

    @Override // com.gamericefishpro.space.zf.b, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // com.gamericefishpro.space.ed.e
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.gamericefishpro.space.ed.e
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.zf.b
    public Object prompt(boolean z, com.gamericefishpro.space.th.a aVar) {
        g gVar;
        b bVar;
        if (aVar instanceof g) {
            gVar = (g) aVar;
            int i2 = gVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.label = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(aVar);
            }
        } else {
            gVar = new g(aVar);
        }
        Object obj = gVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = gVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            gVar.L$0 = this;
            gVar.Z$0 = z;
            gVar.label = 1;
            if (a0.G(gVar) != aVar2) {
                bVar = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        z = gVar.Z$0;
        bVar = (b) gVar.L$0;
        com.gamericefishpro.space.wa.b.P(obj);
        if (bVar.notificationsEnabled()) {
            return Boolean.TRUE;
        }
        if (bVar.supportsNativePrompt) {
            bVar._requestPermission.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
        } else {
            if (!z) {
                return Boolean.FALSE;
            }
            bVar.showFallbackAlertDialog();
        }
        com.gamericefishpro.space.ic.d dVar = bVar.waiter;
        gVar.L$0 = null;
        gVar.label = 2;
        Object objWaitForWake = dVar.waitForWake(gVar);
        return objWaitForWake == aVar2 ? aVar2 : objWaitForWake;
    }

    @Override // com.gamericefishpro.space.zf.b, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.zf.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.zf.b, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.zf.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }
}
