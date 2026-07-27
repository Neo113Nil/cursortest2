package S5;

import D4.f;
import D4.g;
import R5.i;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a extends E4.b {
    private final com.onesignal.core.internal.config.c _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q5.b store, f opRepo, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        h.e(store, "store");
        h.e(opRepo, "opRepo");
        h.e(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // E4.b
    public g getReplaceOperation(Q5.a model) {
        h.e(model, "model");
        return null;
    }

    @Override // E4.b
    public g getUpdateOperation(Q5.a model, String path, String property, Object obj, Object obj2) {
        h.e(model, "model");
        h.e(path, "path");
        h.e(property, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new R5.b(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property) : new i(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), model.getExternalId(), property, (String) obj2);
    }
}
