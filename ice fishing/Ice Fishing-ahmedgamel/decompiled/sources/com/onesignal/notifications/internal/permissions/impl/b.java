package com.onesignal.notifications.internal.permissions.impl;

import I7.l;
import I7.p;
import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import S7.P;
import S7.q0;
import S7.z0;
import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import i5.r;
import u7.v;
import v7.C5127h;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.permissions.f, A5.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0236b Companion = new C0236b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final x4.f _application;
    private final x4.f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final J4.b _preferenceService;
    private final com.onesignal.core.internal.permissions.g _requestPermission;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.e pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.f waiter;

    public static final class a extends B7.h implements l {
        int label;

        public a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return b.this.new a(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0236b {
        public /* synthetic */ C0236b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0236b() {
        }
    }

    public static final class c extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z3) {
            super(1);
            this.$enabled = z3;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A5.a) obj);
            return v.f41353a;
        }

        public final void invoke(A5.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z3) {
            super(1);
            this.$enabled = z3;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A5.a) obj);
            return v.f41353a;
        }

        public final void invoke(A5.a it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class f extends B7.h implements p {
        int label;

        public f(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new f(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((f) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
                return obj;
            }
            com.bumptech.glide.d.k(obj);
            com.onesignal.common.threading.e eVar = b.this.pollingWaiter;
            this.label = 1;
            Object waitForWake = eVar.waitForWake(this);
            return waitForWake == aVar ? aVar : waitForWake;
        }
    }

    public static final class g extends B7.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    public static final class h extends x4.c {

        public static final class a extends kotlin.jvm.internal.i implements I7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // I7.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m42invoke();
                return v.f41353a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m42invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
                this.this$0.pollingWaiter.wake();
            }
        }

        /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$h$b, reason: collision with other inner class name */
        public static final class C0237b extends kotlin.jvm.internal.i implements I7.a {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237b(b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // I7.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m43invoke();
                return v.f41353a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m43invoke() {
                b bVar = this.this$0;
                bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.b) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
            }
        }

        public h() {
        }

        @Override // x4.c, x4.e
        public void onFocus(boolean z3) {
            super.onFocus(z3);
            com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new a(b.this));
        }

        @Override // x4.c, x4.e
        public void onUnfocused() {
            super.onUnfocused();
            com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new C0237b(b.this));
        }
    }

    public static final class i implements x4.d {
        public i() {
        }

        @Override // x4.d
        public void onActivityAvailable(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._application.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // x4.d
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
        }
    }

    public static final class j implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends x4.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // x4.c, x4.e
            public void onFocus(boolean z3) {
                if (z3) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public j(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.notifications.internal.permissions.impl.a.INSTANCE.show(this.$activity);
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(x4.f _application, com.onesignal.core.internal.permissions.g _requestPermission, x4.f _applicationService, J4.b _preferenceService, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_application, "_application");
        kotlin.jvm.internal.h.e(_requestPermission, "_requestPermission");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_preferenceService, "_preferenceService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new com.onesignal.common.threading.f();
        this.pollingWaiter = new com.onesignal.common.threading.e();
        this.events = new com.onesignal.common.events.b();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.b) _configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        com.onesignal.common.threading.c.launchOnIO(new a(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return t5.e.areNotificationsEnabled$default(t5.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z3) {
        this.enabled = z3;
        this.waiter.wake(Boolean.valueOf(z3));
        this.events.fire(new c(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(InterfaceC5267d interfaceC5267d) {
        d dVar;
        A7.a aVar;
        int i6;
        b bVar;
        boolean notificationsEnabled;
        long j6;
        f fVar;
        if (interfaceC5267d instanceof d) {
            dVar = (d) interfaceC5267d;
            int i9 = dVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.label = i9 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                aVar = A7.a.f58n;
                i6 = dVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    bVar = this;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) dVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                do {
                    notificationsEnabled = bVar.notificationsEnabled();
                    if (bVar.enabled != notificationsEnabled) {
                        bVar.enabled = notificationsEnabled;
                        bVar.events.fire(new e(notificationsEnabled));
                    }
                    j6 = bVar.pollingWaitInterval;
                    fVar = bVar.new f(null);
                    dVar.L$0 = bVar;
                    dVar.label = 1;
                } while (AbstractC0406y.A(j6, fVar, dVar) != aVar);
                return aVar;
            }
        }
        dVar = new d(interfaceC5267d);
        Object obj2 = dVar.result;
        aVar = A7.a.f58n;
        i6 = dVar.label;
        if (i6 != 0) {
        }
        do {
            notificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != notificationsEnabled) {
            }
            j6 = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar.L$0 = bVar;
            dVar.label = 1;
        } while (AbstractC0406y.A(j6, fVar, dVar) != aVar);
        return aVar;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null || (current instanceof PermissionsActivity)) {
            this._application.addActivityLifecycleHandler(new i());
            return true;
        }
        showFallbackAlertDialog$present(this, current);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFallbackAlertDialog$present(b bVar, Activity activity) {
        com.onesignal.core.internal.permissions.e eVar = com.onesignal.core.internal.permissions.e.INSTANCE;
        String string = activity.getString(r.notification_permission_name_for_title);
        kotlin.jvm.internal.h.d(string, "getString(...)");
        String string2 = activity.getString(r.notification_permission_settings_message);
        kotlin.jvm.internal.h.d(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new j(activity));
    }

    @Override // A5.b
    public boolean getCanRequestPermission() {
        kotlin.jvm.internal.h.b(this._preferenceService.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        return !r0.booleanValue();
    }

    @Override // A5.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onReject(boolean z3) {
        if (z3 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // A5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z3, InterfaceC5267d interfaceC5267d) {
        g gVar;
        int i6;
        Object obj;
        b bVar;
        if (interfaceC5267d instanceof g) {
            gVar = (g) interfaceC5267d;
            int i9 = gVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.label = i9 - Integer.MIN_VALUE;
                Object obj2 = gVar.result;
                Object obj3 = A7.a.f58n;
                i6 = gVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj2);
                    gVar.L$0 = this;
                    gVar.Z$0 = z3;
                    gVar.label = 1;
                    InterfaceC5272i context = gVar.getContext();
                    AbstractC0406y.g(context);
                    InterfaceC5267d l9 = A8.b.l(gVar);
                    X7.h hVar = l9 instanceof X7.h ? (X7.h) l9 : null;
                    Object obj4 = v.f41353a;
                    if (hVar != null) {
                        AbstractC0402u abstractC0402u = hVar.f3834w;
                        if (abstractC0402u.z()) {
                            hVar.f3836y = obj4;
                            hVar.f2914v = 1;
                            abstractC0402u.q(context, hVar);
                        } else {
                            z0 z0Var = new z0(z0.f3018v);
                            InterfaceC5272i n9 = context.n(z0Var);
                            hVar.f3836y = obj4;
                            hVar.f2914v = 1;
                            abstractC0402u.q(n9, hVar);
                            if (z0Var.f3019u) {
                                P a9 = q0.a();
                                C5127h c5127h = a9.f2934x;
                                if (!(c5127h != null ? c5127h.isEmpty() : true)) {
                                    if (a9.f2932v >= 4294967296L) {
                                        hVar.f3836y = obj4;
                                        hVar.f2914v = 1;
                                        a9.B(hVar);
                                    } else {
                                        a9.D(true);
                                        try {
                                            hVar.run();
                                            do {
                                            } while (a9.F());
                                        } finally {
                                            try {
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = obj3;
                        if (obj == A7.a.f58n) {
                            obj4 = obj;
                        }
                        if (obj4 != obj3) {
                            bVar = this;
                        }
                    }
                    obj = obj4;
                    if (obj == A7.a.f58n) {
                    }
                    if (obj4 != obj3) {
                    }
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj2);
                    return obj2;
                }
                z3 = gVar.Z$0;
                bVar = (b) gVar.L$0;
                com.bumptech.glide.d.k(obj2);
                if (!bVar.notificationsEnabled()) {
                    return Boolean.TRUE;
                }
                if (bVar.supportsNativePrompt) {
                    bVar._requestPermission.startPrompt(z3, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
                } else {
                    if (!z3) {
                        return Boolean.FALSE;
                    }
                    bVar.showFallbackAlertDialog();
                }
                com.onesignal.common.threading.f fVar = bVar.waiter;
                gVar.L$0 = null;
                gVar.label = 2;
                Object waitForWake = fVar.waitForWake(gVar);
                return waitForWake == obj3 ? obj3 : waitForWake;
            }
        }
        gVar = new g(interfaceC5267d);
        Object obj22 = gVar.result;
        Object obj32 = A7.a.f58n;
        i6 = gVar.label;
        if (i6 != 0) {
        }
        if (!bVar.notificationsEnabled()) {
        }
    }

    @Override // A5.b, com.onesignal.common.events.d
    public void subscribe(A5.a handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // A5.b, com.onesignal.common.events.d
    public void unsubscribe(A5.a handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
