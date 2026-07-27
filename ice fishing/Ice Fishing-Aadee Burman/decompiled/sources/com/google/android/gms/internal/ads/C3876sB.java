package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3876sB extends C4038vB implements NavigableSet {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3340iC f33908w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3876sB(C3340iC c3340iC, NavigableMap navigableMap) {
        super(c3340iC, navigableMap);
        Objects.requireNonNull(c3340iC);
        this.f33908w = c3340iC;
    }

    @Override // com.google.android.gms.internal.ads.C4038vB
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f33207n);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33207n)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C3769qB) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C3876sB(this.f33908w, ((NavigableMap) ((SortedMap) this.f33207n)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33207n)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4038vB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33207n)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33207n)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C3661oB c3661oB = (C3661oB) iterator();
        if (!c3661oB.hasNext()) {
            return null;
        }
        Object next = c3661oB.next();
        c3661oB.remove();
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

    @Override // com.google.android.gms.internal.ads.C4038vB, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C4038vB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new C3876sB(this.f33908w, ((NavigableMap) ((SortedMap) this.f33207n)).headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z6) {
        return new C3876sB(this.f33908w, ((NavigableMap) ((SortedMap) this.f33207n)).subMap(obj, z3, obj2, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new C3876sB(this.f33908w, ((NavigableMap) ((SortedMap) this.f33207n)).tailMap(obj, z3));
    }
}
