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

/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4051vB extends C4213yB implements NavigableMap {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C3513lC f34740z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4051vB(C3513lC c3513lC, NavigableMap navigableMap) {
        super(c3513lC, navigableMap);
        Objects.requireNonNull(c3513lC);
        this.f34740z = c3513lC;
    }

    @Override // com.google.android.gms.internal.ads.C4213yB
    public final SortedSet b() {
        return new C4105wB(this.f34740z, (NavigableMap) ((SortedMap) this.f34209v));
    }

    @Override // com.google.android.gms.internal.ads.C4213yB
    /* renamed from: c */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f34209v)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34209v)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4213yB
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f34209v);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C4051vB(this.f34740z, ((NavigableMap) ((SortedMap) this.f34209v)).descendingMap());
    }

    public final AbstractMap.SimpleImmutableEntry e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f34740z.f32553y.a();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f34209v)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f34209v)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34209v)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4213yB, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f34209v)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34209v)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C4213yB, com.google.android.gms.internal.ads.C3889sB, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f34209v)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f34209v)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f34209v)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C3782qB) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C3782qB) ((C3889sB) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.C4213yB, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C4213yB, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z8) {
        return new C4051vB(this.f34740z, ((NavigableMap) ((SortedMap) this.f34209v)).headMap(obj, z8));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z8, Object obj2, boolean z9) {
        return new C4051vB(this.f34740z, ((NavigableMap) ((SortedMap) this.f34209v)).subMap(obj, z8, obj2, z9));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z8) {
        return new C4051vB(this.f34740z, ((NavigableMap) ((SortedMap) this.f34209v)).tailMap(obj, z8));
    }
}
