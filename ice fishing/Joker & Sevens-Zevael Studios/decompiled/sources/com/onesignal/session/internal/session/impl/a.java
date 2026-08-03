package com.onesignal.session.internal.session.impl;

import ac.o;
import fc.d;
import hc.j;
import kb.m;
import kb.n;
import oc.c;
import z8.e;
import z8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements d9.b, eb.a {
    public static final C0063a Companion = new C0063a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;
    private final f _operationRepo;
    private final cb.b _outcomeEventsController;
    private final eb.b _sessionService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0063a {
        public /* synthetic */ C0063a(pc.f fVar) {
            this();
        }

        private C0063a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements c {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j3, d dVar) {
            super(1, dVar);
            this.$durationInSeconds = j3;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return a.this.new b(this.$durationInSeconds, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                cb.b bVar = a.this._outcomeEventsController;
                long j3 = this.$durationInSeconds;
                this.label = 1;
                Object sendSessionEndOutcomeEvent = bVar.sendSessionEndOutcomeEvent(j3, this);
                gc.a aVar = gc.a.f2559g;
                if (sendSessionEndOutcomeEvent == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    public a(f fVar, eb.b bVar, com.onesignal.core.internal.config.b bVar2, jb.b bVar3, cb.b bVar4) {
        pc.j.e(fVar, "_operationRepo");
        pc.j.e(bVar, "_sessionService");
        pc.j.e(bVar2, "_configModelStore");
        pc.j.e(bVar3, "_identityModelStore");
        pc.j.e(bVar4, "_outcomeEventsController");
        this._operationRepo = fVar;
        this._sessionService = bVar;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this._outcomeEventsController = bVar4;
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
        long j6 = j3 / 1000;
        if (j6 < 1 || j6 > SECONDS_IN_A_DAY) {
            com.onesignal.debug.internal.logging.b.error$default("SessionListener.onSessionEnded sending duration of " + j6 + " seconds", null, 2, null);
        }
        e.enqueue$default(this._operationRepo, new m(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), j6), false, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(j6, null), 1, null);
    }

    @Override // eb.a
    public void onSessionStarted() {
        this._operationRepo.enqueue(new n(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId()), true);
    }

    @Override // d9.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // eb.a
    public void onSessionActive() {
    }
}
