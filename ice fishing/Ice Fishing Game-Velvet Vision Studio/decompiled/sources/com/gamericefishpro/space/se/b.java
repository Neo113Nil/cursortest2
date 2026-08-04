package com.gamericefishpro.space.se;

import android.app.Activity;
import com.gamericefishpro.space.ed.e;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.lc.f;
import com.onesignal.common.AndroidUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e, com.gamericefishpro.space.jd.b, com.gamericefishpro.space.dc.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final f _applicationService;
    private final com.gamericefishpro.space.ed.f _requestPermission;
    private String currPermission;
    private final com.gamericefishpro.space.dc.b events;
    private final com.gamericefishpro.space.ic.d waiter;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.se.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0053b extends l implements Function1 {
        public static final C0053b INSTANCE = new C0053b();

        public C0053b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.se.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.se.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationPermissionChanged(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends l implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.se.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.se.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationPermissionChanged(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d implements com.gamericefishpro.space.ed.c {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.lc.c {
            final /* synthetic */ b this$0;

            /* JADX INFO: renamed from: com.gamericefishpro.space.se.b$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
            public static final class C0054a extends l implements Function1 {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0054a(boolean z) {
                    super(1);
                    this.$hasPermission = z;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.gamericefishpro.space.se.a) obj);
                    return Unit.a;
                }

                public final void invoke(com.gamericefishpro.space.se.a it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onLocationPermissionChanged(this.$hasPermission);
                }
            }

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
                boolean zHasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(zHasPermission));
                this.this$0.events.fire(new C0054a(zHasPermission));
            }
        }

        /* JADX INFO: renamed from: com.gamericefishpro.space.se.b$d$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0055b extends l implements Function1 {
            public static final C0055b INSTANCE = new C0055b();

            public C0055b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.se.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.se.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onLocationPermissionChanged(false);
            }
        }

        public d(Activity activity) {
            this.$activity = activity;
        }

        @Override // com.gamericefishpro.space.ed.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.gamericefishpro.space.se.c.INSTANCE.show(this.$activity);
        }

        @Override // com.gamericefishpro.space.ed.c
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0055b.INSTANCE);
        }
    }

    public b(com.gamericefishpro.space.ed.f _requestPermission, f _applicationService) {
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this.waiter = new com.gamericefishpro.space.ic.d();
        this.events = new com.gamericefishpro.space.dc.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        com.gamericefishpro.space.ed.d dVar = com.gamericefishpro.space.ed.d.INSTANCE;
        String string = current.getString(com.gamericefishpro.space.ke.b.location_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = current.getString(com.gamericefishpro.space.ke.b.location_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        dVar.show(current, string, string2, new d(current));
        return true;
    }

    @Override // com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.ed.e
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0053b.INSTANCE);
    }

    @Override // com.gamericefishpro.space.ed.e
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z, String str, com.gamericefishpro.space.th.a aVar) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(aVar);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.se.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.se.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }
}
