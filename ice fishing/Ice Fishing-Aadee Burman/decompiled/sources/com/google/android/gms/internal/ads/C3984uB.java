package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3984uB extends C3715pB implements SortedMap {

    /* renamed from: x, reason: collision with root package name */
    public SortedSet f34502x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3340iC f34503y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3984uB(C3340iC c3340iC, SortedMap sortedMap) {
        super(c3340iC, sortedMap);
        Objects.requireNonNull(c3340iC);
        this.f34503y = c3340iC;
    }

    public SortedSet b() {
        return new C4038vB(this.f34503y, d());
    }

    @Override // com.google.android.gms.internal.ads.C3715pB, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f34502x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b9 = b();
        this.f34502x = b9;
        return b9;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f33037v;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C3984uB(this.f34503y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C3984uB(this.f34503y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C3984uB(this.f34503y, d().tailMap(obj));
    }
}
