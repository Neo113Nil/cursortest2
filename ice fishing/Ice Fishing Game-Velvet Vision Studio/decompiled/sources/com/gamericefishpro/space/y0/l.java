package com.gamericefishpro.space.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {
    public final com.gamericefishpro.space.ph.h v;

    public l(com.gamericefishpro.space.ph.h hVar) {
        this.v = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.i;
        this.i = i + 2;
        Object[] objArr = this.d;
        return new a(this.v, objArr[i], objArr[i + 1]);
    }
}
