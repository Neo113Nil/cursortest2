package com.gamericefishpro.space.v7;

import com.gamericefishpro.space.f7.j;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.z4.m0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.b7.b {
    public final j d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j startupRepository) {
        super(new g(0, false));
        Intrinsics.checkNotNullParameter(startupRepository, "startupRepository");
        this.d = startupRepository;
        a0.u(m0.h(this), null, new h(this, null, 0), 3);
    }
}
