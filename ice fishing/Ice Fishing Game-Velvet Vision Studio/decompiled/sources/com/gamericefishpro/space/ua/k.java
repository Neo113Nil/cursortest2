package com.gamericefishpro.space.ua;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f {
    public final transient m v;
    public final transient l w;

    public k(m mVar, l lVar) {
        this.v = mVar;
        this.w = lVar;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int b(Object[] objArr) {
        return this.w.b(objArr);
    }

    @Override // com.gamericefishpro.space.ua.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.v.get(obj) != null;
    }

    @Override // com.gamericefishpro.space.ua.f
    public final d h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final com.gamericefishpro.space.h9.g iterator() {
        return this.w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v.y;
    }
}
