package com.onesignal.session.internal.session.impl;

import D4.f;
import E7.l;
import R5.n;
import R5.o;
import com.onesignal.core.internal.config.c;
import kotlin.jvm.internal.e;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.b, K5.a {
    public static final C0243a Companion = new C0243a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final c _configModelStore;
    private final Q5.b _identityModelStore;
    private final f _operationRepo;
    private final I5.b _outcomeEventsController;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final K5.b _sessionService;

    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0243a {
        public /* synthetic */ C0243a(e eVar) {
            this();
        }

        private C0243a() {
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j9, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$durationInSeconds = j9;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new b(this.$durationInSeconds, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                I5.b bVar = a.this._outcomeEventsController;
                long j9 = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j9, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public a(f _operationRepo, K5.b _sessionService, c _configModelStore, Q5.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, I5.b _outcomeEventsController) {
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

    @Override // K5.a
    public void onSessionActive() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
    }

    @Override // K5.a
    public void onSessionEnded(long j9) {
        long j10 = j9 / 1000;
        if (j10 < 1 || j10 > 86400) {
            com.onesignal.debug.internal.logging.b.info$default("SessionListener.onSessionEnded sending duration of " + j10 + " seconds", null, 2, null);
        }
        D4.e.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId(), j10), false, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(j10, null));
    }

    @Override // K5.a
    public void onSessionStarted() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(com.onesignal.common.l.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
