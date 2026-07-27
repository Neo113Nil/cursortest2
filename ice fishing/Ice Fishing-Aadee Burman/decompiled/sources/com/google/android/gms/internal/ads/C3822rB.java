package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3822rB extends C3984uB implements NavigableMap {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3340iC f33535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822rB(C3340iC c3340iC, NavigableMap navigableMap) {
        super(c3340iC, navigableMap);
        Objects.requireNonNull(c3340iC);
        this.f33535z = c3340iC;
    }

    @Override // com.google.android.gms.internal.ads.C3984uB
    public final SortedSet b() {
        return new C3876sB(this.f33535z, (NavigableMap) ((SortedMap) this.f33037v));
    }

    @Override // com.google.android.gms.internal.ads.C3984uB
    /* renamed from: c */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f33037v)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33037v)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3984uB
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f33037v);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C3822rB(this.f33535z, ((NavigableMap) ((SortedMap) this.f33037v)).descendingMap());
    }

    public final AbstractMap.SimpleImmutableEntry e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f33535z.f31013y.mo15c();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f33037v)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f33037v)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33037v)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3984uB, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f33037v)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33037v)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C3984uB, com.google.android.gms.internal.ads.C3715pB, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f33037v)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f33037v)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f33037v)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C3607nB) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C3607nB) ((C3715pB) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.C3984uB, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C3984uB, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z3) {
        return new C3822rB(this.f33535z, ((NavigableMap) ((SortedMap) this.f33037v)).headMap(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z3, Object obj2, boolean z6) {
        return new C3822rB(this.f33535z, ((NavigableMap) ((SortedMap) this.f33037v)).subMap(obj, z3, obj2, z6));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z3) {
        return new C3822rB(this.f33535z, ((NavigableMap) ((SortedMap) this.f33037v)).tailMap(obj, z3));
    }
}
