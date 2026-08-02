package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3899sB extends C4061vB implements NavigableSet {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3363iC f34676w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3899sB(C3363iC c3363iC, NavigableMap navigableMap) {
        super(c3363iC, navigableMap);
        Objects.requireNonNull(c3363iC);
        this.f34676w = c3363iC;
    }

    @Override // com.google.android.gms.internal.ads.C4061vB
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f33991n);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33991n)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C3792qB) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C3899sB(this.f34676w, ((NavigableMap) ((SortedMap) this.f33991n)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33991n)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4061vB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33991n)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33991n)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C3684oB c3684oB = (C3684oB) iterator();
        if (!c3684oB.hasNext()) {
            return null;
        }
        Object next = c3684oB.next();
        c3684oB.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.C4061vB, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C4061vB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new C3899sB(this.f34676w, ((NavigableMap) ((SortedMap) this.f33991n)).headMap(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z9) {
        return new C3899sB(this.f34676w, ((NavigableMap) ((SortedMap) this.f33991n)).subMap(obj, z6, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new C3899sB(this.f34676w, ((NavigableMap) ((SortedMap) this.f33991n)).tailMap(obj, z6));
    }
}
