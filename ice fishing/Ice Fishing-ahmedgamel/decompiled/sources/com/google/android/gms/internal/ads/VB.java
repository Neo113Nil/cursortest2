package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class VB extends NB {

    /* renamed from: u, reason: collision with root package name */
    public final transient ZB f28097u;

    public VB(ZB zb) {
        this.f28097u = zb;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4255zC a() {
        return new UB(this.f28097u);
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28097u.d(obj);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        PB listIterator = ((RB) this.f28097u.f28848w.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((NB) listIterator.next()).h(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new UB(this.f28097u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f28097u.f28849x;
    }
}
