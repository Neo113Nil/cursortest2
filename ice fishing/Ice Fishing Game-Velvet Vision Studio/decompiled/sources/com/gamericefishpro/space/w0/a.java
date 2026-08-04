package com.gamericefishpro.space.w0;

import com.gamericefishpro.space.ph.f;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {
    public final com.gamericefishpro.space.x0.b e;
    public final int i;
    public final int v;

    public a(com.gamericefishpro.space.x0.b bVar, int i, int i2) {
        this.e = bVar;
        this.i = i;
        com.gamericefishpro.space.b9.a.j(i, i2, bVar.size());
        this.v = i2 - i;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.b9.a.h(i, this.v);
        return this.e.get(this.i + i);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final List subList(int i, int i2) {
        com.gamericefishpro.space.b9.a.j(i, i2, this.v);
        int i3 = this.i;
        return new a(this.e, i + i3, i3 + i2);
    }
}
