package lb;

import kb.d;
import kb.k;
import pc.j;
import xc.h;
import z8.f;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends a9.b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.onesignal.user.internal.properties.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        j.e(bVar, "store");
        j.e(fVar, "opRepo");
        j.e(bVar2, "_configModelStore");
        this._configModelStore = bVar2;
    }

    @Override // a9.b
    public g getReplaceOperation(com.onesignal.user.internal.properties.a aVar) {
        j.e(aVar, "model");
        return null;
    }

    @Override // a9.b
    public g getUpdateOperation(com.onesignal.user.internal.properties.a aVar, String str, String str2, Object obj, Object obj2) {
        j.e(aVar, "model");
        j.e(str, "path");
        j.e(str2, "property");
        if (h.x(str, "locationTimestamp") || h.x(str, "locationBackground") || h.x(str, "locationType") || h.x(str, "locationAccuracy")) {
            return null;
        }
        return h.x(str, "tags") ? (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new k(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2) : new kb.j(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, obj2);
    }
}
