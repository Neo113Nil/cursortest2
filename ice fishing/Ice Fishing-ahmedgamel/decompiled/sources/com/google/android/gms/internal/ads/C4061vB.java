package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4061vB extends C3792qB implements SortedSet {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3363iC f35437v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061vB(C3363iC c3363iC, SortedMap sortedMap) {
        super(c3363iC, sortedMap);
        Objects.requireNonNull(c3363iC);
        this.f35437v = c3363iC;
    }

    public SortedMap a() {
        return (SortedMap) this.f33991n;
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
        return new C4061vB(this.f35437v, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C4061vB(this.f35437v, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C4061vB(this.f35437v, a().tailMap(obj));
    }
}
