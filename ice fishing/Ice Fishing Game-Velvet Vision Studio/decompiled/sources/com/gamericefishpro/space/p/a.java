package com.gamericefishpro.space.p;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final HashMap w = new HashMap();

    @Override // com.gamericefishpro.space.p.f
    public final c b(Object obj) {
        return (c) this.w.get(obj);
    }

    @Override // com.gamericefishpro.space.p.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.w.remove(obj);
        return objC;
    }
}
