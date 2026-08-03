package lb;

import kb.i;
import pc.j;
import z8.f;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends a9.b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jb.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        j.e(bVar, "store");
        j.e(fVar, "opRepo");
        j.e(bVar2, "_configModelStore");
        this._configModelStore = bVar2;
    }

    @Override // a9.b
    public g getReplaceOperation(jb.a aVar) {
        j.e(aVar, "model");
        return null;
    }

    @Override // a9.b
    public g getUpdateOperation(jb.a aVar, String str, String str2, Object obj, Object obj2) {
        j.e(aVar, "model");
        j.e(str, "path");
        j.e(str2, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new kb.b(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new i(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2);
    }
}
