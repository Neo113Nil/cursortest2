package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3577mC extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3631nC f32692v;

    public C3577mC(C3631nC c3631nC) {
        Objects.requireNonNull(c3631nC);
        this.f32692v = c3631nC;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C3631nC c3631nC = this.f32692v;
        AbstractC2792Sd.K(i, c3631nC.f33487y);
        int i4 = i + i;
        Object[] objArr = c3631nC.f33486x;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32692v.f33487y;
    }
}
