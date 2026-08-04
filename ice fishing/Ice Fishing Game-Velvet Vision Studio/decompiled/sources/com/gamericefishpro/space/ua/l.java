package com.gamericefishpro.space.ua;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {
    public final transient Object[] i;
    public final transient int v;
    public final transient int w;

    public l(Object[] objArr, int i, int i2) {
        this.i = objArr;
        this.v = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.wa.b.j(i, this.w);
        Object obj = this.i[(i * 2) + this.v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
