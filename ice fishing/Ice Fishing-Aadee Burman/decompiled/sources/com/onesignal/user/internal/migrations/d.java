package com.onesignal.user.internal.migrations;

import B7.h;
import H4.e;
import H4.f;
import I7.l;
import kotlin.jvm.internal.s;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d implements com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final U5.b _identityModelStore;
    private final f _operationRepo;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return d.this.new a(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((U5.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return v.f41350a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC5267d)).invokeSuspend(v.f41350a);
        }
    }

    public d(f _operationRepo, U5.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_operationRepo, "_operationRepo");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((U5.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((U5.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(s.a(V5.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new V5.f(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
    }
}
