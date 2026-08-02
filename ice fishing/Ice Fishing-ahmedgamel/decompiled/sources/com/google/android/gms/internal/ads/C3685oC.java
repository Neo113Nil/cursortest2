package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3685oC extends XB {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3793qC f33657w;

    /* renamed from: x, reason: collision with root package name */
    public final transient C3739pC f33658x;

    public C3685oC(C3793qC c3793qC, C3739pC c3739pC) {
        this.f33657w = c3793qC;
        this.f33658x = c3739pC;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4278zC a() {
        return this.f33658x.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f33657w.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.XB, com.google.android.gms.internal.ads.NB
    public final RB f() {
        return this.f33658x;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        return this.f33658x.h(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f33658x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33657w.f33999y;
    }
}
