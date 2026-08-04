package com.gamericefishpro.space.h0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final int a;
    public final int b;
    public final s c;

    public j(int i, int i2, s sVar) {
        this.a = i;
        this.b = i2;
        this.c = sVar;
        if (i < 0) {
            com.gamericefishpro.space.c0.a.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        com.gamericefishpro.space.c0.a.a("size should be > 0");
    }
}
