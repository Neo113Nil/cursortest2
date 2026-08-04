package com.gamericefishpro.space.ua;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public final transient int i;
    public final transient int v;
    public final /* synthetic */ d w;

    public c(d dVar, int i, int i2) {
        this.w = dVar;
        this.i = i;
        this.v = i2;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final Object[] c() {
        return this.w.c();
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int d() {
        return this.w.f() + this.i + this.v;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int f() {
        return this.w.f() + this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.gamericefishpro.space.wa.b.j(i, this.v);
        return this.w.get(i + this.i);
    }

    @Override // com.gamericefishpro.space.ua.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.gamericefishpro.space.ua.d, java.util.List
    /* JADX INFO: renamed from: l */
    public final d subList(int i, int i2) {
        com.gamericefishpro.space.wa.b.l(i, i2, this.v);
        int i3 = this.i;
        return this.w.subList(i + i3, i2 + i3);
    }

    @Override // com.gamericefishpro.space.ua.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.ua.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
