package com.gamericefishpro.space.ch;

import com.gamericefishpro.space.bd.e;
import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.jd.b {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final f _operationRepo;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function2 {
        int label;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return d.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            if (d.this.isInBadState()) {
                com.gamericefishpro.space.od.b.warn$default("User with externalId:" + ((com.gamericefishpro.space.bh.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return Unit.a;
        }
    }

    public d(f _operationRepo, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.rc.b _configModelStore) {
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getExternalId() == null || !com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(b0.a(com.gamericefishpro.space.dh.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new com.gamericefishpro.space.dh.f(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        a0.u(x0.d, com.gamericefishpro.space.wi.d.i, new a(null), 2);
    }
}
