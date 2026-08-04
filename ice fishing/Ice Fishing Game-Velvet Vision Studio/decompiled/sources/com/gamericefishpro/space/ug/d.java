package com.gamericefishpro.space.ug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements com.gamericefishpro.space.mh.e {
    private final com.gamericefishpro.space.jh.d model;

    public d(com.gamericefishpro.space.jh.d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    @Override // com.gamericefishpro.space.mh.e
    public String getId() {
        return com.gamericefishpro.space.yb.c.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final com.gamericefishpro.space.jh.d getModel() {
        return this.model;
    }
}
