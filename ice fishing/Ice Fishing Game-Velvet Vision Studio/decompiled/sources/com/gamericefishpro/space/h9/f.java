package com.gamericefishpro.space.h9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    public static final f w = new f(0, new Object[0]);
    public final transient Object[] i;
    public final transient int v;

    public f(int i, Object[] objArr) {
        this.i = objArr;
        this.v = i;
    }

    @Override // com.gamericefishpro.space.h9.a
    public final Object[] b() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.h9.a
    public final int c() {
        return 0;
    }

    @Override // com.gamericefishpro.space.h9.a
    public final int d() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.h9.e, com.gamericefishpro.space.h9.a
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.v;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.a.a.J(i, this.v);
        Object obj = this.i[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }
}
