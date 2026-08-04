package com.gamericefishpro.space.ua;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {
    public final /* synthetic */ j i;

    public i(j jVar) {
        this.i = jVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j jVar = this.i;
        com.gamericefishpro.space.wa.b.j(i, jVar.y);
        Object[] objArr = jVar.w;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.y;
    }
}
