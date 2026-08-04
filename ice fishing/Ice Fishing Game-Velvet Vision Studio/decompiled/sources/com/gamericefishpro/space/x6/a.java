package com.gamericefishpro.space.x6;

import com.gamericefishpro.space.r5.b;
import com.gamericefishpro.space.s5.y;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    default void a(Runnable runnable) {
        ((y) ((b) this).e).execute(runnable);
    }
}
