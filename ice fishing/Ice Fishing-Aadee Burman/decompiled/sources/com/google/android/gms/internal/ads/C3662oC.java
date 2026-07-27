package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3662oC extends XB {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3770qC f32870w;

    /* renamed from: x, reason: collision with root package name */
    public final transient C3716pC f32871x;

    public C3662oC(C3770qC c3770qC, C3716pC c3716pC) {
        this.f32870w = c3770qC;
        this.f32871x = c3716pC;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4255zC a() {
        return this.f32871x.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f32870w.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.XB, com.google.android.gms.internal.ads.NB
    public final RB f() {
        return this.f32871x;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        return this.f32871x.h(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f32871x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32870w.f33215y;
    }
}
