package com.onesignal.user.internal.migrations;

import ac.o;
import fc.i;
import hc.j;
import oc.e;
import pc.t;
import yc.a0;
import yc.i0;
import yc.l1;
import yc.r1;
import yc.y;
import yc.z;
import z8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements d9.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;
    private final f _operationRepo;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends j implements e {
        int label;

        public a(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return d.this.new a(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                f fVar = d.this._operationRepo;
                this.label = 1;
                Object awaitInitialized = fVar.awaitInitialized(this);
                gc.a aVar = gc.a.f2559g;
                if (awaitInitialized == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            if (d.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((jb.a) d.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                d.this.recoverByAddingBackDroppedLoginOperation();
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public d(f fVar, jb.b bVar, com.onesignal.core.internal.config.b bVar2) {
        pc.j.e(fVar, "_operationRepo");
        pc.j.e(bVar, "_identityModelStore");
        pc.j.e(bVar2, "_configModelStore");
        this._operationRepo = fVar;
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((jb.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.e.INSTANCE.isLocalId(((jb.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(t.a(kb.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        z8.e.enqueue$default(this._operationRepo, new kb.f(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), ((jb.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // d9.b
    public void start() {
        i iVar = i0.f8861c;
        a aVar = new a(null);
        int i10 = 2 & 1;
        i iVar2 = fc.j.f2348g;
        if (i10 != 0) {
            iVar = iVar2;
        }
        z zVar = (2 & 2) != 0 ? z.f8921g : z.f8924j;
        i h10 = a0.h(iVar2, iVar, true);
        fd.e eVar = i0.f8859a;
        if (h10 != eVar && h10.v(fc.e.f2347g) == null) {
            h10 = h10.d(eVar);
        }
        yc.a l1Var = zVar == z.f8922h ? new l1(h10, aVar) : new r1(h10, true);
        l1Var.f0(zVar, l1Var, aVar);
    }
}
