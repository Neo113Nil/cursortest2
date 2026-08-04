package com.gamericefishpro.space.h9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public final transient int i;
    public final transient int v;
    public final /* synthetic */ e w;

    public d(e eVar, int i, int i2) {
        this.w = eVar;
        this.i = i;
        this.v = i2;
    }

    @Override // com.gamericefishpro.space.h9.a
    public final Object[] b() {
        return this.w.b();
    }

    @Override // com.gamericefishpro.space.h9.a
    public final int c() {
        return this.w.c() + this.i;
    }

    @Override // com.gamericefishpro.space.h9.a
    public final int d() {
        return this.w.c() + this.i + this.v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.a.a.J(i, this.v);
        return this.w.get(i + this.i);
    }

    @Override // com.gamericefishpro.space.h9.e, java.util.List
    /* JADX INFO: renamed from: i */
    public final e subList(int i, int i2) {
        com.gamericefishpro.space.a.a.K(i, i2, this.v);
        int i3 = this.i;
        return this.w.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }
}
