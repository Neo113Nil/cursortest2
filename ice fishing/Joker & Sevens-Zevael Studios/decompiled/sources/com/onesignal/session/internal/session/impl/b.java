package com.onesignal.session.internal.session.impl;

import ac.o;
import eb.d;
import java.util.UUID;
import pc.j;
import pc.k;
import q8.e;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements eb.b, d9.a, d9.b, s8.b, e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final d _sessionModelStore;
    private final e9.a _time;
    private com.onesignal.core.internal.config.a config;
    private boolean hasFocused;
    private eb.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.c {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j3) {
            super(1);
            this.$activeDuration = j3;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((eb.a) obj);
            return o.f277a;
        }

        public final void invoke(eb.a aVar) {
            j.e(aVar, "it");
            aVar.onSessionEnded(this.$activeDuration);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0064b extends k implements oc.c {
        public static final C0064b INSTANCE = new C0064b();

        public C0064b() {
            super(1);
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((eb.a) obj);
            return o.f277a;
        }

        public final void invoke(eb.a aVar) {
            j.e(aVar, "it");
            aVar.onSessionStarted();
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
            invoke((eb.a) obj);
            return o.f277a;
        }

        public final void invoke(eb.a aVar) {
            j.e(aVar, "it");
            aVar.onSessionActive();
        }
    }

    public b(f fVar, com.onesignal.core.internal.config.b bVar, d dVar, e9.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_configModelStore");
        j.e(dVar, "_sessionModelStore");
        j.e(aVar, "_time");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._sessionModelStore = dVar;
        this._time = aVar;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        eb.c cVar = this.session;
        j.b(cVar);
        if (cVar.isValid()) {
            eb.c cVar2 = this.session;
            j.b(cVar2);
            long activeDuration = cVar2.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            eb.c cVar3 = this.session;
            j.b(cVar3);
            cVar3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            eb.c cVar4 = this.session;
            j.b(cVar4);
            cVar4.setActiveDuration(0L);
        }
    }

    @Override // s8.b
    public Object backgroundRun(fc.d dVar) {
        endSession();
        return o.f277a;
    }

    @Override // d9.a
    public void bootstrap() {
        this.session = (eb.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
    }

    @Override // eb.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // s8.b
    public Long getScheduleBackgroundRunIn() {
        eb.c cVar = this.session;
        j.b(cVar);
        if (!cVar.isValid()) {
            return null;
        }
        com.onesignal.core.internal.config.a aVar = this.config;
        j.b(aVar);
        return Long.valueOf(aVar.getSessionFocusTimeout());
    }

    @Override // eb.b
    public long getStartTime() {
        eb.c cVar = this.session;
        j.b(cVar);
        return cVar.getStartTime();
    }

    @Override // q8.e
    public void onFocus(boolean z10) {
        com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "SessionService.onFocus() - fired from start: " + z10);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        eb.c cVar = this.session;
        j.b(cVar);
        if (cVar.isValid()) {
            eb.c cVar2 = this.session;
            j.b(cVar2);
            cVar2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z10;
        eb.c cVar3 = this.session;
        j.b(cVar3);
        String uuid = UUID.randomUUID().toString();
        j.d(uuid, "randomUUID().toString()");
        cVar3.setSessionId(uuid);
        eb.c cVar4 = this.session;
        j.b(cVar4);
        cVar4.setStartTime(this._time.getCurrentTimeMillis());
        eb.c cVar5 = this.session;
        j.b(cVar5);
        eb.c cVar6 = this.session;
        j.b(cVar6);
        cVar5.setFocusTime(cVar6.getStartTime());
        eb.c cVar7 = this.session;
        j.b(cVar7);
        cVar7.setValid(true);
        StringBuilder sb = new StringBuilder("SessionService: New session started at ");
        eb.c cVar8 = this.session;
        j.b(cVar8);
        sb.append(cVar8.getStartTime());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0064b.INSTANCE);
    }

    @Override // q8.e
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        eb.c cVar = this.session;
        j.b(cVar);
        long focusTime = currentTimeMillis - cVar.getFocusTime();
        eb.c cVar2 = this.session;
        j.b(cVar2);
        cVar2.setActiveDuration(cVar2.getActiveDuration() + focusTime);
        g9.c cVar3 = g9.c.DEBUG;
        StringBuilder sb = new StringBuilder("SessionService.onUnfocused adding time ");
        sb.append(focusTime);
        sb.append(" for total: ");
        eb.c cVar4 = this.session;
        j.b(cVar4);
        sb.append(cVar4.getActiveDuration());
        com.onesignal.debug.internal.logging.b.log(cVar3, sb.toString());
    }

    @Override // d9.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // eb.b, com.onesignal.common.events.d
    public void subscribe(eb.a aVar) {
        j.e(aVar, "handler");
        this.sessionLifeCycleNotifier.subscribe(aVar);
        if (this.shouldFireOnSubscribe) {
            aVar.onSessionStarted();
        }
    }

    @Override // eb.b, com.onesignal.common.events.d
    public void unsubscribe(eb.a aVar) {
        j.e(aVar, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(aVar);
    }
}
