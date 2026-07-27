package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.rC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3836rC extends AbstractC2917aC {

    /* renamed from: w, reason: collision with root package name */
    public final transient C3944tC f33986w;

    /* renamed from: x, reason: collision with root package name */
    public final transient C3890sC f33987x;

    public C3836rC(C3944tC c3944tC, C3890sC c3890sC) {
        this.f33986w = c3944tC;
        this.f33987x = c3890sC;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        return this.f33987x.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f33986w.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC, com.google.android.gms.internal.ads.QB
    public final UB f() {
        return this.f33987x;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int h(Object[] objArr, int i) {
        return this.f33987x.h(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f33987x.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33986w.f34383y;
    }
}
