package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.gC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3232gC extends AbstractSequentialList implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractCollection f30547n;

    /* renamed from: u, reason: collision with root package name */
    public final UA f30548u;

    /* JADX WARN: Multi-variable type inference failed */
    public C3232gC(List list, UA ua) {
        list.getClass();
        this.f30547n = (AbstractCollection) list;
        this.f30548u = ua;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f30547n.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3124eC(this, this.f30547n.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        this.f30547n.subList(i, i6).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30547n.size();
    }
}
