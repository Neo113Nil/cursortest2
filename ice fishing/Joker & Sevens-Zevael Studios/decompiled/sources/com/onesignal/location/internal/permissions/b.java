package com.onesignal.location.internal.permissions;

import ac.o;
import android.app.Activity;
import b9.e;
import com.onesignal.common.AndroidUtils;
import pc.j;
import pc.k;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements e, d9.b, com.onesignal.common.events.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final f _applicationService;
    private final b9.f _requestPermission;
    private String currPermission;
    private final com.onesignal.common.events.b events;
    private final com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.location.internal.permissions.b$b, reason: collision with other inner class name */
    public static final class C0043b extends k implements oc.c {
        public static final C0043b INSTANCE = new C0043b();

        public C0043b() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return o.f277a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            j.e(aVar, "it");
            aVar.onLocationPermissionChanged(true);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends k implements oc.c {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return o.f277a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            j.e(aVar, "it");
            aVar.onLocationPermissionChanged(false);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d implements b9.c {
        final /* synthetic */ Activity $activity;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends q8.c {
            final /* synthetic */ b this$0;

            /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
            /* renamed from: com.onesignal.location.internal.permissions.b$d$a$a, reason: collision with other inner class name */
            public static final class C0044a extends k implements oc.c {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0044a(boolean z10) {
                    super(1);
                    this.$hasPermission = z10;
                }

                @Override // oc.c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.onesignal.location.internal.permissions.a) obj);
                    return o.f277a;
                }

                public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                    j.e(aVar, "it");
                    aVar.onLocationPermissionChanged(this.$hasPermission);
                }
            }

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
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0044a(hasPermission));
            }
        }

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.location.internal.permissions.b$d$b, reason: collision with other inner class name */
        public static final class C0045b extends k implements oc.c {
            public static final C0045b INSTANCE = new C0045b();

            public C0045b() {
                super(1);
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.location.internal.permissions.a) obj);
                return o.f277a;
            }

            public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                j.e(aVar, "it");
                aVar.onLocationPermissionChanged(false);
            }
        }

        public d(Activity activity) {
            this.$activity = activity;
        }

        @Override // b9.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.location.internal.permissions.c.INSTANCE.show(this.$activity);
        }

        @Override // b9.c
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0045b.INSTANCE);
        }
    }

    public b(b9.f fVar, f fVar2) {
        j.e(fVar, "_requestPermission");
        j.e(fVar2, "_applicationService");
        this._requestPermission = fVar;
        this._applicationService = fVar2;
        this.waiter = new com.onesignal.common.threading.d();
        this.events = new com.onesignal.common.events.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        b9.d dVar = b9.d.INSTANCE;
        String string = current.getString(u9.b.location_permission_name_for_title);
        j.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(u9.b.location_permission_settings_message);
        j.d(string2, "activity.getString(R.str…mission_settings_message)");
        dVar.show(current, string, string2, new d(current));
        return true;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // b9.e
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0043b.INSTANCE);
    }

    @Override // b9.e
    public void onReject(boolean z10) {
        if (z10 ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z10, String str, fc.d dVar) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z10, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(dVar);
    }

    @Override // d9.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.location.internal.permissions.a aVar) {
        j.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.location.internal.permissions.a aVar) {
        j.e(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
