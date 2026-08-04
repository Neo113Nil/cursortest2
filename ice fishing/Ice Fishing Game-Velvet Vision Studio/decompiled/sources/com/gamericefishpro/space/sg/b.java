package com.gamericefishpro.space.sg;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.lc.e;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.rg.d;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.rg.b, com.gamericefishpro.space.jd.a, com.gamericefishpro.space.jd.b, com.gamericefishpro.space.pc.b, e {
    private final f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final d _sessionModelStore;
    private final com.gamericefishpro.space.kd.a _time;
    private com.gamericefishpro.space.rc.a config;
    private boolean hasFocused;
    private com.gamericefishpro.space.rg.c session;
    private final com.gamericefishpro.space.dc.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.$activeDuration = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.rg.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.rg.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.sg.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0060b extends l implements Function1 {
        public static final C0060b INSTANCE = new C0060b();

        public C0060b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.rg.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.rg.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionStarted();
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
            invoke((com.gamericefishpro.space.rg.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.rg.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionActive();
        }
    }

    public b(f _applicationService, com.gamericefishpro.space.rc.b _configModelStore, d _sessionModelStore, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_sessionModelStore, "_sessionModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new com.gamericefishpro.space.dc.b();
    }

    private final void endSession() {
        com.gamericefishpro.space.rg.c cVar = this.session;
        Intrinsics.b(cVar);
        if (cVar.isValid()) {
            com.gamericefishpro.space.rg.c cVar2 = this.session;
            Intrinsics.b(cVar2);
            long activeDuration = cVar2.getActiveDuration();
            com.gamericefishpro.space.od.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            com.gamericefishpro.space.rg.c cVar3 = this.session;
            Intrinsics.b(cVar3);
            cVar3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            com.gamericefishpro.space.rg.c cVar4 = this.session;
            Intrinsics.b(cVar4);
            cVar4.setActiveDuration(0L);
        }
    }

    @Override // com.gamericefishpro.space.pc.b
    public Object backgroundRun(com.gamericefishpro.space.th.a aVar) {
        endSession();
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.jd.a
    public void bootstrap() {
        this.session = (com.gamericefishpro.space.rg.c) this._sessionModelStore.getModel();
        this.config = (com.gamericefishpro.space.rc.a) this._configModelStore.getModel();
    }

    @Override // com.gamericefishpro.space.rg.b, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.pc.b
    public Long getScheduleBackgroundRunIn() {
        com.gamericefishpro.space.rg.c cVar = this.session;
        Intrinsics.b(cVar);
        if (!cVar.isValid()) {
            return null;
        }
        com.gamericefishpro.space.rc.a aVar = this.config;
        Intrinsics.b(aVar);
        return Long.valueOf(aVar.getSessionFocusTimeout());
    }

    @Override // com.gamericefishpro.space.rg.b
    public long getStartTime() {
        com.gamericefishpro.space.rg.c cVar = this.session;
        Intrinsics.b(cVar);
        return cVar.getStartTime();
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onFocus(boolean z) {
        com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "SessionService.onFocus() - fired from start: " + z);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        com.gamericefishpro.space.rg.c cVar = this.session;
        Intrinsics.b(cVar);
        if (cVar.isValid()) {
            com.gamericefishpro.space.rg.c cVar2 = this.session;
            Intrinsics.b(cVar2);
            cVar2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z;
        com.gamericefishpro.space.rg.c cVar3 = this.session;
        Intrinsics.b(cVar3);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        cVar3.setSessionId(string);
        com.gamericefishpro.space.rg.c cVar4 = this.session;
        Intrinsics.b(cVar4);
        cVar4.setStartTime(this._time.getCurrentTimeMillis());
        com.gamericefishpro.space.rg.c cVar5 = this.session;
        Intrinsics.b(cVar5);
        com.gamericefishpro.space.rg.c cVar6 = this.session;
        Intrinsics.b(cVar6);
        cVar5.setFocusTime(cVar6.getStartTime());
        com.gamericefishpro.space.rg.c cVar7 = this.session;
        Intrinsics.b(cVar7);
        cVar7.setValid(true);
        StringBuilder sb = new StringBuilder("SessionService: New session started at ");
        com.gamericefishpro.space.rg.c cVar8 = this.session;
        Intrinsics.b(cVar8);
        sb.append(cVar8.getStartTime());
        com.gamericefishpro.space.od.b.debug$default(sb.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0060b.INSTANCE);
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        com.gamericefishpro.space.rg.c cVar = this.session;
        Intrinsics.b(cVar);
        long focusTime = currentTimeMillis - cVar.getFocusTime();
        com.gamericefishpro.space.rg.c cVar2 = this.session;
        Intrinsics.b(cVar2);
        cVar2.setActiveDuration(cVar2.getActiveDuration() + focusTime);
        com.gamericefishpro.space.md.c cVar3 = com.gamericefishpro.space.md.c.DEBUG;
        StringBuilder sb = new StringBuilder("SessionService.onUnfocused adding time ");
        sb.append(focusTime);
        sb.append(" for total: ");
        com.gamericefishpro.space.rg.c cVar4 = this.session;
        Intrinsics.b(cVar4);
        sb.append(cVar4.getActiveDuration());
        com.gamericefishpro.space.od.b.log(cVar3, sb.toString());
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // com.gamericefishpro.space.rg.b, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.rg.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // com.gamericefishpro.space.rg.b, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.rg.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
