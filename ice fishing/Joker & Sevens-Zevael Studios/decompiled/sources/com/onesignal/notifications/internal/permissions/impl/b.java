package com.onesignal.notifications.internal.permissions.impl;

import ac.o;
import android.app.Activity;
import android.os.Build;
import ca.r;
import com.onesignal.common.AndroidUtils;
import hc.j;
import pc.k;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements b9.e, ua.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0057b Companion = new C0057b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final q8.f _application;
    private final q8.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final c9.b _preferenceService;
    private final b9.f _requestPermission;
    private final y coroutineScope;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.c pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements oc.e {
        int label;

        public a(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new a(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                b bVar = b.this;
                this.label = 1;
                Object pollForPermission = bVar.pollForPermission(this);
                gc.a aVar = gc.a.f2559g;
                if (pollForPermission == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0057b {
        public /* synthetic */ C0057b(pc.f fVar) {
            this();
        }

        private C0057b() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.c {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(1);
            this.$enabled = z10;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ua.a) obj);
            return o.f277a;
        }

        public final void invoke(ua.a aVar) {
            pc.j.e(aVar, "it");
            aVar.onNotificationPermissionChanged(this.$enabled);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends k implements oc.c {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10) {
            super(1);
            this.$enabled = z10;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ua.a) obj);
            return o.f277a;
        }

        public final void invoke(ua.a aVar) {
            pc.j.e(aVar, "it");
            aVar.onNotificationPermissionChanged(this.$enabled);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends j implements oc.e {
        int label;

        public f(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new f(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return obj;
            }
            v6.a.W(obj);
            com.onesignal.common.threading.c cVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = cVar.waitForWake(this);
            gc.a aVar = gc.a.f2559g;
            return waitForWake == aVar ? aVar : waitForWake;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((f) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends q8.c {
        public h() {
        }

        @Override // q8.c, q8.e
        public void onFocus(boolean z10) {
            super.onFocus(z10);
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
            b.this.pollingWaiter.wake();
        }

        @Override // q8.c, q8.e
        public void onUnfocused() {
            super.onUnfocused();
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i implements b9.c {
        final /* synthetic */ Activity $activity;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends q8.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // q8.c, q8.e
            public void onFocus(boolean z10) {
                if (z10) {
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

        @Override // b9.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.notifications.internal.permissions.impl.a.INSTANCE.show(this.$activity);
        }

        @Override // b9.c
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(q8.f fVar, b9.f fVar2, q8.f fVar3, c9.b bVar, com.onesignal.core.internal.config.b bVar2) {
        pc.j.e(fVar, "_application");
        pc.j.e(fVar2, "_requestPermission");
        pc.j.e(fVar3, "_applicationService");
        pc.j.e(bVar, "_preferenceService");
        pc.j.e(bVar2, "_configModelStore");
        this._application = fVar;
        this._requestPermission = fVar2;
        this._applicationService = fVar3;
        this._preferenceService = bVar;
        this._configModelStore = bVar2;
        this.waiter = new com.onesignal.common.threading.d();
        this.pollingWaiter = new com.onesignal.common.threading.c();
        this.events = new com.onesignal.common.events.b();
        dd.e a6 = a0.a(a0.r("NotificationPermissionController"));
        this.coroutineScope = a6;
        this.enabled = notificationsEnabled();
        fVar2.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar2.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        a0.q(a6, null, new a(null), 3);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(fVar.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return na.e.areNotificationsEnabled$default(na.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z10) {
        this.enabled = z10;
        this.waiter.wake(Boolean.valueOf(z10));
        this.events.fire(new c(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(fc.d dVar) {
        d dVar2;
        int i10;
        b bVar;
        boolean notificationsEnabled;
        Object C;
        gc.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i10 = dVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    bVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) dVar2.L$0;
                    v6.a.W(obj);
                }
                do {
                    notificationsEnabled = bVar.notificationsEnabled();
                    if (bVar.enabled != notificationsEnabled) {
                        bVar.enabled = notificationsEnabled;
                        bVar.events.fire(new e(notificationsEnabled));
                    }
                    long j3 = bVar.pollingWaitInterval;
                    f fVar = bVar.new f(null);
                    dVar2.L$0 = bVar;
                    dVar2.label = 1;
                    C = a0.C(j3, fVar, dVar2);
                    aVar = gc.a.f2559g;
                } while (C != aVar);
                return aVar;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        i10 = dVar2.label;
        if (i10 != 0) {
        }
        do {
            notificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != notificationsEnabled) {
            }
            long j32 = bVar.pollingWaitInterval;
            f fVar2 = bVar.new f(null);
            dVar2.L$0 = bVar;
            dVar2.label = 1;
            C = a0.C(j32, fVar2, dVar2);
            aVar = gc.a.f2559g;
        } while (C != aVar);
        return aVar;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        b9.d dVar = b9.d.INSTANCE;
        String string = current.getString(r.notification_permission_name_for_title);
        pc.j.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(r.notification_permission_settings_message);
        pc.j.d(string2, "activity.getString(R.str…mission_settings_message)");
        dVar.show(current, string, string2, new i(current));
        return true;
    }

    @Override // ua.b
    public boolean getCanRequestPermission() {
        pc.j.b(this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // ua.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // b9.e
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // b9.e
    public void onReject(boolean z10) {
        if (z10 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ua.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z10, fc.d dVar) {
        g gVar;
        int i10;
        b bVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i11 = gVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.label = i11 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                i10 = gVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    gVar.L$0 = this;
                    gVar.Z$0 = z10;
                    gVar.label = 1;
                    if (a0.D(gVar) != aVar) {
                        bVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                z10 = gVar.Z$0;
                bVar = (b) gVar.L$0;
                v6.a.W(obj);
                if (!bVar.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar.supportsNativePrompt) {
                    bVar._requestPermission.startPrompt(z10, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    bVar.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.d dVar2 = bVar.waiter;
                gVar.L$0 = null;
                gVar.label = 2;
                Object waitForWake = dVar2.waitForWake(gVar);
                return waitForWake == aVar ? aVar : waitForWake;
            }
        }
        gVar = new g(dVar);
        Object obj2 = gVar.result;
        i10 = gVar.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (!bVar.notificationsEnabled()) {
        }
    }

    @Override // ua.b, com.onesignal.common.events.d
    public void subscribe(ua.a aVar) {
        pc.j.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // ua.b, com.onesignal.common.events.d
    public void unsubscribe(ua.a aVar) {
        pc.j.e(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
