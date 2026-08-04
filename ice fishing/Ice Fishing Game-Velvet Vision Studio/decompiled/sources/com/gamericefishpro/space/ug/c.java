package com.gamericefishpro.space.ug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements com.gamericefishpro.space.mh.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.gamericefishpro.space.jh.d model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // com.gamericefishpro.space.mh.d
    public String getNumber() {
        return getModel().getAddress();
    }
}
