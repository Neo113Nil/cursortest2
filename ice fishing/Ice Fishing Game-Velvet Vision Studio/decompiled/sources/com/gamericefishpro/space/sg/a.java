package com.gamericefishpro.space.sg;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.dh.n;
import com.gamericefishpro.space.dh.o;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.yb.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.jd.b, com.gamericefishpro.space.rg.a {
    public static final C0059a Companion = new C0059a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final f _operationRepo;
    private final com.gamericefishpro.space.og.b _outcomeEventsController;
    private final com.gamericefishpro.space.hh.b _propertiesModelStore;
    private final com.gamericefishpro.space.rg.b _sessionService;

    /* JADX INFO: renamed from: com.gamericefishpro.space.sg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0059a {
        public /* synthetic */ C0059a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0059a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$durationInSeconds = j;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(this.$durationInSeconds, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.og.b bVar = a.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j, this) == aVar) {
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

    public a(f _operationRepo, com.gamericefishpro.space.rg.b _sessionService, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.hh.b _propertiesModelStore, com.gamericefishpro.space.og.b _outcomeEventsController) {
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        this._operationRepo = _operationRepo;
        this._sessionService = _sessionService;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._outcomeEventsController = _outcomeEventsController;
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
        ((com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel()).setTimezone(j.INSTANCE.getTimeZoneId());
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j) {
        long j2 = j / ((long) 1000);
        if (j2 < 1 || j2 > SECONDS_IN_A_DAY) {
            com.gamericefishpro.space.od.b.error$default("SessionListener.onSessionEnded sending duration of " + j2 + " seconds", null, 2, null);
        }
        e.enqueue$default(this._operationRepo, new n(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), j2), false, 2, null);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(j2, null), 1, null);
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        ((com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel()).setTimezone(j.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId()), true);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
