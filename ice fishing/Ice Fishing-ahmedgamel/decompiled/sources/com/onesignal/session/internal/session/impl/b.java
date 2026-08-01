package com.onesignal.session.internal.session.impl;

import I7.l;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;
import x4.f;
import z4.InterfaceC5261b;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements O5.b, com.onesignal.core.internal.startup.a, com.onesignal.core.internal.startup.b, InterfaceC5261b, x4.e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final O5.d _sessionModelStore;
    private final K4.a _time;
    private com.onesignal.core.internal.config.b config;
    private boolean hasFocused;
    private O5.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public static final class a extends i implements l {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j6) {
            super(1);
            this.$activeDuration = j6;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((O5.a) obj);
            return v.f41353a;
        }

        public final void invoke(O5.a it) {
            h.e(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0245b extends i implements l {
        public static final C0245b INSTANCE = new C0245b();

        public C0245b() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((O5.a) obj);
            return v.f41353a;
        }

        public final void invoke(O5.a it) {
            h.e(it, "it");
            it.onSessionStarted();
        }
    }

    public static final class c extends i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((O5.a) obj);
            return v.f41353a;
        }

        public final void invoke(O5.a it) {
            h.e(it, "it");
            it.onSessionActive();
        }
    }

    public static final class d extends i implements I7.a {
        final /* synthetic */ boolean $firedOnSubscribe;
        final /* synthetic */ long $focusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z3, long j6) {
            super(0);
            this.$firedOnSubscribe = z3;
            this.$focusTimeMs = j6;
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m46invoke();
            return v.f41353a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m46invoke() {
            b.this.handleOnFocus(this.$firedOnSubscribe, this.$focusTimeMs);
        }
    }

    public static final class e extends i implements I7.a {
        final /* synthetic */ long $unfocusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j6) {
            super(0);
            this.$unfocusTimeMs = j6;
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m47invoke();
            return v.f41353a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m47invoke() {
            b.this.handleOnUnfocused(this.$unfocusTimeMs);
        }
    }

    public b(f _applicationService, com.onesignal.core.internal.config.c _configModelStore, O5.d _sessionModelStore, K4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_configModelStore, "_configModelStore");
        h.e(_sessionModelStore, "_sessionModelStore");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        O5.c cVar = this.session;
        if (cVar != null && cVar.isValid()) {
            long activeDuration = cVar.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            cVar.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            cVar.setActiveDuration(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnFocus(boolean z3, long j6) {
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "SessionService.onFocus() - fired from start: " + z3);
        O5.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onFocus called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        if (cVar.isValid()) {
            cVar.setFocusTime(j6);
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z3;
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "toString(...)");
        cVar.setSessionId(uuid);
        cVar.setStartTime(j6);
        cVar.setFocusTime(cVar.getStartTime());
        cVar.setValid(true);
        com.onesignal.debug.internal.logging.b.debug$default("SessionService: New session started at " + cVar.getStartTime(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0245b.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnUnfocused(long j6) {
        O5.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onUnfocused called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        long focusTime = j6 - cVar.getFocusTime();
        cVar.setActiveDuration(cVar.getActiveDuration() + focusTime);
        com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "SessionService.onUnfocused adding time " + focusTime + " for total: " + cVar.getActiveDuration());
    }

    @Override // z4.InterfaceC5261b
    public Object backgroundRun(InterfaceC5267d interfaceC5267d) {
        endSession();
        return v.f41353a;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.session = (O5.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
    }

    @Override // O5.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // z4.InterfaceC5261b
    public Long getScheduleBackgroundRunIn() {
        com.onesignal.core.internal.config.b bVar;
        O5.c cVar = this.session;
        if (cVar == null || (bVar = this.config) == null || !cVar.isValid()) {
            return null;
        }
        return Long.valueOf(bVar.getSessionFocusTimeout());
    }

    @Override // O5.b
    public long getStartTime() {
        O5.c cVar = this.session;
        return cVar != null ? cVar.getStartTime() : this._time.getCurrentTimeMillis();
    }

    @Override // x4.e
    public void onFocus(boolean z3) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new d(z3, this._time.getCurrentTimeMillis()));
    }

    @Override // x4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new e(this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // O5.b, com.onesignal.common.events.d
    public void subscribe(O5.a handler) {
        h.e(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // O5.b, com.onesignal.common.events.d
    public void unsubscribe(O5.a handler) {
        h.e(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
