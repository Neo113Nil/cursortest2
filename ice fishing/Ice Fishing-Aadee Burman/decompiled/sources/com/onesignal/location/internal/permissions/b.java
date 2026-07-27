package com.onesignal.location.internal.permissions;

import I7.l;
import a5.C0438b;
import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.permissions.f;
import com.onesignal.core.internal.permissions.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements f, com.onesignal.core.internal.startup.b, com.onesignal.common.events.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final x4.f _applicationService;
    private final g _requestPermission;
    private String currPermission;
    private final com.onesignal.common.events.b events;
    private final com.onesignal.common.threading.f waiter;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.location.internal.permissions.b$b, reason: collision with other inner class name */
    public static final class C0222b extends i implements l {
        public static final C0222b INSTANCE = new C0222b();

        public C0222b() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return v.f41350a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a it) {
            h.e(it, "it");
            it.onLocationPermissionChanged(true);
        }
    }

    public static final class c extends i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return v.f41350a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a it) {
            h.e(it, "it");
            it.onLocationPermissionChanged(false);
        }
    }

    public static final class d implements x4.d {
        public d() {
        }

        @Override // x4.d
        public void onActivityAvailable(Activity activity) {
            h.e(activity, "activity");
            if (activity instanceof PermissionsActivity) {
                return;
            }
            b.this._applicationService.removeActivityLifecycleHandler(this);
            b.showFallbackAlertDialog$present(b.this, activity);
        }

        @Override // x4.d
        public void onActivityStopped(Activity activity) {
            h.e(activity, "activity");
        }
    }

    public static final class e implements com.onesignal.core.internal.permissions.d {
        final /* synthetic */ Activity $activity;

        public static final class a extends x4.c {
            final /* synthetic */ b this$0;

            /* renamed from: com.onesignal.location.internal.permissions.b$e$a$a, reason: collision with other inner class name */
            public static final class C0223a extends i implements l {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0223a(boolean z3) {
                    super(1);
                    this.$hasPermission = z3;
                }

                @Override // I7.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.onesignal.location.internal.permissions.a) obj);
                    return v.f41350a;
                }

                public final void invoke(com.onesignal.location.internal.permissions.a it) {
                    h.e(it, "it");
                    it.onLocationPermissionChanged(this.$hasPermission);
                }
            }

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
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0223a(hasPermission));
            }
        }

        /* renamed from: com.onesignal.location.internal.permissions.b$e$b, reason: collision with other inner class name */
        public static final class C0224b extends i implements l {
            public static final C0224b INSTANCE = new C0224b();

            public C0224b() {
                super(1);
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.location.internal.permissions.a) obj);
                return v.f41350a;
            }

            public final void invoke(com.onesignal.location.internal.permissions.a it) {
                h.e(it, "it");
                it.onLocationPermissionChanged(false);
            }
        }

        public e(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.location.internal.permissions.c.INSTANCE.show(this.$activity);
        }

        @Override // com.onesignal.core.internal.permissions.d
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0224b.INSTANCE);
        }
    }

    public b(g _requestPermission, x4.f _applicationService) {
        h.e(_requestPermission, "_requestPermission");
        h.e(_applicationService, "_applicationService");
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this.waiter = new com.onesignal.common.threading.f();
        this.events = new com.onesignal.common.events.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null || (current instanceof PermissionsActivity)) {
            this._applicationService.addActivityLifecycleHandler(new d());
            return true;
        }
        showFallbackAlertDialog$present(this, current);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFallbackAlertDialog$present(b bVar, Activity activity) {
        com.onesignal.core.internal.permissions.e eVar = com.onesignal.core.internal.permissions.e.INSTANCE;
        String string = activity.getString(C0438b.location_permission_name_for_title);
        h.d(string, "getString(...)");
        String string2 = activity.getString(C0438b.location_permission_settings_message);
        h.d(string2, "getString(...)");
        eVar.show(activity, string, string2, bVar.new e(activity));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0222b.INSTANCE);
    }

    @Override // com.onesignal.core.internal.permissions.f
    public void onReject(boolean z3) {
        if (z3 ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z3, String str, InterfaceC5267d interfaceC5267d) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z3, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(interfaceC5267d);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.location.internal.permissions.a handler) {
        h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.location.internal.permissions.a handler) {
        h.e(handler, "handler");
        this.events.subscribe(handler);
    }
}
