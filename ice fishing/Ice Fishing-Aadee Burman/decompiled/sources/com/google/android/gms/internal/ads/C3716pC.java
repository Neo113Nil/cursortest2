package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3716pC extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f33039v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f33040w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f33041x;

    public C3716pC(Object[] objArr, int i, int i6) {
        this.f33039v = objArr;
        this.f33040w = i;
        this.f33041x = i6;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2772Sd.K(i, this.f33041x);
        Object obj = this.f33039v[i + i + this.f33040w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33041x;
    }
}
