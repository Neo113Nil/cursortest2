package com.onesignal.session.internal.session.impl;

import B7.h;
import H4.f;
import I7.l;
import V5.n;
import V5.o;
import com.onesignal.core.internal.config.c;
import kotlin.jvm.internal.e;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.b, O5.a {
    public static final C0244a Companion = new C0244a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final c _configModelStore;
    private final U5.b _identityModelStore;
    private final f _operationRepo;
    private final M5.b _outcomeEventsController;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final O5.b _sessionService;

    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0244a {
        public /* synthetic */ C0244a(e eVar) {
            this();
        }

        private C0244a() {
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j6, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$durationInSeconds = j6;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return a.this.new b(this.$durationInSeconds, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                M5.b bVar = a.this._outcomeEventsController;
                long j6 = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j6, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public a(f _operationRepo, O5.b _sessionService, c _configModelStore, U5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, M5.b _outcomeEventsController) {
        kotlin.jvm.internal.h.e(_operationRepo, "_operationRepo");
        kotlin.jvm.internal.h.e(_sessionService, "_sessionService");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.h.e(_outcomeEventsController, "_outcomeEventsController");
        this._operationRepo = _operationRepo;
        this._sessionService = _sessionService;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._outcomeEventsController = _outcomeEventsController;
    }

    @Override // O5.a
    public void onSessionActive() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
    }

    @Override // O5.a
    public void onSessionEnded(long j6) {
        long j9 = j6 / 1000;
        if (j9 < 1 || j9 > 86400) {
            com.onesignal.debug.internal.logging.b.info$default("SessionListener.onSessionEnded sending duration of " + j9 + " seconds", null, 2, null);
        }
        H4.e.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), j9), false, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(j9, null));
    }

    @Override // O5.a
    public void onSessionStarted() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
