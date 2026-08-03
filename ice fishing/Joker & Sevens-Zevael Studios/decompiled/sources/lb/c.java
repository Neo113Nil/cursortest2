package lb;

import ac.i;
import kb.p;
import ob.d;
import ob.e;
import pc.f;
import pc.j;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends a9.a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public final i getSubscriptionEnabledAndStatus(d dVar) {
            ob.f status;
            boolean z10;
            j.e(dVar, "model");
            if (dVar.getOptedIn()) {
                ob.f status2 = dVar.getStatus();
                status = ob.f.SUBSCRIBED;
                if (status2 == status && dVar.getAddress().length() > 0) {
                    z10 = true;
                    return new i(Boolean.valueOf(z10), status);
                }
            }
            status = !dVar.getOptedIn() ? ob.f.UNSUBSCRIBE : dVar.getStatus();
            z10 = false;
            return new i(Boolean.valueOf(z10), status);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, z8.f fVar, jb.b bVar, com.onesignal.core.internal.config.b bVar2) {
        super(eVar, fVar);
        j.e(eVar, "store");
        j.e(fVar, "opRepo");
        j.e(bVar, "_identityModelStore");
        j.e(bVar2, "_configModelStore");
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    @Override // a9.a
    public g getAddOperation(d dVar) {
        j.e(dVar, "model");
        i subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar);
        return new kb.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f270g).booleanValue(), dVar.getAddress(), (ob.f) subscriptionEnabledAndStatus.f271h);
    }

    @Override // a9.a
    public g getRemoveOperation(d dVar) {
        j.e(dVar, "model");
        return new kb.c(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId());
    }

    @Override // a9.a
    public g getUpdateOperation(d dVar, String str, String str2, Object obj, Object obj2) {
        j.e(dVar, "model");
        j.e(str, "path");
        j.e(str2, "property");
        i subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar);
        return new p(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f270g).booleanValue(), dVar.getAddress(), (ob.f) subscriptionEnabledAndStatus.f271h);
    }
}
