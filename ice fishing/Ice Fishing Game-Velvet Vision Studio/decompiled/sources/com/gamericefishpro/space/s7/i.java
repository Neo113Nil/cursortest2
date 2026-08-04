package com.gamericefishpro.space.s7;

import com.gamericefishpro.space.si.e0;
import com.gamericefishpro.space.si.l;
import com.gamericefishpro.space.si.m;
import com.gamericefishpro.space.z4.m0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.b7.b {
    public final com.gamericefishpro.space.f7.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.gamericefishpro.space.f7.c gameRepository) {
        super(new e(true, true, true, "1.0"));
        Intrinsics.checkNotNullParameter(gameRepository, "gameRepository");
        this.d = gameRepository;
        e0.k(new m(new l(2, new com.gamericefishpro.space.si.e[]{gameRepository.e, gameRepository.f, gameRepository.g}, new f(4, null)), new com.gamericefishpro.space.k7.e(this, null, 8), 1), m0.h(this));
    }
}
