package com.onesignal.user.internal.migrations;

import D4.e;
import D4.f;
import E7.l;
import kotlin.jvm.internal.s;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class d implements com.onesignal.core.internal.startup.b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Q5.b _identityModelStore;
    private final f _operationRepo;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return d.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((Q5.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public d(f _operationRepo, Q5.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(_operationRepo, "_operationRepo");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((Q5.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((Q5.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(s.a(R5.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new R5.f(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
    }
}
