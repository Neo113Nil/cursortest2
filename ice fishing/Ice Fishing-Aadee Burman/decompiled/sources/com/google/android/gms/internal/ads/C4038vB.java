package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4038vB extends C3769qB implements SortedSet {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3340iC f34674v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4038vB(C3340iC c3340iC, SortedMap sortedMap) {
        super(c3340iC, sortedMap);
        Objects.requireNonNull(c3340iC);
        this.f34674v = c3340iC;
    }

    public SortedMap a() {
        return (SortedMap) this.f33207n;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C4038vB(this.f34674v, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C4038vB(this.f34674v, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C4038vB(this.f34674v, a().tailMap(obj));
    }
}
