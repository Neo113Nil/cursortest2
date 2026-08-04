package com.gamericefishpro.space.ua;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {
    public static final h w = new h(0, new Object[0]);
    public final transient Object[] i;
    public final transient int v;

    public h(int i, Object[] objArr) {
        this.i = objArr;
        this.v = i;
    }

    @Override // com.gamericefishpro.space.ua.d, com.gamericefishpro.space.ua.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.v;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final Object[] c() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int d() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.wa.b.j(i, this.v);
        Object obj = this.i[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }
}
