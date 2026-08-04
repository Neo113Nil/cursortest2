package com.gamericefishpro.space.h0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ y0 f;

    public x0(y0 y0Var, List list) {
        this.f = y0Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            com.gamericefishpro.space.c0.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
