package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4007uB extends C3738pB implements SortedMap {

    /* renamed from: x, reason: collision with root package name */
    public SortedSet f35276x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3363iC f35277y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4007uB(C3363iC c3363iC, SortedMap sortedMap) {
        super(c3363iC, sortedMap);
        Objects.requireNonNull(c3363iC);
        this.f35277y = c3363iC;
    }

    public SortedSet b() {
        return new C4061vB(this.f35277y, d());
    }

    @Override // com.google.android.gms.internal.ads.C3738pB, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f35276x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b9 = b();
        this.f35276x = b9;
        return b9;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f33827v;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C4007uB(this.f35277y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C4007uB(this.f35277y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C4007uB(this.f35277y, d().tailMap(obj));
    }
}
