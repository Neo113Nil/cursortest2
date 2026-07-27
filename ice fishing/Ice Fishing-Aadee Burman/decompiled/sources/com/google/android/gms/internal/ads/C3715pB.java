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

/* renamed from: com.google.android.gms.internal.ads.pB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3715pB extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public transient C3607nB f33035n;

    /* renamed from: u, reason: collision with root package name */
    public transient C4254zB f33036u;

    /* renamed from: v, reason: collision with root package name */
    public final transient Map f33037v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3340iC f33038w;

    public C3715pB(C3340iC c3340iC, Map map) {
        Objects.requireNonNull(c3340iC);
        this.f33038w = c3340iC;
        this.f33037v = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C3340iC c3340iC = this.f33038w;
        c3340iC.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new C3930tB(c3340iC, key, list, null) : new C4200yB(c3340iC, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C3340iC c3340iC = this.f33038w;
        if (this.f33037v == c3340iC.f31011w) {
            c3340iC.f();
            return;
        }
        C3661oB c3661oB = new C3661oB(this);
        while (c3661oB.hasNext()) {
            c3661oB.next();
            c3661oB.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f33037v;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3607nB c3607nB = this.f33035n;
        if (c3607nB != null) {
            return c3607nB;
        }
        C3607nB c3607nB2 = new C3607nB(this);
        this.f33035n = c3607nB2;
        return c3607nB2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f33037v.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f33037v;
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
        C3340iC c3340iC = this.f33038w;
        c3340iC.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3930tB(c3340iC, obj, list, null) : new C4200yB(c3340iC, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f33037v.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C3340iC c3340iC = this.f33038w;
        Set set = c3340iC.f23647n;
        if (set != null) {
            return set;
        }
        Map map = c3340iC.f31011w;
        Set c3876sB = map instanceof NavigableMap ? new C3876sB(c3340iC, (NavigableMap) map) : map instanceof SortedMap ? new C4038vB(c3340iC, (SortedMap) map) : new C3769qB(c3340iC, map);
        c3340iC.f23647n = c3876sB;
        return c3876sB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f33037v.remove(obj);
        if (collection == null) {
            return null;
        }
        C3340iC c3340iC = this.f33038w;
        List list = (List) c3340iC.f31013y.mo15c();
        list.addAll(collection);
        c3340iC.f31012x -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f33037v.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f33037v.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C4254zB c4254zB = this.f33036u;
        if (c4254zB != null) {
            return c4254zB;
        }
        C4254zB c4254zB2 = new C4254zB(this);
        this.f33036u = c4254zB2;
        return c4254zB2;
    }
}
