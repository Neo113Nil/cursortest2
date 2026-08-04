package com.gamericefishpro.space.fh;

import com.gamericefishpro.space.bd.f;
import com.gamericefishpro.space.bd.g;
import com.gamericefishpro.space.dh.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.dd.b {
    private final com.gamericefishpro.space.rc.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.gamericefishpro.space.bh.b store, f opRepo, com.gamericefishpro.space.rc.b _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // com.gamericefishpro.space.dd.b
    public g getReplaceOperation(com.gamericefishpro.space.bh.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // com.gamericefishpro.space.dd.b
    public g getUpdateOperation(com.gamericefishpro.space.bh.a model, String path, String property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new com.gamericefishpro.space.dh.b(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), property) : new i(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), model.getOnesignalId(), property, (String) obj2);
    }
}
