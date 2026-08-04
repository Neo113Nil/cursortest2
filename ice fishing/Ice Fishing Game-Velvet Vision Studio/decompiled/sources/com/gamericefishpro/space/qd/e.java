package com.gamericefishpro.space.qd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e implements com.gamericefishpro.space.pd.i, com.gamericefishpro.space.pd.h, com.gamericefishpro.space.pd.f, com.gamericefishpro.space.pd.e {
    private final com.gamericefishpro.space.pd.a message;

    public e(com.gamericefishpro.space.pd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @Override // com.gamericefishpro.space.pd.i, com.gamericefishpro.space.pd.h, com.gamericefishpro.space.pd.f, com.gamericefishpro.space.pd.e
    public com.gamericefishpro.space.pd.a getMessage() {
        return this.message;
    }
}
