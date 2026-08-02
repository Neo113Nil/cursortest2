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
public class C3738pB extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public transient C3630nB f33825n;

    /* renamed from: u, reason: collision with root package name */
    public transient C4277zB f33826u;

    /* renamed from: v, reason: collision with root package name */
    public final transient Map f33827v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3363iC f33828w;

    public C3738pB(C3363iC c3363iC, Map map) {
        Objects.requireNonNull(c3363iC);
        this.f33828w = c3363iC;
        this.f33827v = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C3363iC c3363iC = this.f33828w;
        c3363iC.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new C3953tB(c3363iC, key, list, null) : new C4223yB(c3363iC, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C3363iC c3363iC = this.f33828w;
        if (this.f33827v == c3363iC.f31784w) {
            c3363iC.f();
            return;
        }
        C3684oB c3684oB = new C3684oB(this);
        while (c3684oB.hasNext()) {
            c3684oB.next();
            c3684oB.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f33827v;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3630nB c3630nB = this.f33825n;
        if (c3630nB != null) {
            return c3630nB;
        }
        C3630nB c3630nB2 = new C3630nB(this);
        this.f33825n = c3630nB2;
        return c3630nB2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f33827v.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f33827v;
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
        C3363iC c3363iC = this.f33828w;
        c3363iC.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3953tB(c3363iC, obj, list, null) : new C4223yB(c3363iC, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f33827v.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C3363iC c3363iC = this.f33828w;
        Set set = c3363iC.f24427n;
        if (set != null) {
            return set;
        }
        Map map = c3363iC.f31784w;
        Set c3899sB = map instanceof NavigableMap ? new C3899sB(c3363iC, (NavigableMap) map) : map instanceof SortedMap ? new C4061vB(c3363iC, (SortedMap) map) : new C3792qB(c3363iC, map);
        c3363iC.f24427n = c3899sB;
        return c3899sB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f33827v.remove(obj);
        if (collection == null) {
            return null;
        }
        C3363iC c3363iC = this.f33828w;
        List list = (List) c3363iC.f31786y.mo14c();
        list.addAll(collection);
        c3363iC.f31785x -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f33827v.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f33827v.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C4277zB c4277zB = this.f33826u;
        if (c4277zB != null) {
            return c4277zB;
        }
        C4277zB c4277zB2 = new C4277zB(this);
        this.f33826u = c4277zB2;
        return c4277zB2;
    }
}
