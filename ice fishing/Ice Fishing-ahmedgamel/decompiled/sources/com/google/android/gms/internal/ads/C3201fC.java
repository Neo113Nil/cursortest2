package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.fC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3201fC extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractCollection f31023n;

    /* renamed from: u, reason: collision with root package name */
    public final UA f31024u;

    /* JADX WARN: Multi-variable type inference failed */
    public C3201fC(List list, UA ua) {
        list.getClass();
        this.f31023n = (AbstractCollection) list;
        this.f31024u = ua;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f31024u.apply(this.f31023n.get(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31023n.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3147eC(this, this.f31023n.listIterator(i), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f31024u.apply(this.f31023n.remove(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f31023n.subList(i, i4).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31023n.size();
    }
}
