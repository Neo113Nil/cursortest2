package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3889sB extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public transient C3782qB f34207n;

    /* renamed from: u, reason: collision with root package name */
    public transient CB f34208u;

    /* renamed from: v, reason: collision with root package name */
    public final transient Map f34209v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3513lC f34210w;

    public C3889sB(C3513lC c3513lC, Map map) {
        Objects.requireNonNull(c3513lC);
        this.f34210w = c3513lC;
        this.f34209v = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C3513lC c3513lC = this.f34210w;
        c3513lC.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new C4159xB(c3513lC, key, list, null) : new BB(c3513lC, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C3513lC c3513lC = this.f34210w;
        if (this.f34209v == c3513lC.f32551w) {
            c3513lC.f();
            return;
        }
        C3835rB c3835rB = new C3835rB(this);
        while (c3835rB.hasNext()) {
            c3835rB.next();
            c3835rB.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f34209v;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3782qB c3782qB = this.f34207n;
        if (c3782qB != null) {
            return c3782qB;
        }
        C3782qB c3782qB2 = new C3782qB(this);
        this.f34207n = c3782qB2;
        return c3782qB2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f34209v.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f34209v;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C3513lC c3513lC = this.f34210w;
        c3513lC.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C4159xB(c3513lC, obj, list, null) : new BB(c3513lC, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f34209v.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C3513lC c3513lC = this.f34210w;
        Set set = c3513lC.f24354n;
        if (set != null) {
            return set;
        }
        Map map = c3513lC.f32551w;
        Set c4105wB = map instanceof NavigableMap ? new C4105wB(c3513lC, (NavigableMap) map) : map instanceof SortedMap ? new C4267zB(c3513lC, (SortedMap) map) : new C3943tB(c3513lC, map);
        c3513lC.f24354n = c4105wB;
        return c4105wB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f34209v.remove(obj);
        if (collection == null) {
            return null;
        }
        C3513lC c3513lC = this.f34210w;
        List list = (List) c3513lC.f32553y.a();
        list.addAll(collection);
        c3513lC.f32552x -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34209v.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f34209v.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        CB cb = this.f34208u;
        if (cb != null) {
            return cb;
        }
        CB cb2 = new CB(this);
        this.f34208u = cb2;
        return cb2;
    }
}
