package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4105wB extends C4267zB implements NavigableSet {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3513lC f34959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4105wB(C3513lC c3513lC, NavigableMap navigableMap) {
        super(c3513lC, navigableMap);
        Objects.requireNonNull(c3513lC);
        this.f34959w = c3513lC;
    }

    @Override // com.google.android.gms.internal.ads.C4267zB
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f34375n);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34375n)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C3943tB) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C4105wB(this.f34959w, ((NavigableMap) ((SortedMap) this.f34375n)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34375n)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4267zB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34375n)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34375n)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C3835rB c3835rB = (C3835rB) iterator();
        if (!c3835rB.hasNext()) {
            return null;
        }
        Object next = c3835rB.next();
        c3835rB.remove();
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

    @Override // com.google.android.gms.internal.ads.C4267zB, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C4267zB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z8) {
        return new C4105wB(this.f34959w, ((NavigableMap) ((SortedMap) this.f34375n)).headMap(obj, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        return new C4105wB(this.f34959w, ((NavigableMap) ((SortedMap) this.f34375n)).subMap(obj, z8, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z8) {
        return new C4105wB(this.f34959w, ((NavigableMap) ((SortedMap) this.f34375n)).tailMap(obj, z8));
    }
}
